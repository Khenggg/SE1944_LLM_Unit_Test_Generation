# Hypotheses Draft — LLM for Unit Test Case Generation
Date: 2026-06-03

## RQ1 — Evaluating Branch Coverage of GPT-4 vs. Manually Written Tests
H0: GPT-4 automatic generation of unit test cases DOES NOT achieve branch coverage ≥ 80% for Java/Python functions at medium cyclomatic complexity.
H1: GPT-4 automatic generation of unit test cases ACHIEVES branch coverage ≥ 80% for Java/Python functions at medium cyclomatic complexity.

**Planned Statistical Test:** Wilcoxon signed-rank test (α = 0.05)
**Threshold source:** Based on the benchmark results from SS040 (2026) indicating GPT-4 achieves 74% branch coverage, the target is rounded up to an industry-standard 80%.

## RQ2 — Evaluating Mutation Score of GPT-4 vs. Manually Written Tests
H0: GPT-4 automatic generation of unit test cases DOES NOT achieve mutation score ≥ 60% for Java/Python functions at medium cyclomatic complexity.
H1: GPT-4 automatic generation of unit test cases ACHIEVES mutation score ≥ 60% for Java/Python functions at medium cyclomatic complexity.

**Planned Statistical Test:** Wilcoxon signed-rank test (α = 0.05)
**Threshold source:** Based on the benchmark results from SS040 (2026) indicating GPT-4 achieves 58% mutation score, the target is rounded up to expect a score exceeding 60%.

## RQ3 — Direct Comparison with Manually Written Tests
H0: GPT-4 automatic generation of unit test cases is NOT better than or equal to manually written test cases in terms of branch coverage and mutation score.
H1: GPT-4 automatic generation of unit test cases IS better than or equal to manually written test cases in terms of branch coverage and mutation score.

**Planned Statistical Test:** Mann-Whitney U test (α = 0.05)
**Threshold source:** Direct relative comparison between two independent groups; an absolute threshold is not applicable.

---

## Final RQ Draft
**Official RQ:** *Does GPT-4 zero-shot test generation (I, temperature=0) for medium cyclomatic complexity Java/Python functions (P) achieve ≥80% branch coverage and ≥60% mutation score (O) when compared against student-written baseline tests (C)?*

## Metric Interpretation
- **Branch Coverage:** Measures the percentage of executed code branches (e.g., if/else conditions, loops) triggered by unit tests. Achieving ≥80% reflects a strong capability in handling control flows.
- **Mutation Score:** The percentage of faulty code variations (mutants) detected and failed by the unit tests. Achieving ≥60% demonstrates the robustness and semantic validity of the generated unit tests.
