# Full Data Provenance Mapping

**Last verified:** 2026-07-24
**Verdict:** All numbers in both paper versions (IEEE and Springer) are 100% consistent with each other and with all canonical source files.

This document provides a sentence-by-sentence trace of **every quantitative claim, decision, threshold, statistical result, and cost figure** in the paper, mapped back to the exact raw file and column that produced it. It also explains, in plain language, why each external paper in the reference list was chosen. Anyone — even someone reading this study for the first time — can pick any number from the paper, find it here, and go directly to the spreadsheet row that proves it.

---

## How to Read This File

- **Paper Location** → which section, table, or figure contains the claim.
- **Claim** → the exact sentence or number from the paper.
- **Source File** → the file inside `results/` that contains the raw data.
- **Exact Verification** → the specific column, row, or arithmetic that produces the number. You can open the file and check it yourself.

---

## Part 1 — Corpus and Setup

| Paper Location | Claim | Source File | Exact Verification |
|---|---|---|---|
| Abstract, §I–§IV | **"63 Java functions" / "63 targets" / "63 SUTs"** | `results/metrics/gpt_class_metrics.csv` | Count the data rows (excluding the header). There are exactly 63 rows, one per unique `class_name`. Every table and chart in the paper uses this as its total population. |
| §III Method | **"gpt-4o-mini-2024-07-18"** (dated model snapshot) | `results/full_llm_output.csv` | The `model` column in every row contains the literal string `gpt-4o-mini-2024-07-18`. The dated snapshot prevents ambiguity if the alias is updated later. |
| §III Method | **"Temperature was fixed to zero"** | `results/full_llm_output.csv` | The raw API payload shows `"temperature": 0`. Temperature = 0 makes the model deterministic and reproducible. |
| §III Method | **"fixed zero-shot instruction"** — no few-shot examples | `results/full_llm_output.csv` | Each row's prompt contains only the 8-point instruction and the SUT source code. There is no prior example, reference output, or previous turn in the conversation. |
| §III Method (verbatim prompt box) | The 8-point prompt template reproduced verbatim in the paper | `results/full_api_log.txt` | The full text of every API request is stored here. Each request matches the template with only `{class_name}` and `{source_code}` substituted. |
| §III Method | **"correct implementation is the test target"** | `data/raw/` (SUT source files) | Each Java class in `experiments/rbl-project` has a `correct` variant (the SUT used for testing) and a `buggy` variant (not tested against). GPT always receives the correct source. |
| §III Method | **"1-, 3-, and 5-minute budgets"** (EvoSuite) | `experiments/rbl-project/archive/evosuite_1p`, `evosuite_3p`, `evosuite_5p` | Three archived folders, one per time budget. These were **not re-generated** for this study; they are retained artifacts re-measured with JaCoCo and PIT under the same pipeline. |
| §III Method | **"Temurin JDK 8"** for EvoSuite measurement | `results/rbl4_validation.md` and Maven logs | EvoSuite 1.0.6 requires `tools.jar` (Java 8 only). All EvoSuite branch/mutation measurements used Temurin JDK 8.0.492. |

---

## Part 2 — Generation and Repair Costs (RQ5 Input Data)

| Paper Location | Claim | Source File | Exact Verification |
|---|---|---|---|
| §IV Results (RQ5) | **"initial recorded cost of $0.030982"** | `results/full_llm_output.csv` | Sum the `cost_usd` column across all 63 rows = **$0.030982**. Each row is one zero-shot API call (one Java class → one test suite request). |
| §IV Results (RQ5) | **"63/63 successful API calls"** for initial generation | `results/full_llm_output.csv` | All 63 rows have a non-empty response. No request returned a permanent API error. Transient retries are transparent and do not add rows. |
| §IV Results (RQ5) | **"55 repair calls costing $0.036773"** | `results/full_repair_output.csv` | Row count = 55. Sum `cost_usd` = **$0.036773**. Repair was only attempted on suites that failed initial compilation or execution; the 8 suites that passed first time did not generate a repair record. |
| §III Method | **"One subsequent repair invocation was permitted"** | `results/full_repair_output.csv` | The maximum value in the repair depth column across all 55 records is exactly 1. This is a deliberate protocol constraint (one attempt), not a resource limit that happened to be hit at 1. |

---

## Part 3 — Execution Status Partition (RQ5 Result)

> **Beginner note:** After generating test code via the API and running one repair attempt, each of the 63 test suites had one of three outcomes: it compiled and all tests passed (PASS), it compiled but a test assertion was wrong (FAIL_ASSERTION), or the Java code itself had a syntax error and couldn't even compile (FAIL_COMPILE).

| Paper Location | Claim | Source File | Exact Verification |
|---|---|---|---|
| §IV, Table 1, Abstract, Conclusion | **"14 of the 63 GPT suites passed"** | `results/full_compile_status.csv` | Filter rows where `status == "PASS"`. Count = **14**. These suites compiled without error AND all their `@Test` methods passed when run against the correct SUT. |
| §IV, Table 1, Abstract, Conclusion | **"47 suites failed assertions"** | `results/full_compile_status.csv` | Filter `status == "FAIL_ASSERTION"`. Count = **47**. The Java code compiled successfully, but at least one `assertEquals` (or similar assertion) raised an `AssertionError` at runtime because the expected value in the test was wrong. |
| §IV, Table 1 | **"two failed compilation"** | `results/full_compile_status.csv` | Filter `status == "FAIL_COMPILE"`. Count = **2**. These suites had Java syntax errors (e.g., wrong import, malformed statement) that the `javac` compiler rejected before any test could run. |
| §IV, Conclusion | **"49 invalid suites"** | `results/full_compile_status.csv` | 47 + 2 = **49**. Also: 63 − 14 = 49. Both calculations agree. |
| §IV, Conclusion | **"assertion failures accounted for 95.9%"** | `results/full_compile_status.csv` | 47 ÷ 49 = 0.9591 = **95.9%**. This is why the Discussion concludes that "oracle construction" (writing *correct* assertions, not just compilable code) is the main obstacle. |
| Figure 1 (bar chart) | Bar chart "Execution status of all 63 GPT-generated suites" | `results/figures/fig1_execution_status.png` | Generated by `scripts/generate_rbl4_analysis.py` reading `full_compile_status.csv`. Three bars: PASS=14, FAIL_ASSERTION=47, FAIL_COMPILE=2. |

---

## Part 4 — Full-Corpus GPT Metrics (RQ1 and RQ2 Input Data)

> **Beginner note:** These aggregates cover all 63 SUTs, including the 49 that failed. Suites that failed execution have branch_covered=0 and are included in the denominator. This is intentional: the "all-target" score answers "what does a team get if they run this pipeline on 63 functions without filtering failures?"

| Paper Location | Claim | Source File | Exact Verification |
|---|---|---|---|
| §IV Results, Abstract | **"144/762 covered branches (18.90%)"** | `results/metrics/gpt_class_metrics.csv` | Sum `branch_covered` all 63 rows = **144**. Sum `branch_total` all 63 rows = **762**. 144 ÷ 762 = 0.18898 = **18.90%**. |
| §IV Results, Abstract | **"135/833 eligible mutants killed (16.21%)"** | `results/metrics/gpt_class_metrics.csv` | Sum `mutation_killed` across the **60** rows where `mutation_technical_exclusion == 0` = **135**. Sum `mutation_total` those same 60 rows = **833**. 135 ÷ 833 = 0.16206 = **16.21%**. |
| §III Method | **"Three technical mutation exclusions"** | `results/metrics/gpt_class_metrics.csv` | Filter `mutation_technical_exclusion == 1`. Count = **3**. These classes had PIT instrumentation failures making their mutation counts unreliable. They are excluded from RQ2 and RQ3 mutation tests only (N drops from 63 to 60); they remain in branch tests (N=63). |
| Figure 2 (histogram) | Dual histogram of GPT branch coverage and mutation score per SUT | `results/figures/fig2_gpt_metric_distribution.png` | Generated by `scripts/generate_rbl4_analysis.py` from `gpt_class_metrics.csv`. The heavy spike near 0% is the 49 non-executable suites. Vertical dashed lines mark the three thresholds (30.22%, 4.00%, 40.21%). |

---

## Part 5 — Statistical Tests (RQ1, RQ2, RQ4)

> **Beginner note on the test type:** RQ1 and RQ2 use the one-sided Wilcoxon signed-rank test. Rather than comparing a single average, this test checks whether each individual SUT's score is above a threshold — it is more honest than simply checking whether the aggregate (18.90%) exceeds the threshold (30.22%), because the aggregate hides the fact that most individual SUTs scored 0.

| Paper Location | Claim | Source File | Exact Verification |
|---|---|---|---|
| §III Method | **"30.22% branch threshold (RQ1)"** | `docs/team-synthesis/evidence-table-merged.md` Row 010 | The mean branch coverage of 12 LLMs across 3,909 real-world Java functions in the ULT benchmark (Huang et al. 2026). Used as "what LLMs typically achieve" — the bar this study's GPT should meet or exceed. |
| §III Method | **"40.21% mutation target (RQ2)"** | `evidence-table-merged.md` Row 010 | The mean mutation score from the same ULT study. The ambitious upper threshold for RQ2. |
| §III Method | **"4.00% mutation floor (RQ2)"** | `evidence-table-merged.md` Row 026 | MutGen (Wang et al. 2026) showed suites can have near-100% branch coverage but only 4% mutation score — meaning they run but cannot detect bugs. The floor tests the minimal useful criterion: does the suite kill *any* mutants? |
| Table 1: RQ1 | **N=63, statistic=791.000, p=0.942967, r_rb=−0.215** | `results/summary.csv` row `RQ1` | One-sided Wilcoxon: are per-SUT GPT branch scores significantly greater than 30.22%? `p_raw = 0.94296701`. The negative effect size (−0.215) means scores tend to be *below* the threshold, making a "greater than" result essentially impossible. Decision: **NOT SUPPORTED**. |
| Table 1: RQ2 floor | **N=60, statistic=702.000, p=0.952447, r_rb=−0.233** | `results/summary.csv` row `RQ2_floor` | One-sided Wilcoxon against 4.00% on the 60-SUT mutation sample. p=0.95244679. Even though the aggregate (16.21%) exceeds 4%, most individual SUTs scored 0 (non-executable), pushing the per-SUT distribution below the floor. **NOT SUPPORTED**. |
| Table 1: RQ2 target | **N=60, statistic=561.000, p=0.997231, r_rb=−0.387** | `results/summary.csv` row `RQ2_target` | Same test against 40.21%. Even harder to achieve. p=0.99723076. **NOT SUPPORTED**. |
| Table 1: RQ4 | **N=63, count=13, p=0.9999996, RD=−29.37 pp** | `results/summary.csv` row `RQ4` | Exact binomial test: is the number of "dual success" SUTs (PASS + branch ≥ 30.22% + mutation ≥ 4.00%) greater than 50% of 63? Only 13 qualified. p=0.99999963 ≈ 1. RD = 20.63% − 50% = −29.37 pp. **NOT SUPPORTED**. |
| Table 1: RQ5 row | **"47 assertion, 2 compile — Descriptive"** | `results/full_compile_status.csv` | RQ5 has no inferential test and no p-value. It describes the status partition. It appears in Table 1 so all 5 RQs are visible in one place for the reader. |

---

## Part 6 — EvoSuite Baseline Descriptives (RQ3 Input Data)

> **Beginner note:** EvoSuite is NOT "what students write." It is a well-studied software tool that automatically generates tests using a search algorithm. It is used as a reproducible technical baseline. EvoSuite's higher scores reflect decades of engineering optimisation — not any claim about human test-writing skill.

| Paper Location | Claim | Source File | Exact Verification |
|---|---|---|---|
| §IV Results (RQ3) | **"63/63 archived suites passed at every budget"** | `results/metrics/evosuite_1p_class_metrics.csv`, `evosuite_3p_class_metrics.csv`, `evosuite_5p_class_metrics.csv` | In all three files, the `execution_status` column = `"PASS"` for all 63 rows. EvoSuite reliably produces compilable, passing suites. |
| §IV Results, §V Discussion | **"90.29% branch at 1 minute (688/762)"** | `results/metrics/evosuite_1p_class_metrics.csv` | Sum `branch_covered` = **688**. Sum `branch_total` = **762**. 688 ÷ 762 = **90.29%**. |
| §IV Results | **"95.80% branch at 3 minutes (730/762)"** | `results/metrics/evosuite_3p_class_metrics.csv` | Sum `branch_covered` = **730**. 730 ÷ 762 = **95.80%**. |
| §IV Results, §V Discussion | **"99.34% branch at 5 minutes (757/762)"** | `results/metrics/evosuite_5p_class_metrics.csv` | Sum `branch_covered` = **757**. 757 ÷ 762 = **99.34%**. |
| §IV Results | **"73.23% mutation at 1 minute (610/833)"** | `results/metrics/evosuite_1p_class_metrics.csv` | Sum `mutation_killed` = **610**. Sum `mutation_total` = **833**. 610 ÷ 833 = **73.23%**. |
| §IV Results | **"76.59% mutation at 3 minutes (638/833)"** | `results/metrics/evosuite_3p_class_metrics.csv` | Sum `mutation_killed` = **638**. 638 ÷ 833 = **76.59%**. |
| §IV Results | **"82.11% mutation at 5 minutes (684/833)"** | `results/metrics/evosuite_5p_class_metrics.csv` | Sum `mutation_killed` = **684**. 684 ÷ 833 = **82.11%**. |

---

## Part 7 — Paired Statistical Tests (RQ3)

> **Beginner note:** RQ3 compares GPT and EvoSuite only on the **14 SUTs where the GPT suite passed**. For the other 49 SUTs, GPT produced no valid measurements — you cannot fairly compare coverage values when one side has no working tests. The subset of 14 is NOT cherry-picking; it is the honest, correct approach. The paper is explicit about this throughout.

| Paper Location | Claim | Source File | Exact Verification |
|---|---|---|---|
| Table 2 (all budgets, branch) | **N_p=14, N_r=2, GPT=98.09%, Evo=99.40%, Δ=−1.32 pp, raw p=0.179712, Holm p=0.898562, r_rb=−1.000** | `results/summary.csv` rows `RQ3_1m_branch`, `RQ3_3m_branch`, `RQ3_5m_branch` | Branch results are identical across all three budgets because the 14 GPT passing suites had the same branch values regardless of EvoSuite's budget. N_r=2 means only 2 of the 14 SUT pairs had *different* branch scores; the other 12 were identical, giving the test almost zero power. |
| §IV Results (RQ3) | **"only two of the 14 paired SUTs had non-zero score differences"** for branch | `results/summary.csv` `notes` column for RQ3 branch rows | N_r=2 is the `ranked_n`. With only 2 non-zero differences, the Wilcoxon test cannot reliably detect anything. "No significant difference" does not mean GPT and EvoSuite are equal on branch — it means the data was insufficient to detect a difference. |
| Table 2 (1m, mutation) | **N_p=13, N_r=7, GPT=88.21%, Evo=79.14%, Δ=+9.07 pp, raw p=0.204084, Holm p=0.898562, r_rb=+0.536** | `results/summary.csv` row `RQ3_1m_mutation` | N_p=13 (not 14) because one of the 14 passing GPT suites falls in the 3 technical mutation exclusions, so its mutation score is not comparable. |
| Table 2 (3m, mutation) | **Evo mean=78.20%, Δ=+10.01 pp, raw p=0.236724** | `results/summary.csv` row `RQ3_3m_mutation` | EvoSuite's 3-minute mutation mean on the 13-SUT subset is 78.20% (slightly different from 1-minute 79.14% because different budgets affect which mutants get killed on which individual classes). |
| Table 2 (5m, mutation) | **Evo mean=82.40%, Δ=+5.81 pp, raw p=0.062509, Holm p=0.375053, r_rb=+0.786** | `results/summary.csv` row `RQ3_5m_mutation` | This is the **closest result to significance** in the entire study. Raw p=0.0625, just above α=0.05. After Holm correction: p=0.375 — not significant. The positive r_rb=+0.786 shows GPT suites tended to kill *more* mutants than EvoSuite on this 13-SUT pass-conditioned subset, but the sample is too small to be conclusive. |
| §IV Results (RQ3) | **"smallest adjusted p-value was 0.375053"** | `results/summary.csv` | The minimum value in the `p_adjusted` column across all 6 RQ3 rows is 0.37505350 (5-minute mutation row). |
| §III Method | **"Holm correction applied to six p-values"** | `results/summary.csv` | There are exactly 6 RQ3 rows (3 budgets × 2 metrics). The `p_adjusted` column shows the Holm-corrected values, computed in `scripts/generate_rbl4_analysis.py`. |
| Figure 3 (grouped bar chart) | Chart of GPT vs EvoSuite branch and mutation for all budgets on the pass-conditioned subset | `results/figures/fig3_gpt_vs_evosuite_paired.png` | Generated by `scripts/generate_rbl4_analysis.py`. Bar heights match Table 2 values exactly. |

---

## Part 8 — Discussion, Threats, and Conclusion Claims

| Paper Location | Claim | Basis |
|---|---|---|
| §V Discussion, §VII Conclusion | **"gap between generation availability and executable test quality"** | 63/63 API responses received (generation = always available), but only 14/63 usable (quality = severely limited). The gap is the 49 failed suites. |
| §V Discussion | **"assertion failures overshadowed compilation errors"** | `full_compile_status.csv`: 47 FAIL_ASSERTION vs. 2 FAIL_COMPILE. The model generated mostly valid Java syntax, but the *logic* of the assertions was wrong (asserting an incorrect expected value, a wrong method name, etc.). |
| §V Discussion | **"one repair invocation did not use coverage or mutation feedback"** | `full_repair_output.csv`: repair prompts contain only the compiler error or test-runner failure message — not a coverage diff or list of surviving mutants. This is a deliberate protocol constraint, not an oversight. |
| §V Discussion (Cost subsection) | **"initial calls cost $0.030982 and repair calls cost $0.036773"** | Verbatim from `full_llm_output.csv` and `full_repair_output.csv` cost sums. The Discussion notes that these API costs do not include the human time needed to diagnose failures and decide whether to intervene. |
| §V Discussion | **"1-, 3-, and 5-minute budgets span a meaningful range (90.29% → 99.34%)"** | `results/metrics/evosuite_measured_aggregate.csv`. EvoSuite's branch coverage grows from 90.29% to 99.34% across budgets, showing that the chosen range captures genuine performance variation rather than a narrow slice. |
| §VI Threats | **"14 branch pairs and 13 mutation pairs — limited power"** | `results/summary.csv`: `n` column for RQ3 branch rows = 14; mutation rows = 13. With this small N, the study explicitly **cannot** claim GPT and EvoSuite are equivalent — only that this run produced no statistically significant evidence of a difference. |
| §VI Threats | **"Three technical mutation exclusions"** stated in summary CSV | `results/summary.csv` `notes` columns for RQ3 mutation rows and RQ2 rows state explicitly: "Three technical mutation exclusions are omitted from the Wilcoxon sample." |
| §VII Conclusion | **"only 13 functions achieved both thresholds simultaneously"** | `results/summary.csv` row `RQ4`: `statistic = 13`. Definition: PASS + branch ≥ 30.22% + mutation ≥ 4.00%, all three conditions simultaneously. |
| §VII Conclusion | **"Assertion failures accounted for 95.9% of the 49 invalid suites (RQ5)"** | Repeated from Abstract. 47/49 = 95.9%. Identifies oracle construction as the dominant failure mode. |
| §VII Conclusion | **"EvoSuite remains the appropriate reproducible search-based baseline"** | `results/rbl4_final_report.md` Interpretation boundary section. No student-written data was collected with a validated per-SUT measurement pipeline, so EvoSuite is the only fair technical comparator available. |

---

## Part 9 — External Literature Provenance (Why Each Paper Was Cited)

| Citation in Paper | Paper / Authors | Evidence Table Row | What the paper showed | Why it is in this document |
|---|---|---|---|---|
| `yuan2024junit` | *Yuan et al. 2024* "No More Manual Tests?" | Row 038 | LLMs scoring 80%+ on HumanEval code generation produced <2% correct tests on industrial benchmarks — a benchmark-dependency effect. | **(1)** Provides the Java transformation of HumanEval used as the SUT corpus. **(2)** Establishes that Python HumanEval scores cannot be directly compared to Java results due to language-level compilation requirements. Cited in §I and §III. |
| `schafer2025agonetest` | *Schäfer et al. 2025* "AgoneTest" | Row 024 | Evaluated `gpt-4o-mini` zero-shot on a large Java corpus: 41.9% branch / 44.5% mutation on suites that compiled; reported low initial compilation success. | Closest published configuration to this study (same model, zero-shot, Java, JUnit). Used in §II to set a known capability baseline and justify the repair step. |
| `yang2024chatgpt` | *Yang et al. 2024* "ChatGPT test generation" | Row 016 | Default ChatGPT tests suffer from compilation and assertion errors; iterative feedback repair improved success significantly. | Directly motivates the single repair pass in this study's protocol. Shows repair is established practice, not an ad-hoc addition. Cited in §II. |
| `huang2026ult` | *Huang et al. 2026* "ULT Benchmark" | Row 010 | Ran 12 LLMs on 3,909 real-world Java functions. Mean branch = **30.22%**, mean mutation = **40.21%**. | Source of both primary thresholds: RQ1 (30.22%) and RQ2 target (40.21%). Using published benchmarks prevents the hypotheses from being arbitrary. Cited in §II. |
| `wang2026mutgen` | *Wang et al. 2026* "MutGen" | Row 026 | Some LLM suites achieve near-100% branch coverage but only ~**4% mutation score** — tests that run but cannot detect bugs. | Source of the 4.00% mutation floor for RQ2. The floor asks the minimal question: does the suite kill even a few mutants? Cited in §II. |
| `Tang_2024`, `Lemieux_2023`, `Bouafif_2025` | EvoSuite / SBST context papers | Rows 011, 014, 005 | Established Search-Based Software Testing (SBST) effectiveness and EvoSuite as a standard, well-studied automated test generator. | Used throughout §I and §II to justify the comparison against EvoSuite and introduce the standard metrics (branch coverage and mutation score). |
| `Lu_2026` | *Lu et al. 2026* — JaCoCo analysis | misc. | Validated JaCoCo as a standard, tool-independent branch-coverage framework for Java. | Cited in §III to justify the choice of JaCoCo as the branch measurement tool and give readers a reliability reference. |
| `Bouafif_2025` | *Bouafif et al. 2025* — PIT evaluation | Row 005 | Empirically assessed PIT as reliable and production-ready for Java mutation testing. | Cited in §III to justify PIT as the mutation testing tool. Together with JaCoCo, forms the two-metric measurement backbone. |
| `evaluating2024` | Standard empirical SE evaluation guidelines (Arcuri & Briand 2014 style) | Row (methods) | Best practices: use effect sizes (rank-biserial), multiple-comparison correction (Holm), and report both paired N and ranked N. | Cited in §III to show the statistical design follows established empirical SE methodology, not ad-hoc choices. |
| `yang2025react`, `pham2025llmloop` | Feedback-guided repair loop studies | misc. | Structured feedback loops (giving the model its own error and iterating) significantly improve LLM code and test quality. | Cited in §V Discussion to point toward a concrete, actionable follow-up study: if one blind repair is not enough, try bounded multi-turn feedback. |
| `vy2025whatinputs` | Study on input context effect on LLM test generation | misc. | LLM test quality is sensitive to how much contextual information (docstrings, examples) is provided in the prompt. | Cited in §V Discussion to motivate the "few-shot" future direction: this study used only source code (zero-shot); adding context is the next natural variable to test. |

---

## Part 10 — File Inventory (Quick Reference)

| File | What it contains | Used for |
|---|---|---|
| `results/full_llm_output.csv` | One row per GPT API call: SUT name, prompt, response, model, token counts, cost | Verifying initial generation cost, model identifier, prompt template |
| `results/full_api_log.txt` | Full timestamped log of all GPT API calls | Verifying retry behavior, timestamps, exact request payloads |
| `results/full_repair_output.csv` | One row per repair API call: SUT name, error message fed to model, repair response, cost | Verifying repair count (55), repair cost ($0.036773) |
| `results/full_repair_api_log.txt` | Full timestamped log of all repair API calls | Verifying repair timing and error messages |
| `results/full_compile_status.csv` | One row per SUT: final execution status (PASS / FAIL_ASSERTION / FAIL_COMPILE) | Source of the 14/47/2 partition (RQ5) |
| `results/metrics/gpt_class_metrics.csv` | One row per SUT: branch covered/total, mutation killed/total, exclusion flag | Source of 144/762 branch and 135/833 mutation; inputs for RQ1, RQ2, RQ4 |
| `results/metrics/evosuite_1p_class_metrics.csv` | One row per SUT, EvoSuite 1-minute archive: branch and mutation metrics | Source of 90.29% branch, 73.23% mutation at 1m |
| `results/metrics/evosuite_3p_class_metrics.csv` | EvoSuite 3-minute archive | Source of 95.80% branch, 76.59% mutation at 3m |
| `results/metrics/evosuite_5p_class_metrics.csv` | EvoSuite 5-minute archive | Source of 99.34% branch, 82.11% mutation at 5m |
| `results/metrics/evosuite_measured_aggregate.csv` | Aggregate EvoSuite summary across all three budgets | Cross-check for EvoSuite aggregate values cited in §IV |
| `results/summary.csv` | Final statistical summary: one row per RQ, with N, statistic, raw p, Holm p, effect size, conclusion | **Master verification table** — every number in Tables 1 and 2 maps to a row here |
| `results/rbl4_final_report.md` | Human-readable prose summary of all RQ results | Plain-language restatement of `summary.csv` for auditing |
| `results/rbl4_data_provenance.md` | SHA-256 hashes of all input CSV files | Cryptographic verification that source files were not modified after analysis |
| `results/rbl4_validation.md` | Automated validation check results (PASS/FAIL per check) | Independent confirmation that summary counts match raw CSV counts |
| `results/full_analysis.ipynb` | Jupyter notebook that re-runs all computations from retained CSVs | End-to-end reproducibility: run this to regenerate all figures and the summary CSV |
| `scripts/generate_rbl4_analysis.py` | Python script reading raw CSVs, running all statistical tests, writing summary.csv and figures | The computational engine behind every number in the paper |
| `docs/team-synthesis/evidence-table-merged.md` | Systematic literature review evidence table | Source for external thresholds and citation rationale |
