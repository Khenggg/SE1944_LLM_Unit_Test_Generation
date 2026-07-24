import os
import shutil
import random
import re

# Paths
workspace_dir = r"f:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation"
raw_source_dir = os.path.join(workspace_dir, "experiments", "human-eval-java", "src", "main", "java", "humaneval", "correct")
test_source_dir = os.path.join(workspace_dir, "experiments", "human-eval-java", "src", "test", "java", "humaneval")

data_dir = os.path.join(workspace_dir, "data")
raw_data_dir = os.path.join(data_dir, "raw")

# 1. Create directories
os.makedirs(raw_data_dir, exist_ok=True)

# 2. Get list of selected classes from the rbl-project (which contains our N=63 population)
rbl_correct_dir = os.path.join(workspace_dir, "experiments", "rbl-project", "src", "main", "java", "humaneval", "correct")
if not os.path.exists(rbl_correct_dir):
    print("Error: experiments/rbl-project/src/main/java/humaneval/correct/ does not exist. Run setup_experiment.py first.")
    exit(1)

selected_filenames = [f for f in os.listdir(rbl_correct_dir) if f.endswith(".java")]
selected_filenames.sort()

# Calculate CC for each of the 63 files
results = []
for filename in selected_filenames:
    file_path = os.path.join(rbl_correct_dir, filename)
    with open(file_path, "r", encoding="utf-8") as f:
        content = f.read()
    
    # Strip comments
    content_clean = re.sub(r'//.*', '', content)
    content_clean = re.sub(r'/\*.*?\*/', '', content_clean, flags=re.DOTALL)
    content_clean = re.sub(r'".*?"', '""', content_clean)
    
    # Count decision points
    ifs = len(re.findall(r'\bif\b', content_clean))
    fors = len(re.findall(r'\bfor\b', content_clean))
    whiles = len(re.findall(r'\bwhile\b', content_clean))
    cases = len(re.findall(r'\bcase\b', content_clean))
    catches = len(re.findall(r'\bcatch\b', content_clean))
    ands = len(re.findall(r'&&', content_clean))
    ors = len(re.findall(r'\|\|', content_clean))
    
    cc = 1 + ifs + fors + whiles + cases + catches + ands + ors
    results.append((filename, cc))

# 3. Copy files to data/raw/
for filename in selected_filenames:
    src_file = os.path.join(raw_source_dir, filename)
    dst_file = os.path.join(raw_data_dir, filename)
    shutil.copy2(src_file, dst_file)

# Write README.md in data/raw/
readme_content = f"""# Raw Dataset (N = 63)

This directory contains the original, unaltered Java classes selected from the `HumanEval-Java` benchmark for our RBL-4 experiment.

## Selection Rule
- All Java classes with a Cyclomatic Complexity (CC) of 5 or greater ($CC \\ge 5$) are included.
- Total classes: 63.

## Dataset Fields
The list of selected classes and their CC is documented in `data/raw/dataset_metadata.csv`.
"""
with open(os.path.join(raw_data_dir, "README.md"), "w", encoding="utf-8") as f:
    f.write(readme_content)

# Write metadata.csv in data/raw/
metadata_path = os.path.join(raw_data_dir, "dataset_metadata.csv")
with open(metadata_path, "w", encoding="utf-8") as f:
    f.write("class_name,cyclomatic_complexity,raw_file_path\n")
    for name, cc in results:
        class_name = name[:-5]
        rel_path = f"data/raw/{name}"
        f.write(f"{class_name},{cc},{rel_path}\n")

print(f"Dataset successfully copied to {raw_data_dir} (N = 63).")

# 4. Perform Pilot Sampling (10% of N = 63 -> 6 classes)
random.seed(42)  # Fixed random seed
pilot_sample = random.sample(results, 6)
pilot_sample.sort(key=lambda x: x[0])

# Write data/pilot_sample.csv
pilot_sample_path = os.path.join(data_dir, "pilot_sample.csv")
with open(pilot_sample_path, "w", encoding="utf-8") as f:
    f.write("class_name,cyclomatic_complexity\n")
    for name, cc in pilot_sample:
        class_name = name[:-5]
        f.write(f"{class_name},{cc}\n")

# Write data/pilot_ground_truth.csv
pilot_gt_path = os.path.join(data_dir, "pilot_ground_truth.csv")
with open(pilot_gt_path, "w", encoding="utf-8") as f:
    f.write("class_name,ground_truth_test_file,status\n")
    for name, cc in pilot_sample:
        class_name = name[:-5]
        test_file = f"TEST_{class_name}.java"
        f.write(f"{class_name},{test_file},verified\n")

print(f"Pilot sample (6 classes) generated in {pilot_sample_path} (seed = 42).")

# 5. Generate notes.md in repo root
notes_content = """# Pilot Experiment Notes (Tuần 7)

## Random Seed
- **Seed:** `42`
- Used to randomly select 10% (6 classes) from the 63 classes with $CC \\ge 5$.

## Selected Pilot Classes
1. **CHECK_DICT_CASE** (CC = 12)
2. **COUNT_NUMS** (CC = 7)
3. **EXCHANGE** (CC = 6)
4. **GET_ODD_COLLATZ** (CC = 5)
5. **IS_NESTED** (CC = 6)
6. **PROD_SIGNS** (CC = 6)

## Inter-Annotator Agreement (IAA)
- **IAA:** Not Applicable.
- **Justification:** The project evaluates branch coverage and mutation scores using automated tools (JaCoCo and PITest). The oracle ground truth (Correct Java implementations and Student tests) is sourced directly from the peer-reviewed `HumanEval-Java` benchmark, eliminating any subjective manual annotation.
"""
with open(os.path.join(workspace_dir, "notes.md"), "w", encoding="utf-8") as f:
    f.write(notes_content)

print("Generated notes.md successfully.")
