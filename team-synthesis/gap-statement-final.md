# Phát Biểu Khoảng Trống Nghiên Cứu Cuối Cùng

Nguồn chính: `team-synthesis/evidence-table-merged.md`.

## Đếm Bằng Chứng

| Nhóm bằng chứng | Số lượng trong 30 paper unique | Nhận xét |
| --- | ---: | --- |
| Có dùng coverage/code coverage/branch coverage | 22/30 | Coverage là metric phổ biến nhất trong các paper đã trích xuất. |
| Có dùng mutation score/mutation testing/mutant information | 10/30 | Mutation xuất hiện ít hơn coverage và thường nằm trong các phương pháp feedback hoặc mutation-guided. |
| Có so sánh với human/developer-written tests | 2/30 | Có bằng chứng gần với human baseline, nhưng chưa đúng student-written baseline của SE1944. |
| Có so sánh trực tiếp với student-written tests | 0/30 | Đây là khoảng trống rõ nhất so với đề tài nhóm. |
| Kiểm soát trực tiếp medium cyclomatic complexity CC=5-15 | 0/30 | Một số paper nói về complexity hoặc complex methods, nhưng chưa dùng đúng population của nhóm. |
| Đánh giá đồng thời branch coverage và mutation score trên GPT-4/GPT-4o | Có nhưng rời rạc | Các paper mạnh thường dùng benchmark hoặc tool setting riêng, không đi kèm student baseline. |

## GAP Chính

Các nghiên cứu hiện có về LLM-based unit test generation chủ yếu báo cáo structural coverage hoặc cải thiện pass/compile rate. Một nhóm nhỏ hơn có dùng mutation score để đo khả năng phát hiện lỗi. Tuy nhiên, gần như chưa có nghiên cứu nào đánh giá GPT-4/GPT-4o-generated unit tests trên cùng một tập Java/Python functions có độ phức tạp cyclomatic trung bình, đồng thời đo cả branch coverage và mutation score, rồi so sánh trực tiếp với student-written tests.

## GAP Phụ

| GAP | Bằng chứng từ bảng merged | Ý nghĩa cho SE1944 |
| --- | --- | --- |
| Khoảng trống metric | 22/30 paper có coverage, nhưng chỉ 10/30 có mutation score/mutation testing. | Nếu chỉ dùng coverage thì chưa đo được khả năng bắt lỗi thật của test suite. |
| Khoảng trống đối tượng so sánh | 2/30 paper có human/developer-written comparison; 0/30 có student-written comparison. | Đề tài SE1944 có đóng góp rõ ở baseline sinh viên. |
| Khoảng trống dataset/complexity | 0/30 paper kiểm soát đúng medium CC=5-15; một số paper dùng benchmark đơn giản hoặc repository phức tạp. | Nhóm cần định nghĩa dataset theo function-level và cyclomatic complexity trung bình. |
| Khoảng trống phương pháp | Các kết quả cao thường cần feedback loop, chaining, slicing, mutation guidance hoặc coverage guidance. | Khi thiết kế thực nghiệm, cần ghi rõ prompt/feedback policy thay vì chỉ nói chung là GPT-4. |

## Phát Biểu GAP Cuối Cùng

Các nghiên cứu hiện có cho thấy LLM có thể tạo unit tests đạt coverage hữu ích, đặc biệt khi có feedback loop, method slicing hoặc mutation guidance. Tuy nhiên, literature vẫn thiếu một đánh giá trực tiếp giữa unit tests do GPT-4/GPT-4o sinh ra và unit tests do sinh viên viết trên cùng các Java/Python functions có độ phức tạp trung bình, sử dụng đồng thời branch coverage và mutation score làm outcome metrics.

## Hướng Nghiên Cứu Của Nhóm

Nhóm sẽ kiểm tra khoảng trống này bằng cách chọn cùng một tập Java/Python functions có cyclomatic complexity trung bình, sinh unit tests bằng GPT-4/GPT-4o, thu student-written tests cho cùng functions, rồi so sánh bằng branch coverage, mutation score và compile/pass status.
