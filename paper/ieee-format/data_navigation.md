# Final Test Data Navigation Guide
## `team-synthesis-final/` — File-to-Paper Section Map

This guide maps every results file in the repository to the specific section of `paper/main.tex` it supports, along with notes on what each file contains and how to read it.

---

## Quick Reference: File → Paper Section

| File | Paper Section | What It Contains |
|---|---|---|
| `results/rbl4_final_report.md` | **All sections** | Master summary; use this as the primary cross-check |
| `results/summary.csv` | **Table 1 & 2** | All RQ p-values, effect sizes, and conclusions |
| `results/metrics/gpt_class_metrics.csv` | **§IV Results** | Per-function GPT coverage and mutation scores |
| `results/full_compile_status.csv` | **§IV RQ5** | Per-function pass/fail status and failure type |
| `results/metrics/evosuite_1p_class_metrics.csv` | **§IV RQ3 (1-min)** | EvoSuite 1-minute per-function metrics |
| `results/metrics/evosuite_3p_class_metrics.csv` | **§IV RQ3 (3-min)** | EvoSuite 3-minute per-function metrics |
| `results/metrics/evosuite_5p_class_metrics.csv` | **§IV RQ3 (5-min)** | EvoSuite 5-minute per-function metrics |
| `results/metrics/evosuite_measured_aggregate.csv` | **§IV RQ3 (prose)** | EvoSuite aggregate totals (branch numerator/denominator) |
| `results/metrics/evosuite_measurement_manifest.csv` | **§III Methodology** | Which archive folder each EvoSuite budget came from + Java runtime |
| `results/rbl4_validation.md` | **All sections** | Automated validation checks confirming data integrity |
| `results/rbl4_data_provenance.md` | **§III §V** | SHA-256 hashes of all primary data files |
| `results/full_llm_output.csv` | **§III §V (cost)** | Per-function GPT API response, token counts, cost |
| `results/full_api_log.txt` | **§III** | Raw API call timestamps and status codes |
| `results/full_repair_output.csv` | **§III §V (cost)** | Per-function repair API response, cost |
| `results/full_repair_api_log.txt` | **§III** | Raw repair API call log |
| `results/full_assertion_repair_current.info` | **§III** | Summary info for the repair run |
| `results/full_generation_current.info` | **§III** | Summary info for the initial generation run |
| `results/evosuite_pilot_results.md` | **§V Discussion** | 7-budget EvoSuite data (NOT in paper — context only) |
| `results/figures/fig1_execution_status.png` | **§IV Fig. 1** | Execution status breakdown chart |
| `results/figures/fig2_gpt_metric_distribution.png` | **§IV Fig. 2** | Distribution of GPT BC and MS across 63 SUTs |
| `results/figures/fig3_gpt_vs_evosuite_paired.png` | **§IV Fig. 3** | Pass-conditioned paired comparison chart |
| `results/full_analysis.ipynb` | **§IV (all RQs)** | Jupyter notebook that produces all RQ outputs |
| `results/pilot_api_log.txt` | *(pilot only — not in paper)* | |
| `results/pilot_compile_status.csv` | *(pilot only — not in paper)* | |
| `results/pilot_llm_output.csv` | *(pilot only — not in paper)* | |
| `results/pilot_repair_api_log.txt` | *(pilot only — not in paper)* | |
| `results/pilot_repair_output.csv` | *(pilot only — not in paper)* | |
| `results/metrics/evosuite_historical_aggregate.csv` | *(historical/context only)* | Historical pilot EvoSuite figures (different denominators) |
| `results/metrics/evosuite_1p/3p/5p_class_metrics.csv` | *(same as above)* | |

---

## Section-by-Section Data Sources

### Abstract
| Claim | Source File | Column/Field |
|---|---|---|
| "63 Java functions" | `results/metrics/gpt_class_metrics.csv` | Count of rows |
| "14 generated suites executed" | `results/full_compile_status.csv` | `STATUS=PASS` count |
| "18.90% branch coverage" | `results/metrics/gpt_class_metrics.csv` | Sum `branch_covered` / Sum `branch_total` = 144/762 |
| "16.21% mutation score" | `results/metrics/gpt_class_metrics.csv` | Sum `mutation_killed` / Sum `mutation_total` = 135/833 |
| "13/63 dual threshold" | `results/summary.csv` | RQ4 row |

---

### §III Methodology — Data Sources
| Claim | Source File | Field |
|---|---|---|
| "63 SUTs" | `results/metrics/gpt_class_metrics.csv` | Row count |
| "temperature fixed to zero" | `results/full_llm_output.csv` | API params column |
| "gpt-4o-mini-2024-07-18" | `results/full_llm_output.csv` | model column |
| "63/63 API calls successful" | `results/full_llm_output.csv` | success column |
| "55 repair calls" | `results/full_repair_output.csv` | Row count |
| "Initial cost $0.030982" | `results/full_llm_output.csv` | cost column sum |
| "Repair cost $0.036773" | `results/full_repair_output.csv` | cost column sum |
| "EvoSuite 1/3/5-min archives" | `results/metrics/evosuite_measurement_manifest.csv` | archive_test_source |
| "Temurin JDK 8 for EvoSuite" | `results/metrics/evosuite_measurement_manifest.csv` | java_runtime column |
| "Three technical mutation exclusions" | `results/metrics/gpt_class_metrics.csv` | `mutation_technical_exclusion=1` rows: `FIND_ZERO`, `PRIME_FIB`, `IS_MULTIPLY_PRIME` |

---

### §IV Results — Table 1 (Threshold Tests, RQ1/2/4)
All values sourced from `results/summary.csv`. Columns:

| CSV Column | Table 1 Column |
|---|---|
| `rq` | RQ row identifier |
| `n` | N (sample size) |
| `statistic` | Wilcoxon W statistic (not shown in table) |
| `p_raw` | p value (paper uses as the single p, no adjustment for RQ1/2/4) |
| `effect_size` | Effect column ($r_{rb}$ or $RD$) |
| `gpt_value` | Aggregate/Rate column |
| `conclusion` | Decision column |

**Key values to verify:**
- RQ1: N=63, p=0.942967, effect=-0.215, 18.90% → NOT_SUPPORTED
- RQ2-floor: N=60, p=0.952447, effect=-0.233 → NOT_SUPPORTED
- RQ2-target: N=60, p=0.997231, effect=-0.387 → NOT_SUPPORTED
- RQ4: N=63, 13 dual-successes, p≈1 → NOT_SUPPORTED

---

### §IV Results — Table 2 (Paired Tests, RQ3)
All values sourced from `results/summary.csv`. Paired rows (RQ3_*):

| CSV Column | Table 2 Column |
|---|---|
| `n` | $N_p$ (paired SUT count, branch=14, mutation=13) |
| Notes field | $N_r$ (non-zero ranked count, branch=2, mutation=7) |
| `gpt_value` | GPT mean |
| `comparator_value` | Evo mean |
| `delta_pp` | $\Delta$ |
| `p_raw` | Raw $p$ |
| `p_adjusted` | Holm $p$ |
| `effect_size` | $r_{rb}$ |
| `conclusion` | Significance |

**The per-budget EvoSuite means in Table 2** are computed from:
- Branch: `results/metrics/evosuite_1p/3p/5p_class_metrics.csv` → filter to 14 passing GPT SUT names → average `branch_coverage_pct`
- Mutation: same filter + exclude `PRIME_FIB` → average `mutation_score_pct`

---

### §IV Results — Figures

| Figure | Source File | How Generated |
|---|---|---|
| Fig. 1 (execution status) | `results/figures/fig1_execution_status.png` | From `full_compile_status.csv` via `full_analysis.ipynb` |
| Fig. 2 (GPT distributions) | `results/figures/fig2_gpt_metric_distribution.png` | From `gpt_class_metrics.csv` via notebook |
| Fig. 3 (paired comparison) | `results/figures/fig3_gpt_vs_evosuite_paired.png` | From `gpt_class_metrics.csv` + EvoSuite CSVs via notebook |

To reproduce: Run all cells in `results/full_analysis.ipynb`.

---

### §V Discussion — Data Lookups
| Claim | Source File |
|---|---|
| "49 suites remained invalid" | `full_compile_status.csv`: 47 FAIL_ASSERTION + 2 FAIL_COMPILE |
| "Assertion failures dominated" | `full_compile_status.csv`: 47/49 = 95.9% |
| "Cost $0.030982 initial" | `full_llm_output.csv` |
| "Cost $0.036773 repair" | `full_repair_output.csv` |
| EvoSuite 1-min aggregate | `results/metrics/evosuite_measured_aggregate.csv` (budget=1) |
| EvoSuite 3-min aggregate | `results/metrics/evosuite_measured_aggregate.csv` (budget=3) |
| EvoSuite 5-min aggregate | `results/metrics/evosuite_measured_aggregate.csv` (budget=5) |

---

## Denominator Reference Sheet

The paper uses **two sets of denominators** — one for GPT, one for EvoSuite — that happen to be the **same** after the re-measurement pipeline, but differ from the historical pilot numbers.

| Metric | Paper Denominator | Source |
|---|---|---|
| GPT branch total | **762** | Sum of `branch_total` in `gpt_class_metrics.csv` |
| GPT mutation total | **833** (full), **820** (excl. 3 exclusions) | `gpt_class_metrics.csv`; exclusions have `mutation_technical_exclusion=1` |
| EvoSuite branch total | **762** (same SUT set) | Sum of `branch_total` in `evosuite_Xp_class_metrics.csv` |
| EvoSuite mutation total | **833** (same SUT set) | Sum of `mutation_total` in `evosuite_Xp_class_metrics.csv` |

> [!WARNING]
> The **historical pilot report** (`results/evosuite_pilot_results.md`) shows different denominators: **778 branches and 850 mutations**. This is because the pilot was run on a slightly different build configuration. The paper correctly uses the re-measured values (762/833). **Do not mix these two denominator sets.**

---

## The 14 Passing GPT Suites (RQ3 Paired Subset)

These are the only SUTs included in the RQ3 paired analysis:

| # | Class Name | BC % | MS % | MS Exclusion? |
|---|---|---|---|---|
| 1 | CHECK_DICT_CASE | 95.83% | 100.00% | No |
| 2 | CHECK_IF_LAST_CHAR_IS_A_LETTER | 85.71% | 92.31% | No |
| 3 | CLOSEST_INTEGER | 91.67% | 71.43% | No |
| 4 | COMMON | 100.00% | 88.89% | No |
| 5 | COUNT_UP_TO | 100.00% | 100.00% | No |
| 6 | EXCHANGE | 100.00% | 100.00% | No |
| 7 | FIND_CLOSEST_ELEMENTS | 100.00% | 83.33% | No |
| 8 | GET_MAX_TRIPLES | 100.00% | 80.77% | No |
| 9 | LARGEST_SMALLEST_INTEGERS | 100.00% | 100.00% | No |
| 10 | PLUCK | 100.00% | 100.00% | No |
| 11 | **PRIME_FIB** | 100.00% | **0.00%** | **Yes** — excluded from mutation RQ3 |
| 12 | REMOVE_DUPLICATES | 100.00% | 100.00% | No |
| 13 | STRONGEST_EXTENSION | 100.00% | 50.00% | No |
| 14 | TRIPLES_SUM_TO_ZERO | 100.00% | 80.00% | No |

**→ Branch RQ3 uses all 14. Mutation RQ3 uses 13 (excludes PRIME_FIB).**

---

## The 3 Technical Mutation Exclusions (Full 63-SUT Corpus)

These 3 classes are excluded from the RQ2 Wilcoxon sample (N=60) and from RQ3 mutation tests:

| Class | Reason |
|---|---|
| `FIND_ZERO` | Polynomial bisection causes infinite loops under mutation |
| `PRIME_FIB` | Large Fibonacci prime computation causes timeout |
| `IS_MULTIPLY_PRIME` | Three nested loops timeout under PIT mutation agent |

Identified in: `results/metrics/gpt_class_metrics.csv`, column `mutation_technical_exclusion=1`.

---

## Scripts That Generated the Data

| Script | What It Does | Output |
|---|---|---|
| `scripts/rbl4_openai.py` | Calls GPT API for all 63 SUTs | `full_llm_output.csv`, `full_api_log.txt` |
| `scripts/repair_generated_tests.py` | Runs 1-round repair on failing tests | `full_repair_output.csv`, `full_repair_api_log.txt` |
| `scripts/collect_suite_metrics.py` | Runs JaCoCo + PIT, extracts per-class metrics | `metrics/gpt_class_metrics.csv`, `metrics/evosuite_Xp_class_metrics.csv` |
| `scripts/parse_metrics.py` | Parses raw coverage/mutation XML into CSV rows | feeds into `collect_suite_metrics.py` |
| `scripts/generate_rbl4_analysis.py` | Runs Wilcoxon and Binomial hypothesis tests | `summary.csv` |
| `scripts/validate_rbl4_results.py` | Cross-checks all numbers for consistency | `results/rbl4_validation.md` |
| `scripts/generate_full_analysis_notebook.py` | Creates the Jupyter notebook | `results/full_analysis.ipynb` |
| `scripts/generate_gpt_results_report.py` | Generates the human-readable final report | `results/rbl4_final_report.md` |
| `scripts/quarantine_invalid_tests.py` | Moves failed tests to archive | `experiments/rbl-project/invalid_tests/` |
| `scripts/generate_gpt_tests.py` | Core GPT test generation (pilot/full) | raw `.java` files in experiment dir |
| `scripts/manage_tests.py` | Archive/clean/organize test files | organizes experiment directory |
| `scripts/setup_experiment.py` | Sets up Maven project structure | `experiments/rbl-project/` |
| `scripts/run_pilot.py` | Runs the 6-SUT pilot subset | pilot result files |
