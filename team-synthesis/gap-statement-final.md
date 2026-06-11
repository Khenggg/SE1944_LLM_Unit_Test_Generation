## Team Synthesis Gap Statement

### 1. Synthesis of Evidence from the Literature
The review of 36 primary studies reveals a growing interest in applying Large Language Models (LLMs) to automated unit test generation. Recent studies have investigated various models, including GPT-series models, DeepSeek, Gemini, Codex, and other state-of-the-art LLMs, demonstrating significant improvements in generating executable test cases and increasing software testing automation. 

Across the reviewed literature, researchers have explored multiple approaches to improve the quality of generated unit tests, such as:
* Zero-shot prompting
* Chain-of-thought prompting
* Iterative feedback mechanisms
* Mutation-guided generation
* Context-aware code slicing

A quantitative synthesis of the evidence shows that **structural coverage remains the dominant evaluation criterion**. Specifically, 28 out of the 36 reviewed studies utilize coverage-related metrics (*statement coverage, line coverage, branch coverage, or overall code coverage*) to assess the effectiveness of generated test suites. These metrics are widely accepted because they measure the extent to which generated tests execute the target source code. As a result, many studies report substantial improvements in coverage achieved by LLM-generated tests.

However, coverage metrics alone do not necessarily reflect the actual fault-detection capability of a test suite. A test suite may achieve high branch coverage while still failing to identify defects within the software. For this reason, mutation testing has increasingly been adopted as a complementary evaluation method. 

> **Key Observation:** Only 16 of the 36 reviewed studies report mutation scores or mutation-testing-related metrics. This indicates that although mutation testing is recognized as a stronger indicator of test quality, its adoption remains considerably less common than traditional coverage-based evaluation approaches.

Another important observation concerns the **comparison baseline** used in existing studies:
* Among the 36 reviewed papers, only **five studies** compare LLM-generated tests against human-written or developer-written tests.
* More importantly, only **one study** explicitly evaluates student-written tests. 

Most existing research relies on professional developers, benchmark datasets, or open-source repositories as reference points. Consequently, there is very limited evidence regarding how LLM-generated tests perform relative to student-written tests in educational software engineering environments.

The **dataset characteristics** used in prior research also reveal an important limitation. Most studies evaluate LLM performance using benchmark datasets such as *HumanEval, Defects4J*, enterprise repositories, or other large-scale open-source projects. While these datasets are valuable for benchmarking purposes, they may not accurately represent the programming tasks commonly encountered in software engineering education. 

Furthermore, **only one study** explicitly controls for medium cyclomatic complexity ($CC = 5–15$). This suggests that the literature lacks a systematic investigation of LLM-generated tests on software units of moderate complexity, which are typically encountered in university programming assignments and practical software development tasks.

Finally, several studies simultaneously report branch coverage and mutation score, demonstrating the value of combining structural and fault-detection metrics. However, these studies generally evaluate specialized benchmarks and do not compare generated tests against student-written baselines. Therefore, the existing evidence remains fragmented and insufficient to determine whether GPT-4o-generated tests can match or exceed the quality of student-written tests when evaluated using comprehensive testing metrics.

---

### 2. Research Gaps Specification

#### 🔴 Primary Gap (GAP-D): Dataset & Comparison Baseline (Educational Context)
Based on the synthesized evidence, the most significant research gap relates to the dataset and comparison baseline used in existing studies. 

Current research lacks a rigorously controlled evaluation that compares GPT-4o-generated unit tests and student-written unit tests on the exact same **medium-complexity** ($CC = 5–15$) **Java and Python functions**. Although some studies compare LLM-generated tests with developer-written tests, such comparisons do not adequately represent the educational context where students are the primary software developers. Furthermore, the limited control of cyclomatic complexity in existing datasets makes it difficult to generalize findings to typical coursework-level programming tasks.

> **Statement of GAP-D:** The absence of a controlled educational benchmark that enables direct comparison between GPT-4o-generated and student-written unit tests on medium-complexity software functions.

#### 🟡 Secondary Gap (GAP-M): Evaluation Metrics Alignment
A secondary gap concerns the evaluation metrics employed in existing studies. 

The literature overwhelmingly relies on coverage-based measures, while mutation score is used much less frequently. Although branch coverage provides useful information regarding structural adequacy, it does not fully capture the effectiveness of a test suite in detecting faults. Mutation score offers a complementary perspective by measuring the ability of tests to identify artificially injected defects. 

The inconsistent adoption of mutation testing means that many reported improvements in coverage cannot be directly interpreted as improvements in software quality assurance. 

> **Statement of GAP-M:** The need for studies that simultaneously evaluate branch coverage and mutation score when comparing LLM-generated and human-written test suites to bridge the gap between structural adequacy and true fault-detection effectiveness.

---

### 3. Final Team Gap Statement
Existing empirical studies demonstrate that Large Language Models can generate unit test suites with substantial structural coverage and promising levels of automation. 

However, the current body of knowledge still lacks a **direct and rigorously controlled comparison between GPT-4o-generated tests and student-written tests on the same medium-complexity Java and Python functions (GAP-D)**. In addition, current evaluations continue to emphasize structural coverage, while **the combined use of branch coverage and mutation score remains relatively limited (GAP-M)**. 

Addressing these integrated gaps would provide stronger empirical evidence regarding both the structural adequacy and fault-detection effectiveness of GPT-4o-generated unit tests in software engineering education contexts.
