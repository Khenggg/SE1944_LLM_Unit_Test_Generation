# Search Log - LLM for Unit Test Generation

**Thanh vien:** Khang

**Nguon phu trach:** Google Scholar

**Ngay thuc hien:** 2026-06-05

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

| PICO | Noi dung | Thanh phan trong search string |
| --- | --- | --- |
| P - Population | Java/Python unit-level code; medium complexity is applied later during experiment design | `"JUnit" OR "pytest"` |
| I - Intervention | LLM-based test generation using ChatGPT, GPT-4, or Codex | `"ChatGPT" OR "GPT-4" OR "Codex"` |
| C - Comparison | Student-written coursework/assignment tests on the same code units for the experiment; literature-backed thresholds for absolute checks | Not used as search term to avoid over-filtering |
| O - Outcome | Branch coverage and mutation score | `"branch coverage" OR "mutation score"` |

## Search Execution Log

| Database | String | Date | Raw search hits | Records exported | Notes |
| --- | --- | --- | ---: | ---: | --- |
| Google Scholar | String A | 2026-06-05 | 249 | 249 | Raw result count is below the RBL-1 upper bound of 500; the authoritative deduplicated dataset used for screening is `SLR/01_all_records.csv`. |

## Tong hop truoc dedup

| Database | String | Ket qua |
| --- | --- | ---: |
| Google Scholar | String A | 249 |
| **Tong truoc dedup** | | **249** |
| **Sau dedup** | | **246** |
| **So bi loai do trung lap** | | **3** |

## Metadata Enrichment

| Source | Purpose | Result |
| --- | --- | --- |
| OpenAlex API | Verify DOI/title metadata and fill missing DOI/metadata where confidently matched | 155/246 deduped records have DOI after enrichment; 91/246 still have no DOI |

Note: The authoritative deduplicated dataset for later screening is `SLR/01_all_records.csv` with 246 rows; its DOI count is 155 with DOI and 91 without DOI.

## Current RBL-1 Status

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

## Ghi chu

- Day la ban lam lai tu dau theo RBL-1, khong su dung cac so V1/V2/final tu pipeline cu.
- Chi su dung mot search string duy nhat tu PICO.
- Deduplication was done by DOI when available, otherwise by normalized title.
- `02_after_screening_v1.csv` da duoc tao lai tu 246 record moi.
- `03_final_included.csv` da duoc tao lai tu 115 record INCLUDE/UNSURE sau V1; final included N = 16, tat ca co ket qua so extractable trong `evidence-table.md` va dat yeu cau RBL-2 N > 5.
