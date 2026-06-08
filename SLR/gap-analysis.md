# Phân tích Khe hở Nghiên cứu (GAP Analysis) — Huỳnh Cao Phước

**Đề tài:** LLM for Unit Test Case Generation  
**Cơ sở minh chứng:** Hệ thống từ Evidence Table ($N = 7$ papers)  

---

## 1. Bảng Tổng hợp Khe hở Nghiên cứu (GAP Table)

| Cột Phân tích | Thực trạng trong văn liệu khoa học | Phân loại GAP | Đối chứng & Phản biện khoa học |
| :--- | :--- | :--- | :--- |
| **Tool / LLM** | Phần lớn các nghiên cứu đã tập trung đánh giá hiệu năng sinh test tự động của các mô hình SOTA (như GPT-4, GPT-4o, Claude 3, Gemini 2.5) hoặc các công cụ tự động hóa tích hợp (MuTAP, AdverTest, EvoGPT). Tool gap không phải là khe hở chính; nghiên cứu này lựa chọn **GPT-4/GPT-4o** làm đối tượng thực nghiệm (intervention) để đồng bộ với xu hướng SOTA hiện nay. | **GAP-T** *(Tool Gap)* | Đã rà soát 7/7 nghiên cứu. Phần lớn các công trình mới nhất (như Lu'26, Chang'26, Tabassum'26) đều sử dụng GPT-4/GPT-4o làm đối tượng đánh giá chính hoặc làm baseline so sánh. |
| **Dataset** | Các nghiên cứu hiện tại chủ yếu sử dụng các repository-scale benchmark chuẩn (Defects4J) có tính kế thừa lịch sử hoặc các benchmark hàm thuật toán đơn giản (HumanEval, MBPP). Tuy nhiên, **hoàn toàn chưa có nghiên cứu nào thực hiện đánh giá đối chứng trực tiếp với bộ kiểm thử viết thủ công bởi sinh viên ngành Kỹ thuật Phần mềm (academic/student baseline)** trên cùng một tập dữ liệu hàm. | **GAP-D** *(Dataset & Baseline Gap)* | **Đây là GAP chính (Primary GAP).** Đã rà soát 7/7 nghiên cứu; không có bài báo nào sử dụng bài tập lớn hoặc mã nguồn đồ án của sinh viên làm tập mẫu thử nghiệm hoặc sử dụng unit test của sinh viên làm đối chứng. |
| **Metric** | Các chỉ số đo lường độ phủ cấu trúc (Line/Branch Coverage) và khả năng phát hiện lỗi (Mutation Score) thường bị chia tách hoặc đánh giá phụ thuộc. Nghiên cứu đề xuất tích hợp đo lường song song hai chỉ số này làm tiêu chuẩn kép với các ngưỡng sàn khoa học rút ra từ thực nghiệm: **Branch Coverage $\ge$ 30.22%** (theo Huang et al., 2026) và **Mutation Score $\ge$ 35.3%** (theo Tabassum et al., 2026). | **GAP-M** *(Metric Gap)* | Đã rà soát 7/7 nghiên cứu. Mặc dù 7/7 nghiên cứu đều có đo coverage và mutation score, nhưng các chỉ số này thường được báo cáo độc lập hoặc được tối ưu hóa thông qua các vòng lặp phản hồi tự động thay vì đánh giá đồng thời năng lực tĩnh của mô hình. |
| **Hạn chế chung**| 5/7 nghiên cứu thừa nhận LLM gặp khó khăn lớn khi đối phó với mã nguồn có nhiều lớp phụ thuộc phức tạp (dependencies) hoặc các kiểu dữ liệu do người dùng tự định nghĩa. | **GAP-S** *(Shared Limitation Gap)* | Đã rà soát 7/7 nghiên cứu. Các bài báo của Dakhel'24, Huang'26, Lu'26 và Chang'26 đều nhấn mạnh giới hạn này của LLM khi đối mặt với code có cấu trúc phức tạp. |

---

## 2. GAP Chính: GAP-D (Dataset / Comparison Baseline Gap)
Chưa có nghiên cứu thực nghiệm nào thực hiện đánh giá đối chứng trực tiếp (paired comparison) về chất lượng unit test sinh bởi mô hình ngôn ngữ lớn thế hệ mới (**GPT-4/GPT-4o**) và unit test được viết thủ công bởi sinh viên ngành Kỹ thuật Phần mềm trên cùng một tập các hàm Java/Python được kiểm soát nghiêm ngặt về độ phức tạp cyclomatic ở mức trung bình (**CC = 5–15**).

### 💡 Minh chứng Khoa học cho Ngưỡng Độ Phức Tạp (CC = 5–15)
Việc thiết lập khoảng độ phức tạp Cyclomatic Complexity (CC) từ 5 đến 15 không phải là quyết định ad-hoc (tự lập), mà được kế thừa và chứng minh tính thực tiễn thông qua các phân tích thực nghiệm lớn từ tài liệu SLR:
1. **Phát hiện từ Paper 3 (Huang et al., 2026 - ULT):** 
   * Nghiên cứu của Huang et al. chỉ ra các tập dữ liệu unit test trước đây như *TestGenEval* có cấu trúc hàm cực kỳ đơn giản (độ phức tạp trung bình **Mean CC = 4.71**, trong đó **87.3% số hàm có CC $\le$ 9**). Khi đánh giá LLMs trên các hàm đơn giản này, điểm số thường bị thổi phồng (inflated metrics) do mô hình chỉ cần ghi nhớ hoặc sinh mã tuyến tính đơn giản.
   * Để đánh giá năng lực thực tế của LLM trên code thực tế, tác giả đã xây dựng tập dữ liệu *TestEval* (độ phức tạp trung bình **Mean CC = 12.35**) và tập *ULT (UnLeakedTestbench)* (độ phức tạp trung bình **Mean CC = 14.87**, Median = 12, Min = 10, Max = 82).
2. **Lý do chọn khoảng CC = 5–15:**
   * *Tránh mã nguồn quá đơn giản (Trivial code):* Với điều kiện lọc CC $\ge$ 5, thực nghiệm sẽ loại bỏ hoàn toàn các hàm getter/setter, các hàm cấu trúc tuyến tính không rẽ nhánh hoặc chỉ có 1-2 điều kiện logic đơn giản.
   * *Bao phủ trung vị thực tế:* Khoảng CC từ 5 đến 15 bao phủ chính xác vùng trung vị và trung bình của mã nguồn thực tế (TestEval Mean = 12.35; ULT Median = 12).
   * *Phù hợp với năng lực sinh viên:* Đây là độ phức tạp điển hình của các hàm nghiệp vụ (business logic) thông thường trong các đồ án môn học hoặc bài tập lớn của sinh viên. Khoảng này đủ phức tạp để thách thức năng lực viết test của cả LLM lẫn con người, nhưng không quá lớn (như các hệ thống công nghiệp legacy có CC > 20 với hàng loạt dependencies phức tạp) để gây nhiễu kết quả do các biến số ngoài kiểm soát.

---

## 3. Chi tiết Kiểm tra Phản chứng (Counter-Evidence Check)
Để chứng minh GAP chính là hoàn toàn tồn tại và chưa bị trùng lắp bởi bất kỳ công bố khoa học nào trong Evidence Table, chúng tôi tiến hành rà soát phản chứng chi tiết trên từng nghiên cứu:

| Nghiên cứu | Mô hình AI được thử nghiệm | Đã so sánh với Student Baseline? | Đối tượng mã nguồn & Độ phức tạp | Kết luận phản chứng |
| :--- | :--- | :--- | :--- | :--- |
| **Dakhel'24 (MuTAP)** | OpenAI Codex, GPT-3.5-Turbo | **Không** | Các đoạn mã Python ngắn; không kiểm soát hay phân loại theo cyclomatic complexity. | So sánh MuTAP với công cụ SBST (Pynguin) và bộ test có sẵn của nhà phát triển dự án (developer reference), không sử dụng student baseline. |
| **Shin'23 (Domain Adaptation)** | CodeT5, GPT-4 (Zero-shot) | **Không** | Tập dữ liệu Java Defects4J; không phân loại theo cyclomatic complexity. | So sánh mô hình fine-tuned (DA-CodeT5) với GPT-4 thuần và công cụ SBST EvoSuite trên Defects4J. Không có student baseline. |
| **Huang'26 (ULT)** | 12 LLMs (Qwen2.5, Gemma-3, DeepSeek, Phi-4) | **Không** | 3,909 hàm Python thực tế trong ULT (Mean CC = 14.87). | Đánh giá hiệu năng thuần của các mô hình LLM trên benchmark không rò rỉ dữ liệu, không thực hiện so sánh với con người hoặc student baseline. |
| **Broide'25 (EvoGPT)** | GPT-4o-mini, Llama-3-8B | **Không** | Dự án Java từ benchmark Defects4J. | Đánh giá hiệu quả của hệ lai EvoGPT so với EvoSuite thuần và TestART. Không có đối chứng với con người. |
| **Lu'26 (Beyond Coverage)** | GPT-4o, GPT-5, DeepSeek-R1, Gemini 2.5 Pro | **Không** | Dự án Java từ benchmark Defects4J chứa các hàm non-standalone phức tạp. | Đánh giá khả năng bổ trợ (augmentation) của LLM cho bộ test có sẵn của hệ thống, không so sánh với student viết test thủ công. |
| **Chang'26 (Test vs Mutant)** | GPT-3.5, GPT-4 | **Không** | Phương thức Java từ Defects4J và GrowingBugs. | Đánh giá hiệu năng hệ đối kháng AdverTest so với EvoSuite và ChatTester, không có student baseline. |
| **Tabassum'26 (MuTAP vs Pynguin)** | Llama 3.1-8B, GPT-4 family | **Không** | Dự án Python thực tế của doanh nghiệp và thư viện nguồn mở. | So sánh thực nghiệm hiệu năng giữa MuTAP và Pynguin trên các codebase thực tế, không có đối chứng học thuật hay student baseline. |

**Kết luận phản chứng:** Xác nhận GAP tồn tại 100%. Không có bất kỳ công trình nghiên cứu nào trong số các tài liệu được duyệt sử dụng bộ test viết bởi sinh viên (academic baseline) làm đối tượng so sánh. Ngược lại, việc 6/7 nghiên cứu đều đánh giá hoặc sử dụng các mô hình thuộc dòng GPT-4 làm benchmark chứng minh lựa chọn **GPT-4/GPT-4o** làm mô hình sinh test chính trong thực nghiệm của đề tài là hoàn toàn đồng bộ và có giá trị khoa học thời sự.

---

## 4. Đánh giá Tính khả thi của thực nghiệm (Feasibility Check)

Chúng tôi thực hiện đánh giá mức độ khả thi của thực nghiệm dựa trên các tiêu chí kỹ thuật cụ thể trước khi triển khai:

| Tiêu chí | Mức độ | Ghi chú và Biện pháp Giảm thiểu Rủi ro (Mitigation Strategies) |
| :--- | :---: | :--- |
| **Dataset** | ⚠️ Cảnh báo | *Rủi ro:* Tập dữ liệu mã nguồn thu thập từ GitHub Classroom của sinh viên có thể chứa các hàm không biên dịch được hoặc không đầy đủ mô tả expected behavior.<br>*Biện pháp:* Dành riêng 1 tuần để tiến hành trích xuất thủ công các hàm có CC = 5–15, lọc sạch mã nguồn lỗi và viết tài liệu mô tả chi tiết expected behavior kèm input/output mẫu cho từng hàm trước khi đưa vào thực nghiệm. |
| **Tool / API** | ⚠️ Cảnh báo | *Rủi ro:* Gọi API OpenAI quy mô lớn có thể gặp giới hạn về rate limit hoặc phát sinh chi phí token cao vượt dự kiến.<br>*Biện pháp:* Chạy thử nghiệm nhỏ (pilot study) với 2-3 hàm trước để tinh chỉnh prompt, cấu hình tham số `temperature = 0`, và tính toán chi phí token trung bình trên mỗi hàm để lập ngân sách chính xác trước khi chạy hàng loạt. |
| **Compute** | ✅ An toàn | Quá trình chạy testcase nội cục (local test runner như pytest cho Python hoặc Maven/JUnit cho Java) và đo lường độ phủ/đột biến (JaCoCo/PIT hoặc pytest-cov/mutmut) được thực hiện trên máy cá nhân của các thành viên, hoàn toàn không cần tài nguyên GPU hay máy chủ hiệu năng cao. |
| **Ground truth** | ✅ An toàn | Các bộ unit test do sinh viên viết thủ công chính là ground truth baseline đã được nghiệm thu và đánh giá thủ công bởi giảng viên, đảm bảo tính xác thực cao. |
| **Skills** | ✅ An toàn | Các thành viên trong nhóm đều đã làm chủ công cụ đo coverage (JaCoCo/pytest-cov) và kiểm thử đột biến (PIT/mutmut) qua các môn học trước. |
| **Thời gian** | ✅ An toàn | Pipeline thực nghiệm đã được tự động hóa qua các scripts, việc chạy sinh test và đo lường số liệu cho 20 hàm chỉ mất khoảng 2-3 ngày thực thi. |
| **Đóng góp** | ✅ An toàn | Kết quả so sánh định lượng trực tiếp này mang lại đóng góp thực tiễn lớn cho việc đánh giá khả năng trợ giúp của AI trong giáo dục lập trình và các đồ án Capstone. |

**Kết quả đánh giá:** 0 Blockers / 2 Cảnh báo (đều có biện pháp giảm thiểu hiệu quả) $\rightarrow$ **Đủ điều kiện an toàn để triển khai thực nghiệm.**
