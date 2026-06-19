# Experiment Design Rationale — LLM vs. Human Student Unit Testing
**Date:** 2026-06-04 | **Derived From:** `SLR/gap-analysis.md`

## 1. Technical Decision Matrix

| Empirical Decision Element | Selected Value / Configuration | Scientific Source & Traceability |
| :--- | :--- | :--- |
| **Primary Evaluated Models (I)** | GPT-4o (Commercial Core) & DeepSeek-Coder (Open-Source Core) | **GAP-T:** Evaluates the frontier open-source model vs. closed dominance found in 80% of the evidence pool. |
| **Test Dataset Portfolio (P)** | 50 Intermediate-Complexity Java/Python Functions (Student Repository) | **GAP-D (Primary):** Directly targets the academic source code gap identified across all 5 core papers. |
| **Primary Metric 1 (O)** | Structural Branch Coverage (via JaCoCo / Coverage.py) | Inherited from universal consensus across all 5 included papers (**IEEE001, IEEE003, IEEE004, IEEE011, IEEE025**). |
| **Primary Metric 2 (O)** | Mutation Score / Fault Detection Strength (via PITEST / MutPy) | **GAP-M (Secondary):** Explicitly adapted from the technical framework of **IEEE003**. |
| **Experimental Baseline (C)** | Direct Human Comparison (Artifacts written by SE Students) | **GAP-D/C:** Direct answer to the absolute omission of human student grading benchmarks in current literature. |
| **RQ1 Boundary Threshold** | **Branch Coverage >= 78.4%** | **Case 2 (Empirical Floor Metric):** Extracted directly from the worst-performing baseline configuration reported in **IEEE003**. |
| **RQ2 Boundary Threshold** | **Mutation Score >= 56.2%** | **Case 2 (Empirical Floor Metric):** Extracted directly from the baseline automated test generation floor reported in **IEEE003**. |

## 2. Quantitative Threshold Rationale

### Structural Boundary (Branch Coverage >= 78.4%)
* **Derivation Category:** **Case 2 (Empirical Floor Metric)**
* **Scientific Justification:** According to statistical data explicitly reported in **IEEE003**, the lowest empirical floor baseline for automated LLM unit test execution before dynamic context optimization hits **78.4%**. In strict compliance with RBL-2 framework constraints forbidding arbitrary modifications of non-Case 1 metrics, this exact floor value is designated as our boundary threshold for student-grade algorithmic comparison.

### Semantic Boundary (Mutation Score >= 56.2%)
* **Derivation Category:** **Case 2 (Empirical Floor Metric)**
* **Scientific Justification:** As evidenced by **IEEE003**, generative frameworks operating without mutation-guided feedback loops produce test suites with a localized fault-detection semantic floor of **56.2%**. This study preserves this exact statistical floor to systematically evaluate if modern prompt priming can enable GPT-4o and DeepSeek-Coder to cross this empirical barrier when testing human student logic.
