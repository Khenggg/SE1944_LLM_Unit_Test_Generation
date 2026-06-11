# 1. Evidence Table & Distribution

| Evidence Group | Count among 36 unique primary studies | Remarks |
|---|---:|---|
| Directly controls for medium cyclomatic complexity (CC=5–15) | 1/36 | Strict population control for medium cyclomatic complexity is largely absent (only present in Paper 033). Most benchmarks skew toward ultra-simple or legacy enterprise code. |
| Direct comparison with student-written tests | 1/36 | Only one study (Paper 009) explicitly addresses student programming assignments, highlighting a severe lack of research tailored to educational contexts. |
| Evaluates against human or developer-written tests | 5/36 | Comparisons exist (Paper 001, Paper 004, etc.) against professional developers, but this does not accurately represent a student-written baseline. |
| Utilizes coverage / code coverage / branch coverage | 28/36 | Structural coverage remains the most universally adopted evaluation metric in the extracted studies. |
| Utilizes mutation score / mutation testing / mutant info | 16/36 | Mutation testing appears less frequently and is predominantly found in studies proposing feedback-driven or mutation-guided methodologies. |
| Simultaneously evaluates branch coverage and mutation score using GPT-4o | Present but fragmented | Strong evidence exists (e.g., ULT benchmark), but they typically utilize custom corporate/open-source benchmarks without benchmarking against student-written baselines. |

---

# 2. Primary Gap (Gap D) — Dataset & Complexity Focus

**Primary Gap (Gap D):**  
Phần lớn các nghiên cứu hiện nay về tự động sinh unit test bằng LLM đang gặp phải khoảng trống lớn về mặt dữ liệu và kiểm soát độ phức tạp (Dataset & Complexity Gap). Các nghiên cứu thực nghiệm hiện tại thường thử nghiệm trên hai thái cực cực đoan: hoặc là các tập dữ liệu quá đơn giản (như HumanEval), hoặc là các kho mã nguồn kế thừa (legacy repositories) vô cùng phức tạp của doanh nghiệp. Hoàn toàn vắng bóng các nghiên cứu thực hiện kiểm soát nghiêm ngặt đối tượng kiểm thử ở cấp độ hàm có độ phức tạp mã nguồn trung bình (Cyclomatic Complexity từ 5 đến 15).

Nghiêm trọng hơn, việc đánh giá hiệu suất của LLM (cụ thể là GPT-4o) trong bối cảnh giáo dục kỹ thuật phần mềm chưa được khai thác, khi dữ liệu nghiên cứu thiếu vắng sự so sánh trực tiếp với một baseline thực tế là các bài kiểm thử do chính sinh viên viết.

---

# 3. Secondary Gaps (Gap M) — Methodological & Metric Focus

Sau khi xác định bài toán cốt lõi về tập dữ liệu (Gap D), nghiên cứu này tiếp tục giải quyết các khoảng trống phụ liên quan đến Phương pháp luận và Số đo đánh giá (Gap M):

## Gap M.1 — Phương pháp luận (Methodological Gap)
Các tài liệu hiện tại có xu hướng coi "GPT-4" hay các LLM nói chung như một khối độc lập (monolith) mà chưa định nghĩa hoặc kiểm soát tường minh các chính sách thiết kế prompt (Prompt Engineering Policies) như: Zero-shot, Chain-of-Thought, hay Iterative Feedback Loops. Điều này làm giảm tính nhất quán và khả năng tái lặp của thực nghiệm.

## Gap M.2 — Số đo đánh giá (Metric Gap)
Mặc dù tỷ lệ báo cáo độ bao phủ cấu trúc (structural coverage) rất cao (28/36 bài báo), số lượng nghiên cứu kết hợp đánh giá chỉ số đột biến (mutation score) để đo lường năng lực phát hiện lỗi thực tế còn hạn chế (16/36 bài báo). Việc đánh giá đồng thời cả hai chỉ số này trên cùng một bối cảnh thực nghiệm chưa được thực hiện một cách đồng bộ.

---

# 4. Final Gap Statement (Cấu trúc lại theo D và M)

Các nghiên cứu thực nghiệm hiện tại đã chứng minh Large Language Models (LLMs) có khả năng sinh các bộ unit test với độ bao phủ cao khi được hỗ trợ bởi các kỹ thuật prompt nâng cao hoặc vòng lặp phản hồi. Tuy nhiên, y văn hiện tại vẫn tồn tại một khoảng trống nghiên cứu cốt lõi (Gap D) về việc thiếu một tập dữ liệu được kiểm soát nghiêm ngặt ở mức độ phức tạp trung bình (Cyclomatic Complexity = 5–15) của hai ngôn ngữ Java/Python, đồng thời thiếu một baseline đối chứng trực tiếp từ các bài kiểm thử do sinh viên thực hiện trong môi trường học thuật.

Bên cạnh đó, các nghiên cứu cũng chưa giải quyết triệt để bài toán phương pháp luận (Gap M) khi chưa phân tách rõ ràng tác động của các chính sách prompt khác nhau (Zero-shot vs. Iterative) và chưa áp dụng đồng bộ hệ thống kiểm thử kép (kết hợp cả Branch Coverage và Mutation Score) để đánh giá toàn diện năng lực tìm lỗi của mã nguồn do GPT-4o tạo ra trên tập dữ liệu đặc thù này.

---

# 5. Revised Research Direction

Để giải quyết trọn vẹn các khoảng trống nghiên cứu trên, đề tài (ví dụ: dự án SE1944) sẽ triển khai theo lộ trình:

## Giải quyết Gap D (Trọng tâm)
- Tiến hành chọn lọc và xây dựng một tập dữ liệu chuẩn hóa gồm các hàm Java và Python trích xuất từ bài tập của sinh viên.
- Đảm bảo độ phức tạp Cyclomatic nằm trong khoảng $5 \le CC \le 15$.
- Thu thập toàn bộ test suite do sinh viên viết để làm baseline đối chứng.

## Giải quyết Gap M (Bổ trợ)
- Cấu trúc quy trình sinh test của GPT-4o thành các chiến lược prompt rõ ràng (Zero-shot, Few-shot, Iterative, v.v.).
- Thực hiện kiểm thử và phân tích thống kê ghép cặp (paired statistical comparison).
- Sử dụng hai trục đánh giá chính:
  - Branch Coverage  
  - Mutation Score  
- Kết hợp thêm:
  - Compilation status  
  - Pass/fail status  

=> Từ đó đưa ra kết luận toàn diện về hiệu năng sinh unit test của GPT-4o trong bối cảnh học thuật.
