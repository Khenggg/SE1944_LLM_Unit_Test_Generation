# Experiment Design Rationale — LLM-based Unit Test Generation with Coverage and Mutation Testing

Date: 2026-06-04 | GAP source: `SLR/gap-analysis.md`

## Decision Table

| Decision         | Value                                                                          | Source / Rationale                                                                                               |
| ---------------- | ------------------------------------------------------------------------------ | ---------------------------------------------------------------------------------------------------------------- |
| LLM/Tool         | GPT-4o mini (OpenAI API); fallback: ChatGPT UI with model/date logged manually | GAP-T: Tool/LLM column                                                                                           |
| Dataset          | ULT / UnLeakedTestBench — 5–8 Python functions sampled from public GitHub repo | GAP-D / benchmark from ACM007                                                                                    |
| Primary metric   | Mutation score (computed using mutmut)                                         | GAP-M: Metric column                                                                                             |
| Secondary metric | Branch coverage (computed using coverage.py --branch)                          | Inherited from ACM007                                                                                            |
| Baseline type    | Comparative — zero-shot prompting                                              | RQ claim type: comparative                                                                                       |
| Threshold RQ1    | No absolute threshold                                                          | Case 3: evidence table does not provide sufficient consistent numerical results — comparative claim used instead |
| Threshold RQ2    | Not applicable                                                                 | RQ2 (branch coverage) is secondary/descriptive — no threshold required                                           |
| Pipeline base    | ACM007 — Huang et al., 2024                                                    | Closest base paper with mutation score + real-world functions + LLM evaluation                                   |

## Threshold Rationale

**Threshold RQ1 — Case 3: no absolute threshold**

The evidence table (N = 9 papers) does not provide sufficiently consistent numerical results to apply Case 1 (a paper proposes a specific threshold) or Case 2 (floor value from the lowest reported result). Many records describe results qualitatively or do not compare prompt strategies under the same conditions. Therefore, RQ1 uses a **comparative claim**: structured/CoT prompting is compared with zero-shot prompting on the same set of functions, evaluated using the Wilcoxon signed-rank test. H1 is accepted if p < 0.05 and the median mutation score for structured/CoT is higher than for zero-shot.

**Threshold RQ2 — not applicable**

Branch coverage is reported as a secondary/descriptive metric. No pass/fail threshold is required because the goal is to describe the relationship between branch coverage and mutation score, not to test a separate hypothesis.

## Dataset Rationale

ULT / UnLeakedTestBench from ACM007 is the most appropriate source because ACM007 is the closest base paper in the evidence table: it evaluates LLMs on real-world Python functions and uses both branch coverage and mutation score as metrics. Using ULT is preferable to creating a new dataset because it is publicly available, immediately downloadable, and reduces GAP-D risk. RBL-2 scope: 5–8 functions with simple dependencies that can run locally without external services.

**Fallback rule:** If a function has dependency errors, replace it with another function from the same ULT benchmark and record the replacement in the experiment log.

## Pipeline Rationale

The pipeline is based on the evaluation paradigm of ACM007: input is a Python function, output is a pytest test file, metrics are branch coverage (coverage.py) and mutation score (mutmut). Each component has a clear source:

| Component             | Specification                          | Source                                            |
| --------------------- | -------------------------------------- | ------------------------------------------------- |
| LLM/Tool              | GPT-4o mini, OpenAI API                | GAP-T — Tool/LLM column                           |
| Prompt strategy       | Zero-shot vs structured/CoT            | ACM005 (CoT); ACM001, ACM007 (zero-shot baseline) |
| Temperature           | 0 (deterministic, for reproducibility) | Reproducibility requirement                       |
| Primary metric tool   | mutmut (mutation score)                | GAP-M — Metric column                             |
| Secondary metric tool | coverage.py --branch (branch coverage) | Inherited from ACM007                             |
| Baseline type         | Comparative (zero-shot)                | RQ claim type                                     |

## Prompt Strategy Definition

| Prompt strategy | Description                                                                                                                                                                                                                      |
| --------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Zero-shot       | The model receives the function/source code and is asked directly to generate pytest unit tests. No examples, checklist, or structured reasoning steps are provided.                                                             |
| Structured/CoT  | The model receives the function/source code and is asked to: (1) identify input classes, (2) list edge cases, (3) identify expected behavior, and (4) generate executable pytest tests. The final output must contain code only. |

## Operating Environment

| Component           | Planned environment                                               |
| ------------------- | ----------------------------------------------------------------- |
| OS                  | Windows 10/11 local machine, or Google Colab if local setup fails |
| Editor              | VS Code                                                           |
| Python              | 3.12 (recommended); 3.10+ acceptable                              |
| Virtual environment | `.venv` inside the project folder                                 |
| Test framework      | pytest                                                            |
| Coverage tool       | coverage.py with branch coverage enabled                          |
| Mutation tool       | mutmut                                                            |
| Hardware            | CPU only; no GPU required                                         |
| Output folder       | `experiment/results/`                                             |

## Timeline

| Stage                                    | Time estimate | Output                                              |
| ---------------------------------------- | ------------- | --------------------------------------------------- |
| Dataset download and function selection  | 1–2 hours     | `selected-functions.md`                             |
| Prompt template preparation              | 30–45 minutes | `prompts/zero-shot.md`, `prompts/structured-cot.md` |
| LLM generation                           | 1–2 hours     | Generated test files                                |
| Local test execution and environment fix | 1–2 hours     | pytest pass/fail log                                |
| Coverage and mutation testing            | 2–4 hours     | Raw metric CSV                                      |
| Statistical analysis and write-up        | 1–2 hours     | Result summary                                      |

Total: ~7–13 hours for the mini-pilot. If time is limited, reduce from 8 to 5 functions first.

## Risk Mitigation

| Risk                             | Level after mitigation | Mitigation                                                                                                               |
| -------------------------------- | ---------------------- | ------------------------------------------------------------------------------------------------------------------------ |
| Dataset dependency errors        | ⚠️                     | Select functions with simple dependencies. Replace broken functions from the same ULT benchmark and log the replacement. |
| API cost or access problem       | ⚠️                     | Use GPT-4o mini, cap at 10–16 calls, and fall back to ChatGPT UI if API is unavailable.                                  |
| Mutation testing is slow         | ✅                     | Only 5–8 small functions; run mutmut only after pytest passes.                                                           |
| Generated tests do not compile   | ✅                     | Track pass rate separately. Only valid paired outputs are used for Wilcoxon.                                             |
| Environment setup takes too long | ✅                     | Python-only stack: pytest, coverage.py, mutmut. No Java/JUnit/PIT required.                                              |
| Timeline becomes tight           | ✅                     | Keep RQ1 as primary. Treat RQ2 as secondary/descriptive if needed.                                                       |

## Final Design Decision

Primary GAP: **GAP-M** — Secondary GAP: **GAP-T**. The experiment uses 5–8 Python functions from ULT / UnLeakedTestBench (ACM007). It compares zero-shot with structured/CoT prompting using GPT-4o mini. The study runs locally with Python, pytest, coverage.py, and mutmut. Primary metric: mutation score; secondary metric: branch coverage. The claim is comparative rather than threshold-based because the evidence table does not provide sufficient consistent numerical results.
