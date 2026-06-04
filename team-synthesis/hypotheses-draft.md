# Hypotheses Draft

The statistical hypotheses defined below are directly aligned with the research questions outlined in `team-synthesis/rq-final.md`. The unit of analysis is strictly maintained: for every individual function/method in the dataset, there will be one paired set of results consisting of the `GPT-4/GPT-4o-generated tests` and the corresponding `student-written tests`.

## RQ1 - Branch Coverage Threshold

Do GPT-4/GPT-4o-generated unit tests achieve a branch coverage of >=74% on the selected medium-complexity Java and Python functions?

- **H0_1 (Null Hypothesis):** The median branch coverage of GPT-4/GPT-4o-generated unit tests is strictly less than 74%.
- **H1_1 (Alternative Hypothesis):** The median branch coverage of GPT-4/GPT-4o-generated unit tests is at least 74%.

**Planned Statistical Test:** One-sample Wilcoxon signed-rank test, evaluating the sample median against the constant threshold value of 74%.

## RQ2 - Mutation Score Threshold

Do GPT-4/GPT-4o-generated unit tests achieve a mutation score of >=58% on the exact same selected functions?

- **H0_2 (Null Hypothesis):** The median mutation score of GPT-4/GPT-4o-generated unit tests is strictly less than 58%.
- **H1_2 (Alternative Hypothesis):** The median mutation score of GPT-4/GPT-4o-generated unit tests is at least 58%.

**Planned Statistical Test:** One-sample Wilcoxon signed-rank test, evaluating the sample median against the constant threshold value of 58%.

## RQ3 - Comparison With Student-Written Tests

Is there a statistically significant difference in branch coverage and mutation score when comparing GPT-4/GPT-4o-generated unit tests to student-written unit tests evaluated on the same functions?

### RQ3a: Branch Coverage Comparison
- **H0_3a (Null Hypothesis):** There is no statistically significant paired difference in branch coverage between GPT-4/GPT-4o-generated tests and student-written tests.
- **H1_3a (Alternative Hypothesis):** There is a statistically significant paired difference in branch coverage between GPT-4/GPT-4o-generated tests and student-written tests.

### RQ3b: Mutation Score Comparison
- **H0_3b (Null Hypothesis):** There is no statistically significant paired difference in mutation score between GPT-4/GPT-4o-generated tests and student-written tests.
- **H1_3b (Alternative Hypothesis):** There is a statistically significant paired difference in mutation score between GPT-4/GPT-4o-generated tests and student-written tests.

**Planned Statistical Test:** Paired Wilcoxon signed-rank test, utilized because the two independently generated test suites (LLM vs. Student) are evaluated on the exact same paired functions, representing dependent samples.

## RQ4 - Simultaneous Success Rate

What is the proportion of functions where GPT-4/GPT-4o-generated unit tests successfully reach both the branch coverage and mutation score thresholds simultaneously?

- **H0_4 (Null Hypothesis):** The proportion of functions for which GPT-4/GPT-4o-generated tests simultaneously achieve both branch coverage >=74% and mutation score >=58% is <= 50%.
- **H1_4 (Alternative Hypothesis):** The proportion of functions for which GPT-4/GPT-4o-generated tests simultaneously achieve both branch coverage >=74% and mutation score >=58% is > 50%.

**Planned Statistical Test:** Exact binomial test or sign test evaluating the per-function binary pass/fail rate against the 50% majority threshold.

## Analysis Guidelines & Prerequisites

- The exact same set of selected functions must be used for evaluating both the GPT-generated tests and the student-written tests to ensure valid paired statistical analysis.
- Test suites that fail to compile or execute must be excluded from the coverage and mutation statistical tests, or reported separately. Coverage and mutation scores are scientifically meaningless for non-executable test suites.
- Prior to hypothesis testing, report comprehensive descriptive statistics including the median, Interquartile Range (IQR), minimum, maximum, and the total count of successfully executed test suites.
- If multiple hypotheses are tested simultaneously on the same dataset, apply an appropriate multiple-comparison correction methodology (such as the Holm-Bonferroni method) to control the family-wise error rate.
