# GAP Analysis — LLM for Unit Test Case Generation
Evidence table: N = 7 papers | Ngày: 2026-06-03

## Bảng GAP

| Cột | Phát hiện | Loại GAP | Phản chứng |
|---|---|---|---|
| **Tool/LLM** | Nhiều công cụ/framework đã thử nghiệm sinh test bằng LLM (như AdverTest, MuTAP, EvoGPT), do đó Tool gap không phải GAP chính; nghiên cứu chỉ dùng GPT-4/GPT-4o làm intervention để phục vụ GAP-D. | GAP-T | Đã kiểm tra 7 papers |
| **Dataset** | Các bài báo chủ yếu sử dụng các repository-scale benchmark chuẩn (Defects4J, HumanEval), hoàn toàn chưa có so sánh đối chứng trực tiếp với kiểm thử thủ công cấp độ lớp học (student-written tests). | GAP-D | Đã kiểm tra 7 papers |
| **Metric** | Branch coverage và mutation score thường được đo lường tách biệt hoặc coi mutation score là metric phụ họa chứ không được tích hợp thành một tiêu chí kép đánh giá độ mạnh của test suite. | GAP-M | Đã kiểm tra 7 papers |
| **Hạn chế** | 5/7 papers cùng thừa nhận LLM gặp khó khăn lớn khi sinh test cho các hàm có nhiều lớp phụ thuộc (dependencies) hoặc kiểu dữ liệu tự định nghĩa phức tạp. | GAP-S | Đã kiểm tra 7 papers |

---

## GAP Chính: GAP-D (Dataset / Comparison Baseline Gap)
Chưa có nghiên cứu thực nghiệm nào thực hiện đánh giá đối chứng trực tiếp giữa chất lượng unit test sinh bởi LLM thế hệ mới (GPT-4) và unit test được viết thủ công bởi sinh viên ngành Kỹ thuật Phần mềm trên cùng một tập các hàm có độ phức tạp cyclomatic trung bình (CC = 5–15).

## GAP Secondary: GAP-S (Shared Limitation Gap)
Các mô hình LLM gặp khó khăn lớn khi sinh test cho các hàm có nhiều lớp phụ thuộc (dependencies) hoặc kiểu dữ liệu tự định nghĩa phức tạp. Đây là hạn chế chung được thừa nhận ở 5/7 nghiên cứu trong Evidence Table (ví dụ: Dakhel'24, Huang'26, Chang'26).

---

## Chi tiết kiểm tra phản chứng (cho GAP Chính)

Để kiểm chứng tính hợp lệ của GAP Chính (chưa nghiên cứu nào so sánh LLM với student baseline trên code CC = 5-15), chúng tôi thực hiện rà soát phản chứng đối với từng paper trong Evidence Table:

| Paper | Đã so sánh với Student Baseline? | Ghi chú phản chứng | Kết luận |
|---|---|---|---|
| **Dakhel'24 (MuTAP)** | **Không** | So sánh MuTAP (Codex/GPT-3) với công cụ SBST (Pynguin) và kiểm thử thủ công có sẵn từ nhà phát triển (developer reference). | Sát nhưng không trùng (không có student baseline) |
| **Shin'23 (Domain Adaptation)** | **Không** | So sánh CodeT5 (fine-tuned) với GPT-4 và EvoSuite trên Defects4J Java benchmark. | Không trùng |
| **Huang'26 (ULT Benchmark)** | **Không** | Đánh giá 12 LLMs trên UnLeakedTestbench, không so sánh với con người hay student baseline. | Không trùng |
| **Broide'25 (EvoGPT)** | **Không** | Đánh giá hệ thống lai EvoGPT so với EvoSuite và TestART trên Defects4J. | Không trùng |
| **Lu'26 (Beyond Coverage)** | **Không** | Đánh giá khả năng bổ trợ (augmentation) của LLM cho test suite có sẵn, so với EvoSuite trên Defects4J. | Không trùng |
| **Chang'26 (Test vs Mutant)** | **Không** | So sánh framework đối kháng AdverTest với EvoSuite, Pynguin và ChatTester trên Defects4J/HumanEval. | Không trùng |
| **Tabassum'26 (MuTAP vs Pynguin)** | **Không** | So sánh thực nghiệm giữa Pynguin và MuTAP trên các repository thực tế của thư viện mã nguồn mở và công nghiệp. | Không trùng |

**Kết luận:** XÁC NHẬN GAP chính xác. Không có paper nào trong số 7 included papers sử dụng student-written tests làm baseline đối chứng.

---

## Feasibility Check — GAP Chính

Chúng tôi thực hiện đánh giá tính khả thi trước khi tiến hành thiết kế thực nghiệm:

| Tiêu chí | Mức | Ghi chú |
|---|---|---|
| **Dataset** | Cảnh báo | Dataset từ GitHub Classroom chưa được trích xuất và làm sạch hoàn chỉnh. Biện pháp giảm thiểu: Sẽ tiến hành trích xuất thủ công các hàm có CC = 5-15 và lọc bỏ các code không compile được trong 1 tuần tới. |
| **Tool/API** | Cảnh báo | Chưa chạy thử nghiệm quy mô lớn trên API OpenAI. Biện pháp giảm thiểu: Sẽ chạy thử nghiệm nhỏ với 2-3 hàm trước để cấu hình prompt và ước lượng chi phí token trước khi chạy hàng loạt. |
| **Compute** | An toàn | Chạy local test runner (pytest/unittest cho Python, Maven/JUnit cho Java) trên máy cá nhân không tốn tài nguyên GPU. |
| **Ground truth** | An toàn | Các test suite viết thủ công bởi sinh viên chính là ground truth baseline đã có sẵn nhãn và kết quả thực thi. |
| **Skills** | An toàn | Nhóm thành thạo các công cụ đo coverage (pytest-cov/JaCoCo) và mutation testing (mutmut/PIT). |
| **Thời gian** | An toàn | Đã thiết lập sẵn pipeline chạy thử nghiệm tự động, chỉ mất 2-3 ngày để quét toàn bộ dataset. |
| **Contribution**| An toàn | Kết quả so sánh trực tiếp này đóng vai trò quan trọng trong việc đánh giá khả năng thay thế hoặc hỗ trợ của AI trong đào tạo và capstone project. |

**Kết quả:** 0 rủi ro / 2 cảnh báo → **An toàn (sau khi áp dụng biện pháp giảm thiểu)**. GAP được chốt để đưa vào thiết kế thực nghiệm.
