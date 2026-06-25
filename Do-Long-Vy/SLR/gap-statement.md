# GAP STATEMENT – DO LONG VY (STUDENT ID: SE190064)

## 1. Quantitative Summary from Final Included Papers (N = 5)
Based on the systematic screening of the literature pool [IEEE001, IEEE003, IEEE004, IEEE011, IEEE025], three universal patterns were identified:
1. **Target Technology:** 100% of the studies utilize commercial or foundational LLMs (e.g., GPT-3.5/4, Codex) to synthesize automated unit tests, with a critical lack of cross-examination against specialized open-source models like DeepSeek-Coder under zero-shot prompting constraints.
2. **Evaluation Metrics:** 5/5 papers rely heavily on structural coverage metrics (Branch/Statement Coverage) as the definitive proxy for test suite quality.
3. **Benchmark Datasets:** 100% of empirical evaluations are conducted on industry-standard open-source repositories (e.g., Defects4J, SF110), leaving academic codebases completely unstudied.

## 2. Core Research Gaps Established

### Primary Gap: GAP-D (Dataset Gap & Human Baseline Omission)
Current literature validates LLM test generation capabilities exclusively on optimized, production-grade open-source software benchmarks. There is an absolute omission of empirical assessment frameworks targeted at intermediate-complexity, unoptimized source code authored by Software Engineering undergraduate students. Furthermore, current benchmarks fail to cross-examine zero-shot LLM performance directly against the human student artifacts that generated the codebase, leaving the human-AI educational testing boundary unmapped.

### Secondary Gap: GAP-M (Metric Gap & Semantic Blindness)
While structural branch adequacy is widely measured, 4 out of 5 included papers omit evaluating the actual semantic fault-detection strength of the generated test suites. Only 1 paper ([IEEE003]) incorporates Mutation Testing, proving that high structural coverage often suffers from semantic blindness, failing to catch logical mutations.

## 3. Proposed Research Contribution & Resolution
To resolve these interconnected gaps, this study establishes a traceability loop directly derived from the empirical floors of the evidence pool:
* **Target Population (P) & Comparison (C):** We introduce a localized academic repository consisting of 50 intermediate-complexity Java/Python functions written by Software Engineering students, using the students' own unit tests as the direct human baseline control group.
* **Intervention (I) & Technical Models:** We cross-evaluate the frontier commercial model (**GPT-4o**) against the leading open-source model (**DeepSeek-Coder**) using a unified structural prompt priming architecture.
* **Outcome Objectives (O):** We enforce a dual-boundary success threshold extracted straight from the empirical baselines of **IEEE003**. The automated frameworks must systematically achieve a structural **Branch Coverage $\ge 78.4\%$** and a semantic **Mutation Score $\ge 56.2\%$** while matching or outperforming the student-written artifacts.
