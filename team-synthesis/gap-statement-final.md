# 1. Evidence Table & Distribution

| Evidence Group | Count among 36 unique primary studies | Remarks |
|---|---:|---|
| Directly controls for medium cyclomatic complexity (CC=5–15) | 1/36 | Strict population control for medium cyclomatic complexity is largely absent (only present in Paper 033). Most benchmarks skew toward ultra-simple or legacy enterprise code. |
| Direct comparison with student-written tests | 1/36 | Only one study (Paper 009) explicitly addresses student programming assignments, highlighting a severe lack of research tailored to educational contexts. |
| Evaluates against human or developer-written tests | 5/36 | Comparisons exist (Paper 001, Paper 004, etc.) against professional developers, but this does not accurately represent a student-written baseline. |
| Utilizes coverage / code coverage / branch coverage | 28/36 | Structural coverage remains the most universally adopted evaluation metric in the extracted studies. |
| Utilizes mutation score / mutation testing / mutant info | 16/36 | Mutation testing appears less frequently and is predominantly found in studies proposing feedback-driven or mutation-guided methodologies. |
| Simultaneously evaluates branch coverage and mutation score using GPT-4o | Present but fragmented | Strong evidence exists (e.g., ULT benchmark), but these studies typically rely on custom corporate or open-source benchmarks without student-written baselines. |

---

# 2. Primary Gap (Gap D) — Dataset & Complexity Focus

**Primary Gap (Gap D):**  
Most existing research on LLM-based automated unit test generation suffers from a significant dataset and complexity control gap. Current empirical studies typically evaluate models on two extreme types of datasets: overly simple benchmarks (e.g., HumanEval) or highly complex legacy enterprise codebases. There is a complete lack of studies that strictly control for moderate-complexity functions with Cyclomatic Complexity ranging from 5 to 15.

More critically, the evaluation of LLM performance (particularly GPT-4o) in software engineering education contexts remains underexplored, as existing datasets lack a direct baseline comparison against student-written test cases.

---

# 3. Secondary Gaps (Gap M) — Methodological & Metric Focus

After identifying the core dataset issue (Gap D), this study further highlights secondary gaps related to methodology and evaluation metrics (Gap M):

## Gap M.1 — Methodological Gap
Existing literature tends to treat GPT-based LLMs as a monolithic system without explicitly defining or controlling prompt engineering strategies such as zero-shot prompting, chain-of-thought prompting, or iterative feedback loops. This reduces experimental consistency and reproducibility.

## Gap M.2 — Metric Gap
Although structural coverage metrics are widely reported (28/36 studies), fewer studies incorporate mutation score as a measure of real fault detection capability (16/36 studies). Moreover, very few works systematically combine both branch coverage and mutation score within the same experimental framework.

---

# 4. Final Gap Statement (Reframed under D and M)

Existing empirical studies demonstrate that Large Language Models (LLMs) can generate high-coverage unit tests when supported by advanced prompting techniques or iterative feedback mechanisms. However, a core research gap (Gap D) remains regarding the absence of a rigorously controlled dataset with moderate cyclomatic complexity (CC = 5–15) in Java and Python, as well as the lack of a direct baseline based on student-written test cases in academic settings.

In addition, methodological limitations (Gap M) persist, as prior work does not clearly isolate the effects of different prompt strategies (e.g., zero-shot vs. iterative prompting) and rarely employs a unified evaluation framework combining both branch coverage and mutation score to comprehensively assess the fault detection capability of GPT-4o-generated tests.

---

# 5. Revised Research Direction

To address these gaps, the proposed research (e.g., project SE1944) will follow this direction:

## Addressing Gap D (Core Focus)
- Construct a standardized dataset of Java and Python functions extracted from student programming assignments.
- Ensure strict control of Cyclomatic Complexity within the range $5 \le CC \le 15$.
- Collect corresponding student-written test suites as the primary baseline for comparison.

## Addressing Gap M (Supporting Focus)
- Structure GPT-4o test generation into explicit prompt strategies (zero-shot, few-shot, iterative prompting, etc.).
- Conduct empirical evaluation with paired statistical analysis.
- Use two primary metrics:
  - Branch Coverage  
  - Mutation Score  
- Additionally include:
  - Compilation success rate  
  - Test pass/fail outcomes  

This enables a comprehensive evaluation of GPT-4o’s unit test generation capability in an educational software engineering context.