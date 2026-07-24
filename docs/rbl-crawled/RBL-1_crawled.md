# RBL-1.pdf - Crawled Content

## Page 1

# RBL-1: Systematic Literature Review → Evidence Table

**Dành cho:** Sinh viên (per-member) + Nhóm (team synthesis)  
**Đầu ra per-member:** Cây thư mục SLR đầy đủ + `experiment/01_rq.md` + `experiment/hypotheses.md`  
**Đầu ra nhóm:** `team-synthesis/` với 4 file tổng hợp  
**Thời gian:** ~15–20 giờ per member (toàn bộ SLR pipeline — đừng để dồn vào 1 ngày)  
**Giai đoạn:** Tuần 3–4 (xem RBL-0 cho tổng quan timeline học kỳ)

> **Quy tắc:** Mọi con số trong PRISMA phải khớp với số dòng thực tế trong các file CSV.

---

## CẤU TRÚC FILE NỘP (per-member)

```text
[tên-thành-viên]/
├── SLR/
│   ├── papers/                         ← Lưu PDF gốc của các paper đã included
│   │   └── Smith_2023_LLMTest.pdf ← Tên chuẩn: Author_Year_Keyword.pdf (không dấu, không
│   ├── search-log.md                   ← BẮT BUỘC — xem hướng dẫn chi tiết bên dưới
│   ├── 01_all_records.csv              ← Toàn bộ paper sau dedup
│   ├── 02_after_screening_v1.csv       ← Thêm cột v1_decision + v1_reason
│   ├── 03_final_included.csv           ← Thêm cột v2_decision + v2_reason
│   ├── ie_criteria.md                  ← Tiêu chí inclusion/exclusion
│   ├── prisma-flow.md                  ← Sơ đồ PRISMA với số khớp CSV
│   ├── evidence-table.md               ← Bảng trích xuất dữ liệu
│   └── gap-statement.md                ← Phân tích khoảng trống
└── experiment/
    ├── 01_rq.md                        ← RQ cá nhân (PICO)
    └── hypotheses.md                   ← H0/H1 cá nhân (draft)
```

> **Quy ước PDF:** Chỉ lưu paper đã **pass V2 screening** (trong `03_final_included.csv`). Tên file: `Author_Year_Keyword.pdf` — ví dụ `Chen_2024_GPT4TestGen.pdf`. Nếu paper không có PDF tự do (paywalled), ghi URL + DOI vào `search-log.md` thay vì để file trống.

```text
team-synthesis/
├── evidence-table-merged.md   ← Gộp tất cả paper của nhóm, bỏ trùng
├── gap-statement-final.md     ← GAP chính thức của nhóm
├── rq-final.md                ← RQ chính thức + PICO đầy đủ
└── hypotheses-draft.md        ← H0/H1 nhóm + statistical test dự kiến
```

---

## Page 2

# DATABASE CHUẨN CHO SLR (dùng đủ 5 database chính)

| Database | URL | Mạnh về | Ghi chú |
|---|---|---|---|
| Google Scholar | scholar.google.com | Phủ rộng nhất, bao gồm preprint, workshop | Dùng làm net bắt đầu — filter thủ công |
| IEEE Xplore | ieeexplore.ieee.org | SE conference/journal: ICSE, RE, TSE, TOSEM | Bắt buộc với topic software testing / LLM |
| ACM Digital Library | dl.acm.org | SE: ISSTA, FSE, ASE, ESEC | Bắt buộc |
| Semantic Scholar | semanticscholar.org | AI/ML papers, free, có API bulk export | Tốt cho LLM/NLP topics |
| OpenAlex | openalex.org | Hoàn toàn mở, 250M+ works, bulk export API | Tốt cho programmatic SLR — `api.openalex.org` |

> **Snowballing (cross-reference search):** Sau khi có `03_final_included.csv`, đọc reference list của từng paper included → kiểm tra paper mới qua Semantic Scholar → add vào `01_all_records.csv` với `search_strings = "snowball"` → đi qua V1+V2 screening như bình thường.  
> **CrossRef** (crossref.org) dùng để **verify DOI / metadata** — không phải primary search database.

---

# FILE 1: `search-log.md` — QUAN TRỌNG!!!!!

## Tại sao file này cần thiết?

`search-log.md` là **bằng chứng bạn đã thực sự tìm kiếm**. Không có file này, không thể verify quá trình SLR --> Đây là file đầu tiên được kiểm tra khi phát hiện nghi ngờ fabrication.

## Template `search-log.md`

    # Search Log – [Tên topic]
    **Thành viên:** [Họ tên]
    **Ngày thực hiện:** YYYY-MM-DD

    ---

    ## Chuỗi tìm kiếm (Query Strings)

---

## Page 3

### String A
**Query nguyên văn:**

("Gherkin" OR "BDD" OR "behavior-driven") AND ("LLM" OR "GPT" OR "language model")  
AND ("test generation" OR "test automation")

**Database:** IEEE Xplore  
**Bộ lọc:** Year 2019–2026, English only, Conference + Journal  
**Ngày search:** 2026-05-25 14:30  
**Số kết quả:** 47 papers

---

### String B
**Query nguyên văn:**

"acceptance test" AND ("large language model" OR "GPT-4" OR "ChatGPT") AND ("user  
story" OR "requirements")

**Database:** Scopus  
**Bộ lọc:** Year 2020–2026  
**Ngày search:** 2026-05-25 15:10  
**Số kết quả:** 38 papers

---

### String C
**Query nguyên văn:**

LLM "Gherkin" generation "semantic similarity"

**Database:** Semantic Scholar  
**Bộ lọc:** Không có bộ lọc (manual filter sau)  
**Ngày search:** 2026-05-26 09:00  
**Số kết quả:** 23 papers

---

## Tổng hợp trước dedup

| Database | String | Kết quả |
|----------|--------|---------|
| IEEE Xplore | String A | 47 |
| Scopus | String B | 38 |
| Semantic Scholar | String C | 23 |
| Snowballing (CrossRef) | Phần S | 8 |
| **Tổng trước dedup** |  | **116** |

---

## Page 4

| **Sau dedup** | | **95** |
| Số bị loại (trùng lặp) | | 21 |

---

## Phần S — Cross-reference Search (Snowballing)

> Snowballing không có query string — không điền vào mục này như các String A/B/C.

**Phương pháp:** Backward snowballing — đọc reference list của các paper đã pass V2 screer  
**Thực hiện:** Sau khi có `03_final_included.csv`, đọc reference list của từng paper inclu  
**Công cụ:** CrossRef (crossref.org) để lookup metadata từ DOI; Google Scholar để check fo  
**Ngày thực hiện:** YYYY-MM-DD  
**Paper included đã scan:** [N] paper  
**Paper mới phát hiện:** [X] paper pass IC (ghi rõ từ paper nào → tìm được paper nào)

> **Lưu ý:** Snowballing chỉ làm SAU khi hoàn thành tất cả database search. Paper tìm được

---

## Ghi chú

- Thực hiện dedup bằng: [Zotero / tay / Excel]
- Paper trùng nhau nhiều nhất: các paper trên IEEE Access xuất hiện cả ở IEEE Xplore và Sc
- Snowballing: [số] paper mới tìm được, [số] pass V2
- [Ghi thêm bất kỳ điểm bất thường nào trong quá trình search]

---

# Ví dụ thực tế — Nhóm X SE19YY (BDD/Gherkin topic)

**SV 01:**

- String A: (`"BDD" OR "Gherkin" OR "behavior-driven development"`) AND (`"LLM" OR "GPT"`) AND (`"test case generation"`) → IEEE Xplore + Scopus = 194 kết quả
- Sau dedup: 122 papers → file 01_all_records.csv có 122 dòng
- Screening V1: 72 bị loại → 50 pass → file 02 có cột v1_decision = 72 EXCLUDE + 50 INCLUDE/Unsure
- Full-text V2: 37 bị loại → 13 final → file 03 có cột v2_decision = 13 INCLUDE

Đây là cách PRISMA và CSV phải khớp nhau.

---

# FILE 2: CSV files — Cấu trúc đúng

## `01_all_records.csv` — Tất cả paper sau dedup

---

## Page 5

```csv
id,title,authors,year,venue,search_strings
1,"Object Oriented BDD...","E. Lee; J. Gong",2023,"SNPD-Winter",String A
2,"Exploring LLMs for...","Babikian; Chen",2025,"MO2RE",String A
...
```

Không có cột decision ở file này.

## `02_after_screening_v1.csv` — Thêm quyết định V1

```csv
id,title,authors,year,venue,search_strings,v1_decision,v1_reason
1,"Object Oriented BDD...",..."String A","INCLUDE","IC-P, IC-I, IC-E"
2,"Exploring LLMs...",..."String A","EXCLUDE","EC-O - không về test generation"
```

`v1_decision`: `INCLUDE`, `EXCLUDE`, hoặc `Unsure`  
`v1_reason`: mã tiêu chí từ ie_criteria.md (vd: "IC-P, IC-I, IC-E" hoặc "EC-A - không tải được full-text")

## `03_final_included.csv` — Thêm quyết định V2

```csv
id,title,...,v1_decision,v1_reason,v2_decision,v2_reason
1,"Object Oriented BDD...",..."INCLUDE","IC-P, IC-I, IC-E","Include","Đọc full-text, đủ IC
3,"Another paper...",..."Unsure","","Include","Đọc full-text, xác nhận đủ IC"
2,"Exploring LLMs...",..."EXCLUDE","EC-O","","" ← bỏ trống v2 vì đã loại từ V1
```

> **Lưu ý:** Chỉ những paper `INCLUDE` hoặc `Unsure` từ V1 mới cần điền `v2_decision`. Paper đã `EXCLUDE` từ V1 để trống v2.

---

# FILE 3: `ie_criteria.md` — Tiêu chí inclusion/exclusion

Có 2 loại tiêu chí: **Copy nguyên** (dùng cho mọi SLR) và **Điền vào** (điền theo topic của bạn).

## Copy nguyên — không sửa

**IC (paper phải có):** IC-L · IC-T · IC-E  
**EC (loại nếu đúng):** EC-D · EC-A · EC-S · EC-N

## Điền vào — 4 ô cần điền

| Mã | Điền gì |
|---|---|
| IC-Y | Năm xuất bản tối thiểu + lý do 1 câu (*LLM → 2020, BERT/NLP → 2018, SE tool → 2015*) |

---

## Page 6

| IC-P | Task cụ thể từ PICO.P (*vd: "sinh test case từ requirement"*) |
|---|---|
| IC-I | Kỹ thuật từ PICO.I (*vd: "LLM, NLP, hoặc AI-based"*) |
| EC-O | Những task hay bị nhầm với IC-P (*liệt kê ≥ 2*) |

> **Lưu ý:** IC-P và IC-I khác nhau — paper có thể dùng LLM (IC-I ✓) nhưng không về task của bạn (IC-P X). Phân biệt rõ giúp ghi `v1_reason` chính xác.

---

# Template `ie_criteria.md` (copy và điền)

```text
# IE Criteria – [Tên topic]
**Thành viên:** [Họ tên]
**RQ:** "[RQ một dòng]"
**PICO:** P=[...] | I=[...] | C=[...] | O=[...]

---

## Inclusion Criteria (IC) – paper PHẢI có đủ tất cả

| Mã | Tiêu chí |
|----|----------|
| **IC-L** | Viết bằng tiếng Anh |
| **IC-Y** | Xuất bản từ [năm] đến nay – Lý do: [1 câu] |
| **IC-T** | Đăng trên conference hoặc journal – không phải blog, thesis, hay báo cáo kỹ t |
| **IC-P** | Về task: [điền từ PICO.P] |
| **IC-I** | Dùng kỹ thuật: [điền từ PICO.I] |
| **IC-E** | Có ít nhất 1 con số kết quả trong Table hoặc Figure của paper gốc |

## Exclusion Criteria (EC) – loại nếu BẤT KỲ điều kiện nào đúng

| Mã | Tiêu chí |
|----|----------|
| **EC-D** | Trùng lặp với paper đã có trong danh sách |
| **EC-A** | Không truy cập được full-text |
| **EC-S** | Dưới 4 trang (extended abstract, poster, short paper) |
| **EC-N** | Không có thực nghiệm (position paper, vision paper, tutorial) |
| **EC-O** | Không về topic: [điền ≥ 2 task hay bị nhầm với IC-P] |
```

---

# Ví dụ đã điền — topic BDD/Gherkin test generation

**PICO:** P=sinh test case Gherkin từ user story | I=GPT-4o zero-shot | C=BLEU ≥ 0.70 | O=BLEU score

---

## Page 7

# IE Criteria – LLM for Gherkin/BDD Test Generation

**Thành viên:** Nguyễn Văn A

**RQ:** "GPT-4o zero-shot có sinh được Gherkin test case từ user story đạt BLEU ≥ 0.70 khô

**PICO:** P=Gherkin test case generation | I=GPT-4o zero-shot | C=BLEU ≥ 0.70 | O=BLEU sco

---

## Inclusion Criteria (IC) – paper PHẢI có đủ tất cả

| Mã | Tiêu chí |
|----|----------|
| **IC-L** | Viết bằng tiếng Anh |
| **IC-Y** | Xuất bản từ 2020 đến nay – Lý do: LLM thế hệ GPT-3+ phổ biến từ 2020 |
| **IC-T** | Đăng trên conference hoặc journal – không phải blog, thesis, hay báo cáo kỹ t |
| **IC-P** | Về task: sinh test case tự động (unit test, acceptance test, Gherkin/BDD) từ |
| **IC-I** | Dùng kỹ thuật: LLM, NLP, hoặc AI-based (GPT, BERT, T5, LLaMA và tương đương) |
| **IC-E** | Có ít nhất 1 con số kết quả trong Table hoặc Figure của paper gốc |

## Exclusion Criteria (EC) – loại nếu BẤT KỲ điều kiện nào đúng

| Mã | Tiêu chí |
|----|----------|
| **EC-D** | Trùng lặp với paper đã có trong danh sách |
| **EC-A** | Không truy cập được full-text |
| **EC-S** | Dưới 4 trang (extended abstract, poster, short paper) |
| **EC-N** | Không có thực nghiệm (position paper, vision paper, tutorial) |
| **EC-O** | Không về topic: test execution, debugging, maintenance; code gen không liên c |

**Checklist tự kiểm (trước khi bắt đầu screening):**

- ☐ Đủ 6 IC và 5 EC?
- ☐ IC-P là tên task cụ thể (không phải "AI trong SE")?
- ☐ IC-I là loại kỹ thuật cụ thể (không phải "công nghệ mới")?
- ☐ EC-O có ≥ 2 task hay bị nhầm?
- ☐ IC-Y có lý do chọn năm?

---

# FILE 4: `prisma-flow.md` — Số phải khớp CSV

```text
[Records từ database searching (N = 108)]  ← Tổng từ search-log.md
        ↓
[Sau khi xóa duplicate (N = 90)]  ← = dòng trong 01_all_records.csv
        ↓
┌─────────────────────────────────────────┐
| Screened title + abstract (N = 90)      |
|   └─ Excluded (N = 49): EC-D=3, EC-A=7, |
|        EC-S=18, EC-O=29                 |
```

---

## Page 8

```
↓ 41 papers pass ← = INCLUDE + Unsure trong 02

┌───────────────────────────────────────┐
│ Full-text assessed (N = 41)           │
│   └── Excluded (N = 28): EC-A=6, IC-E=22 │
└───────────────────────────────────────┘

↓

[Final included (N = 13)] ← = Include trong 03_final_included.csv
```

**Kiểm tra nhất quán (tự check trước khi nộp):**

```
Rows trong 01 CSV = N sau dedup ✓
Count(v1_decision = EXCLUDE) trong 02 = Excluded vòng 1 ✓
Count(v1 = INCLUDE + Unsure) = Full-text assessed ✓
Count(v2_decision = Include) trong 03 = Final included ✓
```

---

# FILE 5: `evidence-table.md` — Trích xuất dữ liệu

Cột bắt buộc:

| Cột | Nội dung | Chú ý |
|---|---|---|
| Paper (Tên + Năm + Venue) | Trích dẫn + link DOI/URL | **Phải có link** — dùng để verify |
| Tool/LLM | Tên cụ thể (GPT-4o, LLaMA-3-70B, ...) | Không ghi "AI" hay "mô hình LLM" |
| Dataset | Tên + kích thước + domain | Phải là dataset paper dùng trong thực nghiệm |
| Metric | Tên metric cụ thể (BLEU, cosine similarity, F1, ...) | Không ghi "accuracy" chung chung |
| Kết quả | **Con số cụ thể** từ paper | Phải tìm được trong Table/Figure gốc |
| Hạn chế tự nêu | Trích từ Threats to Validity / Future Work | Nếu paper không nêu → ghi "N/A" |

> Ô trống là bình thường. SLR thực tế luôn có ô N/A. Evidence table không có ô trống nào là dấu hiệu AI bịa.

---

# FILE 6: `gap-statement.md` — Phân tích khoảng trống

---

## Page 9

Cấu trúc tối thiểu:

    # Gap Statement – [Topic]
    Evidence table: N = [số] paper

    ## Các khoảng trống phát hiện

    ### GAP-T (Technology): [mô tả]
    **Bằng chứng:** [Cột Tool/LLM – paper nào / không paper nào dùng X]

    ### GAP-M (Metric): [mô tả]
    **Bằng chứng:** [Cột Metric – paper nào / không paper nào đo Y]

    ### GAP-D (Dataset): [nếu có]
    **Bằng chứng:** [Cột Dataset – giới hạn về kích thước/domain]

    ## Phát biểu GAP tổng hợp
    [1–2 câu mô tả gap chính – sẽ dùng trong proposal]

**Chú ý:** Mỗi GAP phải trỏ về cột cụ thể trong evidence table. "Nhiều nghiên cứu chưa làm X" không đủ — phải ghi được paper nào đã làm gần nhất và vẫn còn thiếu gì.

---

# FILE 7 & 8: `experiment/01_rq.md` và `experiment/hypotheses.md`

## `01_rq.md` — RQ theo PICO

    # Research Question – [Tên topic]

    ## RQ chính thức
    "[P: dataset/population cụ thể], [I: intervention = LLM + version + strategy]
    có đạt [O: metric + ngưỡng] [C: so với threshold / expert / system] không?"

    ## PICO
    - **P (Population):** [dataset cụ thể]
    - **I (Intervention):** [LLM/tool + cấu hình]
    - **C (Comparison):** [threshold / hệ thống so sánh]
    - **O (Outcome):** [metric + ngưỡng]

## `hypotheses.md` — H0/H1

    # Hypotheses – [Tên topic]

    ## RQ1

---

## Page 10

```text
H0: [Intervention] KHONG đạt [metric] ≥ [threshold]
H1: [Intervention] ĐẠT [metric] ≥ [threshold]
Statistical test dự kiến: [Wilcoxon / Binomial / Mann-Whitney]

## RQ2 (nếu có)
H0: ...
H1: ...
Statistical test dự kiến: ...
```

**Chọn statistical test ngay bây giờ** (không đợi pilot):

- Output liên tục (cosine similarity, F1) → **Wilcoxon signed-rank**
- Output nhị phân (% executable, % pass) → **Binomial exact test**
- So sánh 2 hệ thống → **Mann-Whitney U**

---

# CHECKLIST TRƯỚC KHI NỘP (tự kiểm tra)

**ie_criteria.md:**

- ☐ Đủ 6 IC (IC-L, IC-Y, IC-T, IC-P, IC-I, IC-E) và 5 EC (EC-D, EC-A, EC-S, EC-N, EC-O)
- ☐ IC-P chứa tên task cụ thể (không ghi "AI trong SE" hay "LLM applications")
- ☐ IC-I chứa loại kỹ thuật cụ thể (không ghi "công nghệ mới")
- ☐ EC-O liệt kê ít nhất 2 task hay bị nhầm với IC-P
- ☐ IC-Y có lý do chọn năm (1 câu — kỹ thuật X xuất hiện năm Y)

**search-log.md:**

- ☐ Có query string nguyên văn (copy từ ô search)
- ☐ Có tên database (IEEE/Scopus/ACM/Semantic Scholar — ≥ 3 databases)
- ☐ Có ngày thực hiện
- ☐ Có bảng tổng hợp số lượng trước + sau dedup
- ☐ Có mục Snowballing — dù không tìm được paper mới, phải ghi "Đã scan [N] paper, không có paper mới pass IC"

**CSV consistency:**

- ☐ Rows(01) = N sau dedup trong PRISMA
- ☐ Count(v1 EXCLUDE trong 02) = excluded V1 trong PRISMA
- ☐ Count(v2 Include trong 03) = final included trong PRISMA
- ☐ **Không có** file nào "all same row count" mà không có lý do

**Evidence table:**

- ☐ Mỗi paper có URL hoặc DOI

---

## Page 11

- ☐ Cột Kết quả có giá trị số (%, điểm, v.v.)
- ☐ Có ít nhất một vài ô N/A hoặc "Không đề cập" (bình thường khi làm thật)

**PDF library (SLR/papers/):**

- ☐ Mỗi paper trong `03_final_included.csv` có file PDF tương ứng trong `papers/`
- ☐ Tên file đúng chuẩn: `Author_Year_Keyword.pdf` (không dấu, không space — ví dụ: `Chen_2024_GPT4TestGen.pdf`)
- ☐ Paper paywalled không download được: ghi URL DOI vào `search-log.md`, không để file trống

**Gap statement:**

- ☐ Mỗi GAP trỏ về cột cụ thể trong evidence table
- ☐ Không có GAP mơ hồ "nhiều nghiên cứu chưa làm"

**RQ và Hypotheses:**

- ☐ PICO có đủ P, I, C, O với giá trị cụ thể
- ☐ H0 testable (có ngưỡng cụ thể)
- ☐ Statistical test đã chọn dự kiến
- ☐ Threshold trong H0 khớp với design-rationale.md

---

# TEAM-SYNTHESIS — Tổng hợp nhóm

Sau khi mỗi thành viên nộp per-member output, **1 người** (hoặc cả nhóm) tổng hợp:

1. **evidence-table-merged.md:** Gộp tất cả paper, loại bỏ trùng (giữ 1 trong số các bản sao), ghi tổng N papers
2. **gap-statement-final.md:** Đối chiếu GAP của từng thành viên → chọn GAP có bằng chứng mạnh nhất → phát biểu GAP nhóm
3. **rq-final.md:** Tinh chỉnh RQ cá nhân thành RQ nhóm — cụ thể hóa dataset, LLM, metric
4. **hypotheses-draft.md:** H0/H1 nhóm với threshold từ evidence table nhóm

> **Lưu ý khi gộp evidence table:** Overlap 30–60% paper giữa các thành viên là bình thường (cùng topic, cùng khoảng năm). Paper trùng → kiểm tra nội dung, giữ bản điền đầy đủ nhất. Nếu hai thành viên có cùng paper nhưng thông tin khác nhau → đọc lại paper gốc.

## Quy tắc xử lý conflict khi merge

**Conflict 1: Cùng paper, khác dữ liệu trích xuất**

> Ví dụ: Member A ghi "Liu'23: BLEU=0.72", Member B ghi "Liu'23: BLEU=0.68"

---

## Page 12

→ Mở paper gốc, tìm Table/Figure nguồn — ai sai sửa lại. Nếu cả hai không tìm được số → ghi N/A + ghi chú "conflicting extraction, chưa xác nhận".  
→ **Không được:** Lấy trung bình hoặc chọn số "hợp lý hơn" mà không kiểm tra gốc.

**Conflict 2: Khác loại GAP (member A: GAP-T, member B: GAP-M)**

→ Đếm số ô trong evidence table merged ủng hộ mỗi GAP. Áp dụng priority: GAP-T > GAP-M > GAP-D > GAP-S. Nếu cả hai đều có bằng chứng đủ mạnh → giữ cả hai (primary + secondary), không ép chọn 1.  
→ **Không được:** Bỏ phiếu đa số ("3/5 thích GAP này") — GAP phải từ evidence, không phải sở thích.

**Conflict 3: Member A include paper X, member B exclude paper X**

→ Inclusive by default — giữ lại trong merged table, cột ghi chú "disputed". Cả nhóm đọc lại full-text theo tiêu chí IE. Nếu vẫn không đồng thuận → loại (conservative decision).

**Conflict 4: Khác RQ focus (member A: metric A, member B: metric B)**

→ Quay về GAP primary đã chốt. RQ nào address trực tiếp GAP primary hơn → chọn cái đó.  
Metric còn lại có thể thành RQ2 nếu feasible trong phạm vi thực nghiệm.
