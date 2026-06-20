# Slide Outline: Research Proposal Defense

Tài liệu này chứa nội dung chi tiết từng slide (Slide-by-slide Content) cho buổi bảo vệ đề cương nghiên cứu (Tuần 6). Bạn chỉ cần copy-paste nội dung này vào công cụ làm slide (như Google Slides hoặc PowerPoint) và trình bày trong vòng **5–6 phút**.

---

## Slide 1: Title Slide (Trang bìa)
*   **Tiêu đề:** Automated Unit Test Case Generation for Java Functions Using GPT-4o-mini: A Paired Comparison Against Student Benchmark Tests
*   **Topic Code:** RT-SWT-001
*   **Nhóm:** SE1944 - Nhóm 01
*   **Thành viên & Vai trò (Role Codes):**
    *   Lê Thế Khang (PL - Project Lead)
    *   Huỳnh Cao Phước (DG - Data & Ground Truth)
    *   Phạm An Khang (LR - LLM Runner)
    *   Nguyễn Thị Như Ý (MS - Metrics & Stats)
    *   Đỗ Long Vỹ (RW - Research Writer)
*   **Ngày bảo vệ:** 26/06/2026 (Tuần 6)

---

## Slide 2: Research Problem Statement (Đặt vấn đề)
*   **Bối cảnh:**
    *   Viết unit test thủ công tốn thời gian và dễ bỏ sót các trường hợp biên [017], [026].
    *   Sử dụng LLM sinh test tự động là xu thế SOTA hứa hẹn tối ưu hóa quy trình [010].
*   **State of the Art:**
    *   GPT-4/LLaMA-3 có năng lực sinh code test tốt [010], [024].
    *   Tuy nhiên, độ bao phủ (Coverage) cao không đồng nghĩa với năng lực bắt lỗi thực tế (Mutation Score) [005], [026].
*   **GAP Nghiên cứu:**
    *   **GAP-D (Primary):** Chưa có nghiên cứu nào so sánh cặp (paired comparison) giữa GPT-4o-mini và bộ test viết tay của sinh viên (Student Benchmark) trên cùng tập hàm Java của `HumanEval-Java`.
    *   **GAP-M (Secondary):** Việc đánh giá chất lượng test sinh bởi LLM thường bị thiên lệch nếu thiếu kiểm thử đột biến (Mutation Score) làm đối chứng độc lập [026].
*   **Motivation:** Nếu không giải quyết GAP này, sẽ thiếu cơ sở khoa học để đánh giá năng lực thực tế của AI so với sinh viên, gây khó khăn khi ứng dụng AI hỗ trợ chấm bài tự động hoặc hỗ trợ học tập.

---

## Slide 3: Related Work & GAP Mapping (Nghiên cứu liên quan)
### Bảng tóm tắt văn liệu tiêu biểu ($N = 39$ papers):
*   **[010] (Huang'26):** GPT-4 đạt 74% BC, 58% MS trên 3k+ Python functions (Hạn chế: Chưa đối chứng với con người).
*   **[005] (Al-Tse'23):** TestPilot đạt 52.8% BC trên JS (Hạn chế: Không đo điểm đột biến MS).
*   **[024] (AgoneTest'25):** GPT-4o-mini & LLaMA3 sinh test trên lớp Java lớn (Hạn chế: Tỷ lệ compile ban đầu thấp).
*   **[026] (MutGen'26):** Khẳng định độ bao phủ cao có thể đi kèm assertion rỗng/yếu nếu thiếu feedback đột biến.

### GAP Mapping của nhóm:
*   **GAP-D (Comparative Student Baseline):** Đạt trạng thái **Confirmed (Primary GAP)** — $0$ papers thực hiện đối chứng cặp trên Java.
*   **GAP-M (Dual metrics: BC + MS):** Đạt trạng thái **Confirmed (Secondary GAP)** — $12$ papers hỗ trợ.

---

## Slide 4: Research Questions (Slide quan trọng nhất!)
*   **RQ1 (Bao phủ nhánh):** Bộ test do GPT-4o-mini sinh ra có đạt trung vị Branch Coverage (BC) $\ge 30.22\%$ không?
    *   *Giả thuyết:* $H_{0\_1}: \tilde{\mu}_{\text{BC-AI}} < 30.22\%$ | $H_{1\_1}: \tilde{\mu}_{\text{BC-AI}} \ge 30.22\%$
    *   *Ngưỡng:* $30.22\%$ (Case 2 - Hiệu năng trung bình của LLM trên tập ULT [010]).
    *   *Test:* One-sample Wilcoxon signed-rank test ($\alpha = 0.05$).
*   **RQ2 (Điểm đột biến):** Bộ test do GPT-4o-mini sinh ra có đạt trung vị Mutation Score (MS) $\ge 4.0\%$ (sàn) và $\ge 40.21\%$ (mục tiêu) không?
    *   *Giả thuyết sàn:* $H_{0\_2a}: \tilde{\mu}_{\text{MS-AI}} < 4.0\%$ | $H_{1\_2a}: \tilde{\mu}_{\text{MS-AI}} \ge 4.0\%$
    *   *Ngưỡng:* $4.0\%$ (Case 2 - Mức lỗi logic tối thiểu [026]); $40.21\%$ (Case 2 - Trung bình ULT [010]).
    *   *Test:* One-sample Wilcoxon signed-rank test ($\alpha = 0.05$).
*   **RQ3 (So sánh đối chứng):** Có sự khác biệt có ý nghĩa thống kê về BC và MS khi so sánh cặp trực tiếp giữa GPT-4o-mini và Student Benchmark không?
    *   *Giả thuyết (2 đuôi):* $H_{0\_3}: \tilde{\mu}_{\text{AI}} = \tilde{\mu}_{\text{Student}}$ | $H_{1\_3}: \tilde{\mu}_{\text{AI}} \neq \tilde{\mu}_{\text{Student}}$
    *   *Test:* Paired Wilcoxon signed-rank test ($\alpha = 0.05$).
*   **RQ4 (Độ tin cậy kép):** Bộ test do AI sinh ra có đạt đồng thời cả hai ngưỡng tối thiểu (BC $\ge 30.22\%$ và MS $\ge 4.0\%$) cho trên $50\%$ số hàm không?
    *   *Giả thuyết:* $H_{0\_4}: p \le 0.50$ | $H_{1\_4}: p > 0.50$
    *   *Test:* Exact Binomial Test ($N = 50, \alpha = 0.05$).

---

## Slide 5: Experiment Protocol - Pipeline (Quy trình thực nghiệm)
*(Nên vẽ dưới dạng sơ đồ khối/flowchart thay vì để dạng text dài)*

1.  **Lọc Dataset ($N=50$):** Chọn từ benchmark `HumanEval-Java` các hàm có độ phức tạp $5 \le CC \le 16$.
2.  **LLM Prompting:** Gọi API OpenAI (`gpt-4o-mini-2024-07-18`, `temp = 0`, zero-shot).
3.  **Hậu xử lý:** Tách code Java, lưu vào package `humaneval.correct`.
4.  **Biên dịch & Repair:** Chạy Maven. Cho phép tối đa 1-round self-repair tự động nếu lỗi compile.
5.  **Đo lường:** Chạy JaCoCo (đo Branch Coverage) và PIT (đo Mutation Score) cho cả AI và Student.
6.  **Kiểm định thống kê:** Xuất kết quả ra CSV, chạy script Python `scipy.stats` tính p-value.

---

## Slide 6: Dataset & Baseline (Tập dữ liệu & Đối chứng)
*   **Tên dataset:** HumanEval-Java (chứa 163 hàm Java thuật toán, xử lý chuỗi và toán học).
*   **Quy mô mẫu:** $N = 50$ hàm Java được lọc theo độ phức tạp Cyclomatic Complexity ($5 \le CC \le 16$).
    *   *Lý do:* CC trong khoảng này đủ phức tạp để đánh giá năng lực logic, tránh các hàm quá đơn giản.
    *   *Accessible Status:* ✅ Đã tải và xác thực thành công tại local.
*   **Student Benchmark Baseline:** 
    *   Mã nguồn kiểm thử đi kèm trong repo HumanEval-Java do con người viết tay.
    *   Được sử dụng làm baseline đối chứng cặp trực tiếp cho RQ3.

---

## Slide 7: LLM & Measurement Configuration (Cấu hình)
*   **Cấu hình API:**
    *   Model: `gpt-4o-mini-2024-07-18` (cố định phiên bản tránh model drift).
    *   Hyperparameters: `temperature = 0` (đảm bảo tính tái lập kết quả), `top_p = 1`, `max_tokens = 2000`.
    *   Prompting: Zero-shot structured prompt.
*   **Công cụ đo lường:**
    *   **Branch Coverage:** Công cụ JaCoCo (v0.8.7+).
    *   **Mutation Score:** Công cụ PiTest (v1.7.4+), sử dụng bộ toán tử mặc định (`DEFAULTS`).
    *   **Ground Truth:** Mã nguồn chuẩn Java trong repo, đo lường hoàn toàn tự động (không dùng con người gán nhãn $\rightarrow$ chỉ số đồng thuận IAA không áp dụng).

---

## Slide 8: Evaluation Plan (Kế hoạch đánh giá)
### Bảng tiêu chí bác bỏ giả thuyết không ($H_0$):
*   **RQ1 (BC):** Reject $H_0$ khi $p\text{-value} < 0.05$ và trung vị $\ge 30.22\%$.
*   **RQ2a (MS sàn):** Reject $H_0$ khi $p\text{-value} < 0.05$ và trung vị $\ge 4.0\%$.
*   **RQ2b (MS mục tiêu):** Reject $H_0$ khi $p\text{-value} < 0.05$ và trung vị $\ge 40.21\%$.
*   **RQ3 (Comparative):** Reject $H_0$ khi $p\text{-value} < 0.05$ (Có sự khác biệt có ý nghĩa thống kê).
*   **RQ4 (Binomial):** Reject $H_0$ khi $p\text{-value} < 0.05$ và tỷ lệ thành công kép $> 50\%$.

### Diễn giải tổ hợp kết quả:
*   **Double Positive (RQ1 & RQ2 đạt):** GPT-4o-mini sinh test mạnh mẽ cả về cấu trúc lẫn logic.
*   **Mixed (RQ1 đạt, RQ2 thất bại):** Hiện tượng "Coverage Blindness" (độ bao phủ cao nhưng assertion rỗng/yếu).
*   **Double Negative (Cả hai thất bại):** Cần các kỹ thuật nâng cao hơn (CoT, few-shot, multi-agent) để hỗ trợ viết test.

---

## Slide 9: Threats to Validity & Mitigation (Đe dọa & Giảm thiểu)
*   **Internal Validity (Model Drift):**
    *   *Threat:* OpenAI tự động cập nhật ngầm mô hình trên đám mây.
    *   *Mitigation:* Ghim cứng phiên bản API `gpt-4o-mini-2024-07-18` và thiết lập `temperature = 0`.
*   **External Validity (Generalizability):**
    *   *Threat:* Tập dữ liệu gồm các hàm thuật toán độc lập, khó đại diện cho code dự án thực tế.
    *   *Mitigation:* Giới hạn phạm vi nghiên cứu rõ ràng: đánh giá ở cấp độ đơn vị lập trình độc lập.
*   **Construct Validity (Metric Weakness):**
    *   *Threat:* BC và MS không đo được tính dễ đọc/dễ bảo trì của code test.
    *   *Mitigation:* Bổ sung thống kê descriptive về tỷ lệ lỗi biên dịch (Compilation Success Rate).
*   **Conclusion Validity (Statistical Power):**
    *   *Threat:* Mẫu nhỏ $N = 50$ có thể bị thiếu lực lượng thống kê nếu nhiều hàm lỗi compile.
    *   *Mitigation:* Cho phép tối đa 1 lượt tự động sửa lỗi biên dịch (1-round self-repair).

---

## Slide 10: Timeline, Roles & Budget (Lịch trình & Nhân sự)
*   **Phân công vai trò (Role Codes):**
    *   **PL (Khang):** Quản lý tiến độ, review tài liệu, xử lý blockers.
    *   **DG (Phước):** Chuẩn bị baseline, quản lý dataset.
    *   **LR (An Khang):** Viết script API, chạy sinh test LLM.
    *   **MS (Như Ý):** Đo đạc metrics JaCoCo/PIT, chạy kiểm định thống kê.
    *   **RW (Vỹ):** Soạn Related Work, vẽ biểu đồ, viết báo cáo.
*   **Chi phí API ước tính:** ~$1.33 USD (khoảng 33,000 VND) cho toàn bộ chạy thử và chạy chính thức.
*   **Timeline tóm tắt:**
    *   *Tuần 5:* Viết Proposal + Lọc dataset + Test API.
    *   *Tuần 6:* Nộp Proposal + Slide bảo vệ đề cương (Gate).
    *   *Tuần 7:* Thực nghiệm Pilot (10% mẫu) + Review Pilot.
    *   *Tuần 8:* Chạy Full Experiment + Chạy PiTest/JaCoCo + Kiểm định thống kê.
    *   *Tuần 9–10:* Viết báo cáo cuối và Slide nghiệm thu đề tài.

---

## Slide 11: Q&A
*   *Trang kết thúc thuyết trình.*
*   *(Gợi ý câu hỏi phản biện của GV: **"Vì sao nhóm chọn các ngưỡng 30.22% và 4.0%?"**)*
    *   *Trả lời:* "Dạ, ngưỡng 30.22% là hiệu năng Branch Coverage trung bình của LLM ghi nhận trong paper thực nghiệm lớn [010] (Huang'26). Ngưỡng 4.0% là mức lỗi logic tối thiểu (mutation score floor) được ghi nhận trong nghiên cứu [026] (MutGen'26). Nhóm chọn các ngưỡng này theo Case 2 trong barem RBL nhằm đảm bảo tính thực tiễn khoa học."
*   **Backup Slide (Đính kèm sau trang này):** Bảng tổng hợp Related Work đầy đủ để show ra khi giảng viên hỏi sâu về văn liệu.
