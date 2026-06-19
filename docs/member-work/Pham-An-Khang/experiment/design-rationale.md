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
| Baseline type | Absolute threshold & Human-level baseline | RQ Objective: Must achieve specific percentages (≥ 30.22% branch, ≥ 40.21% mutation) and directly compare against student-written tests |
| Threshold RQ1 | Branch coverage ≥ 30.22% | Case 2: Based on paper SS040 where LLMs achieve an average of 30.22% branch coverage on the UnLeakedTestBench (ULT) |
| Threshold RQ2 | Mutation score ≥ 40.21% (with a ≥ 4.0% floor) | Case 2: Based on paper SS040 reporting an average of 40.21% mutation score, with a 4.0% baseline floor for simple manual test comparisons |
| Pipeline base | Benchmark architecture from SS040 and SS174 | SS040 provides a methodology for comparing real code quality; SS174 utilizes a Mutation-guided feedback loop |
| Temperature | 0 (Zero) | Ensures deterministic test generation for maximum reproducibility across evaluation runs, eliminating creative variations |

## Threshold Rationale

### Branch Coverage Threshold (≥ 30.22%)
Our target is established at ≥ 30.22% branch coverage. This value is derived from the empirical findings of paper SS040 (2026), which evaluates LLMs on the UnLeakedTestBench (ULT) dataset. In their evaluation of unit test generation for real-world complex functions, the overall average branch coverage achieved by state-of-the-art models was 30.22%. Rather than setting an arbitrary or inflated milestone, adopting this empirical average provides a realistic, scientifically grounded baseline to evaluate whether GPT-4o-generated unit tests match or exceed average state-of-the-art automated performance on non-trivial codebases.

### Mutation Score Threshold (Target: ≥ 40.21% | Floor: ≥ 4.0%)
For mutation testing, we establish a target milestone of ≥ 40.21% and a baseline comparison floor of ≥ 4.0%. 
1. **Target Milestone (≥ 40.21%):** According to paper SS040, the average mutation score achieved by models on the ULT dataset is 40.21%. Setting our target at this benchmark allows us to measure whether the intervention achieves typical state-of-the-art semantic fault detection on complex functions.
2. **Baseline Floor (≥ 4.0%):** Standard benchmarks from literature (such as GS005/MutGen) demonstrate a minimal baseline mutation score floor of approximately 4.0% for simple human/student-written tests. This floor serves as a threshold to verify that the generated test suite exhibits non-trivial fault-killing capability when compared to basic human-authored baselines.

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
