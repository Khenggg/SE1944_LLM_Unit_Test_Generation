# PRISMA Flow Diagram

```mermaid
flowchart TD
    %% Define Styles
    classDef mainNode fill:#eef2f5,stroke:#3b5998,stroke-width:2px,color:#000,font-weight:bold,rx:5px,ry:5px;
    classDef subNode fill:#fff,stroke:#e74c3c,stroke-width:2px,color:#c0392b,stroke-dasharray: 5 5;
    classDef resultNode fill:#d4edda,stroke:#28a745,stroke-width:2px,color:#155724,font-weight:bold,rx:5px,ry:5px;
    
    A1["Identification<br/>Semantic Scholar Search<br/>(N = 270)"]:::mainNode --> A2["Collected via Zotero<br/>(N = 257)"]:::mainNode
    A2 --> B["Screening<br/>After deduplication<br/>(N = 250)"]:::mainNode
    
    B --> C{"Title & Abstract<br/>Screening<br/>(N = 250)"}:::mainNode
    
    C -- Excluded --> D["Records Excluded (N = 228)<br/>- EC3: 181<br/>- EC4: 24<br/>- EC6: 17<br/>- EC5: 1<br/>- Other (IC4 fails): 5"]:::subNode
    
    C -- Passed (10 INCLUDE, 12 UNSURE) --> E{"Full-text Screening<br/>(N = 22)"}:::mainNode
    
    E -- Excluded --> F["Records Excluded (N = 10)<br/>- EC5: 6<br/>- EC4: 3<br/>- EC3: 1"]:::subNode
    
    E -- Included --> G["Final Included Papers<br/>(N = 12)"]:::resultNode
```

### Screening Steps Detail

| Step | Details |
|---|---|
| Identification | 270 records identified from Semantic Scholar raw search (see search-log.md for details). 257 records were successfully collected via Zotero for screening.|
| Deduplication | Removed 7 duplicates, 250 records kept into screening. |
| Screening v1 (Title and Abstract) | Screened 250 records. Excluded 228 records at v1. 10 INCLUDE and 12 UNSURE kept to round 2 |
| Screening v2 (Full-text) | Screened 22 records in detail. Excluded 10 records at v2. |
| Final Inclusion | 12 records for evidence_table.csv. |

**Consistency Check:**
- Rows in 01_all_records.csv after deduplication = 250 
- Count(v1_decision = EXCLUDE) in 02_after_screening_v1.csv = 228
- Count(v1 = INCLUDE + UNSURE) in 02_after_screening_v1.csv = 22
- Count(v2_decision = EXCLUDE) in round 2 full-text screening = 10
- Count(v2_decision = INCLUDE) exclusively in 03_final_included.csv = 12 => Included in evidence_table.csv
