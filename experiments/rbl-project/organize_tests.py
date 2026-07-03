import os
import shutil
import sys

# Get target subfolder from argument (e.g., evosuite_1p, evosuite_3p, evosuite_5p), default to 'evosuite'
subfolder = sys.argv[1] if len(sys.argv) > 1 else "evosuite"

# Paths relative to the script directory
script_dir = os.path.dirname(os.path.abspath(__file__))
test_dir = os.path.join(script_dir, "src", "test", "java", "humaneval", "correct")
archive_dir = os.path.join(script_dir, "archive", subfolder)

# Ensure archive directory exists
os.makedirs(archive_dir, exist_ok=True)

# Find all EvoSuite test files
if os.path.exists(test_dir):
    files = [f for f in os.listdir(test_dir) if f.endswith("_ESTest.java") or f.endswith("_ESTest_scaffolding.java")]
else:
    files = []

print(f"Found {len(files)} EvoSuite test files. Moving to {archive_dir}...")

count = 0
for filename in files:
    src_path = os.path.join(test_dir, filename)
    dst_path = os.path.join(archive_dir, filename)
    
    # Move file (retaining original content and packages)
    shutil.move(src_path, dst_path)
    count += 1

print(f"Successfully archived {count} files to '{archive_dir}'!")
