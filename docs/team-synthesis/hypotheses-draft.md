# Hypotheses Draft

The statistical hypotheses defined below are directly aligned with the research questions outlined in `team-synthesis/rq-final.md`. For the RBL-4 operational comparison, the unit of analysis is each function/method in the dataset ($N = 63$), paired between `GPT-4o-mini-generated tests` (model version `gpt-4o-mini-2024-07-18`) and `EvoSuite-generated tests` at each fixed budget (1, 3, and 5 minutes). Each budget is analysed separately; all tests use $\alpha = 0.05$. The student-written benchmark remains the original research direction but is deferred because equivalent per-function measurements are not available.

---

## RQ1 - Branch Coverage Threshold

Do GPT-4o-mini-generated unit tests achieve a branch coverage of >=30.22% on the selected Java functions from the HumanEval-Java benchmark?

*   **Giả thuyết Không (Null Hypothesis - $H_{0\_1}$):** Trung vị độ bao phủ nhánh của bộ test do GPT-4o-mini sinh ra nhỏ hơn 30.22%.
    $$H_{0\_1}: \tilde{\mu}_{\text{BC-AI}} < 30.22\%$$
*   **Giả thuyết Đối (Alternative Hypothesis - $H_{1\_1}$):** Trung vị độ bao phủ nhánh của bộ test do GPT-4o-mini sinh ra lớn hơn hoặc bằng 30.22%.
    $$H_{1\_1}: \tilde{\mu}_{\text{BC-AI}} \ge 30.22\%$$

**Planned Statistical Test:** One-sample Wilcoxon signed-rank test, evaluating the sample median against the constant threshold value of 30.22% (derived from Paper [010] / [GS017] - Huang et al., 2026).

---

## RQ2 - Mutation Score Thresholds

Do GPT-4o-mini-generated unit tests achieve a mutation score of >=4.0% (empirical floor) and >=40.21% (target) on the exact same selected functions?

### RQ2a: Mutation Score Floor Threshold (>=4.0%)
*   **Giả thuyết Không (Null Hypothesis - $H_{0\_2a}$):** Trung vị điểm đột biến của bộ test do GPT-4o-mini sinh ra nhỏ hơn 4.0%.
    $$H_{0\_2a}: \tilde{\mu}_{\text{MS-AI}} < 4.0\%$$
*   **Giả thuyết Đối (Alternative Hypothesis - $H_{1\_2a}$):** Trung vị điểm đột biến của bộ test do GPT-4o-mini sinh ra lớn hơn hoặc bằng 4.0%.
    $$H_{1\_2a}: \tilde{\mu}_{\text{MS-AI}} \ge 4.0\%$$

**Planned Statistical Test:** One-sample Wilcoxon signed-rank test, evaluating the sample median against the floor threshold value of 4.0% (derived from Paper [026] / [IEEE003] - Wang et al., 2026).

### RQ2b: Mutation Score Target Threshold (>=40.21%)
*   **Giả thuyết Không (Null Hypothesis - $H_{0\_2b}$):** Trung vị điểm đột biến của bộ test do GPT-4o-mini sinh ra nhỏ hơn 40.21%.
    $$H_{0\_2b}: \tilde{\mu}_{\text{MS-AI}} < 40.21\%$$
*   **Giả thuyết Đối (Alternative Hypothesis - $H_{1\_2b}$):** Trung vị điểm đột biến của bộ test do GPT-4o-mini sinh ra lớn hơn hoặc bằng 40.21%.
    $$H_{1\_2b}: \tilde{\mu}_{\text{MS-AI}} \ge 40.21\%$$

**Planned Statistical Test:** One-sample Wilcoxon signed-rank test, evaluating the sample median against the target threshold value of 40.21% (derived from Paper [010] / [GS017] - Huang et al., 2026).

---

## RQ3 - Comparison With EvoSuite Operational Baseline

At each fixed EvoSuite budget (1, 3, and 5 minutes), is there a statistically significant difference in branch coverage and mutation score when comparing GPT-4o-mini-generated unit tests to EvoSuite-generated unit tests evaluated on the same functions?

### RQ3a: Branch Coverage Comparison
*   **Giả thuyết Không (Null Hypothesis - $H_{0\_3a}$):** Không có sự khác biệt có ý nghĩa thống kê về độ bao phủ nhánh giữa bộ test do GPT-4o-mini sinh ra và bộ test do sinh viên viết sẵn.
    $$H_{0\_3a,t}: \tilde{\mu}_{\text{BC-AI}} = \tilde{\mu}_{\text{BC-EvoSuite}(t)},\quad t \in \{1m,3m,5m\}$$
*   **Giả thuyết Đối (Alternative Hypothesis - $H_{1\_3a}$):** Có sự khác biệt có ý nghĩa thống kê về độ bao phủ nhánh giữa bộ test do GPT-4o-mini sinh ra và bộ test do sinh viên viết sẵn.
    $$H_{1\_3a,t}: \tilde{\mu}_{\text{BC-AI}} \neq \tilde{\mu}_{\text{BC-EvoSuite}(t)},\quad t \in \{1m,3m,5m\}$$

### RQ3b: Mutation Score Comparison
*   **Giả thuyết Không (Null Hypothesis - $H_{0\_3b}$):** Không có sự khác biệt có ý nghĩa thống kê về điểm đột biến giữa bộ test do GPT-4o-mini sinh ra và bộ test do sinh viên viết sẵn.
    $$H_{0\_3b,t}: \tilde{\mu}_{\text{MS-AI}} = \tilde{\mu}_{\text{MS-EvoSuite}(t)},\quad t \in \{1m,3m,5m\}$$
*   **Giả thuyết Đối (Alternative Hypothesis - $H_{1\_3b}$):** Có sự khác biệt có ý nghĩa thống kê về điểm đột biến giữa bộ test do GPT-4o-mini sinh ra và bộ test do sinh viên viết sẵn.
    $$H_{1\_3b,t}: \tilde{\mu}_{\text{MS-AI}} \neq \tilde{\mu}_{\text{MS-EvoSuite}(t)},\quad t \in \{1m,3m,5m\}$$

**Planned Statistical Test:** Paired Wilcoxon signed-rank test (two-tailed), performed separately at each fixed EvoSuite budget because the two independently generated test suites are evaluated on the exact same paired functions. Apply Holm correction across the six RQ3 budget/metric tests. A mean across the three budgets may be descriptive only and is not the primary paired comparator.

---

## RQ4 - Simultaneous Success Rate

Do GPT-4o-mini-generated unit tests achieve both the branch coverage threshold (>=30.22%) and the mutation score floor threshold (>=4.0%) simultaneously for a statistically significant majority (over 50%) of the functions?

*   **Giả thuyết Không (Null Hypothesis - $H_{0\_4}$):** Tỷ lệ số hàm đạt đồng thời cả hai ngưỡng chất lượng sàn của bộ test do GPT-4o-mini sinh ra nhỏ hơn hoặc bằng 50%.
    $$H_{0\_4}: p_{\text{success}} \le 0.50$$
*   **Giả thuyết Đối (Alternative Hypothesis - $H_{1\_4}$):** Tỷ lệ số hàm đạt đồng thời cả hai ngưỡng chất lượng sàn của bộ test do GPT-4o-mini sinh ra lớn hơn 50%.
    $$H_{1\_4}: p_{\text{success}} > 0.50$$

**Planned Statistical Test:** Exact Binomial Test (one-tailed), evaluating the per-function binary success rate (where success means achieving both $\text{BC} \ge 30.22\%$ and $\text{MS} \ge 4.0\%$ simultaneously) against the hypothesized majority threshold $p_0 = 0.50$ on the sample size $N = 63$.

---

## Analysis Guidelines & Prerequisites

- The exact same set of selected functions must be used for evaluating GPT-generated tests and the EvoSuite tests for each fixed time budget to ensure valid paired statistical analysis. Student benchmark comparison is deferred, not substituted.
- Test suites that fail to compile or execute must be excluded from the coverage and mutation statistical tests, or reported separately. Coverage and mutation scores are scientifically meaningless for non-executable test suites.
- Prior to hypothesis testing, report comprehensive descriptive statistics including the median, Interquartile Range (IQR), minimum, maximum, and the total count of successfully executed test suites.
- If multiple hypotheses are tested simultaneously on the same dataset, apply an appropriate multiple-comparison correction methodology (such as the Holm-Bonferroni method) to control the family-wise error rate.
