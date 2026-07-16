"""Move failing generated test suites out of the active Maven source tree.

The move preserves each source file for audit while ensuring coverage and PIT
metrics are computed only from executable, passing suites.
"""

from __future__ import annotations

import argparse
import csv
import re
import shutil
import xml.etree.ElementTree as ET
from datetime import datetime
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
PROJECT = ROOT / "experiments" / "rbl-project"
TEST_SOURCE = PROJECT / "src" / "test" / "java" / "humaneval" / "correct"


def suite_rows(suffix: str) -> list[dict[str, object]]:
    report_dir = PROJECT / "target" / "surefire-reports"
    rows: list[dict[str, object]] = []
    for report in sorted(report_dir.glob(f"TEST-*{suffix}.xml")):
        suite = ET.parse(report).getroot()
        name = suite.attrib.get("name", "")
        source_name = name.rsplit(".", 1)[-1] + ".java"
        failures = int(suite.attrib.get("failures", "0"))
        errors = int(suite.attrib.get("errors", "0"))
        skipped = int(suite.attrib.get("skipped", "0"))
        tests = int(suite.attrib.get("tests", "0"))
        rows.append(
            {
                "suite": name,
                "source_file": source_name,
                "tests": tests,
                "failures": failures,
                "errors": errors,
                "skipped": skipped,
                "compile_pass": int(failures == 0 and errors == 0),
                "status": "PASS" if failures == 0 and errors == 0 else "FAIL_ASSERTION",
            }
        )
    return rows


def compiler_rows(log_path: Path) -> list[dict[str, object]]:
    text = log_path.read_text(encoding="utf-8", errors="replace")
    names = sorted(set(re.findall(r"humaneval[\\/]+correct[\\/]+([A-Z0-9_]+_GPTTest)\.java:\[", text)))
    return [
        {
            "suite": f"humaneval.correct.{name}",
            "source_file": f"{name}.java",
            "tests": 0,
            "failures": 0,
            "errors": 0,
            "skipped": 0,
            "compile_pass": 0,
            "status": "FAIL_COMPILE",
        }
        for name in names
    ]


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--mode", choices=("pilot", "full"), required=True)
    parser.add_argument("--compile-log", type=Path, help="Maven stdout log with generated-test compiler diagnostics")
    args = parser.parse_args()
    suffix = "_GPTTest"
    rows = suite_rows(suffix)
    if args.compile_log:
        if not args.compile_log.is_file():
            raise SystemExit(f"Compiler log does not exist: {args.compile_log}")
        rows.extend(compiler_rows(args.compile_log))
    if not rows:
        raise SystemExit("No GPT Surefire XML reports or compiler diagnostics found; Maven must run first.")

    timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
    destination = PROJECT / "invalid_tests" / args.mode / timestamp / "humaneval" / "correct"
    destination.mkdir(parents=True, exist_ok=False)
    moved = 0
    output = ROOT / "results" / f"{args.mode}_compile_status.csv"
    prior_rows: dict[str, dict[str, object]] = {}
    if output.exists():
        with output.open("r", newline="", encoding="utf-8") as handle:
            prior_rows = {row["source_file"]: row for row in csv.DictReader(handle)}

    for row in rows:
        if row["compile_pass"]:
            row["quarantined_path"] = ""
            continue
        source = (TEST_SOURCE / str(row["source_file"])).resolve()
        source_root = TEST_SOURCE.resolve()
        if source_root not in source.parents or not source.is_file():
            row["quarantined_path"] = "SOURCE_NOT_FOUND"
            row["status"] = "FAIL_ASSERTION_SOURCE_NOT_FOUND"
            continue
        target = destination / source.name
        shutil.move(str(source), str(target))
        row["quarantined_path"] = str(target.relative_to(ROOT))
        moved += 1

    for row in rows:
        prior_rows[str(row["source_file"])] = row
    ordered_rows = [prior_rows[key] for key in sorted(prior_rows)]
    output.parent.mkdir(parents=True, exist_ok=True)
    with output.open("w", newline="", encoding="utf-8") as handle:
        writer = csv.DictWriter(handle, fieldnames=["suite", "source_file", "tests", "failures", "errors", "skipped", "compile_pass", "status", "quarantined_path"])
        writer.writeheader()
        writer.writerows(ordered_rows)
    print(f"Quarantined {moved} failing suite(s). Status evidence: {output}")


if __name__ == "__main__":
    main()
