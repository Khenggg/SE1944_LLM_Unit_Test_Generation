# Hypotheses - SE1944

## RQ1

Do GPT-4-generated unit tests achieve branch coverage >= 70%?

- **H0_1:** GPT-4-generated unit tests do not achieve branch coverage >= 70%.
- **H1_1:** GPT-4-generated unit tests achieve branch coverage >= 70%.

## RQ2

Do GPT-4-generated unit tests achieve mutation score >= 35.3%?

- **H0_2:** GPT-4-generated unit tests do not achieve mutation score >= 35.3%.
- **H1_2:** GPT-4-generated unit tests achieve mutation score >= 35.3%.

## RQ3

Are GPT-4-generated tests different from student-written tests on the same Java/Python functions?

- **H0_3:** There is no statistically significant difference between GPT-4-generated tests and student-written tests.
- **H1_3:** There is a statistically significant difference between GPT-4-generated tests and student-written tests.

## Planned Statistical Test

- One-sample Wilcoxon signed-rank test for comparing branch coverage against 70%.
- One-sample Wilcoxon signed-rank test for comparing mutation score against 35.3%.
- Paired Wilcoxon signed-rank test if comparing GPT-generated tests and student-written tests on the same functions.
