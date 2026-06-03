# Experiment Design Rationale - LLM Unit Test Generation

Date: 2026-06-03 | GAP source: SLR/gap-analysis.md

## Design Decision Table

| Decision | Value | Source |
| --- | --- | --- |
| LLM/Tool | GPT-4/GPT-4o for automatic unit test generation; use GPT-4o mini only if cost requires downscoping | GAP-D from SLR/gap-analysis.md; GPT-family evidence appears in GS001, GS022, and GS046. |
| Dataset | Paired Java/Python medium-complexity functions/classes, preferably CC = 5-15, with both LLM-generated tests and student-written tests for the same code | GAP-D: no included paper provides this paired student-test dataset. |
| Primary metric | Branch coverage measured with JaCoCo for Java or coverage.py for Python | GS001 reports branch coverage; GS017 and GS022 report code/statement/test coverage; GS011 reports coverage rate. |
| Secondary metric | Mutation score measured with PIT/PITest for Java or mutmut/MutPy for Python | GS001 and GS046 explicitly report mutation score; GS046 uses PIT-style valid mutation reports. |
| Additional quality metric | Compilation/execution success rate | GS001, GS017, GS022, and GS046 report compilation, validity, correctness, runtime, or execution failures. |
| Baseline type | Threshold baseline for RQ1/RQ2; paired human/student-written baseline for RQ3 | RQ claim combines absolute thresholds and comparison with student-written tests. |
| Threshold RQ1 | Branch coverage >= 80% | Case 2: GS022 reports Codex achieved above 80% coverage on HumanEval; GS001 reports up to 96.3% branch coverage. Use 80% as the conservative threshold already supported by reported results. |
| Threshold RQ2 | Mutation score >= 57% | Case 2: GS001 reports 57% average mutation score, which is the floor value in the evidence table for mutation score. GS046 reports higher mutation scores, so 57% remains evidence-backed and attainable but not trivial. |
| Pipeline base | GS001 as the closest dual-metric base paper, with GS046 for mutation-score implementation detail | GS001 includes branch coverage, mutation score, compilation success, and a practitioner baseline; GS046 provides Java mutation testing evidence with GPT-4o/DeepSeek. |
| Prompt strategy | Start with zero-shot or structured prompt; optionally add one repair iteration if generated tests fail to compile/run | GS001 compares prompting strategies and reports chain-of-thought benefits; GS011 shows generation/repair iteration improves pass rate and coverage. |
| Temperature | 0 or low deterministic setting | Reproducibility requirement; keep generation variance controlled for comparison with student tests. |

## Threshold Rationale

Branch coverage >= 80% is treated as a Case 2 threshold. The evidence table includes GS022, where Codex achieved above 80% coverage on HumanEval, and GS001, where chain-of-thought prompting reached up to 96.3% branch coverage. Because these are reported empirical results rather than a formal threshold proposed by the papers, 80% is used as a conservative evidence-backed target.

Mutation score >= 57% is treated as a Case 2 threshold. GS001 reports 57% average mutation score, which provides the floor value from the evidence table. GS046 reports much higher mutation scores for valid PIT reports, so 57% is evidence-backed and remains meaningful for testing fault-detection strength.

## Pipeline Rationale

The base pipeline follows GS001 because it evaluates LLM-generated unit tests with branch coverage, mutation score, compilation success, and a human/practitioner comparison. The implementation should adapt this to the current GAP-D setting by using the same code units for GPT-generated tests and student-written tests. For Java mutation testing, GS046 is the closest supporting source because it evaluates LLM-generated Java tests using mutation coverage and mutation score.

Recommended minimal pipeline:

1. Select 10-20 medium-complexity Java or Python functions/classes.
2. Collect or create student-written tests for the same units.
3. Generate GPT-4/GPT-4o tests with a fixed prompt and temperature 0.
4. Run compilation/execution checks.
5. Measure branch coverage and mutation score for both GPT-generated and student-written tests.
6. Compare each metric against thresholds and paired student-test results.

## Downscope Rule

If time or API budget becomes a blocker, run one language only, preferably Java if PIT/JaCoCo setup is ready or Python if coverage.py/mutmut setup is easier. Record the scope change in experiment/01_rq.md before proposal synthesis.
