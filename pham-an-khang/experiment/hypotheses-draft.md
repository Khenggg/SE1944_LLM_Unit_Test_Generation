# Hypotheses Draft — LLM for Unit Test Case Generation
Date: 2026-06-03

## RQ1 — Evaluating Branch Coverage of GPT-4o vs. Student-Written Tests
H0: GPT-4o automatic generation of unit test cases DOES NOT achieve branch coverage ≥ 74% for Java/Python functions at medium cyclomatic complexity.
H1: GPT-4o automatic generation of unit test cases ACHIEVES branch coverage ≥ 74% for Java/Python functions at medium cyclomatic complexity.

**Planned Statistical Test:** Wilcoxon signed-rank test (α = 0.05)
**Threshold source:** Based on the benchmark results from SS040 indicating the GPT-4 family achieves 74% branch coverage, the target is set to the 74% floor.

## RQ2 — Evaluating Mutation Score of GPT-4o vs. Student-Written Tests
H0: GPT-4o automatic generation of unit test cases DOES NOT achieve mutation score ≥ 58% for Java/Python functions at medium cyclomatic complexity.
H1: GPT-4o automatic generation of unit test cases ACHIEVES mutation score ≥ 58% for Java/Python functions at medium cyclomatic complexity.

**Planned Statistical Test:** Wilcoxon signed-rank test (α = 0.05)
**Threshold source:** Based on the benchmark results from SS040 indicating the GPT-4 family achieves 58% mutation score, the target is set to the 58% floor.

## RQ3 — Direct Comparison with Student-Written Tests
H0: GPT-4o automatic generation of unit test cases is NOT better than or equal to student-written tests in terms of branch coverage and mutation score.
H1: GPT-4o automatic generation of unit test cases IS better than or equal to student-written tests in terms of branch coverage and mutation score.

**Planned Statistical Test:** Paired Wilcoxon signed-rank test (α = 0.05)
**Threshold source:** Direct relative comparison between paired groups on the same code units; an absolute threshold is not applicable.

---

## Final RQ Draft
**Official RQ:** *Does GPT-4o zero-shot test generation (I, temperature=0) for medium cyclomatic complexity Java/Python functions (P) achieve ≥74% branch coverage and ≥58% mutation score (O) when compared against student-written baseline tests (C)?*

## Metric Interpretation
- **Branch Coverage:** Measures the percentage of executed code branches (e.g., if/else conditions, loops) triggered by unit tests. Achieving ≥74% reflects a strong capability in handling control flows.
- **Mutation Score:** The percentage of faulty code variations (mutants) detected and failed by the unit tests. Achieving ≥58% demonstrates the robustness and semantic validity of the generated unit tests.

> **Note on RQ and Threshold Changes:** 
> The initial drafts of the research question aimed for an arbitrary 80% branch coverage and 60% mutation score. However, a detailed literature review identified that the closest comparable state-of-the-art benchmark (SS040) establishes a floor of 74% branch coverage and 58% mutation score for the GPT-4 family. To ensure empirical validity and adherence to rigorous threshold-setting guidelines (Case 2), the final RQ thresholds were adjusted to exactly match these benchmarked floors (74% and 58%).

