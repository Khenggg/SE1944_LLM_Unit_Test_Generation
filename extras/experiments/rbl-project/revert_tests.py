import os
import shutil

# Paths
test_dir = r"src/test/java/humaneval/correct"
dest_dir = os.path.join(test_dir, "evosuite")

# Find all EvoSuite test files in the evosuite directory
if os.path.exists(dest_dir):
    files = [f for f in os.listdir(dest_dir) if f.endswith("_ESTest.java") or f.endswith("_ESTest_scaffolding.java")]
    
    print(f"Found {len(files)} files in 'evosuite' directory. Moving back to 'correct' and reverting package...")
    
    count = 0
    for filename in files:
        src_path = os.path.join(dest_dir, filename)
        dst_path = os.path.join(test_dir, filename)
        
        # Read content
        with open(src_path, "r", encoding="utf-8") as f:
            content = f.read()
        
        # Revert package declaration
        modified_content = content.replace("package humaneval.correct.evosuite;", "package humaneval.correct;")
        
        # Write to destination
        with open(dst_path, "w", encoding="utf-8") as f:
            f.write(modified_content)
            
        # Remove file from evosuite dir
        os.remove(src_path)
        count += 1
        
    # Clean up empty evosuite directory
    try:
        os.rmdir(dest_dir)
    except Exception as e:
        print(f"Could not remove directory: {e}")
        
    print(f"Successfully reverted {count} files to package 'humaneval.correct'!")
else:
    print("No 'evosuite' directory found to revert.")
