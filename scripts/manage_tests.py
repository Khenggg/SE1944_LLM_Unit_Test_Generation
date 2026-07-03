import os
import shutil
import argparse
from datetime import datetime

def manage_tests():
    # Setup paths
    scripts_dir = os.path.dirname(os.path.abspath(__file__))
    workspace_dir = os.path.dirname(scripts_dir)
    src_dir = os.path.join(workspace_dir, "experiments", "rbl-project", "src", "test", "java", "humaneval", "correct")
    evosuite_sub_dir = os.path.join(src_dir, "evosuite")

    # Command line argument parser
    parser = argparse.ArgumentParser(description="Quản lý và sao lưu bộ test case sinh bởi AI (GPT) và EvoSuite")
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
    parser.add_argument(
        "--tool",
        choices=["gpt", "evosuite"],
        default="gpt",
        help="Công cụ sinh test: 'gpt' hoặc 'evosuite'"
    )
    parser.add_argument(
        "--interval",
        choices=["1m", "3m", "5m"],
        default="1m",
        help="Khoảng thời gian chạy EvoSuite (chỉ có tác dụng với EvoSuite): '1m', '3m', hoặc '5m'"
    )
    args = parser.parse_args()

    # Verify base source directory exists
    if not os.path.exists(src_dir):
        print(f"Source directory does not exist: {src_dir}")
        return

    # Identify files and directories to search
    target_files = [] # list of tuples: (filename, source_directory)
    backup_base_dir = ""
    tool_label = ""

    if args.tool == "gpt":
        gpt_files = [f for f in os.listdir(src_dir) if f.endswith("_GPTTest.java")]
        for f in gpt_files:
            target_files.append((f, src_dir))
        backup_base_dir = os.path.join(workspace_dir, "experiments", "rbl-project", "gpt_backups")
        tool_label = "AI (GPT)"
    else:
        # For EvoSuite, search in both src_dir and src_dir/evosuite
        backup_base_dir = os.path.join(workspace_dir, "experiments", "rbl-project", "evosuite_backups")
        tool_label = f"EvoSuite ({args.interval})"
        
        # Search src_dir
        es_files_main = [f for f in os.listdir(src_dir) if f.endswith("_ESTest.java") or f.endswith("_ESTest_scaffolding.java")]
        for f in es_files_main:
            target_files.append((f, src_dir))
            
        # Search src_dir/evosuite
        if os.path.exists(evosuite_sub_dir):
            es_files_sub = [f for f in os.listdir(evosuite_sub_dir) if f.endswith("_ESTest.java") or f.endswith("_ESTest_scaffolding.java")]
            for f in es_files_sub:
                target_files.append((f, evosuite_sub_dir))

    if not target_files:
        print(f"Không tìm thấy file test nào của {tool_label} trong thư mục.")
        return

    if args.action == "clean":
        print(f"Đang xóa sạch {len(target_files)} file test của {tool_label}...")
        for filename, folder in target_files:
            file_path = os.path.join(folder, filename)
            os.remove(file_path)
        print(f"Đã xóa sạch các file test của {tool_label} thành công!")
        
    elif args.action == "archive":
        # Determine the backup destination directory
        if args.tool == "gpt":
            type_dir = os.path.join(backup_base_dir, args.type)
        else:
            type_dir = os.path.join(backup_base_dir, args.type, args.interval)
            
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
        
        print(f"Đang di chuyển/sao lưu {len(target_files)} file test của {tool_label} vào: {dest_run_dir}...")
        for filename, folder in target_files:
            src_path = os.path.join(folder, filename)
            dst_path = os.path.join(dest_run_dir, filename)
            shutil.move(src_path, dst_path)
            
        print(f"Sao lưu {tool_label} thành công tại: {dest_run_dir}")

if __name__ == "__main__":
    manage_tests()
