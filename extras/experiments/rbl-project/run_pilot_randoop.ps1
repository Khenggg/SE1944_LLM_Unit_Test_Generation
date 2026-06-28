$ErrorActionPreference = 'Stop'

# Cấu hình JDK 21 tương thích với Randoop và Maven
$env:JAVA_HOME = "C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot"
$env:Path = "$env:JAVA_HOME\bin;" + $env:Path

# Cấu hình đường dẫn
$ProjectDir = "d:\prj SWT\SE1944_LLM_Unit_Test_Generation\extras\experiments\rbl-project"
$PilotClasses = @("SPECIAL_FILTER", "COUNT_UPPER", "BF", "WILL_IT_FLY", "HEX_KEY")
$RandoopJar = "lib\randoop-all-4.3.3.jar"

Write-Host "Chuyển đến thư mục rbl-project..."
Set-Location -Path $ProjectDir

# Biên dịch dự án trước để Randoop đọc được bytecode của các class SUT
Write-Host "Biên dịch dự án..." -ForegroundColor Yellow
mvn compile

if ($LASTEXITCODE -ne 0) {
    Write-Host "[LỖI] Biên dịch code thất bại." -ForegroundColor Red
    exit 1
}

Write-Host "Bắt đầu chạy PILOT Randoop cho 5 hàm..." -ForegroundColor Cyan

foreach ($className in $PilotClasses) {
    Write-Host "--------------------------------------------------------" -ForegroundColor Cyan
    Write-Host "Đang sinh test cho hàm: $className (Thời gian cấu hình: 10 giây/hàm)..." -ForegroundColor Yellow
    
    # 1. Chạy Randoop sinh test cho package correct
    Write-Host "[Correct] Đang sinh test..." -ForegroundColor Gray
    java -cp "$RandoopJar;target\classes" randoop.main.Main gentests `
      --testclass="humaneval.correct.$className" `
      --time-limit=10 `
      --usethreads=true `
      --call-timeout=1000 `
      --junit-package-name="humaneval.correct" `
      --regression-test-basename="${className}_RandoopTest" `
      --junit-output-dir="src/test/java"
      
    # 2. Chạy Randoop sinh test cho package buggy
    Write-Host "[Buggy] Đang sinh test..." -ForegroundColor Gray
    java -cp "$RandoopJar;target\classes" randoop.main.Main gentests `
      --testclass="humaneval.buggy.$className" `
      --time-limit=10 `
      --usethreads=true `
      --call-timeout=1000 `
      --junit-package-name="humaneval.buggy" `
      --regression-test-basename="${className}_RandoopTest" `
      --junit-output-dir="src/test/java"
      
    Write-Host "Sinh test Randoop cho $className hoàn tất!" -ForegroundColor Green
}

Write-Host "========================================================" -ForegroundColor Green
Write-Host "Hoàn thành chạy Pilot Randoop thành công!" -ForegroundColor Cyan
