# GAP Analysis - LLM-based Unit Test Generation with Coverage and Mutation Testing

Evidence table: `SLR/evidence-table.md`  
Evidence table size: N = 11 papers  
Date: 2026-06-04  
RBL-1 source files: `SLR/evidence-table.md`, `SLR/gap-statement.md`

## 1. Evidence Table Gate Check

| Gate                  | Pass if                              | Result from current evidence table                                                                                   | Status                                                                       |
| --------------------- | ------------------------------------ | -------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| P1: Number of papers  | At least 5 papers                    | 11 papers are listed from ACM001 to ACM011.                                                                          | ✅ Pass                                                                      |
| P2: Tool/LLM column   | At least 90% of rows filled          | All 11 rows have a tool/model/source type such as ChatGPT, LLMs, generative AI tools, or survey/background LLMs.     | ✅ Pass                                                                      |
| P3: Result column     | At least 50% of rows contain results | Most rows contain result summaries; however, many results are descriptive rather than exact numerical values.        | ✅ Pass for GAP analysis, but not enough for an absolute numerical threshold |
| P4: Limitation column | At least 50% of rows filled          | 11/11 rows include limitations or notes.                                                                             | ✅ Pass                                                                      |
| P5: Metric column     | Specific metrics are named           | Metrics include code coverage, branch coverage, mutation score, mutation testing, pass rate, and test effectiveness. | ✅ Pass                                                                      |

**Decision:** The evidence table is sufficient to continue RBL-2. However, the table does not provide enough exact numerical results to justify an absolute threshold such as `0.85` or `80%`. Therefore, the final RQ should use a comparative claim instead of an unsupported absolute threshold.

## 2. GAP Table

| Source column | Finding from evidence table                                                                                                                                             | GAP type      | Evidence / counter-check                                                                                                                                                |
| ------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Tool/LLM      | Several studies use ChatGPT, LLMs, generative AI tools, or pre-trained LLMs, but the prompt strategy and pipeline are not standardized across studies.                  | GAP-T         | ACM001, ACM002, ACM005, ACM007, and ACM009 all involve LLM-based test generation, but they do not provide one shared prompt/pipeline setting.                           |
| Dataset       | The selected studies use different task sources such as unit test generation tasks, benchmarks, mutation-guided tasks, real-world functions, or tool-specific settings. | GAP-D         | ACM001 uses unit test generation tasks; ACM007 uses real-world functions; ACM009 is a tool-based setting.                                                               |
| Metric        | Coverage metrics appear frequently, while mutation score or mutation testing is less consistently used across all prompt/model settings.                                | GAP-M         | ACM001 and ACM007 mention mutation score; ACM006 uses mutant information; several other papers focus on coverage, pass rate, or test effectiveness.                     |
| Limitation    | Repeated limitations include benchmark size, prompt dependence, model version dependence, and generalization across datasets/projects.                                  | GAP-S         | ACM001, ACM002, ACM005, ACM006, and ACM007 report limitations connected to prompt, benchmark, or generalization.                                                        |
| Comparison    | Direct comparison between different prompt strategies in the same setting using both branch coverage and mutation score is still limited in this evidence table.        | GAP-T + GAP-M | ACM007 is the closest paper because it uses real-world functions with branch coverage and mutation score, but the gap remains for a focused prompt-strategy comparison. |

## 3. Selected Primary GAP

**Primary GAP:** GAP-M + GAP-T

Existing LLM-based unit test generation studies often evaluate generated tests with coverage-related metrics. Mutation score appears in some papers, but it is not used consistently across different prompt strategies and pipelines. At the same time, the evidence table shows that prompt design and pipeline choices can affect the quality of generated unit tests. Therefore, this project focuses on comparing LLM-generated unit tests under different prompt strategies in the same experimental setting, using both **mutation score** and **branch coverage**.

## 4. Secondary GAP

**Secondary GAP:** GAP-D

The evidence table also shows that datasets and subject programs are not fully standardized across the selected papers. This makes cross-paper comparison difficult. However, GAP-D is not selected as the primary GAP because creating or collecting a new dataset would be too risky for the RBL-2 timeline. The project will instead reduce this risk by using a small controlled set of unit-test-generation tasks or real-world functions.

## 5. Mandatory Counter-evidence Check for the Primary GAP

**GAP claim:** There is limited evidence in the selected SLR set that compares LLM prompt strategies in the same unit-test-generation setting using both branch coverage and mutation score.

| Paper                                                                                                                 | Has this already been done? | Counter-evidence note                                                                                                                                                                                                        |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ACM001 - An Initial Investigation of ChatGPT Unit Test Generation Capability                                          | Partly                      | Uses ChatGPT and includes code coverage/mutation score, but does not clearly focus on comparing multiple prompt strategies in one controlled setting.                                                                        |
| ACM002 - Evaluating and Improving ChatGPT for Unit Test Generation                                                    | Partly                      | Focuses on improving ChatGPT for unit test generation, but the evidence table does not show a controlled comparison using both branch coverage and mutation score as the main combined metrics.                              |
| ACM003 - Unit Test Generation using Generative AI: A Comparative Performance Analysis of Autogeneration Tools         | Partly                      | Comparative performance is relevant, but the limitation says it has not deeply focused on mutation testing.                                                                                                                  |
| ACM004 - On the Evaluation of Large Language Models in Unit Test Generation                                           | Partly                      | Discusses evaluation of LLM-generated tests and suitable metrics, but the evidence table does not show a full controlled prompt-strategy experiment.                                                                         |
| ACM005 - Automated Unit Test Generation via Chain-of-Thought Prompt and Reinforcement Learning from Coverage Feedback | Partly                      | Very relevant to structured/CoT prompting and coverage feedback, but it still needs verification on more projects/datasets and is not enough to remove the proposed GAP.                                                     |
| ACM006 - PRIMG: Efficient LLM-driven Test Generation Using Mutant Information                                         | Partly                      | Strongly related to mutation-guided generation, but it focuses on mutant information rather than a general comparison between zero-shot and structured/CoT prompting.                                                        |
| ACM007 - Benchmarking LLMs for Unit Test Generation from Real-World Functions                                         | Strong partial match        | This is the closest base paper because it uses real-world functions, branch coverage, and mutation score. It will be used as the base pipeline reference, but the proposed focused prompt-strategy comparison remains valid. |
| ACM008 - Effective Test Generation Using Pre-trained Large Language Models                                            | Partly                      | Uses coverage/test effectiveness, but the evidence table does not show mutation score as a central metric.                                                                                                                   |
| ACM009 - ChatUniTest: A ChatGPT-based Automated Unit Test Generation Tool                                             | Partly                      | Tool paper with coverage/pass rate, but not focused on mutation testing or controlled prompt-strategy comparison.                                                                                                            |
| ACM010 - Software Testing with Large Language Models                                                                  | No                          | Background/survey paper, not a direct experiment.                                                                                                                                                                            |
| ACM011 - A Survey on Large Language Models for Software Testing                                                       | No                          | Survey/background paper, useful for related work but not a direct experiment.                                                                                                                                                |

**Conclusion:** The primary GAP is not rejected. ACM007 is the closest counter-example and should be treated as the main base paper, but the final project can still contribute by narrowing the experiment to prompt-strategy comparison under the same benchmark and metrics.

## 6. Feasibility Check for the Primary GAP

| Criterion    | Self-check question                                        | Level | Notes / mitigation                                                                                                                                                                                              |
| ------------ | ---------------------------------------------------------- | ----- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Dataset      | Is the dataset public and immediately usable?              | ⚠️    | The evidence table mentions unit-test-generation tasks and real-world functions but does not include a ready-to-download dataset link. Mitigation: use 5-10 small public functions or tasks for the mini-pilot. |
| Tool/API     | Is the LLM/tool accessible with a free or low-cost option? | ⚠️    | GPT/API use may cost money. Mitigation: use GPT-4o mini, ChatGPT manual prompting for a small N, or an open-source LLM if available.                                                                            |
| Compute      | Can it run on normal hardware?                             | ✅    | Coverage and mutation testing for small Python/Java tasks can run on CPU. GPU is not required if generation is done through API/web.                                                                            |
| Ground truth | Is manual labeling required?                               | ✅    | No manual label is needed. Coverage and mutation score are computed by tools.                                                                                                                                   |
| Skills       | Can the group implement the pipeline?                      | ⚠️    | Requires unit testing and mutation testing skills. Mitigation: use a simple stack such as Python + pytest + coverage.py + mutmut, or Java + JUnit + JaCoCo + PIT.                                               |
| Time         | Can the experiment be completed on time?                   | ✅    | A 5-10 function mini-pilot is feasible. Full experiment can be expanded only if the pilot works.                                                                                                                |
| Contribution | Is a negative result still valuable?                       | ✅    | Yes. If structured/CoT prompting does not improve mutation score, it still shows that stronger prompting does not necessarily improve fault-detection ability.                                                  |

**Decision:** Continue with this GAP. There are three ⚠️ risks and no ❌ blockers. The project must start with a small mini-pilot and clearly document the testing tools.

## 7. Final GAP Statement

Existing LLM-based unit test generation studies evaluate generated tests with different tools, datasets, prompt strategies, and metrics. Although coverage metrics are common and mutation score appears in some studies, the selected evidence table does not show a consistent controlled comparison of prompt strategies using both branch coverage and mutation score in the same setting. This project addresses that gap by comparing zero-shot prompting with structured/chain-of-thought prompting for LLM-generated unit tests on the same set of unit-test-generation tasks.
