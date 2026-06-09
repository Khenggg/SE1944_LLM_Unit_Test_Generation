# Experiment Design Rationale — LLM for Unit Test Case Generation
Date: 2026-06-03 | GAP source: SLR/gap-analysis.md

## Design Decision Table

| Decision | Value | Source |
|---|---|---|
| Tool/LLM | GPT-4o (with potential reference tests on GPT-3.5 or other models) | GAP-T: Tool/LLM column (GPT-4o is a widely used SOTA model, yet lacks large-scale direct comparison against actual student-written tests) |
| Prompt Strategy | Zero-shot or Few-shot with In-Context Learning | Derived from SS047, SS139 (reflects the most fundamental automated test generation context without expensive fine-tuning) |
| Dataset | Java/Python functions categorized with Medium Cyclomatic Complexity | GAP-D: Most current papers do not deeply evaluate the impact of cyclomatic complexity, usually assessing broadly on HumanEval or Defects4J |
| Primary Metric | Branch coverage, Mutation score | GAP-M: Directly reflects the two core aspects (SS040, SS080, SS109) which are control flow coverage and semantic fault-finding capability |
| Secondary Metric | Compilation success rate, Test smells | Derived from SS047 (for Compilation) and SS139 (for Test smells) to track compilation feasibility and maintainability |
| Baseline type | Absolute threshold & Human-level baseline | RQ Objective: Must achieve specific percentages (≥ 74% branch, ≥ 58% mutation) and directly compare against student-written tests |
| Threshold RQ1 | Branch coverage ≥ 74% | Case 2: Based on paper SS040 where the GPT-4 family achieves 74% coverage on real functions, we set the expectation at the 74% floor |
| Threshold RQ2 | Mutation score ≥ 58% | Case 2: Based on paper SS040 reporting a 58% mutation score, we set the target milestone at the 58% floor |
| Pipeline base | Benchmark architecture from SS040 and SS174 | SS040 provides a methodology for comparing real code quality; SS174 utilizes a Mutation-guided feedback loop |
| Temperature | 0 (Zero) | Ensures deterministic test generation for maximum reproducibility across evaluation runs, eliminating creative variations |

## Threshold Rationale

Threshold Branch coverage 74% — Case 2 — floor = 74% from paper SS040 (2026). 

Rationale: SS040 evaluates LLMs on the UnLeakedTestBench (ULT) dataset. While the average performance across all tested LLMs is much lower (~30.22%), the study explicitly records that the **GPT-4 family achieves a 74% branch coverage peak performance** on these complex functions. To ensure our generated tests approach the quality of actual production code, we set this challenging, model-specific milestone of 74% as our floor.


Threshold Mutation score 58% — Case 2 — floor = 58% from paper SS040 (2026). 

Rationale: Similarly, on the ULT dataset, SS040 documents that the **GPT-4 family specifically achieves a mutation score of 58%**. This 58% threshold is strictly selected as our target milestone to determine if the automated generation possesses sufficient semantic fault-detection capability.

## Pipeline Rationale

The evaluation pipeline must ensure fairness and reproducibility when comparing AI-generated code against student-written code. The LLM models will be provided with full context including the function signature and source code descriptions, after which the test generator will automatically design test cases. The output will undergo an automated system for compiling, running coverage, and injecting mutations for measurement.

Recommended minimal pipeline:

1. Select 10-20 medium-complexity Java or Python functions from historical student programming assignments (following the evaluation approach in SS032 which used 6 student assignments, but scaled up).
2. Collect the existing student-written tests for the same units as the baseline.
3. Generate GPT-4o tests with a fixed prompt and temperature 0.
4. Run compilation/execution checks.
5. Measure branch coverage and mutation score for both GPT-generated and student-written tests.
6. Compare each metric against thresholds and paired student-test results.

## Environmental & Resource Constraints

- Running JaCoCo (for branch coverage) and PIT/MutPy (for mutation testing) on 10-20 medium-complexity functions is well within the capabilities of a standard student laptop (only requiring about 8GB RAM and modern multi-core CPU, no cloud clusters or HPC environments needed).
- API calls to the GPT-4o API for only 20 functions will consume a highly constrained amount of tokens, keeping the financial burden negligible.
