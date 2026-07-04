param (
    [Parameter(Mandatory=$true)]
    [ValidateSet(1, 3, 5, 10, 15, 30, 60)]
    [int]$Minutes
)

$ErrorActionPreference = 'Stop'

# Set JDK 8 for EvoSuite compatibility
$env:JAVA_HOME = "E:\java8\zulu@1.8.492"
$env:Path = "$env:JAVA_HOME\bin;" + $env:Path

# Move to the project directory containing this script
Set-Location -Path $PSScriptRoot

# Clean EvoSuite continuous generation cache to force fresh run
Write-Host "Cleaning EvoSuite cache..." -ForegroundColor Yellow
if (Test-Path (Join-Path $PSScriptRoot ".evosuite")) {
    Remove-Item -Path (Join-Path $PSScriptRoot ".evosuite") -Recurse -Force
}

Write-Host "Compiling the project..." -ForegroundColor Yellow
mvn clean compile

# Get all SUT classes
$Classes = Get-ChildItem -Path "src/main/java/humaneval/correct" -Filter "*.java" | ForEach-Object { "humaneval.correct.$($_.BaseName)" }
Write-Host "Found $($Classes.Count) classes to test."

# Join SUT classes with commas (required for cutsFile option to avoid only testing first class)
$ClassesLine = $Classes -join ","
$CutsFile = Join-Path $PSScriptRoot "cuts.txt"
$ClassesLine | Out-File -FilePath $CutsFile -Encoding ascii -NoNewline

Write-Host "Running EvoSuite test generation with $Minutes minute(s) budget per class (Parallel: 16 cores)..."
mvn evosuite:generate -Pevosuite "-DcutsFile=$CutsFile" "-Dcores=16" "-DmemoryInMB=8000" "-DtimeInMinutesPerClass=$Minutes"

Write-Host "Exporting generated tests..."
mvn evosuite:export -Pevosuite

if (Test-Path $CutsFile) {
    Remove-Item -Path $CutsFile -Force
}

# Apply the separateClassLoader=false fix to make them compatible with PITest
Write-Host "Applying separateClassLoader=false fix..."
python fix_evosuite_classloader.py

Write-Host "EvoSuite generation completed successfully!"
