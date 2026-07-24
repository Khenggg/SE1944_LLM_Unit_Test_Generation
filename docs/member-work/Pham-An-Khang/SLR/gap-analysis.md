# GAP Analysis — LLM for Unit Test Case Generation
Evidence table: N = 12 papers | Date: 2026-06-03

## GAP Table

| Column | Findings | GAP Type | Counter Evidence Check |
|---|---|---|---|
| Tool/LLM | Most of the 12/12 studies use popular model families (GPT-4, GPT-3.5, Claude, Gemini). However, only 1 study (SS032) focuses on isolating the pure performance evaluation of GPT-4o compared to student-written tests. Most evaluate via automated tools. | GAP-T | Checked 12 papers. Most studies (SS040, SS109, SS174) compare against automated tools (EvoSuite) rather than conducting in-depth comparisons against students. |
| Dataset | Datasets used are mainly [HumanEval](https://github.com/openai/human-eval) (SS014, SS137), known for small size and purely algorithmic functions, or the bug-focused [Defects4J](https://github.com/rjust/defects4j) (SS047, SS080, SS174). There is a severe lack of analysis based on "medium cyclomatic complexity" (except SS080 which only tested 6 classes, lacking generalizability). | GAP-D | Checked 12 papers. Only SS080 mentions cyclomatic complexity, but its test sample is excessively small. |
| Metric | 11/12 use branch/line coverage and 12/12 use mutation score. Only 1 study (SS139) considers aspects like test smells or code quality of unit tests. | GAP-M | Checked 12 papers. Only SS139 measures test smells. |
| Scale | Studies are restricted by their evaluation scale, lacking large real-world data from developers or paired student comparisons (SS014, SS032, SS080, SS139). | GAP-S | Checked 12 papers. Only 1 paper (SS032) compares against student-written tests, and its scale is limited to 6 assignments. |

## Primary GAP Selection: GAP-D (Dataset)

GAP-D is designated as the primary gap as the foundational validity of software testing research relies heavily on the representativeness of the dataset employed. Current collected studies are polarized: they evaluate LLMs on either artificially simple code snippets ([HumanEval](https://github.com/openai/human-eval) in SS014, SS137) or legacy bug repositories ([Defects4J](https://github.com/rjust/defects4j) in SS047, SS080, SS174). Neither of these environments effectively models the medium cyclomatic complexity typical of modern enterprise application logic. Without establishing a proper dataset categorized by structural complexity, advancements in Tools (GAP-T) or Metrics (GAP-M) cannot be accurately generalized to real-world software engineering contexts.

## Secondary GAP Selection: GAP-S (Scale)

GAP-S is designated as the secondary gap as it represents the methodological limitation of how datasets are applied. To determine the practical quality and effectiveness of LLM-generated unit tests, their performance must be directly compared against tests written by actual human developers rather than just another automated generation algorithm (like EvoSuite). While SS032 attempts this human-to-LLM comparison, its scale of only 6 assignments severely limits statistical robustness. Expanding this scale to properly compare AI-generated test cases against student-written ones is a critical requirement, but it can only be effectively accomplished after resolving the foundational dataset representation issues defined by the primary gap (GAP-D).

## Counter Evidence Check - Primary GAP
Stated GAP: Lack of comprehensive evaluation on a large dataset regarding "medium cyclomatic complexity" versus student-written tests.

| Paper | Addressed? | Notes |
|---|---|---|
| SS014 - AI-Powered Unit Test Generation via Multi-LLM Chaining: A Case Study With GPT-4o, Gemini, and Claude-3.5 | No | Evaluates multi-LLM chaining on the HumanEval benchmark, but does not use medium-complexity functions or compare against student-written tests. |
| SS032 - Automatic Unit Test Generation for Programming Assignments Using Large Language Models | No | Generates tests for 6 student assignments, but lacks categorization by structural complexity and does not evaluate a large paired dataset. |
| SS040 - Benchmarking LLMs for Unit Test Generation from Real-World Functions | No | Benchmarks GPT-4o against EvoSuite on real-world functions, but does not conduct a direct paired comparison against student-written tests. |
| SS047 - Clarifying Semantics of In-Context Examples for Unit Test Generation | No | Focuses on prompt refactoring techniques using Defects4J and industrial projects, but does not isolate structural complexity or compare against student-written tests. |
| SS080 - Evaluating LLM-Generated Unit Tests with Mutation Testing: ChatGPT vs DeepSeek | Partially | Evaluates ChatGPT and DeepSeek with mutation testing on six Java classes. While cyclomatic complexity is mentioned, the sample size is far too small to establish generalizability. |
| SS109 - Hallucination to Consensus: Multi-Agent LLMs for End-to-End JUnit Test Generation | No | Uses multi-agent consensus to generate JUnit tests and compares against EvoSuite and TOGLL, but lacks comparison with actual student-written tests. |
| SS119 - IntelliUnitGen: A Unit Test Case Generation Framework Based on the Integration of Static Analysis and Prompt Learning | No | Combines static analysis with prompt learning, but does not consider cyclomatic complexity tiers for evaluation. |
| SS131 - Leveraging Long Method Decomposition to Improve Large Language Model-Based Test Case Generation | No | Utilizes method decomposition for long methods, but does not specifically categorize medium-complexity functions or compare against human tests. |
| SS137 - LLMLOOP: Improving LLM-Generated Code and Tests Through Automated Iterative Feedback Loops | No | Implements automated iterative feedback loops on the HumanEval-X benchmark, but lacks evaluation on complex real-world functions and developer baselines. |
| SS139 - LLMs for Automated Unit Test Generation and Assessment in Java: The AgoneTest Framework | No | Measures test smells and unit test quality using the AgoneTest framework, but does not focus on medium cyclomatic complexity functions. |
| SS174 - Mutation-Guided Unit Test Generation With a Large Language Model | No | Uses mutation-guided generation with EvoSuite as a baseline, but lacks a direct paired comparison against student-written tests. |
| SS231 - Test Wars: A Comparative Study of SBST, Symbolic Execution, and LLM-Based Approaches to Unit Test Generation | No | Compares TestSpark with SBST/Kex on GitBug Java, but does not directly compare with student-written tests on specific complexities. |

**Conclusion of Counter Evidence Check:** Confirmed (GAP exists). Across all 12 publications, none comprehensively address the identified gap. Although one study (SS080) acknowledges cyclomatic complexity leveling, its experimental scale is explicitly restricted to 6 specific classes. This sample size is insufficient to represent real-world settings or support broad statistical conclusions. Therefore, the primary gap regarding medium complexity evaluation remains robust, defensible, and worthy of extended research.

## Feasibility Check — Primary GAP

| Criterion | Level | Notes |
|---|---|---|
| Dataset | ⚠️ (Warning) | Requires the collection and curation of student-written tests matching medium cyclomatic complexity. [Defects4J](https://github.com/rjust/defects4j) or open-source repositories can serve as a backup, but achieving the primary goal necessitates student-authored baselines. |
| Tool/API | ⚠️ (Warning) | The GPT-4o API is technically accessible, but budget constraints and rate limits must be carefully managed and tested prior to large-scale execution. |
| Compute | ✅ (Safe) | Minimal computational resources are required. The execution of JUnit, code coverage tools (e.g., JaCoCo), and mutation testing engines (e.g., Pitest) can be handled efficiently on standard CPUs without requiring GPU acceleration. |
| Ground truth | ✅ (Safe) | Available student-written tests within academic repositories and open-source projects can reliably serve as the human-authored ground truth baselines. |
| Skills | ✅ (Safe) | The requisite automation scripts for structural measurement (coverage) and semantic measurement (mutation score) are already well-established within the research team. |
| Time | ✅ (Safe) | The experimental execution is highly achievable within standard project timelines, provided that automation scripts are finalized in the early phases. |
| Contribution | ✅ (Safe) | Delivering a direct, paired comparison of branch coverage and mutation scores between an LLM and human developers will yield an empirically valuable contribution to current software engineering literature. |

**Result of Feasibility Check:** 0 Blockers / 2 Warnings. The selected gap is highly feasible for implementation. To mitigate the identified warnings regarding dataset curation and API constraints, the recommended scope for the study will be restricted to a single primary programming language (e.g., Java), targeting an optimized sample size of 10-20 medium-complexity units. This targeted scope ensures statistical validity while remaining comfortably within the defined budget and resource constraints.

## Final GAP Statement
Existing Semantic Scholar evidence thoroughly evaluates LLM-generated unit tests across automated tool baselines and trivial or legacy benchmarks. However, it fails to provide a paired comparison between GPT-4o-generated tests and student-written tests on the same medium-complexity Java/Python units. This study will address the foundational Dataset Gap (GAP-D) and Scale Gap (GAP-S) using branch coverage and mutation score as dual quality metrics.