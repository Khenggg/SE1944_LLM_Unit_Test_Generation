# Member Audit Against Khang Baseline

Ngày kiểm tra: 2026-06-01.

Chuẩn đối chiếu là folder `Khang/`, vì đây là phần Google Scholar của Khang và đang có đủ cấu trúc theo hướng dẫn: `SLR/` cho quy trình literature review và `experiment/` cho RQ/hypotheses.

## Chuẩn file cần có

| Nhóm file | File chuẩn |
| --- | --- |
| Search và records | `SLR/search-log.md`, `SLR/01_all_records.csv`, `SLR/02_after_screening_v1.csv`, `SLR/03_final_included.csv` |
| Tiêu chí và tổng hợp SLR | `SLR/ie_criteria.md`, `SLR/prisma-flow.md`, `SLR/evidence-table.md`, `SLR/gap-statement.md` |
| Experiment | `experiment/01_rq.md`, `experiment/hypotheses.md` |

## Kết luận nhanh

| Thành viên | Nguồn | Trạng thái so với `Khang/` | Vấn đề chính |
| --- | --- | --- | --- |
| `Khang/` | `origin/Khang` | Đúng chuẩn | Không có lỗi cấu trúc lớn. |
| `pham-an-khang/` | `origin/pham-an-khang` | Đã đúng cấu trúc file chuẩn | Đã chuyển RQ/hypotheses vào `experiment/` và chuẩn hóa tên file trong `SLR/`. Nội dung screening vẫn cần kiểm tra học thuật riêng. |
| `Phuoc/` | `origin/Phuoc` | Chưa đúng chuẩn | Đã thu gọn về arXiv+CORE; còn sai tên `prisma_flow.md`, `evidence_table.csv`, `gap_evidence.md`, và RQ/hypotheses đang nằm ở root. |
| `Nhu-Y/` | `origin/Nhu-Y` | Chưa đúng chuẩn | Đã có `experiment/01_rq.md`, `experiment/hypotheses.md`, và `SLR/gap-statement.md`; còn thiếu `SLR/search-log.md` và `SLR/evidence-table.md` đúng tên chuẩn. |
| `Đỗ Long Vỹ/` | Local upload | Đã đúng tên file chuẩn | Đã đổi tên file trong `SLR/`; `01_all_records.csv` vẫn đang chứa dữ liệu nhiều nguồn, không chỉ IEEE Xplore. |

## Chi tiết từng thành viên

### Khang

| Hạng mục | Kết quả |
| --- | --- |
| File bắt buộc | Đủ 10/10 file chuẩn. |
| `01_all_records.csv` | 41 records, tất cả từ Google Scholar. |
| `02_after_screening_v1.csv` | 41 records: `INCLUDE=19`, `EXCLUDE=17`, `UNSURE=5`. |
| `03_final_included.csv` | 4 records, tất cả `v2_decision=INCLUDE`. |

Kết luận: dùng được làm baseline cấu trúc và baseline cách đặt tên file.

### pham-an-khang

| Hạng mục | Kết quả |
| --- | --- |
| Remote mới nhất | Đã cập nhật từ `origin/pham-an-khang`, commit `5f5131a`. |
| File đúng chuẩn | Đủ 10/10 file chuẩn: `SLR/search-log.md`, `SLR/01_all_records.csv`, `SLR/02_after_screening_v1.csv`, `SLR/03_final_included.csv`, `SLR/ie_criteria.md`, `SLR/prisma-flow.md`, `SLR/evidence-table.md`, `SLR/gap-statement.md`, `experiment/01_rq.md`, `experiment/hypotheses.md`. |
| File thiếu hoặc sai tên | Không còn lỗi tên file/cấu trúc. |
| Experiment | `01_rq.md` và `hypotheses.md` đã nằm trong `experiment/`. |
| `01_all_records.csv` | 17 records, tất cả từ Semantic Scholar. |
| `02_after_screening_v1.csv` | 17 records: `INCLUDE=13`, `EXCLUDE=4`. |
| `03_final_included.csv` | 13 records: `INCLUDE=7`, `EXCLUDE=6`. |

Kết luận: dữ liệu đã được cập nhật theo branch remote mới và cấu trúc file đã được sửa theo chuẩn `Khang/`. Việc còn lại là rà soát học thuật nội dung screening/final included.

### Phuoc

| Hạng mục | Kết quả |
| --- | --- |
| Remote mới nhất | Đã cập nhật từ `origin/Phuoc`, commit `a1992ae`. |
| File đúng chuẩn | `SLR/search-log.md`, `SLR/01_all_records.csv`, `SLR/02_after_screening_v1.csv`, `SLR/03_final_included.csv`, `SLR/ie_criteria.md`. |
| File thiếu hoặc sai tên | `SLR/prisma-flow.md` đang là `SLR/prisma_flow.md`; `SLR/evidence-table.md` đang là `SLR/evidence_table.csv`; `SLR/gap-statement.md` đang là `SLR/gap_evidence.md`. |
| Experiment | `01_rq.md` và `hypotheses.md` đang nằm ở root folder, chưa nằm trong `experiment/`. |
| `01_all_records.csv` | 10 records: arXiv = 9, CORE = 1. |
| `02_after_screening_v1.csv` | 10 records: `INCLUDE=9`, `UNSURE=1`. |
| `03_final_included.csv` | 10 records, chưa có cột `v2_decision`; PRISMA/evidence nói final included nên là 9. |

Kết luận: Phước đã chuyển từ bộ tổng hợp nhiều nguồn sang scope cá nhân arXiv+CORE, nên đúng hướng hơn. Việc còn lại là chuẩn hóa tên file, chuyển RQ/hypotheses vào `experiment/`, và làm cho `03_final_included.csv` khớp với PRISMA/evidence table.

### Nhu-Y

| Hạng mục | Kết quả |
| --- | --- |
| Remote mới nhất | Đã cập nhật từ `origin/Nhu-Y`, commit `d239a98`. |
| File đúng chuẩn | `SLR/01_all_records.csv`, `SLR/02_after_screening_v1.csv`, `SLR/03_final_included.csv`, `SLR/ie_criteria.md`, `SLR/prisma-flow.md`, `SLR/gap-statement.md`, `experiment/01_rq.md`, `experiment/hypotheses.md`. |
| File thiếu hoặc sai tên | `SLR/search-log.md` đang là `SLR/search_log_ACM Digital Library.csv`; `SLR/evidence-table.md` đang là `SLR/evidence_table.md`. |
| Experiment | Đã có `experiment/01_rq.md` và `experiment/hypotheses.md`. |
| `01_all_records.csv` | 11 records; header còn thiếu `database`, `doi`, `url` so với Khang. |
| `02_after_screening_v1.csv` | 11 records: `INCLUDE=11`. |
| `03_final_included.csv` | 11 records: `v2_decision=Include`; nên đổi về `INCLUDE` để đồng bộ casing. |

Kết luận: bản mới từ remote đã tốt hơn vì có `experiment/` và `gap-statement.md`, nhưng vẫn cần chuẩn hóa tên file trong `SLR/` và chuẩn hóa tên/cột CSV.

### Đỗ Long Vỹ

| Hạng mục | Kết quả |
| --- | --- |
| Nguồn | Folder local do Khang đưa vào vì thành viên không dùng GitHub. |
| File đúng chuẩn | Đủ 10/10 file chuẩn: `SLR/search-log.md`, `SLR/01_all_records.csv`, `SLR/02_after_screening_v1.csv`, `SLR/03_final_included.csv`, `SLR/ie_criteria.md`, `SLR/prisma-flow.md`, `SLR/evidence-table.md`, `SLR/gap-statement.md`, `experiment/01_rq.md`, `experiment/hypotheses.md`. |
| File thiếu hoặc sai tên | Không còn lỗi tên file/cấu trúc. |
| `01_all_records.csv` | 130 records từ nhiều nguồn, không chỉ IEEE Xplore. |
| `02_after_screening_v1.csv` | 70 records: `INCLUDE=43`, `EXCLUDE=18`, `UNSURE=9`. |
| `03_final_included.csv` | 23 records: `INCLUDE=12`, `EXCLUDE=5`, `UNSURE=2`, blank `v2_decision=4`. |

Kết luận: folder đã đúng chuẩn đặt tên. Điểm cần kiểm tra kỹ là dữ liệu vẫn đang chứa nhiều nguồn trong khi search log nói về IEEE Xplore.

## Việc nên sửa tiếp

1. Chuẩn hóa tiếp `Phuoc/` và `Nhu-Y/` theo đúng `Khang/` trước khi merge evidence.
2. Không gộp evidence vào `evidence-table-merged.md` khi chưa xác nhận DOI/title và paper gốc.
3. Với `Phuoc/` và `Đỗ Long Vỹ/`, cần xác nhận lại nguồn phụ trách để tránh một người chứa toàn bộ records của nhóm.
4. Với `Nhu-Y/`, cần bổ sung `database`, `doi`, `url` nếu có, và đồng bộ decision casing thành `INCLUDE`.
