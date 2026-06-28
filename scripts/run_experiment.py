import os
import re
import time
import sys
import subprocess
import pandas as pd

# ==========================================
# CẤU HÌNH CHẾ ĐỘ CHẠY (BỞI LR)
# ==========================================
IS_PILOT = True  # Đổi thành False khi chạy thực nghiệm chính thức (Tuần 8)
# ==========================================

# Paths
workspace_dir = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
rbl_project_dir = os.path.join(workspace_dir, "extras", "experiments", "rbl-project")
src_correct_dir = os.path.join(rbl_project_dir, "src", "main", "java", "humaneval", "correct")
test_dest_dir = os.path.join(rbl_project_dir, "src", "test", "java", "humaneval", "correct")
results_dir = os.path.join(workspace_dir, "results")
data_dir = os.path.join(workspace_dir, "data")

os.makedirs(test_dest_dir, exist_ok=True)
os.makedirs(results_dir, exist_ok=True)

# Tên file log và output theo chế độ chạy
log_filename = "pilot_api_log.txt" if IS_PILOT else "full_api_log.txt"
output_filename = "pilot_llm_output.csv" if IS_PILOT else "full_llm_output.csv"

log_file_path = os.path.join(results_dir, log_filename)
output_csv_path = os.path.join(results_dir, output_filename)

# Detect API provider
openai_key = os.environ.get("OPENAI_API_KEY")
azure_key = os.environ.get("AZURE_OPENAI_API_KEY")
azure_endpoint = os.environ.get("AZURE_OPENAI_ENDPOINT")
azure_version = os.environ.get("AZURE_OPENAI_API_VERSION", "2024-08-01-preview")
azure_deployment = os.environ.get("AZURE_OPENAI_DEPLOYMENT_NAME", "gpt-4o-mini")

client = None
model_name = None

if azure_key and azure_endpoint:
    print("Detected Azure OpenAI environment variables.")
    from openai import AzureOpenAI
    client = AzureOpenAI(api_key=azure_key, api_version=azure_version, azure_endpoint=azure_endpoint)
    model_name = azure_deployment
elif openai_key:
    print("Detected standard OpenAI environment variables.")
    from openai import OpenAI
    client = OpenAI(api_key=openai_key)
    model_name = "gpt-4o-mini-2024-07-18"
else:
    print("Error: No API credentials found in environment variables.")
    print("Please set OPENAI_API_KEY before running.")
    sys.exit(1)

# Hàm kiểm tra xem Maven có hoạt động không
def is_maven_available():
    try:
        subprocess.run(["mvn", "-v"], stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL, shell=True)
        return True
    except FileNotFoundError:
        return False

HAS_MAVEN = is_maven_available()
if not HAS_MAVEN:
    print("[WARNING] Maven (mvn) is not installed or not in PATH. Self-repair is disabled.")

# Lấy danh sách class cần chạy
if IS_PILOT:
    pilot_sample_path = os.path.join(data_dir, "pilot_sample.csv")
    if not os.path.exists(pilot_sample_path):
        print(f"Error: {pilot_sample_path} not found. Please ask DG to prepare the pilot sample first!")
        sys.exit(1)
    df_sample = pd.read_csv(pilot_sample_path)
    java_files = [f"{name}.java" for name in df_sample["class_name"].tolist()]
    print(f"Running PILOT mode on 10% sample: {java_files}")
else:
    java_files = [f for f in os.listdir(src_correct_dir) if f.endswith(".java")]
    java_files.sort()
    print(f"Running FULL EXPERIMENT mode on all {len(java_files)} classes.")

# Mở file log để chuẩn bị ghi nhận
log_file = open(log_file_path, "a", encoding="utf-8")
log_file.write(f"\n=== EXPERIMENT RUN START AT {time.strftime('%Y-%m-%d %H:%M:%S')} ===\n")
log_file.flush()

# Khởi tạo bảng kết quả lưu trữ
results_data = []

# Định nghĩa prompt
def get_prompt(class_name, source_code):
    return f"""You are an expert Java developer and software tester.
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

def clean_code(content):
    code_match = re.search(r'```java(.*?)```', content, re.DOTALL)
    if code_match:
        generated_code = code_match.group(1).strip()
    else:
        generated_code = content.strip()
        if generated_code.startswith("```"):
            generated_code = re.sub(r'^```[a-zA-Z]*\n', '', generated_code)
            generated_code = re.sub(r'\n```$', '', generated_code)
    
    package_decl = "package humaneval.correct;"
    if package_decl not in generated_code:
        if "package" in generated_code:
            generated_code = re.sub(r'package\s+[\w.]+;', package_decl, generated_code)
        else:
            generated_code = package_decl + "\n\n" + generated_code
    return generated_code

def check_compilation_errors(class_name):
    """Chạy mvn test-compile và trích xuất lỗi biên dịch của file đang xét"""
    if not HAS_MAVEN:
        return True, ""
    
    result = subprocess.run(
        ["mvn", "clean", "test-compile"],
        cwd=rbl_project_dir,
        capture_output=True,
        text=True,
        shell=True
    )
    
    if result.returncode == 0:
        return True, ""
    
    # Trích xuất các dòng lỗi biên dịch liên quan đến tệp kiểm thử đang sinh
    errors = []
    for line in result.stdout.splitlines():
        if f"{class_name}_GPTTest.java" in line and "[ERROR]" in line:
            errors.append(line)
            
    return False, "\n".join(errors)

for idx, filename in enumerate(java_files, 1):
    class_name = filename[:-5]
    src_file_path = os.path.join(src_correct_dir, filename)
    output_file_name = f"{class_name}_GPTTest.java"
    output_file_path = os.path.join(test_dest_dir, output_file_name)
    
    print(f"[{idx}/{len(java_files)}] Processing {class_name}...")
    
    with open(src_file_path, "r", encoding="utf-8") as f:
        source_code = f.read()
        
    prompt = get_prompt(class_name, source_code)
    
    # Lượt 1: Sinh mã ban đầu
    try:
        t0 = time.time()
        response = client.chat.completions.create(
            model=model_name,
            messages=[{"role": "user", "content": prompt}],
            temperature=0.0,
            max_tokens=2000
        )
        t1 = time.time()
        
        prompt_tokens = response.usage.prompt_tokens
        completion_tokens = response.usage.completion_tokens
        # Giá gpt-4o-mini-2024-07-18: Input $0.150/1M, Output $0.600/1M
        cost = (prompt_tokens * 0.15 + completion_tokens * 0.60) / 1_000_000
        
        generated_code = clean_code(response.choices[0].message.content)
        
        # Ghi file tạm thời
        with open(output_file_path, "w", encoding="utf-8") as f:
            f.write(generated_code)
            
        log_msg = f"[{time.strftime('%H:%M:%S')}] Class: {class_name} | Round 1 | Prompt: {prompt_tokens} tkn | Compl: {completion_tokens} tkn | Cost: ${cost:.6f} | Latency: {t1-t0:.2f}s\n"
        log_file.write(log_msg)
        log_file.flush()
        
        # Kiểm tra biên dịch
        is_compiled, compile_errors = check_compilation_errors(class_name)
        status = "SUCCESS"
        
        # Lượt 2: Tự sửa lỗi (Self-Repair) nếu biên dịch lỗi
        if not is_compiled and HAS_MAVEN:
            print(f"  -> Round 1 failed to compile. Initiating 1-round self-repair...")
            repair_prompt = f"""The generated JUnit test class {class_name}_GPTTest has compilation errors:
{compile_errors}

Here is the source code of the test class:
{generated_code}

Please fix the compilation errors and provide only the corrected Java test class code. Do not include any explanations or markdown blocks (unless using standard ```java)."""
            
            t0_rep = time.time()
            response_repair = client.chat.completions.create(
                model=model_name,
                messages=[{"role": "user", "content": repair_prompt}],
                temperature=0.0,
                max_tokens=2000
            )
            t1_rep = time.time()
            
            p_t_rep = response_repair.usage.prompt_tokens
            c_t_rep = response_repair.usage.completion_tokens
            cost_rep = (p_t_rep * 0.15 + c_t_rep * 0.60) / 1_000_000
            
            repaired_code = clean_code(response_repair.choices[0].message.content)
            
            with open(output_file_path, "w", encoding="utf-8") as f:
                f.write(repaired_code)
                
            log_msg_rep = f"[{time.strftime('%H:%M:%S')}] Class: {class_name} | Round 2 (Repair) | Prompt: {p_t_rep} tkn | Compl: {c_t_rep} tkn | Cost: ${cost_rep:.6f} | Latency: {t1_rep-t0_rep:.2f}s\n"
            log_file.write(log_msg_rep)
            log_file.flush()
            
            # Kiểm tra biên dịch lại
            is_compiled_again, final_errors = check_compilation_errors(class_name)
            if is_compiled_again:
                print("  -> Self-repair successful!")
                status = "REPAIRED"
                cost += cost_rep
            else:
                print("  -> Self-repair failed to resolve compilation errors.")
                status = "FAILED_COMPILE"
                cost += cost_rep
        else:
            print("  -> Compiled successfully on first try.")
            
        results_data.append({
            "class_name": class_name,
            "status": status,
            "total_cost_usd": cost,
            "is_compiled": 1 if (is_compiled or (status == "REPAIRED")) else 0
        })
        
        # Sleep để tránh rate limit
        time.sleep(1.0)
        
    except Exception as e:
        print(f" FAILED (Error: {e})")
        log_file.write(f"[{time.strftime('%H:%M:%S')}] Class: {class_name} | ERROR: {e}\n")
        log_file.flush()
        break

# Xuất file CSV kết quả
df_out = pd.DataFrame(results_data)
df_out.to_csv(output_csv_path, index=False)
print(f"\nExecution finished! Results saved to {output_csv_path}")

log_file.write(f"=== EXPERIMENT RUN END AT {time.strftime('%Y-%m-%d %H:%M:%S')} ===\n")
log_file.close()
