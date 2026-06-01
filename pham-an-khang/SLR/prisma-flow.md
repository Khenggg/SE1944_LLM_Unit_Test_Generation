# PRISMA Flowchart – Systematic Literature Review (Semantic Scholar Scope)
## Research Question: For Java/Python functions at medium cyclomatic complexity (P), could GPT-4 automatic generation of unit test cases (I) compared to manually written test cases (C) achieve >=80% branch coverage and >=60% mutation score (O)?
**Date of search:** 26–28 May 2026 | **Database:** Semantic Scholar

---

```
╔══════════════════════════════════════════════════════════════════════════════════╗
║                        IDENTIFICATION                                           ║
║                                                                                 ║
║   Records identified through database searching                                 ║
║                                                                                 ║
║   ┌─────────────────────────┐                                                   ║
║   │ Semantic Scholar        │                                                   ║
║   │ (N = 299)               │                                                   ║
║   │ Search date: 28/05/2026 │                                                   ║
║   │ Search string: boolean  │                                                   ║
║   │ (LLM/GPT/ChatGPT) AND   │                                                   ║
║   │ (unit test generation)  │                                                   ║
║   │ AND (branch coverage /  │                                                   ║
║   │ mutation testing)       │                                                   ║
║   └─────────────────────────┘                                                   ║
║             │                                                                   ║
║             │   299 records retrieved from Semantic Scholar and filtered        ║
║             │   by AI based on relevance (N = 17 candidate records logged)      ║
║             ▼                                                                   ║
╠══════════════════════════════════════════════════════════════════════════════════╣
║             │                                                                   ║
║   ┌────────────────────────────────────────────────────────────────┐            ║
║   │  Records after deduplication / pre-exclusion (N = 17)          │            ║
║   └────────────────────────────────────────────────────────────────┘            ║
║             │                                                                   ║
║             ▼                                                                   ║
╠══════════════════════════════════════════════════════════════════════════════════╣
║                        SCREENING – ROUND 1 (Vòng 1)                             ║
║                                                                                 ║
║   ┌──────────────────────────────────┐     ┌─────────────────────────────────┐  ║
║   │  Title + Abstract screened       │────▶│  Excluded (N = 4)               │  ║
║   │  (N = 17)                        │     │                                 │  ║
║   │                                  │     │  EC (reasons):                  │  ║
║   │  Reviewer: Person 4              │     │  • IC6 not met: JS only (SS002) │  ║
║   │  Criteria applied: IC1–IC6       │     │  • EC2: PDF not found (SS012)   │  ║
║   │                  + EC1–EC7       │     │  • EC5: SLR/Survey (SS014)      │  ║
║   │                                  │     │  • EC2: PDF not found (SS015)   │  ║
║   └──────────────────────────────────┘     └─────────────────────────────────┘  ║
║             │                                                                   ║
║             │  Records retained for full-text screening (N = 13)                ║
║             ▼                                                                   ║
╠══════════════════════════════════════════════════════════════════════════════════╣
║                        SCREENING – ROUND 2 (Vòng 2)                             ║
║                                                                                 ║
║   ┌──────────────────────────────────┐     ┌─────────────────────────────────┐  ║
║   │  Full-text assessed              │────▶│  Excluded (N = 6)               │  ║
║   │  (N = 13)                        │     │                                 │  ║
║   │                                  │     │  Reason (EC6):                  │  ║
║   │  Reviewer: Person 4              │     │  • Lacks core GPT-4 evaluation  │  ║
║   │  Criteria applied: IC1–IC6       │     │    and/or critical branch       │  ║
║   │                  + EC1–EC7       │     │    coverage and mutation score  │  ║
║   │  (full paper content reviewed)   │     │    metrics necessary for PICO   │  ║
║   └──────────────────────────────────┘     └─────────────────────────────────┘  ║
║             │                                                                   ║
║             │  Studies included in synthesis (N = 7)                            ║
║             ▼                                                                   ║
╠══════════════════════════════════════════════════════════════════════════════════╣
║                        INCLUDED                                                 ║
║                                                                                 ║
║   ┌────────────────────────────────────────────────────────────────┐            ║
║   │  Studies included in Evidence Table (N = 7)                    │            ║
║   │                                                                │            ║
║   │  SS001 – MUTGEN (Wang et al., 2026, IEEE TSE)                  │            ║
║   │  SS004 – MuTAP (Dakhel et al., 2024, IST)                      │            ║
║   │  SS006 – LLMs & Prompting Eval (Ouédraogo et al., 2024, ASE)   │            ║
║   │  SS007 – HITS (Wang et al., 2024, ASE)                         │            ║
║   │  SS008 – CoverUp (Pizzorno & Berger, 2025, ACM FSE)            │            ║
║   │  SS009 – TestGenEval (Jain et al., 2025, ICLR)                 │            ║
║   │  SS011 – Multi-LLM Chaining (Kumar et al., 2025, IEEE Access)  │            ║
║   └────────────────────────────────────────────────────────────────┘            ║
╚══════════════════════════════════════════════════════════════════════════════════╝
```

---

## Summary Statistics

| Stage | Count |
|---|---|
| Records identified (Semantic Scholar, Person 4 scope) | 299 |
| Candidate records retrieved and logged | 17 |
| **Round 1** – Title + Abstract screened | 17 |
| **Round 1** – Excluded (JS only: 1; PDF not found: 2; SLR: 1) | 4 |
| **Round 2** – Full-text assessed | 13 |
| **Round 2** – Excluded (EC6 – lack of PICO-aligned content) | 6 |
| **Final included in Evidence Table** | **7** |

---
