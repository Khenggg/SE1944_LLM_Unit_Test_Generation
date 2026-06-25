# Tuyên bố về Khe hở Nghiên cứu (Gap Statement) — Huỳnh Cao Phước

## 1. Tổng hợp Thống kê từ Evidence Table ($N = 7$ papers)

Dựa trên dữ liệu thực nghiệm được trích xuất hệ thống từ 7 nghiên cứu tiêu biểu chọn lọc từ OpenAlex:
*   **100% (7/7)** nghiên cứu thực hiện đánh giá năng lực sinh unit test tự động của các mô hình ngôn ngữ lớn (LLMs).
*   **85.7% (6/7)** nghiên cứu sử dụng hoặc đối so sánh trực tiếp với các mô hình thuộc thế hệ GPT-4 (GPT-4, GPT-4o, GPT-4o-mini). Tất cả 7/7 nghiên cứu đều đánh giá dòng mô hình OpenAI (GPT/Codex).
*   **100% (7/7)** nghiên cứu sử dụng các chỉ số cấu trúc truyền thống (Line coverage hoặc Branch coverage) làm tiêu chí đo lường độ bao phủ.
*   **100% (7/7)** nghiên cứu sử dụng kiểm thử đột biến (mutation testing hoặc mutation score) để đánh giá chất lượng các assertion được sinh ra.
*   **0% (0/7)** nghiên cứu sử dụng các bộ unit test viết thủ công bởi sinh viên (student-written tests) làm baseline đối chứng. Các so sánh chủ yếu được thực hiện với các bộ test có sẵn của nhà phát triển dự án chuyên nghiệp hoặc các công cụ sinh test tự động dựa trên tìm kiếm (SBST) như EvoSuite hay Pynguin.
*   **0% (0/7)** nghiên cứu thực hiện kiểm soát và phân loại chặt chẽ tập dữ liệu hàm thử nghiệm theo khoảng độ phức tạp Cyclomatic Complexity trung bình từ 5 đến 15 (CC = 5–15) để phân tích sự ảnh hưởng của độ phức tạp tới chất lượng sinh test của LLM.

---

## 2. Các Khe hở Nghiên cứu Cụ thể (Specific Gaps)

### 📌 Khe hở Chỉ số (GAP-M — Metric Gap)
Mặc dù việc đo lường độ bao phủ nhánh (branch coverage) và điểm đột biến (mutation score) được thừa nhận rộng rãi, các nghiên cứu thường chỉ tập trung tối ưu hóa độ phủ dòng lệnh hoặc coi mutation score là một metric phụ để đánh giá chất lượng thêm. Chưa có nghiên cứu nào tích hợp cả hai chỉ số này thành một **tiêu chuẩn kép (dual adequacy criteria)** đồng thời với các ngưỡng sàn thực nghiệm được chứng minh khoa học từ văn liệu (Branch Coverage $\ge$ 30.22% và Mutation Score $\ge$ 35.3%) để đánh giá năng lực kiểm thử của mô hình.

### 📌 Khe hở Độ phức tạp & Tập dữ liệu (GAP-D — Dataset & Complexity Gap)
Các nghiên cứu hiện tại phân cực rất lớn về mặt dữ liệu: hoặc sử dụng các bài toán thuật toán quá đơn giản (như HumanEval có độ phức tạp trung bình chỉ khoảng 4.71, không đại diện cho mã nguồn thực tế) hoặc sử dụng mã nguồn dự án lớn, phức tạp chứa nhiều dependencies ngoài tầm kiểm soát của LLM trong chế độ zero-shot. Khoảng độ phức tạp trung bình thực tế từ 5 đến 15 (CC = 5–15) — vốn đại diện cho các hàm xử lý nghiệp vụ thông thường trong các ứng dụng thực tế — hoàn toàn bị bỏ sót trong việc phân tích ảnh hưởng của cấu trúc phức tạp tới hiệu năng kiểm thử của LLM.

### 📌 Khe hở Đối tượng Đối chứng (GAP-C — Comparison Gap)
Việc so sánh chất lượng test giữa LLM và con người hiện tại chỉ giới hạn ở các kỹ sư phần mềm chuyên nghiệp (professional developers) thông qua các bộ test reference có sẵn trong mã nguồn. Năng lực sinh test của mô hình GPT-4 chưa bao giờ được đặt trong mối tương quan đối so sánh trực tiếp với **sinh viên ngành Kỹ thuật Phần mềm (academic baseline)**. Đây là một khoảng trống lớn vì sinh viên là đối tượng chính đang sử dụng LLMs để hỗ trợ học tập và làm đồ án Capstone, đòi hỏi một đánh giá khoa học để xác định xem AI có thể thay thế hoặc hỗ trợ con người ở mức độ nào trong môi trường đào tạo.

---

## 3. Tuyên bố Đóng góp Đề xuất (Proposed Contribution)

Để giải quyết các khe hở nghiên cứu trên, nghiên cứu này sẽ thực hiện một đánh giá thực nghiệm chặt chẽ đối chứng trực tiếp giữa **GPT-4/GPT-4o** và **sinh viên ngành Kỹ thuật Phần mềm** trên cùng một tập dữ liệu gồm các hàm Java/Python có độ phức tạp cyclomatic trung bình được kiểm soát nghiêm ngặt (**CC = 5–15**). Chất lượng kiểm thử sẽ được định lượng đồng thời qua hai chỉ số cốt lõi là **độ bao phủ nhánh (branch coverage)** và **điểm đột biến (mutation score)** nhằm đưa ra kết luận khoa học về khả năng sinh test của LLM trong môi trường học thuật.
