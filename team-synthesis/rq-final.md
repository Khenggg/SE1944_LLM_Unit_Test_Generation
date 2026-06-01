# Câu Hỏi Nghiên Cứu Cuối Cùng

## Chủ Đề

LLM for Unit Test Case Generation.

## Câu Hỏi Nghiên Cứu Chính

Đối với các Java/Python functions có cyclomatic complexity trung bình, unit tests do GPT-4/GPT-4o sinh ra có đạt branch coverage >=80% và mutation score >=60% không, và kết quả đó so với unit tests do sinh viên viết trên cùng functions như thế nào?

## Câu Hỏi Phụ

| RQ | Câu hỏi | Metric chính |
| --- | --- | --- |
| RQ1 | Unit tests do GPT-4/GPT-4o sinh ra có đạt branch coverage >=80% trên các Java/Python functions được chọn không? | Branch coverage |
| RQ2 | Unit tests do GPT-4/GPT-4o sinh ra có đạt mutation score >=60% trên cùng các functions đó không? | Mutation score |
| RQ3 | Unit tests do GPT-4/GPT-4o sinh ra có khác biệt có ý nghĩa thống kê so với unit tests do sinh viên viết về branch coverage và mutation score không? | Chênh lệch theo cặp |
| RQ4 | Những dạng lỗi nào khiến unit tests do GPT-4/GPT-4o sinh ra không đạt các ngưỡng trên? | Compile/pass status; phân tích lỗi định tính |

## PICO

| Thành phần | Nội dung |
| --- | --- |
| P - Population | Java/Python functions hoặc methods có cyclomatic complexity trung bình, lý tưởng là CC = 5-15. |
| I - Intervention | Unit tests do GPT-4/GPT-4o sinh ra bằng một prompt protocol cố định. |
| C - Comparison | Unit tests do sinh viên viết cho cùng các functions. |
| O - Outcome | Branch coverage >=80%, mutation score >=60%, compile/pass status và so sánh theo cặp với student-written tests. |

## Metric / Threshold

| Metric | Ngưỡng / cách dùng | Công cụ gợi ý |
| --- | --- | --- |
| Branch coverage | Ngưỡng chính: >=80% | JaCoCo cho Java; coverage.py/pytest-cov cho Python |
| Mutation score | Ngưỡng chính: >=60% | PIT/PiTest cho Java; mutmut/cosmic-ray/MutPy cho Python |
| Compile/pass status | Tests phải compile và chạy được trước khi coverage/mutation score được xem là đáng tin | Maven/Gradle/pytest test runner |
| Chênh lệch theo cặp | So sánh GPT-generated tests với student-written tests trên cùng functions | Kiểm định thống kê theo cặp |

## Quyết Định Phạm Vi

Bảng evidence merged cho thấy các kết quả tốt nhất thường đến từ GPT-4/GPT-4o hoặc các LLM pipeline có feedback loop. Vì vậy RQ final dùng `GPT-4/GPT-4o-generated unit tests` thay vì chỉ nói chung là `LLM-generated tests`. Nếu nhóm không có quyền dùng GPT-4o khi chạy thực nghiệm, cần thay tên intervention bằng model thực tế trước khi nộp báo cáo.
