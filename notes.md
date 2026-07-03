# Hướng Dẫn Chạy Thử Nghiệm (Pilot Run) - Tuần 7

Tài liệu này chứa thông tin và các bước thực hiện chi tiết cho giai đoạn chạy thử nghiệm trên mẫu 10% (6 hàm Java) trước khi tiến hành thực nghiệm chính thức.

---

## 1. Thông Tin Mẫu Chạy Thử (Pilot Sample)

*   **Random Seed:** `42` (Dùng để chọn ngẫu nhiên 6 hàm từ danh sách 63 hàm có $CC \ge 5$).
*   **Danh sách 6 hàm chạy thử:**
    1.  `CHECK_DICT_CASE` (CC = 12)
    2.  `COUNT_NUMS` (CC = 7)
    3.  `EXCHANGE` (CC = 6)
    4.  `GET_ODD_COLLATZ` (CC = 5)
    5.  `IS_NESTED` (CC = 6)
    6.  `PROD_SIGNS` (CC = 6)
*   **Chỉ số đồng thuận (IAA):** Không áp dụng (do sử dụng benchmark code gốc và test baseline có sẵn của con người từ HumanEval-Java).

---

## 2. Các Bước Thực Hiện Chi Tiết (Step-by-Step)

### Bước 1: Khởi tạo và kích hoạt môi trường ảo
Mở PowerShell tại thư mục root của dự án (`SE1944_LLM_Unit_Test_Generation`) và chạy:
```powershell
# Cho phép thực thi script nếu bị chặn
Set-ExecutionPolicy -Scope Process -ExecutionPolicy RemoteSigned

# Kích hoạt môi trường ảo Python (.venv)
.venv\Scripts\Activate.ps1
```

### Bước 2: Thiết lập API Key OpenAI
Cấu hình API key cho session PowerShell hiện tại (thay thế chuỗi dưới bằng key thật của bạn):
```powershell
$env:OPENAI_API_KEY="sk-proj-xxxxxx..."
```

### Bước 3: Chạy sinh test bằng AI cho 6 hàm Pilot
Chạy script chuyên biệt dành riêng cho Pilot để gọi API và sinh testcase cho 6 hàm:
```powershell
python scripts/run_pilot.py
```
*   **Kết quả đầu ra:** 
    *   Các file test sinh ra tại: `experiments/rbl-project/src/test/java/humaneval/correct/[TênHàm]_GPTTest.java`.
    *   Log API được ghi lại tại: `results/pilot_api_log.txt`.
    *   Dữ liệu tổng hợp token & chi phí tại: `results/pilot_llm_output.csv`.

### Bước 4: Đo lường chất lượng bộ test của AI
Di chuyển vào thư mục Maven của dự án thực nghiệm:
```powershell
cd experiments/rbl-project
```

1.  **Đo Branch Coverage (JaCoCo) - chấp nhận test failures và khống chế lặp vô hạn:**
    ```powershell
    mvn clean test "-Dtest=*GPTTest" "-Dmaven.test.failure.ignore=true"
    ```
    *(Báo cáo JaCoCo sẽ xuất ra file XML tại `target/site/jacoco/jacoco.xml`)*

2.  **Quay lại thư mục root để chạy script tự động chèn `@Ignore` vào các test case lỗi/timeout:**
    ```powershell
    cd ../..
    python experiments/rbl-project/ignore_failing_tests.py
    ```

3.  **Quay lại thư mục Maven để chạy đo Mutation Score (PITest):**
    ```powershell
    cd experiments/rbl-project
    mvn pitest:mutationCoverage "-Dtest=*GPTTest"
    ```
    *(Báo cáo PiTest sẽ xuất ra file XML/HTML tại `target/pit-reports/`)*

### Bước 5: Bóc tách và xem kết quả Pilot
Quay trở lại thư mục root của dự án:
```powershell
cd ../..
```
Chạy script tự động phân tích dữ liệu từ JaCoCo và PIT:
```powershell
python scripts/parse_metrics.py
```
Script sẽ in ra màn hình bảng thống kê chi tiết về Branch Coverage và Mutation Score trung bình của 6 hàm chạy thử nghiệm để nhóm phân tích.

---

## 3. Chạy Thử Nghiệm Đối Chứng với EvoSuite (1 Phút)

Để có dữ liệu đối chiếu với EvoSuite trong giai đoạn Pilot:
1.  Di chuyển vào thư mục Maven:
    ```powershell
    cd experiments/rbl-project
    ```
2.  Tạm thời dọn dẹp các file test cũ:
    ```powershell
    mvn clean
    ```
3.  Sinh test case bằng EvoSuite với cấu hình thời gian 1 phút trong `pom.xml` (mặc định đã để là 1):
    ```powershell
    mvn evosuite:generate
    ```
4.  Đo đạc chỉ số JaCoCo và PIT cho EvoSuite:
    ```powershell
    mvn test -Dtest="*ESTest"
    mvn pitest:mutationCoverage -Dtest="*ESTest"
    ```
5.  Xem kết quả bằng cách quay lại thư mục root và chạy:
    ```powershell
    cd ../..
    python scripts/parse_metrics.py
    ```
6.  Lưu trữ test case của EvoSuite:
    ```powershell
    python experiments/rbl-project/organize_tests.py
    ```
    *(Các file test EvoSuite 1p sẽ được chuyển gọn gàng vào thư mục `experiments/rbl-project/src/test/java/humaneval/correct/evosuite/`)*

7.  **Sao lưu và dọn dẹp bộ test EvoSuite (Mới):**
    *   **Sao lưu bộ test EvoSuite 1 phút:**
        ```powershell
        python scripts/manage_tests.py --action archive --tool evosuite --type pilot --interval 1m
        ```
        *(Các test case sẽ được lưu trữ vào thư mục `experiments/rbl-project/evosuite_backups/pilot/1m/run_X_[timestamp]/`)*
    *   **Dọn dẹp thư mục test của EvoSuite:**
        ```powershell
        python scripts/manage_tests.py --action clean --tool evosuite
        ```

---

## 4. Quyết định kỹ thuật & Nhật ký lỗi (Technical Decisions & Error Log)

### A. Nhật ký lỗi (Error Log)
1. **Lỗi thiếu thư viện `tools.jar` của plugin EvoSuite (đã giải quyết):**
   * *Mô tả:* Khi chạy Maven trên JDK 21 (hoặc các bản Java 9+), plugin `evosuite-maven-plugin:1.0.6` bị lỗi build vì không tìm thấy file thư viện `tools.jar` (thư viện này đã bị gỡ bỏ trong kiến trúc Java mới).
   * *Xử lý:* Nhóm đã thống nhất sử dụng **JDK 8 (Java 1.8)** làm môi trường chạy chính thức cho toàn bộ dự án thực nghiệm. Nhờ đó, cấu hình EvoSuite trong [pom.xml](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/experiments/rbl-project/pom.xml#L110-L127) đã được kích hoạt lại (uncomment) vĩnh viễn và lỗi này đã được xử lý triệt để.
2. **Lỗi `Green Suite` của PITest và treo tiến trình do lặp vô hạn (Infinite Loop):**
   * *Mô tả:* 
     * PITest yêu cầu test suite phải đạt trạng thái 100% Green (không có test fail) để chạy đột biến, trong khi test case do AI sinh ra chứa một số test case bị assert sai logic trên code gốc dẫn đến build thất bại.
     * Đặc biệt, trong class `FIND_ZERO_GPTTest`, AI đã sinh ra các đầu vào đa thức vô nghiệm thực (ví dụ $f(x)=x^2+1$ hoặc hàm hằng $f(x)=5$). Điều này khiến thuật toán bisection trong mã nguồn gốc rơi vào vòng lặp vô hạn và treo vĩnh viễn tiến trình chạy Maven/PITest.
   * *Xử lý:* 
     1. Cấu hình lại các script sinh test (`run_pilot.py` và `generate_gpt_tests.py`) để tự động chèn thêm **`@Test(timeout = 5000)`** (chờ tối đa 5 giây) cho tất cả các test case nhằm cưỡng chế dừng các test bị lặp vô hạn và ghi nhận lỗi `TimeoutException` vào báo cáo XML.
     2. Chạy script tự động `ignore_failing_tests.py` để đọc báo cáo XML, tự động chèn `@org.junit.Ignore` vào tất cả các test case bị lỗi và bị timeout, biến bộ test suite thành "Green" (skipped) một cách tự động 100% để PITest đo đạc thành công.

### B. Quyết định kỹ thuật sau Pilot (7.4)
* **Random Seed đã chọn:** `42` (Dùng để sinh ngẫu nhiên 6 hàm trong `data/pilot_sample.csv`).
* **Độ đồng nhất (IAA):** Không áp dụng đối với dự án sinh test (do benchmark code là HumanEval-Java chuẩn có sẵn của con người).
* **Đánh giá Pipeline:** Pipeline hoạt động chính xác, cấu trúc lưu trữ và backup qua script `manage_tests.py` chạy mượt mà.
* **Quyết định:** **TIẾN HÀNH THỰC NGHIỆM CHÍNH THỨC (TUẦN 8) trên toàn bộ 63 hàm.**
