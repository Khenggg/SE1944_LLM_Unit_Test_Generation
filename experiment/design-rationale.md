# Experiment Design Rationale - LLM-based Unit Test Generation

Date: 2026-06-04  
GAP source: `SLR/gap-analysis.md`  
Evidence source: `SLR/evidence-table.md`

## 1. Design Decision Table

| Decision                           | Value                                                                                                                                  | Source from evidence table / GAP analysis                                                                                                                                                                                          |
| ---------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Primary GAP                        | GAP-M - Metric Gap                                                                                                                     | The evidence table includes coverage, branch coverage, mutation score, mutation testing, pass rate, and test effectiveness, but mutation score is not consistently used as the primary comparison metric across prompt strategies. |
| Secondary GAP                      | GAP-T - Prompt Strategy / Technology Gap                                                                                               | Prompt design and pipeline differences appear in ACM002 and ACM005, but the table does not show one controlled zero-shot vs structured/CoT comparison using mutation score as the primary outcome.                                 |
| LLM/tool                           | One accessible ChatGPT-compatible LLM, preferably GPT-4o mini; exact model and date must be recorded during experiment execution.      | ACM001, ACM002, ACM005, ACM007, and ACM009 all involve ChatGPT/LLM-based unit test generation.                                                                                                                                     |
| Baseline prompt strategy           | Zero-shot prompt.                                                                                                                      | A simple baseline setting for LLM-generated unit tests.                                                                                                                                                                            |
| Intervention prompt strategy       | Structured/chain-of-thought prompt with explicit testing requirements.                                                                 | ACM005 is related to Chain-of-Thought prompting and coverage feedback.                                                                                                                                                             |
| Dataset / subject programs         | 5-8 small Python functions from public programming exercises or small open-source utility functions.                                   | Downscoped from GAP-D risk; ACM001 uses unit test generation tasks and ACM007 uses real-world functions.                                                                                                                           |
| Programming language and framework | Python only, using pytest.                                                                                                             | Python-only scope reduces implementation risk and keeps the experiment feasible.                                                                                                                                                   |
| Main metric                        | Mutation score.                                                                                                                        | ACM001 and ACM007 include mutation score; ACM006 focuses on mutant information. This directly supports the selected GAP-M.                                                                                                         |
| Secondary metric                   | Branch coverage.                                                                                                                       | ACM007 includes branch coverage; coverage metrics are common across the evidence table.                                                                                                                                            |
| Validity / filtering metric        | Pass rate or compilable-test rate.                                                                                                     | ACM009 uses pass rate; this is needed because generated tests may fail to run.                                                                                                                                                     |
| Baseline type                      | Comparative baseline: structured/CoT prompt vs zero-shot prompt.                                                                       | This avoids unsupported absolute threshold values and follows the RBL-2 comparative claim format.                                                                                                                                  |
| Threshold RQ1                      | No absolute numerical threshold. RQ1 compares whether structured/CoT produces higher mutation score than zero-shot on the same tasks.  | `SLR/evidence-table.md` lacks enough exact numerical scores for a Case 1 or Case 2 threshold.                                                                                                                                      |
| Threshold RQ2                      | No absolute numerical threshold. RQ2 compares whether structured/CoT produces higher branch coverage than zero-shot on the same tasks. | Same reason as RQ1.                                                                                                                                                                                                                |
| Statistical test                   | Wilcoxon signed-rank test.                                                                                                             | Mutation score and branch coverage are numeric outputs. The same tasks are tested under two prompt strategies, so the data are paired.                                                                                             |
| Pipeline base                      | ACM007 - Benchmarking LLMs for Unit Test Generation from Real-World Functions.                                                         | Closest base paper because it includes real-world functions, branch coverage, and mutation score.                                                                                                                                  |
| Role of ACM010/ACM011              | Related-work/background only.                                                                                                          | These survey/background records are not used as primary empirical evidence for threshold, metric, or pipeline decisions.                                                                                                           |

## 2. Threshold Rationale

This RBL-2 design does **not** use an absolute threshold such as `mutation score >= 0.80` or `branch coverage >= 85%`.

Reason: the current `SLR/evidence-table.md` contains metric names and result summaries, but it does not provide enough exact numerical values to justify a Case 1 or Case 2 threshold. Choosing a number without evidence would violate the RBL-2 rule that every design decision must trace back to the evidence table.

Therefore, the project uses a **comparative claim**:

> Structured/chain-of-thought prompting is compared against zero-shot prompting on the same tasks using mutation score and branch coverage.

This is valid for RBL-2 because the comparison baseline is a specific system/setting rather than an unsupported numerical value.

## 3. Pipeline Design

1. Select 5-8 small Python functions from public programming exercises or simple open-source utility files.
2. For each function, generate unit tests using a zero-shot prompt.
3. For the same function, generate unit tests using a structured/chain-of-thought prompt.
4. Run generated tests with pytest.
5. Record pass rate or compilable-test rate.
6. Compute branch coverage with coverage.py.
7. Compute mutation score with mutmut.
8. Compare zero-shot and structured/CoT results per task.

## 4. Prompt Strategy Definition

| Prompt strategy | Description                                                                                                                                                                                           |
| --------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Zero-shot       | The model receives the function/source code and is directly asked to generate unit tests. No examples or structured testing checklist are provided.                                                   |
| Structured/CoT  | The model receives the function/source code and is asked to identify input classes, edge cases, expected outputs, and then generate tests. The final answer must contain only executable pytest code. |

## 5. Mini-pilot Plan

| Item                        | Plan                                                                              |
| --------------------------- | --------------------------------------------------------------------------------- |
| Number of tasks             | 5-8 Python functions                                                              |
| Number of prompt strategies | 2 strategies: zero-shot and structured/CoT                                        |
| Number of generations       | 1 generation per task per strategy for the pilot                                  |
| Main metric                 | Mutation score                                                                    |
| Secondary metric            | Branch coverage                                                                   |
| Validity metric             | Pass rate / compilable-test rate                                                  |
| Tool stack                  | Python + pytest + coverage.py + mutmut                                            |
| Downscope rule              | If time is tight, keep only RQ1 and report RQ2 as descriptive secondary analysis. |

## 6. Risk Mitigation

| Risk                                  | Mitigation                                                                                                                       |
| ------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| Public benchmark cannot be downloaded | Do not depend on a large benchmark. Use 5-8 small public Python functions and document the source of each function.              |
| LLM API is expensive or unavailable   | Use one accessible model only. Use GPT-4o mini or manual ChatGPT generation. Keep one generation per task/strategy in the pilot. |
| Mutation testing is slow              | Use small functions only. Run mutation testing only after tests pass. Reduce N before changing metric.                           |
| Generated tests do not compile        | Record pass rate separately. Compute mutation score and branch coverage only for runnable test files.                            |
| Timeline becomes tight                | Keep RQ1 as the only confirmatory RQ. Treat branch coverage as secondary/descriptive.                                            |

## 7. Final Design Decision

The final design selects **GAP-M as the primary GAP** and **GAP-T as the secondary GAP**. The experiment will compare zero-shot and structured/chain-of-thought prompting on the same Python unit-test-generation tasks. The main outcome is mutation score, with branch coverage as a secondary metric. Because the evidence table does not provide valid numerical thresholds, the study uses a comparative baseline rather than an absolute threshold.
