# GAP Analysis - LLM-based Unit Test Generation with Coverage and Mutation Testing

Evidence table: `SLR/evidence-table.md`  
Evidence table size: N = 11 total records  
Empirical evidence used for design: N = 9 papers  
Background/survey records used only for related-work positioning: ACM010, ACM011  
Date: 2026-06-04  
RBL-1 source files: `SLR/evidence-table.md`, `SLR/gap-statement.md`

## 1. Evidence Table Gate Check

| Gate                  | Pass if                              | Result from current evidence table                                                                                                                                                                                                       | Status                                                       |
| --------------------- | ------------------------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------ |
| P1: Number of papers  | At least 5 papers                    | The evidence table contains 11 total records from ACM001 to ACM011. For experiment design, 9 empirical/tool/benchmark papers are used. ACM010 and ACM011 are survey/background papers and are not treated as primary empirical evidence. | ✅ Pass                                                      |
| P2: Tool/LLM column   | At least 90% of rows filled          | All 11 records have a tool/model/source type such as ChatGPT, LLMs, generative AI tools, or survey/background LLMs.                                                                                                                      | ✅ Pass                                                      |
| P3: Result column     | At least 50% of rows contain results | The table contains result summaries, but many are descriptive and do not provide exact numerical scores. This is enough for identifying GAPs but weak for choosing absolute numerical thresholds.                                        | ⚠️ Pass for GAP analysis; weak for absolute threshold design |
| P4: Limitation column | At least 50% of rows filled          | All records include limitation notes or source-quality notes.                                                                                                                                                                            | ✅ Pass                                                      |
| P5: Metric column     | Specific metrics are named           | Metrics include code coverage, branch coverage, mutation score, mutation testing, pass rate, and test effectiveness. ACM010 and ACM011 are survey/background records and therefore are not used as metric evidence for the experiment.   | ✅ Pass                                                      |

**Decision:** Continue RBL-2, but avoid unsupported absolute thresholds. The evidence table does not provide enough exact numerical results for a Case 1 or Case 2 threshold such as `mutation score >= 0.80`. Therefore, the final design uses a **comparative claim**: structured/chain-of-thought prompting is compared with zero-shot prompting on the same tasks.

## 2. GAP Table

| Source column | Finding from evidence table                                                                                                                                       | GAP type | Evidence / counter-check                                                                                                                             |
| ------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| Metric        | Coverage-related metrics are common, while mutation score or mutation testing is less consistently used as a main evaluation metric across prompt/model settings. | GAP-M    | ACM001 and ACM007 mention mutation score; ACM006 uses mutant information; several other records focus on coverage, pass rate, or test effectiveness. |
| Tool/LLM      | Several studies use ChatGPT, LLMs, generative AI tools, or pre-trained LLMs, but prompt strategies and pipelines are not standardized across studies.             | GAP-T    | ACM001, ACM002, ACM005, ACM007, and ACM009 all involve LLM-based test generation, but do not provide one shared controlled prompt-strategy setting.  |
| Dataset       | The selected studies use different task sources such as unit test generation tasks, mutation-guided settings, real-world functions, or tool-specific settings.    | GAP-D    | ACM001 uses unit test generation tasks; ACM007 uses real-world functions; ACM009 is a tool-based setting.                                            |
| Limitation    | Repeated limitations include benchmark size, prompt dependence, model version dependence, and generalization across datasets/projects.                            | GAP-S    | ACM001, ACM002, ACM005, ACM006, and ACM007 report limitations related to prompt, benchmark, or generalization.                                       |

## 3. Selected Primary GAP

**Primary GAP: GAP-M - Metric Gap**

Existing LLM-based unit test generation studies commonly report coverage-related evaluation, but the use of mutation score as a fault-detection-oriented metric is less consistent across different prompt strategies. Because mutation score can show whether generated tests detect faults rather than only execute code paths, this project selects GAP-M as the primary GAP.

## 4. Secondary GAP

**Secondary GAP: GAP-T - Technology / Prompt Strategy Gap**

The evidence table also shows that prompt design and pipeline choices influence LLM-generated unit tests. This is treated as a secondary GAP because the experiment uses prompt strategy as the comparison factor: zero-shot prompting versus structured/chain-of-thought prompting.

**Not selected as primary:** GAP-D is not selected as the main GAP because creating or collecting a new benchmark would add dataset risk. GAP-S is also not selected as primary because it mainly summarizes shared limitations and gives a weaker direct experiment contribution.

## 5. Mandatory Counter-evidence Check for the Primary GAP

**Primary GAP claim:** In the selected SLR set, mutation score is not used consistently as the main evaluation metric for comparing different LLM prompt strategies in the same unit-test-generation setting.

| Paper                                                                                                                 | Has this already been fully done? | Counter-evidence note                                                                                                                                                                      |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| ACM001 - An Initial Investigation of ChatGPT Unit Test Generation Capability                                          | Partly                            | Uses ChatGPT and mentions code coverage/mutation score, but it does not clearly focus on comparing zero-shot vs structured/CoT prompting in one controlled setting.                        |
| ACM002 - Evaluating and Improving ChatGPT for Unit Test Generation                                                    | Partly                            | Focuses on improving ChatGPT for unit test generation, but the evidence table does not show mutation score as the central metric for a paired prompt-strategy comparison.                  |
| ACM003 - Unit Test Generation using Generative AI: A Comparative Performance Analysis of Autogeneration Tools         | Partly                            | Comparative performance is relevant, but the limitation says it has not deeply focused on mutation testing.                                                                                |
| ACM004 - On the Evaluation of Large Language Models in Unit Test Generation                                           | Partly                            | Discusses evaluation and suitable metrics, but the evidence table does not show a controlled prompt-strategy experiment using mutation score as the primary metric.                        |
| ACM005 - Automated Unit Test Generation via Chain-of-Thought Prompt and Reinforcement Learning from Coverage Feedback | Partly                            | Relevant to structured/CoT prompting and coverage feedback, but the table points mainly to coverage feedback rather than mutation score as the main comparison metric.                     |
| ACM006 - PRIMG: Efficient LLM-driven Test Generation Using Mutant Information                                         | Partly                            | Strongly related to mutation-guided generation, but focuses on mutant information rather than zero-shot vs structured/CoT prompt comparison.                                               |
| ACM007 - Benchmarking LLMs for Unit Test Generation from Real-World Functions                                         | Strong partial match              | Closest base paper because it uses real-world functions, branch coverage, and mutation score. However, it does not remove the focused GAP-M claim about paired prompt-strategy comparison. |
| ACM008 - Effective Test Generation Using Pre-trained Large Language Models                                            | Partly                            | Uses coverage/test effectiveness, but the evidence table does not show mutation score as the central metric.                                                                               |
| ACM009 - ChatUniTest: A ChatGPT-based Automated Unit Test Generation Tool                                             | Partly                            | Tool paper with coverage/pass rate, but not focused on mutation testing or controlled prompt-strategy comparison.                                                                          |
| ACM010 - Software Testing with Large Language Models                                                                  | Not used as counter-evidence      | Background/survey paper, not a direct empirical experiment. It is useful for related work only.                                                                                            |
| ACM011 - A Survey on Large Language Models for Software Testing                                                       | Not used as counter-evidence      | Survey/background paper, useful for positioning the topic but not treated as primary experiment evidence.                                                                                  |

**Conclusion:** The primary GAP-M is not rejected. ACM007 is the closest counter-example and should be treated as the main base paper, but the project can still contribute by comparing prompt strategies on the same tasks with mutation score as the primary metric and branch coverage as a secondary metric.

## 6. Feasibility Check for the Primary GAP

The first version had three warnings. To satisfy the RBL-2 rule, the design is downscoped to reduce risk to at most two warnings.

| Criterion    | Self-check question                                        | Level | Notes / mitigation                                                                                                                                                                                                               |
| ------------ | ---------------------------------------------------------- | ----- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Dataset      | Is the dataset public and immediately usable?              | ⚠️    | Use only 5-8 small public functions from simple programming exercises or small open-source utility functions. Do not build a new dataset. Record each function source in the experiment log.                                     |
| Tool/API     | Is the LLM/tool accessible with a free or low-cost option? | ⚠️    | Use one accessible model only, preferably GPT-4o mini or manual ChatGPT generation. Limit to one generation per task per prompt strategy in the pilot. If API access is blocked, use manual prompting and record the model/date. |
| Compute      | Can it run on normal hardware?                             | ✅    | Use Python + pytest + coverage.py + mutmut on CPU. Limit subject functions to small files so mutation testing finishes quickly.                                                                                                  |
| Ground truth | Is manual labeling required?                               | ✅    | No human annotation is required. Branch coverage and mutation score are computed automatically.                                                                                                                                  |
| Skills       | Can the group implement the pipeline?                      | ✅    | Downscope to Python only: pytest for tests, coverage.py for branch coverage, mutmut for mutation score. Avoid Java/JUnit/PIT unless the Python stack fails.                                                                      |
| Time         | Can the experiment be completed on time?                   | ✅    | Mini-pilot only: 5-8 functions, two prompt strategies, one model. RQ1 is primary; RQ2 is secondary.                                                                                                                              |
| Contribution | Is a negative result still valuable?                       | ✅    | Yes. If structured/CoT prompting does not improve mutation score, the result still shows that more structured prompting may not improve fault-detection ability.                                                                 |

**Decision:** Continue with the GAP-M primary design. There are two ⚠️ risks and no ❌ blockers, so the design satisfies the RBL-2 feasibility rule. The main mitigation is to downscope the study to a small Python-only mini-pilot.

## 7. Final GAP Statement

Existing LLM-based unit test generation studies use several evaluation metrics, but mutation score is not consistently used as the primary metric for comparing prompt strategies in the same experimental setting. This project addresses the GAP-M metric gap by comparing zero-shot prompting with structured/chain-of-thought prompting for LLM-generated unit tests, using mutation score as the primary outcome and branch coverage as a secondary outcome.
