# GAP Analysis - LLM for Unit Test Case Generation

Evidence table: N = 16 papers | Source: Google Scholar | Date: 2026-06-05

## Bang GAP

| Cot evidence | Phat hien | Loai GAP | Phan chung |
| --- | --- | --- | --- |
| **Tool/LLM** | Da co ChatGPT, GPT-3.5, GPT-4o, Codex, DeepSeek, Gemini, Claude, LLaMA, fine-tuned DeepSeek, va multi-LLM pipelines. | GAP-T | Khong chon primary vi GPT-family da xuat hien trong GS010, GS022, GS024, GS028, GS051, GS080, GS089, GS118. |
| **Dataset / Comparison** | Chua co paired setup: cung Java/Python units co CC trung binh, co ca GPT-4/GPT-4o tests va student-written coursework/assignment tests. | GAP-D | Da kiem tra 16 papers; khong co paper nao so sanh voi student coursework tests. |
| **Metric** | Coverage pho bien hon mutation score; GS005 cho thay 100% coverage van co the chi 4% mutation score. | GAP-M | 7/16 papers co mutation-related evidence: GS005, GS017, GS022, GS024, GS025, GS051, GS089. |
| **Han che** | Nhieu paper neu han che ve generalization, correctness/compilability, benchmark realism, hoac pipeline complexity. | GAP-S | Ho tro GAP-D/GAP-M, khong chon lam primary. |

## GAP Chinh: GAP-D

Chua co nghien cuu included nao danh gia GPT-4/GPT-4o-generated unit tests doi chieu voi student-written coursework/assignment tests tren cung Java/Python functions/classes co cyclomatic complexity trung binh, lan dau duoc do va kiem chung trong mot thiet ke paired-setup (operationalized as approximately CC = 5-15 where measurable).

Day la GAP chinh vi RQ cua Khang can comparison baseline la sinh vien trong moi truong hoc thuat (coursework), khong chi can benchmark hoac automated-tool hoac professional developer baseline.

## GAP Secondary: GAP-M

Can danh gia dong thoi branch coverage va mutation score. GS005 la bang chung quan trong: mot so test suites dat 100% coverage nhung chi dat 4% mutation score, nen branch coverage khong thay the duoc mutation score.

## Chi tiet kiem tra phan chung - GAP Chinh

GAP can kiem tra: Khong paper nao trong 16 included papers so sanh GPT-4o-generated tests voi student-written coursework tests tren cung medium-complexity Java/Python code units.

| Paper | Da lam dung GAP nay chua? | Ghi chu ngan |
| --- | --- | --- |
| GS005 | Khong | MUTGEN + EvoSuite/vanilla prompts; khong co student baseline. |
| GS009 | Khong | HumanEval va SF110 Java; khong co paired student-written coursework/assignment tests. |
| GS010 | Khong | ChatGPT/ChatTester ve compilability/correctness; khong co student baseline. |
| GS017 | Khong | Co branch 30.22% va mutation 40.21% tren ULT; khong co student-written coursework/assignment tests. |
| GS019 | Khong | TestPilot tren npm packages voi Nessie; ngoai Java/Python student baseline. |
| GS022 | Khong | ChatGPT GPT-4o/DeepSeek tren 6 Defects4J classes voi PIT; khong co student baseline. |
| GS024 | Khong | Programming assignments va 1,296 submissions; dung de sinh test danh gia bai lam/phat hien loi cua sinh vien (assessment), khong phai so sanh chat luong GPT-vs-student test suite. |
| GS025 | Khong | Fine-tuned DeepSeek tren 7 Python projects; khong co GPT-4/GPT-4o vs student coursework/assignment baseline. |
| GS026 | Khong | ChatGPT-3.5 voi Pynguin/pre-existing tests; khong phai GPT-4/GPT-4o paired student comparison. |
| GS028 | Khong | ChatGPT vs EvoSuite/SBST tren 207 Java classes; baseline la automated tool. |
| GS051 | Khong | Multi-LLM chaining voi GPT-4o/Gemini/Claude va Randoop; khong co student baseline. |
| GS080 | Khong | Large-scale prompt engineering tren Defects4J/SF110/CMD; khong co paired student-written coursework/assignment tests. |
| GS089 | Khong | AgoneTest so sanh voi professional human-written tests (Classes2Test dataset); khong phai paired student coursework tests. |
| GS118 | Khong | Meta pipeline cai thien existing human-written tests; baseline la repository code va professional developers, khong phai student coursework/assignment tests. |
| GS163 | Khong | Industry Java projects va developer study; baseline la professional developers, khong co student coursework tests. |
| GS206 | Khong | ReAct/Reflexion Java pipeline tren Apache Commons; khong co student baseline. |

### Rationale for AgoneTest (GS089) Distinction
*   **AgoneTest (GS089 - ASE 2025):** This study compares LLM-generated unit tests with human-written tests from open-source Java projects (Classes2Test dataset). These human-written tests represent professional developer baselines rather than paired student coursework or assignments.
*   **Conclusion:** AgoneTest does not refute our Primary GAP (GAP-D) since our evaluation baseline is specifically student-written coursework on medium-complexity units.

**Ket luan chung:** Xac nhan GAP chinh. Khong co paper nao trong 16 papers bac bo GAP-D sau khi thu hep pham vi.

## Chi tiet kiem tra phan chung - GAP Secondary

| Paper | Vai tro | Ghi chu |
| --- | --- | --- |
| GS005 | Ung ho | Bao cao truong hop 100% coverage nhung chi 4% mutation score. |
| GS017 | Ung ho | Bao cao ca branch coverage 30.22% va mutation score 40.21% tren ULT. |
| GS022 | Ung ho | Bao cao mutation coverage va mutation score cho ChatGPT GPT-4o va DeepSeek. |
| GS024 | Ung ho | Bao cao statement coverage va mutation score improvement. |
| GS025 | Ung ho | Bao cao line coverage, branch coverage, va mutation score. |
| GS051 | Ung ho | Bao cao branch/line coverage va mutation coverage. |
| GS089 | Ung ho | Bao cao branch/line/method coverage va mutation score tren Classes2Test. |

**Ket luan:** GAP-M hop le lam secondary GAP va bat buoc trong design.

## Feasibility Check - GAP Chinh

| Tieu chi | Muc | Ghi chu / mitigation |
| --- | --- | --- |
| **Dataset** | Warning | Can curate paired student-written coursework/assignment tests; downscope ve 1 ngon ngu va 10-20 units co CC = 5-15 where measurable. |
| **Tool/API** | Warning | GPT-4/GPT-4o co the ton budget; neu bi chan, dung GPT-4o mini va ghi amendment. |
| **Compute** | Safe | Branch coverage va mutation testing co the chay CPU voi dataset nho. |
| **Ground truth** | Safe | Student-written coursework/assignment tests la comparison artifact; chat luong do bang metrics tu dong. |
| **Skills** | Safe | Java: JaCoCo/PIT. Python: coverage.py/mutmut hoac Cosmic Ray. |
| **Time** | Safe | Co the kiem soat bang 10-20 units, 1 model config, 1 ngon ngu neu can. |
| **Contribution** | Safe | Ket qua am tinh van co gia tri vi lap paired GPT-vs-student baseline ma evidence table chua co. |

**Ket qua:** 0 blockers / 2 warnings -> GAP chinh kha thi sau khi downscope.

## Ly do chon GAP chinh

RBL-2 uu tien mac dinh GAP-T > GAP-M > GAP-D > GAP-S khi nhieu GAP cung manh. Voi evidence table cua Khang, GAP-T khong manh vi GPT-family va GPT-4o-style settings da xuat hien trong nhieu paper. GAP-M quan trong nhung da duoc mot phan evidence de cap qua 7/16 papers. GAP-D duoc chon lam GAP chinh vi bang kiem tra phan chung cho thay khong paper nao co paired comparison giua GPT-4o-generated tests va student-written coursework/assignment tests tren cung medium-complexity Java/Python units.

## GAP duoc chot

**Primary GAP:** GAP-D - thieu paired dataset/comparison baseline voi student-written coursework/assignment tests.

**Secondary GAP:** GAP-M - can danh gia dong thoi branch coverage va mutation score.

**Final GAP Statement:** Existing evidence evaluates LLM-generated unit tests across benchmarks, automated-tool baselines, prompt strategies, and industrial pipelines, but it does not provide a paired comparison between GPT-4o-generated tests and student-written coursework/assignment tests on the same medium-complexity Java/Python units. This study addresses that dataset/comparison gap using branch coverage and mutation score as dual metrics.

## Doi chieu RBL-2

| Yeu cau RBL-2 | Trang thai trong file nay |
| --- | --- |
| Co bang GAP | Done - section `Bang GAP`. |
| Co primary va secondary GAP | Done - GAP-D la primary, GAP-M la secondary. |
| Co kiem tra phan chung tung paper cho primary GAP | Done - 16/16 papers. |
| Co feasibility check | Done - 0 blockers / 2 warnings. |
| Moi claim quan trong tro ve evidence table | Done - GS005, GS017, GS022, GS024, GS025, GS051, GS089 va bang phan chung. |
