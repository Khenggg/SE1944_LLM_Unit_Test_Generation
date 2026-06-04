# Experiment Design Rationale — LLM vs. Human Student Unit Testing
**Date:** 2026-06-04 | **Derived From:** `SLR/gap-analysis.md`

## 1. Technical Decision Matrix

| Empirical Decision Element | Selected Value / Configuration | Scientific Source & Traceability |
| :--- | :--- | :--- |
| **Primary Evaluated Models (I)** | GPT-4o (Commercial Leader) & DeepSeek-Coder-V2 (Open-Source Core) | **GAP-T:** Standardized models to challenge the closed-source dominance found in 80% of IEEE papers. |
| **Test Dataset Portfolio (P)** | 50 Intermediate-Complexity Java/Python Functions (Student Repository) | **GAP-D:** Addresses the lack of academic/student code validation frameworks. |
| **Primary Metric 1 (O)** | Structural Branch Coverage (via JaCoCo / Coverage.py) | Inherited from universal consensus across all 5 included papers (**IEEE001, IEEE003, IEEE004, IEEE011, IEEE025**). |
| **Primary Metric 2 (O)** | Mutation Score / Fault Detection Strength (via PITEST / MutPy) | **GAP-M:** Explicitly adapted from the technical framework of **IEEE003**. |
| **Experimental Baseline (C)** | Direct Human Comparison (Artifacts written by SE Students) | **GAP-D/C:** Direct answer to the absolute omission of human-grading benchmarks in current literature. |
| **RQ1 Boundary Threshold** | **Branch Coverage >= 80%** | **Case 2 (Floor Value derivation):** IEEE003 reports a lower-bound structural coverage of ~78-79% under standard settings. Rounded to 80% as a rigorous engineering threshold. |
| **RQ2 Boundary Threshold** | **Mutation Score >= 60%** | **Case 2 (Floor Value derivation):** Based on the empirical baseline in IEEE003 where automated LLMs without mutation loops achieve a floor fault detection rate of ~55-58%. |
| **Methodological Pipeline Base**| Prompt-Driven Automated Test Generation Frame | Adapted from **IEEE001** (Context-aware priming) and **IEEE025** (Python standalone execution rules). |

## 2. Quantitative Threshold Rationale

### Structural Boundary (Branch Coverage >= 80%)
* **Derivation Category:** **Case 2 (Empirical Floor Metric)**
* **Scientific Justification:** According to data extracted from **IEEE003** and **IEEE004**, LLMs operating in zero-shot or context-primed settings regularly hit a structural ceiling. The lowest acceptable statistical floor reported for reliable code deployment is 78.4% (**IEEE003**). Setting our target at 80% ensures we test whether GPT-4o can confidently cross this industrial standard on student-grade logic profiles.

### Semantic Boundary (Mutation Score >= 60%)
* **Derivation Category:** **Case 2 (Empirical Floor Metric)**
* **Scientific Justification:** Semantic adequacy is notoriously harder to satisfy than structural coverage. **IEEE003** demonstrates that standard LLM generations exhibit a baseline mutation score floor of 56.2% due to redundant assertions and pseudo-tested code. Therefore, an objective engineering target of 60% is established to evaluate if the advanced reasoning capabilities of modern models can satisfy semantic rigor without dynamic mutation feedback loops.
