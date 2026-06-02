# GAP STATEMENT - ĐỖ LONG VỸ (IEEE XPLORE)

## Summary from Final Included Papers (N = 5)

Dựa trên kết quả sàng lọc cuối cùng, 5 bài báo cốt lõi (Final Papers) đã được trích xuất để làm nền tảng cho nghiên cứu:

1. **Số lượng:** Cả 5 bài báo [IEEE001, IEEE003, IEEE004, IEEE011, IEEE025] tập trung vào việc sử dụng LLM (GPT-4, Codex, Llama) để sinh Unit Test tự động cho Java và Python .
2. **Công nghệ:** 100% các bài báo này sử dụng các mô hình tiên tiến như GPT-4 hoặc Codex để tối ưu hóa khả năng viết mã kiểm thử .
3. **Chỉ số đo lường:** 5/5 bài sử dụng Code Coverage (Branch/Statement) làm thước đo chính .

## GAP-M - Metric Gap (Khoảng trống về Chỉ số đo lường)

Mặc dù cả 5 bài báo đều đạt được độ bao phủ nhánh (Branch Coverage) ấn tượng, nhưng chỉ có **2/5 bài** ([IEEE001], [IEEE003]) thực hiện đo lường **Mutation Score** . Điều này cho thấy các nghiên cứu hiện tại vẫn đang tập trung vào việc "phủ kín dòng lệnh" hơn là kiểm chứng khả năng "phát hiện lỗi thực tế" của AI. Nghiên cứu của nhóm sẽ lấp đầy khoảng trống này bằng cách đặt ngưỡng Mutation Score >= 60% làm điều kiện bắt buộc .

## GAP-C - Comparison Gap (Khoảng trống về Đối tượng so sánh)

Trong số 5 bài báo này, đa số tập trung so sánh LLM với các công cụ tự động (như EvoSuite, Pynguin) . Chỉ có **1/5 bài** ([IEEE025]) có sự đối chứng với lập trình viên, nhưng chưa bài nào thực hiện so sánh trực tiếp với **sinh viên ngành Kỹ thuật Phần mềm** trên cùng một tập bài tập Java/Python trung bình . Đây là cơ sở để nghiên cứu của em đưa đối tượng sinh viên vào làm nhóm đối chứng (Control Group) .

## Proposed Contribution (Đóng góp đề xuất)

Nghiên cứu này sẽ sử dụng 5 bài báo trên làm hệ quy chiếu (Baseline) để:
* Chứng minh GPT-4 có thể đạt hiệu năng vượt trội hơn sinh viên về cả **Branch Coverage (80%)** và **Mutation Score (60%)** .
* Xác lập một tập dữ liệu đối chứng thực tế giữa AI và người học trong môi trường giáo dục đại học.
