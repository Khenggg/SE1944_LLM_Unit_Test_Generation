# Search Log - LLM for Unit Test Generation

**Member:** Khang

**Assigned source:** Google Scholar

**Search date:** 2026-06-05

---

## Query String

### String A - PICO-based search string

```text
("ChatGPT" OR "GPT-4" OR "Codex") "unit test generation" ("branch coverage" OR "mutation score") ("JUnit" OR "pytest")
```

This string intentionally does not include `"student-written coursework/assignment tests"`. Student-written coursework/assignment tests are the comparison baseline in the final RQ, but forcing that term into the main search string would over-filter the result set and would not match the 249-record Google Scholar scraper export used in this review.

## Final RQ Alignment

For Java/Python functions or classes with medium cyclomatic complexity, this SLR supports the following experiment direction: evaluate GPT-4/GPT-4o-generated unit tests using branch coverage and mutation score, then compare the generated tests with student-written coursework/assignment tests on the same code units.

Medium cyclomatic complexity is not included as a mandatory search term because it would over-filter the literature. It is applied later as an experiment dataset constraint and as part of the GAP-D framing.

## PICO Mapping

| PICO | Content | Search-string component |
| --- | --- | --- |
| P - Population | Java/Python unit-level code; medium complexity is applied later during experiment design | `"JUnit" OR "pytest"` |
| I - Intervention | LLM-based test generation using ChatGPT, GPT-4, or Codex | `"ChatGPT" OR "GPT-4" OR "Codex"` |
| C - Comparison | Student-written coursework/assignment tests on the same code units for the experiment; literature-backed thresholds for absolute checks | Not used as search term to avoid over-filtering |
| O - Outcome | Branch coverage and mutation score | `"branch coverage" OR "mutation score"` |

## Search Execution Log

| Database | String | Date | Raw search hits | Records exported | Notes |
| --- | --- | --- | ---: | ---: | --- |
| Google Scholar | String A | 2026-06-05 | 249 | 249 | Raw result count is below the RBL-1 upper bound of 500; the authoritative deduplicated dataset used for screening is `SLR/01_all_records.csv`. |

## Search Count Summary

| Database | String | Result count |
| --- | --- | ---: |
| Google Scholar | String A | 249 |
| **Total before deduplication** | | **249** |
| **After deduplication** | | **246** |
| **Duplicates removed** | | **3** |

## Metadata Enrichment

| Source | Purpose | Result |
| --- | --- | --- |
| OpenAlex API | Verify DOI/title metadata and fill missing DOI/metadata where confidently matched | 155/246 deduped records have DOI after enrichment; 91/246 still have no DOI |

## Screening Status

| Step | Status | N |
| --- | --- | ---: |
| Raw Google Scholar scraper records | Done | 249 |
| Deduplicated records in `01_all_records.csv` | Done | 246 |
| V1 title/abstract screening | Done | 246 |
| V1 excluded | Done | 131 |
| V1 included | Done | 45 |
| V1 unsure | Done | 70 |
| V2 full-text/prioritization assessed | Done | 115 |
| V2 excluded | Done | 99 |
| Final included with extractable numeric evidence | Done | 16 |

## Screening Notes

- Deduplication was done by DOI when available, otherwise by normalized title.
- `02_after_screening_v1.csv` contains all 246 deduplicated records with V1 decisions.
- `03_final_included.csv` contains all 246 records with V2 fields; V1-excluded records keep blank V2 fields.
- Final included N = 16, and all included papers have extractable numeric evidence in `evidence-table.md`.
