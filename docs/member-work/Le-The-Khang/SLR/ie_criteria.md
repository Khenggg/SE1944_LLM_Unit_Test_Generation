# IE Criteria – LLM for Unit Test Case Generation

**Thành viên:** Khang
**RQ:** "For Java/Python functions or classes with medium cyclomatic complexity (approximately CC = 5-15 where measurable), do GPT-4o (gpt-4o-2024-05-13) generated unit tests achieve literature-backed branch coverage >= 30.22% and mutation-score >= 4% (strict floor) and >= 40.21% (scientific reference target), and how do they compare with student-written coursework tests on the same code units?"
**PICO:** P=Java/Python functions/classes (CC=5-15) | I=GPT-4o (gpt-4o-2024-05-13) zero-shot | C=student coursework tests & literature thresholds | O=branch coverage & mutation score

---

## Inclusion Criteria (IC) – paper PHẢI có đủ tất cả

| Mã | Tiêu chí |
| :--- | :--- |
| **IC-L** | Viết bằng tiếng Anh |
| **IC-Y** | Xuất bản từ 2019 đến nay – Lý do: Các mô hình ngôn ngữ lớn (LLM) bắt đầu bùng nổ và được áp dụng vào SE từ năm 2019 (với sự ra đời của GPT-2 và các mô hình Transformer). |
| **IC-T** | Đăng trên conference hoặc journal – không phải blog, thesis, hay báo cáo kỹ thuật. |
| **IC-P** | Về task: Tự động sinh test case hoặc unit test từ mã nguồn (source code) hoặc đặc tả yêu cầu (requirements). |
| **IC-I** | Dùng kỹ thuật: Các mô hình ngôn ngữ lớn (LLMs), AI-based hoặc NLP (bao gồm GPT, ChatGPT, Codex, LLaMA, Claude, DeepSeek và các biến thể). |
| **IC-E** | Có ít nhất 1 con số kết quả trong Table hoặc Figure của bài báo gốc (như độ bao phủ, điểm đột biến, tỷ lệ biên dịch). |

## Exclusion Criteria (EC) – loại nếu BẤT KỲ điều kiện nào đúng

| Mã | Tiêu chí |
| :--- | :--- |
| **EC-D** | Trùng lặp với paper đã có trong danh sách. |
| **EC-A** | Không truy cập được full-text. |
| **EC-S** | Dưới 4 trang (extended abstract, poster, short paper). |
| **EC-N** | Không có thực nghiệm (position paper, vision paper, tutorial, survey, review). |
| **EC-O** | Không về topic: Sinh mã nguồn ứng dụng (production code generation) không liên quan đến test; sửa lỗi tự động (automated program repair) hoặc debug tự động (automated debugging) mà không có phần sinh unit test mới. |
