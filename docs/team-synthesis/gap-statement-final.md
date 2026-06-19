# Gap Statement Final - LLM for Unit Test Case Generation

Evidence table: N = 39 papers from the merged team evidence table (`team-synthesis/evidence-table-merged.md`).

## 1. Member Gap Synthesis

| Member evidence | Main gap proposed | How it is used in the team gap |
| --- | --- | --- |
| Le-The-Khang | GAP-D: no paired GPT-4o-mini vs student benchmark tests on Java units; GAP-M: coverage alone is insufficient. | Adopted as the team primary GAP-D and secondary GAP-M. |
| pham-an-khang | GAP-D / scale: lack of robust paired comparison with student-written tests on Java code; automated-tool baselines dominate. | Adopted as supporting evidence for primary GAP-D. |
| Phuoc | GAP-D / comparison: no student benchmark test baseline; GAP-M: dual adequacy criteria. | Adopted, but metric threshold values are normalized to the current team evidence. |
| Nhu-Y | GAP-M: mutation score is not consistently used as a primary fault-detection metric; prompt/pipeline settings are inconsistent. | Retained as secondary GAP-M, not primary, because the team RQ is dataset/comparison-driven. |
| Do Long Vy | GAP-D: student benchmark baselines are unstudied in paired comparisons; GAP-M: branch coverage alone causes semantic blindness. | Adopted as supporting evidence for primary GAP-D and secondary GAP-M. |

Team decision: the final team GAP is not a pure Tool/LLM gap. GPT-family models, including GPT-4/GPT-4o variants, already appear in the literature. The stronger unresolved gap is the missing paired comparison: GPT-4o-mini-generated tests versus student-written benchmark tests on the exact same Java units.

## 2. GAP Table

| Evidence column | Finding from merged evidence | GAP type | Team decision |
| --- | --- | --- | --- |
| Tool/LLM | The merged table already includes ChatGPT, GPT-3.5, GPT-4, GPT-4o, GPT-4o-mini, Codex, DeepSeek, Gemini, Claude, LLaMA, multi-agent pipelines, and fine-tuned models. Rows 004, 017, 023, 024, and 036 explicitly involve GPT-4o or GPT-4o-family settings. | GAP-T | Not selected as primary. Tool coverage is broad enough; the issue is not simply that GPT-4o has never been used. |
| Dataset / comparison baseline | Only row 009 is directly educational/programming-assignment-related, and it does not provide the target paired comparison between GPT-4o-mini-generated test suites and student-written benchmark test suites on the exact same Java functions. Rows in the literature often use automated tools (EvoSuite) or general statistics, but do not directly contrast GPT-4o-mini against the student benchmark baseline on these exact Java classes. | GAP-D | Selected as the primary GAP. |
| Metric | Coverage-like metrics appear in 35/39 rows, while mutation/mutant-related metrics appear in 22/39 rows. Rows 010 and 026 show why mutation score is needed beside branch coverage: high coverage does not guarantee fault-detection strength. | GAP-M | Selected as the secondary GAP. |
| Shared limitations | Several rows report benchmark simplicity, data leakage, compilation failures, high API cost, test smells, or limited generalizability. These limitations support GAP-D and GAP-M but are not a separate primary research direction. | GAP-S | Used as supporting rationale only. |

## 3. Primary GAP: GAP-D - Dataset and Student Benchmark Baseline

Current LLM-based unit-test-generation studies evaluate models on public benchmarks, open-source repositories, industrial code, or automated-tool baselines. However, the merged evidence table does not contain a study that directly evaluates GPT-4o-mini-generated unit tests against student-written benchmark unit tests on the exact same Java functions from the HumanEval-Java benchmark.

This is the primary gap because the team's intended contribution is a direct, paired evaluation. The central question is not only whether GPT-4o-mini can generate tests, but whether those generated tests are competitive with student-written benchmark tests on the same code units under the same measurement pipeline.

Key supporting evidence:

| Evidence row | What it contributes | Why it does not close the primary GAP |
| --- | --- | --- |
| 009 | Uses real programming assignments and student submissions. | It evaluates generated tests in an assignment-assessment setting, but not a paired GPT-vs-student-written-test-suite comparison on Java functions. |
| 010 | Provides real-world function benchmark evidence and key threshold references: 30.22% branch coverage and 40.21% mutation score on ULT. | It benchmarks LLMs on ULT/PLT/TestEval, not a paired student benchmark comparison. |
| 017 | Evaluates ChatGPT GPT-4o and DeepSeek using mutation testing on Java classes with different complexity levels. | It uses six Defects4J classes and no paired student baseline. |
| 024 | Includes student-written tests in Classes2Test. | The baseline is professional/open-source student-written tests, but not paired in the HumanEval-Java context. |
| 026 | Shows coverage can be misleading because some suites reached 100% coverage but only 4% mutation score. | It is mutation-guided generation against automated baselines, not a student-baseline comparison. |

## 4. Secondary GAP: GAP-M - Dual Metric Evaluation

The merged evidence supports branch/line/statement coverage as common evaluation metrics, but coverage alone is not sufficient for judging test quality. Mutation score must be included because a test suite can execute code paths without detecting faults.

The team therefore retains GAP-M as a secondary gap: the experiment should use both branch coverage and mutation score, with compile/pass status reported before interpreting either metric.

Metric design implications:

| Metric decision | Evidence basis | Team use |
| --- | --- | --- |
| Branch coverage threshold | Row 010 reports 30.22% average branch coverage on ULT. | Use >= 30.22% as the primary branch-coverage threshold. |
| Mutation score floor | Row 026 reports the warning case where 100% coverage can pair with only 4% mutation score. | Use >= 4.0% as a strict mutation-score floor. |
| Mutation score target | Row 010 reports 40.21% average mutation score on ULT. | Use >= 40.21% as a stronger reference target, not as the only pass/fail floor. |
| Paired comparison | The team GAP requires the same target functions for GPT-generated and student-written tests. | Compare paired differences for branch coverage and mutation score. |

## 5. Counter-Evidence Check

Claim checked: No row in the merged evidence table fully addresses the team primary GAP, defined as a paired comparison of GPT-4o-mini-generated unit tests versus student benchmark unit tests on the same Java functions, evaluated with branch coverage and mutation score.

| Row | Already closes GAP-D? | Counter-evidence note |
| ---: | --- | --- |
| 001 | No | Fine-tuned DeepSeek on open-source Python projects; no student-written baseline. |
| 002 | No | Survey/background literature; no paired experiment. |
| 003 | No | Java ReAct/Reflexion pipeline on Apache Commons; no student-written baseline. |
| 004 | No | GPT-4o appears in multi-LLM chaining, but evaluation uses HumanEval/Randoop-style baselines, not student tests. |
| 005 | No | TestPilot on npm packages with Nessie/existing tests; outside Java/Python student-baseline scope. |
| 006 | No | ChatGPT capability study; no paired student comparison. |
| 007 | No | CoT and coverage feedback; no student-written baseline. |
| 008 | No | Industrial Meta setting augments existing tests; not student coursework tests. |
| 009 | Partial | Closest education-related row, but it does not compare GPT-4o-generated suites against student-written suites on the same CC-filtered Java/Python units. |
| 010 | Partial | Strong benchmark/threshold evidence, but no student-written baseline. |
| 011 | No | ChatGPT vs EvoSuite/SBST on Java classes; automated-tool baseline. |
| 012 | No | Tool paper; no paired student comparison. |
| 013 | No | In-context example semantics on Defects4J/industrial code; no student baseline. |
| 014 | No | Codex/SBST on Python benchmarks/open-source repositories; no student baseline. |
| 015 | No | Pre-trained LLM test generation; no paired student baseline. |
| 016 | No | ChatGPT/ChatTester improvement; no student-written baseline. |
| 017 | Partial | GPT-4o and mutation testing are relevant, but dataset is six Defects4J classes with no student baseline. |
| 018 | No | ChatGPT-3.5 vs Pynguin/pre-existing tests on Python programs; not GPT-4o vs student tests. |
| 019 | No | Multi-agent JUnit generation; compares with automated/human-style references, not student coursework tests. |
| 020 | No | Static-analysis prompt framework on open-source Java projects; no student baseline. |
| 021 | No | Python unit-test generation; no student-written baseline. |
| 022 | No | Long-method decomposition; no student-written baseline. |
| 023 | No | Iterative feedback loops on HumanEval-X; no student-written baseline. |
| 024 | Partial | Student-written baseline exists, but it is professional/open-source Classes2Test, not student-written coursework tests. |
| 025 | No | AgoneTest/Classes2Test; no student-written coursework baseline. |
| 026 | No | Mutation-guided generation and automated baselines; no student-written baseline. |
| 027 | No | Metadata incomplete in merged table; cannot close GAP-D. |
| 028 | No | Metadata incomplete in merged table; Methods2test/Defects4J setting, no student baseline shown. |
| 029 | No | Metadata incomplete in merged table; Defects4J/non-standalone methods, no student baseline shown. |
| 030 | No | Path-sensitive prompting for Java/Python branch-heavy functions; no student baseline. |
| 031 | No | Evaluation-metric discussion/background; no paired experiment. |
| 032 | No | Mutation-guided/mutant-information generation; no student baseline. |
| 033 | No | Large-scale prompt-engineering study; no student-written baseline and no clear CC = 5-15 paired comparison in the merged row. |
| 034 | No | Survey/background paper; no paired experiment. |
| 035 | No | Industry/developer study; developer baseline is not student-written coursework tests. |
| 036 | No | TestSpark/SBST/Kex comparison on GitBug Java; no student baseline. |
| 037 | No | Generative AI tool comparison; no student-written baseline. |
| 038 | No | HumanEval and SF110 Java benchmarks; no student-written baseline. |
| 039 | No | Open-source Java projects with medium-complexity note; no paired student baseline. |

Conclusion: GAP-D is confirmed against the current merged evidence table. Rows 009, 010, 017, 024, 026, and 039 are the closest partial counter-evidence, but none combines all required elements: GPT-4o, student-written tests, same Java/Python units, medium CC = 5-15, branch coverage, and mutation score.

## 6. Feasibility Check - Primary GAP

| Criterion | Level | Note / mitigation |
| --- | --- | --- |
| Dataset | Safe | Utilizing 50 Java functions from the HumanEval-Java benchmark. |
| Tool/API | Warning | GPT-4o-mini access may require rate-limit planning. Run a small pilot first and log model version, date, prompt, and temperature. |
| Compute | Safe | Coverage and mutation testing can run locally on CPU. Java can use JaCoCo and PIT. |
| Ground truth | Safe | Student benchmark tests are comparison artifacts, not manual labels. Their quality is measured by the same automated metrics. |
| Skills | Safe | The pipeline uses standard unit-test, coverage, and mutation-testing tools. |
| Time | Safe | Scope is highly feasible with 50 functions, one model configuration, and a fixed zero-shot prompt. |
| Contribution | Safe | Even negative results are useful because the current evidence lacks a paired GPT-4o-mini-vs-student benchmark baseline. |

Result: 0 blockers / 1 warning. The primary GAP is highly feasible with controlled scope.

## 7. Final GAP Statement

Existing evidence shows that LLMs can generate unit tests across public benchmarks, open-source repositories, industrial code, and automated-tool comparisons, and many studies report coverage or mutation-related metrics. However, the current literature does not provide a paired comparison between GPT-4o-mini-generated unit tests and student-written benchmark unit tests on the same Java functions from the HumanEval-Java benchmark. This study addresses that dataset/comparison gap by evaluating both test sources on identical code units using branch coverage and mutation score, with compile/pass status reported as a prerequisite for valid metric interpretation.
