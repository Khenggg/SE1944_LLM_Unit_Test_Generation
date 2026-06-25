# Project Structure

This repository is organized by purpose:

```text
docs/
  rbl-crawled/          Raw crawled RBL reference documents.
  team-synthesis/       Final team-level proposal, RQ, GAP, evidence table, and slide outline.
  member-work/          Individual member SLR and experiment drafts.

experiments/
  human-eval-java/      Original HumanEval-Java benchmark project.
  rbl-project/          Experiment/Maven project used for generated tests and metrics.

scripts/                Python automation scripts for API calls, setup, and metrics parsing.

presentation/           PowerPoint generation script and Node dependencies.

outputs/
  presentations/        Final generated PPTX plus rendered QA PDF/PNG previews.
```

Suggested rules:

- Put shared final documents in `docs/team-synthesis/`.
- Put individual drafts or SLR material in `docs/member-work/<member>/`.
- Put runnable benchmark or Maven projects in `experiments/`.
- Put reusable automation scripts in `scripts/`.
- Put generated deliverables in `outputs/`.
