# Consolidation Provenance

**Recorded:** 2026-07-16

The canonical workspace is `SE1944_LLM_Unit_Test_Generation`. It consolidates the two downloaded branch snapshots without overwriting the current scripts or team-synthesis documents.

| Source snapshot | Retained contribution in the canonical workspace |
| --- | --- |
| `SE1944-compare-team-synthesis-19-06-2026` | GPT/API historical results, Pilot artefacts, EvoSuite 1/3/5-minute results, and team synthesis documents. Equivalent copies were already present in the canonical workspace, so no overwrite was required. |
| `SE1944-compare-run-pilot` | `results/evosuite_pilot_results.md` and the previously missing archived EvoSuite suites at 10/15/30/60 minutes. |

## Imported EvoSuite archives

The following directories were copied byte-for-byte from `SE1944-compare-run-pilot` after verifying that no destination directory existed:

- `experiments/rbl-project/archive/evosuite_10p` — 126 files
- `experiments/rbl-project/archive/evosuite_15p` — 126 files
- `experiments/rbl-project/archive/evosuite_30p` — 126 files
- `experiments/rbl-project/archive/evosuite_60p` — 126 files

The existing canonical archives `evosuite_1p`, `evosuite_3p`, and `evosuite_5p`, plus GPT archive runs, were retained unchanged. The two source snapshots are also retained as read-only fallback copies; they were not deleted.
