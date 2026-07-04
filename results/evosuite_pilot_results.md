# EvoSuite Pilot Run Feasibility Report (63 SUT Classes)

This report presents the feasibility measurement results for generating unit tests using **EvoSuite** across seven different time budgets: **1-minute**, **3-minute**, **5-minute**, **10-minute**, **15-minute**, **30-minute**, and **60-minute**.

The evaluation was performed on **63 System Under Test (SUT)** classes from the HumanEval dataset.

---

## 📊 Summary Comparison

| Metric | 1-Min | 3-Min | 5-Min | 10-Min | 15-Min | 30-Min | 60-Min |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| **Total SUT Classes** | 63 | 63 | 63 | 63 | 63 | 63 | 63 |
| **Generated Test Files** | 63 | 63 | 63 | 63 | 63 | 63 | 63 |
| **JaCoCo Branch Coverage (SUT)** | **90.49%**<br>(704/778) | **95.89%**<br>(746/778) | **99.36%**<br>(773/778) | **99.36%**<br>(773/778) | **99.49%**<br>(774/778) | **99.61%**<br>(775/778) | **99.61%**<br>(775/778) |
| **PITest Mutation Score** | **91.18%**<br>(775/850) | **91.88%**<br>(781/850) | **92.47%**<br>(786/850) | **92.71%**<br>(788/850) | **91.99%**<br>(758/824) | **92.48%**<br>(762/824) | **92.48%**<br>(762/824) |
| **Total Mutations Generated** | 850 | 850 | 850 | 850 | 824 | 824 | 824 |
| **Mutations Killed** | 775 | 781 | 786 | 788 | 758 | 762 | 762 |
| **PITest Exclusions** | Group A | Group A | Group A | Group A | Group B | Group B | Group B |

> [!NOTE]
> **PITest Exclusion Groups:**
> - **Group A (3 classes)**: `FIND_ZERO`, `PRIME_FIB`, `IS_MULTIPLY_PRIME`
> - **Group B (4 classes)**: `FIND_ZERO`, `PRIME_FIB`, `IS_MULTIPLY_PRIME`, and `GET_MAX_TRIPLES`

---

## 📈 Key Findings & Trends

1. **Branch Coverage Plateau**: 
   - Raising the EvoSuite time budget per class yields a substantial increase in SUT branch coverage initially, jumping from **90.49%** (1m) to **99.36%** (5m).
   - Past 5 minutes, the gains become marginal: **99.49%** at 15 minutes, and finally reaching **99.61%** (775/778 branches) at 30 minutes.
   - The 60-minute run achieved the exact same **99.61%** coverage as the 30-minute run. This indicates a clear coverage plateau where the remaining 3 uncovered branches cannot be reached by EvoSuite's search space regardless of the time budget.

2. **Mutation Score Evolution**:
   - The mutation score steadily increases from **91.18%** (1m) to **92.71%** (10m) under Group A exclusions.
   - Starting from 15 minutes, EvoSuite generates extremely large input values for `GET_MAX_TRIPLES` that cause PIT's isolated minions to crash with *"tests did not pass without mutation"*, requiring its exclusion (Group B).
   - Under Group B exclusions, the mutation score peaks at **92.48%** at 30 minutes. The 60-minute budget yields identical performance (**92.48%**), confirming that the mutation score also plateaus.

3. **Performance & Resource Scalability**:
   - Running the experiment on **16 CPU cores** and **8GB of allocated memory** allows high efficiency.
   - Although the total generation time scales up with budget, parallel execution keeps the wall-clock time reasonable.
   - The 60-minute run took **03:27 hours** of total generation time.

---

## ⚙️ Methodology & Configuration

- **Java Environment**: EvoSuite tests were generated using **JDK 8** (compatibility requirement) and evaluated using **JDK 21**.
- **Parallel Settings**: 16 cores, total 8000MB memory allocated (500MB per core limit satisfied).
- **Separate ClassLoader Fix**: Test suites were post-processed to disable `separateClassLoader = false` to allow seamless integration with PITest's mutation agent.
- **PITest Exclusions**:
  - **FIND_ZERO**: Excluded because it involves complex polynomial equations that can trigger infinite loops and timeouts during mutation testing.
  - **PRIME_FIB**: Excluded because computing very large Fibonacci prime numbers causes high runtime overhead.
  - **IS_MULTIPLY_PRIME**: Excluded because it contains three nested loops that timeout under mutation analysis.
  - **GET_MAX_TRIPLES**: Excluded at budgets $\ge$ 15 minutes because EvoSuite's longer search time generates inputs that cause PITest's test verification phase to crash.
