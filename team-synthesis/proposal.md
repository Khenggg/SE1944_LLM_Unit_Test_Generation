# Research Proposal: LLM for Unit Test Case Generation
**Team:** Group Synthesis
**Members:** Le-The-Khang, Pham-An-Khang, Phuoc, Nhu-Y, Do Long Vy
**Topic code:** 003
**Submission Date:** 2026-06-16
**Version:** 1.0
**Status:** Pending approval

## 2. Research Problem Statement

### 2.1 Context & Importance
Automated unit test generation is critical for ensuring software reliability while reducing developer effort. While traditional Search-Based Software Testing (SBST) like EvoSuite can achieve high coverage, the resulting tests are often difficult for humans to read and maintain. The recent rise of Large Language Models (LLMs) offers a promising alternative that could combine high coverage with human-like readability.

### 2.2 State of the Art
Recent studies have explored LLMs for test generation across various benchmarks. For instance, Huang et al. (2026) benchmarked state-of-the-art models on real-world functions, establishing a baseline of 30.22% branch coverage and 40.21% mutation score. Similarly, Wang et al. (2026) demonstrated that high coverage alone is insufficient, noting that tests with 100% coverage can sometimes yield only a 4% mutation score. 

### 2.3 GAP
Current LLM-based unit-test-generation studies evaluate models on public benchmarks, open-source repositories, or industrial code. However, the literature does not provide a paired comparison between GPT-4o-generated unit tests and student-written unit tests on the exact same medium-complexity Java/Python functions (CC = 5-15). 
**GAP type:** GAP-D (Dataset / comparison baseline) & GAP-M (Metric). Supported by N = 39 papers in the evidence table.

### 2.4 Motivation
If this gap is not addressed, it remains unclear whether LLM-generated tests are practically competitive with tests written by students on the same code units under the same measurement pipeline. Addressing this gap will validate the educational and practical viability of using GPT-4o for unit testing.

## 3. Related Work

### 3.1 Overview
| Paper | Tool/LLM | Dataset (size) | Metric | Best result | Main limitation |
|---|---|---|---|---|---|
| Huang et al. (2026) | GPT-4, Claude | ULT Benchmark | Branch Cov, Mutation | 30.22% BC, 40.21% MS | No student-written baseline |
| Wang et al. (2026) | MUTGEN | Automated Baselines | Mutation Score | 4% Floor MS | No student-written baseline |
| Doe et al. (2025) | GPT-4o | Defects4J | Mutation Score | High MS on 6 classes | Dataset is limited to 6 classes |

### 3.2 Pattern Analysis
Generally, state-of-the-art LLMs (like GPT-4o) demonstrate strong capabilities in generating syntactically correct tests, but they struggle with complex environmental setups, leading to compilation failures. Furthermore, traditional metrics like branch coverage are increasingly paired with mutation testing to ensure the tests actually detect faults.

### 3.3 GAP Mapping
| GAP Type | Evidence (number of supporting papers) | Status |
|---|---|---|
| GAP-D (Student Baseline) | 39 | Confirmed |
| GAP-M (Dual Metric) | 22 | Confirmed |

## 4. Research Questions

> **RQ1:** Do GPT-4o-generated unit tests achieve a branch coverage of >=30.22% on the selected medium-complexity Java and Python functions?
**Claim type:** Absolute threshold
**H0:** GPT-4o DOES NOT achieve branch coverage >= 30.22%
**H1:** GPT-4o ACHIEVES branch coverage >= 30.22%
**Metric:** Branch Coverage (JaCoCo)
**Threshold:** 30.22% - Case 1: Derived from Paper [010] (Huang et al., 2026)
**Statistical test:** One-sample Wilcoxon signed-rank test (α = 0.05)

> **RQ2:** Do GPT-4o-generated unit tests achieve a mutation score of >=40.21% (target) on the exact same selected functions?
**Claim type:** Absolute threshold
**H0:** GPT-4o DOES NOT achieve mutation score >= 40.21%
**H1:** GPT-4o ACHIEVES mutation score >= 40.21%
**Metric:** Mutation Score (Pitest)
**Threshold:** 40.21% - Case 1: Derived from Paper [010] (Huang et al., 2026)
**Statistical test:** One-sample Wilcoxon signed-rank test (α = 0.05)

> **RQ3:** Is there a statistically significant difference in branch coverage and mutation score when comparing GPT-4o-generated tests to student-written tests?
**Claim type:** Comparative
**H0:** There is NO difference in coverage/mutation score between GPT-4o and student tests.
**H1:** There IS a difference in coverage/mutation score between GPT-4o and student tests.
**Metric:** Branch Coverage & Mutation Score
**Threshold:** N/A (Comparative)
**Statistical test:** Paired Wilcoxon signed-rank test (two-tailed) (α = 0.05)

## 5. Experiment Protocol

### 5.1 Pipeline Overview
1.  **Dataset Preparation:** Extract 18 medium-complexity functions (CC 5-15) from HumanEval-Java.
2.  **Prompt Construction:** Feed focal method, class context, and zero-shot prompt into GPT-4o.
3.  **LLM Inference:** Generate tests using `gpt-4o-2024-05-13`.
4.  **Post-Processing:** Extract compilable Java code and place in `src/llm-test/java`.
5.  **Execution:** Compile and run JaCoCo and Pitest.

### 5.2 Dataset
**Dataset name:** HumanEval-Java | **Source:** Local repository | **Size:** 18 functions | **Domain:** Algorithmic
**Preprocessing:** Filtered for CC = 5-15 using Lizard.
**Reason for selection:** Addresses GAP-D to allow strict paired comparison.

### 5.3 LLM/Tool Configuration
**Model:** `gpt-4o-2024-05-13`
**Hyperparameters:** temperature = 0.0, top_p = 1.0, max_tokens = 2048
**Prompting strategy:** Zero-shot
**Prompt template:** "Write a JUnit 4 test class for the following Java function to maximize branch coverage and mutation score. Return only the Java code. Function: [FOCAL_METHOD]"
**Reason for configuration:** Temperature 0 ensures deterministic and reproducible outputs.

### 5.4 Measurement
**Metric:** Branch Coverage & Mutation Score | **Tool:** JaCoCo & Pitest | **Ground truth source:** Student-written tests in `src/test/java/humaneval`

### 5.5 Baseline
**Name:** EvoSuite 1.2.0 | **Configuration:** Executed via CLI with Java 8 on target classes.

### 5.6 Statistical Analysis Plan
**Test:** Wilcoxon signed-rank test - two-tailed - α = 0.05
**Reason for selecting test:** Coverage and mutation scores are non-normally distributed.
**Effect size:** Vargha and Delaney's Â12
**N and power:** N = 18. Power analysis confirms >= 0.80 for large effect sizes.

## 6. Evaluation Plan

### 6.1 Evaluation Criteria Table
| RQ | Metric | Threshold | Test | H0 rejected when... | Is a negative result meaningful? |
|---|---|---|---|---|---|
| RQ1 | Branch Cov | 30.22% | Wilcoxon | p < 0.05 and median >= 30.22% | Yes, reveals pipeline compilation issues |
| RQ2 | Mutation | 40.21% | Wilcoxon | p < 0.05 and median >= 40.21% | Yes, reveals weak assertions in LLM tests |

### 6.2 Interpreting Outcome Combinations
- **Double Positive:** LLM beats both thresholds. Conclusion: GPT-4o is highly viable for unit test generation out-of-the-box.
- **Mixed:** Beats Branch Cov but fails Mutation Score. Conclusion: LLMs write tests that execute code but fail to assert correct behavior.
- **Double Negative:** Fails both. Conclusion: Zero-shot GPT-4o cannot handle the complexity of the dataset, mostly due to compilation failures.

## 7. Threats to Validity

### 7.1 Internal Validity
**Threat:** OpenAI might silently update the model.
**Mitigation:** Pin the exact model version to `gpt-4o-2024-05-13`.

### 7.2 External Validity
**Threat:** Results might not generalize beyond algorithmic Java functions.
**Mitigation:** Explicitly state the scope limitation (algorithmic medium CC functions) in the conclusion.

### 7.3 Construct Validity
**Threat:** Branch coverage does not equal fault detection capability.
**Mitigation:** Utilize Mutation Score (Pitest) alongside Branch Coverage as a dual-metric evaluation.

### 7.4 Conclusion Validity
**Threat:** Small sample size (N=18) might underpower statistical tests.
**Mitigation:** Apply exact non-parametric tests (Wilcoxon) rather than t-tests, and report Vargha-Delaney effect size.

## 8. Timeline & Resources

### 8.0 Role Assignment
| Role | Member | Responsibility in experiment |
|---|---|---|
| PL | Le-The-Khang | Coordinate progress, review proposal consistency |
| DG | Do Long Vy | Collect + clean dataset, create ground truth, calculate IAA |
| LR | Phuoc | Configure API, run experiment script, batch processing |
| MS | Nhu-Y | Implement metrics, run statistical tests, calculate effect size |
| RW | Pham-An-Khang | Write §1, §7, intro, conclusion; assist DG with §3; create figures |

### 8.1 Resource Inventory
| Resource | Status | Owner | Note |
|---|---|---|---|
| Dataset | ✅ | DG | HumanEval-Java filtered |
| API key | ✅ | LR | OpenAI GPT-4o |
| Compute | ✅ | LR | Local execution |

### 8.3 Detailed Timeline (Weeks 5-10)
| Week | Activity | Owner | Checkpoint |
|---|---|---|---|
| **5** | Verify + download dataset | DG | `data/raw/` folder |
| **5** | Setup API, test 1 sample call | LR | `test_api.py` runnable |
| **5** | Implement draft metric script | MS | `compute_metric.py` draft |
| **6** | Submit Proposal | PL | `proposal.md` submitted |
| **7** | Run LLM on pilot sample (2 funcs) | LR | `results/pilot_llm_output.csv` |
| **7** | Calculate pilot metric | MS | `results/pilot_analysis.ipynb` |
| **8** | Full experiment batch run | LR | `results/full_llm_output.csv` |
| **8** | Calculate full metrics | MS | `results/full_analysis.ipynb` |
| **9-10**| Write paper + present | All | Final Defense |

### 8.4 Contingency Plan
**If API rate limited:** Split into batches, run overnight.
**If Week 7 pilot reveals technical issue:** Submit Amendment within 24 hours.
