# Phuoc and Do Long Vy Content Audit

Ngày kiểm tra: 2026-06-01.

Các lỗi chỉ do tên file/cấu trúc đã được sửa và không tính là vấn đề nội dung trong bảng dưới đây.

| Thành viên | Phạm vi hiện tại | Đã đầy đủ/đúng | Thiếu hoặc lệch nội dung còn lại | Mức độ | Cần làm tiếp |
| --- | --- | --- | --- | --- | --- |
| `Phuoc/` | arXiv + CORE. `01_all_records.csv` có 10 records: arXiv = 9, CORE = 1. | Đủ 10/10 file chuẩn; search log có nguồn, ngày, query, số kết quả ban đầu và số records chọn lọc; PRISMA nói 10 records, V1 include 9 + unsure 1, final included 9; evidence table có 9 papers. | `03_final_included.csv` vẫn có 10 rows và chưa có các cột `v2_decision`, `v2_reason`, `reviewer`; vì PRISMA/evidence nói final included = 9 nên file final đang lệch 1 record. | Cao | Thêm cột V2 hoặc lọc `03_final_included.csv` chỉ còn 9 paper final; nếu giữ 10 rows thì phải đánh dấu AX008 là `EXCLUDE` và ghi lý do V2 rõ ràng. |
| `Phuoc/` | arXiv + CORE. | GAP đã nêu được metric gap, dataset gap, comparison gap và student baseline gap. | GAP/evidence nên trích dẫn nhất quán đúng 9 paper final; hiện cần kiểm tra lại xem các kết luận trong GAP có dựa trên 9 rows của evidence table hay còn dùng ghi chú rộng hơn từ 10 candidates. | Trung bình | Đối chiếu từng mã AX/CORE trong `gap-statement.md` với `evidence-table.md`, bỏ các paper không nằm trong final included nếu có. |
| `Đỗ Long Vỹ/` | IEEE Xplore. `01_all_records.csv` có 25 records, tất cả IEEE Xplore. | Đủ 10/10 file chuẩn; V1 hợp lý: `INCLUDE=19`, `EXCLUDE=5`, `UNSURE=1`; PRISMA nói final included = 5; `03_final_included.csv` có 5 records, đều IEEE Xplore. | `03_final_included.csv` chưa có các cột `v2_decision`, `v2_reason`, `reviewer`; hiện không thể biết lý do V2 của 5 paper final trực tiếp từ CSV. | Trung bình | Bổ sung `v2_decision=INCLUDE`, `v2_reason`, `reviewer` cho 5 rows final. |
| `Đỗ Long Vỹ/` | IEEE Xplore. | Search log và PRISMA đã khớp scope IEEE và số records 25 -> 20 full-text/final prioritization -> 5 final. | `evidence-table.md` chỉ có 2 papers, trong khi PRISMA và `03_final_included.csv` nói final included = 5. | Cao | Bổ sung extraction cho đủ 5 papers final hoặc giảm PRISMA/final CSV xuống đúng 2 nếu chỉ thật sự dùng 2 paper. |
| `Đỗ Long Vỹ/` | IEEE Xplore. | GAP có nêu metric gap, dataset gap, comparison gap. | GAP đang mở đầu theo 19 paper V1 included, trong khi evidence table hiện chỉ có 2 paper và final included là 5. GAP nên dựa trên final included/evidence table, không dựa trên V1 rộng hơn nếu chưa trích xuất đủ evidence. | Cao | Sau khi evidence table đủ 5 paper, sửa `gap-statement.md` để số lượng và bằng chứng khớp với 5 final papers. |

## Kết luận

- `Phuoc/` hiện gần đạt: cấu trúc đúng, scope rõ, evidence đủ 9 papers; vấn đề chính là `03_final_included.csv` chưa khớp PRISMA/evidence.
- `Đỗ Long Vỹ/` đã sửa được vấn đề lớn trước đó là dữ liệu nhiều nguồn; hiện scope IEEE đã rõ. Vấn đề chính là evidence table chưa đủ 5 papers và GAP chưa khớp số lượng evidence.
