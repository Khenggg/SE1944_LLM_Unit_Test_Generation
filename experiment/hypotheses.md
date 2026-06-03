# Hypotheses – LLM for Unit Test Case Generation
Date: 2026-06-03

## RQ1
Does GPT-4 automatic generation of unit test cases achieve branch coverage greater than or equal to 80% for medium cyclomatic complexity functions?

- **H0_1:** GPT-4 automatic generation of unit test cases DOES NOT achieve branch coverage ≥ 80%.
- **H1_1:** GPT-4 automatic generation of unit test cases ACHIEVES branch coverage ≥ 80%.

## RQ2
Does GPT-4 automatic generation of unit test cases achieve a mutation score greater than or equal to 60% for medium cyclomatic complexity functions?

- **H0_2:** GPT-4 automatic generation of unit test cases DOES NOT achieve a mutation score ≥ 60%.
- **H1_2:** GPT-4 automatic generation of unit test cases ACHIEVES a mutation score ≥ 60%.

## RQ3
Are GPT-4-generated tests significantly different from manually written tests in terms of coverage and mutation scores on the same Java/Python functions?

- **H0_3:** There is no statistically significant difference between GPT-4-generated tests and manually written test cases in terms of branch coverage and mutation score.
- **H1_3:** There is a statistically significant difference between GPT-4-generated tests and manually written test cases in terms of branch coverage and mutation score.

## Planned Statistical Test

- **One-sample Wilcoxon signed-rank test** for comparing branch coverage against the 80% threshold. Because branch coverage is a continuous variable measured as a percentage, this non-parametric test is used to determine whether the median coverage is statistically greater than or equal to the target.
- **One-sample Wilcoxon signed-rank test** for comparing the mutation score against the 60% threshold. Similar to RQ1, the mutation score is a continuous percentage metric, so this test determines if the automated system's score statistically meets or exceeds the target.
- **Paired Wilcoxon signed-rank test** for directly comparing GPT-4 generated tests and student-written tests on the same functions. Since we are comparing paired sets of data across continuous performance metrics on identical functions, this non-parametric test is the most appropriate method to assess statistical differences.
