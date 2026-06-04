# Experiment Design Rationale — LLM for Unit Test Case Generation
Date: 2026-06-03 | GAP source: SLR/gap-analysis.md

## Design Decision Table

| Decision | Value | Source |
|---|---|---|
| LLM/Tool | GPT-4 (with potential reference tests on GPT-3.5/GPT-4o) | GAP-T: Tool/LLM column (GPT-4 is the most widely used SOTA model, yet lacks large-scale direct comparison against actual student-written tests) |
| Prompt Strategy | Zero-shot or Few-shot with In-Context Learning | Derived from SS047, SS139 (reflects the most fundamental automated test generation context without expensive fine-tuning) |
| Dataset | Java/Python functions categorized with Medium Cyclomatic Complexity | GAP-D: Most current papers do not deeply evaluate the impact of cyclomatic complexity, usually assessing broadly on HumanEval or Defects4J |
| Primary Metric | Branch coverage, Mutation score | GAP-M: Directly reflects the two core aspects (SS040, SS080, SS109) which are control flow coverage and semantic fault-finding capability |
| Secondary Metric | Compilation success rate, Test smells | Derived from SS047 (for Compilation) and SS139 (for Test smells) to track compilation feasibility and maintainability |
| Baseline type | Absolute threshold & Human-level baseline | RQ Objective: Must achieve specific percentages (≥ 80% branch, ≥ 60% mutation) and directly compare against student-written tests |
| Threshold RQ1 | Branch coverage ≥ 74% | Case 2: Based on paper SS040 where GPT-4 achieves 74% coverage on real functions, we set the expectation at the 74% floor |
| Threshold RQ2 | Mutation score ≥ 58% | Case 2: Based on paper SS040 reporting a 58% mutation score for GPT-4, we set the target milestone at the 58% floor |
| Pipeline base | Benchmark architecture from SS040 and SS174 | SS040 provides a methodology for comparing real code quality; SS174 utilizes a Mutation-guided feedback loop |
| Temperature | 0 (Zero) | Ensures deterministic test generation for maximum reproducibility across evaluation runs, eliminating creative variations |

## Threshold Rationale

Threshold Branch coverage 74% — Case 2 — floor = 74% from paper SS040 (2026). 
Rationale: SS040 evaluates GPT-4 on the ULT benchmark containing complex real-world functions, obtaining a 74% coverage result. To ensure that automatically generated unit tests approach the quality of actual production code, the research sets a challenging milestone that GPT-4 can reach the threshold of 74% for functions with medium complexity.

Threshold Mutation score 58% — Case 2 — floor = 58% from paper SS040 (2026). 
Rationale: Similarly, SS040 records a mutation score of 58% with GPT-4. The 58% threshold is selected as a milestone to determine if the automated generation possesses sufficient semantic fault-detection capability closely comparable to student-written tests.

## Pipeline Rationale

The evaluation pipeline must ensure fairness and reproducibility when comparing AI-generated code against student-written code. The LLM models will be provided with full context including the function signature and source code descriptions, after which the test generator will automatically design test cases. The output will undergo an automated system for compiling, running coverage, and injecting mutations for measurement.

Recommended minimal pipeline:

1. Select 10-20 medium-complexity Java or Python functions/classes.
2. Collect or create student-written tests for the same units.
3. Generate GPT-4/GPT-4o tests with a fixed prompt and temperature 0.
4. Run compilation/execution checks.
5. Measure branch coverage and mutation score for both GPT-generated and student-written tests.
6. Compare each metric against thresholds and paired student-test results.
