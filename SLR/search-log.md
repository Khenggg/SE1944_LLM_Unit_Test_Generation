# Search Log - LLM for Unit Test Case Generation

**Thành viên:** Khang

**Nguồn phụ trách:** Google Scholar

**Ngày thực hiện:** 2026-05-31

## Query Strings

### String A

```text
('large language model' OR 'LLM' OR 'GPT' OR 'ChatGPT')
AND ('unit test generation' OR 'test case generation' OR 'automated unit testing')
AND ('branch coverage' OR 'code coverage' OR 'mutation score' OR 'mutation testing')
```

### String B

```text
('GPT' OR 'ChatGPT' OR 'large language model')
AND ('JUnit' OR 'pytest' OR 'unit test')
AND ('test generation' OR 'automated test generation')
```

### String C

```text
('large language model' OR 'GPT')
AND ('software testing' OR 'unit testing')
AND ('mutation testing' OR 'coverage')
```

## Search Execution Log

| Database | String | Date | Raw search hits | Notes |
| --- | --- | --- | ---: | --- |
| Google Scholar | String A | 2026-05-31 | 1000 | Crawled with Google Scholar scraper; selected 20 unique records for raw_records_google_scholar.csv; abstracts enriched from OpenAlex when confidently matched |
| Google Scholar | String B | 2026-05-31 | 820 | Crawled with Google Scholar scraper; skipped records already selected from earlier strings and selected next 20 unique records; abstracts enriched from OpenAlex when confidently matched |
| Google Scholar | String C | 2026-05-31 | 1089 | Crawled with Google Scholar scraper; skipped records already selected from earlier strings and selected next 20 unique records; abstracts enriched from OpenAlex when confidently matched |

## Tổng hợp trước dedup

| Database | String | Kết quả |
| --- | --- | ---: |
| Google Scholar | String A | 1000 |
| Google Scholar | String B | 820 |
| Google Scholar | String C | 1089 |
| **Tổng raw search hits** | | **2909** |
| **Records selected/exported before dedup** | | **60** |
| **Sau dedup** | | **41** |
| **Số bị loại do trùng** | | **19** |

## Ghi chú

- Google Scholar returned large raw hit counts, so only the most relevant records were selected/exported for screening.
- Deduplication was done by DOI/title-level matching within the Google Scholar export.
- On 2026-06-02, OpenAlex was used as a supplementary verification source for already-screened INCLUDE records. GS011/TestART was confirmed as OpenAlex work W4403622802 with DOI 10.48550/arXiv.2408.03095 and added to the final included set to satisfy the RBL-2 minimum paper gate.
- This branch intentionally contains only Khang's Google Scholar mini-SLR output.
