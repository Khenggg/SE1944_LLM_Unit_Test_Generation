"""
Script chuyển đổi các EvoSuite test thành JUnit 4 thuần tuý.
Bỏ phụ thuộc vào evosuite-standalone-runtime (cần tools.jar / JDK 8).
Giữ nguyên logic test và assertion.
"""
import os
import re

test_dir = r"src\test\java\humaneval\correct"

test_files = [f for f in os.listdir(test_dir) if f.endswith("_ESTest.java")]
print(f"Found {len(test_files)} EvoSuite test files to convert...")

converted = 0
for filename in test_files:
    filepath = os.path.join(test_dir, filename)
    with open(filepath, "r", encoding="utf-8") as f:
        content = f.read()

    # 1. Remove EvoSuite-specific imports
    evo_import_pattern = r'import\s+org\.evosuite\.[^;]+;\s*\n'
    content = re.sub(evo_import_pattern, '', content)

    # 2. Remove @RunWith(EvoRunner.class) annotation
    content = re.sub(r'@RunWith\(EvoRunner\.class\)\s*\n', '', content)

    # 3. Remove @EvoRunnerParameters annotation line(s)
    content = re.sub(r'@EvoRunnerParameters[^)]*\)\s*\n', '', content)

    # 4. Remove "extends ... _ESTest_scaffolding" inheritance
    class_name_base = filename.replace("_ESTest.java", "")
    content = re.sub(
        r'(public\s+class\s+' + re.escape(class_name_base) + r'_ESTest)\s+extends\s+' + re.escape(class_name_base) + r'_ESTest_scaffolding',
        r'\1',
        content
    )

    # 5. Ensure standard JUnit imports exist
    needed_imports = [
        "import org.junit.Test;",
        "import static org.junit.Assert.*;",
    ]
    for imp in needed_imports:
        if imp not in content:
            content = content.replace("package humaneval.correct;", f"package humaneval.correct;\n\n{imp}", 1)

    # 6. Add import for the SUT class if not present
    sut_import = f"import humaneval.correct.{class_name_base};"
    if sut_import not in content:
        content = content.replace("package humaneval.correct;", f"package humaneval.correct;\n\n{sut_import}", 1)

    with open(filepath, "w", encoding="utf-8") as f:
        f.write(content)
    converted += 1

print(f"Converted {converted} files to pure JUnit 4 (no EvoSuite runtime dependency).")

# Now delete all scaffolding files since they are no longer needed
scaff_files = [f for f in os.listdir(test_dir) if f.endswith("_ESTest_scaffolding.java")]
for sf in scaff_files:
    os.remove(os.path.join(test_dir, sf))
print(f"Removed {len(scaff_files)} scaffolding files.")
