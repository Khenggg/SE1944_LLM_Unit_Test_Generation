# Huong Dan Rut Gon Cho SE1944

## De tai

LLM for Unit Test Case Generation.

Muc tieu: danh gia GPT-4 sinh unit test cho Java/Python functions/classes co dat branch coverage >= 80% va mutation score >= 60% hay khong, khi so voi unit test viet thu cong boi sinh vien.

## Scope

- Language: Java va Python.
- Test framework: JUnit 5 cho Java, pytest cho Python.
- Coverage: JaCoCo branch coverage cho Java, coverage.py branch coverage cho Python.
- Mutation testing: PIT/PiTest cho Java, mutmut hoac Cosmic Ray cho Python.
- Dataset: 20 functions/classes, cyclomatic complexity 3-7.
- Baseline: student-written unit tests tren cung code.

Khong lam: BDD/Gherkin, API testing, UI testing, acceptance testing, semantic similarity, sinh production code.

## Cau Truc Toi Thieu

```text
SE1944_LLM_Unit_Test_Generation/
|-- README.md
|-- docs/
|   |-- huong_dan.md
|   |-- research_question.md
|   |-- pico.md
|   |-- scope.md
|   `-- hypotheses.md
|-- SLR/
|   |-- keyword_seed.md
|   |-- search_strings.md
|   |-- search_log.csv
|   |-- 01_all_records.csv
|   |-- 01_all_records_dedup.csv
|   |-- 02_after_screening_v1.csv
|   |-- 03_final_included.csv
|   |-- ie_criteria.md
|   |-- prisma_flow.md
|   |-- evidence_table.csv
|   `-- gap_evidence.md
```

## Workflow RBL-1

1. Chot RQ/PICO/scope trong `docs/`.
2. Rut keyword tu PICO vao `SLR/keyword_seed.md`.
3. Tao search strings trong `SLR/search_strings.md`.
4. Moi thanh vien search paper theo nguon duoc chia, ghi count vao `SLR/search_log.csv`.
5. Ghi tat ca paper ung vien vao `SLR/01_all_records.csv`.
6. Xoa trung lap va luu vao `SLR/01_all_records_dedup.csv`.
7. Loc title/abstract vao `SLR/02_after_screening_v1.csv`.
8. Loc full-text vao `SLR/03_final_included.csv`.
9. Dien `SLR/prisma_flow.md`, `SLR/evidence_table.csv`, `SLR/gap_evidence.md`.
10. Tinh chinh RQ dua tren GAP.
11. Viet H0/H1 va giai thich test thong ke/p-value.
12. Viet bao cao/checkpoint RBL-1.

Chua can lam trong RBL-1: tao dataset Java/Python that, sinh test bang GPT-4, viet student tests, chay coverage/mutation tools, hoac tao bang ket qua coverage/mutation. Nhung viec do thuoc phase thuc nghiem sau.

## Phan Cong 5 Nguoi

| Member | Search source | Main role |
| --- | --- | --- |
| Person 1 | Google Scholar | RQ/PICO, merge records, PRISMA, final report |
| Person 2 | IEEE Xplore | Search, screening, evidence table |
| Person 3 | ACM Digital Library | Search, screening, evidence table |
| Person 4 | Semantic Scholar | Evidence table support |
| Person 5 | arXiv + CORE/ResearchGate | PRISMA/GAP support |

