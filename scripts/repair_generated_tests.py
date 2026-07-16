"""Perform the one permitted RBL-4 repair round for failing GPT test suites."""

from __future__ import annotations

import argparse
import csv
import os
import re
import xml.etree.ElementTree as ET
from datetime import datetime, timezone
from pathlib import Path

from rbl4_openai import (
    MODEL_NAME,
    extract_java_code,
    load_workspace_env,
    request_with_retry,
    usage_and_cost,
    write_csv_atomically,
)


WORKSPACE = Path(__file__).resolve().parent.parent
RBL_PROJECT = WORKSPACE / "experiments" / "rbl-project"
SOURCE_DIR = RBL_PROJECT / "src" / "main" / "java" / "humaneval" / "correct"
TEST_DIR = RBL_PROJECT / "src" / "test" / "java" / "humaneval" / "correct"
SUREFIRE_DIR = RBL_PROJECT / "target" / "surefire-reports"
RESULTS_DIR = WORKSPACE / "results"
FIELDS = [
    "timestamp", "class_name", "status", "model", "cost_usd", "input_tokens",
    "output_tokens", "latency_sec", "retries", "initial_failures", "error",
]


def now_utc() -> str:
    return datetime.now(timezone.utc).isoformat()


def read_failed_suites() -> dict[str, str]:
    failures: dict[str, list[str]] = {}
    for report_path in sorted(SUREFIRE_DIR.glob("TEST-*.xml")):
        root = ET.parse(report_path).getroot()
        suite_name = root.attrib.get("name", "")
        if not suite_name.endswith("_GPTTest"):
            continue
        class_name = suite_name.rsplit(".", 1)[-1].removesuffix("_GPTTest")
        messages: list[str] = []
        for test_case in root.findall("testcase"):
            failure = test_case.find("failure")
            if failure is None:
                failure = test_case.find("error")
            if failure is None:
                continue
            detail = (failure.attrib.get("message", "") + "\n" + (failure.text or "")).strip()
            messages.append(f"{test_case.attrib.get('name', 'unnamed')}: {detail[:1500]}")
        if messages:
            failures[class_name] = messages
    return {class_name: "\n\n".join(messages) for class_name, messages in failures.items()}


def read_compile_failures(log_path: Path) -> dict[str, str]:
    """Extract generated-suite compiler diagnostics from a Maven log."""
    text = log_path.read_text(encoding="utf-8", errors="replace")
    failures: dict[str, list[str]] = {}
    pattern = re.compile(r"^\[ERROR\]\s+.*?humaneval[\\/]+correct[\\/]+([A-Z0-9_]+)_GPTTest\.java:\[.*$", re.MULTILINE)
    for match in pattern.finditer(text):
        class_name = match.group(1)
        failures.setdefault(class_name, []).append(match.group(0))
    return {class_name: "\n".join(messages) for class_name, messages in failures.items()}


def repair_prompt(class_name: str, source_code: str, generated_test: str, failures: str) -> str:
    return f"""You previously generated the JUnit 4 test suite below, but it failed when executed against the correct implementation.

Repair the complete test suite using the source code and real failure output. Return only a complete executable Java class, with no Markdown or commentary.

Requirements:
1. Keep class name `{class_name}_GPTTest` and package `humaneval.correct`.
2. Use JUnit 4 only.
3. Correct incorrect expectations; do not weaken tests by removing all meaningful assertions.
4. Do not modify the production source.

Correct production source:
{source_code}

Generated test suite to repair:
{generated_test}

Observed Maven/Surefire failures:
{failures}"""


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--mode", choices=("pilot", "full"), required=True)
    parser.add_argument("--compile-log", type=Path, help="Optional Maven stdout log containing compiler errors")
    parser.add_argument("--skip-previously-repaired", action="store_true", help="Do not call the API twice for a suite already repaired in this mode")
    args = parser.parse_args()

    load_workspace_env(WORKSPACE)
    api_key = os.environ.get("OPENAI_API_KEY")
    if not api_key:
        raise SystemExit("Error: OPENAI_API_KEY is unavailable after loading the local .env.")
    try:
        from openai import OpenAI
    except ImportError as error:
        raise SystemExit("Error: install the openai package in .venv before repairing tests.") from error

    failed_suites = read_failed_suites()
    if args.compile_log:
        if not args.compile_log.is_file():
            raise SystemExit(f"Compiler log does not exist: {args.compile_log}")
        failed_suites.update(read_compile_failures(args.compile_log))
    if args.skip_previously_repaired:
        prior_output = RESULTS_DIR / f"{args.mode}_repair_output.csv"
        if prior_output.exists():
            with prior_output.open("r", newline="", encoding="utf-8") as handle:
                repaired = {row["class_name"] for row in csv.DictReader(handle) if row.get("status") == "REPAIRED"}
            failed_suites = {class_name: message for class_name, message in failed_suites.items() if class_name not in repaired}
    if not failed_suites:
        print("No failing GPT suites found; no repair API calls were made.")
        return

    RESULTS_DIR.mkdir(parents=True, exist_ok=True)
    repair_log = RESULTS_DIR / f"{args.mode}_repair_api_log.txt"
    repair_output = RESULTS_DIR / f"{args.mode}_repair_output.csv"
    client = OpenAI(api_key=api_key)
    rows: list[dict[str, object]] = []
    if repair_output.exists():
        with repair_output.open("r", newline="", encoding="utf-8") as handle:
            rows = list(csv.DictReader(handle))
    run_rows: list[dict[str, object]] = []
    with repair_log.open("a", encoding="utf-8") as log_file:
        log_file.write(f"--- {args.mode.upper()} REPAIR RUN START: {now_utc()} | configured_model={MODEL_NAME} ---\n")
        for index, (class_name, failures) in enumerate(failed_suites.items(), 1):
            source_path = SOURCE_DIR / f"{class_name}.java"
            test_path = TEST_DIR / f"{class_name}_GPTTest.java"
            timestamp = now_utc()
            print(f"[{index}/{len(failed_suites)}] Repairing {class_name}...", end="", flush=True)
            if not source_path.exists() or not test_path.exists():
                row = {"timestamp": timestamp, "class_name": class_name, "status": "FAILED_INPUT_MISSING", "model": MODEL_NAME, "cost_usd": "0.000000", "input_tokens": 0, "output_tokens": 0, "latency_sec": "0.00", "retries": 0, "initial_failures": failures.count("\n\n") + 1, "error": "Source or generated test is missing"}
                rows.append(row)
                run_rows.append(row)
                print(" FAILED (input missing)")
                continue

            started = __import__("time").perf_counter()
            response, retries, error = request_with_retry(
                client,
                repair_prompt(class_name, source_path.read_text(encoding="utf-8"), test_path.read_text(encoding="utf-8"), failures),
            )
            latency = __import__("time").perf_counter() - started
            if response is None:
                row = {"timestamp": timestamp, "class_name": class_name, "status": "FAILED_API", "model": MODEL_NAME, "cost_usd": "0.000000", "input_tokens": 0, "output_tokens": 0, "latency_sec": f"{latency:.2f}", "retries": retries, "initial_failures": failures.count("\n\n") + 1, "error": error}
                print(" FAILED (API)")
            else:
                generated_code = extract_java_code(response.choices[0].message.content or "")
                input_tokens, output_tokens, cost_usd = usage_and_cost(response)
                response_model = getattr(response, "model", MODEL_NAME)
                if not generated_code:
                    row = {"timestamp": timestamp, "class_name": class_name, "status": "INVALID_EMPTY", "model": response_model, "cost_usd": f"{cost_usd:.6f}", "input_tokens": input_tokens, "output_tokens": output_tokens, "latency_sec": f"{latency:.2f}", "retries": retries, "initial_failures": failures.count("\n\n") + 1, "error": "Empty response content"}
                    print(" INVALID (empty response)")
                else:
                    test_path.write_text(generated_code, encoding="utf-8")
                    row = {"timestamp": timestamp, "class_name": class_name, "status": "REPAIRED", "model": response_model, "cost_usd": f"{cost_usd:.6f}", "input_tokens": input_tokens, "output_tokens": output_tokens, "latency_sec": f"{latency:.2f}", "retries": retries, "initial_failures": failures.count("\n\n") + 1, "error": ""}
                    print(f" DONE (${cost_usd:.6f})")
            rows.append(row)
            run_rows.append(row)
            log_file.write(f"Timestamp: {timestamp} | Class: {class_name} | Action: REPAIR | Model: {row['model']} | Status: {row['status']} | Input Tokens: {row['input_tokens']} | Output Tokens: {row['output_tokens']} | Cost: ${row['cost_usd']} | Latency: {row['latency_sec']}s | Retries: {row['retries']} | Error: {row['error']}\n")
            log_file.flush()
            write_csv_atomically(repair_output, FIELDS, rows)

    print(f"Repair invocation completed: {sum(row['status'] == 'REPAIRED' for row in run_rows)}/{len(run_rows)} repaired. Evidence: {repair_output}")


if __name__ == "__main__":
    main()
