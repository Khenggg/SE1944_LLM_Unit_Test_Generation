# Hypotheses Draft - LLM Unit Test Generation

Date: 2026-06-03

## Final RQ Draft

For medium-complexity Java/Python functions or classes, do GPT-4/GPT-4o-generated unit tests achieve branch coverage >= 80% and mutation score >= 57%, and how do they compare with student-written tests for the same code units?

## RQ1 - Branch Coverage Threshold

H0_1: GPT-4/GPT-4o-generated unit tests do not achieve median branch coverage >= 80% on the selected medium-complexity Java/Python units.

H1_1: GPT-4/GPT-4o-generated unit tests achieve median branch coverage >= 80% on the selected medium-complexity Java/Python units.

Statistical test: One-sample Wilcoxon signed-rank test against 80% (alpha = 0.05).

Threshold source: Case 2 from experiment/design-rationale.md. GS022 reports above 80% coverage on HumanEval, and GS001 reports up to 96.3% branch coverage.

## RQ2 - Mutation Score Threshold

H0_2: GPT-4/GPT-4o-generated unit tests do not achieve median mutation score >= 57% on the selected medium-complexity Java/Python units.

H1_2: GPT-4/GPT-4o-generated unit tests achieve median mutation score >= 57% on the selected medium-complexity Java/Python units.

Statistical test: One-sample Wilcoxon signed-rank test against 57% (alpha = 0.05).

Threshold source: Case 2 from experiment/design-rationale.md. GS001 reports 57% average mutation score, used as the evidence-table floor value; GS046 reports higher valid mutation-score results.

## RQ3 - Student-Written Test Comparison

H0_3: GPT-4/GPT-4o-generated unit tests are not better than student-written tests on the same code units for branch coverage and mutation score.

H1_3: GPT-4/GPT-4o-generated unit tests are better than student-written tests on the same code units for branch coverage and/or mutation score.

Statistical test: Paired Wilcoxon signed-rank test on per-unit metric differences (GPT-generated score minus student-written score), alpha = 0.05.

Comparison source: GAP-D in SLR/gap-analysis.md. No included paper provides the paired student-written comparison for the same medium-complexity code units.

## Metric Interpretation

- Branch coverage is a continuous percentage score, so Wilcoxon signed-rank is used instead of a parametric t-test.
- Mutation score is also a continuous percentage score, so Wilcoxon signed-rank is used for the threshold test.
- RQ3 uses paired comparison because both GPT-generated tests and student-written tests are evaluated on the same code units.
