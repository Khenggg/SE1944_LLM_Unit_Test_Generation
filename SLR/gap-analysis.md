# GAP Analysis - LLM Unit Test Generation

Evidence table: N = 7 papers | Date: 2026-06-03

## GAP Table

| Column | Finding | GAP Type | Counter-evidence Check |
| --- | --- | --- | --- |
| Tool/LLM | The evidence includes ChatGPT, Codex, GPT-3.5-Turbo, GPT-4o, DeepSeek, Gemini, Davinci, and LLM-based repair/generation frameworks. A pure technology gap is weak because GPT-family models and LLM-agent frameworks are already represented. | GAP-T | Checked 7 papers; not selected as primary because GS001, GS022, GS030, GS046, and GS057 already cover GPT-family or LLM-agent test generation. |
| Dataset | Existing datasets are small custom Python methods, Java benchmark classes, HumanEval/SF110, HPC C++ OpenMP/MPI projects, Defects4J/GrowingBugs-style Java classes, and TestART experimental datasets. None provides a paired setup where the same medium-complexity Java/Python units are tested by both GPT-generated tests and student-written tests. | GAP-D | Checked 7 papers; confirmed as primary GAP. |
| Metric | Coverage is common, but mutation score is less consistent. GS001, GS046, and GS057 explicitly report mutation-related evaluation; GS030 provides a direct ChatGPT-3.5 branch coverage floor value. | GAP-M | Checked 7 papers; selected as secondary GAP. |
| Limitation | At least 5/7 papers report dataset scope, transfer, validity, generation-overhead, compilation, test-smell, or agent-loop cost limitations. | GAP-S | Checked 7 papers; supports the dataset/feasibility argument but is not primary. |

## Primary GAP: GAP-D

No included Google Scholar study evaluates GPT-4/GPT-4o-generated unit tests on the same medium-complexity Java/Python functions/classes that also have student-written tests. This leaves a dataset and comparison gap for measuring whether LLM-generated tests match or exceed realistic student-written unit tests under the same code targets.

## Secondary GAP: GAP-M

Branch/code coverage appears in most included papers, but mutation score appears in fewer papers. A dual-metric evaluation with both branch coverage and mutation score is still useful because coverage measures path exercise while mutation score measures fault-detection strength.

## Counter-evidence Check - Primary GAP

GAP statement: No included paper evaluates GPT-4/GPT-4o-generated unit tests on paired medium-complexity Java/Python code units with student-written tests for the same units.

| Paper | Already Done? | Notes |
| --- | --- | --- |
| GS001 - Impact of code context and prompting strategies (2026) | No | Uses 12 custom Python methods and a software practitioner baseline, but not student-written tests for the same code and not a medium-complexity paired student dataset. |
| GS017 - ChatGPT vs SBST (2024) | No | Compares ChatGPT with EvoSuite/SBST on 207 Java classes, not with student-written tests. |
| GS022 - Using LLMs to Generate JUnit Tests (2024) | No | Uses HumanEval and EvoSuite SF110 Java benchmarks; no student-written baseline for the same classes. |
| GS030 - Harnessing the Power of LLMs for HPC unit tests (2024) | No | Uses ChatGPT-3.5 and Davinci for HPC/C++ OpenMP/MPI projects and reports line/branch coverage against original project tests, but not GPT-4/GPT-4o on paired medium-complexity Java/Python coursework units with student-written tests. |
| GS046 - ChatGPT vs DeepSeek mutation testing (2025) | No | Evaluates GPT-4o and DeepSeek on six Defects4J Java classes with mutation testing, but no student-written tests. |
| GS011 - TestART (2024) | No | Evaluates an LLM-based generation/repair method against baseline models/EvoSuite; no student-written/manual-test baseline. |
| GS057 - Test vs Mutant (2026) | No | Evaluates AdverTest on Defects4J and GrowingBugs with explicit branch coverage and mutant feedback, but it does not compare GPT/GPT-4o-generated tests with student-written tests on the same medium-complexity units. |

Conclusion: Confirmed. No counter-evidence in the 7-paper evidence table invalidates the primary GAP.

## Feasibility Check - Primary GAP

| Criterion | Level | Notes |
| --- | --- | --- |
| Dataset | Warning | A paired student-test dataset must be built from course assignments or a small curated set of Java/Python functions. Downscope to one language and 10-20 functions. |
| Tool/API | Warning | GPT-4/GPT-4o access may require API budget. Mitigation: use GPT-4o mini if cost becomes a blocker and record the model change. |
| Compute | Safe | Branch coverage and mutation testing can run on CPU for a small function/class-level dataset. |
| Ground truth | Safe | Student-written tests serve as the comparison artifact, not manually labeled ground truth. Quality is measured automatically by branch coverage and mutation score. |
| Skills | Safe | The pipeline can use common tools such as JaCoCo/PIT for Java or coverage.py/mutmut for Python. |
| Time | Safe | The scope is already downscoped to one language first and N = 10-20 units, which keeps the experiment small enough for RBL/proposal timing. |
| Contribution | Safe | Even negative results are useful because the study establishes a realistic student-test comparison baseline. |

Result: 0 blocker / 2 warnings. This GAP is feasible after downscoping. Recommended scope: one language first, 10-20 medium-complexity units, automated branch coverage and mutation score, and student-written tests collected from available coursework or team-authored baseline tests.

## Final GAP Statement

Existing Google Scholar evidence evaluates LLM-generated unit tests across benchmarks and tool baselines, but it does not provide a paired comparison between GPT-4/GPT-4o-generated tests and student-written tests on the same medium-complexity Java/Python units. This study will address that gap using branch coverage and mutation score as dual quality metrics.
