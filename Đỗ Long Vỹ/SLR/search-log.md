# BÁO CÁO KẾT QUẢ TÌM KIẾM TÀI LIỆU (SEARCH LOG) - IEEE XPLORE

**Đề tài:** LLM for Unit Test Case Generation  
**Thành viên thực hiện:** Đỗ Long Vỹ  
**Mã số sinh viên:** SE190064
**Nguồn dữ liệu:** IEEE Xplore  
**Ngày thực hiện:** 01/06/2026  

---

### 1. Chuỗi truy vấn (Query String)
* **Chuỗi áp dụng:** String A - Rút gọn (String A - simplified)
* **Ngữ cảnh áp dụng:** Tìm kiếm tập trung vào sự kết hợp giữa các mô hình ngôn ngữ lớn (`large language model`, `LLM`, `GPT`, `ChatGPT`, `DeepSeek`) với việc tạo kiểm thử đơn vị tự động (`unit test generation`, `test case generation`) và các chỉ số đo lường độ bao phủ hoặc kiểm thử đột biến (`code coverage`, `mutation testing`).

---

### 2. Nhật ký thực thi tìm kiếm (Search Execution Log)

| Nguồn dữ liệu | Chuỗi truy vấn | Ngày thực hiện | Số kết quả thô được chọn | Ghi chú thực thi |
| :--- | :--- | :---: | :---: | :--- |
| **IEEE Xplore** | String A - simplified | 01/06/2026 | 25 | Trích xuất thủ công 25 bản ghi lưu vào tệp `raw_records_ieee_xplore.csv`. Toàn bộ dữ liệu trường tóm tắt (Abstract) được giữ nguyên bản; trạng thái đọc toàn văn (full text) hiện tại là chưa kiểm tra. |

---

### 3. Số liệu tổng hợp và Sàng lọc sơ bộ (Sifting Metrics & IE Criteria Mapping)
Quy trình phân loại sơ bộ (Sifting) được thực hiện nghiêm ngặt dựa trên bộ tiêu chí lựa chọn/loại trừ (`ie_criteria.md`) của nhóm:
* **Tổng số bài chọn ban đầu (Exported before screening):** 25 bài (Mã từ `IEEE001` đến `IEEE025`).
* **Số bài Hợp lệ (Mã INCLUDE):** 19 bài.
* **Số bài đề xuất Loại (Mã EXCLUDE):** 5 bài.
* **Số bài cần xem xét thêm (Mã UNSURE):** 1 bài.

#### Chi tiết áp mã tiêu chí sàng lọc hệ thống:

| ID | Tên bài báo (Title) | Quyết định | Tiêu chí áp dụng | Lý do chi tiết (Notes) |
| :--- | :--- | :---: | :---: | :--- |
| **IEEE013** | *Large Language Models for Printed Circuit Board Test Generation* | **UNSURE** | **Screening Rule** | Kiểm thử bo mạch phần cứng (PCB). Giữ lại đọc toàn văn ở V2 để kiểm tra xem có phần mềm nhúng không theo đúng quy tắc xử lý bài chưa rõ ràng của nhóm. |
| **IEEE020** | *Test Data Generation for Dynamic Unit Test in Java Language using Genetic Algorithm* | **EXCLUDE** | Vi phạm **IC3** | Sử dụng thuật toán di truyền (Genetic Algorithm), hoàn toàn không có yếu tố công nghệ LLM/GPT/AI theo yêu cầu. |
| **IEEE021** | *Enhancing web UX Test Coverage Through Model-Based Practices: State Machine Driven Test Auto-Generation* | **EXCLUDE** | **EC3** | Tập trung vào kiểm thử trải nghiệm người dùng (Web UX/UI) và Model-based, không liên quan đến Unit Test Case Generation. |
| **IEEE022** | *LLM-SRAF: Sub-Resolution Assist Feature Generation Using Large Language Model* | **EXCLUDE** | **EC6** | Áp dụng LLM vào mảng thiết kế vi mạch/quang khắc bán dẫn phần cứng, không thuộc khối ngành Software Engineering hay phần mềm. |
| **IEEE023** | *Large Language Model with Federated Retrieval-Augmented Generation for Improved Knowledge Retrieval* | **EXCLUDE** | **EC6** / Không thuộc **IC3** | Nghiên cứu tối ưu hóa kiến trúc RAG để truy xuất tri thức thuần túy, không phục vụ mục đích sinh mã kiểm thử. |
| **IEEE024** | *Code Generation from Flowchart using Optical Character Recognition & Large Language Model* | **EXCLUDE** | **EC6** / Không thuộc **IC3** | Dùng LLM dịch sơ đồ khối (Flowchart) sang mã nguồn chức năng Python, không sinh mã kiểm thử (Unit test case). |

---

### 4. Phân bổ tài nguyên & Đóng góp nghiên cứu (Notes)
* **Tính sẵn sàng của dữ liệu:** Phân nhánh dữ liệu này lưu trữ độc lập các bài báo khoa học thuộc phân khúc tạp chí và kỷ yếu hội thảo chuyên ngành của hệ thống IEEE Xplore.
* **Đóng góp vào cơ sở dữ liệu chung:** Sau khi trừ đi các bài báo không trùng khớp nội dung dựa trên `ie_criteria.md`, tập dữ liệu đóng góp thêm **19 bài báo độc nhất** có chất lượng cao chuyên sâu về chủ đề LLM tạo Unit Test phục vụ cho sơ đồ PRISMA tổng hợp và bảng trích xuất dữ liệu (Evidence Table) của nhóm `SE1944`.
