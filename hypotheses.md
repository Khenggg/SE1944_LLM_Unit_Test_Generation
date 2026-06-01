# Hypotheses

## Research Question

For Java/Python functions at medium cyclomatic complexity (P), could GPT-4 automatic generation of unit test cases (I) compared to manually written test cases (C) achieve >=80% branch coverage and >=60% mutation score (O)?

## Statistical Test: Wilcoxon Signed-Rank Test

The Wilcoxon signed-rank test is a non-parametric paired-sample test used when the data cannot be assumed to follow a normal distribution. It is appropriate here because:
- We are comparing paired observations (GPT-4 generated vs. manually written tests on the **same** functions)
- Coverage and mutation score data are bounded (0–100%) and may not be normally distributed
- Sample sizes may be moderate, making non-parametric tests more robust

For each function *i*, measure:
- **BC_GPT4(i)**: Branch coverage achieved by GPT-4 generated test suite
- **BC_Manual(i)**: Branch coverage achieved by manually written test suite
- **MS_GPT4(i)**: Mutation score achieved by GPT-4 generated test suite
- **MS_Manual(i)**: Mutation score achieved by manually written test suite

---

## Hypotheses

### H00: If GPT-4 automatic generation of unit test cases achieve branch coverage >= 80%

**H00 (null)**: GPT-4 generated unit tests do **not** achieve >=80% branch coverage on Java/Python functions at medium cyclomatic complexity.

> H00: median(BC_GPT4) < 80%

**H00a (alternative)**: GPT-4 generated unit tests achieve >=80% branch coverage.

> H00a: median(BC_GPT4) >= 80%

**Test**: One-sample Wilcoxon signed-rank test against the threshold value of 80%.

---

### H01: If GPT-4 automatic generation of unit test cases achieve mutation score >= 60%

**H01 (null)**: GPT-4 generated unit tests do **not** achieve >=60% mutation score on Java/Python functions at medium cyclomatic complexity.

> H01: median(MS_GPT4) < 60%

**H01a (alternative)**: GPT-4 generated unit tests achieve >=60% mutation score.

> H01a: median(MS_GPT4) >= 60%

**Test**: One-sample Wilcoxon signed-rank test against the threshold value of 60%.

---

### H02: If GPT-4 automatic generation of unit test cases achieve branch coverage >= 80% compared to manually written test cases

**H02 (null)**: There is no significant difference in branch coverage between GPT-4 generated unit tests and manually written unit tests for Java/Python functions at medium cyclomatic complexity.

> H02: median(BC_GPT4 - BC_Manual) = 0

**H02a (alternative)**: There is a significant difference in branch coverage between GPT-4 generated unit tests and manually written unit tests.

> H02a: median(BC_GPT4 - BC_Manual) != 0

**Test**: Paired Wilcoxon signed-rank test.

---

### H03: If GPT-4 automatic generation of unit test cases achieve mutation score >= 60% compared to manually written test cases

**H03 (null)**: There is no significant difference in mutation score between GPT-4 generated unit tests and manually written unit tests for Java/Python functions at medium cyclomatic complexity.

> H03: median(MS_GPT4 - MS_Manual) = 0

**H03a (alternative)**: There is a significant difference in mutation score between GPT-4 generated unit tests and manually written unit tests.

> H03a: median(MS_GPT4 - MS_Manual) != 0

**Test**: Paired Wilcoxon signed-rank test.

---

### H04: If GPT-4 automatic generation of unit test cases achieve both branch coverage >= 80% and mutation score >= 60% simultaneously

**H04 (null)**: GPT-4 generated unit tests do **not** simultaneously achieve >=80% branch coverage **and** >=60% mutation score on Java/Python functions at medium cyclomatic complexity.

> H04: P(BC_GPT4 >= 80% AND MS_GPT4 >= 60%) <= 0.5

**H04a (alternative)**: GPT-4 generated unit tests simultaneously achieve >=80% branch coverage and >=60% mutation score on the majority of functions.

> H04a: P(BC_GPT4 >= 80% AND MS_GPT4 >= 60%) > 0.5

**Test**: Binomial test or sign test on the proportion of functions meeting both thresholds.

---

## Expected Outcomes Based on SLR Evidence

Based on the evidence from our 9 strictly included studies:

| Hypothesis | Expected Outcome | Supporting Evidence |
|---|---|---|
| **H00** (BC >= 80%) | **Mixed** — Achievable with advanced prompt engineering and structures (e.g., `AX006` CAT framework increases branch coverage by 21.74%, `AX007` HITS method slicing, `CORE001` project knowledge injection +11.67%, and `AX001` covered-code elimination). However, plain vanilla prompting on complex functions falls far short of 80% (`AX003`, `AX005` cyclomatic complexity degrades coverage). |
| **H01** (MS >= 60%) | **Mixed** — Vanilla prompting achieves poor mutation scores on un-leaked real-world code, plummeting down to ~41% (`AX003`). However, specialized architectures such as method slicing (`AX007`) or project and testing knowledge injection (`CORE001`) significantly improve semantic correctness and assertion quality, making ≥60% mutation score possible under guided conditions. |
| **H02** (BC parity) | Likely **reject** — A significant difference is expected. Manual developer-written suites have structurally superior and more contextual test structures than vanilla GPT-4o on real-world projects (`AX003`, `AX009`). |
| **H03** (MS parity) | Likely **reject** — A significant difference is expected. GPT-4's assertion synthesis often lacks semantic depth on complex code paths compared to hand-written tests, leading to lower fault-detection capabilities (`AX003`). |
| **H04** (Both >= thresholds) | Likely **fail to achieve** on vanilla prompts — Simultaneously achieving both high branch coverage and high mutation scores is exceptionally difficult. `AX003` shows that high coverage does not necessarily yield high mutation scores. Only advanced architectures like `AX007` (HITS) or `CORE001` (KTester) demonstrate capabilities to approach both targets simultaneously. |

## Significance Level

All tests will be conducted at alpha = 0.05 with Bonferroni correction for multiple comparisons where applicable.

## Effect Size

Wilcoxon effect size will be reported as r = Z / sqrt(N), where:
- Small effect: r ~ 0.1
- Medium effect: r ~ 0.3
- Large effect: r ~ 0.5
