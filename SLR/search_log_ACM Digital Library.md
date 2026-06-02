# Search Log – LLM-based Unit Test Generation

**Thành viên:** Person 3  
**Ngày thực hiện:** 2026-06-02

---

## Chuỗi tìm kiếm (Query Strings)

### String A

**Query nguyên văn:**

('large language model' OR 'LLM' OR 'GPT' OR 'ChatGPT')  
AND ('unit test generation' OR 'test case generation' OR 'automated unit testing')  
AND ('branch coverage' OR 'code coverage' OR 'mutation score' OR 'mutation testing')

**Database:** ACM Digital Library  
**Bộ lọc:** Publication year 2018 trở đi; Content type: Research Article, Conference Paper; Subject ưu tiên Software Engineering hoặc Computing Methodologies  
**Ngày search:** 2026-06-02  
**Số kết quả:** 9 records collected via web search on ACM Digital Library  
**Người thực hiện:** Person 3  
**Ghi chú:** ACM Boolean query dài có thể không ổn định, nên dùng thêm biến thể ngắn: `large language model unit test generation`, `LLM unit test generation mutation score`, `unit test generation large language models branch coverage`. Các paper nổi bật tìm được gồm: Evaluating and Improving ChatGPT for Unit Test Generation; Automated Unit Test Generation via Chain-of-Thought Prompting; HITS; Using Large Language Models to Generate JUnit Tests; PRIMG.

---

### String B

**Query nguyên văn:**

('GPT' OR 'ChatGPT' OR 'large language model')  
AND ('JUnit' OR 'pytest' OR 'unit test')  
AND ('test generation' OR 'automated test generation')

**Database:** ACM Digital Library  
**Bộ lọc:** Publication year 2018 trở đi; Content type: Research Article, Conference Paper; Subject ưu tiên Software Engineering hoặc Computing Methodologies  
**Ngày search:** 2026-06-02  
**Số kết quả:** 6 records collected via web search on ACM Digital Library  
**Người thực hiện:** Person 3  
**Ghi chú:** Dùng thêm biến thể ngắn: `GPT automated test generation`, `ChatGPT unit test generation`, `large language models JUnit tests`. Một số kết quả liên quan trực tiếp đến ChatGPT/JUnit/unit test generation.

---

### String C

**Query nguyên văn:**

('large language model' OR 'GPT')  
AND ('software testing' OR 'unit testing')  
AND ('mutation testing' OR 'coverage')

**Database:** ACM Digital Library  
**Bộ lọc:** Publication year 2018 trở đi; Content type: Research Article, Conference Paper; Subject ưu tiên Software Engineering hoặc Computing Methodologies  
**Ngày search:** 2026-06-02  
**Số kết quả:** 5 records collected via web search on ACM Digital Library  
**Người thực hiện:** Person 3  
**Ghi chú:** Dùng thêm biến thể ngắn: `LLM unit testing coverage mutation`, `large language model software testing mutation testing`, `ChatGPT unit test generation coverage`.

---

## Tổng hợp trước dedup

| Database             | String   | Kết quả |
| -------------------- | -------- | ------: |
| ACM Digital Library  | String A |       9 |
| ACM Digital Library  | String B |       6 |
| ACM Digital Library  | String C |       5 |
| **Tổng trước dedup** |          |  **20** |

| Mục                                     | Số lượng |
| --------------------------------------- | -------: |
| Tổng trước dedup                        |       20 |
| Số bị loại do trùng lặp giữa các string |        6 |
| **Sau dedup**                           |   **14** |

---

## Các paper ACM liên quan đã phát hiện

|   # | Paper                                                                                            |  Năm | DOI/URL                                 | Ghi chú                                                      |
| --: | ------------------------------------------------------------------------------------------------ | ---: | --------------------------------------- | ------------------------------------------------------------ |
|   1 | Evaluating and Improving ChatGPT for Unit Test Generation                                        | 2024 | https://doi.org/10.1145/3660783         | Rất liên quan: ChatGPT, unit test generation, coverage       |
|   2 | Automated Unit Test Generation via Chain-of-Thought Prompting and Focal Context                  | 2025 | https://doi.org/10.1145/3745765         | Rất liên quan: LLM, prompting, branch coverage               |
|   3 | Using Large Language Models to Generate JUnit Tests: An Empirical Study                          | 2024 | https://doi.org/10.1145/3661167.3661216 | Rất liên quan: JUnit, Codex, GPT-3.5, StarCoder              |
|   4 | HITS: High-coverage LLM-based Unit Test Generation via Method Slicing                            | 2024 | https://doi.org/10.1145/3691620.3695501 | Rất liên quan: high coverage, unit test generation           |
|   5 | On the Evaluation of Large Language Models in Unit Test Generation                               | 2024 | https://doi.org/10.1145/3691620.3695529 | Rất liên quan: evaluation, LLM, unit test generation         |
|   6 | PRIMG: Efficient LLM-driven Test Generation Using Mutant Production and Integration              | 2025 | https://doi.org/10.1145/3756681.3756991 | Rất liên quan: mutation testing, LLM-driven test generation  |
|   7 | An Initial Investigation of ChatGPT Unit Test Generation Capability                              | 2023 | https://doi.org/10.1145/3624032.3624035 | Rất liên quan: ChatGPT, unit test generation, mutation score |
|   8 | Code-Aware Prompting: A Study of Coverage-Guided Test Generation in Regression Setting using LLM | 2024 | https://doi.org/10.1145/3643769         | Liên quan: coverage-guided test generation                   |
|   9 | Optimizing Search-Based Unit Test Generation with Large Language Models                          | 2024 | https://doi.org/10.1145/3671016.3674813 | Liên quan: SBST + LLM                                        |
|  10 | Automated Unit Test Improvement using Large Language Models at Meta                              | 2024 | https://doi.org/10.1145/3663529.3663839 | Liên quan: unit test improvement, LLM                        |
|  11 | Mutation-Guided LLM-based Test Generation at Meta                                                | 2025 | https://doi.org/10.1145/3696630.3728544 | Liên quan mạnh: mutation-guided test generation              |
|  12 | Structured Prompting for LLM-Based Unit Test Generation                                          | 2025 | https://doi.org/10.1145/3779657.3779658 | Liên quan: prompting, LLM, unit test generation              |
|  13 | Benchmarking LLMs for Unit Test Generation from Real-world Code                                  | 2026 | https://doi.org/10.1145/3805043         | Liên quan: benchmark, branch coverage, mutation score        |
|  14 | Incorporating Program Analysis with Large Language Models for Automatic Test Generation          | 2025 | https://doi.org/10.1145/3748505         | Liên quan: program analysis, LLM, test generation            |

---

## Phần S – Cross-reference Search (Snowballing)

> Snowballing không có query string — không điền vào mục này như String A/B/C.

**Phương pháp:** Backward snowballing – đọc reference list của các paper đã pass V2 screening.  
**Thực hiện:** Sau khi hoàn thành search trên ACM Digital Library, kiểm tra reference list của các paper included.  
**Công cụ:** CrossRef để lookup metadata từ DOI; Google Scholar để kiểm tra citation và full text nếu cần.  
**Ngày thực hiện:** Chưa thực hiện  
**Paper included đã scan:** 0 papers  
**Paper mới phát hiện:** 0 papers pass IC

---

## Ghi chú

- Search được thực hiện trên ACM Digital Library thông qua các truy vấn liên quan đến LLM/GPT, unit test generation, automated test generation, coverage và mutation testing.
- Nếu ACM Digital Library không nhận Boolean query dài, sử dụng các biến thể ngắn:
  - `large language model unit test generation`
  - `GPT automated test generation`
  - `LLM unit testing coverage mutation`
- Các paper được chọn vì liên quan đến test generation, unit testing, LLM/GPT, coverage, mutation testing hoặc benchmark testing.
- Nếu paper ACM trùng với Google Scholar hoặc IEEE, vẫn ghi vào `raw_records_acm.csv` và thêm ghi chú `potential duplicate`.
- Dedup chính thức sẽ thực hiện ở Phase 2, không xóa paper trùng trong raw file của ACM.
- Số lượng trong log này là số records thu thập được qua web search trên ACM Digital Library; khi chạy trực tiếp trên giao diện ACM, cần thay bằng số results chính thức sau filter nếu người hướng dẫn yêu cầu.
