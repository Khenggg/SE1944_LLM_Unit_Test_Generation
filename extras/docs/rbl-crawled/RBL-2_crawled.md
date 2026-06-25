# Crawled Document Content

## Page 1

# RBL-2: Evidence Table → Thiết Kế Thực Nghiệm

**Đầu vào:** `SLR/evidence-table.md` đã hoàn chỉnh từ RBL-1  
**Đầu ra:** `SLR/gap-analysis.md` + `experiment/design-rationale.md` + `experiment/hypotheses-draft.md`  
**Thời gian:** ~5–6 giờ

> **Quy tắc xuyên suốt:** Mỗi quyết định thiết kế phải trỏ về một ô cụ thể trong evidence table. Không có nguồn → không hợp lệ.

| File RBL-1 | File RBL-2 | Điểm khác biệt |
|---|---|---|
| `gap-statement.md` — assertion chưa verify | `gap-analysis.md` — verified với bảng kiểm tra phản chứng | RBL-2 bắt buộc kiểm tra từng paper |
| `hypotheses.md` — H0/H1 không có threshold source | `hypotheses-draft.md` — H0/H1 với threshold theo Case 1/2/3 | Ngưỡng phải trỏ về paper cụ thể |

---

# CẤU TRÚC FILE NỘP (sau khi hoàn thành RBL-2)

> Các file đánh dấu ★ là **file mới** cần tạo trong RBL-2. Các file còn lại kế thừa từ RBL-1.

```text
[tên-thành-viên]/
├── SLR/
│   ├── papers/                              ← từ RBL-1 (PDF các paper đã included)
│   ├── search-log.md                        ← từ RBL-1
│   ├── 01_all_records.csv                   ← từ RBL-1
│   ├── 02_after_screening_v1.csv            ← từ RBL-1
│   ├── 03_final_included.csv                ← từ RBL-1
│   ├── ie_criteria.md                       ← từ RBL-1
│   ├── prisma-flow.md                       ← từ RBL-1
│   ├── evidence-table.md                    ← từ RBL-1
│   ├── gap-statement.md                     ← từ RBL-1
│   └── gap-analysis.md                      ← ★ MỚI – phân tích GAP + kiểm tra phản chứng
└── experiment/
    ├── 01_rq.md                             ← từ RBL-1 (cập nhật nếu RQ thay đổi)
    ├── hypotheses.md                        ← từ RBL-1 (giữ nguyên, thay bằng file dưới)
    ├── design-rationale.md                  ← ★ MỚI – bảng quyết định thiết kế (LLM, dataset...)
    └── hypotheses-draft.md                  ← ★ MỚI – H0/H1 có ngưỡng từ evidence table + source
```

> **Lưu ý:** `hypotheses-draft.md` từ RBL-2 thay thế `hypotheses.md` từ RBL-1 — nó cụ thể hơn vì threshold lúc này đã có nguồn (Case 1/2/3) thay vì là draft sơ bộ.

---

## Page 2

- Mỗi evidence lúc này đã có nguồn (Case 1/2/3) thay vì tràn sơ bộ.

---

# BƯỚC 1 — Kiểm tra evidence table (30 phút)

Mở `evidence-table.md`. Pass tất cả 5 gate mới tiếp tục:

| Gate | Pass nếu... | Fail → làm gì |
|---|---|---|
| P1: Số paper | ≥ 5 paper | Quay lại tìm thêm |
| P2: Cột Tool/LLM | ≥ 90% hàng điền | Đọc lại section 3 của paper |
| P3: Cột Kết quả | ≥ 50% hàng có số | Đọc lại Table of Results |
| P4: Cột Hạn chế | ≥ 50% hàng điền | Đọc Threats to Validity / Future Work |
| P5: Cột Metric | Tên metric cụ thể | Đọc lại Evaluation Metrics |

---

# BƯỚC 2 — Phân tích GAP (2–3 giờ)

## 2A. Bốn loại GAP

| Loại | Cột nguồn | Câu hỏi | Ví dụ |
|---|---|---|---|
| GAP-T | Tool/LLM | Công nghệ nào chưa thử? | "Chưa ai dùng GPT-4o" |
| GAP-D | Dataset | Domain/quy mô nào thiếu? | "Chỉ dataset < 50 samples" |
| GAP-M | Metric | Khía cạnh nào chưa đo? | "Không ai đo semantic similarity" |
| GAP-S | Hạn chế | Hạn chế nào ≥ ceil(0.4×N) paper cùng thừa nhận? | "Dataset nhỏ — 6/7 paper" |

**Ưu tiên khi nhiều GAP xung đột:** GAP-T > GAP-M > GAP-D > GAP-S

## 2B. Kiểm tra phản chứng (BẮT BUỘC)

Với mỗi GAP bạn tuyên bố, quét lại **từng paper** trong evidence table:

    GAP tuyên bố: [mô tả]
    | Paper | Đã làm không? | Ghi chú |
    |-------|---------------|---------|
    | Tên'năm | Không / Có | [chi tiết] |

---

## Page 3

→ Kết luận: Xác nhận / BÁC BỎ (vì paper X đã làm rồi)

Nếu tìm thấy phản chứng → xóa hoặc điều chỉnh GAP trước khi tiếp tục.

## 2C. Đánh giá khả thi (Feasibility) trước khi chốt GAP

Trước khi commit vào GAP primary, chạy qua bảng dưới cho **từng GAP candidate**. Một GAP hay nhưng không làm được đúng hạn = không phải GAP tốt.

**Bảng đánh giá khả thi:**

| Tiêu chí | Câu hỏi tự hỏi | ✅ An toàn | ⚠️ Cần xử lý | ❌ Blocker |
|---|---|---|---|---|
| **Dataset** | Dataset có public, tải được ngay không? | Benchmark/GitHub có sẵn, đã thử tải | Cần crawl/build < 1 tuần | Phải thu thập > 1 tháng hoặc không tìm được |
| **Tool/API** | LLM/tool có free tier cho sinh viên không? | Free tier đủ cho N sample, đã test API | Cần trả tiền nhưng < $5 tổng | Không có API public, cần license đặc biệt |
| **Compute** | Cần loại phần cứng gì để chạy? | CPU đủ hoặc Colab T4 free | Cần GPU — dùng Colab/Kaggle free tier | Cần cluster riêng hoặc thời gian chạy > 24h |
| **Ground truth** | Cần tạo dữ liệu nhãn thủ công không? | Không cần, hoặc đã có sẵn | Cần, ước tính ≤ 5 giờ tổng cả nhóm | Cần domain expert hoặc > 20 giờ annotation |
| **Skills** | Nhóm có thể implement pipeline này không? | Có thư viện sẵn, đã có tutorial | Cần học thêm < 1 tuần | Cần kiến thức research-level (chưa có trong nhóm) |
| **Thời gian** | Experiment hoàn thành trong số tuần còn lại? | Xong với buffer ≥ 1 tuần dự phòng | Xong nhưng tight, không có buffer | Không đủ thời gian dù làm full-time |
| **Contribution** | Kết quả âm tính có giá trị báo cáo | Có — là baseline đầu tiên cho công | Có thể — nếu đặt đúng frame | Không — "không làm được" không |

---

## Page 4

**Quy tắc quyết định:**

| Kết quả đánh giá | Quyết định |
|---|---|
| Có bất kỳ ❌ | Không chọn GAP này — hoặc downscope trước khi tiếp tục |
| Có ≥ 3 ⚠️ | Rủi ro cao — viết mitigation cụ thể cho từng ⚠️ trước khi commit |
| ≤ 2 ⚠️, không có ❌ | An toàn — tiếp tục với GAP này |

**GAP type và độ khó điển hình (để tham khảo nhanh):**

| Loại GAP | Độ khó điển hình | Bottleneck thường gặp |
|---|---|---|
| GAP-T (Technology) | Trung bình | API access + cost |
| GAP-M (Metric) | Thấp–Trung bình | Implement metric mới, thường có thư viện |
| GAP-D (Dataset) | Cao | Thu thập + annotate dataset |
| GAP-S (Shared limitation) | Thấp | Chủ yếu là tăng N — dataset vẫn phải tìm |

**Khi GAP primary có ❌ hoặc quá nhiều ⚠️ — các cách downscope:**

| GAP quá khó vì... | Downscope bằng cách... |
|---|---|
| Dataset không tìm được | Giảm N hoặc dùng dataset đã có + ghi là GAP-D còn lại |
| API quá đắt | Dùng model nhỏ hơn (GPT-4o mini thay GPT-4o) hoặc open-source |
| Cần annotation nhiều | Giảm N sample hoặc dùng automated proxy (executable rate) thay human eval |
| Pipeline quá phức tạp | Bỏ secondary RQ, chỉ làm RQ1 |
| Kỹ năng không đủ | Chọn GAP-M (implement metric) thay GAP-T (fine-tune model) |

## 2D. Ghi nhận GAP cuối cùng

Sau khi qua feasibility check: chọn GAP primary (ưu tiên cao nhất, pass feasibility) + tối đa 1 secondary.  
Viết phát biểu GAP 1–2 câu có thể dùng thẳng trong proposal.

---

## Page 5

# Bước 3 — Các quyết định thiết kế (2 giờ)

## 3A. Loại claim → Baseline

| Claim của RQ | Baseline cần | Ví dụ |
|---|---|---|
| Absolute threshold | Giá trị ngưỡng (số) | "≥ 0.85" — không compare với tool |
| Comparative | System cụ thể | GPT-3.5, EvoSuite, rule-based |
| Human-level | Output của expert | Expert-written Gherkin |

## 3B. Xác định threshold (từ cột Kết quả)

| Case | Khi nào | Cách làm |
|---|---|---|
| **Case 1** | Paper đã đề xuất ngưỡng cụ thể | Trích dẫn paper đó, dùng ngưỡng đó |
| **Case 2** | Có kết quả số nhưng không có ngưỡng | Threshold = floor value (kết quả thấp nhất trong bảng) |
| **Case 3** | Không có kết quả số | Ghi lý do cụ thể + chạy mini-pilot PRE-PROPOSAL (5–10 sample thủ công) |

> ❌ **Không được:** Tự đặt "0.85 vì hợp lý" không có nguồn. Không dùng công thức `floor + range×0.3`.
>
> ✅ **Case 2 ví dụ:** Kolb'21 đạt 79% → floor=79% → threshold=80% (làm tròn). Ghi rõ: "*floor=79% từ Kolb'21, threshold=80%*".

## 3C. Chọn pipeline (từ cột Tool/LLM + Metric)

1. Tìm paper trong bảng có **evaluation paradigm gần nhất** với cách bạn sẽ đo
2. Dùng pipeline của paper đó làm **base paper**, thích nghi cho setting của mình
3. Mỗi thành phần pipeline phải có lý do từ evidence table:

| Thành phần | Ghi rõ | Nguồn |
|---|---|---|
| LLM/Tool | Tên + version | GAP-T — cột Tool/LLM |
| Prompt strategy | zero-shot / few-shot / chain-of-thought | Paper nào dùng, tại sao chọn |
| Temperature | Giá trị (thường 0) | Reproducibility |
| Metric tool | Tên thư viện + version | GAP-M — cột Metric |
| Baseline type | threshold / system / human | Claim type của RQ (3A) |

---

## Page 6

### 3D. Chọn dataset

Ưu tiên: Benchmark có sẵn → GitHub/public repo → Tự tạo.  
Giải thích tại sao dataset cũ không đủ (GAP-D), nếu phải dùng dataset mới.

---

## BƯỚC 4 — Viết file nộp (1–2 giờ)

### 4A. `SLR/gap-analysis.md`

```text
# GAP Analysis – [Topic]
Evidence table: N = [số] paper | Ngày: YYYY-MM-DD

## Bảng GAP

| Cột | Phát hiện | Loại GAP | Phản chứng |
|-----|----------|----------|------------|
| Tool/LLM | [mô tả] | GAP-T | ✅ Kiểm tra [N] paper |
| Dataset | [mô tả] | GAP-D | ✅ |
| Metric | [mô tả] | GAP-M | ✅ |
| Hạn chế | [mô tả, N/M paper] | GAP-S | ✅ |

## GAP Chính: [GAP-T/M/D/S]
[Phát biểu 1–2 câu]

## GAP Secondary (nếu có): [Loại]
[Phát biểu 1–2 câu]

## Chi tiết kiểm tra phản chứng
[Bảng kiểm tra từng paper cho GAP primary]

## Feasibility Check – GAP Chính
| Tiêu chí | Mức | Ghi chú |
|----------|-----|---------|
| Dataset | ✅/⚠️/❌ | |
| Tool/API | ✅/⚠️/❌ | |
| Compute | ✅/⚠️/❌ | |
| Ground truth | ✅/⚠️/❌ | |
| Skills | ✅/⚠️/❌ | |
| Thời gian | ✅/⚠️/❌ | |
| Contribution | ✅/⚠️/❌ | |
**Kết quả:** [X] ❌ / [Y] ⚠️ → [An toàn / Rủi ro cao / Không chọn]
```

### 4B. `experiment/design-rationale.md`

```text
# Experiment Design Rationale – [Topic]
Ngày: YYYY-MM-DD | GAP source: SLR/gap-analysis.md
```

---

## Page 7

## Bảng Quyết Định

| Quyết định | Giá trị | Nguồn gốc |
|------------|---------|-----------|
| LLM/Tool | [tên + version] | GAP-T: cột Tool/LLM |
| Dataset | [mô tả] | GAP-D / benchmark |
| Metric chính | [tên + tool] | GAP-M: cột Metric |
| Metric phụ | [tên] | Kế thừa từ [paper] |
| Baseline type | [threshold/system/human] | Claim type RQ |
| Threshold RQ1 | [giá trị] | Case [1/2/3]: [lý do] |
| Threshold RQ2 | [giá trị] | Case [1/2/3]: [lý do] |
| Pipeline base | [tên paper`năm] | [lý do chọn] |

## Lý giải threshold (ghi 1 đoạn cho mỗi threshold)

[Threshold X% – Case 2 – floor = Y% từ paper A'năm. Lý luận: ...]

---

# BƯỚC 5 — Tinh chỉnh RQ và viết H0/H1 (45 phút)

## 5A. RQ cuối cùng — công thức

RQ = "[P: dataset cụ thể]  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[I: LLM + version + strategy]  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;đạt [O: metric + ngưỡng]  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[so với C: threshold value / system / expert] không?"

Ví dụ: "*GPT-4o mini zero-shot (I, temperature=0) có tạo Gherkin từ 55 Connextra user story (P) đạt cosine similarity ≥ 0.85 so với expert-written (O) không?*"

## 5B. H0/H1 — bảng công thức

| Loại claim | H0 | H1 |
|---|---|---|
| Absolute threshold | [I] KHÔNG đạt [metric] ≥ [threshold] | [I] ĐẠT [metric] ≥ [threshold] |
| Comparative | [I] KHÔNG tốt hơn [C] về [metric] | [I] tốt hơn [C] về [metric] |
| Human-level | [I] KHÔNG đạt mức [human baseline] | [I] đạt mức [human baseline] |

**Chọn statistical test dự kiến ngay bây giờ** (không đợi pilot):

| Loại output | Test | Khi nào dùng |
|---|---|---|
| Liên tục (cosine sim, F1, BLEU) | Wilcoxon signed-rank | Output là điểm số thập phân, test xem median có ≥ ngưỡng không |
| Nhị phân (executable%, pass rate%) | Binomial exact test | Output là đếm pass/fail, test xem tỉ lệ có ≥ ngưỡng không |

---

## Page 8

| So sánh 2 hệ thống | Mann-Whitney U | So sánh 2 nhóm điểm số độc lập với nhau |
|---|---|---|

> **Cách chọn nhanh:** Nhìn vào **PICO.O** của bạn.
>
> - Có con số thập phân (BLEU 0.72, F1 0.85, cosine 0.68) → **Wilcoxon**
> - Có "%" là tỉ lệ đếm (45/60 test compile được = 75%) → **Binomial**
> - Có "so với hệ thống khác" → **Mann-Whitney U**
>
> **Ví dụ:**
>
> - "GPT-4o đạt BLEU ≥ 0.70" → Wilcoxon (BLEU là điểm số liên tục)
> - "GPT-4o sinh được ≥ 60% test executable" → Binomial (đếm pass/fail)
> - "GPT-4o tốt hơn LLaMA-3 về F1" → Mann-Whitney U (so sánh 2 hệ thống)

Pilot Tuần 7 chỉ **confirm** — nếu phân phối khác dự kiến → ghi amendment theo proposal §8.6, không phải lần đầu chọn test.

## 5C. Lưu vào `experiment/hypotheses-draft.md`

```text
# Hypotheses Draft – [Topic]
Ngày: YYYY-MM-DD

## RQ1 – [Tên ngắn]
H0: [phát biểu]
H1: [phát biểu]
Statistical test dự kiến: [tên test] (α = 0.05)

## RQ2 – [Tên ngắn]
H0: [phát biểu]
H1: [phát biểu]
Statistical test dự kiến: [tên test] (α = 0.05)
```

---

# CHECKLIST TRƯỚC KHI NỘP

**gap-analysis.md:**

- ☐ Mỗi GAP có bằng kiểm tra phản chứng (tên paper cụ thể)
- ☐ GAP primary đã qua feasibility check — không có ❌, ≤ 2 ⚠️ (Bước 2C)
- ☐ Đã chọn GAP primary + ghi lý do nếu nhiều GAP
- ☐ Phát biểu GAP 1–2 câu rõ ràng

**design-rationale.md:**

---

## Page 9

- ☐ Mỗi dòng trong bảng quyết định có nguồn từ evidence table
- ☐ Threshold ghi Case (1/2/3) + lý luận văn xuôi
- ☐ Pipeline ghi base paper + liệt kê thay đổi

**hypotheses-draft.md:**

- ☐ H0 testable, có giá trị ngưỡng cụ thể
- ☐ H1 là đối lập logic của H0
- ☐ Statistical test dự kiến phù hợp loại dữ liệu
- ☐ Threshold trong H0 khớp với design-rationale.md

---

# LỖI PHỔ BIẾN

| Lỗi | Nhận biết | Sửa |
|---|---|---|
| GAP không qua phản chứng | "Chưa ai làm X" không có bằng kiểm tra | Thêm bảng trước khi tuyên bố |
| Threshold tự đặt | "Chọn 0.85 vì phổ biến" không trích dẫn | Áp dụng Case 1/2/3 |
| Pipeline không có base paper | "Tự thiết kế" | Chọn paper gần nhất từ bảng |
| Statistical test để TBD | Không biết chọn test gì | Xem bảng loại output ở Bước 5B |
| Baseline không match claim | Claim threshold nhưng compare với GPT-3.5 | Phân biệt primary claim và secondary comparison |

---

# TEAM-SYNTHESIS — Chốt design sau khi các member nộp

Sau khi tất cả member hoàn thành RBL-2, nhóm họp để cập nhật `team-synthesis/hypotheses-draft.md`.

**Nguyên tắc:** Mỗi quyết định cuối cùng phải trở về evidence table nhóm — không phải "đa số đồng ý".

> `rq-final.md` **không cập nhật ở bước này** — RQ chỉ thực sự final khi viết vào `proposal.md` Section 4 (RBL-3). Nếu threshold mới từ RBL-2.1 buộc phải thu hẹp scope RQ, ghi chú vào `01_rq.md` cá nhân để nhớ, nhưng chưa sửa file team.

## Quy tắc xử lý conflict

---

## Page 10

### Conflict 1: Khác threshold — member A: 0.80, member B: 0.85

→ Case mạnh hơn thắng (Case 1 > Case 2 > Case 3). Cùng Case → chọn threshold **bảo thủ hơn** (thấp hơn) vì dễ đạt hơn và ít rủi ro claim sai. Ghi lý do trong hypotheses-draft.md.  
→ **Không được:** Lấy trung bình (0.825) — threshold phải có nguồn từ paper cụ thể.

### Conflict 2: Khác statistical test — member A: Wilcoxon, member B: t-test

→ Theo bảng loại output (Bước 5B). Output liên tục không rõ distribution → Wilcoxon (non-parametric, an toàn hơn). Không dùng t-test trừ khi có lý do rõ ràng tin distribution normal.

### Conflict 3: Khác LLM/tool — member A: GPT-4o, member B: Claude 3.5

→ GAP-T drives this: LLM nào chưa xuất hiện trong cột Tool/LLM của evidence table merged → đó là lựa chọn. Nếu cả hai đều là GAP → chọn cái accessible hơn (có API key, trong budget). Ghi rõ lý do trong design-rationale.md nhóm.

### Conflict 4: Khác pipeline base paper

→ Chọn paper có **evaluation paradigm gần nhất với RQ đã chốt** của nhóm — không phải paper nổi tiếng nhất hay mới nhất.

---

