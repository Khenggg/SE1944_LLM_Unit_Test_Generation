# Kết Quả Chạy Thử Nghiệm Pilot (Pilot Run Results)

* **Ngày thực hiện:** 2026-07-03
* **Tập mẫu:** 6 hàm pilot (BF, COUNT_NUMS, FILE_NAME_CHECK, FIND_ZERO, ORDER_BY_POINTS, SEARCH)
* **Người thực hiện:** MS & RW

---

## 1. Kết quả chi tiết theo từng Hàm/Lớp (Class-level Metrics - Lượt chạy mới)

Dưới đây là bảng số liệu chi tiết của 6 hàm trong tập Pilot sinh bởi AI (*GPTTest) sau khi đã chạy lại và áp dụng cơ chế cô lập test lỗi:

| Tên Hàm (Class SUT) | JaCoCo Branch Coverage | PITest Mutation Score | Số Đột Biến (Mutations) |
| :--- | :---: | :---: | :---: |
| **BF** | 100.00% | 92.86% | 14 |
| **COUNT_NUMS** | 100.00% | 88.24% | 34 |
| **FILE_NAME_CHECK** | 88.46% | 80.77% | 26 |
| **FIND_ZERO** | 87.50% | 78.95% | 19 |
| **ORDER_BY_POINTS** | 85.71% | 90.48% | 42 |
| **SEARCH** | 100.00% | 92.31% | 13 |
| **TRUNG BÌNH CỘNG (MEAN)** | **93.61%** | **87.27%** | **Tổng: 148** |

---

## 2. Kết quả tổng thể dự án (Project-level Metrics)

*Số liệu gộp của cả package `humaneval/correct` (bao gồm cả 57 hàm chưa chạy test được tính là 0%):*
* **JaCoCo Branch Coverage tổng thể:** **9.90%** (77/778 branches)
* **PITest Mutation Score tổng thể:** **89.49%** (817/913 mutations)

---

## 3. Nhật ký xử lý lỗi (Troubleshooting Log)
* **Lỗi gặp phải:** 
  1. PITest báo lỗi do suite không "Green" (có các test cases sinh bởi AI bị fail logic trên code gốc).
  2. Lỗi lặp vô hạn (Infinite Loop) trong class `FIND_ZERO_GPTTest` khi kiểm thử các trường hợp đa thức không có nghiệm thực (ví dụ $f(x)=x^2+1$ và hàm hằng $f(x)=5$). Lỗi này làm treo lệnh biên dịch `mvn test`.
* **Cách xử lý:** 
  1. Thêm thủ công `@org.junit.Ignore("Infinite loop")` vào 2 phương thức gây lặp vô hạn trong `FIND_ZERO_GPTTest`.
  2. Chạy script `ignore_failing_tests.py` để tự động chèn `@org.junit.Ignore` vào các test case lỗi còn lại, biến suite thành Green (được skip) và cho phép đo đạc JaCoCo & PIT thành công.
