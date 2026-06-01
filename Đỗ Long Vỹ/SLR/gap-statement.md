GAP STATEMENT - ĐỖ LONG VỸ (IEEE XPLORE)

Summary from Evidence Table (Tóm tắt từ bảng bằng chứng IEEE Xplore)

Từ 19 bài báo chính thức được chọn lọc từ hệ thống IEEE Xplore:



19/19 bài báo tập trung đánh giá việc ứng dụng LLM trong kiểm thử đơn vị tự động (LLM-based unit test generation).



15/19 bài báo sử dụng các mô hình thương mại phổ biến (GPT-3.5/4, ChatGPT, Codex) hoặc các dòng mã nguồn mở mới nổi (Llama-2, DeepSeek-Chat).



14/19 bài báo sử dụng độ bao phủ cấu trúc (code/branch/path coverage) làm thước đo hiệu năng chính.



Chỉ có 3/19 bài báo (IEEE003, IEEE005, IEEE017) có đề cập hoặc tích hợp kiểm thử đột biến (mutation testing/mutation score) vào quy trình đánh giá.



1/19 bài báo (IEEE007) nghiên cứu việc tạo unit test cho các bài tập lập trình của sinh viên, nhưng chưa có bài báo nào tiến hành đối chiếu, so sánh trực tiếp chất lượng test case do LLM tạo ra với test case do chính sinh viên viết cho cùng một bài toán.



18/19 bài báo tập trung vào các ngôn ngữ lập trình phổ biến trong công nghiệp như Java và Python.



GAP-M - Metric Gap (Khoảng trống về Chỉ số đo lường)

Tương tự như xu hướng trên Google Scholar, các nghiên cứu trên IEEE Xplore tập trung rất mạnh vào các chỉ số độ bao phủ truyền thống (đặc biệt là dòng nghiên cứu mới về Path-Sensitive như IEEE011). Tuy nhiên, việc đánh giá Mutation Score (độ bao phủ đột biến để đo lường khả năng phát hiện lỗi thực tế của test case) vẫn chiếm tỷ lệ rất thấp và chưa nhất quán. Điều này để lại một khoảng trống lớn trong việc xác định liệu các test case do LLM sinh ra có thực sự "chất lượng" (bắt được bug) hay chỉ đơn thuần là chạy qua hết các dòng lệnh (pass coverage).



GAP-D - Dataset Gap (Khoảng trống về Tập dữ liệu)

Tập dữ liệu trong các nghiên cứu thuộc IEEE Xplore phân mảnh từ các bài tập code ngắn trong giáo dục (IEEE007), các hệ thống đa thành phần phức tạp (IEEE012), cho đến các hàm dài cần phân tách cấu trúc (IEEE015). Việc thiếu một tập dữ liệu chuẩn hóa, tập trung cô lập vào các hàm/lớp (functions/classes) có độ phức tạp trung bình (medium-complexity) khiến việc đánh giá hiệu năng thực tế của LLM chưa có hệ quy chiếu đồng nhất.



GAP-C - Comparison Gap (Khoảng trống về Đối tượng so sánh)

Các nghiên cứu trong tập IEEE Xplore chủ yếu so sánh LLM với các công cụ tạo test tự động truyền thống dựa trên thuật toán tìm kiếm (Search-Based Software Testing - SBST như EvoSuite) hoặc so sánh chéo giữa các mô hình LLM với nhau (như DeepSeek vs GPT). Khoảng trống nghiên cứu cốt lõi ở đây là: Thiếu vắng một sự so sánh trực diện (Direct Comparison) với các bài kiểm thử do con người thực hiện, cụ thể là đối tượng sinh viên ngành Kỹ thuật Phần mềm, nhằm đánh giá xem công cụ AI đã tiệm cận hoặc vượt qua năng lực của lập trình viên thế hệ mới hay chưa.



Proposed Contribution (Đóng góp đề xuất của Nghiên cứu)

Để giải quyết đồng thời các khoảng trống nghiên cứu (Gaps) được chỉ ra từ cả hai nguồn Google Scholar (của Khang) và IEEE Xplore (bạn phụ trách), nghiên cứu này sẽ:



Đánh giá toàn diện các unit test do GPT-4 (và các mô hình tiên tiến) sinh ra cho các hàm Java/Python có độ phức tạp trung bình.



Sử dụng đồng thời cả hai thước đo nghiêm ngặt: Branch Coverage (Độ bao phủ nhánh) và Mutation Score (Điểm đột biến phát hiện lỗi).



Đóng góp quan trọng nhất: Tiến hành đối chiếu trực tiếp (Benchmark) kết quả của LLM với tập dữ liệu test case do sinh viên thực hiện trên cùng một bài toán mẫu, từ đó đưa ra bức tranh thực tế về khoảng cách năng lực giữa AI và người học.

