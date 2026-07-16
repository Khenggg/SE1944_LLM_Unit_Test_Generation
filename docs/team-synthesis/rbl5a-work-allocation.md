# RBL-5A Work Allocation

**Project:** SE1944 - LLM Unit-Test Generation
**Update date:** 2026-07-16
**Scope:** Final paper, presentation, reproducibility evidence, and delivery review.

## Team responsibility matrix

| Role | Member | RBL-5A responsibility | Deliverable / acceptance check |
| --- | --- | --- | --- |
| **PL — Project Lead** | Le The Khang | Integrate the final package; review scope, claims, and consistency across the report, paper, and slides; coordinate submission. | Final checklist approved; the paper and slides state that EvoSuite is a technical comparator, not a student-test proxy. |
| **DG — Data & Ground Truth** | Huynh Cao Phuoc | Maintain the 63-SUT data inventory and retained EvoSuite archive evidence; check data provenance and file completeness. | `results/metrics/evosuite_*p_class_metrics.csv` covers 63 SUTs for 1/3/5-minute budgets. |
| **LR — LLM Runner** | Pham An Khang | Maintain the zero-shot generation and one-pass repair scripts; preserve API/raw-output evidence and reproducibility instructions. | `scripts/rbl4_openai.py`, `scripts/repair_generated_tests.py`, and the `full_*` generation/repair records are traceable. |
| **MS — Metrics & Statistics** | Nguyen Thi Nhu Y | Reconcile compile status, JaCoCo/PIT metrics, statistical tests, and validation outputs. | `results/summary.csv` and `results/rbl4_validation.md` reproduce the reported counts, p-values, and effect sizes. |
| **RW — Research Writer** | Do Long Vy | Draft and revise the paper narrative, especially Related Work and Threats to Validity; curate figures and presentation wording/layout. | `paper/` builds successfully; `presentation/slides_final.pptx` and `presentation/rehearsal_guide.md` are ready for the 10–12 minute defense. |

## Shared final checks

1. Every reported RBL-4 number is traceable to a retained CSV, log, metric file, or generated figure.
2. The presentation uses the same denominators and conclusions as `results/summary.csv`.
3. The paper states the execution-validity limitation: 14 of 63 GPT suites passed, and RQ3 is pass-conditioned.
4. EvoSuite is described only as a reproducible technical comparator; the student benchmark remains future work until measured in the same pipeline.
5. Each member completes one live rehearsal using `presentation/rehearsal_guide.md` before submission.
