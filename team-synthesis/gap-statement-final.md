# Final Gap Statement

Main source: `team-synthesis/evidence-table-merged.md`.

## Evidence Count

| Evidence group | Count in 30 unique papers | Interpretation |
| --- | ---: | --- |
| Papers using coverage/code coverage/branch coverage | 22/30 | Coverage is the most common metric in the extracted papers. |
| Papers using mutation score/mutation testing/mutant information | 10/30 | Mutation appears less often than coverage and is usually tied to feedback or mutation-guided methods. |
| Papers comparing against human/developer-written tests | 2/30 | These papers are close to a human baseline, but they do not match the SE1944 student-written baseline. |
| Papers directly comparing against student-written tests | 0/30 | This is the clearest gap relative to the team's project. |
| Papers directly controlling medium cyclomatic complexity CC=5-15 | 0/30 | Some papers discuss complexity or complex methods, but they do not use the team's exact population. |
| Papers evaluating both branch coverage and mutation score on GPT-4/GPT-4o | Present but scattered | Strong papers often use benchmark/tool-specific settings without a student baseline. |

## Main Gap

Existing studies on LLM-based unit test generation mainly report structural coverage or improvements in pass/compile rate. A smaller subset uses mutation score to evaluate fault-detection ability. However, the literature still has almost no study that evaluates GPT-4/GPT-4o-generated unit tests on the same medium-complexity Java/Python functions while measuring both branch coverage and mutation score and directly comparing the results with student-written tests.

## Secondary Gaps

| Gap | Evidence from the merged table | Meaning for SE1944 |
| --- | --- | --- |
| Metric gap | 22/30 papers report coverage, but only 10/30 report mutation score or mutation testing. | Coverage alone is not enough to show that a test suite can detect real faults. |
| Comparison gap | 2/30 papers include a human/developer-written comparison; 0/30 include a student-written comparison. | The SE1944 project has a clear contribution through the student baseline. |
| Dataset/complexity gap | 0/30 papers control the exact medium CC=5-15 setting; some use simple benchmarks while others use complex repositories. | The team needs a function-level dataset with medium cyclomatic complexity. |
| Method gap | High scores often require feedback loops, chaining, slicing, mutation guidance, or coverage guidance. | The experiment must document the prompt and feedback policy instead of simply saying GPT-4. |

## Final Gap Statement

Existing studies show that LLMs can generate useful unit tests, especially when supported by feedback loops, method slicing, or mutation guidance. However, the literature lacks a direct evaluation of GPT-4/GPT-4o-generated unit tests against student-written tests on the same medium-complexity Java/Python functions using both branch coverage and mutation score as outcome metrics.

## Team Research Direction

The team will address this gap by selecting the same set of medium-complexity Java/Python functions, generating unit tests with GPT-4/GPT-4o, collecting student-written tests for the same functions, and comparing the results using branch coverage, mutation score, and compile/pass status.
