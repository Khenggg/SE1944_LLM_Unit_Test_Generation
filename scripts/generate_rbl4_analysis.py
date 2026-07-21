"""Create the final reproducible RBL-4 analysis from retained test archives."""

from __future__ import annotations

import csv
import hashlib
from datetime import datetime, timezone
from pathlib import Path

import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
from scipy.stats import binomtest, rankdata, wilcoxon


ROOT = Path(__file__).resolve().parents[1]
RESULTS = ROOT / "results"
METRICS = RESULTS / "metrics"
PROJECT = ROOT / "experiments" / "rbl-project"
BRANCH_THRESHOLD = 30.22
MUTATION_FLOOR = 4.0
MUTATION_TARGET = 40.21
ALPHA = 0.05
EVO_BUDGETS = (1, 3, 5)


def sha256(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as handle:
        for block in iter(lambda: handle.read(1024 * 1024), b""):
            digest.update(block)
    return digest.hexdigest()


def write_csv(path: Path, rows: list[dict[str, object]], fields: list[str]) -> None:
    with path.open("w", newline="", encoding="utf-8") as handle:
        writer = csv.DictWriter(handle, fieldnames=fields)
        writer.writeheader()
        writer.writerows(rows)


def one_sample_wilcoxon(values: pd.Series, threshold: float) -> tuple[float, float, float, int]:
    differences = values.astype(float).to_numpy() - threshold
    nonzero = differences[differences != 0]
    if len(nonzero) == 0:
        return 0.0, 1.0, 0.0, 0
    statistic, p_value = wilcoxon(differences, alternative="greater", method="approx")
    ranks = rankdata(np.abs(nonzero))
    rank_biserial = float(np.sum(np.sign(nonzero) * ranks) / np.sum(ranks))
    return float(statistic), float(p_value), rank_biserial, int(len(nonzero))


def paired_wilcoxon(gpt_values: pd.Series, evo_values: pd.Series) -> tuple[float, float, float, int]:
    differences = gpt_values.astype(float).to_numpy() - evo_values.astype(float).to_numpy()
    nonzero = differences[differences != 0]
    if len(nonzero) == 0:
        return 0.0, 1.0, 0.0, 0
    statistic, p_value = wilcoxon(gpt_values, evo_values, alternative="two-sided", method="approx")
    ranks = rankdata(np.abs(nonzero))
    rank_biserial = float(np.sum(np.sign(nonzero) * ranks) / np.sum(ranks))
    return float(statistic), float(p_value), rank_biserial, int(len(nonzero))


def holm_adjust(p_values: list[float]) -> list[float]:
    adjusted = [0.0] * len(p_values)
    running_max = 0.0
    for rank, index in enumerate(sorted(range(len(p_values)), key=lambda item: p_values[item])):
        value = min(1.0, (len(p_values) - rank) * p_values[index])
        running_max = max(running_max, value)
        adjusted[index] = running_max
    return adjusted


def aggregate(metrics: pd.DataFrame) -> dict[str, float | int]:
    return {
        "branch_covered": int(metrics["branch_covered"].sum()),
        "branch_total": int(metrics["branch_total"].sum()),
        "branch_coverage_pct": 100 * metrics["branch_covered"].sum() / metrics["branch_total"].sum(),
        "mutation_killed": int(metrics["mutation_killed"].sum()),
        "mutation_total": int(metrics["mutation_total"].sum()),
        "mutation_score_pct": 100 * metrics["mutation_killed"].sum() / metrics["mutation_total"].sum(),
        "pass_suites": int((metrics["execution_status"] == "PASS").sum()),
    }


def latest_log_relative(*patterns: str) -> str:
    candidates: list[Path] = []
    for pattern in patterns:
        candidates.extend(PROJECT.glob(pattern))
    if not candidates:
        return ""
    return str(max(candidates, key=lambda path: path.stat().st_mtime).relative_to(ROOT))


def main() -> None:
    gpt_path = METRICS / "gpt_class_metrics.csv"
    suite_status_path = RESULTS / "full_compile_status.csv"
    initial_api_path = RESULTS / "full_llm_output.csv"
    repair_api_path = RESULTS / "full_repair_output.csv"
    evo_paths = {budget: METRICS / f"evosuite_{budget}p_class_metrics.csv" for budget in EVO_BUDGETS}
    required = (gpt_path, suite_status_path, initial_api_path, repair_api_path, *evo_paths.values())
    missing = [str(path) for path in required if not path.is_file()]
    if missing:
        raise FileNotFoundError("Missing RBL-4 input artifact(s): " + ", ".join(missing))

    gpt = pd.read_csv(gpt_path)
    suite_status = pd.read_csv(suite_status_path)
    initial_api = pd.read_csv(initial_api_path)
    repair_api = pd.read_csv(repair_api_path)
    evos = {budget: pd.read_csv(path) for budget, path in evo_paths.items()}
    if len(gpt) != 63 or gpt["class_name"].nunique() != 63 or len(suite_status) != 63:
        raise ValueError("GPT evidence must contain exactly 63 SUT rows and 63 suite-status rows")
    for budget, evo in evos.items():
        if len(evo) != 63 or evo["class_name"].nunique() != 63 or not (evo["execution_status"] == "PASS").all():
            raise ValueError(f"EvoSuite {budget}-minute evidence must contain 63 passing, distinct SUT rows")

    gpt_aggregate = aggregate(gpt)
    evo_aggregates = {budget: aggregate(evo) for budget, evo in evos.items()}
    mutation_scope = gpt[gpt["mutation_technical_exclusion"] == 0].copy()
    failure_counts = suite_status["status"].value_counts().to_dict()
    initial_cost = float(initial_api["cost_usd"].astype(float).sum())
    repair_cost = float(repair_api["cost_usd"].astype(float).sum())
    branch_stat, branch_p, branch_effect, branch_n = one_sample_wilcoxon(gpt["branch_coverage_pct"], BRANCH_THRESHOLD)
    mutation_floor_stat, mutation_floor_p, mutation_floor_effect, mutation_floor_n = one_sample_wilcoxon(mutation_scope["mutation_score_pct"], MUTATION_FLOOR)
    mutation_target_stat, mutation_target_p, mutation_target_effect, mutation_target_n = one_sample_wilcoxon(mutation_scope["mutation_score_pct"], MUTATION_TARGET)
    dual_success = (
        (gpt["execution_status"] == "PASS")
        & (gpt["branch_coverage_pct"] >= BRANCH_THRESHOLD)
        & (gpt["mutation_score_pct"] >= MUTATION_FLOOR)
    )
    dual_count = int(dual_success.sum())
    dual_binomial = binomtest(dual_count, n=len(gpt), p=0.5, alternative="greater")

    summary_rows: list[dict[str, object]] = [
        {"rq": "RQ1", "analysis": "One-sample Wilcoxon: GPT branch coverage > 30.22%", "status": "TESTED", "n": branch_n, "statistic": f"{branch_stat:.3f}", "p_raw": f"{branch_p:.8f}", "p_adjusted": "", "effect_size": f"{branch_effect:.6f}", "gpt_value": f"{gpt_aggregate['branch_coverage_pct']:.6f}", "comparator_value": f"{BRANCH_THRESHOLD:.2f}", "delta_pp": f"{gpt_aggregate['branch_coverage_pct'] - BRANCH_THRESHOLD:.6f}", "conclusion": "SUPPORTED" if branch_p < ALPHA else "NOT_SUPPORTED", "notes": "All 63 SUT rows; non-executable suites retain measured coverage (normally zero)."},
        {"rq": "RQ2_floor", "analysis": "One-sample Wilcoxon: GPT mutation score > 4.00%", "status": "TESTED", "n": mutation_floor_n, "statistic": f"{mutation_floor_stat:.3f}", "p_raw": f"{mutation_floor_p:.8f}", "p_adjusted": "", "effect_size": f"{mutation_floor_effect:.6f}", "gpt_value": f"{gpt_aggregate['mutation_score_pct']:.6f}", "comparator_value": f"{MUTATION_FLOOR:.2f}", "delta_pp": f"{gpt_aggregate['mutation_score_pct'] - MUTATION_FLOOR:.6f}", "conclusion": "SUPPORTED" if mutation_floor_p < ALPHA else "NOT_SUPPORTED", "notes": "Three technical mutation exclusions are omitted from the Wilcoxon sample."},
        {"rq": "RQ2_target", "analysis": "One-sample Wilcoxon: GPT mutation score > 40.21%", "status": "TESTED", "n": mutation_target_n, "statistic": f"{mutation_target_stat:.3f}", "p_raw": f"{mutation_target_p:.8f}", "p_adjusted": "", "effect_size": f"{mutation_target_effect:.6f}", "gpt_value": f"{gpt_aggregate['mutation_score_pct']:.6f}", "comparator_value": f"{MUTATION_TARGET:.2f}", "delta_pp": f"{gpt_aggregate['mutation_score_pct'] - MUTATION_TARGET:.6f}", "conclusion": "SUPPORTED" if mutation_target_p < ALPHA else "NOT_SUPPORTED", "notes": "Three technical mutation exclusions are omitted from the Wilcoxon sample."},
        {"rq": "RQ4", "analysis": "Exact binomial: dual-success rate > 50%", "status": "TESTED", "n": len(gpt), "statistic": dual_count, "p_raw": f"{dual_binomial.pvalue:.8f}", "p_adjusted": "", "effect_size": "", "gpt_value": f"{100 * dual_count / len(gpt):.6f}", "comparator_value": "50.00", "delta_pp": f"{100 * dual_count / len(gpt) - 50:.6f}", "conclusion": "SUPPORTED" if dual_binomial.pvalue < ALPHA else "NOT_SUPPORTED", "notes": "Dual success requires PASS plus BC >= 30.22% and MS >= 4.00%."},
        {"rq": "RQ5", "analysis": "Descriptive: Execution failure patterns", "status": "TESTED", "n": len(gpt), "statistic": "", "p_raw": "", "p_adjusted": "", "effect_size": "", "gpt_value": "", "comparator_value": "", "delta_pp": "", "conclusion": "Descriptive", "notes": f"{gpt_aggregate['pass_suites']} pass; {int(failure_counts.get('FAIL_ASSERTION', 0))} assertion failures; {int(failure_counts.get('FAIL_COMPILE', 0))} compilation failures."},
    ]
    paired_results: list[dict[str, object]] = []
    for budget, evo in evos.items():
        paired = gpt.merge(evo, on="class_name", suffixes=("_gpt", "_evo"), validate="one_to_one")
        executable = paired[(paired["execution_status_gpt"] == "PASS") & (paired["execution_status_evo"] == "PASS")]
        mutation_pairs = executable[(executable["mutation_technical_exclusion_gpt"] == 0) & (executable["mutation_technical_exclusion_evo"] == 0)]
        for metric, frame, gpt_column, evo_column in (
            ("branch", executable, "branch_coverage_pct_gpt", "branch_coverage_pct_evo"),
            ("mutation", mutation_pairs, "mutation_score_pct_gpt", "mutation_score_pct_evo"),
        ):
            statistic, p_value, effect, n = paired_wilcoxon(frame[gpt_column], frame[evo_column])
            paired_results.append({"budget": budget, "metric": metric, "statistic": statistic, "p_raw_float": p_value, "effect": effect, "paired_n": len(frame), "ranked_n": n, "gpt_value": float(frame[gpt_column].mean()), "evo_value": float(frame[evo_column].mean())})
    adjusted = holm_adjust([row["p_raw_float"] for row in paired_results])
    for row, p_adjusted in zip(paired_results, adjusted):
        row["p_adjusted"] = p_adjusted
        conclusion = "SIGNIFICANT_DIFFERENCE" if p_adjusted < ALPHA else "NO_SIGNIFICANT_DIFFERENCE"
        summary_rows.append({"rq": f"RQ3_{row['budget']}m_{row['metric']}", "analysis": f"Paired Wilcoxon: GPT vs archived EvoSuite {row['budget']}-minute {row['metric']}", "status": "TESTED", "n": row["paired_n"], "statistic": f"{row['statistic']:.3f}", "p_raw": f"{row['p_raw_float']:.8f}", "p_adjusted": f"{p_adjusted:.8f}", "effect_size": f"{row['effect']:.6f}", "gpt_value": f"{row['gpt_value']:.6f}", "comparator_value": f"{row['evo_value']:.6f}", "delta_pp": f"{row['gpt_value'] - row['evo_value']:.6f}", "conclusion": conclusion, "notes": f"Two-sided paired Wilcoxon on {row['paired_n']} SUTs passing in both tools; {row['ranked_n']} non-zero differences were ranked. Three technical mutation exclusions are omitted for mutation."})

    summary_path = RESULTS / "summary.csv"
    write_csv(summary_path, summary_rows, list(summary_rows[0]))
    aggregate_rows = []
    manifest_rows = []
    for budget, aggregate_values in evo_aggregates.items():
        aggregate_rows.append({"tool": "EvoSuite", "budget_min": budget, **aggregate_values, "measurement_source": f"archive/evosuite_{budget}p", "java_runtime": "Temurin JDK 8.0.492"})
        manifest_rows.append({"budget_min": budget, "archive_test_source": f"experiments/rbl-project/archive/evosuite_{budget}p", "metrics_file": f"results/metrics/evosuite_{budget}p_class_metrics.csv", "maven_log": latest_log_relative(f"evosuite_{budget}p_java8_maven_*.stdout.log", f"rbl4_evosuite_{budget}p_maven_*.stdout.log"), "pit_log": latest_log_relative(f"evosuite_{budget}p_java8_pitest_*.stdout.log", f"rbl4_evosuite_{budget}p_pitest_*.stdout.log"), "java_runtime": "Temurin JDK 8.0.492", "suite_count": 63, "passing_suites": aggregate_values["pass_suites"]})
    pd.DataFrame(aggregate_rows).to_csv(METRICS / "evosuite_measured_aggregate.csv", index=False)
    write_csv(METRICS / "evosuite_measurement_manifest.csv", manifest_rows, list(manifest_rows[0]))

    figure_dir = RESULTS / "figures"
    figure_dir.mkdir(parents=True, exist_ok=True)
    plt.style.use("seaborn-v0_8-whitegrid")
    status_order = ["PASS", "FAIL_ASSERTION", "FAIL_COMPILE"]
    status_values = [int(failure_counts.get(status, 0)) for status in status_order]
    fig, axis = plt.subplots(figsize=(8, 4.8))
    bars = axis.bar(status_order, status_values, color=["#2a9d8f", "#e76f51", "#264653"])
    axis.set_title("GPT-generated suite execution status (n = 63)")
    axis.set_ylabel("Number of SUT suites")
    for bar, value in zip(bars, status_values):
        axis.text(bar.get_x() + bar.get_width() / 2, value + 0.8, str(value), ha="center")
    fig.tight_layout(); fig.savefig(figure_dir / "fig1_execution_status.png", dpi=300); plt.close(fig)
    fig, axis = plt.subplots(figsize=(9, 5.2))
    axis.hist(gpt["branch_coverage_pct"], bins=np.arange(0, 110, 10), alpha=0.72, label="Branch coverage", color="#457b9d")
    axis.hist(mutation_scope["mutation_score_pct"], bins=np.arange(0, 110, 10), alpha=0.58, label="Mutation score", color="#f4a261")
    axis.axvline(BRANCH_THRESHOLD, color="#457b9d", linestyle="--", label="BC threshold 30.22%")
    axis.axvline(MUTATION_FLOOR, color="#f4a261", linestyle="--", label="MS floor 4.00%")
    axis.axvline(MUTATION_TARGET, color="#e76f51", linestyle=":", label="MS target 40.21%")
    axis.set_title("Distribution of GPT metrics by SUT"); axis.set_xlabel("Percentage"); axis.set_ylabel("Number of SUTs"); axis.legend(fontsize=8)
    fig.tight_layout(); fig.savefig(figure_dir / "fig2_gpt_metric_distribution.png", dpi=300); plt.close(fig)
    fig, axes = plt.subplots(1, 2, figsize=(10, 4.8), sharey=True)
    labels = ["GPT"] + [f"Evo {budget}m" for budget in EVO_BUDGETS]
    branch_values = [gpt_aggregate["branch_coverage_pct"]] + [evo_aggregates[budget]["branch_coverage_pct"] for budget in EVO_BUDGETS]
    mutation_values = [gpt_aggregate["mutation_score_pct"]] + [evo_aggregates[budget]["mutation_score_pct"] for budget in EVO_BUDGETS]
    for axis, values, title, color in zip(axes, (branch_values, mutation_values), ("Branch coverage", "Mutation score"), ("#457b9d", "#f4a261")):
        bars = axis.bar(labels, values, color=color); axis.set_ylim(0, 105); axis.set_title(title); axis.tick_params(axis="x", rotation=35)
        for bar, value in zip(bars, values): axis.text(bar.get_x() + bar.get_width() / 2, value + 1.5, f"{value:.1f}", ha="center", fontsize=8)
    axes[0].set_ylabel("Percentage"); fig.suptitle("GPT live run vs archived EvoSuite tests measured per SUT")
    fig.tight_layout(); fig.savefig(figure_dir / "fig3_gpt_vs_evosuite_paired.png", dpi=300); plt.close(fig)

    provenance_rows = [("GPT class metrics", gpt_path), ("GPT suite status", suite_status_path), ("GPT initial API usage", initial_api_path), ("GPT repair API usage", repair_api_path), *[(f"EvoSuite {budget}-minute class metrics", path) for budget, path in evo_paths.items()]]
    provenance = ["# RBL-4 Data Provenance", "", f"Generated: {datetime.now(timezone.utc).isoformat()}", ""]
    for label, path in provenance_rows:
        provenance += [f"- **{label}:** `{path}`  ", f"  SHA-256: `{sha256(path)}`"]
    provenance += ["", "## Comparator method", "", "EvoSuite tests were taken from the existing 1/3/5-minute archives; no EvoSuite generation was run. Each archive was measured on the same SUT set with Maven, JaCoCo, and PIT using Temurin JDK 8 because EvoSuite 1.0.6 requires `tools.jar`. RQ3 pairs only SUT suites that passed in both tools."]
    (RESULTS / "rbl4_data_provenance.md").write_text("\n".join(provenance) + "\n", encoding="utf-8")

    report = ["# RBL-4 Final Execution Report", "", "## Scope", "", "GPT-4o-mini (`gpt-4o-mini-2024-07-18`) was run with the recorded zero-shot protocol on 63 HumanEval-Java SUTs. EvoSuite is an operational comparator only, never a student-test proxy.", "", "## GPT execution evidence", "", f"- Initial API generation: **{len(initial_api)}/63** successful calls; cost **${initial_cost:.6f}**.", f"- One permitted repair invocation: **{len(repair_api)}** API repair records; cost **${repair_cost:.6f}**.", f"- Executable final suites: **{gpt_aggregate['pass_suites']}/63**; assertion failures: **{int(failure_counts.get('FAIL_ASSERTION', 0))}**; compilation failures: **{int(failure_counts.get('FAIL_COMPILE', 0))}**.", f"- Aggregate GPT branch coverage: **{gpt_aggregate['branch_coverage_pct']:.2f}%** ({gpt_aggregate['branch_covered']}/{gpt_aggregate['branch_total']}).", f"- Aggregate GPT mutation score: **{gpt_aggregate['mutation_score_pct']:.2f}%** ({gpt_aggregate['mutation_killed']}/{gpt_aggregate['mutation_total']}).", "", "## RQ results", "", f"- **RQ1:** {'supported' if branch_p < ALPHA else 'not supported'} (one-sided Wilcoxon p={branch_p:.6g}).", f"- **RQ2 floor (4.00%):** aggregate score is {'above' if gpt_aggregate['mutation_score_pct'] >= MUTATION_FLOOR else 'below'} the floor, but the per-SUT one-sided Wilcoxon result is {'supported' if mutation_floor_p < ALPHA else 'not supported'} (p={mutation_floor_p:.6g}).", f"- **RQ2 target (40.21%):** {'supported' if mutation_target_p < ALPHA else 'not supported'} (p={mutation_target_p:.6g}).", f"- **RQ4:** dual success is {dual_count}/63 ({100 * dual_count / len(gpt):.2f}%); {'supported' if dual_binomial.pvalue < ALPHA else 'not supported'} for a majority (exact binomial p={dual_binomial.pvalue:.6g}).", f"- **RQ5:** execution failure patterns are descriptive: {gpt_aggregate['pass_suites']} pass, {int(failure_counts.get('FAIL_ASSERTION', 0))} assertion failures, {int(failure_counts.get('FAIL_COMPILE', 0))} compilation failures.", "", "## RQ3 paired GPT vs archived EvoSuite tests", "", "| Budget | Metric | Paired / ranked N | GPT mean | EvoSuite mean | Delta pp | Raw p | Holm p | Rank-biserial | Conclusion |", "| --- | --- | ---: | ---: | ---: | ---: | ---: | ---: | ---: | --- |"]
    for row in paired_results:
        conclusion = "Significant difference" if row["p_adjusted"] < ALPHA else "No significant difference"
        report.append(f"| {row['budget']}m | {row['metric']} | {row['paired_n']} / {row['ranked_n']} | {row['gpt_value']:.2f}% | {row['evo_value']:.2f}% | {row['gpt_value'] - row['evo_value']:.2f} | {row['p_raw_float']:.6g} | {row['p_adjusted']:.6g} | {row['effect']:.3f} | {conclusion} |")
    report += ["", "## EvoSuite measurement evidence", "", "| Budget | Passing suites | Branch coverage | Mutation score |", "| --- | ---: | ---: | ---: |"]
    for budget, values in evo_aggregates.items(): report.append(f"| {budget} minute(s) | {values['pass_suites']}/63 | {values['branch_coverage_pct']:.2f}% ({values['branch_covered']}/{values['branch_total']}) | {values['mutation_score_pct']:.2f}% ({values['mutation_killed']}/{values['mutation_total']}) |")
    report += ["", "## Interpretation boundary", "", "EvoSuite is an operational technical comparator, not a proxy for student-written tests. The student benchmark remains deferred because comparable per-SUT measurements are unavailable."]
    (RESULTS / "rbl4_final_report.md").write_text("\n".join(report) + "\n", encoding="utf-8")
    print(f"Wrote {summary_path}, RQ3 paired results, and figures in {figure_dir}")


if __name__ == "__main__":
    main()
