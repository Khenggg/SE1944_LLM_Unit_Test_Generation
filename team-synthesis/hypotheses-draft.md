# Hypotheses Draft

Các giả thuyết dưới đây bám theo `team-synthesis/rq-final.md` và dùng cùng đơn vị phân tích: mỗi function/method trong dataset có một cặp kết quả `GPT-4/GPT-4o-generated tests` và `student-written tests`.

## RQ1 - Branch Coverage Threshold

Do GPT-4/GPT-4o-generated unit tests achieve branch coverage >=80%?

- **H0_1:** The median branch coverage of GPT-4/GPT-4o-generated unit tests is lower than 80%.
- **H1_1:** The median branch coverage of GPT-4/GPT-4o-generated unit tests is at least 80%.

Planned test: one-sample Wilcoxon signed-rank test against the threshold value 80%.

## RQ2 - Mutation Score Threshold

Do GPT-4/GPT-4o-generated unit tests achieve mutation score >=60%?

- **H0_2:** The median mutation score of GPT-4/GPT-4o-generated unit tests is lower than 60%.
- **H1_2:** The median mutation score of GPT-4/GPT-4o-generated unit tests is at least 60%.

Planned test: one-sample Wilcoxon signed-rank test against the threshold value 60%.

## RQ3 - Comparison With Student-written Tests

Are GPT-4/GPT-4o-generated unit tests significantly different from student-written unit tests on the same functions?

- **H0_3a:** There is no statistically significant paired difference in branch coverage between GPT-4/GPT-4o-generated tests and student-written tests.
- **H1_3a:** There is a statistically significant paired difference in branch coverage between GPT-4/GPT-4o-generated tests and student-written tests.

- **H0_3b:** There is no statistically significant paired difference in mutation score between GPT-4/GPT-4o-generated tests and student-written tests.
- **H1_3b:** There is a statistically significant paired difference in mutation score between GPT-4/GPT-4o-generated tests and student-written tests.

Planned test: paired Wilcoxon signed-rank test because the two test suites are evaluated on the same functions.

## RQ4 - Simultaneous Success Rate

Do GPT-4/GPT-4o-generated unit tests reach both thresholds at the same time for most functions?

- **H0_4:** The proportion of functions where GPT-4/GPT-4o-generated tests achieve both branch coverage >=80% and mutation score >=60% is <=50%.
- **H1_4:** The proportion of functions where GPT-4/GPT-4o-generated tests achieve both branch coverage >=80% and mutation score >=60% is >50%.

Planned test: exact binomial test or sign test on per-function pass/fail against both thresholds.

## Analysis Notes

- Use the same selected functions for GPT-generated and student-written tests.
- Exclude or separately report tests that do not compile/run, because coverage and mutation scores are not meaningful for non-executable test suites.
- Report descriptive statistics first: median, IQR, min/max, and number of executable test suites.
- If multiple hypotheses are tested together, apply a simple multiple-comparison correction such as Holm correction.
