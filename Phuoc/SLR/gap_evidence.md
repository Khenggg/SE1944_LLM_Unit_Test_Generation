# GAP Evidence

## Draft GAP

Previous studies have used LLMs for unit test generation, but the evidence is still limited for GPT-4 on medium-complexity Java/Python functions while measuring both branch coverage and mutation score and comparing directly with student-written manual unit tests.

## Evidence Notes

### Which papers measure coverage?

7 of the 8 strictly included empirical papers (AX001, AX003, AX005, AX006, AX007, CORE001, AX009) report structural coverage (Line, Branch, or Statement coverage):

* **Branch/Line coverage optimization**: Achieved via sequential code elimination (AX001), call-chain context insertion (AX006), method slicing (AX007), and repository-level knowledge injection (CORE001).
* **Coverage degradation**: AX003 and AX005 point out that structural coverage drops drastically when shifting from simple benchmark functions to real-world code with high cyclomatic complexity. AX009 demonstrates that coverage degrades significantly when code undergoes refactoring or evolution.

### Which papers measure mutation score?

2 of the 8 empirical papers (AX003, AX007) explicitly measure mutation score to assess fault-detection capabilities:

* **Key Findings**: AX003 reveals that while LLMs achieve high coverage on standard benchmarks, their mutation scores plummet (down to ~41%) on un-leaked real-world functions. AX007 utilizes mutation testing to prove that method slicing does not compromise the functional semantic verification of the generated tests.
* **The Gap**: The majority of current studies rely entirely on structural coverage (Line/Branch) as their primary metric, neglecting the actual quality and fault-detection power (mutation score) of the generated code.

### Which papers compare against manual tests, EvoSuite, Randoop, or developer tests?

* **vs. manual/developer tests**: AX003 compares LLM performance against reference developer tests using the TestEval framework. AX009 evaluates LLM tests against original open-source project test suites during software evolution.
* **vs. EvoSuite**: AX005 and AX007 use EvoSuite as a primary search-based software testing (SBST) baseline.
* **vs. Search-based / Plain LLM methods**: AX001 benchmarks against standard search-based methods, while AX006 (vs. PANTA) and CORE001 benchmark against state-of-the-art plain LLM generation baselines.
* **No study directly compares GPT-4 to student-written manual unit tests** — this remains an unaddressed empirical gap, especially within academic and capstone (SE1944) contexts.

### Which papers use Java/Python?

* **Java**: AX002, AX005, AX006, AX007, CORE001 (5 papers)
* **Python**: AX001, AX002, AX003, AX007, CORE001, AX009 (6 papers)
* *Note: AX002, AX007, and CORE001 are cross-language studies evaluating both Java and Python ecosystems.*

### Which limitations justify this project?

1. **Absence of a Student Baseline**: Existing literature focuses purely on comparing LLMs with seasoned professional developers or automated tools (EvoSuite), failing to assess how LLM-generated suites compare directly against the manual test-writing capabilities of software engineering students.
2. **Uncontrolled Cyclomatic Complexity**: Except for AX007 (which uses method slicing), current studies do not systematically stratify their datasets to evaluate the specific threshold of "medium cyclomatic complexity" (CC=5–15).
3. **The Dual-Metric Evaluation Gap**: There is a lack of simultaneous verification ensuring that an LLM can hit both high structural boundaries (Branch coverage ≥80%) and high fault-detection thresholds (Mutation score ≥60%) on non-trivial, multi-file code structures.

---

## Identified Research Gap

**No existing study evaluates GPT-4 automatic test generation specifically on Java/Python functions at medium cyclomatic complexity (CC=5–15) while simultaneously measuring both branch coverage (≥80%) and mutation score (≥60%) and comparing the results against student-written manually-written unit tests.**
