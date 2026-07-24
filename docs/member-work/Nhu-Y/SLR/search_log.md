# Search Log – LLM-based Unit Test Generation

**Thành viên:** Nguyen Nhu Y
**Ngày thực hiện:** 2026-06-02

---

## Chuỗi tìm kiếm (Query Strings)

### String A

**Query nguyên văn:**

('large language model' OR 'LLM' OR 'GPT' OR 'ChatGPT')
AND ('unit test generation' OR 'test case generation' OR 'automated unit testing')
AND ('branch coverage' OR 'code coverage' OR 'mutation score' OR 'mutation testing')

**Database:** ACM Digital Library  
**Bộ lọc:** Year 2018–2026, Research Article + Conference Paper, Software Engineering / Computing Methodologies nếu phù hợp  
**Ngày search:** 2026-06-02  
**Số kết quả:** 9 papers

---

### String B

**Query nguyên văn:**

('GPT' OR 'ChatGPT' OR 'large language model')
AND ('JUnit' OR 'pytest' OR 'unit test')
AND ('test generation' OR 'automated test generation')

**Database:** ACM Digital Library  
**Bộ lọc:** Year 2018–2026, Research Article + Conference Paper, Software Engineering / Computing Methodologies nếu phù hợp  
**Ngày search:** 2026-06-02  
**Số kết quả:** 6 papers

---

### String C

**Query nguyên văn:**

('large language model' OR 'GPT')
AND ('software testing' OR 'unit testing')
AND ('mutation testing' OR 'coverage')

**Database:** ACM Digital Library  
**Bộ lọc:** Year 2018–2026, Research Article + Conference Paper, Software Engineering / Computing Methodologies nếu phù hợp  
**Ngày search:** 2026-06-02  
**Số kết quả:** 5 papers

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

## Verify và cập nhật paper không từ ACM

Các paper không lấy từ ACM Digital Library đã được kiểm tra lại metadata và mức độ liên quan với topic.

| Source                      | Số paper đã kiểm tra | Trạng thái  | Ghi chú                                                                |
| --------------------------- | -------------------: | ----------- | ---------------------------------------------------------------------- |
| Google Scholar              |                    4 | Verified    | Đã kiểm tra DOI/URL, title, year, venue, abstract và mức độ liên quan  |
| IEEE Xplore                 |                   19 | Verified    | Đã kiểm tra DOI, title, year, venue, metric và loại paper trùng nếu có |
| **Tổng paper không từ ACM** |               **23** | **Updated** | Đã cập nhật lại vào records chung                                      |

**Cách verify:**

- Kiểm tra DOI hoặc URL chính thức của từng paper.
- Đối chiếu lại title, authors, year và venue.
- Kiểm tra abstract để đảm bảo paper liên quan đến LLM/GPT, unit test generation, automated test generation, coverage, mutation score hoặc mutation testing.
- Paper bị trùng giữa ACM, Google Scholar hoặc IEEE không xóa ở raw records; ghi chú `potential duplicate`.
- Các paper hợp lệ được cập nhật vào `01_all_records.csv`.

**Kết quả verify:**

| Mục                                          |                     Số lượng |
| -------------------------------------------- | ---------------------------: |
| Paper không từ ACM đã kiểm tra               |                           23 |
| Paper hợp lệ giữ lại                         |                           23 |
| Paper bị loại vì sai topic / thiếu thông tin |                            0 |
| Paper nghi trùng với ACM hoặc nguồn khác     | Ghi chú trong `notes` nếu có |

---

## Tổng hợp records hiện tại

| Source                        | Số paper sau kiểm tra |
| ----------------------------- | --------------------: |
| ACM Digital Library           |                    14 |
| Google Scholar                |                     4 |
| IEEE Xplore                   |                    19 |
| **Tổng records sau kiểm tra** |                **37** |

> Lưu ý: Tổng 37 là số records sau khi kiểm tra theo từng nguồn. Dedup liên nguồn chính thức sẽ được thực hiện ở Phase 2 bằng DOI, title và venue.

---

## Phần S – Cross-reference Search (Snowballing)

> Snowballing không có query string – không điền vào mục này như các String A/B/C.

**Phương pháp:** Backward snowballing – đọc reference list của các paper đã pass V2 screening.  
**Thực hiện:** Sau khi có `03_final_included.csv`, đọc reference list của từng paper included.  
**Công cụ:** CrossRef để lookup metadata từ DOI; Google Scholar để check citation/full text nếu cần.  
**Ngày thực hiện:** Chưa thực hiện  
**Paper included đã scan:** 0 paper  
**Paper mới phát hiện:** 0 paper pass IC

> **Lưu ý:** Snowballing chỉ làm sau khi hoàn thành tất cả database search. Paper tìm được từ snowballing sẽ được ghi riêng và đối chiếu trùng lặp ở Phase 2.

---

## Ghi chú

- Thực hiện search trên ACM Digital Library bằng String A, String B và String C.
- Nếu ACM Digital Library không nhận Boolean query dài, sử dụng các biến thể ngắn:
  - `large language model unit test generation`
  - `GPT automated test generation`
  - `LLM unit testing coverage mutation`
- Bộ lọc sử dụng: Year 2018–2026, Research Article + Conference Paper, Software Engineering / Computing Methodologies nếu phù hợp.
- Paper được chọn nếu liên quan đến LLM/GPT, unit test generation, automated test generation, code coverage, branch coverage, mutation score, mutation testing hoặc benchmark testing.
- Các paper không từ ACM gồm Google Scholar và IEEE Xplore đã được verify và cập nhật lại vào records chung.
- Paper trùng với Google Scholar/IEEE vẫn được giữ trong raw records và ghi chú `potential duplicate`.
- Dedup chính thức thực hiện ở Phase 2 bằng Zotero / Excel / kiểm tra DOI và title.
