# PRISMA Flowchart – Systematic Literature Review (arXiv+CORE Scope)
## Research Question: For Java/Python functions at medium cyclomatic complexity (P), could GPT-4 automatic generation of unit test cases (I) compared to manually written test cases (C) achieve >=80% branch coverage and >=60% mutation score (O)?
**Date of search:** 27 May 2026 | **Database:** arXiv+CORE

---

```
╔══════════════════════════════════════════════════════════════════════════════════╗
║                        IDENTIFICATION                                            ║
║                                                                                  ║
║   Records identified through database searching                                  ║
║                                                                                  ║
║   ┌─────────────────────────┐         ┌─────────────────────────┐                ║
║   │ arXiv                   │         │ CORE                    │                ║
║   │ (N = 9)                 │         │ (N = 61146)             │                ║
║   │ Search date: 27/05/2026 │         │ Search date: 27/05/2026 │                ║
║   │ Search string: boolean  │         │ Search string: boolean  │                ║
║   │ (LLM/GPT) AND           │         │ (LLM/GPT) AND           │                ║
║   │ (software/unit testing) │         │ (software/unit testing) │                ║
║   │ AND (mutation/coverage) │         │ AND (mutation/coverage) │                ║
║   └─────────────────────────┘         └─────────────────────────┘                ║
║                │                                   │                             ║
║                └─────────────────┬─────────────────┘                             ║
║                                  │                                               ║
║                      61155 records retrieved and filtered by AI                  ║
║                  based on relevance (N = 10 candidate records logged)            ║
║                                  ▼                                               ║
╠══════════════════════════════════════════════════════════════════════════════════╣
║             │                                                                    ║
║   ┌────────────────────────────────────────────────────────────────┐             ║
║   │  Records after deduplication / pre-exclusion (N = 10)          │             ║
║   └────────────────────────────────────────────────────────────────┘             ║
║             │                                                                    ║
║             ▼                                                                    ║
╠══════════════════════════════════════════════════════════════════════════════════╣
║                        SCREENING – ROUND 1 (Vòng 1)                              ║
║                                                                                  ║
║   ┌──────────────────────────────────┐     ┌─────────────────────────────────┐   ║
║   │  Title + Abstract screened       │────▶│  Excluded (N = 0)               │   ║
║   │  (N = 10)                        │     │                                 │   ║
║   │                                  │     │  EC (reasons):                  │   ║
║   │  Reviewer: Huỳnh Cao Phước       │     │  • None                         │   ║
║   │  Criteria applied: IC1–IC6       │     │                                 │   ║
║   │                  + EC1–EC7       │     │                                 │   ║
║   │                                  │     │                                 │   ║
║   └──────────────────────────────────┘     └─────────────────────────────────┘   ║
║             │                                                                    ║
║             │  Records retained for full-text screening (N = 10)                 ║
║             │  (including 1 unsure record AX008)                                 ║
║             ▼                                                                    ║
╠══════════════════════════════════════════════════════════════════════════════════╣
║                        SCREENING – ROUND 2 (Vòng 2)                              ║
║                                                                                  ║
║   ┌──────────────────────────────────┐     ┌─────────────────────────────────┐   ║
║   │  Full-text assessed              │────▶│  Excluded (N = 1)               │   ║
║   │  (N = 10)                        │     │                                 │   ║
║   │                                  │     │  Reason (EC6):                  │   ║
║   │  Reviewer: Huỳnh Cao Phước       │     │  • Focuses on system/repository-│   ║
║   │  Criteria applied: IC1–IC6       │     │    level testing & bug discovery│   ║
║   │                  + EC1–EC7       │     │    rather than unit test or     │   ║
║   │  (full paper content reviewed)   │     │    coverage (AX008)             │   ║
║   └──────────────────────────────────┘     └─────────────────────────────────┘   ║
║             │                                                                    ║
║             │  Studies included in synthesis (N = 9)                             ║
║             ▼                                                                    ║
╠══════════════════════════════════════════════════════════════════════════════════╣
║                        INCLUDED                                                  ║
║                                                                                  ║
║   ┌────────────────────────────────────────────────────────────────┐             ║
║   │  Studies included in Evidence Table (N = 9)                    │             ║
║   │                                                                │             ║
║   │  AX001 – WeiZhe Xu et al., 2026, arXiv                         │             ║
║   │  AX002 – Yibo Wang et al., 2025, arXiv                         │             ║
║   │  AX003 – Dong Huang et al., 2025, arXiv                        │             ║
║   │  AX004 – Bei Chu et al., 2025, arXiv                           │             ║
║   │  AX005 – Lin Yang et al., 2024, arXiv                          │             ║
║   │  AX006 – Guancheng Wang et al., 2026, arXiv                    │             ║
║   │  AX007 – HITS (Wang et al., 2024, ASE)                         │             ║
║   │  CORE001 – KTester (Li et al., 2025, ICSE)                     │             ║
║   │  AX009 – Sabaat Haroon et al., 2026, arXiv                     │             ║
║   └────────────────────────────────────────────────────────────────┘             ║
╚══════════════════════════════════════════════════════════════════════════════════╝
```

---

## Summary Statistics

| Stage | Count |
|---|---|
| Records identified (arXiv+CORE, Huỳnh Cao Phước scope) | 61155 |
| Candidate records retrieved and logged | 10 |
| **Round 1** – Title + Abstract screened | 10 |
| **Round 1** – Excluded | 0 |
| **Round 2** – Full-text assessed | 10 |
| **Round 2** – Excluded (EC6 – Repo-level / bug discovery focus) | 1 |
| **Final included in Evidence Table** | **9** |

---
