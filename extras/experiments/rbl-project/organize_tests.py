import os
import shutil

# Paths
test_dir = r"src/test/java/humaneval/correct"
dest_dir = os.path.join(test_dir, "evosuite")

# Ensure destination directory exists
os.makedirs(dest_dir, exist_ok=True)

# Find all EvoSuite test files
files = [f for f in os.listdir(test_dir) if f.endswith("_ESTest.java") or f.endswith("_ESTest_scaffolding.java")]

print(f"Found {len(files)} EvoSuite test files. Moving and updating package declarations...")

count = 0
for filename in files:
    src_path = os.path.join(test_dir, filename)
    dst_path = os.path.join(dest_dir, filename)
    
    # Read content
    with open(src_path, "r", encoding="utf-8") as f:
        content = f.read()
    
    # Replace package declaration
    # We want to replace "package humaneval.correct;" with "package humaneval.correct.evosuite;"
    modified_content = content.replace("package humaneval.correct;", "package humaneval.correct.evosuite;")
    
    # Write to destination
    with open(dst_path, "w", encoding="utf-8") as f:
        f.write(modified_content)
        
    # Remove original file
    os.remove(src_path)
    count += 1

print(f"Successfully reorganized {count} files to package 'humaneval.correct.evosuite'!")
