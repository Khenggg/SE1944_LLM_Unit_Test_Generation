# Hypotheses Draft - LLM for Unit Test Case Generation

Date: 2026-06-05 | Source: `experiment/design-rationale.md`

## Final RQ Draft

For medium-complexity Java/Python functions or classes, approximately CC = 5-15 where measurable, do GPT-4o (gpt-4o-2024-05-13) generated unit tests achieve branch coverage >= 30.22% and mutation score >= 4%, and how do they compare with student-written coursework tests for the same code units?

## Threshold Sources

| Metric | Threshold | Case | Source | Role |
| --- | ---: | --- | --- | --- |
| Branch coverage | 30.22% | Case 2 | GS017 reports average branch coverage at 30.22% on ULT real-world Python functions. | Main RQ1 threshold. |
| Mutation score | 4% | Case 2 | GS005 reports suites with 100% coverage but only 4% mutation score. | Main RQ2 strict floor threshold. |
| Mutation score | 40.21% | Secondary H0/H1 | GS017 reports average mutation score at 40.21% on ULT. | Secondary threshold / stronger reference target. |

## RQ1 - Branch Coverage Threshold

Test whether GPT-4o (gpt-4o-2024-05-13) generated unit tests reach median branch coverage of at least 30.22% on medium-complexity Java/Python units.

- **H0_1:** The median branch coverage of GPT-4o (gpt-4o-2024-05-13) generated unit tests is lower than 30.22%.
- **H1_1:** The median branch coverage of GPT-4o (gpt-4o-2024-05-13) generated unit tests is greater than or equal to 30.22%.

**Planned statistical test:** One-sample Wilcoxon signed-rank test against 30.22% (alpha = 0.05).

**Rationale:** Branch coverage is a continuous percentage metric. Wilcoxon is appropriate because the expected sample is small and should not assume normality.

## RQ2 - Mutation Score Threshold

Test whether GPT-4o (gpt-4o-2024-05-13) generated unit tests reach the mutation-score thresholds on medium-complexity Java/Python units.

### RQ2a - Strict Floor (4%)

- **H0_2a:** The median mutation score of GPT-4o (gpt-4o-2024-05-13) generated unit tests is lower than 4%.
- **H1_2a:** The median mutation score of GPT-4o (gpt-4o-2024-05-13) generated unit tests is greater than or equal to 4%.

### RQ2b - Reference Target (40.21%)

- **H0_2b:** The median mutation score of GPT-4o (gpt-4o-2024-05-13) generated unit tests is lower than 40.21%.
- **H1_2b:** The median mutation score of GPT-4o (gpt-4o-2024-05-13) generated unit tests is greater than or equal to 40.21%.

**Planned statistical test:** One-sample Wilcoxon signed-rank test against 4% and 40.21%, respectively (alpha = 0.05).

**Rationale:** Mutation score is a continuous percentage metric. Wilcoxon is appropriate because the expected sample is small and should not assume normality. The 4% threshold is the strict floor from GS005, while 40.21% from GS017 is used as a stronger practical reference target.

## RQ3 - Comparison with Student-Written Coursework Tests

Test whether GPT-4o (gpt-4o-2024-05-13) generated tests outperform student-written coursework tests on the same code units for branch coverage and mutation score.

### RQ3a - Branch Coverage Comparison

- **H0_3a:** The median branch coverage of GPT-4o (gpt-4o-2024-05-13) generated tests is not greater than the branch coverage of student-written coursework tests on the same code units.
- **H1_3a:** The median branch coverage of GPT-4o (gpt-4o-2024-05-13) generated tests is greater than the branch coverage of student-written coursework tests on the same code units.

### RQ3b - Mutation Score Comparison

- **H0_3b:** The median mutation score of GPT-4o (gpt-4o-2024-05-13) generated tests is not greater than the mutation score of student-written coursework tests on the same code units.
- **H1_3b:** The median mutation score of GPT-4o (gpt-4o-2024-05-13) generated tests is greater than the mutation score of student-written coursework tests on the same code units.

**Planned statistical test:** Paired Wilcoxon signed-rank test on per-unit differences (GPT-generated score minus student-written score), alpha = 0.05. Report direction and effect size after testing.

**Comparison source:** GAP-D in `SLR/gap-analysis.md`. No included paper uses a paired student-written coursework comparison on the same medium-complexity Java/Python units.

## Metric Interpretation

- **Branch coverage:** Measures how much the tests exercise branch/control-flow outcomes.
- **Mutation score:** Measures fault-detection ability through simulated faults; required because GS005 shows high coverage can pair with very low mutation score.
- **Compile/execution success rate:** Reported descriptively as a secondary metric; not a main H0/H1 unless the later proposal downscopes to pass/fail analysis.
