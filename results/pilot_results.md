# Kết Quả Chạy Thử Nghiệm Pilot (Pilot Run Results)

* **Ngày thực hiện:** 2026-07-02
* **Tập mẫu:** 6 hàm pilot (BF, COUNT_NUMS, FILE_NAME_CHECK, FIND_ZERO, ORDER_BY_POINTS, SEARCH)
* **Người thực hiện:** MS & RW

---

## 1. Kết quả chi tiết theo từng Hàm/Lớp (Class-level Metrics)

Trong thực nghiệm **RBL-4**, để đánh giá chính xác và không bị loãng số liệu bởi các hàm chưa chạy test, nhóm cần ghi nhận kết quả độ bao phủ và điểm đột biến của **từng hàm riêng lẻ**, sau đó tính trung bình cộng (Mean) hoặc trung vị (Median) trên tập mẫu này.

Dưới đây là bảng số liệu chi tiết của 6 hàm trong tập Pilot sinh bởi AI (*GPTTest):

| Tên Hàm (Class SUT) | JaCoCo Branch Coverage | PITest Mutation Score | Số Đột Biến (Mutations) |
| :--- | :---: | :---: | :---: |
| **BF** | 100.00% | 92.86% | 14 |
| **COUNT_NUMS** | 100.00% | 88.24% | 34 |
| **FILE_NAME_CHECK** | 84.62% | 88.46% | 26 |
| **FIND_ZERO** | 87.50% | 78.95% | 19 |
| **ORDER_BY_POINTS** | 85.71% | 90.48% | 42 |
| **SEARCH** | 100.00% | 92.31% | 13 |
| **TRUNG BÌNH CỘNG (MEAN)** | **92.97%** | **88.55%** | **Tổng: 148** |

---

## 2. Kết quả tổng thể dự án (Project-level Metrics)

*Số liệu gộp của cả package `humaneval/correct` (bao gồm cả 57 hàm chưa chạy test được tính là 0%):*
* **JaCoCo Branch Coverage tổng thể:** **9.90%** (77/778 branches)
* **PITest Mutation Score tổng thể:** **89.59%** (818/913 mutations)

---

## 3. Nhật ký xử lý lỗi (Troubleshooting Log)
* **Lỗi gặp phải:** PITest báo lỗi do suite không "Green" (có 21 test cases sinh bởi AI bị fail logic trên code gốc).
* **Cách xử lý:** Chạy script `ignore_failing_tests.py` để tự động chèn `@org.junit.Ignore` vào các test case lỗi, biến suite thành Green (được skip) và cho phép đo đạc JaCoCo & PIT thành công.
