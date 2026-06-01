# SE1944 Team SLR Integration

Branch này dùng để gom output cá nhân của các thành viên và chuẩn bị phần tổng hợp nhóm.

## Thành viên / nguồn dữ liệu

| Thành viên / folder | Nguồn | Ghi chú |
| --- | --- | --- |
| `Khang/` | `origin/Khang` | Mini-SLR cá nhân nguồn Google Scholar. |
| `Phuoc/` | `origin/Phuoc` | Nội dung lấy từ branch remote của Phước. |
| `pham-an-khang/` | `origin/pham-an-khang` | Nội dung lấy từ branch remote `pham-an-khang`. |
| `Đỗ Long Vỹ/` | Local upload | Thành viên không dùng GitHub, folder đã được đưa trực tiếp vào branch tổng hợp. |

## Cấu trúc tổng hợp nhóm

`team-synthesis/` chứa 4 file nhóm cần hoàn thiện sau khi đối chiếu output từng thành viên:

- `evidence-table-merged.md`
- `gap-statement-final.md`
- `rq-final.md`
- `hypotheses-draft.md`

## Quy tắc làm tiếp

- Gộp evidence table theo DOI/title, bỏ trùng paper.
- Nếu cùng paper nhưng extraction khác nhau, mở paper gốc để xác nhận, không tự lấy trung bình hoặc chọn số thuận mắt.
- GAP nhóm phải dựa trên evidence table merged, không dựa trên bỏ phiếu sở thích.
- RQ final và hypotheses draft phải dùng threshold, metric, dataset/baseline đã được evidence table ủng hộ.
