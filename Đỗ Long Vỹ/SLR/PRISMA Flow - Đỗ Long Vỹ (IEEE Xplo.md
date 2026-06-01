PRISMA Flow - Đỗ Long Vỹ (IEEE Xplore)
Identification (Xác định tài liệu)
Records identified from IEEE Xplore raw search hits: Đang cập nhật số raw hits từ hệ thống (Ví dụ: ~350)

Records selected/exported before deduplication: 25

Deduplication (Lọc trùng)
(Do đây là tập xuất độc lập từ một nguồn duy nhất nên không có bài trùng lặp nội bộ hệ thống)

Records before deduplication: 25

Duplicate records removed: 0

Records after deduplication: 25

Screening V1 - Title and Abstract (Sàng lọc Vòng 1: Tiêu đề và Tóm tắt)
Records screened: 25

Records excluded at V1: 5

(Mã loại: IEEE020, IEEE021, IEEE022, IEEE023, IEEE024)

Records unsure at V1: 1

(Mã cân nhắc: IEEE013 - Test bo mạch phần cứng PCB, cần đọc kỹ để quyết định phạm vi)

Records included at V1: 19

(Các bài đúng tiêu chí LLM + Software Unit Testing còn lại)

Records included or unsure for full-text: 20 (19 Included + 1 Unsure)

Screening V2 - Full Text (Sàng lọc Vòng 2: Toàn văn)
Full-text/final-prioritization papers assessed: 20

Full-text/final-prioritization papers excluded or not selected: 15 (Dự kiến loại bớt các bài trùng lặp ý tưởng hoặc không tối ưu để cô lập đối tượng sau khi đọc toàn văn)

Final included papers: 5 (Số lượng bài cốt lõi, chuyên sâu nhất giữ lại làm tiền đề so sánh chéo)

Consistency Check (Kiểm tra tính nhất quán dữ liệu)
Rows in SLR/01_all_records_ieee.csv = 25

Rows in SLR/02_after_screening_v1_ieee.csv = 25

Count(v1_decision = EXCLUDE) = 5

Count(v1_decision = INCLUDE or UNSURE) = 20

Rows in SLR/03_final_included_ieee.csv = 5


flowchart TD
    %% Nodes Definition
    A["IEEE Xplore selected/exported records (n = 25)"] 
    B["Duplicates removed (n = 0)"]
    C["Records after deduplication (n = 25)"]
    D["Title/abstract screened (n = 25)"]
    E["Excluded at V1 (n = 5)"]
    F["Full-text/final prioritization assessed (n = 20)"]
    G["Excluded or not selected after V2 (n = 15)"]
    H["Final included studies (n = 5)"]

    %% Flow/Connections
    A --> B
    B --> C
    C --> D
    D --> E
    D --> F
    F --> G
    F --> H

    %% Styling (Optional but makes it professional)
    style A fill:#1B365D,stroke:#333,stroke-width:2px,color:#fff
    style C fill:#f9f9f9,stroke:#333,stroke-width:1px
    style E fill:#FCE8E6,stroke:#C5221F,stroke-width:1px,color:#C5221F
    style G fill:#FCE8E6,stroke:#C5221F,stroke-width:1px,color:#C5221F
    style H fill:#E6F4EA,stroke:#137333,stroke-width:2px,color:#137333