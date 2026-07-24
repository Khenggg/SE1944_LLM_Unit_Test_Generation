"""Collect class-level JaCoCo and PIT metrics from one measured RBL-4 suite."""

from __future__ import annotations

import argparse
import csv
import xml.etree.ElementTree as ET
from datetime import datetime, timezone
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
PROJECT = ROOT / "experiments" / "rbl-project"
SUT_DIR = PROJECT / "src" / "main" / "java" / "humaneval" / "correct"
RESULTS = ROOT / "results"
TECHNICAL_MUTATION_EXCLUSIONS = {"FIND_ZERO", "PRIME_FIB", "IS_MULTIPLY_PRIME"}


def jacoco_metrics() -> dict[str, tuple[int, int]]:
    report = PROJECT / "target" / "site" / "jacoco" / "jacoco.xml"
    root = ET.parse(report).getroot()
    result: dict[str, tuple[int, int]] = {}
    for package in root.findall("package"):
        if package.attrib.get("name") != "humaneval/correct":
            continue
        for cls in package.findall("class"):
            name = cls.attrib["name"].split("/")[-1]
            if "$" in name:
                continue
            counter = next((item for item in cls.findall("counter") if item.attrib.get("type") == "BRANCH"), None)
            if counter is None:
                result[name] = (0, 0)
            else:
                result[name] = (int(counter.attrib["covered"]), int(counter.attrib["covered"]) + int(counter.attrib["missed"]))
    return result


def pit_metrics() -> dict[str, tuple[int, int]]:
    reports = sorted((PROJECT / "target" / "pit-reports").glob("*/mutations.xml"), key=lambda path: path.stat().st_mtime, reverse=True)
    if not reports:
        raise FileNotFoundError("PIT mutations.xml not found")
    result: dict[str, list[int]] = {}
    for mutation in ET.parse(reports[0]).getroot().findall("mutation"):
        class_name = (mutation.findtext("mutatedClass") or "").split(".")[-1]
        if not class_name:
            continue
        entry = result.setdefault(class_name, [0, 0])
        entry[1] += 1
        if mutation.attrib.get("detected") == "true" or mutation.attrib.get("status") in {"KILLED", "TIMEOUT"}:
            entry[0] += 1
    return {key: (value[0], value[1]) for key, value in result.items()}


def surefire_status(suffix: str) -> dict[str, str]:
    status: dict[str, str] = {}
    for report in (PROJECT / "target" / "surefire-reports").glob("TEST-*.xml"):
        suite = ET.parse(report).getroot()
        name = suite.attrib.get("name", "").rsplit(".", 1)[-1]
        if not name.endswith(suffix):
            continue
        class_name = name.removesuffix(suffix)
        failed = int(suite.attrib.get("failures", "0")) + int(suite.attrib.get("errors", "0"))
        status[class_name] = "PASS" if failed == 0 else "FAIL_ASSERTION"
    return status


def status_from_csv(path: Path) -> dict[str, str]:
    with path.open("r", newline="", encoding="utf-8") as handle:
        return {row["source_file"].removesuffix("_GPTTest.java"): row["status"] for row in csv.DictReader(handle)}


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--label", required=True, help="Output identifier, e.g. gpt or evosuite_1p")
    parser.add_argument("--tool", required=True, choices=("GPT", "EvoSuite"))
    parser.add_argument("--budget-min", type=int, required=True)
    parser.add_argument("--status-csv", type=Path, help="Optional existing compile-status CSV")
    args = parser.parse_args()

    jacoco = jacoco_metrics()
    pit = pit_metrics()
    if args.status_csv:
        status = status_from_csv(args.status_csv)
    else:
        status = surefire_status("_GPTTest" if args.tool == "GPT" else "_ESTest")
    timestamp = datetime.now(timezone.utc).isoformat()
    rows: list[dict[str, object]] = []
    for source in sorted(SUT_DIR.glob("*.java")):
        class_name = source.stem
        covered, total_branches = jacoco.get(class_name, (0, 0))
        killed, total_mutations = pit.get(class_name, (0, 0))
        rows.append(
            {
                "class_name": class_name,
                "tool": args.tool,
                "budget_min": args.budget_min,
                "execution_status": status.get(class_name, "NOT_EXECUTED"),
                "branch_covered": covered,
                "branch_total": total_branches,
                "branch_coverage_pct": f"{(covered / total_branches * 100) if total_branches else 100.0:.6f}",
                "mutation_killed": killed,
                "mutation_total": total_mutations,
                "mutation_score_pct": f"{(killed / total_mutations * 100) if total_mutations else 0.0:.6f}",
                "mutation_technical_exclusion": int(class_name in TECHNICAL_MUTATION_EXCLUSIONS),
                "measurement_timestamp": timestamp,
            }
        )
    output = RESULTS / "metrics" / f"{args.label}_class_metrics.csv"
    output.parent.mkdir(parents=True, exist_ok=True)
    with output.open("w", newline="", encoding="utf-8") as handle:
        writer = csv.DictWriter(handle, fieldnames=list(rows[0]))
        writer.writeheader()
        writer.writerows(rows)
    print(f"Wrote {len(rows)} class metrics to {output}")


if __name__ == "__main__":
    main()
