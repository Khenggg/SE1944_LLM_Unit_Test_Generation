import os
import re
import time
import sys

# Paths
scripts_dir = os.path.dirname(os.path.abspath(__file__))
workspace_dir = os.path.dirname(scripts_dir)
rbl_project_dir = os.path.join(workspace_dir, "experiments", "rbl-project")
src_correct_dir = os.path.join(rbl_project_dir, "src", "main", "java", "humaneval", "correct")
test_dest_dir = os.path.join(rbl_project_dir, "src", "test", "java", "humaneval", "correct")

# Make sure destination exists
os.makedirs(test_dest_dir, exist_ok=True)

# Detect API provider based on environment variables
openai_key = os.environ.get("OPENAI_API_KEY")
azure_key = os.environ.get("AZURE_OPENAI_API_KEY")
azure_endpoint = os.environ.get("AZURE_OPENAI_ENDPOINT")
azure_version = os.environ.get("AZURE_OPENAI_API_VERSION", "2024-08-01-preview")
azure_deployment = os.environ.get("AZURE_OPENAI_DEPLOYMENT_NAME", "gpt-4o-mini")

client = None
model_name = None

if azure_key and azure_endpoint:
    print("Detected Azure OpenAI / Azure AI Foundry environment variables.")
    try:
        from openai import AzureOpenAI
        client = AzureOpenAI(
            api_key=azure_key,
            api_version=azure_version,
            azure_endpoint=azure_endpoint
        )
        model_name = azure_deployment
        print(f"Using Azure OpenAI Client (Deployment/Model: {model_name})")
    except ImportError:
        print("Error: The 'openai' library is not installed or outdated.")
        print("Please run: .venv\\Scripts\\pip install openai")
        sys.exit(1)
        
elif openai_key:
    print("Detected standard OpenAI environment variables.")
    try:
        from openai import OpenAI
        client = OpenAI(api_key=openai_key)
        model_name = "gpt-4o-mini-2024-07-18"
        print(f"Using standard OpenAI Client (Model: {model_name})")
    except ImportError:
        print("Error: The 'openai' library is not installed.")
        print("Please run: .venv\\Scripts\\pip install openai")
        sys.exit(1)
        
else:
    print("Error: No API credentials found in environment variables.")
    print("Please set your credentials in PowerShell before running:")
    print("\nOption A: Standard OpenAI API")
    print('  $env:OPENAI_API_KEY="your-openai-api-key"')
    print("\nOption B: Azure AI Foundry / Azure OpenAI")
    print('  $env:AZURE_OPENAI_API_KEY="your-azure-api-key"')
    print('  $env:AZURE_OPENAI_ENDPOINT="https://your-resource.openai.azure.com/"')
    print('  $env:AZURE_OPENAI_DEPLOYMENT_NAME="your-deployment-name" # optional, defaults to gpt-4o-mini')
    print('  $env:AZURE_OPENAI_API_VERSION="2024-08-01-preview"      # optional')
    sys.exit(1)

# Get the list of all 50 Java source files
java_files = [f for f in os.listdir(src_correct_dir) if f.endswith(".java")]
java_files.sort()  # Process alphabetically

print(f"\nDetected {len(java_files)} classes in {src_correct_dir}")
print("Starting unit test generation...")

for idx, filename in enumerate(java_files, 1):
    class_name = filename[:-5]  # Strip ".java"
    src_file_path = os.path.join(src_correct_dir, filename)
    output_filename = f"{class_name}_GPTTest.java"
    output_file_path = os.path.join(test_dest_dir, output_filename)
    
    # Check if test already exists (to avoid duplicate API calls if run is interrupted)
    if os.path.exists(output_file_path):
        print(f"[{idx}/{len(java_files)}] Skip {class_name} (Test already exists)")
        continue

    print(f"[{idx}/{len(java_files)}] Generating test for {class_name}...", end="", flush=True)
    
    # Read Java source code
    with open(src_file_path, "r", encoding="utf-8") as f:
        source_code = f.read()
        
    # Build Prompt
    prompt = f"""You are an expert Java developer and software tester.
Your task is to write a comprehensive JUnit 4 test suite for the following Java class.
Strictly adhere to the following requirements:
1. Generate test cases using JUnit 4 (use org.junit.Test, org.junit.Assert).
2. Do not use JUnit 5 or other test frameworks.
3. Test all logical paths, edge cases, boundary values, and potential error conditions.
4. Ensure all assertions are correct and correspond exactly to the expected behavior of the correct code.
5. The test class must be named {class_name}_GPTTest, corresponding to the target class {class_name}.
6. The test class must be in package humaneval.correct;
7. You should import any required packages (like java.util.*).
8. Provide only the executable Java test class code. Do not include any markdown explanations, text wrapping, or extra commentary.

Source Code:
{source_code}"""

    try:
        # Call API (works for both standard OpenAI and AzureOpenAI clients)
        response = client.chat.completions.create(
            model=model_name,
            messages=[
                {"role": "user", "content": prompt}
            ],
            temperature=0.0,
            max_tokens=2000
        )
        
        content = response.choices[0].message.content
        
        # Extract java code block from markdown if present
        code_match = re.search(r'```java(.*?)```', content, re.DOTALL)
        if code_match:
            generated_code = code_match.group(1).strip()
        else:
            # Fallback if no markdown blocks
            generated_code = content.strip()
            # Clean up other markdown styles
            if generated_code.startswith("```"):
                generated_code = re.sub(r'^```[a-zA-Z]*\n', '', generated_code)
                generated_code = re.sub(r'\n```$', '', generated_code)
        
        # Ensure package declaration is present and correct
        package_decl = "package humaneval.correct;"
        if package_decl not in generated_code:
            # If there's another package declaration, replace it
            if "package" in generated_code:
                generated_code = re.sub(r'package\s+[\w.]+;', package_decl, generated_code)
            else:
                generated_code = package_decl + "\n\n" + generated_code
                
        # Write to destination
        with open(output_file_path, "w", encoding="utf-8") as f:
            f.write(generated_code)
            
        print(" DONE")
        
        # Sleep for a bit to avoid hitting rate limits
        time.sleep(1.0)
        
    except Exception as e:
        print(f" FAILED (Error: {e})")
        print("Stopping execution. You can rerun the script to resume from where it failed.")
        break

print("\nGeneration process finished!")
