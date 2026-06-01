# Statistical Hypotheses & Experimental Design

This document details the formal null and alternative hypotheses formulated for our empirical study, the choice of statistical testing, and our predicted outcomes mapped to the empirical findings of our 9 SLR papers.

---

## Statistical Framework: Wilcoxon Signed-Rank Test

Our evaluation uses the **Wilcoxon Signed-Rank Test** (a non-parametric statistical method) to evaluate the performance of GPT-4 against the baseline. 

### Why Wilcoxon?
1. **Non-Normal Distribution**: Code coverage and mutation scores are bounded metrics (0–100%) that violate normal distribution assumptions.
2. **Paired Observations**: We are evaluating paired samples (GPT-4 vs. manual test suites) tested on the **exact same** target functions.
3. **Robustness**: Non-parametric tests are highly robust against outliers and smaller sample sizes.

### Metric Definitions for Function *i*:
* $BC_{GPT4}(i)$ & $BC_{Manual}(i)$: Branch coverage achieved by GPT-4 and student manual suites, respectively.
* $MS_{GPT4}(i)$ & $MS_{Manual}(i)$: Mutation score achieved by GPT-4 and student manual suites, respectively.

---

## Formal Hypotheses Formulation

### Hypothesis Set 0: Branch Coverage Threshold
> **H00 (Null)**: The median branch coverage achieved by GPT-4 generated unit tests on medium-complexity Java/Python functions is strictly less than 80%.
> $$\text{H}_{00}: \text{median}(BC_{GPT4}) < 80\%$$
>
> **H00a (Alternative)**: The median branch coverage achieved by GPT-4 generated unit tests is greater than or equal to 80%.
> $$\text{H}_{00a}: \text{median}(BC_{GPT4}) \ge 80\%$$
>
> * **Statistical Test**: One-sample Wilcoxon signed-rank test against the fixed value of 80%.

---

### Hypothesis Set 1: Mutation Score Threshold
> **H01 (Null)**: The median mutation score achieved by GPT-4 generated unit tests on medium-complexity Java/Python functions is strictly less than 60%.
> $$\text{H}_{01}: \text{median}(MS_{GPT4}) < 60\%$$
>
> **H01a (Alternative)**: The median mutation score achieved by GPT-4 generated unit tests is greater than or equal to 60%.
> $$\text{H}_{01a}: \text{median}(MS_{GPT4}) \ge 60\%$$
>
> * **Statistical Test**: One-sample Wilcoxon signed-rank test against the fixed value of 60%.

---

### Hypothesis Set 2: Branch Coverage Parity (GPT-4 vs. Manual)
> **H02 (Null)**: There is no significant difference in branch coverage between GPT-4 generated unit tests and student manually written unit tests.
> $$\text{H}_{02}: \text{median}(BC_{GPT4} - BC_{Manual}) = 0$$
>
> **H02a (Alternative)**: There is a significant difference in branch coverage between GPT-4 generated unit tests and student manually written unit tests.
> $$\text{H}_{02a}: \text{median}(BC_{GPT4} - BC_{Manual}) \neq 0$$
>
> * **Statistical Test**: Paired Wilcoxon signed-rank test (two-tailed).

---

### Hypothesis Set 3: Mutation Score Parity (GPT-4 vs. Manual)
> **H03 (Null)**: There is no significant difference in mutation score between GPT-4 generated unit tests and student manually written unit tests.
> $$\text{H}_{03}: \text{median}(MS_{GPT4} - MS_{Manual}) = 0$$
>
> **H03a (Alternative)**: There is a significant difference in mutation score between GPT-4 generated unit tests and student manually written unit tests.
> $$\text{H}_{03a}: \text{median}(MS_{GPT4} - MS_{Manual}) \neq 0$$
>
> * **Statistical Test**: Paired Wilcoxon signed-rank test (two-tailed).

---

### Hypothesis Set 4: Dual-Metric Simultaneous Achievement
> **H04 (Null)**: The probability of GPT-4 generated tests simultaneously meeting both target thresholds (Branch Coverage $\ge$ 80% and Mutation Score $\ge$ 60%) is less than or equal to 50% across the dataset.
> $$\text{H}_{04}: P(BC_{GPT4} \ge 80\% \land MS_{GPT4} \ge 60\%) \le 0.5$$
>
> **H04a (Alternative)**: The probability of GPT-4 generated tests simultaneously meeting both target thresholds is greater than 50% (achieved on the majority of functions).
> $$\text{H}_{04a}: P(BC_{GPT4} \ge 80\% \land MS_{GPT4} \ge 60\%) > 0.5$$
>
> * **Statistical Test**: One-tailed Binomial test on the proportion of functions satisfying both criteria.

---

## Empirical Predictions & SLR Literature Alignment

Below is the synthesized mapping of our hypotheses to the actual empirical evidence collected from our 9 SLR primary studies:

### 1. Target Branch Coverage (H00)
* **Prediction**: **Mixed / Context-Dependent**
* **SLR Evidence**: Vanilla prompting is insufficient to reach the 80% branch coverage threshold on complex real-world code (`AX003`, `AX005`). However, specialized prompting architectures successfully cross the 80% threshold: `AX006` CAT call-chain injection improves branch coverage by 21.74%, `AX007` (HITS) leverages method slicing, `CORE001` utilizes project structure injection, and `AX001` applies covered-code elimination.

### 2. Target Mutation Score (H01)
* **Prediction**: **Mixed / Framework-Dependent**
* **SLR Evidence**: Plain GPT-4 assertions suffer from semantic gaps on un-leaked real-world code, with mutation scores dropping to a low of ~41% (`AX003`). Achieving the $\ge 60\%$ mutation score requires structured frameworks: `AX007` shows slicing preserves assertion power, and `CORE001` shows project knowledge injection improves test assertion quality.

### 3. Branch Coverage Parity (H02)
* **Prediction**: **Likely Reject H02 (Significant Difference)**
* **SLR Evidence**: Human-written test suites continue to outperform plain LLM generators in complex settings. `AX009` shows that human-written suites are robust, whereas LLM tests are brittle and degrade severely under software evolution. `AX003` confirms professional code coverage exceeds vanilla GPT-4 capability on real repositories.

### 4. Mutation Score Parity (H03)
* **Prediction**: **Likely Reject H03 (Significant Difference)**
* **SLR Evidence**: Real human developers write semantically deeper checks. `AX003` highlights that GPT-4 struggle to synthesize accurate assertions on complex methods, leading to mutation scores (~41%) significantly lower than manual developer tests.

### 5. Dual-Metric Co-achievement (H04)
* **Prediction**: **Likely Fail to Reject H04 (Thresholds Not Simultaneously Met on Vanilla GPT-4)**
* **SLR Evidence**: Meeting both targets simultaneously is a major bottleneck. `AX003` proves that high structural branch coverage does not translate into high mutation scores. Only advanced, complex frameworks like `AX007` (HITS method slicing) or `CORE001` (KTester) have demonstrated the capability to satisfy both criteria simultaneously on non-trivial methods.

---

## Experimental Design Parameters

* **Significance Level ($\alpha$)**: $\alpha = 0.05$ with Bonferroni correction applied for multiple comparison adjustments.
* **Effect Size ($r$)**: Wilcoxon effect size calculated as $r = \frac{Z}{\sqrt{N}}$:
  * **Small Effect**: $r \approx 0.1$
  * **Medium Effect**: $r \approx 0.3$
  * **Large Effect**: $r \approx 0.5$
