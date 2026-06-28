import os
import re

# Resolve directories relative to this script
workspace_dir = os.path.dirname(os.path.abspath(__file__))
test_base_dir = os.path.join(workspace_dir, "src", "test", "java", "humaneval")

folders = ["correct", "buggy"]

for folder in folders:
    target_dir = os.path.join(test_base_dir, folder)
    if not os.path.exists(target_dir):
        print(f"Directory {target_dir} does not exist. Skipping.")
        continue
        
    test_files = [f for f in os.listdir(target_dir) if f.endswith("_ESTest.java")]
    print(f"Processing {len(test_files)} EvoSuite test files in '{folder}'...")
    
    converted = 0
    for filename in test_files:
        filepath = os.path.join(target_dir, filename)
        with open(filepath, "r", encoding="utf-8") as f:
            content = f.read()

        # 1. Remove EvoSuite-specific imports
        content = re.sub(r'import\s+org\.evosuite\.[^;]+;\s*\n', '', content)

        # 2. Remove @RunWith(EvoRunner.class) annotation
        content = re.sub(r'@RunWith\(EvoRunner\.class\)\s*\n', '', content)
        content = re.sub(r'@RunWith\(EvoRunner\.class\)\s*', '', content)

        # 3. Remove @EvoRunnerParameters annotation line(s)
        content = re.sub(r'@EvoRunnerParameters[^)]*\)\s*\n', '', content)
        content = re.sub(r'@EvoRunnerParameters[^)]*\)\s*', '', content)

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
        package_line = f"package humaneval.{folder};"
        for imp in needed_imports:
            if imp not in content:
                content = content.replace(package_line, f"{package_line}\n\n{imp}", 1)

        # 6. Add import for SUT class if not present
        sut_import = f"import humaneval.{folder}.{class_name_base};"
        if sut_import not in content:
            content = content.replace(package_line, f"{package_line}\n\n{sut_import}", 1)

        # 7. Clean any remaining inline @RunWith annotations or scaffolding extensions
        content = content.replace("@RunWith(EvoRunner.class)", "")
        content = content.replace("import org.junit.runner.RunWith;", "")

        # Write cleaned test
        with open(filepath, "w", encoding="utf-8") as f:
            f.write(content)
        converted += 1

    print(f"Successfully converted {converted} test classes in '{folder}'.")

    # Delete all scaffolding files
    scaff_files = [f for f in os.listdir(target_dir) if f.endswith("_ESTest_scaffolding.java")]
    for sf in scaff_files:
        os.remove(os.path.join(target_dir, sf))
    print(f"Removed {len(scaff_files)} scaffolding files in '{folder}'.\n")

print("All EvoSuite tests have been converted to pure JUnit 4 successfully!")
