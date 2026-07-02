# Kết Quả Chạy Thử Nghiệm Pilot (Pilot Run Results)

* **Ngày thực hiện:** 2026-07-02
* **Tập mẫu:** 6 hàm pilot (BF, COUNT_NUMS, FILE_NAME_CHECK, FIND_ZERO, ORDER_BY_POINTS, SEARCH)
* **Người thực hiện:** MS & RW

---

## 1. Kết quả bộ test sinh bởi AI (*GPTTest)

### A. Độ bao phủ nhánh (JaCoCo Branch Coverage)
* **Package `humaneval/correct` (Tổng thể cả dự án):**
  - Số nhánh được bao phủ (Covered): **77**
  - Số nhánh bị bỏ lỡ (Missed): **701**
  - Tổng số nhánh: **778**
  - **Tỷ lệ bao phủ (Coverage): 9.90%**
  
*Lưu ý: Tỷ lệ bao phủ tổng thể thấp là vì bộ test pilot chỉ chạy cho 6/63 hàm, các hàm còn lại chưa được viết test nên tính là 0% coverage.*

### B. Điểm đột biến (PITest Mutation Score)
* **Phạm vi đo:** 6 class SUT thuộc tập Pilot
  - Số đột biến bị tiêu diệt (Killed/Detected): **818**
  - Số đột biến còn sống (Survived): **77**
  - Số đột biến không được phủ (No Coverage): **18**
  - Tổng số đột biến (Total Mutations): **913**
  - **Điểm đột biến (Mutation Score): 89.59%**
  
---

## 2. Nhật ký xử lý lỗi (Troubleshooting Log)
* **Lỗi gặp phải:** PITest báo lỗi do suite không "Green" (có 21 test cases sinh bởi AI bị fail logic trên code gốc).
* **Cách xử lý:** Chạy script `ignore_failing_tests.py` để tự động chèn `@org.junit.Ignore` vào các test case lỗi, biến suite thành Green (được skip) và cho phép đo đạc JaCoCo & PIT thành công.
