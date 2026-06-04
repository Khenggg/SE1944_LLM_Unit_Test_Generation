# GAP Analysis — LLM for Unit Test Case Generation
**Researcher:** Do Long Vy (Student ID: SE190064)  
**Evidence Pool:** N = 5 core papers from IEEE Xplore | **Date:** 2026-06-04  

## 1. SLR Gap Verification Table

| Data Column Map | Discovered Pattern / Observation | Identified Gap Type | Counter-Evidence Check Status |
| :--- | :--- | :---: | :--- |
| **Tool / LLM** | 4/5 papers use commercial or closed models (GPT-3.5/4, Codex). Only 1 paper integrates localized code-specific models (DeepSeek-Coder/CodeLlama) with structural feedback loops. | **GAP-T** (Technology Gap) | Verified via 5 papers. No paper evaluates the exact combination of GPT-4o and DeepSeek-Coder frameworks under identical algorithmic constraints. |
| **Dataset** | Benchmarks are strictly restricted to industry-standard suites (Defects4J) or production-grade open-source repositories. | **GAP-D** (Dataset Gap) | Verified. 0/5 papers test on intermediate academic code written by Software Engineering students. |
| **Metric** | 5/5 papers heavily rely on structural coverage (Statement/Branch/Block). However, only 1 paper (IEEE003) incorporates Mutation Testing to measure semantic fault-detection capacity. | **GAP-M** (Metric Gap) | Verified. 4/5 papers suffer from semantic blindness by omitting mutation scores. |
| **Limitations** | 4/5 papers explicitly report "Structural Coverage Plateaus" and "Syntax/Logical Validity Discrepancies" as major threats to validity. | **GAP-S** (Shared Limitation Gap) | Verified. A recurring roadblock across 80% of the evidence pool. |

## 2. Primary & Secondary Gap Commitment

* **Primary Gap (GAP-D):** Existing empirical studies strictly validate LLM test generation capabilities on production-grade benchmarks, leaving an absolute omission of assessment frameworks targeted at intermediate academic source code written by Software Engineering undergraduate students.
* **Secondary Gap (GAP-M):** Insufficient evaluation of semantic fault-detection strength (Mutation Testing) compared to ubiquitous structural metrics (Branch Coverage) when assessing automated testing boundaries.

## 3. Counter-Evidence Rigorous Check Matrix

| Paper ID | Addresses Primary Gap (Student Benchmark)? | Empirical Baseline Data / Technical Rationale from Text |
| :--- | :---: | :--- |
| **IEEE001** | No | Uses open-source Java projects; reports that baseline context enhancement yields **82.1%** Statement Coverage but leaves student repositories unexamined. |
| **IEEE003** | No | Proposes Mutation-Guided synthesis on Defects4J benchmark; reports a floor structural coverage of **78.4%** and a semantic fault detection baseline floor of **56.2%**. |
| **IEEE004** | No | Combines SBST with Codex to escape structural plateaus on SF110 and Defects4J; reports an incremental branch coverage improvement up to **84.3%**. |
| **IEEE011** | No | Investigates path-sensitive prompting for nested flows; measures only structural path/branch coverage on standalone algorithmic methods. |
| **IEEE025** | No | Evaluates functional Python methods for syntax correctness and block coverage; reports a structural threshold floor of **79.5%**. |

**Conclusion:** The Primary Gap (GAP-D) is **VALIDATED**. No counter-evidence exists in the selected IEEE Xplore pool.

## 4. Empirical Feasibility Gate Check
* **Final Feasibility Decision:** **SAFE TO PROCEED** (Dataset from university archives is available; tools like JaCoCo, PITEST, and DeepSeek/OpenAI APIs are accessible; execution tests require standard local computing power).
