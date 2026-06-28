$ErrorActionPreference = 'Stop'

# Cấu hình JDK 21 tương thích với Randoop và Maven
$env:JAVA_HOME = "C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot"
$env:Path = "$env:Path;E:\Maven\apache-maven-3.9.16\bin"

# Cấu hình đường dẫn
$ProjectDir = "d:\prj SWT\SE1944_LLM_Unit_Test_Generation\extras\experiments\rbl-project"
$RandoopJar = "lib\randoop-all-4.3.3.jar"

Write-Host "Chuyển đến thư mục rbl-project..."
Set-Location -Path $ProjectDir

# Biên dịch dự án trước
Write-Host "Biên dịch dự án..." -ForegroundColor Yellow
mvn compile

if ($LASTEXITCODE -ne 0) {
    Write-Host "[LỖI] Biên dịch code thất bại." -ForegroundColor Red
    exit 1
}

# Tự động lấy danh sách tất cả các class trong thư mục source
$Classes = Get-ChildItem -Path "src/main/java/humaneval/correct" -Filter "*.java" | ForEach-Object { $_.BaseName }
Write-Host "Tìm thấy $($Classes.Count) lớp cần sinh test." -ForegroundColor Cyan
Write-Host "Bắt đầu chạy Randoop cho tất cả các lớp (10 giây/lớp)..." -ForegroundColor Cyan

$count = 1
foreach ($className in $Classes) {
    Write-Host "========================================================" -ForegroundColor Cyan
    Write-Host "[$count/$($Classes.Count)] Đang sinh test cho: $className..." -ForegroundColor Yellow
    
    # 1. Sinh test cho correct package
    java -cp "$RandoopJar;target\classes" randoop.main.Main gentests `
      --testclass="humaneval.correct.$className" `
      --time-limit=10 `
      --usethreads=true `
      --call-timeout=1000 `
      --junit-package-name="humaneval.correct" `
      --regression-test-basename="${className}_RandoopTest" `
      --junit-output-dir="src/test/java"
      
    # 2. Sinh test cho buggy package
    java -cp "$RandoopJar;target\classes" randoop.main.Main gentests `
      --testclass="humaneval.buggy.$className" `
      --time-limit=10 `
      --usethreads=true `
      --call-timeout=1000 `
      --junit-package-name="humaneval.buggy" `
      --regression-test-basename="${className}_RandoopTest" `
      --junit-output-dir="src/test/java"
      
    $count++
}

Write-Host "========================================================" -ForegroundColor Green
Write-Host "Hoàn thành chạy Randoop cho tất cả 50 lớp!" -ForegroundColor Green
