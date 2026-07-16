# SE1944 - LLM Unit-Test Generation

This repository contains the RBL evidence and final reporting package for an empirical study of zero-shot GPT-4o-mini unit-test generation on 63 HumanEval-Java functions.

## RBL-4 evidence

- Final execution report: `results/rbl4_final_report.md`
- Reproducible analysis notebook: `results/full_analysis.ipynb`
- Statistical summary: `results/summary.csv`
- Data provenance and validation: `results/rbl4_data_provenance.md` and `results/rbl4_validation.md`

The study compares GPT-4o-mini with retained EvoSuite suites measured at 1, 3, and 5 minutes. EvoSuite is an operational technical comparator; it is not student-written data and must not be reported as such.

## Reproduce the analysis

1. Create the Python environment and install the project requirements.
2. To regenerate the derived RBL-4 analysis from the retained CSV evidence, run:

   ```powershell
   .venv\Scripts\python.exe scripts\generate_rbl4_analysis.py
   .venv\Scripts\python.exe scripts\generate_full_analysis_notebook.py
   .venv\Scripts\python.exe -m jupyter nbconvert --execute --to notebook --inplace results\full_analysis.ipynb
   .venv\Scripts\python.exe scripts\validate_rbl4_results.py
   ```

3. The archived EvoSuite suites were measured with Temurin JDK 8 because EvoSuite 1.0.6 requires `tools.jar`. Their class-level metrics are under `results/metrics/`.
4. To repeat an API generation run, set `OPENAI_API_KEY` in a local `.env` file. This file is ignored by Git and must never be committed. API calls incur cost; the existing raw output and usage CSVs are retained for reproducibility.

## Paper and presentation

- IEEE-style paper source: `paper/main.tex`
- Presentation source and final artifacts: `presentation/`

Compile the paper with a LaTeX distribution from `paper/`. The final PDF is written to `paper/output/paper_final.pdf`. The final deck is `presentation/slides_final.pptx` with an exported PDF at `presentation/slides_final.pdf`.
