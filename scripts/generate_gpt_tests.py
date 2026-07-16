"""Generate the RBL-4 Full GPT test suites with resumable, durable API logs."""

from __future__ import annotations

import csv
import os
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
FULL_LOG = RESULTS_DIR / "full_api_log.txt"
FULL_OUTPUT = RESULTS_DIR / "full_llm_output.csv"
FIELDS = [
    "timestamp", "class_name", "status", "model", "cost_usd", "input_tokens",
    "output_tokens", "latency_sec", "retries", "error",
]


def now_utc() -> str:
    return datetime.now(timezone.utc).isoformat()


def load_previous_rows() -> dict[str, dict[str, str]]:
    if not FULL_OUTPUT.exists():
        return {}
    with FULL_OUTPUT.open("r", encoding="utf-8", newline="") as handle:
        return {row["class_name"]: row for row in csv.DictReader(handle) if row.get("class_name")}


def main() -> None:
    load_workspace_env(WORKSPACE)
    api_key = os.environ.get("OPENAI_API_KEY")
    if not api_key:
        raise SystemExit("Error: OPENAI_API_KEY is unavailable after loading the local .env.")
    try:
        from openai import OpenAI
    except ImportError as error:
        raise SystemExit("Error: install the openai package in .venv before running Full generation.") from error

    source_paths = sorted(SOURCE_DIR.glob("*.java"))
    if len(source_paths) != 63:
        raise SystemExit(f"Expected 63 source classes, found {len(source_paths)}.")
    TEST_DIR.mkdir(parents=True, exist_ok=True)
    RESULTS_DIR.mkdir(parents=True, exist_ok=True)

    previous = load_previous_rows()
    rows_by_class: dict[str, dict[str, object]] = dict(previous)
    client = OpenAI(api_key=api_key)
    with FULL_LOG.open("a", encoding="utf-8") as log_file:
        log_file.write(f"--- FULL RUN START: {now_utc()} | configured_model={MODEL_NAME} ---\n")
        for index, source_path in enumerate(source_paths, 1):
            class_name = source_path.stem
            output_path = TEST_DIR / f"{class_name}_GPTTest.java"
            existing = rows_by_class.get(class_name, {})
            if existing.get("status") == "SUCCESS" and output_path.exists():
                print(f"[{index}/{len(source_paths)}] Skip {class_name} (already logged SUCCESS)")
                continue
            if output_path.exists() and not existing:
                raise SystemExit(f"Refusing to overwrite unlogged active test: {output_path.name}. Archive it or create a matching Full CSV row first.")

            timestamp = now_utc()
            print(f"[{index}/{len(source_paths)}] Generating {class_name}...", end="", flush=True)
            started = time.perf_counter()
            response, retries, error = request_with_retry(client, build_prompt(class_name, source_path.read_text(encoding="utf-8")))
            latency = time.perf_counter() - started
            if response is None:
                row = {"timestamp": timestamp, "class_name": class_name, "status": "FAILED_API", "model": MODEL_NAME, "cost_usd": "0.000000", "input_tokens": 0, "output_tokens": 0, "latency_sec": f"{latency:.2f}", "retries": retries, "error": error}
                print(" FAILED (API)")
            else:
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

            rows_by_class[class_name] = row
            log_file.write(f"Timestamp: {timestamp} | Class: {class_name} | Model: {row['model']} | Status: {row['status']} | Input Tokens: {row['input_tokens']} | Output Tokens: {row['output_tokens']} | Cost: ${row['cost_usd']} | Latency: {row['latency_sec']}s | Retries: {row['retries']} | Error: {row['error']}\n")
            log_file.flush()
            ordered_rows = [rows_by_class[path.stem] for path in source_paths if path.stem in rows_by_class]
            write_csv_atomically(FULL_OUTPUT, FIELDS, ordered_rows)
            time.sleep(1.0)

    success_count = sum(row.get("status") == "SUCCESS" for row in rows_by_class.values())
    print(f"Full generation completed: {success_count}/{len(source_paths)} successful. Evidence: {FULL_OUTPUT}")


if __name__ == "__main__":
    main()
