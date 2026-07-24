# RBL-4 Final Execution & Hypothesis Testing Report

## Scope

GPT-4o-mini (`gpt-4o-mini-2024-07-18`) was run with the recorded zero-shot protocol on 63 HumanEval-Java SUTs. EvoSuite is an operational comparator only, never a student-test proxy.

---

## GPT Execution Evidence

- **Initial API generation:** 63/63 successful calls; cost **$0.030982**.
- **One permitted repair invocation:** 55 API repair records; cost **$0.036773**.
- **Executable final suites:** 14/63 (22.2%); assertion failures: 47; compilation failures: 2.
- **Aggregate GPT branch coverage:** 18.90% (144/762 branches).
- **Aggregate GPT mutation score:** 16.21% (135/833 mutants).

---

## Formal Hypothesis Testing Decisions ($H_0$ vs $H_1$)

| RQ / Hypothesis | Null Hypothesis ($H_0$) Statement | Alternative Hypothesis ($H_1$) Statement | Test & $p$-value | Decision / Conclusion |
| :--- | :--- | :--- | :--- | :--- |
| **RQ1** (Branch Coverage) | $H_{0\_1}: \tilde{\mu}_{\text{BC-AI}} < 30.22\%$ | $H_{1\_1}: \tilde{\mu}_{\text{BC-AI}} \ge 30.22\%$ | One-sample Wilcoxon, $p = 0.943$ | **Accept $H_0$** (Not Supported) |
| **RQ2a** (Mutation Floor) | $H_{0\_2a}: \tilde{\mu}_{\text{MS-AI}} < 4.00\%$ | $H_{1\_2a}: \tilde{\mu}_{\text{MS-AI}} \ge 4.00\%$ | One-sample Wilcoxon, $p = 0.952$ | **Accept $H_0$** (Not Supported) |
| **RQ2b** (Mutation Target)| $H_{0\_2b}: \tilde{\mu}_{\text{MS-AI}} < 40.21\%$ | $H_{1\_2b}: \tilde{\mu}_{\text{MS-AI}} \ge 40.21\%$ | One-sample Wilcoxon, $p = 0.997$ | **Accept $H_0$** (Not Supported) |
| **RQ3 (1m Branch)** | $H_{0\_3a,1\text{m}}: \tilde{\mu}_{\text{GPT}} = \tilde{\mu}_{\text{Evo1m}}$ | $H_{1\_3a,1\text{m}}: \tilde{\mu}_{\text{GPT}} \neq \tilde{\mu}_{\text{Evo1m}}$ | Paired Wilcoxon, $p_{adj} = 0.899$ | **Accept $H_0$** (No Significant Diff) |
| **RQ3 (1m Mutation)** | $H_{0\_3b,1\text{m}}: \tilde{\mu}_{\text{GPT}} = \tilde{\mu}_{\text{Evo1m}}$ | $H_{1\_3b,1\text{m}}: \tilde{\mu}_{\text{GPT}} \neq \tilde{\mu}_{\text{Evo1m}}$ | Paired Wilcoxon, $p_{adj} = 0.899$ | **Accept $H_0$** (No Significant Diff) |
| **RQ3 (3m Branch)** | $H_{0\_3a,3\text{m}}: \tilde{\mu}_{\text{GPT}} = \tilde{\mu}_{\text{Evo3m}}$ | $H_{1\_3a,3\text{m}}: \tilde{\mu}_{\text{GPT}} \neq \tilde{\mu}_{\text{Evo3m}}$ | Paired Wilcoxon, $p_{adj} = 0.899$ | **Accept $H_0$** (No Significant Diff) |
| **RQ3 (3m Mutation)** | $H_{0\_3b,3\text{m}}: \tilde{\mu}_{\text{GPT}} = \tilde{\mu}_{\text{Evo3m}}$ | $H_{1\_3b,3\text{m}}: \tilde{\mu}_{\text{GPT}} \neq \tilde{\mu}_{\text{Evo3m}}$ | Paired Wilcoxon, $p_{adj} = 0.899$ | **Accept $H_0$** (No Significant Diff) |
| **RQ3 (5m Branch)** | $H_{0\_3a,5\text{m}}: \tilde{\mu}_{\text{GPT}} = \tilde{\mu}_{\text{Evo5m}}$ | $H_{1\_3a,5\text{m}}: \tilde{\mu}_{\text{GPT}} \neq \tilde{\mu}_{\text{Evo5m}}$ | Paired Wilcoxon, $p_{adj} = 0.899$ | **Accept $H_0$** (No Significant Diff) |
| **RQ3 (5m Mutation)** | $H_{0\_3b,5\text{m}}: \tilde{\mu}_{\text{GPT}} = \tilde{\mu}_{\text{Evo5m}}$ | $H_{1\_3b,5\text{m}}: \tilde{\mu}_{\text{GPT}} \neq \tilde{\mu}_{\text{Evo5m}}$ | Paired Wilcoxon, $p_{adj} = 0.375$ | **Accept $H_0$** (No Significant Diff) |
| **RQ4** (Dual Success) | $H_{0\_4}: p_{\text{success}} \le 0.50$ | $H_{1\_4}: p_{\text{success}} > 0.50$ | Binomial Test, $p = 1.000$ | **Accept $H_0$** (Not Supported) |
| **RQ5** (Execution Patterns) | Descriptive Failure Analysis | N/A | Frequency Counts | **14 Pass / 47 Fail Assert / 2 Fail Compile** |

---

## Detailed RQ Summary

- **RQ1:** $H_0$ Accepted (one-sided Wilcoxon $p = 0.942967$). GPT-4o-mini branch coverage median does not reach 30.22%.
- **RQ2 Floor (4.00%):** $H_0$ Accepted (one-sided Wilcoxon $p = 0.952447$). Aggregate score is above floor (16.21%), but per-SUT median distribution does not reject $H_0$.
- **RQ2 Target (40.21%):** $H_0$ Accepted (one-sided Wilcoxon $p = 0.997231$). Score is below target.
- **RQ3 Paired Evaluation (1m, 3m, 5m):** $H_0$ Accepted for all time budgets and metrics ($p_{adj} > 0.05$). On the 14 SUTs passing in both tools, GPT-4o-mini achieves comparable coverage and mutation scores to EvoSuite.
- **RQ4 Dual Success:** $H_0$ Accepted (exact binomial $p = 1.000$). Dual success rate is 20.63% (13/63), failing to achieve the hypothesized majority.
- **RQ5 Failure Partition:** Descriptive breakdown showing 14 pass, 47 assertion failures, and 2 compilation failures.

---

## RQ3 Paired GPT vs Archived EvoSuite Tests

| Budget | Metric | Paired / ranked N | GPT mean | EvoSuite mean | Delta pp | Raw p | Holm p | Rank-biserial | Decision |
| --- | --- | ---: | ---: | ---: | ---: | ---: | ---: | ---: | --- |
| 1m | branch | 14 / 2 | 98.09% | 99.40% | -1.32 | 0.179712 | 0.898562 | -1.000 | Accept $H_0$ |
| 1m | mutation | 13 / 7 | 88.21% | 79.14% | 9.07 | 0.204084 | 0.898562 | 0.536 | Accept $H_0$ |
| 3m | branch | 14 / 2 | 98.09% | 99.40% | -1.32 | 0.179712 | 0.898562 | -1.000 | Accept $H_0$ |
| 3m | mutation | 13 / 7 | 88.21% | 78.20% | 10.01 | 0.236724 | 0.898562 | 0.500 | Accept $H_0$ |
| 5m | branch | 14 / 2 | 98.09% | 99.40% | -1.32 | 0.179712 | 0.898562 | -1.000 | Accept $H_0$ |
| 5m | mutation | 13 / 7 | 88.21% | 82.40% | 5.81 | 0.0625089 | 0.375053 | 0.786 | Accept $H_0$ |

---

## EvoSuite Measurement Evidence

| Budget | Passing suites | Branch coverage | Mutation score |
| --- | ---: | ---: | ---: |
| 1 minute(s) | 63/63 | 90.29% (688/762) | 73.23% (610/833) |
| 3 minute(s) | 63/63 | 95.80% (730/762) | 76.59% (638/833) |
| 5 minute(s) | 63/63 | 99.34% (757/762) | 82.11% (684/833) |

---

## Interpretation Boundary

EvoSuite is an operational technical comparator, not a proxy for student-written tests. The student benchmark remains deferred because comparable per-SUT measurements are unavailable.
