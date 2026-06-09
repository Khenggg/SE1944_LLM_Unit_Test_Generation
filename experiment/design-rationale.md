# Experiment Design Rationale - LLM for Unit Test Case Generation

Date: 2026-06-05 | GAP source: `SLR/gap-analysis.md` | Evidence source: `SLR/evidence-table.md` (N = 16)

## Bang quyet dinh

| Quyet dinh | Gia tri chot | Nguon goc |
| --- | --- | --- |
| **Primary GAP** | Paired comparison gap: chua co included paper so sanh GPT-4o-generated tests voi student-written coursework/assignment tests tren cung medium-complexity Java/Python units (phan biet voi so sanh code lap trinh vien chuyen nghiep nhu trong AgoneTest). | `SLR/gap-analysis.md`, GAP-D, 16-paper counter-evidence check. |
| **Secondary GAP** | Dung ca branch coverage va mutation score. | GS005 canh bao 100% coverage van co the chi 4% mutation score; GS017/GS022/GS024/GS025/GS051/GS089 co mutation-related evidence. |
| **LLM/Tool** | GPT-4o (gpt-4o-2024-05-13) la primary; GPT-4o mini la downscope/amendment neu budget/API bi chan. | RQ/GAP-D tap trung GPT-4o; GPT-family evidence co trong GS010, GS022, GS024, GS028, GS051, GS080, GS089, GS118. |
| **Prompt strategy** | Fixed zero-shot/structured prompt, temperature = 0, toi da 1 repair attempt neu test khong compile/run. | Reproducibility requirement; GS010 va GS206 cho thay repair/refinement co ich nhung minimal experiment khong nen thanh complex pipeline. |
| **Dataset** | 10-20 Java hoac Python functions/classes co medium cyclomatic complexity, approximately CC = 5-15 where measurable, co student-written coursework/assignment tests cho cung units. | GAP-D va feasibility check trong `SLR/gap-analysis.md`. |
| **Metric chinh 1** | Branch coverage. | GS017 bao cao branch coverage 30.22%; GS019, GS025, GS051, GS089, GS163, GS206 co coverage-related evidence. |
| **Metric chinh 2** | Mutation score. | GS005, GS017, GS022, GS024, GS025, GS051, GS089. |
| **Metric phu** | Compile/execution success rate. | GS010, GS028, GS089, GS118, GS206. |
| **Baseline type RQ1/RQ2** | Absolute literature-backed thresholds. | RBL-2 section 3A: absolute claim can threshold value. |
| **Baseline type RQ3** | Paired student-written coursework tests. | GAP-D yeu cau cung code units co GPT-generated tests va student-written coursework/assignment tests. |
| **Threshold RQ1** | Branch coverage >= 30.22%. | Case 2 within directly usable branch-coverage evidence: GS017 reports average branch coverage 30.22% on ULT. |
| **Threshold RQ2** | Mutation score >= 4%. | Case 2 strict floor: GS005 reports suites with 100% coverage but only 4% mutation score. |
| **Reference target RQ2** | Mutation score >= 40.21% as secondary H0/H1 threshold. | GS017 reports average mutation score 40.21% on ULT; secondary H0/H1 threshold / stronger reference target. |
| **Pipeline base** | GS017 for real-world function benchmark framing; GS005/GS022 for mutation-score justification; GS028/GS051/GS089 as comparison examples. | Evidence table rows GS005, GS017, GS022, GS028, GS051, GS089. |
| **Statistical tests** | One-sample Wilcoxon for threshold checks; paired Wilcoxon for GPT vs student comparison. | RBL-2 guidance for continuous percentage metrics and paired comparison. |

## Ly giai threshold

### RQ1 - Branch coverage >= 30.22%

**Case:** Case 2. Evidence table co ket qua so nhung khong co paper nao de xuat universal acceptance threshold cho branch coverage.

**Nguon:** GS017 bao cao average branch coverage **30.22%** tren ULT, gom real-world Python function-level tasks. Day la source gan nhat voi RQ vi no do branch coverage cho LLM-generated unit tests tren real-world functions.

**Ly do khong dung cac so khac:** GS009 bao cao generic coverage va co HumanEval/SF110 gap; GS019 dung JavaScript npm APIs ngoai scope Java/Python; GS028 bao cao statement coverage; GS025 dung fine-tuning va iterative feedback; GS051 dung multi-LLM chaining. Cac paper nay la supporting evidence, khong phai threshold source truc tiep cho minimal GPT-4/GPT-4o experiment.

### RQ2 - Mutation score >= 4%

**Case:** Case 2. Khong paper nao trong evidence table de xuat universal threshold cho mutation score, nen RBL-2 yeu cau dung floor value tu ket qua so.

**Nguon:** GS005 bao cao co test suites dat 100% coverage nhung chi **4% mutation score**. Vi day la gia tri mutation-score floor trong evidence table va cung la canh bao ve coverage-only evaluation, nguong H0/H1 duoc chon la **4%**.

**Reference target:** GS017 bao cao average mutation score **40.21%** tren ULT. Gia tri nay duoc giu lam stronger reference target khi dien giai ket qua, va duoc thiet lap nhu mot RQ phu hoac secondary threshold de kiem tra tinh hieu qua khoa hoc.

## Pipeline rationale

Pipeline toi thieu can tra loi truc tiep GAP-D: cung code units, hai test suites, cung metric.

1. Chon 10-20 Java hoac Python functions/classes co CC = 5-15 where measurable.
2. Thu thap student-written coursework/assignment tests cho dung cac units do.
3. Sinh GPT-4o (gpt-4o-2024-05-13) tests bang fixed prompt va temperature 0.
4. Chay compile/execution checks va ghi failure rate.
5. Do branch coverage va mutation score cho GPT-generated tests.
6. Do cung metrics cho student-written coursework/assignment tests.
7. So sanh GPT-generated tests voi thresholds RQ1/RQ2 va voi paired student-written coursework/assignment tests RQ3.

## Tooling decision

| Language option | Coverage tool | Mutation tool | Ghi chu |
| --- | --- | --- | --- |
| Java | JaCoCo | PIT/PITest | Phu hop voi JUnit evidence trong GS009, GS022, GS028, GS051, GS206. Setup nang hon nhung mutation tooling ro. |
| Python | coverage.py | mutmut hoac Cosmic Ray | Phu hop voi GS017, GS025, GS026. Setup nhanh hon cho function-level dataset nho. |

**Starting rule:** Chon ngon ngu nao da co student-written coursework/assignment tests truoc. Neu ca hai deu co, Java manh hon cho comparability voi PIT/JUnit papers; Python manh hon neu can setup nhanh.

## Downscope rule

| Constraint | Downscope hop le |
| --- | --- |
| Khong co paired student coursework/assignment tests cho ca Java va Python | Dung 1 ngon ngu duy nhat. |
| Dataset qua lon hoac khong on dinh | Giam ve 10 units va ghi ro pilot-scale. |
| GPT-4/GPT-4o qua dat | Dung GPT-4o mini, cap nhat ten model trong tat ca files. |
| Mutation testing qua cham | Giu mutation score cho subset nho hon; khong bo han mutation score vi GAP-M phu thuoc vao no. |
| Test compile fail nhieu | Cho phep 1 repair/regeneration attempt va bao cao compile success rate. |

## Doi chieu RBL-2

| Yeu cau RBL-2 | Trang thai trong file nay |
| --- | --- |
| Moi design decision co nguon evidence table | Done - moi dong trong bang quyet dinh co source. |
| Threshold ghi Case va ly giai | Done - RQ1/RQ2 deu la Case 2. |
| Pipeline co base paper | Done - GS017, GS005/GS022, GS028/GS051. |
| Baseline match claim | Done - RQ1/RQ2 absolute thresholds, RQ3 paired student baseline. |
| Statistical test duoc chon truoc | Done - Wilcoxon one-sample va paired Wilcoxon. |

| Design Element | Choice / Value | Source / Rationale |
| --- | --- | --- |
| **LLM/Tool** | GPT-4o (gpt-4o-2024-05-13) | `SLR/evidence-table.md` |
| **Dataset** | 10-20 medium-complexity Java/Python units | `SLR/gap-analysis.md` |
| **Metric** | Branch coverage & mutation score | GS005, GS017, GS089 |
| **Thresholds** | Branch >= 30.22%, Mutation >= 4% & >= 40.21% (ref) | GS017 & GS005 |
| **Statistical test** | One-sample & Paired Wilcoxon | Standard RBL-2 guideline |

## Design claim

Thiet ke nay hop le cho RBL-2 vi moi quyet dinh chinh deu trace ve evidence table: GAP-D quy dinh student-written paired baseline, GS005/GS017/GS022/GS024/GS025/GS051/GS089 quy dinh dual metrics, GS017 cung cap branch threshold 30.22%, va GS005 cung cap strict mutation floor 4%. Scope nho giup experiment kha thi trong boi canh coursework.
