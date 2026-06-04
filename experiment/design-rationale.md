# Experiment Design Rationale — LLM for Unit Test Case Generation
Ngày: 2026-06-03 | GAP source: SLR/gap-analysis.md

## Bảng quyết định

| Quyết định | Giá trị | Nguồn gốc |
|---|---|---|
| **LLM/Tool** | OpenAI GPT-4 / GPT-4o | GAP-T: Xuất hiện trong 5/7 papers trong evidence table. |
| **Dataset** | 20 Java/Python functions của sinh viên (CC = 5–15) | GAP-D: Trích xuất từ assignments có độ phức tạp trung bình. |
| **Metric chính** | Branch coverage (pytest-cov / JaCoCo) và Mutation score (mutmut / PIT) | GAP-M: Đo lường đồng thời cả cấu trúc và hiệu năng phát hiện lỗi. |
| **Metric phụ** | Compile rate và Test pass rate | Kế thừa từ **Chang'26 (AdverTest)** và **Tabassum'26**. |
| **Baseline type** | Comparative baseline (Student-written tests) | Thiết kế đối chứng giữa LLM và sinh viên trên cùng tập functions. |
| **Threshold RQ1** | Branch coverage >= 30.22% | **Case 2**: floor = 30.22% (Huang'26). |
| **Threshold RQ2** | Mutation score >= 35.3% | **Case 2**: floor = 35.3% (Tabassum'26). |
| **Pipeline base** | Prompting zero-shot kèm đặc tả interface của hàm | Thích nghi từ **Dakhel'24 (MuTAP)** và **Shin'23**. |

---

## Lý giải threshold

### 1. Rationale cho Branch Coverage Threshold (>= 30.22%)
- **Case phân loại:** **Case 2** (Dựa trên floor values của evidence table).
- **Lập luận nguồn:** Trong paper **Huang'26 (ULT Benchmark)**, độ bao phủ nhánh trung bình (average branch coverage) của 12 mô hình LLM lớn trên tập dữ liệu các hàm thực tế đạt **30.22%**.
- **Lý luận thiết kế:** Theo quy định RBL-2, đối với Case 2 (có kết quả số nhưng nghiên cứu trước không đề xuất một ngưỡng tối thiểu cụ thể nào), ngưỡng thiết kế phải bằng đúng giá trị floor value ghi nhận được từ tài liệu tham khảo. Do đó, thiết kế thực nghiệm lựa chọn ngưỡng tối thiểu là **30.22%** (từ Huang'26), phản ánh chính xác năng lực bao phủ nhánh trung bình của mô hình LLM trên các unit code thực tế.

### 2. Rationale cho Mutation Score Threshold (>= 35.3%)
- **Case phân loại:** **Case 2** (Dựa trên floor values của evidence table).
- **Lập luận nguồn:** Trong thực nghiệm của **Tabassum'26 (MuTAP vs Pynguin)**, công cụ sinh test dựa trên LLM (MuTAP) đạt điểm đột biến trung vị (median mutation score) là **35.3%** trên các dự án công nghiệp.
- **Lý luận thiết kế:** Theo quy định RBL-2, đối với Case 2, khi không có paper nào đề xuất một ngưỡng Mutation Score tối thiểu cụ thể, chúng ta chọn giá trị floor value ghi nhận được từ paper gần nhất làm mốc so sánh. Do đó, ngưỡng tối thiểu được thiết kế là **35.3%**, phản ánh đúng mức năng lực bắt lỗi tối thiểu của các unit test sinh bởi mô hình LLM trên các codebase thực tế.
