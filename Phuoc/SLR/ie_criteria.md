# Tiêu chí Lựa chọn và Loại trừ Tài liệu (IE Criteria)

**Thành viên thực hiện:** Huỳnh Cao Phước  
**Nguồn tìm kiếm phụ trách:** OpenAlex  
**Đề tài:** LLM for Unit Test Case Generation  
**Câu hỏi nghiên cứu (RQ):** "Đối với các hàm Java/Python có độ phức tạp cyclomatic trung bình (CC = 5–15), liệu các bộ unit test sinh tự động bởi mô hình GPT-4/GPT-4o có đạt được độ bao phủ nhánh (branch coverage) $\ge$ 30.22% và điểm kiểm thử đột biến (mutation score) $\ge$ 35.3% không, và hiệu năng của chúng khác biệt thế nào so với bộ test viết thủ công bởi sinh viên trên cùng tập hàm đối chứng?"

---

## 1. Tiêu chí Lựa chọn (Inclusion Criteria - IC)
Để được đưa vào danh sách phân tích toàn văn và trích xuất dữ liệu, bài báo nghiên cứu **PHẢI thỏa mãn đồng thời tất cả** các tiêu chí lựa chọn sau:

| Mã | Tiêu chí | Biện giải Khoa học & Thực tiễn (Rationale) |
| :--- | :--- | :--- |
| **IC-L** | **Ngôn ngữ:** Bài viết phải được trình bày hoàn toàn bằng tiếng Anh. | Tiếng Anh là ngôn ngữ chuẩn mực toàn cầu trong khoa học máy tính và kỹ nghệ phần mềm. Hầu hết các công trình nghiên cứu cốt lõi và các công cụ sinh test dựa trên LLM mới nhất đều được công bố và lập tài liệu bằng tiếng Anh. |
| **IC-Y** | **Thời gian xuất bản:** Từ năm 2020 đến nay (2020–2026). | Năm 2020 đánh dấu bước ngoặt lớn khi các mô hình ngôn ngữ lớn (như GPT-3) bắt đầu được ứng dụng rộng rãi và tối ưu hóa cho các tác vụ lập trình (Code Generation) và kiểm thử phần mềm (Software Testing). Các nghiên cứu trước năm 2020 chủ yếu dựa trên các mô hình Sequence-to-Sequence truyền thống (như LSTM) có năng lực suy luận ngữ cảnh rất hạn chế. |
| **IC-T** | **Hình thức xuất bản:** Đăng tải trên các Kỷ yếu hội nghị khoa học hoặc Tạp chí uy tín (peer-reviewed conferences hoặc journals). | Tiêu chí này đảm bảo chất lượng khoa học, tính tin cậy của phương pháp nghiên cứu và tính xác thực của số liệu thực nghiệm thông qua quy trình bình duyệt độc lập, loại bỏ các bài viết dạng blog cá nhân, tài liệu quảng cáo thương mại hoặc luận văn chưa qua kiểm chứng. |
| **IC-P** | **Tác vụ kiểm thử (Task):** Tập trung vào việc sinh unit test tự động (ở cấp độ method, function, hoặc class) cho mã nguồn. | Đúng với phạm vi nghiên cứu của đề tài. Unit testing là nền tảng của STLC (Software Testing Life Cycle). Việc sinh test tự động ở cấp độ này đòi hỏi LLM phải hiểu sâu cấu trúc cú pháp và ngữ nghĩa điều khiển của một đơn vị mã nguồn độc lập. |
| **IC-I** | **Kỹ thuật áp dụng (Intervention):** Sử dụng các mô hình ngôn ngữ lớn (LLM, GPT, Codex, hoặc tương đương) làm công cụ cốt lõi để sinh test. | Đề tài tập trung vào việc đánh giá khả năng sinh test của AI thế hệ mới (Generative AI/LLMs) thay vì các phương pháp sinh test tự động truyền thống như kiểm thử dựa trên tìm kiếm (SBST) hoặc thực thi biểu tượng (Symbolic Execution) thuần túy. |
| **IC-E** | **Dữ liệu thực nghiệm:** Có ít nhất một bảng dữ liệu (Table) hoặc biểu đồ (Figure) báo cáo kết quả thực nghiệm định lượng rõ ràng trong toàn văn. | Đảm bảo nghiên cứu cung cấp số liệu thực tế để đối so sánh và trích xuất giá trị sàn (floor values) cho việc thiết kế các ngưỡng kiểm chứng trong thực nghiệm của nhóm (ví dụ: các chỉ số coverage và mutation score cụ thể). |

---

## 2. Tiêu chí Loại trừ (Exclusion Criteria - EC)
Bài báo sẽ **bị LOẠI NGAY LẬP TỨC** nếu phạm phải **bất kỳ một** tiêu chí nào dưới đây:

| Mã | Tiêu chí | Biện giải Khoa học & Thực tiễn (Rationale) |
| :--- | :--- | :--- |
| **EC-D** | **Trùng lặp (Duplicate):** Bài viết bị trùng lặp tiêu đề, DOI hoặc nội dung với một bài viết khác đã được ghi nhận trong danh sách. | Đảm bảo tính duy nhất của dữ liệu, tránh việc tính trùng hai lần cho cùng một nghiên cứu khi tổng hợp số liệu PRISMA. |
| **EC-A** | **Hạn chế truy cập:** Không thể truy cập được văn bản đầy đủ (Full-text) sau khi đã tìm kiếm qua tất cả các cơ sở dữ liệu mở hoặc thư viện trường học. | Không thể trích xuất chi tiết phương pháp, cấu hình prompts, cũng như các bảng số liệu thực nghiệm nếu chỉ đọc phần tóm tắt (Abstract). |
| **EC-S** | **Quy mô bài báo ngắn:** Độ dài toàn văn từ 4 trang trở xuống (bao gồm các dạng extended abstract, poster, short paper, hoặc demo). | Các bài viết ngắn thường thiếu thông tin chi tiết về thiết kế thực nghiệm, thông số cấu hình mô hình (như temperature), prompts và các hạn chế tự nêu, không đủ cơ sở để đánh giá tính khoa học. |
| **EC-N** | **Thiếu thực nghiệm:** Các bài viết thuần lý thuyết (position paper, vision paper, survey, tutorial, hoặc review) không tự chạy thực nghiệm. | Mặc dù rất tốt để làm tài liệu tham khảo (Related Work), các bài báo này không cung cấp dữ liệu thực nghiệm trực tiếp để làm baseline hay đối chứng cho các ngưỡng thiết kế. |
| **EC-O** | **Sai lệch chủ đề (Out of Scope):** Tập trung vào sinh dữ liệu cho fuzzer (fuzzer seed generation), kiểm thử giao diện (UI testing), gỡ lỗi tự động (automated debugging), hoặc sinh code ứng dụng đơn thuần mà không tạo ra bộ test case hoàn chỉnh. | Các tác vụ này có mục tiêu và metrics đánh giá hoàn toàn khác với việc sinh unit test case để đo lường độ phủ nhánh (branch coverage) và khả năng phát hiện mutant. |

---

## 3. Quy tắc Sàng lọc (Screening Rules)
* **Nguyên tắc Sàng lọc Vòng 1 (Title/Abstract):** Đọc kỹ tiêu đề và tóm tắt bài báo để đối chiếu nhanh với các mã tiêu chí. Nếu có bất kỳ sự nghi ngờ nào về việc thỏa mãn tiêu chí lựa chọn (`UNSURE`), bài báo **bắt buộc phải được giữ lại** để đưa vào vòng 2 đọc toàn văn (Full-text screening). Nguyên tắc này tuân thủ quy chuẩn PRISMA để tránh việc bỏ sót (loại nhầm) các công trình nghiên cứu chất lượng cao do phần tóm tắt viết chưa đầy đủ.
* **Nguyên tắc Sàng lọc Vòng 2 (Full-text):** Đọc kỹ toàn bộ văn bản để xác minh tính chính xác của các chỉ số thực nghiệm và cấu hình mô hình trước khi điền vào Evidence Table.
