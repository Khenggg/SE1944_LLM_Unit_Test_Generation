# RBL-2 Revised Checklist After Feedback

## Fixed items

- [x] Evidence file name standardized as `SLR/evidence-table.md`.
- [x] Primary GAP is one GAP only: `GAP-M`.
- [x] Secondary GAP is `GAP-T`.
- [x] ACM010 and ACM011 are treated as background/survey sources, not primary empirical evidence.
- [x] P3 weakness is acknowledged: current evidence table is weak for absolute numerical thresholds.
- [x] Comparative design is used to avoid unsupported threshold values.
- [x] Dataset source is clarified: ULT / UnLeakedTestBench from ACM007.
- [x] Model/tool cost plan is clarified: GPT-4o mini default, 10-16 calls maximum.
- [x] Operating environment is clarified: Windows/VS Code or Colab fallback; Python, pytest, coverage.py, mutmut.
- [x] Feasibility warnings are limited to 2 and both have mitigation.

## Remaining before final submission

- [ ] Copy final included paper PDFs into `SLR/papers/`.
- [ ] During experiment stage, create `experiment/selected-functions.md`.
- [ ] During experiment stage, create `experiment/prompts/`.
- [ ] During experiment stage, create `experiment/results/raw-results.csv`.
