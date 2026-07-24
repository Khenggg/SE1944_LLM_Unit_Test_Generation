"""Run the fresh six-class RBL-4 Pilot with durable API evidence."""

from __future__ import annotations

import csv
import sys
import time
from datetime import datetime, timezone
from pathlib import Path

from rbl4_openai import (
    MODEL_NAME,
    build_prompt,
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
RESULTS_DIR = WORKSPACE / "results"
PILOT_SAMPLE = WORKSPACE / "data" / "pilot_sample.csv"
PILOT_LOG = RESULTS_DIR / "pilot_api_log.txt"
PILOT_OUTPUT = RESULTS_DIR / "pilot_llm_output.csv"
FIELDS = [
    "timestamp", "class_name", "status", "model", "cost_usd", "input_tokens",
    "output_tokens", "latency_sec", "retries", "error",
]


def now_utc() -> str:
    return datetime.now(timezone.utc).isoformat()


def main() -> None:
    load_workspace_env(WORKSPACE)
    api_key = __import__("os").environ.get("OPENAI_API_KEY")
    if not api_key:
        raise SystemExit("Error: OPENAI_API_KEY is unavailable after loading the local .env.")
    try:
        from openai import OpenAI
    except ImportError as error:
        raise SystemExit("Error: install the openai package in .venv before running Pilot.") from error

    with PILOT_SAMPLE.open("r", encoding="utf-8", newline="") as handle:
        pilot_classes = [row["class_name"] for row in csv.DictReader(handle)]
    if len(pilot_classes) != 6:
        raise SystemExit(f"Expected six Pilot classes, found {len(pilot_classes)}.")

    TEST_DIR.mkdir(parents=True, exist_ok=True)
    RESULTS_DIR.mkdir(parents=True, exist_ok=True)
    active_tests = list(TEST_DIR.glob("*_GPTTest.java"))
    if active_tests:
        raise SystemExit("Active GPT tests exist. Archive or move them before starting a fresh Pilot run.")

    client = OpenAI(api_key=api_key)
    rows: list[dict[str, object]] = []
    with PILOT_LOG.open("w", encoding="utf-8") as log_file:
        log_file.write(f"--- PILOT RUN START: {now_utc()} | configured_model={MODEL_NAME} ---\n")
        for index, class_name in enumerate(pilot_classes, 1):
            source_path = SOURCE_DIR / f"{class_name}.java"
            output_path = TEST_DIR / f"{class_name}_GPTTest.java"
            timestamp = now_utc()
            print(f"[{index}/{len(pilot_classes)}] Generating {class_name}...", end="", flush=True)
            if not source_path.exists():
                row = {"timestamp": timestamp, "class_name": class_name, "status": "FAILED_SOURCE_MISSING", "model": MODEL_NAME, "cost_usd": "0.000000", "input_tokens": 0, "output_tokens": 0, "latency_sec": "0.00", "retries": 0, "error": "Source file missing"}
                rows.append(row)
                print(" FAILED (source missing)")
                continue

            started = time.perf_counter()
            response, retries, error = request_with_retry(client, build_prompt(class_name, source_path.read_text(encoding="utf-8")))
            latency = time.perf_counter() - started
            if response is None:
                row = {"timestamp": timestamp, "class_name": class_name, "status": "FAILED_API", "model": MODEL_NAME, "cost_usd": "0.000000", "input_tokens": 0, "output_tokens": 0, "latency_sec": f"{latency:.2f}", "retries": retries, "error": error}
                rows.append(row)
                log_file.write(f"Timestamp: {timestamp} | Class: {class_name} | Model: {MODEL_NAME} | Status: FAILED_API | Retries: {retries} | Error: {error}\n")
                print(" FAILED (API)")
                write_csv_atomically(PILOT_OUTPUT, FIELDS, rows)
                continue

            generated_code = extract_java_code(response.choices[0].message.content or "")
            input_tokens, output_tokens, cost_usd = usage_and_cost(response)
            response_model = getattr(response, "model", MODEL_NAME)
            if not generated_code:
                row = {"timestamp": timestamp, "class_name": class_name, "status": "INVALID_EMPTY", "model": response_model, "cost_usd": f"{cost_usd:.6f}", "input_tokens": input_tokens, "output_tokens": output_tokens, "latency_sec": f"{latency:.2f}", "retries": retries, "error": "Empty response content"}
                print(" INVALID (empty response)")
            else:
                output_path.write_text(generated_code, encoding="utf-8")
                row = {"timestamp": timestamp, "class_name": class_name, "status": "SUCCESS", "model": response_model, "cost_usd": f"{cost_usd:.6f}", "input_tokens": input_tokens, "output_tokens": output_tokens, "latency_sec": f"{latency:.2f}", "retries": retries, "error": ""}
                print(f" DONE (${cost_usd:.6f})")
            rows.append(row)
            log_file.write(f"Timestamp: {timestamp} | Class: {class_name} | Model: {response_model} | Status: {row['status']} | Input Tokens: {input_tokens} | Output Tokens: {output_tokens} | Cost: ${cost_usd:.6f} | Latency: {latency:.2f}s | Retries: {retries} | Error: {row['error']}\n")
            log_file.flush()
            write_csv_atomically(PILOT_OUTPUT, FIELDS, rows)
            time.sleep(1.0)

    print(f"Pilot completed: {sum(row['status'] == 'SUCCESS' for row in rows)}/{len(rows)} successful. Evidence: {PILOT_OUTPUT}")


if __name__ == "__main__":
    main()
