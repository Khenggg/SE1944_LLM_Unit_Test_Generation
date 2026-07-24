# Khang - Google Scholar Mini-SLR

This branch contains Khang's individual RBL-1 mini-SLR for the topic **LLM for Unit Test Case Generation**.

Only the Google Scholar source is included in this branch. Other members' sources, legacy mixed-source files, and team synthesis files were removed intentionally.

## Required Structure

```text
Khang/
+-- SLR/
|   +-- search-log.md
|   +-- 01_all_records.csv
|   +-- 02_after_screening_v1.csv
|   +-- 03_final_included.csv
|   +-- ie_criteria.md
|   +-- prisma-flow.md
|   +-- evidence-table.md
|   +-- gap-statement.md
+-- experiment/
    +-- 01_rq.md
    +-- hypotheses.md
```

## Topic

LLM for Unit Test Case Generation

## Initial RQ

Đối với Java/Python functions ở cyclomatic complexity trung bình, GPT-4 tự động sinh unit test cases so với test cases viết thủ công bởi sinh viên có đạt branch coverage >= 80% và mutation score >= 60% không?

## Current Counts

| Stage | Count |
| --- | ---: |
| Google Scholar raw hits | 2909 |
| Google Scholar selected/exported records before dedup | 60 |
| Duplicate records removed | 19 |
| Records after dedup | 41 |
| V1 INCLUDE | 19 |
| V1 UNSURE | 5 |
| V1 EXCLUDE | 17 |
| Full-text/final-prioritization assessed | 24 |
| Not selected after V2/final prioritization | 20 |
| Final included papers | 4 |

The PRISMA counts are recorded in `SLR/prisma-flow.md` and must match the CSV row counts.
