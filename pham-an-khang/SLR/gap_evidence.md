# GAP Evidence

## Draft GAP

Previous studies have used LLMs for unit test generation, but the evidence is still limited for GPT-4 on medium-complexity Java/Python functions while measuring both branch coverage and mutation score and comparing directly with hand-crafted manual unit tests.

## Evidence Notes

### Which papers measure coverage?

6 of the 7 strictly included papers (SS001, SS006, SS007, SS008, SS009, SS011) report branch coverage:

- **Branch coverage ≥80% achieved** by: SS011 (Multi-LLM Chaining, 99.05% on Java), SS008 (80% median, 89% overall on Python).
- **Branch coverage <80%** by: SS006 (30.22% on Java), SS009 (35.2% on Python).
- Branch coverage is highly dependent on prompting strategy and cyclomatic complexity. On complex repositories (SS006, SS009), vanilla prompting falls far short of the 80% threshold, while coverage-guided feedback loops (SS008) or method slicing (SS007) significantly improve outcomes.

### Which papers measure mutation score?

5 of the 7 strictly included papers (SS001, SS004, SS006, SS009, SS011) report mutation score:

- **Mutation score ≥60% achieved** by: SS001 (MUTGEN, 89.5%), SS004 (MuTAP, 93.57%), SS011 (Multi-LLM Chaining, 94.32%).
- **Mutation score <60%** by: SS006 (40.21%).
- Mutation-feedback loop techniques (SS001, SS004, SS011) achieve exceptionally high mutation scores, whereas vanilla GPT-4 prompting on complex Java classes (SS006) achieves only 40.21%.

### Which papers compare against manual tests, EvoSuite, Randoop, or developer tests?

- **vs. manual/developer tests**: Only SS009 (TestGenEval) compares GPT-4o to developer-written tests, serving as the closest to our Comparison (C).
- **vs. EvoSuite**: SS001, SS006, SS007
- **vs. Randoop**: SS001, SS011
- **No study directly compares GPT-4 to student-written manual unit tests** — this is the primary gap.

### Which papers use Java/Python?

- **Java**: SS001, SS006, SS007, SS011 (4 papers)
- **Python**: SS004, SS008, SS009 (3 papers)

### Which limitations justify this project?

1. **No GPT-4 vs. student manual tests comparison**: No study directly compares GPT-4 automated tests to student-written/manually-written unit tests as the primary comparator.
2. **Cyclomatic complexity not controlled**: Only SS007 (HITS) decomposes complex methods specifically. The other papers do not stratify or control results specifically for "medium cyclomatic complexity" (CC=5–15).
3. **Dual-metric evaluation gap**: While 5 papers report both metrics, simultaneous achievement of both branch coverage (≥80%) and mutation score (≥60%) is only achieved on simple algorithmic benchmarks (SS011, SS001) rather than real-world complex code.

## Identified Research Gap

**No existing study evaluates GPT-4 automatic test generation specifically on Java/Python functions at medium cyclomatic complexity (CC=5–15) while simultaneously measuring both branch coverage (≥80%) and mutation score (≥60%) and comparing the results against student-written manually-written unit tests.**
