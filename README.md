# SE1944 LLM Unit Test Generation

Workspace for the SE1944 RBL-1 work package on **LLM for Unit Test Case Generation**.

This phase is the pre-experiment research package. It covers the systematic literature review, PRISMA flow, evidence table, research gap, refined research question, and hypotheses. Dataset creation, GPT-4 test generation, student-written tests, and coverage/mutation tool execution belong to the later experiment phase.

## Current Research Question

For medium-complexity Java or Python functions/classes, can GPT-4 generate unit tests that reach branch coverage >= 80% and mutation score >= 60%, compared with student-written unit tests for the same code?

## Current Scope

- Languages: Java and Python.
- Java test stack: JUnit 5, JaCoCo, PIT/PiTest, Maven.
- Python test stack: pytest, coverage.py branch coverage, mutmut or Cosmic Ray.
- Target dataset later: 20 Java/Python functions/classes total, cyclomatic complexity 3-7.
- Baseline later: student-written unit tests for the same functions/classes.
- Out of scope: production-code generation, UI/API/acceptance testing, requirement-to-test generation without executable unit tests, and text-similarity evaluation.

## RBL-1 Status

| Step | Status | Main File |
| --- | --- | --- |
| PICO | Done | `docs/pico.md` |
| Research question | Done | `docs/research_question.md` |
| Scope | Done | `docs/scope.md` |
| Keyword seed | Done | `SLR/keyword_seed.md` |
| Search strings | Done | `SLR/search_strings.md` |
| Search log | Done | `SLR/search_log.csv` |
| Raw records | Done | `SLR/raw_records_*.csv` |
| Merge records | Done | `SLR/01_all_records.csv` |
| Deduplication | Done | `SLR/01_all_records_dedup.csv` |
| Title/abstract screening | Done | `SLR/02_after_screening_v1.csv` |
| Final included papers | Done | `SLR/03_final_included.csv` |
| PRISMA flow | Done | `SLR/prisma_flow.md` |
| Evidence table | Done | `SLR/evidence_table.csv` |
| GAP evidence | Done | `SLR/gap_evidence.md` |
| Hypotheses | Done | `docs/hypotheses.md` |

## PRISMA Summary

| Stage | Count |
| --- | ---: |
| Records identified | 130 |
| Duplicates removed | 30 |
| Records after deduplication | 100 |
| Title/abstract INCLUDE | 62 |
| Title/abstract UNSURE | 14 |
| Title/abstract EXCLUDE | 24 |
| Records sent to full-text/final prioritization | 76 |
| Records not selected after prioritization | 61 |
| Final included papers | 15 |

The detailed PRISMA table and Mermaid diagram are in `SLR/prisma_flow.md`.

## Final Gap

Existing studies show that LLMs can generate unit tests and that coverage can often be improved with extra techniques such as mutation feedback, method slicing, reinforcement learning, program analysis, or project-context extraction. However, there is still limited consolidated evidence on whether GPT-4, using a fixed prompt and no iterative coverage/mutation feedback, can generate unit tests for medium-complexity Java or Python functions/classes that reach branch coverage >= 80% and mutation score >= 60%, compared with student-written tests for the same code.

See `SLR/gap_evidence.md` for the full gap argument.

## Working Structure

- `docs/`: RQ, PICO, scope, hypotheses, and project guidance.
- `SLR/`: search strings/logs, raw records, deduplication, screening, PRISMA, evidence table, and research gap.

## Suggested Owner Split

| Member | Phase 1 Search Source | Main Project Role | Main Folders |
| --- | --- | --- | --- |
| Person 1 | Google Scholar | Leader, RQ/PICO, PRISMA, methodology, final integration | `docs/`, `SLR/` |
| Person 2 | IEEE Xplore | Literature search support, screening, evidence table | `SLR/` |
| Person 3 | ACM Digital Library | Literature search support, screening, evidence table | `SLR/` |
| Person 4 | Semantic Scholar | Literature support and evidence table support | `SLR/` |
| Person 5 | arXiv + CORE/ResearchGate | Literature support and PRISMA/GAP support | `SLR/` |

## Next Phase

The later experiment phase should create the Java/Python dataset, generate GPT-4 tests with one fixed prompt, collect independent student-written tests, execute coverage/mutation tools, and compare the two matched test sets statistically.