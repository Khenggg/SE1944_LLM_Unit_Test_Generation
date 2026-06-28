"""
Script chuyển đổi TRIỆT ĐỂ các EvoSuite test thành JUnit 4 thuần tuý.
Xóa tất cả annotation và import liên quan đến EvoSuite runtime.
"""
import os
import re

test_dir = r"src\test\java\humaneval\correct"
test_files = [f for f in os.listdir(test_dir) if f.endswith("_ESTest.java")]
print(f"Found {len(test_files)} EvoSuite test files to clean...")

fixed = 0
for filename in test_files:
    filepath = os.path.join(test_dir, filename)
    with open(filepath, "r", encoding="utf-8") as f:
        lines = f.readlines()

    new_lines = []
    for line in lines:
        stripped = line.strip()
        # Skip any EvoSuite import
        if stripped.startswith("import org.evosuite"):
            continue
        # Skip import for RunWith if it is only used for EvoRunner
        if stripped == "import org.junit.runner.RunWith;":
            continue
        # Remove @RunWith(EvoRunner.class) annotation
        if "@RunWith(EvoRunner.class)" in stripped:
            line = line.replace("@RunWith(EvoRunner.class)", "")
            # If line becomes empty or just whitespace + "public class...", keep the rest
            if line.strip() == "":
                continue
        new_lines.append(line)

    with open(filepath, "w", encoding="utf-8") as f:
        f.writelines(new_lines)
    fixed += 1

print(f"Cleaned {fixed} files. All EvoSuite runtime references removed.")
