# EvoSuite Pilot Run Feasibility Report (63 SUT Classes)

This report presents the feasibility measurement results for generating unit tests using **EvoSuite** across three different time budgets (**1-minute**, **3-minute**, and **5-minute**). 

The evaluation was performed on **63 System Under Test (SUT)** classes from the HumanEval dataset.

---

## 📊 Summary Comparison

| Metric | 1-Minute Budget | 3-Minute Budget | 5-Minute Budget |
| :--- | :---: | :---: | :---: |
| **Total SUT Classes** | 63 | 63 | 63 |
| **Generated Test Files** | 63 | 63 | 63 |
| **JaCoCo Branch Coverage (SUT)** | **90.49%** (704/778) | **95.89%** (746/778) | **99.36%** (773/778) |
| **PITest Mutation Score** | **91.18%** (775/850) | **91.88%** (781/850) | **92.47%** (786/850) |
| **Total Test Cases** | 398 | 417 | 432 |
| **Total Mutations Generated** | 850 | 850 | 850 |
| **Mutations Killed** | 775 | 781 | 786 |
| **Execution Time (Generation)** | ~3.5 minutes | ~8.3 minutes | ~12.6 minutes |

---

## 📈 Key Findings & Trends

1. **Branch Coverage Improvement**: 
   - Raising the EvoSuite time budget per class yields a substantial increase in SUT branch coverage, starting from **90.49%** (1m) and reaching an outstanding **99.36%** (5m).
   - This shows that EvoSuite's evolutionary search algorithm benefits heavily from more search time to find inputs that cover deep, nested conditional branches.

2. **Mutation Score Progression**:
   - The mutation score increased from **91.18%** to **92.47%**.
   - As EvoSuite gets more time, it not only covers more branches but also generates more diverse assertions that kill previously surviving mutants.

3. **Performance & Scalability**:
   - Thanks to parallel generation using **16 CPU cores** and **8GB of allocated memory**, EvoSuite was able to process all 63 classes very efficiently.
   - The entire 5-minute search budget for 63 classes completed in just **12.6 minutes** of wall-clock time.

---

## ⚙️ Methodology & Configuration

- **Java Environment**: EvoSuite tests were generated using **JDK 8** 
- **Parallel Settings**: 16 cores, total 8000MB memory allocated (500MB per core limit satisfied).
- **Separate ClassLoader Fix**: Continuous test generation test suites were post-processed using `fix_evosuite_classloader.py` to set `separateClassLoader = false`. This resolved the incompatibility between EvoSuite's custom classloader isolation and PITest's mutation agent.
- **PITest Exclusions**:
  - **FIND_ZERO**: Excluded because it involves complex polynomial equations that can trigger infinite loops and timeouts during mutation testing.
  - **PRIME_FIB**: Excluded because computing very large Fibonacci prime numbers causes high runtime overhead.
  - **IS_MULTIPLY_PRIME**: Excluded because it contains three nested loops that timeout under mutation analysis.
