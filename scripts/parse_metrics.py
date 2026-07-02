import os
import xml.etree.ElementTree as ET

# Paths
workspace_dir = r"f:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation"
jacoco_xml_path = os.path.join(workspace_dir, "experiments", "rbl-project", "target", "site", "jacoco", "jacoco.xml")
pit_reports_dir = os.path.join(workspace_dir, "experiments", "rbl-project", "target", "pit-reports")

def parse_jacoco():
    if not os.path.exists(jacoco_xml_path):
        print(f"Error: JaCoCo report not found at {jacoco_xml_path}")
        return None
    
    try:
        tree = ET.parse(jacoco_xml_path)
        root = tree.getroot()
        
        results = {}
        # Parse package-level counters
        for pkg in root.findall("package"):
            pkg_name = pkg.get("name")
            for counter in pkg.findall("counter"):
                if counter.get("type") == "BRANCH":
                    missed = int(counter.get("missed", 0))
                    covered = int(counter.get("covered", 0))
                    total = missed + covered
                    coverage = (covered / total) * 100 if total > 0 else 100.0
                    results[pkg_name] = {
                        "missed": missed,
                        "covered": covered,
                        "total": total,
                        "percentage": coverage
                    }
        
        # Parse root-level counter
        for counter in root.findall("counter"):
            if counter.get("type") == "BRANCH":
                missed = int(counter.get("missed", 0))
                covered = int(counter.get("covered", 0))
                total = missed + covered
                coverage = (covered / total) * 100 if total > 0 else 100.0
                results["total"] = {
                    "missed": missed,
                    "covered": covered,
                    "total": total,
                    "percentage": coverage
                }
        return results
    except Exception as e:
        print(f"Error parsing JaCoCo XML: {e}")
    return None

def parse_pitest():
    if not os.path.exists(pit_reports_dir):
        print(f"Error: PITest reports directory not found at {pit_reports_dir}")
        return None
    
    # Find the latest subfolder under pit-reports
    subdirs = [os.path.join(pit_reports_dir, d) for d in os.listdir(pit_reports_dir) if os.path.isdir(os.path.join(pit_reports_dir, d))]
    if not subdirs:
        print(f"Error: No PIT report subdirectories found in {pit_reports_dir}")
        return None
    
    # Sort by modification time to find the newest
    subdirs.sort(key=os.path.getmtime, reverse=True)
    latest_dir = subdirs[0]
    
    mutations_xml_path = os.path.join(latest_dir, "mutations.xml")
    if not os.path.exists(mutations_xml_path):
        print(f"Error: PITest mutations.xml not found at {mutations_xml_path}")
        return None
        
    try:
        tree = ET.parse(mutations_xml_path)
        root = tree.getroot()
        
        mutations = root.findall("mutation")
        total = len(mutations)
        
        killed = 0
        survived = 0
        no_coverage = 0
        other = 0
        
        for mutation in mutations:
            status = mutation.get("status")
            detected = mutation.get("detected") # boolean string 'true' or 'false'
            
            if detected == "true" or status in ["KILLED", "TIMEOUT"]:
                killed += 1
            elif status == "SURVIVED":
                survived += 1
            elif status == "NO_COVERAGE":
                no_coverage += 1
            else:
                other += 1
                
        mutation_score = (killed / total) * 100 if total > 0 else 0.0
        return {
            "total": total,
            "killed": killed,
            "survived": survived,
            "no_coverage": no_coverage,
            "other": other,
            "percentage": mutation_score
        }
    except Exception as e:
        print(f"Error parsing PITest XML: {e}")
    return None

def main():
    print("=" * 60)
    print("           RBL-3 FEASIBILITY PILOT MEASUREMENT RESULTS")
    print("=" * 60)
    
    jacoco_results = parse_jacoco()
    if jacoco_results:
        # We focus on humaneval/correct
        correct_cov = jacoco_results.get("humaneval/correct")
        if correct_cov:
            print(f"JaCoCo Branch Coverage (humaneval/correct):")
            print(f"  - Covered Branches: {correct_cov['covered']}")
            print(f"  - Missed Branches:  {correct_cov['missed']}")
            print(f"  - Total Branches:   {correct_cov['total']}")
            print(f"  - Branch Coverage:  {correct_cov['percentage']:.2f}%")
        else:
            print("Warning: humaneval/correct package not found in JaCoCo XML.")
            
        total_cov = jacoco_results.get("total")
        if total_cov:
            print(f"\nJaCoCo Branch Coverage (overall project):")
            print(f"  - Branch Coverage:  {total_cov['percentage']:.2f}%")
    else:
        print("JaCoCo metrics could not be parsed.")
        
    print("-" * 60)
    
    pit_results = parse_pitest()
    if pit_results:
        print(f"PITest Mutation Score (humaneval.correct.* SUT):")
        print(f"  - Killed/Detected:  {pit_results['killed']}")
        print(f"  - Survived:          {pit_results['survived']}")
        print(f"  - No Coverage:       {pit_results['no_coverage']}")
        print(f"  - Other:             {pit_results['other']}")
        print(f"  - Total Mutations:   {pit_results['total']}")
        print(f"  - Mutation Score:    {pit_results['percentage']:.2f}%")
    else:
        print("PITest metrics could not be parsed.")
        
    print("=" * 60)

if __name__ == "__main__":
    main()
