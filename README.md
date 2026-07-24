# Evaluating Zero-Shot GPT-4o-Mini for Java Unit Test Generation: Execution Validity and Branch Coverage

[![Course: SE1944](https://img.shields.io/badge/Course-SE1944%20Software%20Testing-blue.svg)](https://github.com/Khenggg/SE1944_LLM_Unit_Test_Generation)
[![Python: 3.10](https://img.shields.io/badge/Python-3.10-blue.svg)](https://www.python.org/)
[![Java: 8 (Temurin)](https://img.shields.io/badge/Java-8%20(Temurin)-orange.svg)](https://adoptium.net/)
[![Build: Passed](https://img.shields.io/badge/Validation-100%25%20Passed-brightgreen.svg)](results/rbl4_validation.md)

---

## 📌 Executive Summary

This repository contains the full empirical research package, raw data logs, statistical analysis pipeline, research paper, and presentation deck for **SE1944 (Software Testing and Research-Based Learning - Group 01)**.

The study investigates the execution validity, branch coverage, and mutation score of unit test suites generated zero-shot by **GPT-4o-mini** (`gpt-4o-mini-2024-07-18`) on **63 Java target functions** from the *HumanEval-Java* benchmark, comparing performance against an operational baseline of **EvoSuite 1.0.6** at 1-minute, 3-minute, and 5-minute budgets.

### Key Empirical Findings

1. **High API Reliability, Low Execution Validity:** 
   While OpenAI API calls achieved a **100% (63/63)** response rate, only **22.2% (14/63)** of final test suites were fully executable (passing all assertions and compilation). Assertion failures dominated invalid outcomes (**47/63** suites, 74.6%).
2. **Unconditioned Corpus Coverage:** 
   Across the unconditioned 63-SUT corpus, GPT-4o-mini achieved an aggregate branch coverage of **18.90%** (144/762 branches) and mutation score of **16.21%** (135/833 mutants).
3. **Pass-Conditioned Parity with EvoSuite (RQ3):** 
   On the 14 SUTs where both tools produced executable suites, paired Wilcoxon signed-rank tests with Holm correction showed **no statistically significant difference** ($p_{adj} > 0.05$) between GPT-4o-mini and EvoSuite across all time budgets for both branch coverage (GPT 98.09% vs EvoSuite 99.40%) and mutation score (GPT 88.21% vs EvoSuite 78.20%–82.40%).

---

## 🗂️ Project Repository Layout

```text
SE1944_LLM_Unit_Test_Generation/
├── CONTRIBUTION.md                   # Formal Team Contribution Matrix & Percentage Breakdown
├── README.md                         # Project Overview & Reproduction Guide (This Document)
├── PROJECT_STRUCTURE.md              # High-Level Architecture & Directory Rules
│
├── data/                             # Raw Benchmark Source Data
│   └── raw/                          # HumanEval-Java 63 SUT Source Files & Metadata
│
├── docs/                             # Team Synthesis & Member Work Directories
│   ├── team-synthesis/               # Final RQs, Hypotheses, Work Allocations, & Proposals
│   ├── member-work/                  # Individual Member Literature Review (SLR) & Drafts
│   └── rbl-crawled/                  # Crawled RBL Reference Papers & Evidence Tables
│
├── experiments/                      # Test Execution & Measurement Environment
│   ├── human-eval-java/              # Original HumanEval-Java Benchmark Project
│   └── rbl-project/                  # Target Maven Project (JaCoCo, PITest, EvoSuite Archives)
│
├── paper/                            # Research Paper Sources & LaTeX Documents
│   ├── ieee-format/                  # IEEE Conference Format (main.tex, references.bib)
│   └── fisat-springer-format/        # Springer LNCS Format Version
│
├── presentation/                     # Presentation Source, Script, & Decks
│   ├── slides_final.pptx             # Final Presentation Deck for RBL-5A Defense
│   └── team_presentation_guide.md    # Rehearsal Guide, Scripts, & Q&A Defense Strategy
│
├── results/                          # Primary Evidence & Analysis Outputs
│   ├── summary.csv                   # Definitive Statistical Summary Table for all RQs
│   ├── rbl4_final_report.md          # Comprehensive Execution Report
│   ├── rbl4_validation.md            # Independent Automated Validation Report
│   ├── full_analysis.ipynb           # Reproducible Jupyter Analysis Notebook
│   ├── figures/                      # High-Resolution Publication Figures (300+ DPI)
│   └── metrics/                      # Detailed Per-Class JaCoCo & PIT CSV Metrics
│
└── scripts/                          # Automated Python Pipeline & Validation Utilities
    ├── rbl4_openai.py                # OpenAI API Zero-Shot Test Generation Pipeline
    ├── generate_rbl4_analysis.py     # Main Data Aggregation & Statistical Test Engine
    ├── generate_full_analysis_notebook.py  # Automated Analysis Notebook Generator
    ├── repair_generated_tests.py     # Single-Pass Execution Repair Engine
    └── validate_rbl4_results.py      # Independent Data Consistency Verifier
```

---

## 📑 Core Deliverables & Quick Links

| Deliverable | Description | Location / Link |
| :--- | :--- | :--- |
| **Final Execution Report** | Complete summary of API cost, validity rates, and RQ results | [`results/rbl4_final_report.md`](results/rbl4_final_report.md) |
| **Statistical Summary Table** | Full $p$-values, effect sizes, and RQ conclusions | [`results/summary.csv`](results/summary.csv) |
| **IEEE Paper (PDF)** | Final camera-ready academic paper | [`paper/ieee-format/build/main.pdf`](paper/ieee-format/build/main.pdf) |
| **Presentation Deck** | 9-slide presentation deck for final defense | [`presentation/slides_final.pptx`](presentation/slides_final.pptx) |
| **Presentation Guide** | Rehearsal script, roles, timing, and Q&A defense strategy | [`presentation/team_presentation_guide.md`](presentation/team_presentation_guide.md) |
| **Validation Report** | Automated integrity and provenance validation checks | [`results/rbl4_validation.md`](results/rbl4_validation.md) |
| **Contribution Matrix** | Team roles, percentage breakdown, and responsibilities | [`CONTRIBUTION.md`](CONTRIBUTION.md) |

---

## 📊 Summary of Research Hypotheses & Results

| RQ | Analysis Type | Hypothesized Threshold | GPT Value | Comparator | Result ($p$-value) | Conclusion |
| :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| **RQ1** | One-sample Wilcoxon | Branch Coverage $\ge 30.22\%$ | 18.90% | 30.22% | $p = 0.943$ | **`NOT_SUPPORTED`** |
| **RQ2_floor** | One-sample Wilcoxon | Mutation Score $\ge 4.00\%$ | 16.21% | 4.00% | $p = 0.952$ | **`NOT_SUPPORTED`** |
| **RQ2_target**| One-sample Wilcoxon | Mutation Score $\ge 40.21\%$ | 16.21% | 40.21% | $p = 0.997$ | **`NOT_SUPPORTED`** |
| **RQ3 (1m BC)**| Paired Wilcoxon (Holm) | GPT vs EvoSuite 1m Branch | 98.09% | 99.40% | $p_{adj} = 0.899$ | **`NO_SIGNIFICANT_DIFF`** |
| **RQ3 (1m MS)**| Paired Wilcoxon (Holm) | GPT vs EvoSuite 1m Mutation | 88.21% | 79.14% | $p_{adj} = 0.899$ | **`NO_SIGNIFICANT_DIFF`** |
| **RQ3 (3m BC)**| Paired Wilcoxon (Holm) | GPT vs EvoSuite 3m Branch | 98.09% | 99.40% | $p_{adj} = 0.899$ | **`NO_SIGNIFICANT_DIFF`** |
| **RQ3 (3m MS)**| Paired Wilcoxon (Holm) | GPT vs EvoSuite 3m Mutation | 88.21% | 78.20% | $p_{adj} = 0.899$ | **`NO_SIGNIFICANT_DIFF`** |
| **RQ3 (5m BC)**| Paired Wilcoxon (Holm) | GPT vs EvoSuite 5m Branch | 98.09% | 99.40% | $p_{adj} = 0.899$ | **`NO_SIGNIFICANT_DIFF`** |
| **RQ3 (5m MS)**| Paired Wilcoxon (Holm) | GPT vs EvoSuite 5m Mutation | 88.21% | 82.40% | $p_{adj} = 0.375$ | **`NO_SIGNIFICANT_DIFF`** |
| **RQ4** | Exact Binomial Test | Dual-Success Rate $> 50\%$ | 20.63% | 50.00% | $p = 1.000$ | **`NOT_SUPPORTED`** |
| **RQ5** | Descriptive Statistics | Failure Mode Partition | 14 Pass | 47 Fail Assert / 2 Fail Compile | N/A | **`Descriptive`** |

---

## ⚡ Reproduction Guide

Follow these steps to reproduce the statistical analysis, figures, notebook, and validation checks directly from the retained evidence CSVs:

### 1. Environment Setup

Ensure Python 3.10+ is installed. Create a virtual environment and install required packages:

```powershell
# Create virtual environment
python -m venv .venv

# Activate environment (PowerShell)
.venv\Scripts\Activate.ps1

# Install requirements
pip install pandas numpy scipy matplotlib jupyter nbconvert Pillow
```

### 2. Execute Analysis & Validation Pipeline

Run the automated pipeline to regenerate all derived statistics, figures, Jupyter analysis notebook, and run validation checks:

```powershell
# 1. Regenerate statistical summary & publication figures
.venv\Scripts\python.exe scripts\generate_rbl4_analysis.py

# 2. Regenerate reproducible Jupyter Notebook
.venv\Scripts\python.exe scripts\generate_full_analysis_notebook.py

# 3. Execute notebook in-place
.venv\Scripts\python.exe -m jupyter nbconvert --execute --to notebook --inplace results\full_analysis.ipynb

# 4. Run automated data integrity & validation checks
.venv\Scripts\python.exe scripts\validate_rbl4_results.py
```

### 3. Environment & Hardware Notes

- **Java Environment:** EvoSuite 1.0.6 requires **Eclipse Temurin JDK 8** because it depends on `tools.jar`.
- **OpenAI API Execution (Optional):** To re-run API generation from scratch, set `OPENAI_API_KEY` in a local `.env` file. *Note: Raw API logs and outputs are retained in `results/` to prevent unnecessary API costs.*

---

## 👥 Team Members & Roles (Group 01)

| STT | Member Name | Student ID | Role | Contribution (%) |
| :---: | :--- | :---: | :--- | :---: |
| **1** | **Lê Thế Khang** | *(Project Lead)* | Project Lead & Core Systems Integrator | **23%** |
| **2** | **Phạm An Khang** | | Research & Paper Lead Writer | **22%** |
| **3** | **Huỳnh Cao Phước** | | EvoSuite & Environment Owner | **19%** |
| **4** | **Đỗ Long Vỹ** | | API & Prompt Engineering Co-lead | **18%** |
| **5** | **Nguyễn Như Ý** | | Data & Pipeline Automation Co-lead | **18%** |

*For detailed task descriptions and work allocation breakdown, see [`CONTRIBUTION.md`](CONTRIBUTION.md) and [`docs/team-synthesis/rbl5a-work-allocation.md`](docs/team-synthesis/rbl5a-work-allocation.md).*

---

## 📄 License & Course Metadata

- **Course:** SE1944 — Software Testing and Research-Based Learning
- **Institution:** FPT University
- **Repository:** [https://github.com/Khenggg/SE1944_LLM_Unit_Test_Generation](https://github.com/Khenggg/SE1944_LLM_Unit_Test_Generation)
