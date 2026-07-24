# RBL-4 Validation Report

## Overall Assessment: Share with caveats

The live GPT evidence, retained EvoSuite archive measurements, and derived values reconcile. RQ3 paired Wilcoxon tests are available, but the GPT execution gate limits paired sample size and leaves few non-zero branch differences.

## Checks
- **PASS - GPT SUT coverage:** 63 rows, 63 distinct SUTs
- **PASS - Suite status coverage:** 63 suite-status rows
- **PASS - Suite-status partition:** {'FAIL_ASSERTION': 47, 'PASS': 14, 'FAIL_COMPILE': 2}
- **PASS - Initial API run:** 63 rows; all SUCCESS=True
- **PASS - Repair API run:** 55 rows; all REPAIRED=True
- **PASS - GPT metric numerators:** branches=144/762; mutations=135/833
- **PASS - EvoSuite 1-minute SUT coverage:** 63 rows; all pass=True
- **PASS - EvoSuite 3-minute SUT coverage:** 63 rows; all pass=True
- **PASS - EvoSuite 5-minute SUT coverage:** 63 rows; all pass=True
- **PASS - RQ3 paired inference:** 6 paired Wilcoxon rows with Holm adjustment
- **PASS - Notebook execution:** 4 executed code cells with outputs
- **PASS - Figures:** 3 PNG figures; >=300 DPI metadata and width checks=True

## Required caveat

Do not describe EvoSuite as student-written data. RQ3 is conditioned on the GPT suites that passed; report its paired and ranked sample sizes alongside p-values and Holm adjustment.
