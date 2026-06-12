# Compile and run JUnit 5 tests
$classpath = (Get-ChildItem -Path lib/*.jar | ForEach-Object { $_.FullName }) -join ";"
if (-not (Test-Path build/classes)) {
    New-Item -ItemType Directory -Path build/classes
}
Write-Host "Compiling project and tests..."
javac -encoding UTF-8 -cp "$classpath;src" -d build/classes (Get-ChildItem -Path src -Filter *.java -Recurse | Where-Object { $_.FullName -notlike "*build*" } | ForEach-Object { $_.FullName })
if ($LASTEXITCODE -ne 0) {
    Write-Host "Compilation failed!" -ForegroundColor Red
    exit $LASTEXITCODE
}
Write-Host "Running tests..."
java -cp "$classpath;build/classes" test.TestRunner
