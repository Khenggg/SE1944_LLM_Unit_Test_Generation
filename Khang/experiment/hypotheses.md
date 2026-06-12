# Hypotheses - SE1944

## RQ1 - Branch Coverage Threshold

Do GPT-4o (gpt-4o-2024-05-13) generated unit tests achieve median branch coverage >= 30.22% on medium-complexity Java/Python functions/classes, approximately CC = 5-15 where measurable?

- **H0_1:** GPT-4o (gpt-4o-2024-05-13) generated unit tests do not achieve median branch coverage >= 30.22%.
- **H1_1:** GPT-4o (gpt-4o-2024-05-13) generated unit tests achieve median branch coverage >= 30.22%.

Threshold source: GS017 is the directly usable branch-coverage source, reporting average branch coverage 30.22% for LLM-generated tests on ULT real-world Python functions.

## RQ2 - Mutation Score Threshold

Do GPT-4o (gpt-4o-2024-05-13) generated unit tests achieve median mutation score >= 4% (strict floor) and >= 40.21% (scientific reference target) on medium-complexity Java/Python functions/classes, approximately CC = 5-15 where measurable?

### RQ2a - Mutation Score Strict Floor (4%)
- **H0_2a:** GPT-4o (gpt-4o-2024-05-13) generated unit tests do not achieve median mutation score >= 4%.
- **H1_2a:** GPT-4o (gpt-4o-2024-05-13) generated unit tests achieve median mutation score >= 4%.

### RQ2b - Mutation Score Reference Target (40.21%)
- **H0_2b:** GPT-4o (gpt-4o-2024-05-13) generated unit tests do not achieve median mutation score >= 40.21%.
- **H1_2b:** GPT-4o (gpt-4o-2024-05-13) generated unit tests achieve median mutation score >= 40.21%.

Threshold sources: GS005 reports that some test suites reached 100% coverage but only 4% mutation score; this is the strict RBL-2 Case 2 floor for mutation score in the evidence table. GS017's 40.21% ULT average is evaluated as a secondary reference target to assess actual performance.

## RQ3 - Comparison with Student-Written Coursework Tests

How do GPT-4o (gpt-4o-2024-05-13) generated tests compare with student-written coursework tests on the same Java/Python functions/classes?

- **H0_3a:** GPT-4o (gpt-4o-2024-05-13) generated tests do not achieve higher branch coverage than student-written coursework tests on the same code units.
- **H1_3a:** GPT-4o (gpt-4o-2024-05-13) generated tests achieve higher branch coverage than student-written coursework tests on the same code units.
- **H0_3b:** GPT-4o (gpt-4o-2024-05-13) generated tests do not achieve higher mutation score than student-written coursework tests on the same code units.
- **H1_3b:** GPT-4o (gpt-4o-2024-05-13) generated tests achieve higher mutation score than student-written coursework tests on the same code units.

## Planned Statistical Test

- One-sample Wilcoxon signed-rank test for comparing branch coverage against 30.22%.
- One-sample Wilcoxon signed-rank tests for comparing mutation score against 4% and 40.21% respectively.
- Paired Wilcoxon signed-rank test for comparing GPT-generated tests and student-written coursework tests on the same functions/classes; report direction and effect size.

Alpha: 0.05.
