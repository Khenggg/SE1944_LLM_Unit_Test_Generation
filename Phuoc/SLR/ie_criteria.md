# IE Criteria – LLM for Unit Test Case Generation
**Thành viên:** Huỳnh Cao Phước
**RQ:** "Đối với Java/Python functions ở cyclomatic complexity trung bình, GPT-4/GPT-4o tự động sinh unit test cases so với test cases viết thủ công bởi sinh viên có đạt branch coverage >= 30.22% và mutation score >= 35.3% không?"
**PICO:** P=Java/Python functions ở cyclomatic complexity trung bình | I=GPT-4/GPT-4o tự động sinh unit test cases | C=Test cases viết thủ công bởi sinh viên | O=Branch coverage >= 30.22% và mutation score >= 35.3%

---

## Inclusion Criteria (IC) – paper PHẢI có đủ tất cả

| Mã | Tiêu chí |
|----|----------|
| **IC-L** | Viết bằng tiếng Anh |
| **IC-Y** | Xuất bản từ 2020 đến nay – Lý do: Các LLM (như GPT-3) thế hệ mới bắt đầu được ứng dụng rộng rãi và tối ưu hóa cho tác vụ Software Engineering từ năm 2020. |
| **IC-T** | Đăng trên conference hoặc journal – không phải blog, thesis, hay báo cáo kỹ thuật |
| **IC-P** | Về task: sinh unit test case tự động (ở cấp độ method, function, class) cho mã nguồn |
| **IC-I** | Dùng kỹ thuật: mô hình ngôn ngữ lớn (LLM, GPT, hoặc tương đương) |
| **IC-E** | Có ít nhất 1 con số kết quả trong Table hoặc Figure của paper gốc |

## Exclusion Criteria (EC) – loại nếu BẤT KỲ điều kiện nào đúng

| Mã | Tiêu chí |
|----|----------|
| **EC-D** | Trùng lặp với paper đã có trong danh sách |
| **EC-A** | Không truy cập được full-text |
| **EC-S** | Dưới 4 trang (extended abstract, poster, short paper) |
| **EC-N** | Không có thực nghiệm (position paper, vision paper, tutorial) |
| **EC-O** | Không về topic: fuzzer seed generation, UI testing, debugging, hoặc code generation đơn thuần mà không sinh test suite |
