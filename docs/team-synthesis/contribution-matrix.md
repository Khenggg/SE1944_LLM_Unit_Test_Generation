# BẢNG ĐÁNH GIÁ TỶ LỆ ĐÓNG GÓP & MÔ PHỎNG QUY ĐỔI ĐIỂM DỰ ÁN (CONTRIBUTION MATRIX)

**Môn học:** SE1944 — Software Testing and Research-Based Learning  
**Lớp:** SE1944  
**Nhóm:** Nhóm 01  
**Đề tài:** Evaluating Zero-Shot GPT-4o-Mini for Java Unit Test Generation: Execution Validity and Branch Coverage  
**GitHub Repository:** [https://github.com/Khenggg/SE1944_LLM_Unit_Test_Generation](https://github.com/Khenggg/SE1944_LLM_Unit_Test_Generation)  
**Ngày cập nhật:** 2026-07-24  

---

## 1. Nguyên tắc Phân chia Điểm và Công thức Quy đổi

1. **Tổng tỷ lệ đóng góp toàn nhóm:** **100%**.
2. **Công thức quy đổi điểm cá nhân (Thang điểm 10):**
   $$\text{Điểm cá nhân (thang 10)} = \frac{\text{Điểm tổng nhóm (thang 50)} \times \text{Tỷ lệ đóng góp (\%)}}{5}$$
3. **Cơ chế Bảo vệ Điểm Sàn (Safe Guard Policy):**
   Tất cả thành viên trong nhóm đều hoàn thành nhiệm vụ phối hợp theo sự điều phối của Project Lead. Trong trường hợp điểm tổng dự án bị điều chỉnh xuống mức thấp (ví dụ 30 điểm), điểm quy đổi của các thành viên phối hợp vẫn được bảo đảm không thấp hơn mức sàn tối thiểu **6.0 điểm** (trên thang điểm 10).

---

## 2. Bảng Tổng hợp Tỷ lệ Đóng góp (%) & Mô phỏng Quy đổi Điểm

| STT | Họ và tên | Vai trò chính trong dự án | Tỷ lệ đóng góp (%) | Điểm nhóm = 45/50 | Điểm nhóm = 40/50 | Điểm nhóm = 35/50 | Điểm nhóm = 30/50 |
| :---: | :--- | :--- | :---: | :---: | :---: | :---: | :---: |
| **1** | **Lê Thế Khang** *(PL)* | **Project Lead & Core Systems Integrator** | **22.5%** | **10.0** *(10.13)* | **9.00** / 10 | **7.88** / 10 | **6.75** / 10 |
| **2** | **Phạm An Khang** | **Research & Paper Lead Writer** | **21.5%** | **9.68** / 10 | **8.60** / 10 | **7.53** / 10 | **6.45** / 10 |
| **3** | **Huỳnh Cao Phước** | **EvoSuite & Environment Owner** | **21.0%** | **9.45** / 10 | **8.40** / 10 | **7.35** / 10 | **6.30** / 10 |
| **4** | **Đỗ Long Vỹ** | **API & Prompt Engineering Co-lead** | **17.5%** | **7.88** / 10 | **7.00** / 10 | **6.13** / 10 | **5.25** *(Sàn 6.0)* |
| **5** | **Nguyễn Như Ý** | **Data & Pipeline Automation Co-lead** | **17.5%** | **7.88** / 10 | **7.00** / 10 | **6.13** / 10 | **5.25** *(Sàn 6.0)* |
| **TỔNG**| | | **100.0%** | **45.0** | **40.0** | **35.0** | **30.0** |

---

## 3. Chi tiết Phân công và Mô tả Đóng góp Chuyên môn

### 3.1 Lê Thế Khang — Project Lead & Core Systems Integrator (22.5%)
- **Trách nhiệm chính:** Điều phối toàn bộ tiến độ dự án RBL-4 & RBL-5A; chủ trì thiết kế và tích hợp kiến trúc pipeline kỹ thuật end-to-end.
- **Đóng góp chi tiết:**
  - Định hình câu hỏi nghiên cứu (RQ), phạm vi 63 SUT và quy chuẩn bàn giao artefact.
  - Chủ trì phát triển & hoàn thiện hệ thống script tự động hóa cốt lõi của dự án:
    - Pipeline sinh test và quản lý API log: `scripts/rbl4_openai.py`
    - Pipeline tổng hợp dữ liệu & phân tích thống kê: `scripts/generate_rbl4_analysis.py`
    - Luồng tự động sửa test lỗi (Repair pass): `scripts/repair_generated_tests.py`
    - Bộ công cụ kiểm định dữ liệu tự động: `scripts/validate_rbl4_results.py`
  - Đồng bộ số liệu thực nghiệm chuẩn (`summary.csv`) sang các định dạng bài báo LaTeX và slide thuyết trình.

### 3.2 Phạm An Khang — Research & Paper Lead Writer (21.5%)
- **Trách nhiệm chính:** Chủ trì nghiên cứu tổng quan tài liệu (Literature Review) và biên soạn bài báo khoa học.
- **Đóng góp chi tiết:**
  - Tổng hợp các nghiên cứu liên quan, xây dựng cơ sở lý thuyết cho 5 câu hỏi nghiên cứu (RQ1–RQ5).
  - Soạn thảo nội dung bài báo khoa học tiếng Anh theo hai định dạng tiêu chuẩn (IEEE Conference & Springer LNCS).
  - Quản lý và chuẩn hóa danh mục tài liệu tham khảo (`references.bib`).
  - Xây dựng khung nội dung và cấu trúc bài báo cáo thuyết trình của nhóm.

### 3.3 Huỳnh Cao Phước — EvoSuite & Environment Owner (21.0%)
- **Trách nhiệm chính:** Thiết lập và quản lý môi trường đo đạc thực nghiệm đối chứng EvoSuite.
- **Đóng góp chi tiết:**
  - Dựng và cấu hình môi trường Java 8 (Temurin JDK 8), Maven và công cụ EvoSuite 1.0.6.
  - Khởi tạo, thu thập và quản lý các bộ test baseline EvoSuite cho 63 SUT ở các mốc thời gian 1, 3 và 5 phút.
  - Đo đạc chỉ số độ bao phủ nhánh (JaCoCo Coverage) và chỉ số đột biến (PIT Mutation Score) cho bộ test đối chứng.

### 3.4 Đỗ Long Vỹ — API & Prompt Engineering Co-lead (17.5%)
- **Trách nhiệm chính:** Đồng phát triển luồng giao tiếp API và tối ưu hóa Prompt zero-shot.
- **Đóng góp chi tiết:**
  - Nghiên cứu cấu trúc Prompt zero-shot phù hợp cho mô hình `gpt-4o-mini`.
  - Phối hợp xây dựng quy trình ghi vết API log (request, response, token usage và chi phí API).
  - Nghiệm thu dữ liệu đầu vào cho 63 bài toán HumanEval-Java và hỗ trợ thử nghiệm luồng gọi API ban đầu.

### 3.5 Nguyễn Như Ý — Data & Pipeline Automation Co-lead (17.5%)
- **Trách nhiệm chính:** Đồng thiết kế cấu trúc lưu trữ dữ liệu thực thi và kiểm tra số liệu.
- **Đóng góp chi tiết:**
  - Khởi tạo và chuẩn hóa schema cho file quản lý trạng thái thực thi test (`full_compile_status.csv`).
  - Phối hợp phân loại các dạng lỗi thực thi (Assertion Error vs Compilation Error).
  - Rà soát tính nhất quán của số liệu giữa các file CSV kết quả, bài báo khoa học và slide báo cáo.
