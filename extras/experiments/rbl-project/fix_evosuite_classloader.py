import os

# Path to EvoSuite tests
test_dir = r"src/test/java/humaneval/correct"

# Find all *_ESTest.java files
test_files = [os.path.join(test_dir, f) for f in os.listdir(test_dir) if f.endswith("_ESTest.java")]

print(f"Found {len(test_files)} EvoSuite test files to check...")

modified_count = 0
for file_path in test_files:
    with open(file_path, "r", encoding="utf-8") as f:
        content = f.read()
        
    if "separateClassLoader = true" in content:
        # Replace separateClassLoader = true with separateClassLoader = false
        modified_content = content.replace("separateClassLoader = true", "separateClassLoader = false")
        
        with open(file_path, "w", encoding="utf-8") as f:
            f.write(modified_content)
        modified_count += 1

print(f"Modified {modified_count} files to disable separateClassLoader.")
