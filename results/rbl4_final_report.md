# RBL-4 Final Execution Report

## Scope

GPT-4o-mini (`gpt-4o-mini-2024-07-18`) was run with the recorded zero-shot protocol on 63 HumanEval-Java SUTs. EvoSuite is an operational comparator only, never a student-test proxy.

## GPT execution evidence

- Initial API generation: **63/63** successful calls; cost **$0.030982**.
- One permitted repair invocation: **55** API repair records; cost **$0.036773**.
- Executable final suites: **14/63**; assertion failures: **47**; compilation failures: **2**.
- Aggregate GPT branch coverage: **18.90%** (144/762).
- Aggregate GPT mutation score: **16.21%** (135/833).

## RQ results

- **RQ1:** not supported (one-sided Wilcoxon p=0.942967).
- **RQ2 floor (4.00%):** aggregate score is above the floor, but the per-SUT one-sided Wilcoxon result is not supported (p=0.952447).
- **RQ2 target (40.21%):** not supported (p=0.997231).
- **RQ4:** dual success is 13/63 (20.63%); not supported for a majority (exact binomial p=1).
- **RQ5:** execution failure patterns are descriptive: 14 pass, 47 assertion failures, 2 compilation failures.

## RQ3 paired GPT vs archived EvoSuite tests

| Budget | Metric | Paired / ranked N | GPT mean | EvoSuite mean | Delta pp | Raw p | Holm p | Rank-biserial | Conclusion |
| --- | --- | ---: | ---: | ---: | ---: | ---: | ---: | ---: | --- |
| 1m | branch | 14 / 2 | 98.09% | 99.40% | -1.32 | 0.179712 | 0.898562 | -1.000 | No significant difference |
| 1m | mutation | 13 / 7 | 88.21% | 79.14% | 9.07 | 0.204084 | 0.898562 | 0.536 | No significant difference |
| 3m | branch | 14 / 2 | 98.09% | 99.40% | -1.32 | 0.179712 | 0.898562 | -1.000 | No significant difference |
| 3m | mutation | 13 / 7 | 88.21% | 78.20% | 10.01 | 0.236724 | 0.898562 | 0.500 | No significant difference |
| 5m | branch | 14 / 2 | 98.09% | 99.40% | -1.32 | 0.179712 | 0.898562 | -1.000 | No significant difference |
| 5m | mutation | 13 / 7 | 88.21% | 82.40% | 5.81 | 0.0625089 | 0.375053 | 0.786 | No significant difference |

## EvoSuite measurement evidence

| Budget | Passing suites | Branch coverage | Mutation score |
| --- | ---: | ---: | ---: |
| 1 minute(s) | 63/63 | 90.29% (688/762) | 73.23% (610/833) |
| 3 minute(s) | 63/63 | 95.80% (730/762) | 76.59% (638/833) |
| 5 minute(s) | 63/63 | 99.34% (757/762) | 82.11% (684/833) |

## Interpretation boundary

EvoSuite is an operational technical comparator, not a proxy for student-written tests. The student benchmark remains deferred because comparable per-SUT measurements are unavailable.
