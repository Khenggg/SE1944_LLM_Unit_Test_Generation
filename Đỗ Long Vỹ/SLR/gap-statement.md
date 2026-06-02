# GAP STATEMENT – ĐỖ LONG VỸ (IEEE XPLORE)

## Summary from Final Included Papers (N = 5)

Based on the final screening results, five core papers (Final Papers) were selected as the foundation for this study:

1. **Quantity:** All five papers [IEEE001, IEEE003, IEEE004, IEEE011, IEEE025] focus on the application of Large Language Models (LLMs) for automated unit test generation in Java and Python.
2. **Technology:** 100% of these studies employ advanced models such as GPT-4 or Codex to enhance test code generation capabilities.
3. **Evaluation Metrics:** All five papers use **Code Coverage** (Branch Coverage and/or Statement Coverage) as the primary evaluation metric.

## GAP-M – Metric Gap

Although all five studies achieved promising Branch Coverage results, only **2 out of 5 papers** ([IEEE001], [IEEE003]) evaluated **Mutation Score** as an additional quality metric. This indicates that current research primarily emphasizes code coverage rather than assessing the actual fault-detection capability of AI-generated test cases. The proposed study aims to address this gap by establishing a **Mutation Score threshold of at least 60%** as a mandatory evaluation criterion.

## GAP-C – Comparison Gap

Among the five selected papers, most studies compare LLM-based approaches with automated testing tools such as EvoSuite and Pynguin. Only **1 out of 5 papers** ([IEEE025]) includes a comparison with human developers. However, none of the studies directly compare LLM-generated test cases with those produced by **Software Engineering students** using the same set of medium-complexity Java/Python programming exercises. This gap provides the rationale for including students as the **Control Group** in the proposed research.

## Proposed Contribution

This study will use the five selected papers as a baseline reference to:

* Demonstrate that GPT-4 can outperform Software Engineering students in terms of both **Branch Coverage (80%)** and **Mutation Score (60%)**.
* Establish a practical benchmark dataset for comparing AI-generated and human-generated unit tests within a higher education environment.
