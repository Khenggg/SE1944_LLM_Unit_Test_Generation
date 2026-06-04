# Experiment Design Rationale — LLM for Unit Test Case Generation
Ngày: 2026-06-03 | GAP source: Phuoc/SLR/gap-analysis.md

## Bảng quyết định

| Quyết định | Giá trị | Nguồn gốc |
|---|---|---|
| **LLM/Tool** | OpenAI GPT-4 / GPT-4o | GAP-T: Xuất hiện trong 5/7 papers trong evidence table. |
| **Dataset** | 20 Java/Python functions của sinh viên (CC = 5–15) | GAP-D: Trích xuất từ assignments có độ phức tạp trung bình. |
| **Metric chính** | Branch coverage (pytest-cov / JaCoCo) và Mutation score (mutmut / PIT) | GAP-M: Đo lường đồng thời cả cấu trúc và hiệu năng phát hiện lỗi. |
| **Metric phụ** | Compile rate và Test pass rate | Kế thừa từ **Chang'26 (AdverTest)** và **Tabassum'26**. |
| **Baseline type** | Comparative baseline (Student-written tests) | Thiết kế đối chứng giữa LLM và sinh viên trên cùng tập functions. |
| **Threshold RQ1** | Branch coverage >= 80% | **Case 2**: floor = 70% (Shin'23), công nghiệp coi 80% là mốc an toàn. |
| **Threshold RQ2** | Mutation score >= 60% | **Case 2**: floor = 35.3% (Tabassum'26), đích 60% là mức trung bình-cao. |
| **Pipeline base** | Prompting zero-shot kèm đặc tả interface của hàm | Thích nghi từ **Dakhel'24 (MuTAP)** và **Shin'23**. |

---

## Lý giải threshold

### 1. Rationale cho Branch Coverage Threshold (>= 80%)
- **Case phân loại:** **Case 2** (Dựa trên floor values của evidence table).
- **Lập luận nguồn:** Trong paper **Shin'23 (Domain Adaptation)**, độ bao phủ dòng/nhánh của mô hình T5 thuần đạt khoảng 70%. Trong khi đó, các baseline công cụ SBST chuyên dụng như EvoSuite thường đạt dao động từ 75% đến 84% tùy thuộc vào độ phức tạp của dự án.
- **Lý luận thiết kế:** Do nghiên cứu tập trung vào các hàm có độ phức tạp cyclomatic trung bình (CC = 5-15) được viết bởi sinh viên, các hàm này không quá phức tạp như các codebase lớn trong công nghiệp (nơi Huang'26 ghi nhận LLM chỉ đạt 30.22% branch coverage vì độ phức tạp quá cao). Mốc **80%** là đích ngắm thực tế và là tiêu chuẩn phổ biến trong ngành (industry standard) để đánh giá một test suite có bao phủ cấu trúc đầy đủ hay chưa.

### 2. Rationale cho Mutation Score Threshold (>= 60%)
- **Case phân loại:** **Case 2** (Dựa trên floor values của evidence table).
- **Lập luận nguồn:** Trong thực nghiệm của **Tabassum'26 (MuTAP vs Pynguin)**, công cụ sinh test dựa trên LLM (MuTAP) đạt điểm đột biến trung vị (median mutation score) là **35.3%** trên các dự án công nghiệp. Ngược lại, trên các unit đơn lẻ nhân tạo ít phụ thuộc phức tạp, điểm đột biến đạt đỉnh là **93.57%** (**Dakhel'24**).
- **Lý luận thiết kế:** Ở độ phức tạp trung bình (CC = 5-15) và không có nhiều dependencies bên ngoài, các test case được sinh bởi LLM có thể dễ dàng kiểm tra các nhánh rẽ. Tuy nhiên, để viết được các assertion mạnh nhằm phát hiện mutant (diệt mutant) đòi hỏi logic chặt chẽ. Ngưỡng trung vị **60%** đại diện cho khả năng bắt lỗi ở mức khá-tốt của mô hình sinh test tự động mà không đòi hỏi các vòng lặp sửa lỗi đối kháng phức tạp (như AdverTest của Chang'26 đòi hỏi tài nguyên rất lớn).
