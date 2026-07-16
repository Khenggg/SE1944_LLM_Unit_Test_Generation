"""Independent consistency checks for the final RBL-4 evidence bundle."""

from __future__ import annotations

import csv
from pathlib import Path

import nbformat
from PIL import Image


ROOT = Path(__file__).resolve().parents[1]
RESULTS = ROOT / "results"


def read_csv(path: Path) -> list[dict[str, str]]:
    with path.open("r", newline="", encoding="utf-8") as handle:
        return list(csv.DictReader(handle))


def check(name: str, condition: bool, detail: str) -> tuple[str, str, str]:
    return name, "PASS" if condition else "FAIL", detail


def main() -> None:
    gpt = read_csv(RESULTS / "metrics" / "gpt_class_metrics.csv")
    suites = read_csv(RESULTS / "full_compile_status.csv")
    initial = read_csv(RESULTS / "full_llm_output.csv")
    repairs = read_csv(RESULTS / "full_repair_output.csv")
    summary = read_csv(RESULTS / "summary.csv")
    evos = {budget: read_csv(RESULTS / "metrics" / f"evosuite_{budget}p_class_metrics.csv") for budget in (1, 3, 5)}
    checks: list[tuple[str, str, str]] = []
    checks.append(check("GPT SUT coverage", len(gpt) == 63 and len({row["class_name"] for row in gpt}) == 63, f"{len(gpt)} rows, {len({row['class_name'] for row in gpt})} distinct SUTs"))
    checks.append(check("Suite status coverage", len(suites) == 63, f"{len(suites)} suite-status rows"))
    status_counts = {status: sum(row["status"] == status for row in suites) for status in {row["status"] for row in suites}}
    checks.append(check("Suite-status partition", status_counts == {"PASS": 14, "FAIL_ASSERTION": 47, "FAIL_COMPILE": 2}, str(status_counts)))
    checks.append(check("Initial API run", len(initial) == 63 and all(row["status"] == "SUCCESS" for row in initial), f"{len(initial)} rows; all SUCCESS={all(row['status'] == 'SUCCESS' for row in initial)}"))
    checks.append(check("Repair API run", len(repairs) == 55 and all(row["status"] == "REPAIRED" for row in repairs), f"{len(repairs)} rows; all REPAIRED={all(row['status'] == 'REPAIRED' for row in repairs)}"))
    branches = (sum(int(row["branch_covered"]) for row in gpt), sum(int(row["branch_total"]) for row in gpt))
    mutations = (sum(int(row["mutation_killed"]) for row in gpt), sum(int(row["mutation_total"]) for row in gpt))
    checks.append(check("GPT metric numerators", branches == (144, 762) and mutations == (135, 833), f"branches={branches[0]}/{branches[1]}; mutations={mutations[0]}/{mutations[1]}"))
    for budget, evo in evos.items():
        checks.append(check(f"EvoSuite {budget}-minute SUT coverage", len(evo) == 63 and len({row["class_name"] for row in evo}) == 63 and all(row["execution_status"] == "PASS" for row in evo), f"{len(evo)} rows; all pass={all(row['execution_status'] == 'PASS' for row in evo)}"))
    rq3_rows = [row for row in summary if row["rq"].startswith("RQ3_")]
    checks.append(check("RQ3 paired inference", len(rq3_rows) == 6 and all(row["status"] == "TESTED" and int(row["n"]) > 0 and row["p_adjusted"] for row in rq3_rows), f"{len(rq3_rows)} paired Wilcoxon rows with Holm adjustment"))
    notebook = nbformat.read(RESULTS / "full_analysis.ipynb", as_version=4)
    executed = sum(1 for cell in notebook.cells if cell.cell_type == "code" and cell.get("outputs"))
    checks.append(check("Notebook execution", executed >= 4, f"{executed} executed code cells with outputs"))
    figures = sorted((RESULTS / "figures").glob("fig*.png"))
    valid_figures = []
    for figure in figures:
        with Image.open(figure) as image:
            dpi = image.info.get("dpi", (0, 0))[0]
            valid_figures.append(image.width >= 1000 and dpi >= 299)
    checks.append(check("Figures", len(figures) >= 3 and all(valid_figures), f"{len(figures)} PNG figures; >=300 DPI metadata and width checks={all(valid_figures)}"))

    report = ["# RBL-4 Validation Report", "", "## Overall Assessment: Share with caveats", "", "The live GPT evidence, retained EvoSuite archive measurements, and derived values reconcile. RQ3 paired Wilcoxon tests are available, but the GPT execution gate limits paired sample size and leaves few non-zero branch differences.", "", "## Checks"]
    for name, status, detail in checks:
        report.append(f"- **{status} - {name}:** {detail}")
    report.extend(["", "## Required caveat", "", "Do not describe EvoSuite as student-written data. RQ3 is conditioned on the GPT suites that passed; report its paired and ranked sample sizes alongside p-values and Holm adjustment."])
    output = RESULTS / "rbl4_validation.md"
    output.write_text("\n".join(report) + "\n", encoding="utf-8")
    failed = [name for name, status, _ in checks if status == "FAIL"]
    print(f"Wrote {output}; failed checks: {failed or 'none'}")
    if failed:
        raise SystemExit(1)


if __name__ == "__main__":
    main()
