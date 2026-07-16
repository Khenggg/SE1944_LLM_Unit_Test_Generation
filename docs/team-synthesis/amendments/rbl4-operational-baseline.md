# RBL-4 Amendment: Operational Evaluation Baseline

**Recorded:** 2026-07-16  
**Meeting date:** To be completed from the group meeting minutes.  
**Status:** Operational decision recorded; instructor confirmation pending.

## Reason for the amendment

The original proposal defines student-written benchmark tests as the desired paired comparator. The team does not yet have validated, per-function student measurements produced by the same build, JaCoCo, and PIT pipeline. Reporting a numerical GPT-versus-student comparison without those measurements would be unsupported.

## Operational decision for RBL-4

For the current RBL-4 execution, use the existing EvoSuite results as the technical operational comparator on the same 63 SUT, at three separately recorded fixed budgets: **1 minute, 3 minutes, and 5 minutes**. Keep the student-written benchmark in the proposal as the original research motivation and a deferred follow-up evaluation.

## Claim boundary

- The RBL-4 results support only comparisons between GPT-4o-mini and EvoSuite at the stated budget.
- EvoSuite is not a proxy for students. Do not label its scores as student scores, average them into a student score, or infer student performance from them.
- The student-written comparison is reported as unavailable/deferred because the corresponding per-function evidence has not been measured and verified.

## Analysis rule

For each EvoSuite budget, pair outcomes by SUT and compare GPT with EvoSuite separately for branch coverage and mutation score. Use a two-tailed paired Wilcoxon signed-rank test on executable paired suites, then apply Holm correction across the six RQ3 tests (three budgets times two metrics). An arithmetic mean over 1/3/5 minutes may appear only as a descriptive summary; it is not the primary comparator for hypothesis testing.

## Reproducibility records

For each GPT run, retain the API log, the LLM output CSV, the metric report, and the generated tests in a timestamped archive. Generated tests are moved to an archive after measurement; they are not deleted. The active measurement directory is cleared only after those artefacts are preserved.
