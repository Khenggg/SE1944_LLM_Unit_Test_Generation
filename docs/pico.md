# PICO

| PICO | Content |
| --- | --- |
| Population | Medium-complexity Java or Python functions/classes |
| Intervention | GPT-4 generated unit test cases |
| Comparison | Student-written manual unit test cases |
| Outcome | Branch coverage >= 80% and mutation score >= 60% |

## Notes

- In the later experiment phase, keep the same model and prompt version for all AI-generated tests.
- In the later experiment phase, keep manual tests independent from AI-generated tests.
- In the later experiment phase, record any repair or compile fix applied to generated tests.
- Java and Python are both in scope. Use the matching unit-test and metric tools for each language.

