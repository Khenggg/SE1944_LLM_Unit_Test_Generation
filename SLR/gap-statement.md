# Gap Statement – LLM for Unit Test Case Generation
Evidence table: N = 12 papers

## Summary from Evidence Table
From the 12 final included papers:
- 12/12 papers evaluate LLM-based unit test generation.
- 12/12 papers explicitly include GPT-family models (GPT-4, GPT-3.5, GPT-4o, GPT-4o-mini).
- 11/12 papers evaluate structural adequacy through branch/line/statement coverage.
- 12/12 papers explicitly evaluate mutation score or mutant coverage.
- 2/12 papers use developer-written tests as a baseline, but there is a lack of large-scale direct comparison against student/human-written tests on the same source code.
- 12/12 papers focus on Java/Python (all 12 focus on Java, only 1 focuses on Python).

## Identified Gaps

### GAP-T (Technology): Lack of isolated evaluation of GPT-4 against human-written tests.
**Evidence:** While all 12/12 papers employ LLMs like GPT-4, most studies (such as SS040 and SS109) only compare GPT-4's performance against traditional automated tools (like EvoSuite or Randoop) instead of directly comparing it with actual developer-written test cases on the same codebase.

### GAP-M (Metric): Lack of comprehensive test quality assessment.
**Evidence:** Although structural adequacy (11/12 papers) and mutation score (12/12 papers) are prevalent functional metrics, very few studies assess critical code quality metrics like test smells or test readability alongside these functional metrics. Currently, only SS139 addresses test smells.

### GAP-D (Dataset): Lack of evaluation on medium cyclomatic complexity functions.
**Evidence:** The datasets used in most studies (such as SS014, SS040, and SS109) evaluate overly simple, purely algorithmic functions (like HumanEval) or general bug-finding datasets (like Defects4J) without explicitly categorizing structural complexity. Only SS080 mentions cyclomatic complexity, but it does so on an extremely small scale (only 6 classes).

### GAP-S (Limitation): Limited scale of direct human comparison.
**Evidence:** Very few studies possess a large enough paired-comparison dataset to adequately evaluate GPT-4's test generation capability directly against test cases manually authored by human developers in a controlled environment.

## Final GAP Statement
Existing evidence evaluates LLM-generated unit tests across benchmarks and automated tool baselines, but it does not provide a paired comparison between GPT-4-generated tests and student/developer-written tests on the same medium-complexity Java/Python units. This study will address that gap using branch coverage and mutation score as dual quality metrics.
