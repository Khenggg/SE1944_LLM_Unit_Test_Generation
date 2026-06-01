# Research Question

## Main RQ

For medium-complexity Java or Python functions/classes, can GPT-4 generate unit tests that reach branch coverage >= 80% and mutation score >= 60%, compared with student-written unit tests for the same code?

## Sub-questions

1. Does the GPT-4 test set reach average branch coverage >= 80%?
2. Does the GPT-4 test set reach average mutation score >= 60%?
3. Compared with student-written tests, where is GPT-4 better, similar, or worse?
4. Which code patterns cause weak GPT-4 tests, such as missing boundary cases, weak assertions, or compile failures?

## Metrics

- Branch coverage: measured with JaCoCo for Java and coverage.py branch coverage for Python.
- Mutation score: measured with PIT/PiTest for Java and a Python mutation testing tool such as mutmut or Cosmic Ray for Python.
- Compile/pass status: generated tests must compile and run before coverage/mutation results are accepted.
- Optional effort metric: time spent writing student tests.

## Out of Scope

- Generating production code.
- UI/API/acceptance-test generation.
- Requirement-to-test generation without executable unit tests.
- Evaluating text similarity between generated and reference tests.
