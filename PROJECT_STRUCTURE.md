# Project Structure & Architecture Guide

This document describes the organization, file locations, and structural guidelines for the **SE1944_LLM_Unit_Test_Generation** repository.

```text
SE1944_LLM_Unit_Test_Generation/
├── CONTRIBUTION.md                   # Formal Team Contribution Matrix & Percentage Breakdown
├── README.md                         # Primary Project Documentation & Reproduction Guide
├── PROJECT_STRUCTURE.md              # Architecture & Folder Structure Guide (This Document)
├── .gitignore                        # Git Exclusion Rules
│
├── data/                             # Raw Benchmark Source Data
│   └── raw/                          # HumanEval-Java 63 SUT Source Files & Metadata
│
├── docs/                             # Team Synthesis, Proposals & Member Work
│   ├── team-synthesis/               # Final Proposals, RQs, Hypotheses, Work Allocations
│   ├── member-work/                  # Individual SLR Research & Personal Work Folders
│   └── rbl-crawled/                  # Crawled Literature & Reference Papers
│
├── experiments/                      # Test Execution & Measurement Environment
│   ├── human-eval-java/              # Original HumanEval-Java Benchmark Suite
│   └── rbl-project/                  # Target Maven Project (JaCoCo, PITest, EvoSuite Archives)
│
├── paper/                            # Academic Paper Sources & LaTeX Assets
│   ├── ieee-format/                  # IEEE Conference LaTeX Source & Output PDFs
│   └── fisat-springer-format/        # Springer LNCS LaTeX Source & Formatted Docs
│
├── presentation/                     # Defense Presentation Source, Scripts & Guides
│   ├── slides_final.pptx             # Final Presentation Deck for RBL-5A Defense
│   ├── slides_final.pdf              # Exported Presentation PDF
│   └── team_presentation_guide.md    # Script, Roles, Timing, and Defense Strategy
│
├── results/                          # Primary Evidence & Data Analysis Outputs
│   ├── summary.csv                   # Definitive Statistical Summary Table for all RQs
│   ├── rbl4_final_report.md          # Comprehensive Execution Report
│   ├── rbl4_validation.md            # Independent Automated Validation Report
│   ├── full_analysis.ipynb           # Reproducible Jupyter Analysis Notebook
│   ├── figures/                      # High-Resolution Publication Figures (300+ DPI)
│   └── metrics/                      # Detailed Per-Class JaCoCo & PIT CSV Metrics
│
└── scripts/                          # Automated Python Pipeline & Validation Utilities
    ├── rbl4_openai.py                # OpenAI API Zero-Shot Test Generation Pipeline
    ├── generate_rbl4_analysis.py     # Main Data Aggregation & Statistical Engine
    ├── generate_full_analysis_notebook.py  # Notebook Generator
    ├── repair_generated_tests.py     # Single-Pass Execution Repair Engine
    └── validate_rbl4_results.py      # Independent Data Consistency Verifier
```

## Organizational Guidelines

1. **Shared Final Documents:** Always place team-approved specifications, proposals, and allocations under `docs/team-synthesis/`.
2. **Member Work:** Keep personal research, drafts, and individual SLR notes inside `docs/member-work/<member_name>/`.
3. **Execution Projects:** Keep runnable Java / Maven / EvoSuite test harnesses under `experiments/`.
4. **Automation Scripts:** Place all reusable Python scripts under `scripts/`.
5. **Primary Data Outputs:** Retain raw execution logs, summary CSVs, and rendered figures inside `results/`.
