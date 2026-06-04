# GAP Analysis — LLM for Unit Test Case Generation
Evidence table: N = 12 papers | Date: 2026-06-03

## GAP Table

| Column | Findings | GAP Type | Counter Evidence Check |
|---|---|---|---|
| Tool/LLM | Most of the 12/12 studies use popular model families (GPT-4, GPT-3.5, Claude, Gemini). However, very few studies focus on isolating the pure performance evaluation of GPT-4 compared to student-written tests. Most evaluate via automated tools. | GAP-T | Checked 12 papers. Most studies compare against automated tools (EvoSuite) rather than conducting in-depth comparisons against students. |
| Dataset | Datasets used are mainly HumanEval (small size, purely algorithmic functions) or Defects4J (bug-focused). There is a severe lack of analysis based on "medium cyclomatic complexity" (except SS080 which only tested 6 classes, lacking generalizability). | GAP-D | Checked 12 papers. Only SS080 mentions cyclomatic complexity, but its test sample is excessively small. |
| Metric | 11/12 use branch/line coverage and 12/12 use mutation score. Very few studies consider aspects like test smells or code quality of unit tests. | GAP-M | Checked 12 papers. Only SS139 measures test smells. |
| Limitations | Studies face limitations regarding API budgets, execution time, or lacking large real-world data from developers (SS014, SS032, SS080, SS139). | GAP-S | Checked 12 papers. Very few papers have a sufficiently large paired-comparison dataset with students. |

## Primary GAP: GAP-D
Current studies primarily focus on small code snippets (HumanEval) or existing bugs (Defects4J), lacking specific categorization by structural complexity. Evaluating LLM capabilities on a large dataset of functions with medium cyclomatic complexity compared to student-written tests remains a notable gap.

## Secondary GAP: GAP-S
Many studies are limited by their evaluation sample size (only a few classes or assignments), which leads to a lack of generalizability to real-world scenarios.

## Counter Evidence Check - Primary GAP
Stated GAP: Lack of comprehensive evaluation on a large dataset regarding "medium cyclomatic complexity" versus student-written tests.

| Paper | Addressed? | Notes |
|---|---|---|
| SS014 - AI-Powered Unit Test Generation via Multi-LLM Chaining: A Case Study With GPT-4o, Gemini, and Claude-3.5 | No | Evaluates multi-LLM chaining on the HumanEval benchmark, but does not use medium-complexity functions or compare against student-written tests. |
| SS032 - Automatic Unit Test Generation for Programming Assignments Using Large Language Models | No | Generates tests for 6 student assignments, but lacks categorization by structural complexity and does not evaluate a large paired dataset. |
| SS040 - Benchmarking LLMs for Unit Test Generation from Real-World Functions | No | Benchmarks GPT-4 against EvoSuite on real-world functions, but does not conduct a direct paired comparison against student-written tests. |
| SS047 - Clarifying Semantics of In-Context Examples for Unit Test Generation | No | Focuses on prompt refactoring techniques using Defects4J and industrial projects, but does not isolate structural complexity or compare against student-written tests. |
| SS080 - Evaluating LLM-Generated Unit Tests with Mutation Testing: ChatGPT vs DeepSeek | Partially | Evaluates ChatGPT and DeepSeek with mutation testing on six Java classes, but the sample size is too small to establish generalizability. |
| SS109 - Hallucination to Consensus: Multi-Agent LLMs for End-to-End JUnit Test Generation | No | Uses multi-agent consensus to generate JUnit tests and compares against EvoSuite and TOGLL, but lacks comparison with actual student-written tests. |
| SS119 - IntelliUnitGen: A Unit Test Case Generation Framework Based on the Integration of Static Analysis and Prompt Learning | No | Combines static analysis with prompt learning, but does not consider cyclomatic complexity tiers for evaluation. |
| SS131 - Leveraging Long Method Decomposition to Improve Large Language Model-Based Test Case Generation | No | Utilizes method decomposition for long methods, but does not specifically categorize medium-complexity functions or compare against human tests. |
| SS137 - LLMLOOP: Improving LLM-Generated Code and Tests Through Automated Iterative Feedback Loops | No | Implements automated iterative feedback loops on the HumanEval-X benchmark, but lacks evaluation on complex real-world functions and developer baselines. |
| SS139 - LLMs for Automated Unit Test Generation and Assessment in Java: The AgoneTest Framework | No | Measures test smells and unit test quality using the AgoneTest framework, but does not focus on medium cyclomatic complexity functions. |
| SS174 - Mutation-Guided Unit Test Generation With a Large Language Model | No | Uses mutation-guided generation with EvoSuite as a baseline, but lacks a direct paired comparison against student-written tests. |
| SS231 - Test Wars: A Comparative Study of SBST, Symbolic Execution, and LLM-Based Approaches to Unit Test Generation | No | Compares TestSpark with SBST/Kex on GitBug Java, but does not directly compare with student-written tests on specific complexities. |

Conclusion: Confirmed (GAP exists). Although one study (SS080) touches upon cyclomatic complexity leveling, its evaluation scale is too small (6 classes) to represent real-world settings; therefore, this gap is entirely robust and worthy of extended research.

## Feasibility Check — Primary GAP

| Criterion | Level | Notes |
|---|---|---|
| Dataset | ⚠️ (Warning) | Need to collect student-written tests. Can use Defects4J or open-source repos as backup but primary goal requires student tests. |
| Tool/API | ⚠️ (Warning) | GPT-4 API is accessible, but budget and API limits need to be tested beforehand. |
| Compute | ✅ (Safe) | CPU needed to run JUnit, coverage tool, and mutation tool (Pitest). GPU not required. |
| Ground truth | ✅ (Safe) | Use available student-written tests in open-source repos as baselines. |
| Skills | ✅ (Safe) | Scripts for measuring coverage (JaCoCo) and mutation score (Pitest) are already established. |
| Time | ✅ (Safe) | Achievable with buffer if the automation scripts are prepared early. |
| Contribution | ✅ (Safe) | Comparing coverage and mutation score outcomes yields valuable evaluation of LLM capability for developers. |

Result: 0 blockers / 2 warnings. This GAP is feasible. Recommended scope: one language first, 10-20 medium-complexity units, automated branch coverage and mutation score, and student-written tests collected from available coursework or team-authored baseline tests.

## Final GAP Statement
Existing Semantic Scholar evidence evaluates LLM-generated unit tests across benchmarks and tool baselines, but it does not provide a paired comparison between GPT-4-generated tests and student-written tests on the same medium-complexity Java/Python units. This study will address that gap using branch coverage and mutation score as dual quality metrics.
