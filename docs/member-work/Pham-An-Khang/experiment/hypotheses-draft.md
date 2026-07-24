# Hypotheses Draft — LLM for Unit Test Case Generation
Date: 2026-06-03

## RQ1 — Evaluating Branch Coverage of GPT-4o vs. Student-Written Tests
H0: GPT-4o automatic generation of unit test cases DOES NOT achieve branch coverage ≥ 30.22% for Java/Python functions at medium cyclomatic complexity.
H1: GPT-4o automatic generation of unit test cases ACHIEVES branch coverage ≥ 30.22% for Java/Python functions at medium cyclomatic complexity.

**Planned Statistical Test:** Wilcoxon signed-rank test (α = 0.05)
**Threshold source:** Based on the benchmark results from SS040 indicating that state-of-the-art LLMs achieve an average of 30.22% branch coverage on complex, real-world functions (ULT dataset).

## RQ2 — Evaluating Mutation Score of GPT-4o vs. Student-Written Tests
H0: GPT-4o automatic generation of unit test cases DOES NOT achieve mutation score ≥ 40.21% for Java/Python functions at medium cyclomatic complexity.
H1: GPT-4o automatic generation of unit test cases ACHIEVES mutation score ≥ 40.21% for Java/Python functions at medium cyclomatic complexity.

**Planned Statistical Test:** Wilcoxon signed-rank test (α = 0.05)
**Threshold source:** Based on the benchmark results from SS040 indicating that state-of-the-art LLMs achieve an average of 40.21% mutation score on complex, real-world functions (ULT dataset), with a baseline comparison floor of ≥ 4.0% for manual test comparisons.

## RQ3 — Direct Comparison with Student-Written Tests
H0: GPT-4o automatic generation of unit test cases IS NOT better than or equal to student-written tests in terms of branch coverage and mutation score.
H1: GPT-4o automatic generation of unit test cases IS better than or equal to student-written tests in terms of branch coverage and mutation score.

**Planned Statistical Test:** Paired Wilcoxon signed-rank test (α = 0.05)
**Threshold source:** Direct relative comparison between paired groups on the same code units; an absolute threshold is not applicable.

---

## Final RQ Draft
**Official RQ:** *Does GPT-4o zero-shot test generation (I, temperature=0) for medium cyclomatic complexity Java/Python functions (P) achieve ≥30.22% branch coverage and ≥40.21% mutation score (O) when compared against student-written baseline tests (C)?*

## Metric Interpretation
- **Branch Coverage:** Measures the percentage of executed code branches (e.g., if/else conditions, loops) triggered by unit tests. Achieving ≥30.22% reflects capability matching the average state-of-the-art automated baseline on complex functions.
- **Mutation Score:** The percentage of faulty code variations (mutants) detected and failed by the unit tests. Achieving ≥40.21% demonstrates robustness matching the average state-of-the-art automated baseline on complex functions.

> **Note on RQ and Threshold Changes:** 
> The initial drafts of the research question aimed for an arbitrary 80% branch coverage and 60% mutation score. However, a systematic literature review identified that the closest comparable state-of-the-art benchmark (SS040) establishes an empirical average of 30.22% branch coverage and 40.21% mutation score. To ensure empirical validity and adherence to rigorous threshold-setting guidelines, the final RQ thresholds were adjusted to match these benchmarked averages, providing a scientifically grounded reference point.
