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

Based on the evidence from 7 strictly included studies:

| Hypothesis | Expected Outcome | Supporting Evidence |
|---|---|---|
| **H00** (BC >= 80%) | **Mixed** — Achievable with advanced coverage-guided feedback (SS008: 89% BC, SS011: 99.05% BC) but vanilla GPT-4 on real complex repositories (SS006: 30.22% avg, SS009: 35.2% avg) falls far short of 80%. |
| **H01** (MS >= 60%) | **Mixed** — Achievable using mutation feedback loops (SS001: 89.5% MS, SS004: 93.57% MS, SS011: 94.32% MS) but fails on complex Java code with standard prompting (SS006: 40.21% avg). |
| **H02** (BC parity) | Likely **reject** — Manual/developer tests (SS009) achieve much higher coverage than vanilla GPT-4o on real repos. |
| **H03** (MS parity) | Likely **reject** — Significant differences expected in fault-detection capabilities on complex code paths. |
| **H04** (Both >= thresholds) | Likely **fail to reject** on medium-complexity code — Simultaneous achievement of both targets is rare and currently only shown on simple, isolated algorithmic units (SS011, SS001). |

## Significance Level

All tests will be conducted at alpha = 0.05 with Bonferroni correction for multiple comparisons where applicable.

## Effect Size

Wilcoxon effect size will be reported as r = Z / sqrt(N), where:
- Small effect: r ~ 0.1
- Medium effect: r ~ 0.3
- Large effect: r ~ 0.5
