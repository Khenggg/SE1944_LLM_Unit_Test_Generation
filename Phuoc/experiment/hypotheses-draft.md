# Phác thảo các Giả thuyết Thống kê (Hypotheses Draft) — Huỳnh Cao Phước

Tài liệu phác thảo này cung cấp các mô tả chi tiết và giải thích kỹ thuật cho việc lập giả thuyết thống kê phục vụ kiểm chứng thực nghiệm của đề tài SE1944.

---

## 1. Biện giải về Lựa chọn Phép Kiểm định Thống kê (Statistical Test Selection)

Trong thực nghiệm đánh giá chất lượng unit test phần mềm, các chỉ số như độ bao phủ (Branch Coverage) hay điểm đột biến (Mutation Score) có các đặc tính thống kê đặc thù:
1. **Phân phối không chuẩn (Non-normal distribution):** Các chỉ số này thường bị giới hạn trong khoảng $[0\%, 100\%]$ và có xu hướng lệch trái mạnh (nhiều hàm đạt 100% hoặc 0% coverage), không tuân theo phân phối chuẩn Gauss. Do đó, các phép kiểm định tham số (parametric tests) như t-test **không áp dụng được** vì vi phạm nghiêm trọng giả định về phân phối chuẩn.
2. **Lựa chọn Kiểm định phi tham số (Non-parametric tests):** 
   * **One-sample Wilcoxon signed-rank test** được lựa chọn để đối sánh trung vị thực tế của bộ test sinh bởi AI với các giá trị mốc cố định ($30.22\%$) và ($35.3\%$) thay vì dùng One-sample t-test.
   * **Paired Wilcoxon signed-rank test** được lựa chọn để so sánh hiệu năng trực tiếp giữa hai bộ test (AI và sinh viên) chạy trên cùng một tập hàm đối chứng (paired design), thay vì dùng Paired t-test.
   * **Exact Binomial Test** được lựa chọn để kiểm định tỷ lệ thành công kép (đạt đồng thời cả hai chỉ số) vì dữ liệu đầu ra là nhị phân (Đạt / Không đạt).

---

## 2. Đặc tả Chi tiết các Giả thuyết và Phép Kiểm định

### 📊 RQ1 — Ngưỡng Độ bao phủ nhánh (Branch Coverage $\ge$ 30.22%)
*   **Mục tiêu:** Xác minh xem GPT-4/GPT-4o có đạt được độ bao phủ nhánh tối thiểu bằng mức sàn trung bình của văn liệu hay không.
*   **Ký hiệu toán học:**
    *   $H_0: \tilde{\mu}_{\text{BC-AI}} < 30.22\%$
    *   $H_1: \tilde{\mu}_{\text{BC-AI}} \ge 30.22\%$
*   **Thông số kiểm định:**
    *   Mẫu thực nghiệm: $N = 20$ kết quả branch coverage của GPT-4/GPT-4o.
    *   Giá trị kiểm chứng (Hypothesized median): $\theta_0 = 30.22$.
    *   Mức ý nghĩa: $\alpha = 0.05$.
    *   Kiểm định: Một đuôi (để chứng minh hiệu năng lớn hơn hoặc bằng ngưỡng sàn).

### 📊 RQ2 — Ngưỡng Điểm đột biến (Mutation Score $\ge$ 35.3%)
*   **Mục tiêu:** Xác minh xem các testcase sinh bởi GPT-4/GPT-4o có đạt năng lực phát hiện lỗi logic tối thiểu bằng mức sàn công nghiệp hay không.
*   **Ký hiệu toán học:**
    *   $H_0: \tilde{\mu}_{\text{MS-AI}} < 35.3\%$
    *   $H_1: \tilde{\mu}_{\text{MS-AI}} \ge 35.3\%$
*   **Thông số kiểm định:**
    *   Mẫu thực nghiệm: $N = 20$ kết quả mutation score của GPT-4/GPT-4o.
    *   Giá trị kiểm chứng (Hypothesized median): $\theta_0 = 35.3$.
    *   Mức ý nghĩa: $\alpha = 0.05$.
    *   Kiểm định: Một đuôi.

### 📊 RQ3 — So sánh trực tiếp chất lượng AI vs. Sinh viên
*   **Mục tiêu:** So sánh cặp trực tiếp để tìm ra sự khác biệt về hiệu năng.
*   **Phép kiểm định:** Paired Wilcoxon signed-rank test (hai đuôi, $\alpha = 0.05$).
*   **Các giả thuyết kiểm định:**
    *   **Độ bao phủ nhánh (Branch Coverage):**
        *   $H_0: \tilde{\mu}_{\text{BC-AI}} = \tilde{\mu}_{\text{BC-Student}}$
        *   $H_1: \tilde{\mu}_{\text{BC-AI}} \neq \tilde{\mu}_{\text{BC-Student}}$
    *   **Điểm đột biến (Mutation Score):**
        *   $H_0: \tilde{\mu}_{\text{MS-AI}} = \tilde{\mu}_{\text{MS-Student}}$
        *   $H_1: \tilde{\mu}_{\text{MS-AI}} \neq \tilde{\mu}_{\text{MS-Student}}$

### 📊 RQ4 — Tỷ lệ thành công đồng thời (Dual Success Rate)
*   **Mục tiêu:** Xác minh tỷ lệ số hàm đạt đồng thời cả hai ngưỡng chất lượng có vượt quá mức đa số ngẫu nhiên 50% hay không.
*   **Ký hiệu toán học:**
    *   $H_0: p_{\text{success}} \le 0.50$
    *   $H_1: p_{\text{success}} > 0.50$
*   **Thông số kiểm định:**
    *   Biến quan sát: Số hàm $k$ đạt đồng thời cả hai ngưỡng trong tổng số $N=20$ hàm ($k \sim \text{Binomial}(N, p)$).
    *   Tỷ lệ giả thuyết: $p_0 = 0.50$.
    *   Mức ý nghĩa: $\alpha = 0.05$.
    *   Kiểm định: Nhị thức chính xác (Exact Binomial Test), một đuôi.
