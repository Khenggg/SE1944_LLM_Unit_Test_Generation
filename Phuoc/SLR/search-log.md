# Search Log - LLM for Unit Test Case Generation

**Thành viên:** Phuoc

**Nguồn phụ trách:** OpenAlex

**Ngày thực hiện:** 2026-05-02

## Query Strings

### String A

```text
('large language model' OR 'LLM' OR 'GPT' OR 'ChatGPT')
AND ('unit test generation' OR 'test case generation' OR 'automated unit testing')
AND ('branch coverage' OR 'code coverage' OR 'mutation score' OR 'mutation testing')
```

## Search Execution Log

| Database | String | Date | Raw search hits | Notes |
| --- | --- | --- | ---: | --- |
| OpenAlex | String A | 2026-05-02 | 119 | Search query executed on OpenAlex API; 67 records passed completeness criteria and were selected/exported |

## Tổng hợp trước dedup

| Database | String | Kết quả |
| --- | --- | ---: |
| OpenAlex | String A | 119 |
| **Tổng raw search hits** | | **119** |
| **Records selected/exported before dedup** | | **67** |
| **Sau dedup** | | **51** |
| **Số bị loại do trùng** | | **16** |

## Screening Execution Logs

### Vòng 1: Title + Abstract Screening (`02_after_screening_v1.csv`)

| Quyết định | Số lượng | Mô tả lý do phân loại |
| --- | ---: | --- |
| **INCLUDE** | 36 | Các bài báo nghiên cứu trực tiếp về việc sử dụng LLM để sinh unit test cho Java/Python và có nhắc đến việc đo lường độ phủ hoặc điểm đột biến (mutation score) trong tóm tắt. |
| **EXCLUDE** | 11 | Bị loại trừ do vi phạm các tiêu chí loại trừ rõ ràng: viết bằng ngôn ngữ khác tiếng Anh (Thụy Điển, Pháp, Indonesia, Ukraina - vi phạm IC1), đánh giá trên đối tượng ngôn ngữ khác Java/Python như C/C++ hay smart contract/Solidity (vi phạm IC6), hoặc chỉ tập trung vào sinh seed fuzzing chứ không phải unit test (vi phạm EC4/EC3). |
| **UNSURE** | 4 | Các nghiên cứu về nền tảng/nền móng kiểm thử hoặc sinh testcase phát hiện lỗ hổng bảo mật chưa rõ ngôn ngữ kiểm thử hoặc các metrics đo lường; được giữ lại để đọc full-text ở vòng 2 theo nguyên tắc không loại nhầm. |
| **Tổng cộng** | **51** | |

### Vòng 2: Full-Text Screening (`03_final_included.csv`)

| Quyết định | Số lượng | Mô tả lý do phân loại |
| --- | ---: | --- |
| **INCLUDE** | 7 | Các nghiên cứu chất lượng cao nhất, thỏa mãn đầy đủ tất cả các khía cạnh của câu hỏi nghiên cứu PICO: sinh unit test Java/Python bằng LLM (như GPT-4), đánh giá thực nghiệm chặt chẽ đo lường cả **branch coverage** (độ bao phủ nhánh) và **mutation score** (điểm đột biến), có so sánh đối chứng với kiểm thử thủ công hoặc các công cụ SBST (như EvoSuite, Pynguin). |
| **EXCLUDE** | 33 | Các bài báo mặc dù liên quan đến LLM và unit testing nhưng bị loại ở vòng này do thiếu sót các yếu tố cốt lõi: chỉ đo line/statement coverage mà hoàn toàn không đo mutation score; chỉ phân tích lý thuyết/khảo sát (survey) không có thực nghiệm đo lường trực tiếp; hoặc kiểm thử mức hệ thống/tích hợp không khớp với mục tiêu unit testing. |
| **Tổng cộng** | **40** | (Đánh giá trên nhóm INCLUDE + UNSURE từ vòng 1) |

## Ghi chú & Giải thích kết quả

- **Vì sao tỷ lệ loại ở Vòng 2 cao (33/40)?**  
  Mặc dù từ khóa tìm kiếm (String A) chứa cả cụm từ coverage và mutation, nhiều bài báo chỉ đề cập đến các từ khóa này trong phần tổng quan hoặc hướng đi tương lai (future work) chứ không thực sự triển khai thực nghiệm đo lường cả hai chỉ số này trên Java/Python. Khi đọc kỹ toàn văn (full-text), hầu hết các bài bị loại chỉ tập trung tối ưu hóa độ phủ dòng lệnh (statement/line coverage) mà bỏ qua chỉ số quan trọng hơn là hiệu quả phát hiện lỗi thông qua điểm đột biến (mutation score).
- **Tính chất lượng của 7 paper được chọn:**  
  7 nghiên cứu được giữ lại cuối cùng (`OA002`, `OA013`, `OA015`, `OA020`, `OA024`, `OA034`, `OA048`) đại diện cho các nghiên cứu thực nghiệm chuẩn mực nhất hiện nay, cung cấp dữ liệu đối sánh trực tiếp về cả branch coverage và mutation score giữa LLM-generated tests và manual/SBST tests, trả lời trực tiếp cho câu hỏi nghiên cứu PICO đặt ra.
