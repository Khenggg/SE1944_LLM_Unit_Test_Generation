# Hypotheses Draft - LLM for Unit Test Case Generation

Date: 2026-06-05 | Source: `experiment/design-rationale.md`

## Final RQ Draft

For medium-complexity Java/Python functions or classes, approximately CC = 5-15 where measurable, do GPT-4o (gpt-4o-2024-05-13) generated unit tests achieve branch coverage >= 30.22% and mutation score >= 4%, and how do they compare with student-written coursework tests for the same code units?

## Threshold sources

| Metric | Threshold | Case | Source | Role |
| --- | ---: | --- | --- | --- |
| Branch coverage | 30.22% | Case 2 | GS017 reports average branch coverage 30.22% on ULT real-world Python functions. | Main RQ1 threshold. |
| Mutation score | 4% | Case 2 | GS005 reports suites with 100% coverage but only 4% mutation score. | Main RQ2 strict floor threshold. |
| Mutation score | 40.21% | Secondary H0/H1 | GS017 reports average mutation score 40.21% on ULT. | Secondary H0/H1 threshold / stronger reference target. |

## RQ1 - Branch Coverage Threshold

Kiem dinh xem GPT-4o (gpt-4o-2024-05-13) generated unit tests co dat median branch coverage toi thieu 30.22% tren medium-complexity Java/Python units hay khong.

- **H0_1:** Median branch coverage cua GPT-4o (gpt-4o-2024-05-13) generated unit tests nho hon 30.22%.
- **H1_1:** Median branch coverage cua GPT-4o (gpt-4o-2024-05-13) generated unit tests lon hon hoac bang 30.22%.

**Statistical test du kien:** One-sample Wilcoxon signed-rank test against 30.22% (alpha = 0.05).

**Rationale:** Branch coverage la continuous percentage metric. Wilcoxon phu hop vi sample du kien nho va khong nen gia dinh normal distribution.

## RQ2 - Mutation Score Threshold

Kiem dinh xem GPT-4o (gpt-4o-2024-05-13) generated unit tests co dat cac nguong mutation score (nguong san 4% va nguong khoa hoc 40.21%) tren medium-complexity Java/Python units hay khong.

### RQ2a - Mutation Score Strict Floor (4%)
- **H0_2a:** Median mutation score cua GPT-4o (gpt-4o-2024-05-13) generated unit tests nho hon 4%.
- **H1_2a:** Median mutation score cua GPT-4o (gpt-4o-2024-05-13) generated unit tests lon hon hoac bang 4%.

### RQ2b - Mutation Score Reference Target (40.21%)
- **H0_2b:** Median mutation score cua GPT-4o (gpt-4o-2024-05-13) generated unit tests nho hon 40.21%.
- **H1_2b:** Median mutation score cua GPT-4o (gpt-4o-2024-05-13) generated unit tests lon hon hoac bang 40.21%.

**Statistical test du kien:** One-sample Wilcoxon signed-rank test against 4% and 40.21% respectively (alpha = 0.05).

**Rationale:** Mutation score la continuous percentage metric. Wilcoxon phu hop vi sample du kien nho va khong gia dinh distribution normal. Nguong 4% la strict floor tu GS005, trong khi 40.21% tu GS017 dung de danh gia hieu qua muc do trung binh thuc te.

## RQ3 - Comparison with Student-Written Coursework Tests

Kiem dinh xem GPT-4o (gpt-4o-2024-05-13) generated tests co dat hieu qua cao hon (tieu chi branch coverage va mutation score) so voi student-written coursework tests tren cung code units hay khong.

### RQ3a - Branch coverage comparison

- **H0_3a:** Median branch coverage cua GPT-4o (gpt-4o-2024-05-13) generated tests **khong lon hon** branch coverage cua student-written coursework tests tren cung code units.
- **H1_3a:** Median branch coverage cua GPT-4o (gpt-4o-2024-05-13) generated tests **lon hon** branch coverage cua student-written coursework tests tren cung code units.

### RQ3b - Mutation score comparison

- **H0_3b:** Median mutation score cua GPT-4o (gpt-4o-2024-05-13) generated tests **khong lon hon** mutation score cua student-written coursework tests tren cung code units.
- **H1_3b:** Median mutation score cua GPT-4o (gpt-4o-2024-05-13) generated tests **lon hon** mutation score cua student-written coursework tests tren cung code units.

**Statistical test du kien:** Paired Wilcoxon signed-rank test on per-unit differences (GPT-generated score minus student-written score), alpha = 0.05. Bao cao direction va effect size sau khi test.

**Comparison source:** GAP-D trong `SLR/gap-analysis.md`. Khong included paper nao co paired student-written coursework comparison tren cung medium-complexity Java/Python units.

## Metric interpretation

- **Branch coverage:** Do muc do test exercise cac branch/control-flow outcomes.
- **Mutation score:** Do kha nang phat hien loi gia lap; bat buoc vi GS005 cho thay coverage cao co the di kem mutation score rat thap.
- **Compile/execution success rate:** Bao cao descriptive nhu metric phu; khong phai H0/H1 chinh tru khi proposal sau nay downscope ve pass/fail analysis.

## Doi chieu RBL-2

| Yeu cau RBL-2 | Trang thai trong file nay |
| --- | --- |
| H0/H1 co threshold cu the | Done - RQ1 30.22%, RQ2 4%. |
| Threshold khop voi design-rationale.md | Done - cung GS017/GS005. |
| H1 doi lap logic voi H0 | Done - threshold checks va paired comparison tach rieng. |
| Statistical test duoc chon truoc | Done - one-sample Wilcoxon va paired Wilcoxon. |
| Baseline C khong bi thieu | Done - RQ3 dung student coursework tests; RQ1/RQ2 dung literature-backed thresholds. |

## Amendment rule

Neu experiment doi model, ngon ngu, dataset size, hoac threshold, phai cap nhat dong bo `experiment/design-rationale.md`, `experiment/hypotheses.md`, va `experiment/01_rq.md` truoc khi dua vao proposal/team synthesis. Neu GPT-4o (gpt-4o-2024-05-13) bi thay bang model khac (vd: GPT-4o mini) do chi phi, intervention phai duoc rename nhat quan trong tat ca files.
