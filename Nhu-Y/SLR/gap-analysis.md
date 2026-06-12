# GAP Analysis — LLM-based Unit Test Generation with Coverage and Mutation Testing

Evidence table: `SLR/evidence-table.md` | N = 9 papers (empirical) | Date: 2026-06-04

## GAP Table

| Column     | Finding                                                                                                                                                        | GAP Type | Counter-check                                                                                                                                                   |
| ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Tool/LLM   | Several studies use ChatGPT, LLMs, generative AI tools, or pre-trained LLMs, but prompt strategies and pipelines are not standardized across studies.          | GAP-T    | ✅ Checked 9 papers: ACM001, ACM002, ACM005, ACM007, ACM009 involve LLM-based test generation but do not provide one shared controlled prompt-strategy setting. |
| Dataset    | The selected studies use different task sources such as unit test generation tasks, mutation-guided settings, real-world functions, or tool-specific settings. | GAP-D    | ✅ Checked 9 papers: ACM001 uses unit test generation tasks; ACM007 uses real-world functions; ACM009 is a tool-based setting.                                  |
| Metric     | Coverage-related metrics are common, while mutation score is less consistently used as the main evaluation metric across prompt/model settings.                | GAP-M    | ✅ Checked 9 papers: ACM001 and ACM007 mention mutation score; ACM006 uses mutant information; several other records focus on coverage or pass rate only.       |
| Limitation | Repeated limitations include benchmark size, prompt dependence, model version dependence, and generalization across datasets/projects.                         | GAP-S    | ✅ Checked 5/9 papers: ACM001, ACM002, ACM005, ACM006, ACM007 report limitations related to prompt, benchmark, or generalization.                               |

## Primary GAP: GAP-M

Existing LLM-based unit test generation studies commonly report coverage-related evaluation, but mutation score as a fault-detection-oriented metric is not consistently used across different prompt strategies in the same experimental setting.

## Secondary GAP (if any): GAP-T

Prompt design and pipeline choices influence LLM-generated unit tests. This is treated as secondary because the experiment uses prompt strategy as the comparison factor: zero-shot versus structured/chain-of-thought prompting.

## Counter-evidence Check Details

GAP claim: Mutation score is not used consistently as the main evaluation metric for comparing different LLM prompt strategies in the same unit-test-generation setting.

| Paper                                                                                 | Already fully done?  | Note                                                                                                                                    |
| ------------------------------------------------------------------------------------- | -------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| ACM001 — An Initial Investigation of ChatGPT Unit Test Generation Capability          | Partly               | Mentions mutation score but does not compare zero-shot vs structured/CoT prompting in one controlled setting.                           |
| ACM002 — Evaluating and Improving ChatGPT for Unit Test Generation                    | Partly               | Focuses on improving ChatGPT; mutation score is not the central metric for a paired prompt-strategy comparison.                         |
| ACM003 — Unit Test Generation using Generative AI: A Comparative Performance Analysis | Partly               | Comparative performance is relevant but has not focused deeply on mutation testing.                                                     |
| ACM004 — On the Evaluation of Large Language Models in Unit Test Generation           | Partly               | Discusses evaluation metrics but no controlled prompt-strategy experiment with mutation score as primary metric.                        |
| ACM005 — Automated Unit Test Generation via Chain-of-Thought Prompt and RL            | Partly               | Relevant to CoT prompting but focuses on coverage feedback rather than mutation score as main metric.                                   |
| ACM006 — PRIMG: Efficient LLM-driven Test Generation Using Mutant Information         | Partly               | Uses mutant information but focuses on mutation-guided generation, not zero-shot vs structured/CoT comparison.                          |
| ACM007 — Benchmarking LLMs for Unit Test Generation from Real-World Functions         | Strong partial match | Closest base paper: uses real-world functions, branch coverage, and mutation score. Does not perform paired prompt-strategy comparison. |
| ACM008 — Effective Test Generation Using Pre-trained Large Language Models            | Partly               | Uses coverage/test effectiveness; mutation score is not the central metric.                                                             |
| ACM009 — ChatUniTest: A ChatGPT-based Automated Unit Test Generation Tool             | Partly               | Tool paper with coverage/pass rate; not focused on mutation testing or controlled prompt-strategy comparison.                           |
| ACM010 — Software Testing with Large Language Models                                  | Not used             | Background/survey paper, not a direct empirical experiment.                                                                             |
| ACM011 — A Survey on Large Language Models for Software Testing                       | Not used             | Survey/background paper, used for positioning only.                                                                                     |

→ Conclusion: **GAP-M confirmed**. ACM007 is the closest counter-example but does not invalidate the GAP because it does not compare prompt strategies in a controlled setting. GAP-M is retained.

## Feasibility Check — Primary GAP

| Criterion    | Level | Notes / Mitigation                                                                                                                                         |
| ------------ | ----- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Dataset      | ⚠️    | Use ULT / UnLeakedTestBench from ACM007. Downscope to 5–8 Python functions only. Replace broken functions from the same benchmark and log the replacement. |
| Tool/API     | ⚠️    | Use GPT-4o mini by default. Cap pilot at 10–16 calls. Fallback: ChatGPT UI with manual model/date logging.                                                 |
| Compute      | ✅    | Run locally on Windows/VS Code using Python, pytest, coverage.py, and mutmut. CPU only; no GPU required.                                                   |
| Ground truth | ✅    | No manual annotation required. Branch coverage and mutation score are computed automatically.                                                              |
| Skills       | ✅    | Python-only stack. Required tools: pytest, coverage.py, mutmut, pandas, scipy. Tutorials available.                                                        |
| Time         | ✅    | Estimated 7–13 hours for mini-pilot. Reduce from 8 to 5 functions if time is tight.                                                                        |
| Contribution | ✅    | A negative result still contributes controlled evidence about prompt strategy effectiveness.                                                               |

**Result:** 0 ❌ / 2 ⚠️ → **Safe to proceed** — continue with GAP-M as primary.

## Final GAP Statement

Existing LLM-based unit test generation studies use several evaluation metrics, but mutation score is not consistently used as the primary metric for comparing prompt strategies in the same experimental setting. This project addresses the GAP-M metric gap by comparing zero-shot prompting with structured/chain-of-thought prompting for LLM-generated unit tests, using mutation score as the primary outcome and branch coverage as a secondary outcome.
