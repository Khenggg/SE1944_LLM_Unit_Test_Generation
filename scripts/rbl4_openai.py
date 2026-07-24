"""Shared, secret-safe OpenAI helpers for the RBL-4 generation runs."""

from __future__ import annotations

import csv
import os
import random
import re
import time
from pathlib import Path
from typing import Any


MODEL_NAME = "gpt-4o-mini-2024-07-18"
INPUT_USD_PER_MILLION = 0.15
OUTPUT_USD_PER_MILLION = 0.60


def load_workspace_env(workspace_dir: Path) -> None:
    """Load simple KEY=VALUE entries from the local .env without logging values."""
    env_path = workspace_dir / ".env"
    if not env_path.exists():
        return

    for raw_line in env_path.read_text(encoding="utf-8").splitlines():
        line = raw_line.strip()
        if not line or line.startswith("#"):
            continue
        match = re.match(r"^(?:export\s+)?([A-Za-z_][A-Za-z0-9_]*)\s*=\s*(.*?)\s*$", line)
        if not match:
            continue
        key, value = match.groups()
        if len(value) >= 2 and value[0] == value[-1] and value[0] in {"'", '"'}:
            value = value[1:-1]
        if value and key not in os.environ:
            os.environ[key] = value


def build_prompt(class_name: str, source_code: str) -> str:
    return f"""You are an expert Java developer and software tester.
Your task is to write a comprehensive JUnit 4 test suite for the following Java class.
Strictly adhere to the following requirements:
1. Generate test cases using JUnit 4 (use org.junit.Test, org.junit.Assert).
2. Do not use JUnit 5 or other test frameworks.
3. Test all logical paths, edge cases, boundary values, and potential error conditions.
4. Ensure all assertions are correct and correspond exactly to the expected behavior of the correct code.
5. The test class must be named {class_name}_GPTTest, corresponding to the target class {class_name}.
6. The test class must be in package humaneval.correct;
7. You should import any required packages (like java.util.*).
8. Provide only the executable Java test class code. Do not include any markdown explanations, text wrapping, or extra commentary.

Source Code:
{source_code}"""


def request_with_retry(client: Any, prompt: str, max_retries: int = 5) -> tuple[Any | None, int, str]:
    """Call the API with exponential backoff for rate/network/server errors."""
    retries = 0
    last_error = ""
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model=MODEL_NAME,
                messages=[{"role": "user", "content": prompt}],
                temperature=0.0,
            )
            return response, retries, ""
        except Exception as error:  # The SDK exception hierarchy differs across compatible versions.
            last_error = str(error).replace("\n", " ")
            status_code = getattr(error, "status_code", None)
            retryable = status_code in {408, 409, 429, 500, 502, 503, 504} or any(
                token in last_error.lower()
                for token in ("rate limit", "timeout", "connection", "temporarily unavailable", "server error")
            )
            if not retryable or attempt == max_retries - 1:
                return None, retries, last_error
            delay_seconds = (2**attempt) + random.uniform(0, 1)
            retries += 1
            print(f" retry {retries}/{max_retries - 1} after {delay_seconds:.1f}s", end="", flush=True)
            time.sleep(delay_seconds)
    return None, retries, last_error


def extract_java_code(content: str) -> str:
    code_match = re.search(r"```(?:java)?\s*(.*?)```", content or "", re.DOTALL | re.IGNORECASE)
    generated_code = code_match.group(1).strip() if code_match else (content or "").strip()
    if generated_code.startswith("```"):
        generated_code = re.sub(r"^```[a-zA-Z]*\s*", "", generated_code)
        generated_code = re.sub(r"\s*```$", "", generated_code)
    if not generated_code:
        return ""

    package_decl = "package humaneval.correct;"
    if package_decl not in generated_code:
        if re.search(r"\bpackage\s+[\w.]+\s*;", generated_code):
            generated_code = re.sub(r"\bpackage\s+[\w.]+\s*;", package_decl, generated_code, count=1)
        else:
            generated_code = f"{package_decl}\n\n{generated_code}"
    return re.sub(r"@Test\b(?!\s*\()", "@Test(timeout = 5000)", generated_code)


def usage_and_cost(response: Any) -> tuple[int, int, float]:
    usage = getattr(response, "usage", None)
    input_tokens = int(getattr(usage, "prompt_tokens", 0) or 0)
    output_tokens = int(getattr(usage, "completion_tokens", 0) or 0)
    cost_usd = (
        input_tokens * INPUT_USD_PER_MILLION / 1_000_000
        + output_tokens * OUTPUT_USD_PER_MILLION / 1_000_000
    )
    return input_tokens, output_tokens, cost_usd


def write_csv_atomically(path: Path, fieldnames: list[str], rows: list[dict[str, Any]]) -> None:
    temporary_path = path.with_suffix(path.suffix + ".tmp")
    with temporary_path.open("w", encoding="utf-8", newline="") as handle:
        writer = csv.DictWriter(handle, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(rows)
    temporary_path.replace(path)
