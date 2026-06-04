# GAP Analysis — LLM for Unit Test Case Generation
**Researcher:** Do Long Vy (Student ID: SE190064)  
**Evidence Pool:** N = 5 core papers from IEEE Xplore | **Date:** 2026-06-04  

## 1. SLR Gap Verification Table

| Data Column Map | Discovered Pattern / Observation | Identified Gap Type | Counter-Evidence Check Status |
| :--- | :--- | :---: | :--- |
| **Tool / LLM** | 4/5 papers use commercial or closed models (GPT-3.5/4, Codex). Only 1 paper integrates localized code-specific models (CodeLlama/DeepSeek-Coder) with structural feedback loops. | **GAP-T** (Technology Gap) | Verified via 5 papers. No paper evaluates the exact combination of GPT-4o and DeepSeek-Coder dynamic context frameworks. |
| **Dataset** | Benchmarks are strictly restricted to industry-standard suites (Defects4J) or open-source repositories with production-grade code. | **GAP-D** (Dataset Gap) | Verified. 0/5 papers test on intermediate academic code written by Software Engineering students. |
| **Metric** | 5/5 papers heavily rely on structural coverage (Statement/Branch/Block). However, only 1 paper (IEEE003) incorporates Mutation Testing to measure semantic fault-detection capacity. | **GAP-M** (Metric Gap) | Verified. 4/5 papers suffer from semantic blindness by omitting mutation scores. |
| **Limitations** | 4/5 papers explicitly report "Structural Coverage Plateaus" and "Syntax/Logical Validity Discrepancies" as major threats to validity. | **GAP-S** (Shared Limitation Gap) | Verified. A recurring roadblock across 80% of the evidence pool. |

## 2. Primary & Secondary Gap Commitment

* **Primary Gap (GAP-M & GAP-D Combined):** While structural coverage (Branch Coverage) is universally adopted, there is a severe lack of semantic quality evaluation (Mutation Testing) when applying LLMs to intermediate-complexity code, specifically when benchmarking AI capability against human programming students.
* **Secondary Gap (GAP-T):** Insufficient evaluation of dynamic contextual prompt structures using state-of-the-art models (GPT-4o) versus open-source engineering models (DeepSeek-Coder) under identical algorithmic constraints.

## 3. Counter-Evidence Rigorous Check Matrix

| Paper ID | Addresses Primary Gap? (Dynamic Mutation + Student Benchmark) | Technical Evidence / Rationale from Text |
| :--- | :---: | :--- |
| **IEEE001** | No | Uses open-source Java projects; focuses strictly on prompt context vs. Statement/Branch coverage. |
| **IEEE003** | Partial | Proposes Mutation-Guided synthesis on Defects4J, but does **not** compare with human/student baselines. |
| **IEEE004** | No | Combines SBST with Codex to escape structural plateaus; no mutation analysis or student benchmark. |
| **IEEE011** | No | Investigates path-sensitive prompting for nested flows; measures only structural path/branch coverage. |
| **IEEE025** | No | Evaluates functional Python methods for syntax correctness and block coverage; no mutation testing. |

**Conclusion:** The Primary Gap is **VALIDATED**. No counter-evidence exists in the selected IEEE Xplore pool.

## 4. Empirical Feasibility Gate Check

| Feasibility Criterion | Risk Level | Mitigation Strategy & Notes |
| :--- | :---: | :--- |
| **Dataset Availability** | Safe | Using readily available Java/Python student programming assignments from university archives. |
| **Tool / API Access** | Safe | Utilizing OpenAI API (free tier/academic credit) and public open-source DeepSeek-Coder endpoints. |
| **Compute Power** | Safe | Execution of test coverage tools (JaCoCo / Coverage.py) requires standard CPU/local machine power; no heavy GPU cluster needed. |
| **Ground Truth / Label** | Manageable | Student-written unit tests are already collected; requires minor clean-up (< 3 hours). |
| **Technical Skills** | Safe | Group members are proficient in Java/Python unit testing frameworks (JUnit, pytest) and automation scripts. |
| **Timeline Constraints** | Safe | Execution phase estimated at 2 weeks, leaving a 1-week safety buffer before proposal submission. |
| **Value of Negative Result**| Safe | Even if the LLM fails to beat students, it establishes a solid baseline for AI-driven academic grading tools. |

* **Final Feasibility Decision:** **SAFE TO PROCEED** (0 Blockers , 1 Manageable Risk ).
