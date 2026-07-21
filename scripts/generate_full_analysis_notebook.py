"""Build the reader-facing, reproducible RBL-4 analysis notebook."""

from __future__ import annotations

from pathlib import Path

import nbformat as nbf


ROOT = Path(__file__).resolve().parents[1]
OUTPUT = ROOT / "results" / "full_analysis.ipynb"


def markdown(text: str):
    return nbf.v4.new_markdown_cell(text)


def code(text: str):
    return nbf.v4.new_code_cell(text)


def main() -> None:
    notebook = nbf.v4.new_notebook()
    notebook["metadata"] = {
        "kernelspec": {"display_name": "RBL-4 .venv", "language": "python", "name": "rbl4-venv"},
        "language_info": {"name": "python"},
    }
    notebook["cells"] = [
        markdown(
            "# RBL-4 full analysis: GPT vs retained EvoSuite baseline\n\n"
            "## tl;dr\n\n"
            "The live zero-shot GPT run generated 63/63 suites, but only 14/63 passed after the permitted repair process. "
            "Its aggregate branch coverage was 18.90% and aggregate mutation score was 16.21%. "
            "The existing EvoSuite 1/3/5-minute test archives were measured per SUT, enabling the planned paired Wilcoxon tests with Holm correction for RQ3. "
            "None of the six RQ3 comparisons was significant after Holm correction; the closest result was mutation at 5 minutes (raw p=0.06251, Holm p=0.37505). "
            "EvoSuite remains an operational technical comparator, not a student-test proxy."
        ),
        markdown(
            "## Context & Methods\n\n"
            "### Key assumptions\n\n"
            "- GPT data are the actual 2026-07-16 API, Maven, JaCoCo, and PIT artifacts in this workspace.\n"
            "- Non-executable GPT suites are retained and recorded as failures; they are not used to execute coverage/PIT.\n"
            "- The EvoSuite source is the existing 1/3/5-minute test archive; no EvoSuite generation is run in this analysis.\n"
            "- The three archives are remeasured per SUT using Maven, JaCoCo, and PIT under Temurin JDK 8, which EvoSuite 1.0.6 requires.\n"
            "- RQ3 pairs only suites that pass in both tools; three technical mutation exclusions remain excluded from mutation comparisons.\n\n"
            "The analysis script records hashes and input paths in `results/rbl4_data_provenance.md`."
        ),
        markdown("## Data\n\n### 1. Rebuild analysis artefacts from retained inputs"),
        code(
            "from pathlib import Path\n"
            "import subprocess\n"
            "import sys\n\n"
            "ROOT = Path.cwd().resolve()\n"
            "if not (ROOT / 'scripts' / 'generate_rbl4_analysis.py').is_file():\n"
            "    ROOT = ROOT.parent\n"
            "subprocess.run([sys.executable, str(ROOT / 'scripts' / 'generate_rbl4_analysis.py')], check=True)\n"
            "print(ROOT)"
        ),
        markdown("### 2. Load the verified analysis tables"),
        code(
            "import pandas as pd\n"
            "from IPython.display import display, Image\n\n"
            "gpt = pd.read_csv(ROOT / 'results' / 'metrics' / 'gpt_class_metrics.csv')\n"
            "summary = pd.read_csv(ROOT / 'results' / 'summary.csv')\n"
            "status = pd.read_csv(ROOT / 'results' / 'full_compile_status.csv')\n"
            "evo = pd.read_csv(ROOT / 'results' / 'metrics' / 'evosuite_measured_aggregate.csv')\n"
            "display(status['status'].value_counts().rename_axis('status').to_frame('suites'))\n"
            "display(evo)"
        ),
        markdown("## Results\n\n### 3. Hypothesis-test and descriptive outputs"),
        code(
            "display(summary[['rq', 'status', 'n', 'p_raw', 'gpt_value', 'comparator_value', 'delta_pp', 'conclusion']])"
        ),
        markdown("### 4. Visual evidence"),
        code(
            "for filename in [\n"
            "    'fig1_execution_status.png',\n"
            "    'fig2_gpt_metric_distribution.png',\n"
            "    'fig3_gpt_vs_evosuite_paired.png',\n"
            "]:\n"
            "    display(Image(filename=str(ROOT / 'results' / 'figures' / filename)))"
        ),
        markdown(
            "## Takeaways\n\n"
            "- RQ1 was not supported: the aggregate GPT branch coverage (18.90%) was below the 30.22% threshold.\n"
            "- The aggregate GPT mutation score (16.21%) exceeded the 4.00% floor, but the per-SUT one-sided Wilcoxon result was not supported because the distribution includes many zero-metric non-executable suites. It did not meet the 40.21% target.\n"
            "- RQ4 was not supported: 13/63 SUTs (20.63%) simultaneously passed and met both floor thresholds.\n"
            "- RQ5 is descriptive: 47 assertion failures and 2 compilation failures accounted for the non-executable suites.\n"
            "- RQ3 uses two-sided paired Wilcoxon tests with Holm correction. The summary table distinguishes all passing pairs from the non-zero differences ranked by Wilcoxon.\n"
            "- EvoSuite must never be described as student-written benchmark data; the student comparison remains deferred."
        ),
    ]
    OUTPUT.parent.mkdir(parents=True, exist_ok=True)
    nbf.write(notebook, OUTPUT)
    print(f"Wrote {OUTPUT}")


if __name__ == "__main__":
    main()
