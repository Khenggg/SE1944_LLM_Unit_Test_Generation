# GAP Analysis — LLM-based Unit Test Generation with Coverage and Mutation Testing

Evidence table: `SLR/evidence-table.md` | N = 9 papers (empirical) | Ngày: 2026-06-04

## Bảng GAP

| Cột      | Phát hiện                                                                                                                                                      | Loại GAP | Phản chứng                                                                                                                                                      |
| -------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Tool/LLM | Several studies use ChatGPT, LLMs, generative AI tools, or pre-trained LLMs, but prompt strategies and pipelines are not standardized across studies.          | GAP-T    | ✅ Kiểm tra 9 paper: ACM001, ACM002, ACM005, ACM007, ACM009 involve LLM-based test generation but do not provide one shared controlled prompt-strategy setting. |
| Dataset  | The selected studies use different task sources such as unit test generation tasks, mutation-guided settings, real-world functions, or tool-specific settings. | GAP-D    | ✅ Kiểm tra 9 paper: ACM001 uses unit test generation tasks; ACM007 uses real-world functions; ACM009 is a tool-based setting.                                  |
| Metric   | Coverage-related metrics are common, while mutation score is less consistently used as the main evaluation metric across prompt/model settings.                | GAP-M    | ✅ Kiểm tra 9 paper: ACM001 and ACM007 mention mutation score; ACM006 uses mutant information; several other records focus on coverage or pass rate only.       |
| Hạn chế  | Repeated limitations include benchmark size, prompt dependence, model version dependence, and generalization across datasets/projects.                         | GAP-S    | ✅ Kiểm tra 5/9 paper: ACM001, ACM002, ACM005, ACM006, ACM007 report limitations related to prompt, benchmark, or generalization.                               |

## GAP Chính: GAP-M

Existing LLM-based unit test generation studies commonly report coverage-related evaluation, but mutation score as a fault-detection-oriented metric is not consistently used across different prompt strategies in the same experimental setting.

## GAP Secondary (nếu có): GAP-T

Prompt design and pipeline choices influence LLM-generated unit tests. This is treated as secondary because the experiment uses prompt strategy as the comparison factor: zero-shot versus structured/chain-of-thought prompting.

## Chi tiết kiểm tra phản chứng

GAP tuyên bố: Mutation score is not used consistently as the main evaluation metric for comparing different LLM prompt strategies in the same unit-test-generation setting.

| Paper                                                                                 | Đã làm không?   | Ghi chú                                                                                                                            |
| ------------------------------------------------------------------------------------- | --------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| ACM001 — An Initial Investigation of ChatGPT Unit Test Generation Capability          | Không / Partly  | Mentions mutation score but does not compare zero-shot vs structured/CoT prompting in one controlled setting.                      |
| ACM002 — Evaluating and Improving ChatGPT for Unit Test Generation                    | Không / Partly  | Focuses on improving ChatGPT; mutation score is not the central metric for a paired prompt-strategy comparison.                    |
| ACM003 — Unit Test Generation using Generative AI: A Comparative Performance Analysis | Không / Partly  | Comparative performance is relevant but has not focused deeply on mutation testing.                                                |
| ACM004 — On the Evaluation of Large Language Models in Unit Test Generation           | Không / Partly  | Discusses evaluation metrics but no controlled prompt-strategy experiment with mutation score as primary metric.                   |
| ACM005 — Automated Unit Test Generation via Chain-of-Thought Prompt and RL            | Không / Partly  | Relevant to CoT prompting but focuses on coverage feedback rather than mutation score as main metric.                              |
| ACM006 — PRIMG: Efficient LLM-driven Test Generation Using Mutant Information         | Không / Partly  | Uses mutant information but focuses on mutation-guided generation, not zero-shot vs structured/CoT comparison.                     |
| ACM007 — Benchmarking LLMs for Unit Test Generation from Real-World Functions         | Partly / Strong | Closest base paper: uses real-world functions, branch coverage, and mutation score. Does not do paired prompt-strategy comparison. |
| ACM008 — Effective Test Generation Using Pre-trained Large Language Models            | Không / Partly  | Uses coverage/test effectiveness; mutation score is not the central metric.                                                        |
| ACM009 — ChatUniTest: A ChatGPT-based Automated Unit Test Generation Tool             | Không / Partly  | Tool paper with coverage/pass rate; not focused on mutation testing or controlled prompt-strategy comparison.                      |
| ACM010 — Software Testing with Large Language Models                                  | Không dùng      | Background/survey paper, not a direct empirical experiment.                                                                        |
| ACM011 — A Survey on Large Language Models for Software Testing                       | Không dùng      | Survey/background paper, used for positioning only.                                                                                |

→ Kết luận: **Xác nhận GAP-M**. ACM007 là counter-example gần nhất nhưng không đủ để bác bỏ GAP vì không so sánh prompt strategies. GAP-M được giữ nguyên.

## Feasibility Check — GAP Chính

| Tiêu chí     | Mức | Ghi chú                                                                                                                                                |
| ------------ | --- | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| Dataset      | ⚠️  | Use ULT / UnLeakedTestBench from ACM007. Downscope to 5–8 Python functions only. Replace broken functions from the same benchmark and log replacement. |
| Tool/API     | ⚠️  | Use GPT-4o mini by default. Cap pilot at 10–16 calls. Fallback: ChatGPT UI with manual model/date logging.                                             |
| Compute      | ✅  | Run locally on Windows/VS Code using Python, pytest, coverage.py, mutmut. CPU only; no GPU required.                                                   |
| Ground truth | ✅  | No manual annotation required. Branch coverage and mutation score are computed automatically.                                                          |
| Skills       | ✅  | Python-only stack. Required tools: pytest, coverage.py, mutmut, pandas, scipy. Tutorial available.                                                     |
| Thời gian    | ✅  | Estimated 7–13 hours for mini-pilot. Reduce from 8 to 5 functions if time is tight.                                                                    |
| Contribution | ✅  | Negative result still contributes controlled evidence about prompt strategy effectiveness.                                                             |

**Kết quả:** 0 ❌ / 2 ⚠️ → **An toàn** — tiếp tục với GAP-M làm primary.

## Final GAP Statement

Existing LLM-based unit test generation studies use several evaluation metrics, but mutation score is not consistently used as the primary metric for comparing prompt strategies in the same experimental setting. This project addresses the GAP-M metric gap by comparing zero-shot prompting with structured/chain-of-thought prompting for LLM-generated unit tests, using mutation score as the primary outcome and branch coverage as a secondary outcome.
