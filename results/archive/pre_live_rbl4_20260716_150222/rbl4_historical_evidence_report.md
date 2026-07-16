# RBL-4 Historical Evidence Report

**Recorded:** 2026-07-16  
**Status:** Recovered historical evidence; not a new API execution.

## 1. Purpose and evidence boundary

This report consolidates previously generated GPT and EvoSuite artefacts that were recovered from the repository history. No OpenAI request, test generation, or metric measurement was performed on 2026-07-16 for this report.

The report supports an RBL-4 **historical/descriptive** account only. It must not be presented as a fresh run, as a comparison against students, or as a valid paired GPT-versus-EvoSuite hypothesis test. The operational-baseline decision and its claim boundary are recorded in [the RBL-4 amendment](../docs/team-synthesis/amendments/rbl4-operational-baseline.md).

## 2. Artefacts recovered and used

| Artefact | Scope | Use in this report |
| --- | --- | --- |
| [gpt_results.md](gpt_results.md) | GPT, 63 SUT | Historical Full-run aggregate and class-level metrics. |
| [pilot_api_log.txt](pilot_api_log.txt) | GPT, 6 SUT | API metadata for two historical Pilot attempts. |
| [pilot_llm_output.csv](pilot_llm_output.csv) | GPT, 6 SUT | Latest Pilot API output/cost/token record. |
| [pilot_results.md](pilot_results.md) | GPT, 6 SUT | Historical Pilot class-level measurements and issue log. |
| [pilot_analysis.ipynb](pilot_analysis.ipynb) | GPT, 6 SUT | Recovered analysis notebook; JSON validity checked. |
| [evosuite_results.md](evosuite_results.md) | EvoSuite, 63 SUT | EvoSuite 1-, 3-, and 5-minute aggregate results. |
| [evosuite_pilot_results.md](evosuite_pilot_results.md) | EvoSuite, 63 SUT | Cross-check and extended budgets (10, 15, 30, 60 minutes). |

The original generated GPT sources are also retained, separately from active tests:

- Pilot: `experiments/rbl-project/gpt_backups/pilot/run_1_20260703_090441` (6 test classes).
- Full: `experiments/rbl-project/gpt_backups/full/run_2_20260703_141512` (63 test classes).

## 3. What the `SE1944-compare-run-pilot` folder is

`SE1944-compare-run-pilot` is a historical Pilot/feasibility snapshot, not an EvoSuite-only folder. It contains:

- GPT Pilot artefacts: `pilot_api_log.txt`, `pilot_llm_output.csv`, `pilot_results.md`, and `pilot_analysis.ipynb`.
- EvoSuite feasibility results for the 63-SUT set, including 1/3/5-minute budgets and an extended 10/15/30/60-minute report.
- Archived EvoSuite generated tests under `experiments/rbl-project/archive/`, including `evosuite_10p` and `evosuite_15p`.

Its `.git` file points to an old Linux worktree location, so the folder should be treated as a readable historical snapshot. The canonical working repository is `SE1944_LLM_Unit_Test_Generation`.

## 4. Historical result summary

### 4.1 GPT Full Run — 63 SUT

| Metric | Historical result |
| --- | ---: |
| SUT classes | 63 |
| JaCoCo branch coverage | **97.38%** (742/762 branches) |
| PITest mutation score | **90.62%** (812/896 mutations) |

The recovered full report also contains the class-level values for all 63 SUT classes.

### 4.2 GPT Pilot — 6 SUT

**Sample measured in the recovered Pilot output:** `BF`, `COUNT_NUMS`, `FILE_NAME_CHECK`, `FIND_ZERO`, `ORDER_BY_POINTS`, and `SEARCH`.

| Metric | Historical result |
| --- | ---: |
| Mean branch coverage across the 6 listed SUT | **93.61%** |
| Mean mutation score across the 6 listed SUT | **87.27%** |
| Aggregate project branch coverage stated in the Pilot report | 9.90% (77/778) |
| Aggregate project mutation score stated in the Pilot report | 89.49% (817/913) |

The API log records two Pilot attempts on 2026-07-02, six successful calls in each attempt. The CSV corresponds to the later attempt and identifies model `gpt-4o-mini-2024-07-18`.

### 4.3 EvoSuite historical results — 63 SUT

| Metric | 1 minute | 3 minutes | 5 minutes |
| --- | ---: | ---: | ---: |
| Generated test files | 63 | 63 | 63 |
| JaCoCo branch coverage | 90.49% (704/778) | 95.89% (746/778) | 99.36% (773/778) |
| PITest mutation score | 91.18% (775/850) | 91.88% (781/850) | 92.47% (786/850) |
| Generated test cases | 398 | 417 | 432 |
| Generation wall-clock time | ~3.5 min | ~8.3 min | ~12.6 min |

The historical extended report indicates that EvoSuite branch coverage plateaued at 99.61% (775/778) at 30 and 60 minutes. That extended series is contextual only; the current operational amendment uses the separate 1/3/5-minute budgets.

## 5. Important comparability limitations

The values above must **not** be used as raw paired statistical inputs yet:

1. **Different branch denominators:** GPT Full reports 762 branches; EvoSuite reports 778 branches.
2. **Different mutation denominators:** GPT Full reports 896 mutations; EvoSuite 1/3/5-minute runs report 850 mutations.
3. **EvoSuite exclusions:** its mutation scores exclude `FIND_ZERO`, `PRIME_FIB`, and `IS_MULTIPLY_PRIME`; longer budgets exclude `GET_MAX_TRIPLES` as well.
4. **GPT test repair:** the Pilot report records insertion of `@org.junit.Ignore` for failing or non-terminating generated tests before mutation measurement. Ignored/failing tests must be reported separately in any future analysis.
5. **Pilot sample mismatch in historical notes:** the snapshot's `notes.md` lists a different seed-42 sample than the recovered Pilot CSV/report. The recovered API log, CSV, and Pilot report agree with each other, so this report treats those three artefacts as the primary Pilot evidence and flags `notes.md` as stale.
6. **No student data:** none of these artefacts measure student-written test suites. EvoSuite is an automated technical comparator, not a proxy for students.

## 6. Report-ready wording

> Historical artefacts were recovered from repository history after accidental local deletion. The recovered Full GPT run reports 97.38% branch coverage and 90.62% mutation score across 63 HumanEval-Java SUT classes. A separate EvoSuite feasibility series reports 90.49%/91.18% at a 1-minute budget, 95.89%/91.88% at 3 minutes, and 99.36%/92.47% at 5 minutes for branch coverage/mutation score. Because the historical measurement pipelines have different branch and mutation denominators, and because the EvoSuite mutation analysis excludes specific SUT classes, these figures are presented descriptively only and are not used for paired statistical inference. The student-written benchmark comparison remains deferred.

## 7. Required next step before inferential comparison

Re-measure the archived GPT Full tests and each EvoSuite 1/3/5-minute test suite with one fixed, documented pipeline; record the same SUT inclusion set, branch denominator, mutation denominator, ignored tests, and per-SUT result rows. Only then can the RQ3 paired Wilcoxon comparisons be run separately for each EvoSuite budget.
