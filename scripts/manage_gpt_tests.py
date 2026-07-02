import os
import shutil
import argparse
from datetime import datetime

def manage_gpt_tests():
    # Setup paths
    scripts_dir = os.path.dirname(os.path.abspath(__file__))
    workspace_dir = os.path.dirname(scripts_dir)
    src_dir = os.path.join(workspace_dir, "experiments", "rbl-project", "src", "test", "java", "humaneval", "correct")
    backup_base_dir = os.path.join(workspace_dir, "experiments", "rbl-project", "gpt_backups")

    # Command line argument parser
    parser = argparse.ArgumentParser(description="Quản lý và sao lưu bộ test case sinh bởi AI (GPTTest)")
    parser.add_argument(
        "--action", 
        choices=["archive", "clean"], 
        default="archive", 
        help="Hành động: 'archive' (sao lưu và di chuyển) hoặc 'clean' (xóa sạch)"
    )
    parser.add_argument(
        "--type", 
        choices=["pilot", "full"], 
        default="pilot", 
        help="Loại chạy thực nghiệm: 'pilot' hoặc 'full'"
    )
    args = parser.parse_args()

    # Find all *_GPTTest.java files
    if not os.path.exists(src_dir):
        print(f"Source directory does not exist: {src_dir}")
        return

    gpt_files = [f for f in os.listdir(src_dir) if f.endswith("_GPTTest.java")]

    if not gpt_files:
        print("No *_GPTTest.java files found in the test directory.")
        return

    if args.action == "clean":
        print(f"Cleaning {len(gpt_files)} existing AI test files...")
        for filename in gpt_files:
            file_path = os.path.join(src_dir, filename)
            os.remove(file_path)
        print("AI test files cleaned successfully!")
        
    elif args.action == "archive":
        # Determine the next run number
        type_dir = os.path.join(backup_base_dir, args.type)
        os.makedirs(type_dir, exist_ok=True)
        
        existing_runs = [d for d in os.listdir(type_dir) if os.path.isdir(os.path.join(type_dir, d)) and d.startswith("run_")]
        
        run_numbers = []
        for d in existing_runs:
            parts = d.split("_")
            if len(parts) >= 2 and parts[1].isdigit():
                run_numbers.append(int(parts[1]))
                
        next_run_num = max(run_numbers) + 1 if run_numbers else 1
        
        # Get current timestamp
        timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
        run_folder_name = f"run_{next_run_num}_{timestamp}"
        dest_run_dir = os.path.join(type_dir, run_folder_name)
        
        os.makedirs(dest_run_dir, exist_ok=True)
        
        print(f"Archiving {len(gpt_files)} AI test files to: {dest_run_dir}...")
        for filename in gpt_files:
            src_path = os.path.join(src_dir, filename)
            dst_path = os.path.join(dest_run_dir, filename)
            shutil.move(src_path, dst_path)
            
        print(f"Successfully archived to: {dest_run_dir}")

if __name__ == "__main__":
    manage_gpt_tests()
