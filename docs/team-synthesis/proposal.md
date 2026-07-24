# Research Proposal: Automated Unit Test Case Generation for Java Functions Using GPT-4o-mini: A Paired Comparison Against Student Benchmark Tests

**Nhóm:** SE1944 - Nhóm 01  
**Thành viên:**
- Lê Thế Khang (MSSV: SE182126) - **PL (Project Lead)**
- Huỳnh Cao Phước (MSSV: SE193271) - **DG (Data & Ground Truth)**
- Phạm An Khang (MSSV: SE200623) - **LR (LLM Runner)**
- Nguyễn Thị Như Ý (MSSV: SE196479) - **MS (Metrics & Stats)**
- Đỗ Long Vỹ (MSSV: SE190064) - **RW (Research Writer)**

**Topic code:** RT-SWT-001  
**Ngày nộp:** 2026-06-15  
**Version:** 1.1
**Trạng thái:** Có amendment RBL-4; chờ xác nhận của giảng viên

> **RBL-4 operational amendment:** Student-written benchmark vẫn là động cơ nghiên cứu ban đầu và hướng đánh giá tiếp theo. Vì chưa có số liệu benchmark sinh viên đã được xác minh theo từng hàm trong cùng pipeline, lần chạy RBL-4 này dùng EvoSuite (ngân sách 1/3/5 phút, cùng 63 SUT) làm đối chứng vận hành tái lập. Không suy luận kết quả EvoSuite thay cho kết quả sinh viên. Xem [amendment](amendments/rbl4-operational-baseline.md).

---

## 2. Research Problem Statement

### 2.1 Bối cảnh & Tầm quan trọng
Trong quy trình kỹ nghệ phần mềm và giảng dạy kiểm thử đơn vị (unit testing) cho sinh viên, việc tạo ra các bộ kiểm thử đơn vị có độ bao phủ cấu trúc và năng lực phát hiện lỗi cao là vô cùng quan trọng nhằm đảm bảo chất lượng mã nguồn. Tuy nhiên, việc viết kiểm thử thủ công thường tiêu tốn nhiều thời gian và dễ bỏ sót các trường hợp biên quan trọng [017, 026]. Việc ứng dụng các mô hình ngôn ngữ lớn (LLM) để tự động hóa sinh test suite hứa hẹn sẽ tối ưu hóa quy trình kiểm thử phần mềm [010].

### 2.2 State of the Art
Các nghiên cứu của Huang'26 [010] và AgoneTest'25 [024] đã chứng minh năng lực đáng kể của LLM thế hệ mới (như GPT-4, LLaMA-3) trong việc sinh mã kiểm thử. Nhiều công cụ sinh test dựa trên LLM (ví dụ như TestPilot của Al-Tse'23 [005]) đã đạt được độ bao phủ dòng và bao phủ nhánh cao trên các tập dữ liệu chuẩn hoặc mã nguồn mở [014, 011]. Dù vậy, hiệu năng thực tế của mã kiểm thử sinh bởi AI khi đối chứng trực tiếp với kiểm thử viết tay bởi con người ở cấp độ đơn vị lập trình độc lập (standalone functions) vẫn còn nhiều tranh cãi [019, 024]. Đặc biệt, các nghiên cứu lớn như MutGen'26 [026] và Al-Tse'23 [005] cảnh báo rằng độ bao phủ cao (coverage) không phải lúc nào cũng đồng hành với năng lực bắt lỗi logic (mutation score).

### 2.3 GAP
Dựa trên phân tích bảng tổng hợp văn liệu của nhóm ($N = 39$ papers), hầu hết các nghiên cứu tập trung đánh giá hiệu năng sinh kiểm thử của LLM trên các tập dữ liệu công nghiệp hoặc so sánh LLM với các công cụ sinh test tự động truyền thống (như EvoSuite hoặc Randoop) [011, 036]. Chi tiết phân tích GAP phản chứng được nhóm thực hiện tại [gap-statement-final.md](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/docs/team-synthesis/gap-statement-final.md) và bảng văn liệu gộp tại [evidence-table-merged.md](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/docs/team-synthesis/evidence-table-merged.md).
*   **GAP-D (Primary):** Hiện chưa có nghiên cứu nào thực hiện đánh giá và so sánh cặp (paired comparison) giữa bộ kiểm thử sinh bởi GPT-4o-mini với bộ kiểm thử đối chứng viết tay của sinh viên (student-written benchmark tests) trên cùng một tập các hàm Java của benchmark HumanEval-Java [004, 019, 023].
*   **GAP-M (Secondary):** Việc đánh giá chất lượng test suite sinh bởi LLM thường bị thiên lệch nếu chỉ sử dụng độ bao phủ nhánh mà thiếu đi sự đánh giá độc lập về kiểm thử đột biến (mutation score) để xác minh năng lực phát hiện lỗi logic thực tế [026].

### 2.4 Motivation
Nếu không giải quyết GAP này, chúng ta sẽ không có cơ sở khoa học để đánh giá liệu các bộ kiểm thử sinh bởi AI có thực sự đạt hoặc vượt qua chất lượng của các bộ kiểm thử do sinh viên viết tay trên các hàm chức năng cơ bản hay không. Điều này cản trở việc ứng dụng LLM làm công cụ hỗ trợ chấm bài tự động hoặc hỗ trợ sinh viên học tập kiểm thử phần mềm trong môi trường giáo dục đại học.

---

## 3. Related Work

### 3.1 Overview
Dưới đây là bảng tóm tắt các nghiên cứu tiêu biểu liên quan trực tiếp đến đề tài sinh unit test bằng LLM:

| Paper | Tool/LLM | Dataset (size) | Metric | Best result | Hạn chế chính |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **[005]** (Al-Tse'23) | TestPilot (GPT-3.5) | 25 npm packages (1,684 JS functions) | Statement & Branch coverage | 70.2% Statement, 52.8% Branch coverage | Chỉ đánh giá JavaScript; không đo điểm đột biến |
| **[010]** (Huang'26) | 12 LLMs (GPT-4, LLaMA) | ULT (3,909 Python functions) | Branch coverage, Mutation score | GPT-4 đạt 74% coverage, 58% mutation score | Chi phí API rất cao; chưa đối chứng với con người |
| **[019]** (Multi-Agent'26) | GPT-4, GPT-3.5 multi-agent | HumanEvalJava, LeetCodeJava | Branch coverage, Mutation score | Năng lực tương đương với testcase con người | Cần nhiều agent đồng thuận gây trễ và tốn token |
| **[024]** (AgoneTest'25) | GPT-4o-mini, Gemini, LLaMA3 | Classes2Test (147k Java classes) | Branch coverage, Mutation score | LLaMA3.1 70B đạt 79.8% BC, 89.2% MS | Dữ liệu lớp lớn, tỷ lệ biên dịch ban đầu thấp |
| **[026]** (MutGen'26) | MUTGEN (LLM + Mutation feedback) | 204 Java subjects | Code coverage, Mutation score | Đạt mutation score vượt trội EvoSuite | Vòng lặp phản hồi đột biến tốn nhiều tài nguyên |

### 3.2 Pattern Analysis
Qua phân tích văn liệu, nhóm rút ra 3 nhận xét tổng quan sau:
1.  **Sự thiên lệch về độ bao phủ cấu trúc:** Hầu hết các nghiên cứu tập trung đo đạc độ bao phủ dòng/nhánh làm thước đo chất lượng test suite [005, 011]. Tuy nhiên, các paper mới như **[026]** chỉ ra hiện tượng "blindness" khi test suite đạt 100% coverage nhưng chỉ đạt 4% mutation score vì các câu lệnh assertion quá yếu hoặc rỗng.
2.  **Sự thiếu hụt đối chứng với con người:** Đa số nghiên cứu đối chứng LLM với EvoSuite hoặc Randoop [011, 036]. Rất ít công trình thực hiện so sánh trực tiếp với testcase do con người/sinh viên tự viết trên cùng một tập đơn vị kiểm thử cụ thể [019, 024].
3.  **Tác động của độ phức tạp của hàm (CC):** Chất lượng kiểm thử sinh bởi AI giảm mạnh khi Cyclomatic Complexity của hàm tăng lên, đặc biệt là khi phát sinh các dependency phức tạp giữa các lớp [017, 038].

### 3.3 GAP Mapping

| GAP Type | Evidence (Số paper hỗ trợ) | Trạng thái của GAP |
| :--- | :--- | :--- |
| **GAP-T** (Frontier model evaluation) | 5 papers ([014, 017], [023, 024], [038]) | Confirmed-Deferred (Đã có nghiên cứu dùng GPT-4o-mini) |
| **GAP-D** (Paired Student comparison on Java) | 0 papers | **Confirmed (Primary GAP của nhóm)** |
| **GAP-M** (Dual adequacy evaluation: BC + MS) | 12 papers ([010, 017], [019, 024], [026]) | **Confirmed (Secondary GAP của nhóm)** |

---

## 4. Research Questions

> **RQ1:** Đối với 63 hàm Java có độ phức tạp trung bình ($5 \le CC \le 16$) từ benchmark HumanEval-Java, bộ test suite sinh tự động bởi GPT-4o-mini (phiên bản `gpt-4o-mini-2024-07-18` sử dụng zero-shot prompting) có đạt được trung vị độ bao phủ nhánh (branch coverage) $\ge 30.22\%$ không?
*   **Loại claim:** Absolute threshold (Ngưỡng tuyệt đối dựa trên văn liệu).
*   **Giả thuyết Không ($H_{0\_1}$):** Trung vị độ bao phủ nhánh của bộ test do GPT-4o-mini sinh ra nhỏ hơn 30.22%.
    $$H_{0\_1}: \tilde{\mu}_{\text{BC-AI}} < 30.22\%$$
*   **Giả thuyết Đối ($H_{1\_1}$):** Trung vị độ bao phủ nhánh của bộ test do GPT-4o-mini sinh ra lớn hơn hoặc bằng 30.22%.
    $$H_{1\_1}: \tilde{\mu}_{\text{BC-AI}} \ge 30.22\%$$
*   **Metric:** Branch coverage (đo bằng công cụ JaCoCo).
*   **Ngưỡng:** $\ge 30.22\%$ - **Case 2** (Floor value thực nghiệm trung bình của các mô hình LLM trên dữ liệu thực tế ULT từ paper [010]).
*   **Statistical test:** One-sample Wilcoxon signed-rank test ($\alpha = 0.05$, một đuôi).

> **RQ2:** Đối với 63 hàm Java từ HumanEval-Java, bộ test suite sinh tự động bởi GPT-4o-mini có đạt được trung vị điểm đột biến (mutation score) $\ge 4.0\%$ (ngưỡng sàn cảnh báo) và $\ge 40.21\%$ (ngưỡng mục tiêu khoa học) không?
*   **Loại claim:** Absolute threshold.
*   **RQ2a - Ngưỡng sàn đột biến (>=4.0%):**
    *   $H_{0\_2a}: \tilde{\mu}_{\text{MS-AI}} < 4.0\%$
    *   $H_{1\_2a}: \tilde{\mu}_{\text{MS-AI}} \ge 4.0\%$
*   **RQ2b - Ngưỡng mục tiêu đột biến (>=40.21%):**
    *   $H_{0\_2b}: \tilde{\mu}_{\text{MS-AI}} < 40.21\%$
    *   $H_{1\_2b}: \tilde{\mu}_{\text{MS-AI}} \ge 40.21\%$
*   **Metric:** Mutation score (đo bằng công cụ PiTest).
*   **Ngưỡng:** $4.0\%$ - **Case 2** (Ngưỡng sàn lỗi logic tối thiểu từ paper [026]); và $40.21\%$ - **Case 2** (Hiệu năng trung bình trên ULT từ paper [010]).
*   **Statistical test:** One-sample Wilcoxon signed-rank test ($\alpha = 0.05$, một đuôi).

> **RQ3:** Có sự khác biệt có ý nghĩa thống kê về độ bao phủ nhánh và điểm đột biến khi so sánh trực tiếp bộ test suite sinh tự động bởi GPT-4o-mini với bộ test đối chứng do sinh viên viết sẵn (student benchmark tests) trên cùng 63 hàm Java không?
*   **Loại claim:** Comparative (So sánh đối chứng).
*   **RQ3a - So sánh bao phủ nhánh:**
    *   $H_{0\_3a}: \tilde{\mu}_{\text{BC-AI}} = \tilde{\mu}_{\text{BC-Student}}$
    *   $H_{1\_3a}: \tilde{\mu}_{\text{BC-AI}} \neq \tilde{\mu}_{\text{BC-Student}}$
*   **RQ3b - So sánh điểm đột biến:**
    *   $H_{0\_3b}: \tilde{\mu}_{\text{MS-AI}} = \tilde{\mu}_{\text{MS-Student}}$
    *   $H_{1\_3b}: \tilde{\mu}_{\text{MS-AI}} \neq \tilde{\mu}_{\text{MS-Student}}$
*   **Metric:** Paired metric difference (độ chênh lệch điểm số theo cặp trên từng hàm).
*   **Statistical test:** Paired Wilcoxon signed-rank test ($\alpha = 0.05$, hai đuôi).

> **RQ4:** Bộ kiểm thử do GPT-4o-mini sinh ra có đạt đồng thời cả hai ngưỡng chất lượng sàn (độ bao phủ nhánh $\ge 30.22\%$ và điểm đột biến $\ge 4.0\%$) cho một đa số có ý nghĩa thống kê (trên 50%) các hàm Java được thử nghiệm không?
*   **Loại claim:** Absolute threshold / Proportion.
*   **Giả thuyết Không ($H_{0\_4}$):** Tỷ lệ số hàm đạt đồng thời cả hai ngưỡng của bộ test do GPT-4o-mini sinh ra nhỏ hơn hoặc bằng 50%.
    $$H_{0\_4}: p_{\text{success}} \le 0.50$$
*   **Giả thuyết Đối ($H_{1\_4}$):** Tỷ lệ số hàm đạt đồng thời cả hai ngưỡng của bộ test do GPT-4o-mini sinh ra lớn hơn 50%.
    $$H_{1\_4}: p_{\text{success}} > 0.50$$
*   **Metric:** Simultaneous success rate (tỷ lệ thành công kép nhị phân trên từng hàm).
*   **Statistical test:** Exact Binomial Test ($\alpha = 0.05$, một đuôi, $N = 63$).

---

## 5. Experiment Protocol

### 5.1 Pipeline tổng quan
Quy trình thực nghiệm được chuẩn hóa qua 6 bước tự động sau:
1.  **Lọc Dataset ($N=63$):** Lọc ra 63 hàm Java từ repo `human-eval-java` có Cyclomatic Complexity nằm trong khoảng từ 5 đến 16, loại bỏ các hàm quá đơn giản hoặc có phụ thuộc bên ngoài.
2.  **LLM Prompting:** Sử dụng API OpenAI gửi prompt sinh unit test bằng `gpt-4o-mini-2024-07-18` [023, 024] với `temperature = 0`. Testcase sinh ra được chỉ định gọi chính xác các lớp trong package `humaneval.correct` để đo đạc chất lượng mã chuẩn.
3.  **Hậu xử lý mã nguồn:** Tự động trích xuất mã Java từ phản hồi của LLM, lưu thành các file `TEST_[FUNCTION_NAME].java` đặt trong package `humaneval`.
4.  **Biên dịch & Sửa lỗi (Compilation & Repair):** Chạy lệnh Maven compiler. Nếu phát sinh lỗi cú pháp cơ bản, cho phép tối đa 1 lượt sửa lỗi tự động bằng cách gửi thông báo lỗi ngược lại cho LLM (1-round self-repair). Những test suite vẫn lỗi biên dịch sau lượt 1 sẽ nhận điểm 0% cho cả coverage và mutation score.
5.  **Chạy đo lường JaCoCo & PiTest:** 
    *   Chạy Maven test with JaCoCo plugin để lấy Branch Coverage của cả AI và Student benchmark tests.
    *   Chạy PIT Maven plugin để tính Mutation Score cho cả hai phiên bản.
6.  **Xử lý dữ liệu & Kiểm định thống kê:** Tổng hợp dữ liệu vào file CSV kết quả và thực hiện các phép kiểm định Wilcoxon, Binomial thông qua thư viện `scipy.stats` trong Python.

### 5.2 Dataset
*   **Tên dataset:** HumanEval-Java [004, 019, 023]
*   **Nguồn:** Public GitHub Repository (đã clone và thiết lập tại workspace)
*   **Quy mô (N):** 63 hàm Java (tất cả các hàm trong 163 hàm gốc có Cyclomatic Complexity $5 \le CC \le 16$).
*   **Domain:** Thuật toán, xử lý chuỗi, cấu trúc dữ liệu cơ bản, tính toán toán học mức độ đơn vị.
*   **Lý do chọn:** Giải quyết triệt để **GAP-D**, đây là benchmark chuẩn hóa có sẵn test đối chứng viết tay chuẩn của con người (được nhóm định nghĩa làm Student Benchmark Baseline) phục vụ so sánh cặp chính xác.

### 5.3 LLM/Tool Configuration
*   **Model:** `gpt-4o-mini-2024-07-18` [023, 024] (OpenAI API chính thức).
*   **Hyperparameters:** `temperature = 0` (đảm bảo tính deterministic và khả năng tái lập kết quả) [010], `top_p = 1`. Không đặt giới hạn `max_tokens` phía client.
*   **Prompting strategy:** Zero-shot structured prompt.
*   **Prompt template nguyên văn:**
```text
You are an expert Java developer and software tester.
Your task is to write a comprehensive JUnit 4 test suite for the following Java function.
Strictly adhere to the following requirements:
1. Generate test cases using JUnit 4 (use org.junit.Test, org.junit.Assert).
2. Do not use JUnit 5 or other test frameworks.
3. Test all logical paths, edge cases, boundary values, and potential error conditions.
4. Ensure all assertions are correct and correspond exactly to the expected behavior of the correct code.
5. In your test cases, you MUST call the class in the correct package. Specifically, refer to the target class as humaneval.correct.[CLASS_NAME].[METHOD_NAME].
6. Provide only the executable Java test class code. Do not include any markdown explanations, text wrapping, or extra commentary.
7. The test class must be named TEST_[CLASS_NAME], corresponding to the target class [CLASS_NAME].
8. The class must be in package humaneval.

Source Code:
[SOURCE_CODE]
```

### 5.4 Measurement
*   **Metric chính 1:** Branch Coverage - Đo bằng công cụ JaCoCo (phiên bản `0.8.7+`), tích hợp qua `jacoco-maven-plugin` [005, 010].
*   **Metric chính 2:** Mutation Score - Đo bằng PIT/PiTest (phiên bản `1.7.4+`), sử dụng cấu hình tập toán tử đột biến cơ bản (mutators: `DEFAULTS`) để tránh quá tải tài nguyên phần cứng [026].
*   **Metric phụ:** Compile & Execution Success Rate (tỷ lệ biên dịch và chạy qua suôn sẻ).
*   **Xác định Ground Truth và IAA:** Vì tập dữ liệu HumanEval-Java [004, 019, 023]cung cấp sẵn mã nguồn chuẩn (Correct Java Code) làm Ground Truth, thực nghiệm này thực hiện đo đạc tự động thông qua công cụ JaCoCo và PiTest [026]. Quá trình đo lường không sử dụng chuyên gia gắn nhãn thủ công (Human Annotation), do đó chỉ số đồng thuận giữa các người đánh giá (IAA) không áp dụng.

### 5.5 Baseline
*   **Student Benchmark Baseline:** Bộ test suite có sẵn trong thư mục `src/test/java/humaneval/` của repo `human-eval-java`. Nhóm sẽ biên dịch và đo đạc bộ test đối chứng này trên cùng package `humaneval.correct` để làm dữ liệu so sánh cặp.

### 5.6 Statistical Analysis Plan
*   **Phép kiểm định thống kê:**
    *   **Wilcoxon Signed-Rank Test (One-sample):** Dùng cho RQ1 và RQ2 để so sánh trung vị mẫu ($N = 63$) với các giá trị hằng số $30.22\%$ [010], $4.0\%$ [026] và $40.21\%$ [010]. Đây là phép kiểm định phi tham số an toàn vì dữ liệu tỷ lệ độ bao phủ/đột biến thường bị giới hạn trong đoạn $[0, 1]$ và phân phối lệch chuẩn.
    *   **Paired Wilcoxon Signed-Rank Test (Two-tailed):** Dùng cho RQ3 để so sánh trực tiếp hiệu năng cặp trên cùng một hàm của AI và Student.
    *   **Exact Binomial Test (One-tailed):** Dùng cho RQ4 để kiểm định xem tỷ lệ thành công kép thực tế $p$ có lớn hơn mức ngẫu nhiên $0.50$ hay không.
*   **Phân tích lực lượng mẫu (Statistical Power):** 
    Với cỡ mẫu $N = 63$ và mức ý nghĩa $\alpha = 0.05$:
    *   Phép kiểm định nhị thức (Exact Binomial Test) với giả thuyết không $p_0 = 0.50$ sẽ đạt lực lượng thống kê $Power \ge 0.90$ để phát hiện tỷ lệ thành công thực tế từ $70\%$ trở lên.
    *   Phép kiểm định Wilcoxon signed-rank test đạt lực lượng thống kê $Power \ge 0.85$ để phát hiện các Effect Size cỡ trung bình (Cohen's $d \ge 0.42$).

---



## 6. Evaluation Plan

### 6.1 Bảng tiêu chí đánh giá

| RQ | Metric | Ngưỡng | Test thống kê | H0 bị bác bỏ khi... | Kết quả âm tính (không bác bỏ được H0) có ý nghĩa gì? |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **RQ1** | Branch coverage | $\ge 30.22\%$ | One-sample Wilcoxon (1-tailed) | $p\text{-value} < 0.05$ và trung vị mẫu $\ge 30.22\%$ | Chứng minh GPT-4o-mini sinh test có độ bao phủ cấu trúc kém hơn mức sàn trung bình ghi nhận trong văn liệu. |
| **RQ2a** | Mutation score | $\ge 4.0\%$ | One-sample Wilcoxon (1-tailed) | $p\text{-value} < 0.05$ và trung vị mẫu $\ge 4.0\%$ | Cảnh báo nghiêm trọng: Bộ test suite sinh bởi AI có lỗi logic nặng nề (assertion trống/rỗng) bên dưới mức sàn tối thiểu. |
| **RQ2b** | Mutation score | $\ge 40.21\%$ | One-sample Wilcoxon (1-tailed) | $p\text{-value} < 0.05$ và trung vị mẫu $\ge 40.21\%$ | GPT-4o-mini chưa đạt năng lực phát hiện lỗi logic trung bình của các mô hình SOTA trong thực tế. |
| **RQ3a** | Paired BC difference | Không có | Paired Wilcoxon (2-tailed) | $p\text{-value} < 0.05$ | Không có sự khác biệt có ý nghĩa về độ bao phủ cấu trúc giữa AI và Student. |
| **RQ3b** | Paired MS difference | Không có | Paired Wilcoxon (2-tailed) | $p\text{-value} < 0.05$ | Không có sự khác biệt có ý nghĩa về năng lực phát hiện lỗi logic thực tế giữa AI và Student. |
| **RQ4** | Dual success rate | $> 50.0\%$ | Exact Binomial (1-tailed) | $p\text{-value} < 0.05$ và tỷ lệ mẫu $> 50.0\%$ | Chứng minh GPT-4o-mini không thể sinh ra các bộ kiểm thử đạt cả hai tiêu chuẩn chất lượng tối thiểu cho phần lớn các hàm. |

### 6.2 Diễn giải tổ hợp kết quả
*   **Tình huống Double Positive (Cả RQ1 và RQ2a/b đều bác bỏ H0):** Khẳng định GPT-4o-mini là giải pháp sinh test suite mạnh mẽ cả về mặt cấu trúc điều khiển lẫn logic nghiệp vụ trên các hàm thuật toán cơ bản.
*   **Tình huống Mixed (RQ1 đạt nhưng RQ2a/b thất bại):** Minh chứng rõ nét cho hiện tượng "Coverage Blindness" (độ bao phủ cao giả tạo nhưng không bắt được lỗi đột biến), củng cố tính đúng đắn của việc đưa thêm metric phụ trợ và GAP-M vào đề tài.
*   **Tình huống Double Negative (Thất bại cả RQ1 và RQ2a/b):** Khẳng định phiên bản GPT-4o-mini zero-shot chưa đủ năng lực thay thế hoặc hỗ trợ sinh test tự động ở mức chấp nhận được cho lập trình Java mà cần các kỹ thuật nâng cao hơn (few-shot, CoT hoặc phản hồi đột biến).

---

## 7. Threats to Validity

### 7.1 Internal Validity (Đe dọa nội bộ)
*   **Mối đe dọa (Model Drift / Cloud API Update):** OpenAI có thể cập nhật ngầm mô hình `gpt-4o-mini-2024-07-18` làm thay đổi tính ổn định của mã sinh ra trong quá trình chạy thực nghiệm.
*   **Hành động giảm thiểu (Mitigation):** Cố định tham số model version chính xác là `gpt-4o-mini-2024-07-18` (thay vì dùng tên chung `gpt-4o-mini`), thiết lập `temperature = 0` để triệt tiêu tính ngẫu nhiên, lưu lại toàn bộ lịch sử file raw kết quả cùng thời gian (timestamp) gọi API chi tiết.

### 7.2 External Validity (Đe dọa bên ngoài)
*   **Mối đe dọa (Generalizability / Dataset bias):** Tập dữ liệu gồm 63 hàm Java từ HumanEval-Java [004, 019, 023]chủ yếu là các bài toán thuật toán cô lập và có thể không đại diện cho các lớp Java phức tạp trong hệ thống phần mềm doanh nghiệp thực tế.
*   **Hành động giảm thiểu (Mitigation):** Thừa nhận giới hạn này trong phạm vi nghiên cứu của đồ án; ghi rõ mục tiêu của đề tài là đánh giá trên các hàm cấp độ thuật toán đơn vị độc lập.

### 7.3 Construct Validity (Đe dọa khái niệm)
*   **Mối đe dọa (Metric Weakness):** Độ bao phủ nhánh và điểm đột biến có thể không phản ánh hoàn toàn tính dễ đọc (readability) hay tính dễ bảo trì (maintainability) của test suite sinh bởi AI.
*   **Hành động giảm thiểu (Mitigation):** Bổ sung thống kê descriptive về tỷ lệ lỗi biên dịch (Compilation Success Rate) và tỷ lệ vượt qua bài test (Pass Rate) để đảm bảo tính thực tiễn tối thiểu của mã kiểm thử sinh ra.

### 7.4 Conclusion Validity (Đe dọa kết luận)
*   **Mối đe dọa (Statistical Power):** Cỡ mẫu $N = 63$ có thể bị giảm đi nếu nhiều hàm sinh ra bị lỗi biên dịch nặng không thể chạy đo đạc, dẫn tới thiếu lực lượng thống kê để chạy các phép kiểm định phi tham số.
*   **Hành động giảm thiểu (Mitigation):** Áp dụng cơ chế tự sửa lỗi cú pháp cơ bản (1-round self-repair) nhằm tăng tối đa tỷ lệ biên dịch thành công; chỉ nộp báo cáo thống kê trên các mẫu biên dịch chạy được và báo cáo riêng nhóm lỗi biên dịch.

---

## 8. Timeline & Resources

### 8.0 Phân công vai trò nhóm

| Role | Thành viên | Trách nhiệm chính |
| :--- | :--- | :--- |
| **PL** (Project Lead) | Lê Thế Khang | Quản lý tiến độ chung, kiểm tra tính nhất quán toán học, nộp tài liệu lên giảng viên. |
| **DG** (Data & Ground Truth) | Huỳnh Cao Phước | Chọn lọc 63 hàm Java đạt chuẩn CC; kiểm thử và đo đạc baseline của Student. |
| **LR** (LLM Runner) | Phạm An Khang | Viết script API tự động hóa sinh test, log token, xử lý lượt sửa lỗi compile tự động. |
| **MS** (Metrics & Stats) | Nguyễn Thị Như Ý | Cài đặt plugin JaCoCo, PiTest trong Maven; viết script Python chạy kiểm định thống kê. |
| **RW** (Research Writer) | Đỗ Long Vỹ | Soạn thảo các phần liên quan đến RELATED WORK, THREATS; định dạng và thiết kế slide bảo vệ. |

### 8.1 Resource Inventory
*   **Dataset:** Đã xác nhận tải và kiểm tra thành công repo `human-eval-java` tại local.
*   **API Key:** Đã thiết lập tài khoản OpenAI API, đủ hạn mức cho tối thiểu 200 lượt gọi (bao gồm cả chạy thử nghiệm và chạy chính thức).
*   **Phần cứng/Môi trường:** Chạy local trên CPU, cài đặt sẵn Java JDK 8/11 và Maven compiler.

### 8.2 Chi phí ước tính

| Hạng mục | Số lượng | Đơn giá | Thành tiền |
| :--- | :--- | :--- | :--- |
| API Token Input (gpt-4o-mini) | ~1.5 triệu tokens | $0.150 / 1 triệu tokens | $0.23 USD |
| API Token Output (gpt-4o-mini) | ~1.0 triệu tokens | $0.600 / 1 triệu tokens | $0.60 USD |
| Phí dự phòng chạy thử & sửa lỗi | ~1.0 triệu tokens | Không có | $0.50 USD |
| **Tổng cộng chi phí API** | | | **~$1.33 USD (khoảng 33,000 VND)** |

### 8.3 Timeline chi tiết (Tuần 5–10)

| Tuần | Hoạt động chính | Vai trò chịu trách nhiệm | Checkpoint / Sản phẩm đầu ra |
| :---: | :--- | :--- | :--- |
| **Tuần 5** | Viết và hoàn thiện Research Proposal bản thảo | Cả nhóm | Draft tài liệu proposal.md hoàn tất mục 1–8. |
| **Tuần 5** | Trích xuất và chọn lọc 63 hàm Java; chạy thử baseline | **DG** | Danh sách 63 hàm Java đủ điều kiện CC. |
| **Tuần 5** | Viết script API kết nối LLM; test chạy thử 1 hàm | **LR** | File `test_api.py` hoạt động tốt. |
| **Tuần 5** | Cấu hình plugin JaCoCo và PiTest vào dự án | **MS** | Chạy được `mvn clean test` sinh báo cáo JaCoCo. |
| **Tuần 6** | Hoàn thiện slide bảo vệ đề cương và nộp Proposal | **RW** + **PL** | `proposal.md` v1.0 nộp GV; slide thuyết trình hoàn tất. |
| **Tuần 6** | **Bảo vệ đề cương nghiên cứu & Chờ GV phê duyệt** | Cả nhóm | Đề cương được thông qua (Hard Gate). |
| **Tuần 7** | Chạy thí nghiệm thử nghiệm (Pilot Run - 10% mẫu) | **LR** + **MS** | Báo cáo thử nghiệm trên 6 hàm; kiểm tra phân phối dữ liệu. |
| **Tuần 7** | Đánh giá và chỉnh sửa quy trình thực nghiệm (nếu có) | Cả nhóm | Biên bản họp review pilot; nộp amendment nếu đổi phép kiểm định. |
| **Tuần 8** | Chạy thực nghiệm quy mô đầy đủ (Full Run) | **LR** | Bộ testcase sinh ra cho toàn bộ 63 hàm Java. |
| **Tuần 8** | Chạy đo lường JaCoCo & PIT; tính toán thống kê | **MS** | File `results.csv` chứa điểm số; kết quả p-value các phép test. |
| **Tuần 8** | Tạo biểu đồ phân phối điểm số | **RW** | Biểu đồ Boxplot và phân phối độ bao phủ cấu trúc/đột biến. |
| **Tuần 9-10**| Soạn thảo báo cáo kết quả thực nghiệm và thuyết trình | Cả nhóm | Nộp báo cáo nghiên cứu hoàn chỉnh (RBL-4/5). |

### 8.4 Contingency Plan (Phương án dự phòng)
*   **Nếu API Key bị chặn hoặc giới hạn rate limit:** Chia nhỏ bộ dữ liệu thành 5 batch, mỗi batch 10 hàm và thiết lập thời gian nghỉ 1 phút giữa các batch để tránh chạm trần giới hạn gọi API.
*   **Nếu nhiều hàm bị lỗi biên dịch làm giảm cỡ mẫu thực tế:** Áp dụng thuật toán lọc lại mã nguồn sinh ra bằng cách cắt bỏ các dòng import thừa hoặc ép kiểu tự động trước khi chạy Maven compiler.
*   **Nếu quá trình tính Mutation Score bị treo do infinite loops:** PIT được cấu hình thuộc tính `timeoutConst` và `timeoutFactor` nghiêm ngặt để tự động ngắt các testcase chạy quá 3 giây trên từng mutant.

### 8.5 Checkpoint từng thành viên (Tuần 5–10)

| Vai trò | Tuần 5 | Tuần 6 | Tuần 7 | Tuần 8 | Tuần 9–10 |
| :---: | :--- | :--- | :--- | :--- | :--- |
| **PL** | Review proposal | Nộp proposal | Biên bản họp Pilot | Đồng bộ dữ liệu | Nộp báo cáo cuối |
| **DG** | Lọc 63 hàm Java | Chuẩn bị baseline | Hỗ trợ pilot | Đo đạc baseline | Soạn thảo kết quả |
| **LR** | Viết script API | Kiểm tra tài khoản | Chạy Pilot LLM | Chạy Full LLM | Soạn thảo quy trình |
| **MS** | Thiết lập JaCoCo/PIT | Chuẩn bị script test | Đo metrics Pilot | Đo metrics Full | Chạy kiểm định |
| **RW** | Draft Threats/Related | Định dạng proposal | Chuẩn bị slide | Vẽ biểu đồ | Soạn thảo Threats |
