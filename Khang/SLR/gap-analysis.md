# GAP Analysis - LLM for Unit Test Case Generation

Evidence table: N = 16 papers | Source: Google Scholar | Date: 2026-06-05

## GAP Table

| Evidence column | Finding | GAP type | Counter-evidence check |
| --- | --- | --- | --- |
| **Tool/LLM** | The included studies already cover ChatGPT, GPT-3.5, GPT-4o, Codex, DeepSeek, Gemini, Claude, LLaMA, fine-tuned DeepSeek, and multi-LLM pipelines. | GAP-T | Not selected as primary because GPT-family models appear in GS010, GS022, GS024, GS028, GS051, GS080, GS089, and GS118. |
| **Dataset / Comparison** | No included study uses a paired setup with the same medium-complexity Java/Python units, GPT-4/GPT-4o tests, and student-written coursework/assignment tests. | GAP-D | All 16 papers were checked; none compares against student coursework tests. |
| **Metric** | Coverage is more common than mutation score; GS005 shows that a suite can reach 100% coverage but only 4% mutation score. | GAP-M | 7/16 papers include mutation-related evidence: GS005, GS017, GS022, GS024, GS025, GS051, and GS089. |
| **Limitations** | Several papers report limitations around generalization, correctness/compilability, benchmark realism, or pipeline complexity. | GAP-S | Supports GAP-D/GAP-M, but is not selected as primary. |

## Primary GAP: GAP-D

No included study evaluates GPT-4/GPT-4o-generated unit tests against student-written coursework/assignment tests on the same medium-complexity Java/Python functions/classes. This study operationalizes medium complexity as approximately CC = 5-15 where measurable.

This is the primary GAP because Khang's RQ needs an academic student baseline, not only a benchmark, automated-tool baseline, or professional-developer baseline.

## Secondary GAP: GAP-M

The experiment must evaluate both branch coverage and mutation score. GS005 is the key evidence: some test suites reached 100% coverage but only 4% mutation score, so branch coverage cannot replace mutation score.

## Counter-Evidence Check - Primary GAP

GAP checked: No paper among the 16 included studies compares GPT-4o-generated tests with student-written coursework tests on the same medium-complexity Java/Python code units.

| Paper | Does it already address this GAP? | Short note |
| --- | --- | --- |
| GS005 | No | MUTGEN plus EvoSuite/vanilla prompts; no student baseline. |
| GS009 | No | HumanEval and SF110 Java; no paired student-written coursework/assignment tests. |
| GS010 | No | ChatGPT/ChatTester evaluated for compilability/correctness; no student baseline. |
| GS017 | No | Reports 30.22% branch coverage and 40.21% mutation score on ULT; no student-written coursework/assignment tests. |
| GS019 | No | TestPilot on npm packages with Nessie; outside the Java/Python student-baseline setting. |
| GS022 | No | ChatGPT GPT-4o/DeepSeek on six Defects4J classes with PIT; no student baseline. |
| GS024 | No | Uses programming assignments and 1,296 submissions to evaluate generated tests for assignment assessment; it does not compare GPT-vs-student test-suite quality. |
| GS025 | No | Fine-tuned DeepSeek on seven Python projects; no GPT-4/GPT-4o vs student coursework/assignment baseline. |
| GS026 | No | ChatGPT-3.5 compared with Pynguin/pre-existing tests; not a GPT-4/GPT-4o paired student comparison. |
| GS028 | No | ChatGPT vs EvoSuite/SBST on 207 Java classes; baseline is an automated tool. |
| GS051 | No | Multi-LLM chaining with GPT-4o/Gemini/Claude and Randoop; no student baseline. |
| GS080 | No | Large-scale prompt engineering on Defects4J/SF110/CMD; no paired student-written coursework/assignment tests. |
| GS089 | No | AgoneTest compares with professional human-written tests from Classes2Test; not paired student coursework tests. |
| GS118 | No | Meta pipeline improves existing human-written tests; baseline is repository code/professional developers, not student coursework/assignment tests. |
| GS163 | No | Industry Java projects and developer study; baseline is professional developers, not student coursework tests. |
| GS206 | No | ReAct/Reflexion Java pipeline on Apache Commons; no student baseline. |

### AgoneTest (GS089) Distinction

AgoneTest compares LLM-generated tests with human-written tests from open-source Java projects in the Classes2Test dataset. Those tests are professional-developer artifacts, not paired student coursework or assignment submissions. Therefore, GS089 does not refute the primary GAP.

**Conclusion:** The primary GAP is confirmed. No included paper refutes GAP-D after the scope is narrowed to paired GPT-4o-vs-student coursework comparisons on medium-complexity Java/Python units.

## Counter-Evidence Check - Secondary GAP

| Paper | Role | Note |
| --- | --- | --- |
| GS005 | Supports | Reports a case with 100% coverage but only 4% mutation score. |
| GS017 | Supports | Reports both branch coverage at 30.22% and mutation score at 40.21% on ULT. |
| GS022 | Supports | Reports mutation coverage and mutation score for ChatGPT GPT-4o and DeepSeek. |
| GS024 | Supports | Reports statement coverage and mutation score improvement. |
| GS025 | Supports | Reports line coverage, branch coverage, and mutation score. |
| GS051 | Supports | Reports branch/line coverage and mutation coverage. |
| GS089 | Supports | Reports branch/line/method coverage and mutation score on Classes2Test. |

**Conclusion:** GAP-M is valid as a secondary GAP and must be reflected in the design.

## Feasibility Check - Primary GAP

| Criterion | Level | Note / mitigation |
| --- | --- | --- |
| **Dataset** | Warning | Curate paired student-written coursework/assignment tests; downscope to one language and 10-20 units with CC = 5-15 where measurable. |
| **Tool/API** | Warning | GPT-4/GPT-4o may require budget; if blocked, use GPT-4o mini and record the amendment. |
| **Compute** | Safe | Branch coverage and mutation testing can run on CPU for a small dataset. |
| **Ground truth** | Safe | Student-written coursework/assignment tests are comparison artifacts; quality is measured by automated metrics. |
| **Skills** | Safe | Java: JaCoCo/PIT. Python: coverage.py/mutmut or Cosmic Ray. |
| **Time** | Safe | Scope can be controlled with 10-20 units, one model config, and one language if needed. |
| **Contribution** | Safe | Negative results still have value because they establish a paired GPT-vs-student baseline absent from the evidence table. |

**Result:** 0 blockers / 2 warnings. The primary GAP is feasible after downscoping.

## Final GAP Statement

Existing evidence evaluates LLM-generated unit tests across benchmarks, automated-tool baselines, prompt strategies, and industrial pipelines, but it does not provide a paired comparison between GPT-4o-generated tests and student-written coursework/assignment tests on the same medium-complexity Java/Python units. This study addresses that dataset/comparison gap using branch coverage and mutation score as dual metrics.
