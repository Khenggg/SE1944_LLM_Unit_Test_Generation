# Hypotheses

This file is an RBL-1 planning artifact. It defines hypotheses for the later experiment. RBL-1 does not require running GPT-4, writing tests, or executing coverage/mutation tools.

## Study Context

- Subjects: medium-complexity Java or Python functions/classes.
- AI test set: GPT-4-generated unit tests using one fixed prompt version.
- Baseline test set: student-written unit tests for the same code.
- Java tools: JUnit 5, JaCoCo, PIT/PiTest.
- Python tools: pytest, coverage.py branch coverage, mutmut or Cosmic Ray.
- Validity rule: tests must compile/run before branch coverage or mutation score is accepted.

## Threshold Hypotheses

### Branch Coverage Threshold

- H0_BC_threshold: GPT-4-generated unit tests do not reach average branch coverage >= 80% on the selected Java/Python functions/classes.
- H1_BC_threshold: GPT-4-generated unit tests reach average branch coverage >= 80% on the selected Java/Python functions/classes.

### Mutation Score Threshold

- H0_MS_threshold: GPT-4-generated unit tests do not reach average mutation score >= 60% on the selected Java/Python functions/classes.
- H1_MS_threshold: GPT-4-generated unit tests reach average mutation score >= 60% on the selected Java/Python functions/classes.

## GPT-4 vs Student-Written Tests

### Branch Coverage Comparison

- H0_BC_compare: There is no statistically significant difference in branch coverage between GPT-4-generated tests and student-written tests for the same functions/classes.
- H1_BC_compare: There is a statistically significant difference in branch coverage between GPT-4-generated tests and student-written tests for the same functions/classes.

### Mutation Score Comparison

- H0_MS_compare: There is no statistically significant difference in mutation score between GPT-4-generated tests and student-written tests for the same functions/classes.
- H1_MS_compare: There is a statistically significant difference in mutation score between GPT-4-generated tests and student-written tests for the same functions/classes.

## Planned Statistical Test

Use paired comparisons because each function/class has two matched test sets: GPT-4-generated tests and student-written tests.

- If metric differences are approximately normally distributed, use a paired t-test.
- If normality is not reasonable or the sample is too small, use the Wilcoxon signed-rank test.
- Use `alpha = 0.05` as the significance level unless the final report states otherwise.

Example interpretation: if `p = 0.03` and `alpha = 0.05`, reject the corresponding H0 and report that the observed difference is statistically significant for that metric.