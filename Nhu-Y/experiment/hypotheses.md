# Hypotheses - LLM-based Unit Test Generation

## RQ1 - Branch Coverage

H0: LLM-generated unit tests do not achieve branch coverage greater than or equal to the selected threshold.

H1: LLM-generated unit tests achieve branch coverage greater than or equal to the selected threshold.

Statistical test dự kiến: Wilcoxon signed-rank test or one-sample test depending on the dataset.

## RQ2 - Mutation Score

H0: LLM-generated unit tests do not achieve mutation score greater than or equal to the selected threshold.

H1: LLM-generated unit tests achieve mutation score greater than or equal to the selected threshold.

Statistical test dự kiến: Wilcoxon signed-rank test.

## RQ3 - Comparison with Human-written Tests

H0: There is no significant difference between LLM-generated unit tests and human-written unit tests in terms of branch coverage and mutation score.

H1: There is a significant difference between LLM-generated unit tests and human-written unit tests in terms of branch coverage and mutation score.

Statistical test dự kiến: Mann-Whitney U test or Wilcoxon signed-rank test, depending on whether the samples are paired.

## Expected Metrics

- Branch coverage
- Code coverage
- Mutation score
- Test pass rate
- Number of generated test cases
