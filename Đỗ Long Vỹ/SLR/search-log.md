# BÁO CÁO KẾT QUẢ TÌM KIẾM TÀI LIỆU (SEARCH LOG)

**Đề tài:** LLM for Unit Test Case Generation  
**Thành viên thực hiện:** Đỗ Long Vỹ  
**Nguồn dữ liệu:** IEEE Xplore  
**Ngày thực hiện:** 01/06/2026  

---

### 1. Chuỗi truy vấn (Query String)
* **Chuỗi áp dụng:** String A - Rút gọn (String A - simplified)
* **Context gốc của chuỗi:** Định hướng tìm kiếm tập trung vào sự kết hợp giữa các mô hình ngôn ngữ lớn (`large language model`, `LLM`, `GPT`, `ChatGPT`) với việc tạo kiểm thử tự động (`unit test generation`, `test case generation`) và các chỉ số đo lường độ bao phủ/đột biến (`code coverage`, `mutation testing`).

---

### 2. Nhật ký thực thi tìm kiếm (Search Execution Log)

| Nguồn dữ liệu | Chuỗi truy vấn | Ngày thực hiện | Số kết quả thô được chọn | Ghi chú thực thi |
| :--- | :--- | :---: | :---: | :--- |
| **IEEE Xplore** | String A - simplified | 01/06/2026 | 25 | Trích xuất và sàng lọc thủ công 25 bản ghi lưu vào tệp `raw_records_ieee_xplore.csv`. Toàn bộ dữ liệu trường tóm tắt (Abstract) được giữ nguyên bản; trạng thái đọc toàn văn (full text) hiện tại là chưa kiểm tra. |

---

### 3. Số liệu tổng hợp và Sàng lọc sơ bộ (Sifting Metrics)
Dựa trên dữ liệu thô được cung cấp, một quy trình phân loại sơ bộ (Sifting) đã được thực hiện để đánh giá độ liên quan của bài báo dựa trên tiêu đề (Title) và tóm tắt (Abstract):
* **Tổng số bài được chọn ban đầu (Exported before screening):** 25 bài (Từ mã `IEEE001` đến `IEEE025`).
* **Số bài Hợp lệ (Đúng tiêu chí Software Testing + LLM):** 19 bài.
* **Số bài đề xuất Loại (Sai lệch đối tượng/phạm vi nghiên cứu):** 6 bài.

#### Chi tiết các bài báo bị loại và lý do hệ thống:
* **IEEE020:** *Test Data Generation for Dynamic Unit Test in Java Language using Genetic Algorithm (2021)***Lý do:** Sử dụng Thuật toán di truyền (Genetic Algorithm), không áp dụng công nghệ LLM.
* **IEEE021:** *Enhancing web UX Test Coverage Through Model-Based Practices: State Machine Driven Test Auto-Generation (2024) **Lý do:** Kiểm thử dựa trên mô hình (Model-based / State Machine), không áp dụng LLM.
* **IEEE022:** *LLM-SRAF: Sub-Resolution Assist Feature Generation Using Large Language Model (2025)***Lý do:** Áp dụng LLM vào mảng thiết kế vi mạch/quang khắc bán dẫn (Lithography), không thuộc Software Testing.
* **IEEE023:** *Large Language Model with Federated Retrieval-Augmented Generation for Improved Knowledge Retrieval***Lý do:** Nghiên cứu thuần về tối ưu hóa kiến trúc RAG phân tán, không liên quan đến việc tạo Test case.
* **IEEE024:** *Code Generation from Flowchart using Optical Character Recognition & Large Language Model***Lý do:** Chuyển đổi hình ảnh sơ đồ khối (Flowchart) thành mã nguồn Python chức năng, không tạo mã kiểm thử (Unit test).
* **IEEE013:** *Large Language Models for Printed Circuit Board Test Generation (2025)***Lý do (Cân nhắc loại):** Ứng dụng LLM tạo kịch bản kiểm thử bo mạch phần cứng (PCB), cần loại bỏ nếu phạm vi đề tài của nhóm chỉ giới hạn ở Công nghệ phần mềm.

---

### 4. Ghi chú và Phân bổ tài nguyên (Notes)
* **Tính sẵn sàng của dữ liệu:** Nhánh dữ liệu này lưu trữ độc lập các bài báo khoa học thuộc phân khúc tạp chí và kỷ yêu hội thảo chuyên ngành của hệ thống IEEE Xplore.
* **Đóng góp vào cơ sở dữ liệu chung:** Sau khi trừ đi 6 bài báo không trùng khớp nội dung, tập dữ liệu đóng góp thêm **19 bài báo độc nhất** có chất lượng cao chuyên sâu về chủ đề LLM tạo Unit Test phục vụ cho sơ đồ PRISMA tổng hợp của nhóm.
