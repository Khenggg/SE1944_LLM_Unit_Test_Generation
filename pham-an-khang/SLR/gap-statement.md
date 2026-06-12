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

### GAP-T (Technology): Lack of isolated evaluation of GPT-4o against human-authored baselines.
**Evidence:** The technological evaluation of LLMs for unit test generation is currently saturated with automated comparisons. While all 12 reviewed papers employ LLMs, studies such as SS040, SS109, and SS174 predominantly benchmark GPT-4o's performance against traditional automated generation tools, such as EvoSuite or Randoop. This methodology demonstrates how LLMs perform relative to legacy algorithmic approaches, but it fails to isolate the model's capability to emulate or surpass actual human developers. The literature lacks rigorous, isolated evaluations where the primary technology baseline is human-authored code on a shared codebase.

### GAP-M (Metric): Overreliance on functional metrics while omitting test maintainability indicators.
**Evidence:** The field has established a strong consensus on functional measurement; structural adequacy (branch/line coverage) is utilized in 11/12 papers, and mutation score is evaluated in 12/12 papers. However, functional completeness does not equate to long-term software maintainability. Only 1 out of the 12 studies (SS139) assesses critical code quality metrics such as test smells or test readability alongside these functional outcomes. The omission of maintainability metrics indicates a significant gap in assessing whether LLM-generated tests are practically viable for integration into professional codebases over time.

### GAP-D (Dataset): Lack of evaluation on realistic, medium cyclomatic complexity functions.
**Evidence:** The foundational datasets utilized across the evaluated studies do not accurately represent typical enterprise business logic. Studies predominantly rely on datasets comprising overly simple, purely algorithmic functions ([HumanEval](https://github.com/openai/human-eval) in SS014, SS137) or legacy bug-finding repositories ([Defects4J](https://github.com/rjust/defects4j) in SS047, SS080, SS174). Neither of these datasets categorizes functions by structural complexity. While SS080 acknowledges cyclomatic complexity as an evaluation metric, its methodology is restricted to an exceptionally small sample of only 6 classes. Consequently, there remains a critical gap in large-scale evaluation targeting medium cyclomatic complexity functions, which constitute the majority of real-world software engineering tasks.

### GAP-S (Scale): Limited scale and statistical significance of direct human-authored comparisons.
**Evidence:** To rigorously evaluate the practical quality of LLM-generated unit tests, their performance must be directly benchmarked against tests written by actual human developers. Within the reviewed literature, only 1 study (SS032) possesses a paired-comparison dataset that explicitly evaluates LLM outputs against student-written test cases. However, the experimental scale of SS032 is severely limited to only 6 academic assignments. This restricted sample size is statistically inadequate to formulate generalized, reliable conclusions regarding how GPT-4o's generated test cases compare to human-written equivalents across diverse scenarios.

## Final GAP Statement
Existing evidence thoroughly evaluates LLM-generated unit tests across automated tool baselines and trivial or legacy benchmarks. However, it fails to provide a robust, paired comparison between GPT-4o-generated tests and student-written tests on the same medium-complexity Java/Python units. This study will address the foundational Dataset Gap (GAP-D) and Scale Gap (GAP-S) by conducting a comparative evaluation on medium-complexity functions, using branch coverage and mutation score as dual quality metrics.
