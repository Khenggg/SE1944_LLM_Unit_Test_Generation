# Gap Statement Final

**Primary Source:** `team-synthesis/evidence-table-merged.md`

## Evidence Count

| Evidence Group | Count among 37 unique primary studies | Remarks |
| --- | ---: | --- |
| Utilizes coverage / code coverage / branch coverage | 29/37 | Structural coverage remains the most universally adopted evaluation metric in the extracted studies. |
| Utilizes mutation score / mutation testing / mutant information | 16/37 | Mutation testing appears less frequently than structural coverage and is predominantly found in studies proposing feedback-driven or mutation-guided test generation methodologies. |
| Evaluates against human or developer-written tests | 5/37 | Some evidence exists comparing LLM generation against professional developers, but this does not perfectly represent a student-written baseline. |
| Direct comparison with student-written tests | 1/37 | Only one study explicitly addresses student programming assignments, highlighting a severe lack of research tailored to educational contexts. |
| Directly controls for medium cyclomatic complexity (CC=5-15) | 1/37 | A few papers focus on "complex methods" or report results on real-world functions (like the ULT benchmark), but strict population control for medium cyclomatic complexity is largely absent. |
| Simultaneously evaluates branch coverage and mutation score using GPT-4/GPT-4o | Present but fragmented | Strong evidence exists (e.g., studies using the ULT benchmark) reporting both metrics simultaneously, but they typically utilize custom benchmarks without benchmarking against student-written baselines. |

## Primary Gap (GAP)

Current research on LLM-based unit test generation predominantly reports structural coverage improvements or enhancements in compilation and pass rates. While a smaller subset of studies employs mutation scores to accurately measure fault-detection capabilities, there is an almost complete absence of research that evaluates GPT-4/GPT-4o-generated unit tests on a controlled set of medium-complexity Java/Python functions (Cyclomatic Complexity between 5 and 15) by simultaneously measuring both branch coverage and mutation score, and directly comparing these results against student-written tests.

## Secondary Gaps

| Gap Area | Evidence from Merged Literature | Implications for SE1944 |
| --- | --- | --- |
| **Metric Gap** | While 29/37 papers report coverage, only 16/37 report mutation scores. | Relying solely on structural coverage is insufficient to capture the true fault-finding effectiveness of a test suite. Both metrics must be evaluated simultaneously. |
| **Comparison Gap** | 5/37 papers compare LLM outputs to developer-written tests, while only 1/37 compares them to student-written tests. | The SE1944 project has a clear and novel contribution in establishing a student-written baseline, addressing a relatively unexplored area in software engineering education. |
| **Dataset & Complexity Gap** | Only 1/37 papers strictly controls for medium complexity (CC=5-15). Most studies either use simplistic benchmarks (like HumanEval) or highly complex legacy enterprise repositories. | The research must strictly define and curate the dataset at the function level, ensuring all evaluated methods fall within the medium cyclomatic complexity range to avoid skewed results. |
| **Methodological Gap** | The highest reported results generally depend on complex iterative feedback loops, method slicing, or mutation-guided prompting. | The experiment design must explicitly define the prompt engineering policy (e.g., zero-shot vs. chain-of-thought vs. iterative feedback) rather than treating "GPT-4" as a generalized monolith. |

## Final Gap Statement

Existing empirical studies demonstrate that Large Language Models (LLMs) can generate unit test suites with substantial coverage, particularly when augmented by iterative feedback loops, context-aware method slicing, or mutation guidance. However, the current literature still lacks a direct, rigorously controlled evaluation of GPT-4/GPT-4o-generated unit tests against student-written tests on the exact same medium-complexity Java and Python functions. Specifically, there is a prominent research gap in assessing these test suites simultaneously using both branch coverage and mutation score to determine their comprehensive fault-detection capabilities in an educational context.

## Research Direction

To address this gap, the research will curate a controlled dataset of Java and Python functions featuring medium cyclomatic complexity. The study will generate unit tests for these functions using GPT-4/GPT-4o, collect corresponding student-written tests for the exact same functions, and perform a paired statistical comparison using structural branch coverage, mutation score, and compilation/pass status as the primary quantitative metrics.
