# Hypotheses - SE1944

## RQ1 - Branch Coverage Threshold

Do GPT-4o-mini (gpt-4o-mini-2024-07-18) generated unit tests achieve median branch coverage >= 30.22% on selected Java functions from the HumanEval-Java benchmark?

- **H0_1:** GPT-4o-mini (gpt-4o-mini-2024-07-18) generated unit tests do not achieve median branch coverage >= 30.22%.
- **H1_1:** GPT-4o-mini (gpt-4o-mini-2024-07-18) generated unit tests achieve median branch coverage >= 30.22%.

Threshold source: GS017 is the directly usable branch-coverage source, reporting average branch coverage 30.22% for LLM-generated tests on ULT real-world Python functions.

## RQ2 - Mutation Score Threshold

Do GPT-4o-mini (gpt-4o-mini-2024-07-18) generated unit tests achieve median mutation score >= 4% (strict floor) and >= 40.21% (scientific reference target) on the selected Java functions?

### RQ2a - Mutation Score Strict Floor (4%)
- **H0_2a:** GPT-4o-mini (gpt-4o-mini-2024-07-18) generated unit tests do not achieve median mutation score >= 4%.
- **H1_2a:** GPT-4o-mini (gpt-4o-mini-2024-07-18) generated unit tests achieve median mutation score >= 4%.

### RQ2b - Mutation Score Reference Target (40.21%)
- **H0_2b:** GPT-4o-mini (gpt-4o-mini-2024-07-18) generated unit tests do not achieve median mutation score >= 40.21%.
- **H1_2b:** GPT-4o-mini (gpt-4o-mini-2024-07-18) generated unit tests achieve median mutation score >= 40.21%.

Threshold sources: GS005 reports that some test suites reached 100% coverage but only 4% mutation score; this is the strict RBL-2 Case 2 floor for mutation score in the evidence table. GS017's 40.21% ULT average is evaluated as a secondary reference target to assess actual performance.

## RQ3 - Comparison with Human Benchmark Tests

How do GPT-4o-mini (gpt-4o-mini-2024-07-18) generated tests compare with human-written benchmark tests on the same Java functions?

- **H0_3a:** GPT-4o-mini (gpt-4o-mini-2024-07-18) generated tests do not achieve higher branch coverage than human-written benchmark tests on the same code units.
- **H1_3a:** GPT-4o-mini (gpt-4o-mini-2024-07-18) generated tests achieve higher branch coverage than human-written benchmark tests on the same code units.
- **H0_3b:** GPT-4o-mini (gpt-4o-mini-2024-07-18) generated tests do not achieve higher mutation score than human-written benchmark tests on the same code units.
- **H1_3b:** GPT-4o-mini (gpt-4o-mini-2024-07-18) generated tests achieve higher mutation score than human-written benchmark tests on the same code units.

## Planned Statistical Test

- One-sample Wilcoxon signed-rank test for comparing branch coverage against 30.22%.
- One-sample Wilcoxon signed-rank tests for comparing mutation score against 4% and 40.21% respectively.
- Paired Wilcoxon signed-rank test for comparing GPT-generated tests and human benchmark tests on the same functions; report direction and effect size.

Alpha: 0.05.
