# Gap Statement - Khang Google Scholar

## Summary from Evidence Table

From the 4 Google Scholar final included papers:

- 4/4 papers evaluate LLM-based unit test generation.
- 3/4 papers include GPT-family, ChatGPT, or Codex models explicitly.
- 3/4 papers evaluate structural test adequacy through statement/code/branch coverage.
- 2/4 papers evaluate mutation coverage or mutation score.
- 1/4 papers include a human/practitioner baseline; none directly compares against student-written tests.
- 4/4 papers focus on Java/Python or directly relevant unit-test subjects.

## GAP-M - Metric Gap

The `Metric` and `Kết quả` columns show that coverage is common, but mutation score is less consistently reported. This matters because mutation score checks fault-detection strength, not only whether generated tests execute code paths.

## GAP-D - Dataset Gap

The `Dataset` column shows that the Google Scholar evidence uses mixed datasets: benchmark suites, Java classes, Defects4J-style subjects, or small custom Python methods. Few studies explicitly isolate medium-complexity Java/Python functions/classes as the controlled population.

## GAP-C - Comparison Gap

The `Dataset`, `Metric`, and `Kết quả` columns show comparisons against EvoSuite/SBST, other LLMs, or one practitioner baseline. Direct comparison with student-written tests for the same code remains missing in this Google Scholar evidence set.

## Proposed Contribution

This study will evaluate GPT-4-generated unit tests for medium-complexity Java/Python functions using both branch coverage and mutation score, then compare the generated tests with student-written tests for the same code.
