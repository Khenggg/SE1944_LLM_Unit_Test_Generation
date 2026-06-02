# PRISMA Flow – Đỗ Long Vỹ (IEEE Xplore)

## Identification

* Records identified from IEEE Xplore raw search results: *To be updated based on the total number of raw hits retrieved from the system (e.g., approximately 350).*
* Records selected/exported before deduplication: **25**

## Deduplication

Since the dataset was exported independently from a single database source, no internal duplicate records were identified.

* Records before deduplication: **25**
* Duplicate records removed: **0**
* Records after deduplication: **25**

## Screening V1 – Title and Abstract Screening

* Records screened: **25**
* Records excluded at V1: **5**

  * Excluded IDs: IEEE020, IEEE021, IEEE022, IEEE023, IEEE024
* Records marked as unsure at V1: **1**

  * IEEE013: Focuses on PCB hardware testing and required further assessment to determine its relevance to the study scope.
* Records included at V1: **19**

  * Papers meeting the predefined criteria related to LLMs and software unit testing.
* Records included or marked as unsure for full-text assessment: **20** (19 Included + 1 Unsure)

## Screening V2 – Full-Text Review

* Full-text/final-prioritization papers assessed: **20**
* Full-text/final-prioritization papers excluded or not selected: **15**

  * These papers were excluded after detailed review due to overlapping research contributions, limited relevance, or lower suitability for the final comparison framework.
* Final included papers: **5**

  * The most relevant and comprehensive studies retained as the primary foundation for comparative analysis.

## Consistency Check

* Rows in `SLR/01_all_records_ieee.csv`: **25**
* Rows in `SLR/02_after_screening_v1_ieee.csv`: **25**
* Count of `v1_decision = EXCLUDE`: **5**
* Count of `v1_decision = INCLUDE or UNSURE`: **20**
* Rows in `SLR/03_final_included_ieee.csv`: **5**



flowchart TD
    A["IEEE Xplore selected/exported records (n = 25)"]
    B["Duplicates removed (n = 0)"]
    C["Records after deduplication (n = 25)"]
    D["Title and abstract screened (n = 25)"]
    E["Excluded at V1 (n = 5)"]
    F["Full-text/final prioritization assessed (n = 20)"]
    G["Excluded or not selected after V2 (n = 15)"]
    H["Final included studies (n = 5)"]

    A --> B
    B --> C
    C --> D
    D --> E
    D --> F
    F --> G
    F --> H

    style A fill:#1B365D,stroke:#333,stroke-width:2px,color:#fff
    style C fill:#f9f9f9,stroke:#333,stroke-width:1px
    style E fill:#FCE8E6,stroke:#C5221F,stroke-width:1px,color:#C5221F
    style G fill:#FCE8E6,stroke:#C5221F,stroke-width:1px,color:#C5221F
    style H fill:#E6F4EA,stroke:#137333,stroke-width:2px,color:#137333
