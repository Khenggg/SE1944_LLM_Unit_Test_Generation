# Gap Statement – LLM for Unit Test Case Generation
Evidence table: N = 12 papers | Date: 2026-06-03

## Summary from Evidence Table
From the 12 final included papers:
- 12/12 papers evaluate LLM-based unit test generation.
- 12/12 papers explicitly include GPT-family models (GPT-4, GPT-3.5, GPT-4o, GPT-4o-mini).
- 11/12 papers evaluate structural adequacy through branch/line/statement coverage.
- 12/12 papers explicitly evaluate mutation score or mutant coverage.
- 1/12 papers (SS032) uses student-written tests as a baseline, but there is a lack of large-scale direct comparison against student-written tests on the same source code.
- 12/12 papers focus on Java and/or Python (most evaluate Java exclusively, while a small subset (SS040, SS137) includes Python benchmarks).

## Identified Gaps

### GAP-T (Technology): Lack of isolated evaluation of GPT-4o against student-written tests.
**Evidence:** While all 12/12 papers employ LLMs, most studies such as SS040 and SS109 only compare GPT-4o's performance against traditional automated tools (like EvoSuite or Randoop) instead of directly comparing it with student-written tests on the same codebase.

### GAP-M (Metric): Lack of comprehensive test quality assessment.
**Evidence:** Although structural adequacy (11/12 papers) and mutation score (12/12 papers) are prevalent functional metrics, only 1 study (SS139) assesses critical code quality metrics like test smells or test readability alongside these functional metrics. Currently, only SS139 addresses test smells.

### GAP-D (Dataset): Lack of evaluation on medium cyclomatic complexity functions.
**Evidence:** The datasets used in most studies evaluate overly simple, purely algorithmic functions (like [HumanEval](https://github.com/openai/human-eval) in SS014 and SS137) or general bug-finding datasets (like [Defects4J](https://github.com/rjust/defects4j) in SS047 and SS174) without explicitly categorizing structural complexity. Only SS080 mentions cyclomatic complexity, but it does so on an extremely small scale (only 6 classes).

### GAP-S (Scale): Limited scale of direct human comparison.
**Evidence:** Only 1 study (SS032) possesses a paired-comparison dataset evaluating against student-written test cases, but its scale is limited to only 6 assignments, which is inadequate to fully evaluate GPT-4o's test generation capability in a controlled environment.

## Final GAP Statement
Existing evidence evaluates LLM-generated unit tests across benchmarks and automated tool baselines, but it does not provide a paired comparison between GPT-4o-generated tests and student-written tests on the same medium-complexity Java/Python units. This study will address that gap using branch coverage and mutation score as dual quality metrics.
