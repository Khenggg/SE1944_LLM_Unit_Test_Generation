$ErrorActionPreference = 'Stop'

# Cấu hình Java 8 cho EvoSuite
$env:JAVA_HOME = "E:\java8\zulu@1.8.492"
$env:Path = "$env:JAVA_HOME\bin;" + $env:Path

# Cấu hình
$ProjectDir = "d:\prj SWT\SE1944_LLM_Unit_Test_Generation\extras\experiments\rbl-project"
$PilotClasses = @("SPECIAL_FILTER", "COUNT_UPPER", "BF", "WILL_IT_FLY", "HEX_KEY")

Write-Host "Chuyển đến thư mục rbl-project..."
Set-Location -Path $ProjectDir

# Kiểm tra xem Maven có trong hệ thống không
$mavenPath = Get-Command mvn -ErrorAction SilentlyContinue
if (-not $mavenPath) {
    Write-Host "[LỖI] Không tìm thấy lệnh 'mvn'. Vui lòng cài đặt Maven hoặc thêm Maven vào biến môi trường PATH." -ForegroundColor Red
    exit 1
}

Write-Host "Bắt đầu chạy PILOT EvoSuite cho 5 hàm..." -ForegroundColor Cyan

foreach ($className in $PilotClasses) {
    Write-Host "Đang sinh test cho hàm: $className (Thời gian cấu hình: 0.5 phút/hàm)..." -ForegroundColor Yellow
    
    # Chạy EvoSuite generate
    mvn org.evosuite.plugins:evosuite-maven-plugin:1.0.6:generate "-Dcuts=humaneval.correct.$className" "-DtimeInMinutesPerClass=1"
    
    if ($LASTEXITCODE -ne 0) {
        Write-Host "Lỗi khi sinh test cho $className" -ForegroundColor Red
    } else {
        Write-Host "Sinh test cho $className thành công!" -ForegroundColor Green
    }
}

Write-Host "Đang xuất test case sang thư mục src/test/java..." -ForegroundColor Yellow
mvn org.evosuite.plugins:evosuite-maven-plugin:1.0.6:export

Write-Host "Hoàn thành chạy Pilot EvoSuite!" -ForegroundColor Cyan
