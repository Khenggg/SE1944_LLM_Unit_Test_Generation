# Experiment Design Rationale — LLM-based Unit Test Generation with Coverage and Mutation Testing

Ngày: 2026-06-04 | GAP source: `SLR/gap-analysis.md`

## Bảng Quyết Định

| Quyết định    | Giá trị                                                                        | Nguồn gốc                                                                     |
| ------------- | ------------------------------------------------------------------------------ | ----------------------------------------------------------------------------- |
| LLM/Tool      | GPT-4o mini (OpenAI API); fallback: ChatGPT UI với model/date logged thủ công  | GAP-T: cột Tool/LLM                                                           |
| Dataset       | ULT / UnLeakedTestBench — 5–8 Python functions sampled from public GitHub repo | GAP-D / benchmark từ ACM007                                                   |
| Metric chính  | Mutation score (tính bằng mutmut)                                              | GAP-M: cột Metric                                                             |
| Metric phụ    | Branch coverage (tính bằng coverage.py --branch)                               | Kế thừa từ ACM007                                                             |
| Baseline type | Comparative — zero-shot prompting                                              | Claim type RQ: comparative                                                    |
| Threshold RQ1 | Không có ngưỡng tuyệt đối                                                      | Case 3: không có kết quả số đủ trong evidence table — dùng comparative claim  |
| Threshold RQ2 | Không áp dụng                                                                  | RQ2 (branch coverage) là secondary/descriptive — không cần threshold          |
| Pipeline base | ACM007 — Huang et al., 2024                                                    | Base paper gần nhất có mutation score + real-world functions + LLM evaluation |

## Lý giải threshold

**Threshold RQ1 — Case 3: không có ngưỡng tuyệt đối**

Evidence table (N = 9 papers) không cung cấp kết quả số đủ nhất quán để dùng Case 1 (paper đề xuất ngưỡng cụ thể) hoặc Case 2 (floor value từ kết quả thấp nhất). Nhiều records chỉ mô tả kết quả định tính hoặc không so sánh cùng prompt strategy. Do đó RQ1 dùng **comparative claim**: structured/CoT prompting được so sánh với zero-shot prompting trên cùng tập hàm, đo bằng Wilcoxon signed-rank test. Nếu p < 0.05 và median mutation score của structured/CoT cao hơn zero-shot thì H1 được chấp nhận.

**Threshold RQ2 — không áp dụng**

Branch coverage được báo cáo như secondary/descriptive metric. Không cần ngưỡng pass/fail vì mục tiêu là mô tả tương quan giữa branch coverage và mutation score, không phải kiểm định hypothesis riêng.

## Lý do chọn dataset

ULT / UnLeakedTestBench từ ACM007 là nguồn phù hợp nhất vì ACM007 là base paper gần nhất trong evidence table: đánh giá LLM trên real-world Python functions và đã dùng branch coverage và mutation score làm metrics. Dùng ULT tốt hơn tạo dataset mới vì dataset đã public, có thể tải ngay, và giảm rủi ro GAP-D. RBL-2 scope: 5–8 functions có dependencies đơn giản, chạy được local mà không cần external services.

**Fallback rule:** Nếu một function có lỗi dependencies, thay bằng function khác trong cùng ULT benchmark và ghi lại replacement trong experiment log.

## Lý do chọn pipeline

Pipeline dựa trên evaluation paradigm của ACM007: input là Python function, output là pytest test file, metrics là branch coverage (coverage.py) và mutation score (mutmut). Mỗi thành phần có nguồn gốc rõ ràng:

| Thành phần        | Ghi rõ                                 | Nguồn                                                   |
| ----------------- | -------------------------------------- | ------------------------------------------------------- |
| LLM/Tool          | GPT-4o mini, OpenAI API                | GAP-T — cột Tool/LLM                                    |
| Prompt strategy   | Zero-shot vs structured/CoT            | Paper ACM005 (CoT); ACM001, ACM007 (zero-shot baseline) |
| Temperature       | 0 (deterministic, reproducibility)     | Reproducibility                                         |
| Metric tool chính | mutmut (mutation score)                | GAP-M — cột Metric                                      |
| Metric tool phụ   | coverage.py --branch (branch coverage) | Kế thừa từ ACM007                                       |
| Baseline type     | Comparative (zero-shot)                | Claim type của RQ                                       |

## Định nghĩa prompt strategy

| Prompt strategy | Mô tả                                                                                                                                                                                       |
| --------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Zero-shot       | Model nhận function/source code và được yêu cầu tạo pytest unit tests trực tiếp. Không có ví dụ, checklist, hay bước reasoning.                                                             |
| Structured/CoT  | Model nhận function/source code và được yêu cầu: (1) xác định input classes, (2) liệt kê edge cases, (3) xác định expected behavior, (4) tạo executable pytest tests. Output chỉ chứa code. |

## Operating environment

| Component           | Môi trường                                                     |
| ------------------- | -------------------------------------------------------------- |
| OS                  | Windows 10/11 local hoặc Google Colab nếu local setup thất bại |
| Editor              | VS Code                                                        |
| Python              | 3.12 (recommended); 3.10+ acceptable                           |
| Virtual environment | `.venv` trong project folder                                   |
| Test framework      | pytest                                                         |
| Coverage tool       | coverage.py với branch coverage enabled                        |
| Mutation tool       | mutmut                                                         |
| Hardware            | CPU only; không cần GPU                                        |
| Output folder       | `experiment/results/`                                          |

## Timeline

| Giai đoạn                              | Thời gian  | Output                                              |
| -------------------------------------- | ---------- | --------------------------------------------------- |
| Dataset download + function selection  | 1–2 giờ    | `selected-functions.md`                             |
| Prompt template preparation            | 30–45 phút | `prompts/zero-shot.md`, `prompts/structured-cot.md` |
| LLM generation                         | 1–2 giờ    | Generated test files                                |
| Local test execution + environment fix | 1–2 giờ    | pytest pass/fail log                                |
| Coverage + mutation testing            | 2–4 giờ    | Raw metric CSV                                      |
| Statistical analysis + write-up        | 1–2 giờ    | Result summary                                      |

Tổng: ~7–13 giờ cho mini-pilot. Nếu thiếu thời gian: giảm từ 8 xuống 5 functions.

## Risk mitigation

| Rủi ro                        | Mức sau mitigation | Mitigation                                                                                        |
| ----------------------------- | ------------------ | ------------------------------------------------------------------------------------------------- |
| Dataset dependency errors     | ⚠️                 | Chọn functions có dependencies đơn giản. Replace broken functions từ cùng ULT và log replacement. |
| API cost / access             | ⚠️                 | Dùng GPT-4o mini, cap 10–16 calls, fallback ChatGPT UI.                                           |
| Mutation testing chậm         | ✅                 | Chỉ 5–8 functions nhỏ; chạy mutmut sau khi pytest pass.                                           |
| Generated tests không compile | ✅                 | Track pass rate riêng. Chỉ dùng valid paired outputs cho Wilcoxon.                                |
| Environment setup lâu         | ✅                 | Python-only stack: pytest, coverage.py, mutmut. Không dùng Java/JUnit/PIT.                        |
| Timeline tight                | ✅                 | Giữ RQ1 là primary. RQ2 là secondary/descriptive nếu cần.                                         |

## Final design decision

Primary GAP: **GAP-M** — Secondary GAP: **GAP-T**. Experiment dùng 5–8 Python functions từ ULT / UnLeakedTestBench (ACM007). So sánh zero-shot với structured/CoT prompting dùng GPT-4o mini. Chạy local với Python, pytest, coverage.py, mutmut. Metric chính: mutation score; metric phụ: branch coverage. Claim là comparative (không có absolute threshold) vì evidence table không đủ kết quả số nhất quán.
