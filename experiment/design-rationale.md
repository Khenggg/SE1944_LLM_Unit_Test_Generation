# Experiment Design Rationale - LLM-based Unit Test Generation

Date: 2026-06-04  
GAP source: `SLR/gap-analysis.md`  
Evidence source: `SLR/evidence-table.md`

## 1. Design Decision Table

| Decision | Value | Source from evidence table / GAP analysis |
|---|---|---|
| LLM/tool | GPT-4o mini or another ChatGPT-compatible LLM; exact model and access date must be recorded during experiment execution. | GAP-T; ACM001, ACM002, ACM005, ACM007, and ACM009 all involve ChatGPT/LLM-based unit test generation. |
| Baseline prompt strategy | Zero-shot prompt. | Simple baseline for LLM-generated unit tests; suitable for a comparative RQ. |
| Intervention prompt strategy | Structured/chain-of-thought prompt with explicit testing requirements. | ACM005 is related to Chain-of-Thought prompting and coverage feedback. |
| Dataset / subject programs | 5-10 unit-test-generation tasks or small real-world functions for mini-pilot. Expand only if the pipeline works. | ACM001 uses unit test generation tasks; ACM007 uses real-world functions. |
| Programming language and framework | One framework only: Python + pytest is preferred; Java + JUnit is the backup. | One consistent framework is required for stable coverage/mutation measurement. |
| Main metric 1 | Mutation score. | ACM001 and ACM007 include mutation score; ACM006 focuses on mutant information. |
| Main metric 2 | Branch coverage. | ACM007 includes branch coverage; coverage metrics are common across the table. |
| Secondary metric | Pass rate / number of compilable tests. | ACM009 uses pass rate; pass/fail filtering is needed because LLM output may contain syntax or runtime errors. |
| Baseline type | Comparative baseline: structured/CoT prompt vs zero-shot prompt. | This avoids unsupported absolute threshold values and fits RBL-2 comparative claim format. |
| Threshold RQ1 | No absolute numerical threshold. The comparison is whether structured/CoT has higher mutation score than zero-shot. | Evidence table lacks exact numerical results for a Case 1 or Case 2 threshold. |
| Threshold RQ2 | No absolute numerical threshold. The comparison is whether structured/CoT has higher branch coverage than zero-shot. | Same reason as RQ1. |
| Statistical test | Wilcoxon signed-rank test for paired data; Mann-Whitney U only if the data become unpaired. | Both mutation score and branch coverage are numeric. The planned design tests the same tasks under both prompt strategies, so paired non-parametric testing is preferred. |
| Pipeline base | ACM007 - Benchmarking LLMs for Unit Test Generation from Real-World Functions. | Closest base paper because it includes real-world functions, branch coverage, and mutation score. |

## 2. Threshold Rationale

This RBL-2 design does **not** use an absolute threshold such as `mutation score >= 0.80` or `branch coverage >= 85%`.

Reason: the current `SLR/evidence-table.md` contains metric names and result summaries, but it does not provide enough exact numerical values to justify a Case 1 or Case 2 threshold. Choosing a number without evidence would violate the RBL-2 rule that every design decision must trace back to the evidence table.

Therefore, the project uses a **comparative claim**:

> Structured/chain-of-thought prompting is compared against zero-shot prompting on the same tasks using mutation score and branch coverage.

This is allowed because the baseline is a specific system/setting instead of an unsupported numerical threshold.

## 3. Pipeline Design

The experiment will follow this pipeline:

1. Select 5-10 small functions/tasks.
2. For each task, generate unit tests using a zero-shot prompt.
3. For the same task, generate unit tests using a structured/chain-of-thought prompt.
4. Run the generated tests.
5. Remove or separately count tests that do not compile or do not run.
6. Measure branch coverage.
7. Measure mutation score.
8. Compare the two prompt strategies per task.

## 4. Prompt Strategy Definition

| Prompt strategy | Description |
|---|---|
| Zero-shot | The model receives the function/source code and is directly asked to generate unit tests. No examples or structured testing checklist are provided. |
| Structured/CoT | The model receives the function/source code and is asked to reason about input classes, edge cases, expected outputs, and then generate unit tests. The final answer must contain only executable tests. |

## 5. Mini-pilot Plan

| Item | Plan |
|---|---|
| Number of tasks | 5-10 functions |
| Number of prompt strategies | 2 strategies: zero-shot and structured/CoT |
| Number of generations | 1 generation per task/strategy minimum; 3 generations if time allows |
| Main metric | Mutation score |
| Secondary metric | Branch coverage |
| Extra validity metric | Pass rate or compilable-test rate |
| Preferred tool stack | Python + pytest + coverage.py + mutmut |
| Backup tool stack | Java + JUnit + JaCoCo + PIT |

## 6. Risk Mitigation

| Risk | Mitigation |
|---|---|
| Public benchmark cannot be downloaded | Use 5-10 small public functions or tasks and document the selection. |
| LLM API is expensive | Use GPT-4o mini, manual ChatGPT generation, or an open-source model. |
| Mutation testing is slow | Reduce number of functions or run mutation testing only on the final passing test sets. |
| Generated tests do not compile | Record pass rate and only compute coverage/mutation score for runnable tests. |
| Timeline is too tight | Keep only RQ1 as primary and report RQ2 as secondary. |
