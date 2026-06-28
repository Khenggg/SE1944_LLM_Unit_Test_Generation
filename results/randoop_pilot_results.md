# Randoop Pilot Test Execution Results

This file documents the results of running the Randoop-generated unit tests against all 50 `humaneval.correct` classes.

## Summary of Results

| Metric | Value | Details |
| :--- | :--- | :--- |
| **Total Test Suites** | 50 classes | Generated for both `correct` and `buggy` packages |
| **Total Test Cases** | 3,850 tests | All tests passed successfully |
| **Test Failures / Errors** | 0 | 100% pass rate |
| **JaCoCo Branch Coverage** | **68.75%** | 462 covered / 210 missed (out of 672 total branches) |
| **PITest Mutation Score** | **64.29%** | 504 killed / 146 survived / 134 uncovered (784 total mutants) |
| **PITest Test Strength** | **77.54%** | 504 killed out of 650 covered mutants |

---

## Comparison: EvoSuite vs. Randoop (All 50 Classes)

| Metric | EvoSuite | Randoop | Winner |
| :--- | :---: | :---: | :---: |
| **Total Test Cases** | 340 | **3,850** | Randoop (Generates more random inputs) |
| **JaCoCo Branch Coverage** | **95.29%** | 68.75% | EvoSuite (Search-based targeting covers more branches) |
| **PITest Mutation Score** | **71.50%** | 64.29% | EvoSuite (Higher overall mutation kill rate) |

---

## Environment Information

- **Execution Date:** 2026-06-28
- **JDK Version:** JDK 21 (Adoptium 21.0.11.10)
- **Randoop Version:** 4.3.3
- **Maven Version:** 3.9.16
- **PITest Version:** 1.7.4
- **JaCoCo Version:** 0.8.7
