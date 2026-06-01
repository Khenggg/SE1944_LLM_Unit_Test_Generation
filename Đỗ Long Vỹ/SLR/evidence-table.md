# Evidence Table - Đỗ Long Vỹ IEEE Xplore

Converted from the member evidence extraction table. Records: N = 2.

| paper | year | DOI/URL | model | language | dataset | baseline | metrics | main_result | limitation | useful_for_our_study |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Mutation-Guided Unit Test Generation with a Large Language Model | 2026 | https://doi.org/10.1109/MS.2025.3621625 | Llama-3.3 | Java | HumanEval-Java, LeetCode-Java (204 subjects total) | EvoSuite, Vanilla LLM Prompting | Mutation Score, Line Coverage, Execution Success Rate | MutGen đạt ~89% mutation score trên cả hai dataset; chứng minh coverage cao không đảm bảo phát hiện lỗi; mutation feedback giúp LLM tạo test hiệu quả hơn; cơ chế self-fixing cải thiện tỷ lệ chạy thành công test | Equivalent mutants; chi phí tính toán cao; độ phức tạp pipeline tăng | Cung cấp bằng chứng mạnh cho hướng mutation-guided prompting + LLM-based testing |
| CodaMosa: Escaping Coverage Plateaus in Test Generation with Pre-trained Large Language Models | 2023 | https://doi.org/10.1109/TSE.2023.3246849 | Codex | Python | 486 Python modules | Pynguin, Codex-only | Branch Coverage, Statement Coverage, API Call Count | Kết hợp SBST + LLM giúp vượt plateau coverage; cải thiện coverage trên nhiều module so với baseline thuần SBST hoặc thuần LLM | Không đánh giá mutation score; phụ thuộc Codex; chi phí gọi LLM cao | Minh chứng quan trọng cho hybrid SBST + LLM trong test generation |
