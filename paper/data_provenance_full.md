# Full Data Provenance Mapping

This document provides a claim-by-claim trace of every quantitative statement, statistical test, cost figure, and external literature reference in the paper. It serves as a direct mapping from the final document back to the raw `results/` datasets and the original `evidence-table-merged.md` to ensure complete empirical transparency.

## 1. Empirical Results Provenance

| Paper Location | Claim / Data Point | Source File | Exact Verification Method |
|---|---|---|---|
| **Abstract** | "63 HumanEval-Java functions" | `metrics/gpt_class_metrics.csv` | The total number of rows (targets) evaluated in the dataset is exactly 63. |
| **Abstract** | "14 suites were executable" | `full_compile_status.csv` | Count of rows where `status == PASS` is exactly 14. |
| **Abstract** | "18.90% branch coverage" | `metrics/gpt_class_metrics.csv` | The aggregate sum of `branch_covered` (144) divided by `branch_total` (762) across all 63 classes. |
| **Abstract** | "16.21% mutation score" | `metrics/gpt_class_metrics.csv` | The aggregate sum of `mutation_killed` (135) divided by `mutation_total` (833) across all 63 classes. |
| **Abstract** | "only 13 functions achieved both thresholds simultaneously" | `summary.csv` | Row `RQ4` shows a success count of 13. The metric compares `gpt_value` (13) out of 63. |
| **Abstract** | "Assertion failures accounted for 95.9% of the 49 invalid suites (RQ5)" | `full_compile_status.csv` | The file lists 47 `FAIL_ASSERTION` and 2 `FAIL_COMPILE`, totaling 49 invalid. 47 / 49 = 0.9591 (95.9%). |
| **§I Introduction** | "Five research questions (RQs) structure the evaluation" | `summary.csv` / `rbl4_final_report.md` | All 5 RQs are formally executed and reported in the pipeline's final summary outputs. |
| **§II Related Work** | "mean branch coverage of 30.22% and mean mutation score of 40.21%" | `evidence-table-merged.md` | Row 010: Extracted from Huang et al. 2026 (ULT benchmark results). These values establish the target thresholds for RQ1 and RQ2. |
| **§II Related Work** | "4.00% mutation floor" | `evidence-table-merged.md` | Row 026: Extracted from Wang et al. 2026 (MutGen). Acts as the deliberately low operational screen for RQ2 floor testing. |
| **§III Methodology** | "fixed zero-shot instruction... Temperature was fixed to zero" | `full_llm_output.csv` | The raw API configuration payloads and prompts are captured for every class. |
| **§III Methodology** | "One subsequent repair invocation was permitted" | `full_repair_output.csv` | The log confirms that the maximum repair depth invoked per class was exactly 1. |
| **§IV Results** | "initial recorded cost of \$0.030982" | `full_llm_output.csv` | The arithmetic sum of the `cost` column across the 63 zero-shot prompt requests. |
| **§IV Results** | "55 repair calls costing \$0.036773" | `full_repair_output.csv` | The arithmetic sum of the `cost` column across the 55 repair-prompt requests. |
| **Table 1: RQ1** | $p=0.999$, $\hat{\delta}=-0.370$ | `summary.csv` | Row `RQ1`. One-sample Wilcoxon test against 30.22%. Matches exactly. |
| **Table 1: RQ2 (floor)** | $p=0.923$, $\hat{\delta}=-0.261$ | `summary.csv` | Row `RQ2_floor`. One-sample Wilcoxon test against 4.00%. Matches exactly. |
| **Table 1: RQ2 (target)** | $p>0.999$, $\hat{\delta}=-0.457$ | `summary.csv` | Row `RQ2_target`. One-sample Wilcoxon test against 40.21%. Matches exactly. |
| **Table 1: RQ4** | $p>0.999$ (exact binomial test) | `summary.csv` | Row `RQ4`. Binomial test of 13 successes out of 63 trials against a 50% chance baseline. |
| **Table 1: RQ5** | 14 Pass, 47 Assertion, 2 Compile | `full_compile_status.csv` | Descriptive execution partition matching the compilation statuses. |
| **Table 2 / RQ3 (EvoSuite Base)** | "rose from 90.29% at one minute to 99.34% at five minutes" | `metrics/evosuite_measured_aggregate.csv` | Row 1-minute: 688/762 (90.29%). Row 5-minute: 757/762 (99.34%). |
| **Table 2 / RQ3 (EvoSuite Mut.)**| "rose from 73.23% to 82.11%" | `metrics/evosuite_measured_aggregate.csv` | Row 1-minute: 610/833 (73.23%). Row 5-minute: 684/833 (82.11%). |
| **Table 2: Paired GPT-EvoSuite** | Branch: $N_p=14, N_r=2, p=0.750$ | `summary.csv` | Row `RQ3_branch_1m`, `RQ3_branch_3m`, `RQ3_branch_5m`. All Wilcoxon paired tests exact matches. |
| **Table 2: Paired GPT-EvoSuite** | Mutation: $N_p=13, N_r=7, p=0.078$ | `summary.csv` | Row `RQ3_mutation_1m` etc. Note: `PRIME_FIB` is correctly excluded from $N_p=14$ due to technical measurement failure ($N_p=13$). |
| **§V Discussion** | "Assertion failures overshadowed compilation errors" | `full_compile_status.csv` | Direct inference from the 47 assertion vs 2 compilation breakdown. |
| **§V Discussion** | "Meaningful range of EvoSuite performance" | `metrics/evosuite_measured_aggregate.csv` | Reflects the steady scaling observed across the 1, 3, and 5-minute budgets. |

---

## 2. External Literature Provenance

The following section explicitly maps how the related work citations in the document connect back to the systematic literature review (SLR) captured in the original `evidence-table-merged.md`. It explains *why* these specific papers were selected to frame the study.

| Citation Key / Paper | SLR Row | Reason for Inclusion in Document | Mapping to Document Narrative |
|---|---|---|---|
| **`[16] yuan2024junit`**<br>*(Yuan et al. 2024)* | `038` | Showcased a severe benchmark-dependency effect (models getting 80%+ on HumanEval but <2% on EvoSuite SF110). | Used in Section 2.1 to contextualize why this study relies on a controlled Python-to-Java translation (HumanEval-Java) rather than a highly complex industrial benchmark. |
| **`[10] schafer2025agonetest`**<br>*(AgoneTest / Schäfer et al. 2025)* | `024` | Provided the most direct configuration parallel: evaluating `gpt-4o-mini` in zero-shot mode on a large Java corpus, yielding 41.9% branch / 44.5% mutation score on valid suites. | Used in Section 2.1 to establish a known baseline for `gpt-4o-mini`'s expected coverage capabilities and its low initial compilation success rate. |
| **`[14] yang2024chatgpt`**<br>*(Yang et al. 2024)* | `016` | Highlighted that default ChatGPT tests suffer heavily from compilation/execution errors, and that iterative feedback repair significantly improves them. | Used in Section 2.1 to formally motivate the inclusion of the single-shot feedback/repair step in this study's protocol. |
| **`[4] huang2026ult`**<br>*(ULT Benchmark / Huang et al. 2026)* | `010` | Executed a massive evaluation of 12 LLMs on 3,909 real-world functions (the ULT benchmark) yielding a mean 30.22% branch coverage and 40.21% mutation score. | Used in Section 2.2 as the definitive source for the external benchmark thresholds tested in RQ1 (30.22%) and RQ2 (40.21%). |
| **`[13] wang2026mutgen`**<br>*(MutGen / Wang et al. 2026)* | `026` | Demonstrated a critical failure mode: some generated suites achieve 100% code coverage but only a 4% mutation score, rendering them effectively useless for fault detection. | Used in Section 2.2 to derive the "4.00% mutation floor" (the deliberate low operational screen) tested in RQ2. |
| **`Tang_2024`, `Lemieux_2023`, `Bouafif_2025`**, etc. | `011`, `014`, `005` | Formed the broader context of Search-Based Software Testing (SBST) versus LLMs. | Used throughout the Introduction and Related Work to justify the comparison against EvoSuite and outline the standard metrics (branch/mutation). |
