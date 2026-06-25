# Experiment Design Rationale - LLM for Unit Test Case Generation

Date: 2026-06-12 | GAP source: `team-synthesis/gap-statement-final.md` | Evidence source: `team-synthesis/evidence-table-merged.md` (N = 39)

## Decision Table

| Decision | Final value | Source |
| --- | --- | --- |
| **Primary GAP** | Paired comparison gap: no included paper compares GPT-4o-mini-generated tests with human benchmark tests on the same Java functions from the HumanEval-Java dataset. | `team-synthesis/gap-statement-final.md`, GAP-D. |
| **Secondary GAP** | Evaluate both branch coverage and mutation score. | GS005 warns that 100% coverage can still pair with only 4% mutation score; GS010/GS026 provide mutation-related evidence. |
| **LLM/Tool** | GPT-4o-mini (gpt-4o-mini-2024-07-18) as the primary model. | RQ/GAP-D focuses on this model version with temperature = 0 to manage API cost while maintaining capability. |
| **Prompt strategy** | Fixed zero-shot structured prompt, temperature = 0, maximum one repair attempt if the test does not compile/run. | Reproducibility requirement. |
| **Dataset** | 50 Java functions from the HumanEval-Java benchmark. | GAP-D and feasibility check in `team-synthesis/gap-statement-final.md`. |
| **Primary metric 1** | Branch coverage. | GS017 reports average branch coverage at 30.22% on ULT. |
| **Primary metric 2** | Mutation score. | GS005, GS017, and GS026. |
| **Secondary metric** | Compile/execution success rate. | GS010. |
| **Baseline type RQ1/RQ2** | Absolute literature-backed thresholds. | RBL-2 section 3A: an absolute claim needs a threshold value. |
| **Baseline type RQ3** | Human benchmark tests. | GAP-D requires the same code units to have both GPT-generated tests and human benchmark tests. |
| **Threshold RQ1** | Branch coverage >= 30.22%. | GS017 reports average branch coverage at 30.22% on ULT. |
| **Threshold RQ2** | Mutation score >= 4%. | GS005 reports suites with 100% coverage but only 4% mutation score. |
| **Reference target RQ2** | Mutation score >= 40.21% as a secondary H0/H1 threshold. | GS017 reports average mutation score at 40.21% on ULT. |
| **Pipeline base** | GS017 for real-world function benchmark framing; GS005/GS026 for mutation-score justification. | Evidence table rows GS005, GS017, and GS026. |
| **Statistical tests** | One-sample Wilcoxon for threshold checks; paired Wilcoxon for GPT-vs-human comparison. | RBL-2 guidance for continuous percentage metrics and paired comparison. |

## Threshold Rationale

### RQ1 - Branch Coverage >= 30.22%

**Case:** Case 2. The evidence table contains numeric results, but no paper proposes a universal acceptance threshold for branch coverage.

**Source:** GS017 reports average branch coverage at **30.22%** on ULT, including real-world Python function-level tasks. This is the closest threshold source because it measures branch coverage for LLM-generated unit tests on real-world functions.

### RQ2 - Mutation Score >= 4%

**Case:** Case 2. No paper in the evidence table proposes a universal threshold for mutation score, so RBL-2 requires using a floor value from numeric evidence.

**Source:** GS005 reports test suites that reached 100% coverage but only **4% mutation score**. Because this is the mutation-score floor in the evidence table and a warning against coverage-only evaluation, the H0/H1 threshold is **4%**.

**Reference target:** GS017 reports average mutation score at **40.21%** on ULT. This value is kept as a stronger reference target and secondary threshold for interpretation.

## Pipeline Rationale

The minimal pipeline directly answers GAP-D: same code units, two test-suite sources, same metrics.

1. Select 50 Java functions from the HumanEval-Java dataset.
2. Use the human benchmark tests already provided in the HumanEval-Java repository as the baseline.
3. Generate GPT-4o-mini (gpt-4o-mini-2024-07-18) tests with a fixed prompt and temperature 0.
4. Run compile/execution checks and record the failure rate.
5. Measure branch coverage (JaCoCo) and mutation score (PIT) for GPT-generated tests.
6. Measure the same metrics for human benchmark tests.
7. Compare GPT-generated tests against RQ1/RQ2 thresholds and against paired human benchmark tests for RQ3.

## Tooling Decision

* **Language:** Java
* **Coverage tool:** JaCoCo
* **Mutation tool:** PITest
* **Build tool:** Maven (already structured in `human-eval-java/pom.xml`)
