# Experiment Design Rationale - LLM-based Unit Test Generation

Date: 2026-06-04  
GAP source: `SLR/gap-analysis.md`  
Evidence source: `SLR/evidence-table.md`

## 1. Final Design Summary

This RBL-2 design uses a comparative experiment instead of an absolute numeric threshold. The experiment compares two prompt strategies on the same function-level unit-test-generation tasks:

- **Baseline:** zero-shot prompting
- **Intervention:** structured/chain-of-thought prompting
- **Primary metric:** mutation score
- **Secondary metric:** branch coverage
- **Statistical test:** Wilcoxon signed-rank test because the same tasks are evaluated under both prompt strategies

The primary GAP is **GAP-M (Metric Gap)**. GAP-T is kept only as a secondary GAP because the prompt strategy is the experimental factor.

## 2. Dataset / Subject Program Source

| Item                 | Decision                                                                                                                        |
| -------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| Dataset source       | **ULT / UnLeakedTestBench** from ACM007: _Benchmarking LLMs for Unit Test Generation from Real-World Functions_                 |
| Public source        | `https://github.com/huangd1999/UnLeakedTestBench`                                                                               |
| Paper source         | ACM007 - _Benchmarking LLMs for Unit Test Generation from Real-World Functions_                                                 |
| Dataset type         | Real-world Python function-level unit-test-generation tasks                                                                     |
| Full benchmark size  | The benchmark paper/repository describes ULT as a large benchmark of real-world Python functions.                               |
| RBL-2 scope          | Use only **5-8 Python functions** sampled from ULT for a mini-pilot.                                                            |
| Reason for downscope | RBL-2 is a design/proposal stage. Running the full benchmark is too large for the current timeline.                             |
| Selection rule       | Choose small-to-medium functions that can run locally, have clear inputs/outputs, and do not require complex external services. |
| Recording rule       | Each selected function must be logged with function name, source file/path, repository/source URL, and reason for selection.    |

**Why this dataset is appropriate:** ACM007 is the closest base paper in the evidence table because it evaluates LLM unit test generation on real-world functions and includes metrics such as branch coverage and mutation score. Therefore, ULT is a better source than creating a new dataset manually.

**Fallback rule:** If the ULT repository cannot be downloaded or a selected function has dependency problems, the project will not create a new private dataset. Instead, it will replace that function with another simple Python function from the same ULT source and record the replacement in the experiment log.

## 3. Model / Tool Decision and Cost Plan

| Item                           | Decision                                                                                                                                              |
| ------------------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| Default model                  | **GPT-4o mini** through OpenAI API, or ChatGPT UI only if API access is unavailable                                                                   |
| Why not full GPT-4o by default | Full GPT-4o may cost more. The RBL-2 pilot only needs a controlled comparison between two prompt strategies, so a smaller accessible model is enough. |
| Number of tasks                | 5-8 functions                                                                                                                                         |
| Prompt strategies              | 2 strategies: zero-shot and structured/CoT                                                                                                            |
| Number of generations          | 1 generation per task per strategy                                                                                                                    |
| Estimated API calls            | 10-16 calls total                                                                                                                                     |
| Estimated token budget         | About 2,000 input tokens + 1,500 output tokens per call, depending on function length                                                                 |
| Estimated cost control         | Keep the pilot under 16 calls. If cost rises, reduce tasks from 8 to 5 before changing the design.                                                    |
| Required logging               | Record model name, access method, date, prompt template, input function, and generated test output.                                                   |

**Cost note:** The current cost plan is based on using GPT-4o mini rather than full GPT-4o. With 10-16 small calls, the expected cost should remain very low. If the team decides to use full GPT-4o instead, the cost section must be updated before running the experiment.

## 4. Operating Environment

| Component             | Planned environment                                                                             |
| --------------------- | ----------------------------------------------------------------------------------------------- |
| OS                    | Windows 10/11 local machine or Google Colab if local setup fails                                |
| Editor                | VS Code                                                                                         |
| Python                | Python 3.12 recommended; Python 3.10+ acceptable                                                |
| Virtual environment   | `.venv` inside the project folder                                                               |
| Test framework        | `pytest`                                                                                        |
| Coverage tool         | `coverage.py` with branch coverage enabled                                                      |
| Mutation testing tool | `mutmut`                                                                                        |
| Hardware              | CPU only; no GPU required                                                                       |
| Output folder         | `experiment/results/`                                                                           |
| Reproducibility files | `experiment/prompts/`, `experiment/selected-functions.md`, `experiment/results/raw-results.csv` |

Planned local setup commands:

```bash
python -m venv .venv
.venv\Scripts\activate
pip install pytest coverage mutmut pandas scipy
```

Planned execution commands:

```bash
pytest
coverage run --branch -m pytest
coverage report
mutmut run
mutmut results
```

## 5. Decision Table

| Decision         | Value                                                    | Source / rationale                                                                                     |
| ---------------- | -------------------------------------------------------- | ------------------------------------------------------------------------------------------------------ |
| Primary GAP      | GAP-M - Metric Gap                                       | Mutation score is less consistently used as the main metric for prompt-strategy comparison.            |
| Secondary GAP    | GAP-T - Prompt Strategy Gap                              | Prompt strategy is used as the comparison factor, not as the primary GAP.                              |
| Dataset          | ULT / UnLeakedTestBench, sampled to 5-8 Python functions | Source from ACM007 and its public GitHub repository.                                                   |
| Model/tool       | GPT-4o mini or ChatGPT UI fallback                       | Keeps API cost and access risk manageable.                                                             |
| Baseline         | Zero-shot prompt                                         | Basic LLM test-generation setting.                                                                     |
| Intervention     | Structured/chain-of-thought prompt                       | Inspired by evidence that prompt design/CoT can affect generated tests.                                |
| Main metric      | Mutation score                                           | Directly aligned with GAP-M and fault-detection ability.                                               |
| Secondary metric | Branch coverage                                          | Common metric in unit test generation papers and useful for explaining code-path execution.            |
| Validity metric  | Pass rate / compilable-test rate                         | Needed because generated tests may fail to run.                                                        |
| Statistical test | Wilcoxon signed-rank test                                | Paired numeric comparison on the same functions.                                                       |
| Threshold        | No absolute threshold                                    | The evidence table does not provide enough consistent numerical scores for a valid Case 1/2 threshold. |

## 6. Pipeline Design

1. Download or access the ULT / UnLeakedTestBench repository from ACM007.
2. Select 5-8 Python functions that can run locally without complex external dependencies.
3. Save the selected function list in `experiment/selected-functions.md`.
4. For each function, run the zero-shot prompt once and save the generated test.
5. For the same function, run the structured/CoT prompt once and save the generated test.
6. Execute generated tests using pytest.
7. Record whether each generated test file runs successfully.
8. Compute branch coverage using coverage.py.
9. Compute mutation score using mutmut.
10. Compare paired results between zero-shot and structured/CoT prompting.
11. Apply Wilcoxon signed-rank test to valid paired mutation-score results.
12. Report branch coverage as secondary confirmatory/descriptive evidence.

## 7. Prompt Strategy Definition

| Prompt strategy | Description                                                                                                                                                                                            |
| --------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| Zero-shot       | The model receives the function/source code and is directly asked to generate pytest unit tests. No examples, checklist, or structured reasoning steps are provided.                                   |
| Structured/CoT  | The model receives the function/source code and is asked to identify input classes, edge cases, expected behavior, and then generate executable pytest tests. The final answer must contain only code. |

## 8. Timeline

| Stage                                            | Time estimate | Output                                              |
| ------------------------------------------------ | ------------: | --------------------------------------------------- |
| Dataset download and function selection          |     1-2 hours | `selected-functions.md`                             |
| Prompt template preparation                      | 30-45 minutes | `prompts/zero-shot.md`, `prompts/structured-cot.md` |
| LLM generation                                   |     1-2 hours | generated test files                                |
| Local test execution and fixing environment only |     1-2 hours | pytest pass/fail log                                |
| Coverage and mutation testing                    |     2-4 hours | raw metric CSV                                      |
| Statistical analysis and write-up                |     1-2 hours | result summary                                      |

Total expected time: about **7-13 hours** for the mini-pilot. If the team has less time, reduce from 8 functions to 5 functions first.

## 9. Risk Mitigation

| Risk                             | Level after mitigation | Mitigation                                                                                                                                         |
| -------------------------------- | ---------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| Dataset dependency errors        | ⚠️                     | Use ULT as the source, but select only functions with simple dependencies. Replace broken functions from the same dataset and log the replacement. |
| API cost or access problem       | ⚠️                     | Use GPT-4o mini by default, limit to 10-16 calls, and use ChatGPT UI fallback if API is unavailable.                                               |
| Mutation testing is slow         | ✅                     | Use only 5-8 small functions and run mutmut only after pytest passes.                                                                              |
| Generated tests do not compile   | ✅                     | Track pass rate separately. Only valid paired test outputs are used for Wilcoxon.                                                                  |
| Environment setup takes too long | ✅                     | Use Python-only stack: pytest, coverage.py, mutmut. Avoid Java/JUnit/PIT.                                                                          |
| Timeline becomes tight           | ✅                     | Keep RQ1 as primary. Treat RQ2 as secondary/descriptive if needed.                                                                                 |

**Feasibility decision:** Continue. The revised design has two warnings and no blocker. Both warnings have concrete mitigation: fixed dataset source with replacement rule, and low-cost model plan with capped calls.

## 10. Final Design Decision

The final design selects **GAP-M as the primary GAP** and **GAP-T as the secondary GAP**. The experiment will use a small sample of 5-8 Python functions from **ULT / UnLeakedTestBench**, the benchmark associated with ACM007. It will compare zero-shot and structured/chain-of-thought prompting using GPT-4o mini or an equivalent accessible ChatGPT model. The study will run locally with Python, pytest, coverage.py, and mutmut. The main outcome is mutation score; branch coverage is secondary. Because the evidence table does not support a valid absolute numerical threshold, the claim remains comparative rather than threshold-based.
