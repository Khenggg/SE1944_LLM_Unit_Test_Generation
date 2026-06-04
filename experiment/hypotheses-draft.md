# Hypotheses Draft — LLM for Unit Test Case Generation
Ngày: 2026-06-03

Các giả thuyết thống kê dưới đây bám sát thiết kế trong `Phuoc/experiment/design-rationale.md` và tương thích hoàn toàn với các câu hỏi nghiên cứu của nhóm trong `team-synthesis/rq-final.md`.

---

## RQ1 — Branch Coverage Threshold (Absolute Target)
Kiểm định xem unit test do GPT-4/GPT-4o sinh ra có đạt độ bao phủ nhánh tối thiểu 70% trên các hàm có độ phức tạp cyclomatic trung bình hay không.

- **H0_1:** Trung vị (median) branch coverage của unit test sinh bởi GPT-4/GPT-4o nhỏ hơn 70%.
- **H1_1:** Trung vị (median) branch coverage của unit test sinh bởi GPT-4/GPT-4o lớn hơn hoặc bằng 70%.

*   **Statistical test dự kiến:** One-sample Wilcoxon signed-rank test đối chứng với giá trị 70% ($\alpha = 0.05$).

---

## RQ2 — Mutation Score Threshold (Absolute Target)
Kiểm định xem unit test do GPT-4/GPT-4o sinh ra có đạt điểm đột biến tối thiểu 35.3% trên các hàm hay không.

- **H0_2:** Trung vị (median) mutation score của unit test sinh bởi GPT-4/GPT-4o nhỏ hơn 35.3%.
- **H1_2:** Trung vị (median) mutation score của unit test sinh bởi GPT-4/GPT-4o lớn hơn hoặc bằng 35.3%.

*   **Statistical test dự kiến:** One-sample Wilcoxon signed-rank test đối chứng với giá trị 35.3% ($\alpha = 0.05$).

---

## RQ3 — Comparison with Student-written Tests (Comparative Target)
Kiểm định đối chứng trực tiếp chất lượng giữa test suite tự động (GPT-4/GPT-4o) và test suite thủ công (sinh viên viết) trên cùng một tập các hàm.

### RQ3a: So sánh độ bao phủ nhánh (Branch Coverage)
- **H0_3a:** Không có sự khác biệt có ý nghĩa thống kê về độ bao phủ nhánh giữa GPT-4/GPT-4o-generated tests và student-written tests.
- **H1_3a:** Có sự khác biệt có ý nghĩa thống kê về độ bao phủ nhánh giữa GPT-4/GPT-4o-generated tests và student-written tests.

### RQ3b: So sánh điểm đột biến (Mutation Score)
- **H0_3b:** Không có sự khác biệt có ý nghĩa thống kê về điểm đột biến (mutation score) giữa GPT-4/GPT-4o-generated tests và student-written tests.
- **H1_3b:** Có sự khác biệt có ý nghĩa thống kê về điểm đột biến (mutation score) giữa GPT-4/GPT-4o-generated tests và student-written tests.

*   **Statistical test dự kiến:** Paired Wilcoxon signed-rank test ($\alpha = 0.05$).

---

## RQ4 — Simultaneous Success Rate (Dual Metric Target)
Kiểm định xem tỷ lệ số hàm đạt đồng thời cả hai ngưỡng chất lượng (branch coverage >= 70% và mutation score >= 35.3%) có vượt quá mức đa số (50%) hay không.

- **H0_4:** Tỷ lệ số hàm đạt đồng thời cả branch coverage >= 70% và mutation score >= 35.3% nhỏ hơn hoặc bằng 50%.
- **H1_4:** Tỷ lệ số hàm đạt đồng thời cả branch coverage >= 70% và mutation score >= 35.3% lớn hơn 50%.

*   **Statistical test dự kiến:** Exact Binomial Test kiểm định tỷ lệ thành công nhị phân đối chứng với mốc 50% ($\alpha = 0.05$).
