# Bảng phân công công việc chi tiết — RBL-4 và RBL-5A

**Học phần:** SE1944 — Software Testing and Research-Based Learning
**Đề tài:** Sinh unit test Java bằng zero-shot GPT-4o-mini và đánh giá trên 63 hàm HumanEval-Java
**Ngày cập nhật:** 2026-07-16
**Mục đích:** Mô tả trách nhiệm, luồng bàn giao, và các artefact kiểm chứng cho quá trình xây dựng RBL-4/RBL-5A.

## 1. Luồng làm việc chung

```text
Xác định phạm vi và RQ
        ↓
Chuẩn bị 63 SUT + môi trường Maven/EvoSuite
        ↓
Viết pipeline API, sinh test, ghi request/response/log
        ↓
Compile, repair một lượt, lưu trạng thái thực thi
        ↓
Chạy/đo EvoSuite cùng 1 pipeline ở 1/3/5 phút
        ↓
Tổng hợp dữ liệu, kiểm định thống kê, validation
        ↓
Viết paper, tạo hình/slide, review và tích hợp nộp
```

Mỗi bước phải để lại file đầu ra có thể truy vết. Các kết quả chính chỉ được báo cáo khi khớp với `results/summary.csv` và qua các kiểm tra trong `results/rbl4_validation.md`.

## 2. Tổng quan vai trò

| Thành viên | Vai trò chính | Phần việc sở hữu | Đầu ra cần bàn giao |
| --- | --- | --- | --- |
| **Lê Thế Khang** | Project Lead (PL) | Điều phối, kiểm tra phạm vi nghiên cứu, review và tích hợp bản cuối. | Checklist cuối, branch/release RBL-5A, bản nộp thống nhất. |
| **Đỗ Long Vỹ** | API & Automation Engineer | Thiết kế luồng gọi API, prompt, retry, tách mã Java và log request/response. | `scripts/rbl4_openai.py`, log generation/repair, định dạng dữ liệu đầu vào. |
| **Nguyễn Như Ý** | Data & Pipeline Automation Engineer | Xây dựng script lưu dữ liệu, chạy compile/repair, tổng hợp và kiểm tra dữ liệu/metrics. | CSV trạng thái, script phân tích/validation, notebook và báo cáo số liệu. |
| **Huỳnh Cao Phước** | EvoSuite & Test Environment Owner | Thiết lập Java/Maven/EvoSuite, tạo và lưu baseline EvoSuite, chạy đo ban đầu. | Archive EvoSuite 1/3/5 phút, cấu hình Maven và bằng chứng 63 SUT. |
| **Phạm An Khang** | Research & Paper Writer | Nghiên cứu tài liệu, viết paper, diễn giải kết quả và chuẩn bị nội dung trình bày. | Nguồn `paper/`, references, hình/bảng được diễn giải đúng, nội dung slide. |

## 3. Phân công chi tiết theo từng thành viên

### 3.1 Lê Thế Khang — Project Lead, review và tích hợp

**Mục tiêu:** giữ cho toàn bộ nghiên cứu nhất quán từ câu hỏi nghiên cứu đến file nộp cuối.

1. Chốt đề tài, phạm vi 63 SUT, RQ, metric và tiêu chí chấp nhận trước khi chạy full.
2. Kiểm tra ranh giới diễn giải: EvoSuite là **đối chứng kỹ thuật có thể tái lập**, không phải dữ liệu student-written. Không được chuyển kết quả EvoSuite thành kết quả của sinh viên.
3. Theo dõi bàn giao giữa các thành viên: dữ liệu API phải dẫn tới trạng thái compile; trạng thái compile phải dẫn tới metric; metric phải dẫn tới bảng thống kê và paper.
4. Review chéo các con số quan trọng: 63 SUT, 14 suite GPT chạy được, 47 lỗi assertion, 2 lỗi compile; branch `144/762`; mutation `135/833`.
5. Đối chiếu `results/summary.csv`, `results/rbl4_final_report.md`, paper và slide để đảm bảo cùng denominator, p-value, kết luận RQ và caveat.
6. Tích hợp artefact vào branch RBL-5A, kiểm tra build PDF/slide, điều phối rehearsal và chịu trách nhiệm nộp bản cuối.

**Dấu vết cần kiểm tra:** `docs/team-synthesis/`, `results/rbl4_validation.md`, `paper/output/paper_final.pdf`, `presentation/slides_final.pptx`.

### 3.2 Đỗ Long Vỹ — API & Automation Engineer

**Mục tiêu:** biến source Java của từng SUT thành một yêu cầu API có log đầy đủ và đầu ra test có thể truy vết.

1. Chuẩn hóa nguồn đầu vào từ `data/raw/` và metadata của 63 hàm; đảm bảo class name, source code và tên test không bị lẫn giữa các SUT.
2. Xây dựng prompt zero-shot và luồng gọi OpenAI trong `scripts/rbl4_openai.py`: nạp `.env` an toàn, tạo prompt, retry khi request lỗi, tách Java code khỏi phản hồi và ghi usage/token/cost.
3. Thiết kế schema log cho mỗi lần gọi: SUT, thời gian, model, prompt/output token, chi phí, trạng thái thành công và nội dung sinh ra. Các artefact chính là `results/full_llm_output.csv` và `results/full_api_log.txt`.
4. Ghi test sinh ra vào khu vực test của `experiments/rbl-project` theo quy tắc một SUT tương ứng một test suite; bảo toàn output thô để có thể audit prompt và response về sau.
5. Phối hợp với Như Ý để chuyển các suite lỗi sang bước compile/repair, không xóa bằng chứng đầu vào hay output API trước đó.
6. Ghi rõ cách chạy lại và cảnh báo chi phí API trong README; tuyệt đối không commit `.env` hoặc API key.

**Tiêu chí bàn giao:** 63 request có record, mỗi record có định danh SUT; pipeline không lẫn test giữa hàm; người khác có thể đọc CSV/log để đối chiếu một request với source và test được sinh.

### 3.3 Nguyễn Như Ý — Data & Pipeline Automation Engineer

**Mục tiêu:** biến output API và kết quả chạy Maven/PIT thành dữ liệu có cấu trúc, có thể tái sinh báo cáo và kiểm chứng.

1. Xây dựng các script orchestration cho pilot/full run, compile status, repair và lưu dữ liệu theo từng bước; phối hợp với Đỗ Long Vỹ để giữ tên SUT và schema CSV nhất quán.
2. Duy trì luồng repair một lượt trong `scripts/repair_generated_tests.py`: đọc suite lỗi, tạo repair prompt kèm lỗi thực thi, lưu response repair riêng và không ghi đè raw output ban đầu.
3. Thu thập trạng thái cuối của từng suite trong `results/full_compile_status.csv`, phân loại rõ `PASS`, `FAIL_ASSERTION` và `FAIL_COMPILE`.
4. Tự động hóa tổng hợp metric và thống kê bằng `scripts/generate_rbl4_analysis.py`: đọc GPT metrics, EvoSuite metrics và trạng thái suite; sinh `summary.csv`, figures, provenance và final report.
5. Tạo notebook tái lập bằng `scripts/generate_full_analysis_notebook.py`; duy trì validation bằng `scripts/validate_rbl4_results.py` để kiểm tra số dòng, số SUT, numerator/denominator, bảng RQ3 và các output cần nộp.
6. Báo ngay cho PL khi một kết quả không truy được về CSV/log/metric gốc hoặc khi có thay đổi denominator giữa các bảng.

**Tiêu chí bàn giao:** `results/rbl4_validation.md` báo các kiểm tra PASS; script có thể tái sinh derived report từ CSV retained mà không cần gọi API; các số trong paper/slide truy được về `results/summary.csv`.

### 3.4 Huỳnh Cao Phước — EvoSuite & Test Environment Owner

**Mục tiêu:** tạo baseline kỹ thuật EvoSuite ổn định và đo theo cùng môi trường với test GPT.

1. Chuẩn bị `experiments/rbl-project`: source 63 SUT, Maven, JaCoCo/PIT và JDK tương thích. EvoSuite 1.0.6 yêu cầu Temurin JDK 8 do phụ thuộc `tools.jar`.
2. Thiết lập lệnh/cấu hình tạo test EvoSuite ở các budget 1, 3 và 5 phút; kiểm tra classpath, classloader và package trước khi chạy hàng loạt.
3. Chạy khởi tạo test EvoSuite cho từng SUT, lưu archive riêng theo budget tại `experiments/rbl-project/archive/evosuite_1p`, `evosuite_3p` và `evosuite_5p`; không thay thế archive cũ khi chưa lưu bản mới.
4. Chạy Maven/PIT trên các suite archive để lấy branch coverage, mutation score và pass/fail theo từng SUT; bàn giao CSV trong `results/metrics/evosuite_*p_class_metrics.csv`.
5. Kiểm tra đầy đủ 63/63 SUT ở mỗi budget trước khi chuyển dữ liệu cho Như Ý tổng hợp. Nếu môi trường hoặc tool lỗi, lưu log và thông tin phiên bản thay vì tự suy đoán số liệu.
6. Phối hợp với PL để ghi caveat: baseline này là EvoSuite technical comparator; nó không thay thế student benchmark đang thiếu đo lường cùng pipeline.

**Tiêu chí bàn giao:** mỗi budget có 63 record, có archive và metric tương ứng; bản tóm tắt aggregate khớp với `results/rbl4_final_report.md`.

### 3.5 Phạm An Khang — Research & Paper Writer

**Mục tiêu:** chuyển evidence kỹ thuật thành bài báo có lập luận khoa học, citation đúng và không vượt quá điều dữ liệu chứng minh.

1. Tổng hợp literature review, gap, RQ và threshold từ các tài liệu trong `docs/team-synthesis/`; kiểm tra mỗi claim external có citation và mỗi số liệu thực nghiệm dẫn về output RBL-4.
2. Viết và duy trì nội dung trong `paper/sections/`: Introduction, Related Work, Method, Results, Discussion, Threats to Validity và Conclusion. Nội dung phải nêu đúng zero-shot, model version, 63 SUT, one repair pass và điều kiện RQ3.
3. Đưa các bảng/hình từ `results/figures/` vào paper; kiểm tra caption, denominator, p-value và effect size trùng với `results/summary.csv`.
4. Quản lý `paper/references.bib`, kiểm tra DOI/citation và diễn giải nguồn bằng lời của nhóm, không copy nguyên văn từ paper khác.
5. Biên soạn thông điệp cho presentation: vấn đề, pipeline, execution validity, full-corpus result, paired RQ3, caveat và future work. Nội dung slide phải khớp paper, không thêm claim chưa có evidence.
6. Build paper với IEEEtran, đọc PDF sau build để phát hiện citation lỗi, bảng tràn hoặc figure khó đọc; phối hợp PL chốt bản cuối `paper/output/paper_final.pdf`.

**Tiêu chí bàn giao:** paper build không có citation/reference error; mọi kết quả RQ có nguồn số liệu; slide giải thích rõ EvoSuite không phải student proxy và có kịch bản 10–12 phút.

## 4. Luồng bàn giao giữa các vai trò

| Bước | Người bàn giao | Người nhận | Artefact bàn giao | Kiểm tra trước khi qua bước kế tiếp |
| --- | --- | --- | --- | --- |
| 1. Phạm vi/RQ | PL | Cả nhóm | RQ, scope amendment, criteria | Không nhầm student benchmark với EvoSuite. |
| 2. Môi trường/SUT | Phước | Vỹ, Như Ý | 63 SUT, Maven/PIT setup, EvoSuite config | Project build được và tên SUT thống nhất. |
| 3. Generation API | Vỹ | Như Ý | Raw output, API log, token/cost CSV | 63 SUT có record, raw output được giữ lại. |
| 4. Compile/repair/data | Như Ý | PL, Phước, Phạm An Khang | Compile status, repair log, GPT metrics | Suite status có partition rõ và không mất evidence. |
| 5. EvoSuite baseline | Phước | Như Ý | Archive + class metrics 1/3/5 phút | Mỗi budget đủ 63 SUT. |
| 6. Analysis/validation | Như Ý | PL, Phạm An Khang | `summary.csv`, report, figures, validation | RQ/table/figure khớp nhau; validation PASS. |
| 7. Paper/slide | Phạm An Khang | PL, cả nhóm | Paper source/PDF, deck, rehearsal guide | Số liệu/caveat nhất quán với summary. |
| 8. Final release | PL | Cả nhóm/Giảng viên | Branch, commit, bản nộp | PDF/slide mở được; rehearsal hoàn tất. |

## 5. Quy tắc kiểm chứng chung

1. Không tạo hoặc sửa số liệu để khớp giả thuyết. Nếu dữ liệu thiếu, phải ghi rõ limitation và hướng đo lại.
2. Không xóa raw output, API log, suite archive hoặc test lỗi; khi cần thay thế, tạo archive/quarantine có timestamp.
3. Không commit API key hay `.env`.
4. Bất kỳ số liệu nào trong paper/slide đều phải truy ngược được tới `results/summary.csv`, metric CSV, log hoặc figure được sinh từ script.
5. Nếu dùng bảng này làm minh chứng đóng góp cá nhân, từng thành viên cần tự review và xác nhận phần việc của mình trước khi nộp.
