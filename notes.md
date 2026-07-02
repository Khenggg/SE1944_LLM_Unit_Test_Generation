# Pilot Experiment Notes (Tuần 7)

## Random Seed
- **Seed:** `42`
- Used to randomly select 10% (6 classes) from the 63 classes with $CC \ge 5$.

## Selected Pilot Classes
1. **CHECK_DICT_CASE** (CC = 12)
2. **COUNT_NUMS** (CC = 7)
3. **EXCHANGE** (CC = 6)
4. **GET_ODD_COLLATZ** (CC = 5)
5. **IS_NESTED** (CC = 6)
6. **PROD_SIGNS** (CC = 6)

## Inter-Annotator Agreement (IAA)
- **IAA:** Not Applicable.
- **Justification:** The project evaluates branch coverage and mutation scores using automated tools (JaCoCo and PITest). The oracle ground truth (Correct Java implementations and Student tests) is sourced directly from the peer-reviewed `HumanEval-Java` benchmark, eliminating any subjective manual annotation.
