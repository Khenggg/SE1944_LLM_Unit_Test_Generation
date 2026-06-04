# Hypotheses - SE1944

## RQ1

Do GPT-4/GPT-4o-generated unit tests achieve branch coverage >= 56.5%?

- **H0_1:** GPT-4/GPT-4o-generated unit tests do not achieve median branch coverage >= 56.5%.
- **H1_1:** GPT-4/GPT-4o-generated unit tests achieve median branch coverage >= 56.5%.

## RQ2

Do GPT-4/GPT-4o-generated unit tests achieve mutation score >= 57%?

- **H0_2:** GPT-4/GPT-4o-generated unit tests do not achieve median mutation score >= 57%.
- **H1_2:** GPT-4/GPT-4o-generated unit tests achieve median mutation score >= 57%.

## RQ3

Are GPT-4/GPT-4o-generated tests better than student-written tests on the same Java/Python functions/classes?

- **H0_3:** GPT-4/GPT-4o-generated tests are not better than student-written tests for branch coverage and mutation score.
- **H1_3:** GPT-4/GPT-4o-generated tests are better than student-written tests for branch coverage and/or mutation score.

## Planned Statistical Test

- One-sample Wilcoxon signed-rank test for comparing branch coverage against 56.5%.
- One-sample Wilcoxon signed-rank test for comparing mutation score against 57%.
- Paired Wilcoxon signed-rank test if comparing GPT-generated tests and student-written tests on the same functions.
