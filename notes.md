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

1.  **Đo Branch Coverage (JaCoCo):**
    ```powershell
    mvn clean test -Dtest="*GPTTest"
    ```
    *(Báo cáo JaCoCo sẽ xuất ra file XML tại `target/site/jacoco/jacoco.xml`)*

2.  **Đo Mutation Score (PiTest):**
    ```powershell
    mvn pitest:mutationCoverage -Dtest="*GPTTest"
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

---

## 4. Quyết định kỹ thuật & Nhật ký lỗi (Technical Decisions & Error Log)

### A. Nhật ký lỗi (Error Log)
1. **Lỗi `tools.jar` (JDK 21):**
   * *Mô tả:* Khi chạy `mvn test` trên JDK 21, plugin `evosuite-maven-plugin:1.0.6` bị crash do cố tìm `tools.jar` (đã bị loại bỏ kể từ Java 9).
   * *Xử lý:* Tạm thời comment out plugin `evosuite-maven-plugin` trong `pom.xml` khi chạy các test case thông thường (`*GPTTest`) và hướng dẫn nhóm chuyển sang sử dụng JDK 8 để đồng bộ biên dịch.
2. **Lỗi `Green Suite` của PITest:**
   * *Mô tả:* Các test case do AI sinh ra (`*_GPTTest.java`) chứa một số test case bị fail logic trên code gốc, làm cho PITest báo lỗi `Tests failing without mutation` và dừng build.
   * *Xử lý:* Viết script tự động `ignore_failing_tests.py` để tìm các test case bị lỗi từ báo cáo JUnit XML của Surefire và chèn thêm `@org.junit.Ignore` vào trước các test case này để bỏ qua chúng một cách an toàn.

### B. Quyết định kỹ thuật sau Pilot (7.4)
* **Random Seed đã chọn:** `42` (Dùng để sinh ngẫu nhiên 6 hàm trong `data/pilot_sample.csv`).
* **Độ đồng nhất (IAA):** Không áp dụng đối với dự án sinh test (do benchmark code là HumanEval-Java chuẩn có sẵn của con người).
* **Đánh giá Pipeline:** Pipeline hoạt động chính xác, cấu trúc lưu trữ và backup qua script `manage_gpt_tests.py` chạy mượt mà.
* **Quyết định:** **TIẾN HÀNH THỰC NGHIỆM CHÍNH THỨC (TUẦN 8) trên toàn bộ 63 hàm.**
