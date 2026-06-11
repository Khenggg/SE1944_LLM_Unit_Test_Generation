# Gap Statement - LLM for Unit Test Generation

Evidence table: N = 16 final included papers

## Summary from Evidence Table

From the 16 final included papers:

- 16/16 papers evaluate LLM-based unit test generation, unit test improvement, or generated-test evaluation with concrete numeric results.
- 12/16 papers report coverage-related metrics such as statement, line, branch, code coverage, or coverage increase: GS005, GS009, GS017, GS019, GS024, GS025, GS028, GS051, GS089, GS118, GS163, GS206.
- 7/16 papers report mutation-related metrics or mutation feedback: GS005, GS017, GS022, GS024, GS025, GS051, GS089.
- Several papers compare LLM-based methods against automated tools such as EvoSuite, Pynguin, Randoop, Nessie, or vanilla-prompt baselines: GS005, GS019, GS026, GS028, GS051.
- No paper in the evidence table directly compares GPT-4o (gpt-4o-2024-05-13) generated unit tests against student-written coursework/assignment tests on the same medium-complexity Java/Python functions/classes.

## GAP-T - Tool/LLM Gap

The Tool/LLM column shows prior work on ChatGPT, GPT-3.5, GPT-4o, Codex, DeepSeek, Gemini, Claude, LLaMA, fine-tuned DeepSeek, and multi-agent or multi-LLM pipelines. However, the table does not provide a controlled experiment focused on GPT-4o (gpt-4o-2024-05-13) generated unit tests versus student-written coursework tests on the same Java/Python functions/classes.

Evidence: GS022 evaluates ChatGPT GPT-4o and DeepSeek on six Java classes; GS051 evaluates Gemini -> GPT-4o chaining on HumanEval JUnit tests; GS028 compares ChatGPT with EvoSuite; none uses student-written coursework tests as the direct comparison baseline.

## GAP-D - Dataset Gap

The Dataset column shows benchmarks and contexts such as HumanEval/SF110, ULT real-world Python functions, Defects4J, npm packages, programming assignments, open-source Python projects, Meta production code, and Apache Commons. The evidence does not provide a paired dataset of medium-complexity Java/Python functions/classes, approximately CC = 5-15 where measurable, with both student-written coursework/assignment tests and GPT-generated tests for the same units.

Evidence: GS017 uses 3,909 real-world Python tasks but compares benchmarks, not student-written coursework/assignment tests; GS024 uses programming assignments and 1,296 submissions but evaluates generated tests for assessment/bug detection, not a paired GPT-vs-student test quality comparison; GS028 uses 207 Java classes but compares ChatGPT with EvoSuite. AgoneTest (GS089) compares against professional human-written tests from open-source repositories (CLASSES2TEST), not student-written coursework tests.

## GAP-M - Metric Gap

Coverage is commonly reported, but coverage alone is not enough. GS005 explicitly shows some suites can reach 100% coverage but only 4% mutation score, so mutation score is needed alongside branch/statement coverage. A dual-metric design using branch coverage and mutation score is better supported by the evidence than a coverage-only design.

Evidence: GS017 reports both branch coverage 30.22% and mutation score 40.21% on ULT; GS025 reports up to 83.3% branch coverage and 78.9% mutation score; GS022 reports ChatGPT mutation score 87.11%; GS051 reports 99.05% branch coverage and 94.32% mutation coverage; GS089 reports 41.9% branch coverage and 44.5% mutation score (zero-shot gpt-4o-mini) on Classes2Test.

## GAP-S - Shared Limitation Gap

Multiple papers report limitations around generalization, generated-test correctness, dataset realism, or pipeline complexity:

- GS009: high coverage on HumanEval did not transfer to EvoSuite SF110, where no model exceeded 2% coverage.
- GS017: existing benchmarks may be contaminated or too simple; ULT produces much lower LLM performance.
- GS026: ChatGPT-3.5 averaged below 28% overall and performed better only on simpler Python programs.
- GS080: compilation failure rates reached up to 86% in a large-scale setting.
- GS118 and GS206: stronger results depend on industrial filtering or complex multi-stage pipelines.

## Proposed Contribution

This study will evaluate GPT-4o (gpt-4o-2024-05-13) generated unit tests for medium-complexity Java/Python functions/classes using both branch coverage and mutation score, then compare the generated tests with student-written coursework/assignment tests for the same code units. The student-written coursework/assignment tests are the main comparison baseline, while literature-backed thresholds are used for absolute adequacy checks.

For RBL-1/RBL-2 threshold design, use branch coverage >= 30.22% from the directly usable GS017 branch-coverage evidence and mutation score >= 4% from GS005 as the strict mutation-score floor. GS017's 40.21% mutation score on ULT remains a stronger secondary reference target, but it should not replace the strict mutation floor because GS005 provides a lower mutation-score value in the included evidence.
