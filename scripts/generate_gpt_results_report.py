import os
import xml.etree.ElementTree as ET

# Paths
script_dir = os.path.dirname(os.path.abspath(__file__))
workspace_dir = os.path.abspath(os.path.join(script_dir, ".."))
jacoco_xml_path = os.path.join(workspace_dir, "experiments", "rbl-project", "target", "site", "jacoco", "jacoco.xml")
pit_reports_dir = os.path.join(workspace_dir, "experiments", "rbl-project", "target", "pit-reports")
output_md_path = os.path.join(workspace_dir, "results", "gpt_results.md")

def parse_class_jacoco():
    if not os.path.exists(jacoco_xml_path):
        print(f"Error: JaCoCo report not found at {jacoco_xml_path}")
        return {}
    
    try:
        tree = ET.parse(jacoco_xml_path)
        root = tree.getroot()
        
        class_cov = {}
        for pkg in root.findall("package"):
            if pkg.get("name") != "humaneval/correct":
                continue
            for cls in pkg.findall("class"):
                # class name format: humaneval/correct/BF
                cls_full_name = cls.get("name")
                cls_name = cls_full_name.split("/")[-1]
                
                # Check branch coverage
                missed = 0
                covered = 0
                for counter in cls.findall("counter"):
                    if counter.get("type") == "BRANCH":
                        missed = int(counter.get("missed", 0))
                        covered = int(counter.get("covered", 0))
                        break
                
                total = missed + covered
                percentage = (covered / total) * 100 if total > 0 else 100.0
                class_cov[cls_name] = {
                    "covered": covered,
                    "total": total,
                    "percentage": percentage
                }
        return class_cov
    except Exception as e:
        print(f"Error parsing JaCoCo XML: {e}")
    return {}

def parse_class_pitest():
    if not os.path.exists(pit_reports_dir):
        print(f"Error: PITest reports directory not found at {pit_reports_dir}")
        return {}
    
    # Find the latest subfolder under pit-reports
    subdirs = [os.path.join(pit_reports_dir, d) for d in os.listdir(pit_reports_dir) if os.path.isdir(os.path.join(pit_reports_dir, d))]
    if not subdirs:
        print(f"Error: No PIT report subdirectories found in {pit_reports_dir}")
        return {}
    
    subdirs.sort(key=os.path.getmtime, reverse=True)
    latest_dir = subdirs[0]
    
    mutations_xml_path = os.path.join(latest_dir, "mutations.xml")
    if not os.path.exists(mutations_xml_path):
        print(f"Error: PITest mutations.xml not found at {mutations_xml_path}")
        return {}
        
    try:
        tree = ET.parse(mutations_xml_path)
        root = tree.getroot()
        
        class_mutations = {}
        for mutation in root.findall("mutation"):
            mutated_class_full = mutation.find("mutatedClass").text
            cls_name = mutated_class_full.split(".")[-1]
            
            status = mutation.get("status")
            detected = mutation.get("detected")
            
            if cls_name not in class_mutations:
                class_mutations[cls_name] = {"killed": 0, "total": 0}
                
            class_mutations[cls_name]["total"] += 1
            if detected == "true" or status in ["KILLED", "TIMEOUT"]:
                class_mutations[cls_name]["killed"] += 1
                
        return class_mutations
    except Exception as e:
        print(f"Error parsing PITest XML: {e}")
    return {}

def generate_report():
    jacoco = parse_class_jacoco()
    pit = parse_class_pitest()
    
    # We want to output all 63 classes (or whatever classes we have in SUT)
    # Let's get the union of classes
    all_classes = sorted(list(set(jacoco.keys()) | set(pit.keys())))
    
    # Exclude auxiliary files and inner classes (containing $) if any
    all_classes = [c for c in all_classes if c.isupper() and "$" not in c]
    
    md_lines = []
    md_lines.append("# RBL-4 AI (GPT) Test Generation Results (63 SUT Classes)")
    md_lines.append("")
    md_lines.append("This report details the class-level Branch Coverage and Mutation Score obtained by the AI-generated test suite.")
    md_lines.append("")
    md_lines.append("## 📊 Summary Statistics")
    md_lines.append("")
    
    # Calculate overall stats
    total_branches_covered = sum(jacoco[c]["covered"] for c in all_classes if c in jacoco)
    total_branches = sum(jacoco[c]["total"] for c in all_classes if c in jacoco)
    overall_branch_cov = (total_branches_covered / total_branches) * 100 if total_branches > 0 else 0.0
    
    total_mutations_killed = sum(pit[c]["killed"] for c in all_classes if c in pit)
    total_mutations = sum(pit[c]["total"] for c in all_classes if c in pit)
    overall_mutation_score = (total_mutations_killed / total_mutations) * 100 if total_mutations > 0 else 0.0
    
    md_lines.append(f"- **Total SUT Classes:** {len(all_classes)}")
    md_lines.append(f"- **Overall JaCoCo Branch Coverage:** **{overall_branch_cov:.2f}%** ({total_branches_covered}/{total_branches})")
    md_lines.append(f"- **Overall PITest Mutation Score:** **{overall_mutation_score:.2f}%** ({total_mutations_killed}/{total_mutations})")
    md_lines.append("")
    md_lines.append("## 📝 Class-Level Detailed Results")
    md_lines.append("")
    md_lines.append("| No. | Class Name | Covered Branches | Total Branches | Branch Coverage | Killed Mutations | Total Mutations | Mutation Score |")
    md_lines.append("| :--- | :--- | :---: | :---: | :---: | :---: | :---: | :---: |")
    
    for i, cls in enumerate(all_classes, 1):
        cov_data = jacoco.get(cls, {"covered": 0, "total": 0, "percentage": 0.0})
        mut_data = pit.get(cls, {"killed": 0, "total": 0})
        
        mut_percentage = (mut_data["killed"] / mut_data["total"]) * 100 if mut_data["total"] > 0 else 0.0
        
        md_lines.append(
            f"| {i} | `{cls}` | {cov_data['covered']} | {cov_data['total']} | **{cov_data['percentage']:.2f}%** | {mut_data['killed']} | {mut_data['total']} | **{mut_percentage:.2f}%** |"
        )
        
    with open(output_md_path, "w", encoding="utf-8") as f:
        f.write("\n".join(md_lines))
        
    print(f"Report successfully generated at: {output_md_path}")

if __name__ == "__main__":
    generate_report()
