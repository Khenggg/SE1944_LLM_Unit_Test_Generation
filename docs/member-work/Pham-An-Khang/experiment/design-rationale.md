# Experiment Design Rationale — LLM for Unit Test Case Generation
Date: 2026-06-03 | GAP source: SLR/gap-analysis.md

## Design Decision Table

| Decision | Value | Source |
|---|---|---|
| Tool/LLM | GPT-4o (with potential reference tests on GPT-3.5 or other models) | GAP-T: Tool/LLM column (GPT-4o is a widely used SOTA model, yet lacks large-scale direct comparison against actual student-written tests) |
| Prompt Strategy | Zero-shot or Few-shot with In-Context Learning | Derived from SS047, SS139 (reflects the most fundamental automated test generation context without expensive fine-tuning) |
| Dataset | Java/Python functions categorized with Medium Cyclomatic Complexity | GAP-D: Most current papers do not deeply evaluate the impact of cyclomatic complexity, usually assessing broadly on [HumanEval](https://github.com/openai/human-eval) or [Defects4J](https://github.com/rjust/defects4j) |
| Primary Metric | Branch coverage, Mutation score | GAP-M: Directly reflects the two core aspects (SS040, SS080, SS109) which are control flow coverage and semantic fault-finding capability |
| Secondary Metric | Compilation success rate, Test smells | Derived from SS047 (for Compilation) and SS139 (for Test smells) to track compilation feasibility and maintainability |
| Baseline type | Absolute threshold & Human-level baseline | RQ Objective: Must achieve specific percentages (≥ 74% branch, ≥ 58% mutation) and directly compare against student-written tests |
| Threshold RQ1 | Branch coverage ≥ 74% | Case 2: Based on paper SS040 where the GPT-4 family achieves 74% coverage on real functions, we set the expectation at the 74% floor |
| Threshold RQ2 | Mutation score ≥ 58% | Case 2: Based on paper SS040 reporting a 58% mutation score, we set the target milestone at the 58% floor |
| Pipeline base | Benchmark architecture from SS040 and SS174 | SS040 provides a methodology for comparing real code quality; SS174 utilizes a Mutation-guided feedback loop |
| Temperature | 0 (Zero) | Ensures deterministic test generation for maximum reproducibility across evaluation runs, eliminating creative variations |

## Threshold Rationale

Threshold Branch coverage 74% — Case 2 — floor = 74% from paper SS040 (2026). 

Rationale: SS040 evaluates LLMs on the [UnLeakedTestBench (ULT)](https://github.com/huangd1999/UnLeakedTestBench) dataset. While the average performance across all tested LLMs is much lower (~30.22%), the study explicitly records that the **GPT-4 family achieves a 74% branch coverage peak performance** on these complex functions. To ensure our generated tests approach the quality of actual production code, we set this challenging, model-specific milestone of 74% as our floor.


Threshold Mutation score 58% — Case 2 — floor = 58% from paper SS040 (2026). 

Rationale: Similarly, on the [ULT](https://github.com/huangd1999/UnLeakedTestBench) dataset, SS040 documents that the **GPT-4 family specifically achieves a mutation score of 58%**. This 58% threshold is strictly selected as our target milestone to determine if the automated generation possesses sufficient semantic fault-detection capability.

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

While code coverage (JaCoCo) is lightweight, mutation testing (PIT for Java, MutPy for Python) is a highly resource-intensive process. It generates dozens of modified versions of the code (mutants) and runs the test suite against each one. On a standard university student laptop, running mutation testing globally could lead to severe system lag, thermal throttling, or infinite execution loops.

To mitigate hardware constraints, the evaluation methodology strictly scopes the mutation testing to the specific target medium-complexity class rather than the entire project. The mutation tools are configured to use a curated subset of core mutators (avoiding the `ALL` group) and limit execution to a maximum of 2 threads with strict timeouts. This guarantees runtimes remain under a few minutes per class while maintaining the laptop's responsiveness.

Furthermore, GPT-4o API pricing ($5/1M input, $15/1M output tokens) presents a financial constraint for university students in Vietnam when converting USD to VND. To address this, the development and debugging of the automation scripts will initially be conducted using `gpt-4o-mini`, which is over 95% cheaper. The evaluation pipeline also implements a local caching mechanism to ensure that test outputs for identical prompts are never fetched from the API twice. The `gpt-4o` model will be exclusively reserved for the final evaluation run, keeping the total API cost strictly manageable within the project budget.
