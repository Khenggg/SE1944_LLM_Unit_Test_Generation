# Inclusion / Exclusion Criteria

## Inclusion Criteria

- **IC1 - Language**: Paper is written in English.
- **IC2 - Time**: Paper was published from 2023 onwards (GPT-4 and its variants are released from 2023 onwards).
- **IC3 - Purpose**: Paper evaluates unit-level testing (specifically targeting function-level or method-level units) rather than integration, system, or end-to-end testing.
- **IC4 - Target**: Paper evaluates test generation for Java and/or Python source code, providing separate, isolatable results for these languages.
- **IC5 - Model**: Paper evaluates the utilization of GPT-4 (including all specific variants like GPT-4-Turbo, GPT-4o, or GPT-4o-mini) for generating the test cases.
- **IC6 - Baseline**: Paper compares GPT-4 automatic generation of unit test cases against a manual (human-written by developers or students) test suite baseline.
- **IC7 - Evaluation**: Paper reports empirical quantitative evaluation metrics for both branch coverage and mutation score (or provides sufficient data to determine them).

## Exclusion Criteria

- **EC1 - Duplication**: Duplicate paper already represented by another record.
- **EC2 - Access**: Open PDF or any access link that could access the full text of the paper cannot be found.
- **EC3 - Scope**: Paper focuses only on high-level testing (e.g., API, UI, system, or integration testing), general code generation, or other software engineering tasks rather than unit test case generation.
- **EC4 - Model**: Paper only evaluates older GPT models (e.g., GPT-2, GPT-3) or completely unrelated models without providing separate, isolated performance data for GPT-4.
- **EC5 - Metrics**: Paper does not report empirical quantitative evaluation metrics for branch coverage or mutation testing/score (or does not contain metrics related to coverage and test adequacy).
- **EC6 - Publication**: Paper has no clear publication venue or has not been peer reviewed.
- **EC7 - Size**: The full text of the paper has only 4 pages or less (not enough content).

## Screening Rule

If a paper is `UNSURE` in title/abstract screening, keep it for full-text screening.
