import os
import xml.etree.ElementTree as ET
import re

def ignore_failing_tests():
    # Path to surefire-reports
    workspace_dir = r"f:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation"
    reports_dir = os.path.join(workspace_dir, "experiments", "rbl-project", "target", "surefire-reports")
    
    if not os.path.exists(reports_dir):
        print("Surefire reports not found. Run 'mvn test -Dtest=*GPTTest -Dmaven.test.failure.ignore=true' first.")
        return
    
    # Parse surefire reports
    failing_cases = {}  # {classname: [methodname, ...]}
    for filename in os.listdir(reports_dir):
        if filename.startswith("TEST-") and filename.endswith(".xml"):
            filepath = os.path.join(reports_dir, filename)
            try:
                tree = ET.parse(filepath)
                root = tree.getroot()
                for tc in root.findall("testcase"):
                    classname = tc.get("classname")
                    methodname = tc.get("name")
                    failures = tc.findall("failure") + tc.findall("error")
                    if failures:
                        failing_cases.setdefault(classname, []).append(methodname)
            except Exception as e:
                print(f"Error parsing {filename}: {e}")
                
    if not failing_cases:
        print("No failing tests found.")
        return
        
    print(f"Found failing tests in {len(failing_cases)} classes:")
    for classname, methods in failing_cases.items():
        print(f"  {classname}: {len(methods)} failing methods")
        
    # Modify java files
    project_root = os.path.join(workspace_dir, "experiments", "rbl-project")
    for classname, methods in failing_cases.items():
        # Map classname to file path
        # e.g., humaneval.correct.BF_GPTTest -> src/test/java/humaneval/correct/BF_GPTTest.java
        parts = classname.split('.')
        java_rel_path = os.path.join("src", "test", "java", *parts) + ".java"
        java_path = os.path.join(project_root, java_rel_path)
        
        if not os.path.exists(java_path):
            print(f"Java file not found: {java_path}")
            continue
            
        with open(java_path, "r", encoding="utf-8") as f:
            lines = f.readlines()
            
        # We need to find methods in `methods` and insert @org.junit.Ignore
        # A test method declaration usually looks like:
        # public void methodName(...)
        # with @Test preceding it.
        updated_count = 0
        for method in methods:
            target_pattern = re.compile(rf"\bvoid\s+{re.escape(method)}\b")
            for idx, line in enumerate(lines):
                if target_pattern.search(line):
                    # Found the method! Now look backwards for the @Test annotation (within 5 lines)
                    for j in range(max(0, idx - 5), idx):
                        if "@Test" in lines[j]:
                            # If it's already ignored, skip
                            if "@org.junit.Ignore" in lines[j] or (j > 0 and "@org.junit.Ignore" in lines[j-1]):
                                break
                            # Insert @org.junit.Ignore
                            indent = lines[j][:lines[j].find("@Test")]
                            lines[j] = lines[j].replace("@Test", f"@org.junit.Ignore(\"Generated test failed on correct code\")\n{indent}@Test")
                            updated_count += 1
                            break
                    break
            
        # Write back to file
        with open(java_path, "w", encoding="utf-8") as f:
            f.writelines(lines)
        print(f"Updated {java_path}: Ignored {updated_count} failing tests.")

if __name__ == "__main__":
    ignore_failing_tests()
