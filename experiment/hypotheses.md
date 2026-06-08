# Giả thuyết Thống kê (Statistical Hypotheses) — Huỳnh Cao Phước

Tài liệu này trình bày các giả thuyết thống kê chính thức phục vụ cho việc kiểm định các câu hỏi nghiên cứu của đề tài. Các kiểm định đều thiết lập mức ý nghĩa $\alpha = 0.05$. Ký hiệu $\tilde{\mu}$ đại diện cho trung vị (median) của tổng thể.

---

## 1. Giả thuyết cho RQ1 — Ngưỡng Độ bao phủ nhánh (Branch Coverage Threshold)
Kiểm định xem bộ unit test do mô hình GPT-4/GPT-4o sinh ra có đạt độ bao phủ nhánh tối thiểu ở mức sàn thực nghiệm $\ge$ 30.22% trên các hàm có độ phức tạp trung bình hay không.

*   **Giả thuyết Không (Null Hypothesis - $H_0$):** Trung vị độ bao phủ nhánh của bộ test do GPT-4/GPT-4o sinh ra nhỏ hơn 30.22%.
    $$H_0: \tilde{\mu}_{\text{BC\_AI}} < 30.22\%$$
*   **Giả thuyết Đối (Alternative Hypothesis - $H_1$):** Trung vị độ bao phủ nhánh của bộ test do GPT-4/GPT-4o sinh ra lớn hơn hoặc bằng 30.22%.
    $$H_1: \tilde{\mu}_{\text{BC\_AI}} \ge 30.22\%$$
*   **Phép kiểm định thống kê:** Kiểm định Wilcoxon một mẫu (One-sample Wilcoxon signed-rank test) đối sánh trung vị thực nghiệm của 20 hàm với giá trị kiểm chứng 30.22% ($\alpha = 0.05$).

---

## 2. Giả thuyết cho RQ2 — Ngưỡng Điểm đột biến (Mutation Score Threshold)
Kiểm định xem bộ unit test do mô hình GPT-4/GPT-4o sinh ra có đạt điểm kiểm thử đột biến tối thiểu ở mức sàn thực nghiệm $\ge$ 35.3% trên các hàm hay không.

*   **Giả thuyết Không (Null Hypothesis - $H_0$):** Trung vị điểm đột biến của bộ test do GPT-4/GPT-4o sinh ra nhỏ hơn 35.3%.
    $$H_0: \tilde{\mu}_{\text{MS\_AI}} < 35.3\%$$
*   **Giả thuyết Đối (Alternative Hypothesis - $H_1$):** Trung vị điểm đột biến của bộ test do GPT-4/GPT-4o sinh ra lớn hơn hoặc bằng 35.3%.
    $$H_1: \tilde{\mu}_{\text{MS\_AI}} \ge 35.3\%$$
*   **Phép kiểm định thống kê:** Kiểm định Wilcoxon một mẫu (One-sample Wilcoxon signed-rank test) đối sánh trung vị thực nghiệm của 20 hàm với giá trị kiểm chứng 35.3% ($\alpha = 0.05$).

---

## 3. Giả thuyết cho RQ3 — So sánh đối chứng trực tiếp với Sinh viên (Comparative Hypothesis)
Kiểm định đối chứng chất lượng trực tiếp giữa hai bộ test (GPT-4/GPT-4o và sinh viên viết thủ công) trên cùng một tập 20 hàm đối tượng. Do phân phối của các chỉ số kiểm thử phần mềm thường không tuân theo phân phối chuẩn, các phép kiểm định phi tham số dạng so sánh cặp được lựa chọn.

### 📊 RQ3a: Kiểm định so sánh về Độ bao phủ nhánh (Branch Coverage)
*   **Giả thuyết Không (Null Hypothesis - $H_0$):** Không có sự khác biệt có ý nghĩa thống kê về độ bao phủ nhánh giữa bộ test do GPT-4/GPT-4o sinh ra và bộ test do sinh viên viết thủ công.
    $$H_0: \tilde{\mu}_{\text{BC\_AI}} = \tilde{\mu}_{\text{BC\_Student}}$$
*   **Giả thuyết Đối (Alternative Hypothesis - $H_1$):** Có sự khác biệt có ý nghĩa thống kê về độ bao phủ nhánh giữa bộ test do GPT-4/GPT-4o sinh ra và bộ test do sinh viên viết thủ công.
    $$H_1: \tilde{\mu}_{\text{BC\_AI}} \neq \tilde{\mu}_{\text{BC\_Student}}$$

### 📊 RQ3b: Kiểm định so sánh về Điểm đột biến (Mutation Score)
*   **Giả thuyết Không (Null Hypothesis - $H_0$):** Không có sự khác biệt có ý nghĩa thống kê về điểm đột biến giữa bộ test do GPT-4/GPT-4o sinh ra và bộ test do sinh viên viết thủ công.
    $$H_0: \tilde{\mu}_{\text{MS\_AI}} = \tilde{\mu}_{\text{MS\_Student}}$$
*   **Giả thuyết Đối (Alternative Hypothesis - $H_1$):** Có sự khác biệt có ý nghĩa thống kê về điểm đột biến giữa bộ test do GPT-4/GPT-4o sinh ra và bộ test do sinh viên viết thủ công.
    $$H_1: \tilde{\mu}_{\text{MS\_AI}} \neq \tilde{\mu}_{\text{MS\_Student}}$$

*   **Phép kiểm định thống kê:** Kiểm định Wilcoxon cặp so sánh (Paired Wilcoxon signed-rank test) thực hiện song song cho cả hai chỉ số trên cùng tập 20 hàm ($\alpha = 0.05$, kiểm định hai đuôi).

---

## 4. Giả thuyết bổ sung cho RQ4 — Tỷ lệ thành công đồng thời (Dual Success Rate)
Kiểm định xem tỷ lệ số hàm đạt đồng thời cả hai ngưỡng sàn thực nghiệm ($BC \ge 30.22\%$ và $MS \ge 35.3\%$) trong bộ test sinh bởi GPT-4/GPT-4o có vượt qua mức đa số ngẫu nhiên (50%) hay không. Đây là kiểm định đo lường năng lực "thành công toàn diện" của AI.

*   **Giả thuyết Không (Null Hypothesis - $H_0$):** Tỷ lệ số hàm đạt đồng thời cả hai ngưỡng chất lượng của bộ test do GPT-4/GPT-4o sinh ra nhỏ hơn hoặc bằng 50%.
    $$H_0: p_{\text{success}} \le 0.50$$
*   **Giả thuyết Đối (Alternative Hypothesis - $H_1$):** Tỷ lệ số hàm đạt đồng thời cả hai ngưỡng chất lượng của bộ test do GPT-4/GPT-4o sinh ra lớn hơn 50%.
    $$H_1: p_{\text{success}} > 0.50$$
*   **Phép kiểm định thống kê:** Kiểm định nhị thức chính xác (Exact Binomial Test) đối chiếu tỷ lệ thành công thực tế của $N=20$ hàm với mốc giả thuyết $p_0 = 0.50$ ($\alpha = 0.05$, kiểm định một đuôi).
