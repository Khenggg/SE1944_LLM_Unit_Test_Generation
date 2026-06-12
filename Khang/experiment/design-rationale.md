# Experiment Design Rationale - LLM for Unit Test Case Generation

Date: 2026-06-05 | GAP source: `SLR/gap-analysis.md` | Evidence source: `SLR/evidence-table.md` (N = 16)

## Decision Table

| Decision | Final value | Source |
| --- | --- | --- |
| **Primary GAP** | Paired comparison gap: no included paper compares GPT-4o-generated tests with student-written coursework/assignment tests on the same medium-complexity Java/Python units. This is distinct from professional-developer baselines such as AgoneTest. | `SLR/gap-analysis.md`, GAP-D, 16-paper counter-evidence check. |
| **Secondary GAP** | Evaluate both branch coverage and mutation score. | GS005 warns that 100% coverage can still pair with only 4% mutation score; GS017/GS022/GS024/GS025/GS051/GS089 provide mutation-related evidence. |
| **LLM/Tool** | GPT-4o (gpt-4o-2024-05-13) as the primary model; GPT-4o mini as the downscope option if budget/API access is blocked. | RQ/GAP-D focuses on GPT-4o; GPT-family evidence appears in GS010, GS022, GS024, GS028, GS051, GS080, GS089, and GS118. |
| **Prompt strategy** | Fixed zero-shot structured prompt, temperature = 0, maximum one repair attempt if the test does not compile/run. | Reproducibility requirement; GS010 and GS206 show repair/refinement can help, but the minimal experiment should avoid becoming a complex pipeline. |
| **Dataset** | 10-20 Java or Python functions/classes with medium cyclomatic complexity, approximately CC = 5-15 where measurable, with student-written coursework/assignment tests for the same units. | GAP-D and feasibility check in `SLR/gap-analysis.md`. |
| **Primary metric 1** | Branch coverage. | GS017 reports branch coverage at 30.22%; GS019, GS025, GS051, GS089, GS163, and GS206 include coverage-related evidence. |
| **Primary metric 2** | Mutation score. | GS005, GS017, GS022, GS024, GS025, GS051, and GS089. |
| **Secondary metric** | Compile/execution success rate. | GS010, GS028, GS089, GS118, and GS206. |
| **Baseline type RQ1/RQ2** | Absolute literature-backed thresholds. | RBL-2 section 3A: an absolute claim needs a threshold value. |
| **Baseline type RQ3** | Paired student-written coursework tests. | GAP-D requires the same code units to have both GPT-generated tests and student-written coursework/assignment tests. |
| **Threshold RQ1** | Branch coverage >= 30.22%. | Case 2: GS017 reports average branch coverage at 30.22% on ULT. |
| **Threshold RQ2** | Mutation score >= 4%. | Case 2 strict floor: GS005 reports suites with 100% coverage but only 4% mutation score. |
| **Reference target RQ2** | Mutation score >= 40.21% as a secondary H0/H1 threshold. | GS017 reports average mutation score at 40.21% on ULT. |
| **Pipeline base** | GS017 for real-world function benchmark framing; GS005/GS022 for mutation-score justification; GS028/GS051/GS089 as comparison examples. | Evidence table rows GS005, GS017, GS022, GS028, GS051, and GS089. |
| **Statistical tests** | One-sample Wilcoxon for threshold checks; paired Wilcoxon for GPT-vs-student comparison. | RBL-2 guidance for continuous percentage metrics and paired comparison. |

## Threshold Rationale

### RQ1 - Branch Coverage >= 30.22%

**Case:** Case 2. The evidence table contains numeric results, but no paper proposes a universal acceptance threshold for branch coverage.

**Source:** GS017 reports average branch coverage at **30.22%** on ULT, including real-world Python function-level tasks. This is the closest threshold source because it measures branch coverage for LLM-generated unit tests on real-world functions.

**Why other values are not used:** GS009 reports generic coverage and has a HumanEval/SF110 setting gap; GS019 uses JavaScript npm APIs outside the Java/Python scope; GS028 reports statement coverage; GS025 uses fine-tuning and iterative feedback; GS051 uses multi-LLM chaining. These papers are supporting evidence, not direct threshold sources for the minimal GPT-4/GPT-4o experiment.

### RQ2 - Mutation Score >= 4%

**Case:** Case 2. No paper in the evidence table proposes a universal threshold for mutation score, so RBL-2 requires using a floor value from numeric evidence.

**Source:** GS005 reports test suites that reached 100% coverage but only **4% mutation score**. Because this is the mutation-score floor in the evidence table and a warning against coverage-only evaluation, the H0/H1 threshold is **4%**.

**Reference target:** GS017 reports average mutation score at **40.21%** on ULT. This value is kept as a stronger reference target and secondary threshold for interpretation.

## Pipeline Rationale

The minimal pipeline directly answers GAP-D: same code units, two test-suite sources, same metrics.

1. Select 10-20 Java or Python functions/classes with CC = 5-15 where measurable.
2. Collect student-written coursework/assignment tests for those same units.
3. Generate GPT-4o (gpt-4o-2024-05-13) tests with a fixed prompt and temperature 0.
4. Run compile/execution checks and record the failure rate.
5. Measure branch coverage and mutation score for GPT-generated tests.
6. Measure the same metrics for student-written coursework/assignment tests.
7. Compare GPT-generated tests against RQ1/RQ2 thresholds and against paired student-written coursework/assignment tests for RQ3.

## Tooling Decision

| Language option | Coverage tool | Mutation tool | Note |
| --- | --- | --- | --- |
| Java | JaCoCo | PIT/PITest | Fits JUnit evidence in GS009, GS022, GS028, GS051, and GS206. Setup is heavier, but mutation tooling is clear. |
| Python | coverage.py | mutmut or Cosmic Ray | Fits GS017, GS025, and GS026. Setup is faster for a small function-level dataset. |

**Starting rule:** Choose the language that already has student-written coursework/assignment tests. If both are available, Java is stronger for comparability with PIT/JUnit papers; Python is stronger for fast setup.

## Downscope Rule

| Constraint | Valid downscope |
| --- | --- |
| No paired student coursework/assignment tests for both Java and Python | Use only one language. |
| Dataset is too large or unstable | Reduce to 10 units and report it as pilot-scale. |
| GPT-4/GPT-4o is too expensive | Use GPT-4o mini and update the model name across files. |
| Mutation testing is too slow | Keep mutation score on a smaller subset; do not remove mutation score because GAP-M depends on it. |
| Many generated tests fail to compile | Allow one repair/regeneration attempt and report compile success rate. |
