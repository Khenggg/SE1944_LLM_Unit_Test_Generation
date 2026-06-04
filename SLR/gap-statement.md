# Gap Statement - Phuoc OpenAlex

## Summary from Evidence Table

From the 7 OpenAlex final included papers:

- 7/7 papers evaluate LLM-based unit test generation.
- 5/7 papers explicitly evaluate GPT-family or OpenAI Codex models (including GPT-4).
- 7/7 papers evaluate structural test adequacy through code/line/branch coverage.
- 7/7 papers evaluate mutation testing or mutation score.
- 3/7 papers evaluate against a human baseline (developer-written or reference test suites), but none directly compares against student-written manual unit tests.
- 7/7 papers focus on Java/Python codebases.

## GAP-M - Metric Gap

The `Metric` and `Kết quả` columns show that while branch/statement coverage is widely measured, mutation score is often treated as a secondary metric or auxiliary evaluation. This represents a significant gap because branch coverage alone does not guarantee the strength of the generated assertions. A dual evaluation assessing both structural coverage (branch coverage ≥ 70%) and fault-detection capability (mutation score ≥ 35.3%) concurrently is missing.

## GAP-D - Dataset Gap

The `Dataset` column reveals that existing evaluations rely heavily on generic benchmarks (like Defects4J, HumanEval, MBPP) or large repository-scale codebases. There is an absence of empirical studies focusing systematically on code of medium cyclomatic complexity (CC=5–15) to understand how complexity thresholds affect LLM unit test quality.

## GAP-C - Comparison Gap

The `Dataset` and `Kết quả` columns show comparisons are primarily made against search-based testing tools (like EvoSuite and Pynguin) or professional developer reference tests. Direct comparison evaluating GPT-4 against the manual testing capabilities of software engineering students (academic/capstone baseline) is completely unaddressed.

## Proposed Contribution

This study will evaluate GPT-4-generated unit tests for medium-complexity Java/Python functions using both branch coverage and mutation score, then compare the generated tests with student-written tests for the same code.
