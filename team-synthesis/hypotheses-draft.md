# Hypotheses Draft

The hypotheses below follow `team-synthesis/rq-final.md` and use the same unit of analysis: each function/method in the dataset has one paired result from `GPT-4/GPT-4o-generated tests` and one from `student-written tests`.

## RQ1 - Branch Coverage Threshold

Do GPT-4/GPT-4o-generated unit tests achieve branch coverage >=80%?

- **H0_1:** The median branch coverage of GPT-4/GPT-4o-generated unit tests is lower than 80%.
- **H1_1:** The median branch coverage of GPT-4/GPT-4o-generated unit tests is at least 80%.

Planned test: one-sample Wilcoxon signed-rank test against the 80% threshold.

## RQ2 - Mutation Score Threshold

Do GPT-4/GPT-4o-generated unit tests achieve mutation score >=60%?

- **H0_2:** The median mutation score of GPT-4/GPT-4o-generated unit tests is lower than 60%.
- **H1_2:** The median mutation score of GPT-4/GPT-4o-generated unit tests is at least 60%.

Planned test: one-sample Wilcoxon signed-rank test against the 60% threshold.

## RQ3 - Comparison With Student-written Tests

Are GPT-4/GPT-4o-generated unit tests statistically different from student-written unit tests on the same functions?

- **H0_3a:** There is no statistically significant paired difference in branch coverage between GPT-4/GPT-4o-generated tests and student-written tests.
- **H1_3a:** There is a statistically significant paired difference in branch coverage between GPT-4/GPT-4o-generated tests and student-written tests.

- **H0_3b:** There is no statistically significant paired difference in mutation score between GPT-4/GPT-4o-generated tests and student-written tests.
- **H1_3b:** There is a statistically significant paired difference in mutation score between GPT-4/GPT-4o-generated tests and student-written tests.

Planned test: paired Wilcoxon signed-rank test because both test suites are evaluated on the same functions.

## RQ4 - Simultaneous Threshold Success

Do GPT-4/GPT-4o-generated unit tests reach both thresholds for most functions?

- **H0_4:** The proportion of functions where GPT-4/GPT-4o-generated tests achieve both branch coverage >=80% and mutation score >=60% is <=50%.
- **H1_4:** The proportion of functions where GPT-4/GPT-4o-generated tests achieve both branch coverage >=80% and mutation score >=60% is >50%.

Planned test: exact binomial test or sign test on each function's pass/fail result against both thresholds.

## Analysis Notes

- Use the same selected functions for GPT-generated tests and student-written tests.
- Exclude or separately report tests that do not compile/run, because coverage and mutation scores are not meaningful for non-executable test suites.
- Report descriptive statistics first: median, IQR, min/max, and number of executable test suites.
- If multiple hypotheses are tested together, apply a simple multiple-comparison correction such as Holm correction.
