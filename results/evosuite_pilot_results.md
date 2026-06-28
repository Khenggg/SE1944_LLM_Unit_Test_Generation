# EvoSuite Pilot Test Execution Results

This file documents the results of running the EvoSuite-generated unit tests against the 50 `humaneval.correct` classes.

## Summary of Results

| Metric | Value | Details |
| :--- | :--- | :--- |
| **Total Test Suites** | 50 classes | Successfully compiled and executed |
| **Total Test Cases** | 340 tests | All tests passed successfully |
| **Test Failures / Errors** | 0 | 100% pass rate |
| **JaCoCo Branch Coverage** | **95.29%** | 648 covered / 32 missed (out of 680 total branches) |
| **PITest Mutation Score** | **71.50%** | 567 killed / 198 survived / 28 uncovered (793 total mutants) |

---

## Detailed JaCoCo Branch Coverage (humaneval/correct)

- **Covered Branches:** 648
- **Missed Branches:** 32
- **Total Branches:** 680
- **Branch Coverage Percentage:** 95.29%
- **Overall Project Coverage (including packages under test):** 49.85%

## Detailed PITest Mutation Score (humaneval.correct.* SUT)

- **Killed/Detected Mutants:** 567
- **Survived Mutants:** 198
- **No Coverage Mutants:** 28
- **Total Generated Mutants:** 793
- **Mutation Score Percentage:** 71.50%

---

## Environment Information

- **Execution Date:** 2026-06-28
- **JDK Version:** JDK 21 (Adoptium 21.0.11.10)
- **Maven Version:** 3.9.16
- **PITest Version:** 1.7.4
- **JaCoCo Version:** 0.8.7
