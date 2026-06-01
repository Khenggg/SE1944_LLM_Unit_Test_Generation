# PRISMA Flow - ACM Digital Library

[Records identified from ACM Digital Library searching (N = manual verify)]
↓
[Records selected/exported before dedup (N = 11)]
↓
[Records after duplicate removal (N = 11)]
↓
[Screened by title + abstract (N = 11)]
├── Excluded (N = 0)
└── Included / Unsure after V1 (N = 11)
↓
[Full-text assessed (N = 11)]
├── Excluded after full-text assessment (N = 0)
└── Final included (N = 11)

## Consistency Check

- Rows in `raw_records_acm.csv`: 11
- Rows in `02_after_screening_v1.csv`: 11
- Count `v1_decision = INCLUDE`: 11
- Count `v2_decision = Include`: 11
- Final included papers in `03_final_included.csv`: 11

## Notes

- ACM Digital Library may not accept long Boolean search strings, so short search variants were also used.
- Potential duplicates with Google Scholar or IEEE Xplore are kept in the ACM raw file and marked in notes.
- Cross-database deduplication will be performed in Phase 2 using DOI/title-level matching.
