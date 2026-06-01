# GAP Evidence

This file summarizes the research gap derived from `SLR/evidence_table.csv`. It is based on the 15 papers selected in `SLR/03_final_included.csv`.

## Evidence Summary

The selected papers show that LLMs are already being used for unit test generation, but the evidence is fragmented across different languages, metrics, and baselines.

Several studies focus on improving coverage. CodaMosa uses Codex with search-based software testing to escape coverage plateaus. HITS improves Java unit-test coverage through method slicing. TELPA uses program analysis to reach hard-to-cover branches. CAT uses call-chain information for Java projects. These papers show that branch/code coverage is a common and important metric, but they also show that reaching coverage often depends on extra techniques such as search, slicing, program analysis, or project-context extraction.

Several studies show that coverage alone is not enough. MutGen and MuTAP use mutation feedback to improve generated tests. The ChatGPT-vs-DeepSeek mutation-testing study evaluates generated Java unit tests using mutation coverage and mutation score. These papers support using mutation score as a second main metric because a test suite may achieve high structural coverage while still missing fault-detection ability.

Some papers evaluate Java/JUnit directly. HITS, AgoneTest, the initial ChatGPT Java study, TestCTRL, ChatGPT vs SBST, the JUnit empirical study, the ChatGPT-vs-DeepSeek mutation study, CAT, and KTester all provide evidence relevant to Java or Java-like project-level unit testing. However, many of them compare LLMs against automated tools such as EvoSuite, SBST methods, or other LLM configurations rather than against student-written unit tests.

Python studies are also relevant to the current scope. CodaMosa, MuTAP, TELPA, and the code-context/prompting study provide important findings about coverage plateaus, mutation feedback, prompt context, and human/practitioner comparison. These papers support the Python/pytest side of the study and also help explain general LLM unit-test generation limitations.

## Observed Limitations in Existing Studies

- Many studies optimize or report branch/code coverage, but fewer evaluate both branch coverage and mutation score together in the same controlled Java/Python student-comparison setting.
- Several strong methods rely on extra feedback loops, mutation-guided prompting, reinforcement learning, method slicing, call-chain analysis, or program analysis. These are stronger interventions than a simple fixed-prompt GPT-4 setting.
- Existing studies often compare LLM output with EvoSuite, Pynguin, SBST tools, or other LLM models. Direct comparison with student-written unit tests is less represented.
- Some studies show good performance on simple benchmarks but much weaker performance on harder Java benchmarks, especially when code is less toy-like or requires more context.
- Generated tests may compile poorly, contain weak assertions, include test smells, miss boundary cases, or fail semantically even when coverage is acceptable.
- Existing studies are split across languages and tools, so they do not directly answer a unified Java/Python question with student-written tests measured by comparable branch coverage and mutation-score targets.

## Research Gap

Existing work demonstrates that LLMs can generate unit tests and that coverage can often be improved with additional techniques. However, there is still a focused gap for a small, controlled Java/Python study that evaluates GPT-4 generated tests on medium-complexity functions/classes using both branch coverage and mutation score, and compares those results against student-written unit tests for the same code.

This gap is important because branch coverage and mutation score measure different aspects of test quality. Branch coverage shows whether test inputs execute decision paths, while mutation score gives stronger evidence about fault-detection ability. The reviewed papers repeatedly show that coverage alone can be misleading, so the current project should not rely only on structural coverage.

The student-written baseline is also important. Many reviewed papers compare against automated tools or other LLMs, but the project question is educational and practical: whether GPT-4 can produce tests that are better, similar, or worse than tests written by students for the same Java or Python code. This makes the comparison different from studies that only compare GPT with EvoSuite, Pynguin, SBST, or another LLM.

## Final GAP Statement

There is limited consolidated evidence on whether GPT-4, using a fixed prompt and no iterative coverage/mutation feedback, can generate unit tests for medium-complexity Java or Python functions/classes that reach branch coverage >= 80% and mutation score >= 60%, compared with student-written tests for the same code.

## Refined RQ Direction

For medium-complexity Java or Python functions/classes, can GPT-4 generate unit tests that reach branch coverage >= 80% and mutation score >= 60%, compared with student-written tests for the same code?

## Implications for This Project

- Use Java/JUnit and Python/pytest as the selected implementation languages/frameworks.
- Use JaCoCo and PIT/PiTest for Java; use coverage.py branch coverage and a Python mutation testing tool such as mutmut or Cosmic Ray for Python.
- Track compile/pass status before accepting coverage or mutation results.
- Compare GPT-4 generated tests with student-written tests on the same functions/classes.
- Keep the first experiment controlled: fixed prompt, same code subjects, and no coverage/mutation feedback loop unless a later iteration explicitly adds it.

