import os
import re
import time
import sys
import csv
from datetime import datetime

# Paths
workspace_dir = r"f:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation"
data_dir = os.path.join(workspace_dir, "data")
pilot_csv_path = os.path.join(data_dir, "pilot_sample.csv")

rbl_project_dir = os.path.join(workspace_dir, "experiments", "rbl-project")
src_correct_dir = os.path.join(rbl_project_dir, "src", "main", "java", "humaneval", "correct")
test_dest_dir = os.path.join(rbl_project_dir, "src", "test", "java", "humaneval", "correct")

results_dir = os.path.join(workspace_dir, "results")
os.makedirs(results_dir, exist_ok=True)
pilot_log_path = os.path.join(results_dir, "pilot_api_log.txt")
pilot_output_path = os.path.join(results_dir, "pilot_llm_output.csv")

# Make sure destination exists
os.makedirs(test_dest_dir, exist_ok=True)

# Load API Key
openai_key = os.environ.get("OPENAI_API_KEY")
if not openai_key:
    print("Error: OPENAI_API_KEY environment variable not found.")
    print("Please set it in PowerShell before running:")
    print('  $env:OPENAI_API_KEY="your-openai-api-key"')
    sys.exit(1)

try:
    from openai import OpenAI
    client = OpenAI(api_key=openai_key)
except ImportError:
    print("Error: The 'openai' library is not installed.")
    print("Please run: .venv\\Scripts\\pip install openai")
    sys.exit(1)

model_name = "gpt-4o-mini-2024-07-18"

# Read pilot sample classes
pilot_classes = []
if not os.path.exists(pilot_csv_path):
    print(f"Error: Pilot sample CSV not found at {pilot_csv_path}. Run setup_data.py first.")
    sys.exit(1)

with open(pilot_csv_path, "r", encoding="utf-8") as f:
    reader = csv.DictReader(f)
    for row in reader:
        pilot_classes.append(row["class_name"])

print(f"Loaded {len(pilot_classes)} classes for Pilot Run: {pilot_classes}")

results_data = []

# Open log file
with open(pilot_log_path, "a", encoding="utf-8") as log_file:
    log_file.write(f"\n--- PILOT RUN START: {datetime.now().isoformat()} ---\n")
    
    for idx, class_name in enumerate(pilot_classes, 1):
        filename = f"{class_name}.java"
        src_file_path = os.path.join(src_correct_dir, filename)
        output_filename = f"{class_name}_GPTTest.java"
        output_file_path = os.path.join(test_dest_dir, output_filename)
        
        print(f"[{idx}/{len(pilot_classes)}] Generating test for {class_name}...", end="", flush=True)
        
        # Read source code
        if not os.path.exists(src_file_path):
            print(f" FAILED (Source file {src_file_path} not found)")
            continue
            
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

        t0 = time.time()
        try:
            response = client.chat.completions.create(
                model=model_name,
                messages=[
                    {"role": "user", "content": prompt}
                ],
                temperature=0.0,
                max_tokens=2000
            )
            t1 = time.time()
            latency = t1 - t0
            
            content = response.choices[0].message.content
            
            # Extract java code block from markdown if present
            code_match = re.search(r'```java(.*?)```', content, re.DOTALL)
            if code_match:
                generated_code = code_match.group(1).strip()
            else:
                generated_code = content.strip()
                if generated_code.startswith("```"):
                    generated_code = re.sub(r'^```[a-zA-Z]*\n', '', generated_code)
                    generated_code = re.sub(r'\n```$', '', generated_code)
            
            # Ensure package declaration is correct
            package_decl = "package humaneval.correct;"
            if package_decl not in generated_code:
                if "package" in generated_code:
                    generated_code = re.sub(r'package\s+[\w.]+;', package_decl, generated_code)
                else:
                    generated_code = package_decl + "\n\n" + generated_code
            
            # Save to output file
            with open(output_file_path, "w", encoding="utf-8") as f:
                f.write(generated_code)
                
            # Calculate cost (gpt-4o-mini pricing: $0.15/1M input, $0.60/1M output tokens)
            input_tokens = response.usage.prompt_tokens
            output_tokens = response.usage.completion_tokens
            cost = (input_tokens * 0.15 / 1000000) + (output_tokens * 0.60 / 1000000)
            
            # Log the call
            timestamp = datetime.now().isoformat()
            log_line = f"Timestamp: {timestamp} | Class: {class_name} | Model: {response.model} | Input Tokens: {input_tokens} | Output Tokens: {output_tokens} | Cost: ${cost:.6f} | Latency: {latency:.2f}s\n"
            log_file.write(log_line)
            log_file.flush()
            
            results_data.append({
                "class_name": class_name,
                "status": "SUCCESS",
                "cost_usd": f"{cost:.6f}",
                "input_tokens": input_tokens,
                "output_tokens": output_tokens,
                "latency_sec": f"{latency:.2f}"
            })
            
            print(f" DONE (Cost: ${cost:.6f})")
            time.sleep(1.0)
            
        except Exception as e:
            print(f" FAILED (Error: {e})")
            log_file.write(f"Timestamp: {datetime.now().isoformat()} | Class: {class_name} | Error: {e}\n")
            log_file.flush()
            results_data.append({
                "class_name": class_name,
                "status": f"FAILED: {e}",
                "cost_usd": "0.000000",
                "input_tokens": 0,
                "output_tokens": 0,
                "latency_sec": "0.00"
            })

# Save results CSV
with open(pilot_output_path, "w", encoding="utf-8", newline="") as f:
    writer = csv.DictWriter(f, fieldnames=["class_name", "status", "cost_usd", "input_tokens", "output_tokens", "latency_sec"])
    writer.writeheader()
    writer.writerows(results_data)

print(f"\nPilot run generation finished! Results saved to {pilot_output_path}, logs saved to {pilot_log_path}")
