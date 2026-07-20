# team_presentation_guide

# Hướng dẫn Phân vai Thuyết trình Nhóm 5 Người — Nghiệm thu RBL-5A

Tài liệu này phân chia chi tiết vai trò thuyết trình, thứ tự nói, thời gian, kịch bản (script) và nhiệm vụ phòng thủ Q&A cho **5 thành viên** của Nhóm 01 dựa trên bảng phân công công việc chính thức của RBL-5A.

---

## 1. Bản đồ Phân vai Tổng quan (Thời lượng: 11 phút)

| Thứ tự | Thành viên | Vai trò dự án | Slide phụ trách | Thời gian | Nhiệm vụ Q&A chính |
| --- | --- | --- | --- | --- | --- |
| **1** | **Lê Thế Khang** | **Project Lead (PL)** | Slide 1 (Bìa) & Slide 2 (Bài toán & Phạm vi) | **1:30** | Điều phối câu hỏi, Giải thích ranh giới diễn giải EvoSuite và Student Baseline. |
| **2** | **Phạm An Khang** | **Research & Paper Writer** | Slide 3 (Câu hỏi nghiên cứu) & Slide 8 (Biện luận) | **3:00** | Giải thích cơ sở khoa học của các ngưỡng (thresholds) và tài liệu tham khảo. |
| **3** | **Đỗ Long Vỹ** | **API & Automation Engineer** | Slide 4 (Quy trình API) & Slide 5 (Lỗi thực thi) | **2:30** | Trả lời về prompt, token, chi phí và cấu hình gọi API OpenAI. |
| **4** | **Huỳnh Cao Phước** | **EvoSuite & Environment Owner** | Slide 4 (Môi trường) & Slide 7 (So sánh cặp) | **2:00** | Trả lời về cấu hình EvoSuite, phiên bản JDK 8, Maven và PiTest. |
| **5** | **Nguyễn Thị Như Ý** | **Data & Pipeline Engineer** | Slide 6 (Full Corpus) & Slide 9 (Kết luận & Tương lai) | **2:00** | Trả lời về thống kê, kiểm định Wilcoxon, hiệu chỉnh Holm và dữ liệu thô. |

---

## 2. Kịch bản và Phân đoạn Nói Chi tiết

---

### NGƯỜI NÓI 1: Lê Thế Khang (Project Lead) — [0:00 - 1:30]

- **Slide phụ trách:**
    - [Slide 1: Cover Slide](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/presentation/slides_final.pptx#1)
    - [Slide 2: Problem and Scope](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/presentation/slides_final.pptx#2)
- **Nội dung trình bày:**
    - **Slide 1 (0:30):** Chào Hội đồng, giới thiệu các thành viên nhóm 01, nêu tổng quan đề tài đánh giá GPT-4o-mini sinh test Java trên 63 hàm HumanEval-Java.
    - **Slide 2 (1:00):** Nêu thực trạng: Text phản hồi của API $\neq$ test suite hợp lệ. Chỉ ra tỷ lệ 14/63 suite vượt qua biên dịch và execution. Thiết lập ranh giới: EvoSuite là comparator kỹ thuật, không phải student proxy.
- **Lời thoại gợi ý (Script):**
> *“Kính chào các thầy cô trong Hội đồng. Em là Lê Thế Khang, Project Lead của Nhóm 01. Hôm nay nhóm chúng em xin báo cáo kết quả thực nghiệm RBL-5A về năng lực sinh test Java zero-shot của GPT-4o-mini trên 63 hàm HumanEval-Java. Đề tài của nhóm tập trung vào tính đúng đắn thực thi, độ bao phủ nhánh và năng lực phát hiện lỗi logic.”*
> *(Chuyển sang Slide 2)*
> *“Điểm mấu chốt đầu tiên chúng em phát hiện là: Mặc dù gọi API thành công 100%, nhưng thực tế chỉ có 22.2% (tức 14/63 suite test) có thể thực thi và pass hoàn toàn. Phần lớn bị lỗi assertion. Đồng thời, nhóm cũng làm rõ ranh giới khoa học: EvoSuite ở đây đóng vai trò là một đối chứng kỹ thuật tự động để so sánh hiệu năng, chúng em không coi EvoSuite là đại diện cho sinh viên do hạn chế về nguồn dữ liệu student benchmark per-function.”*

---

### NGƯỜI NÓI 2: Phạm An Khang (Research & Paper Writer) — [1:30 - 4:30]

- **Slide phụ trách:**
    - [Slide 3: Research Questions](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/presentation/slides_final.pptx#3)
    - [Slide 8: Interpretation](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/presentation/slides_final.pptx#8)
- **Nội dung trình bày:**
    - **Slide 3 (1:30):** Trình bày 5 RQ. Giải thích các ngưỡng giả thuyết chọn từ nghiên cứu trước (30.22% branch coverage, 4.0% sàn mutation score, 40.21% mục tiêu mutation score). Nêu rõ RQ3 là pass-conditioned (chỉ so sánh khi cả hai cùng pass).
    - **Slide 8 (1:30):** Biện luận tính trung thực khoa học: Dữ liệu thực nghiệm của nhóm hỗ trợ những kết luận nào (bắt buộc dùng compile/execution gate, đo song song BC & MS) và KHÔNG hỗ trợ kết luận nào (không suy rộng cho mọi model hoặc suy diễn về student tests).
- **Lời thoại gợi ý (Script):**
> *“Tiếp theo, em xin trình bày về 5 câu hỏi nghiên cứu của đề tài. RQ1 và RQ2 kiểm định xem bộ test của GPT có vượt qua các ngưỡng chất lượng tối thiểu rút ra từ nghiên cứu của Huang (2026) và MutGen (2026) hay không. RQ3 so sánh cặp trực tiếp GPT với EvoSuite. RQ4 đo tỷ lệ thành công kép và RQ5 phân tích các failure pattern chính.”*
> *(Chuyển sang Slide 8 sau khi các bạn kỹ thuật nói xong)*
> *“Dựa trên các con số thực nghiệm, nhóm chúng em đưa ra ranh giới biện luận chặt chẽ: Kết quả hỗ trợ việc khẳng định cần thiết lập cổng kiểm định thực thi nghiêm ngặt và đo lường đa chiều. Tuy nhiên, chúng em không lạm dụng số liệu để khẳng định GPT luôn tạo test đúng, hoặc suy rộng kết quả so sánh này sang bộ test viết tay của sinh viên do đặc tính thuật toán sinh test của EvoSuite là hoàn toàn khác biệt.”*

---

### NGƯỜI NÓI 3: Đỗ Long Vỹ (API & Automation Engineer) — [4:30 - 7:00]

- **Slide phụ trách:**
    - [Slide 4: Pipeline - Phần API](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/presentation/slides_final.pptx#4)
    - [Slide 5: Results: Validity](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/presentation/slides_final.pptx#5)
- **Nội dung trình bày:**
    - **Slide 4 (1:00):** Giải thích pipeline API: Cố định model `gpt-4o-mini-2024-07-18` ở `temp = 0`. Quy trình trích xuất code Java tự động từ markdown response và cơ chế Self-repair 1 lượt khi gặp lỗi.
    - **Slide 5 (1:30):** Trực quan hóa lỗi thực thi bằng biểu đồ [fig1_execution_status.png](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/results/figures/fig1_execution_status.png). Chỉ ra 47 suite lỗi assertion và 2 suite lỗi compile.
- **Lời thoại gợi ý (Script):**
> *“Về mặt kỹ thuật, em thiết lập pipeline gọi API OpenAI zero-shot cố định temperature bằng 0 để đảm bảo tính tái lập. Code test sau khi sinh được tự động bóc tách và ghi vào dự án Maven. Nếu test bị lỗi biên dịch hoặc chạy thử, hệ thống sẽ gửi log lỗi quay lại API để thực hiện tối đa 1 lượt tự sửa lỗi (Self-repair).”*
> *(Chuyển sang Slide 5)*
> *“Kết quả chạy thực tế cho thấy tính đúng đắn của assertion chính là nút thắt cổ chai lớn nhất. Có tới 47 trên tổng số 49 suite hỏng là do assertion sai lệch logic với mã nguồn chuẩn (chiếm 95.9% lượng suite hỏng). Điều này chứng minh LLM rất dễ viết code đúng cú pháp nhưng cực kỳ khó đoán đúng giá trị trả về của các hàm toán học phức tạp nếu chỉ suy luận tĩnh.”*

---

### NGƯỜI NÓI 4: Huỳnh Cao Phước (EvoSuite & Environment Owner) — [7:00 - 9:00]

- **Slide phụ trách:**
    - [Slide 4: Pipeline - Phần Môi trường](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/presentation/slides_final.pptx#4)
    - [Slide 7: Results: Paired Comparison](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/presentation/slides_final.pptx#7)
- **Nội dung trình bày:**
    - **Slide 4 (0:30):** Giải thích thiết lập môi trường: JDK 8 (Temurin) bắt buộc cho EvoSuite 1.0.6, tích hợp JaCoCo và PIT. Sử dụng baseline EvoSuite lưu trữ (1m, 3m, 5m) và đo lường lại trên cùng một máy để đảm bảo công bằng.
    - **Slide 7 (1:30):** Trình bày kết quả so sánh cặp (RQ3) sử dụng biểu đồ [fig3_gpt_vs_evosuite_paired.png](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/results/figures/fig3_gpt_vs_evosuite_paired.png). Giải thích kết quả kiểm định Wilcoxon hiệu chỉnh Holm: Không có sự khác biệt có ý nghĩa thống kê ($p > 0.05$).
- **Lời thoại gợi ý (Script):**
> *“Về mặt môi trường kiểm thử, em đã cấu hình dự án Maven chạy trên nền JDK 8 để tương thích hoàn toàn với runtime của EvoSuite. Để so sánh công bằng, chúng em không chạy lại việc sinh test của EvoSuite mà lấy đúng các suite test đã được archive sẵn ở các budget 1, 3, 5 phút và tiến hành đo đạc lại độ bao phủ và mutation score trên cùng một môi trường với GPT.”*
> *(Chuyển sang Slide 7)*
> *“Kết quả so sánh cặp trực tiếp trên các hàm mà cả hai cùng sinh test thành công cho thấy: sau khi thực hiện kiểm định Wilcoxon và hiệu chỉnh Holm cho đa so sánh, không có mốc thời gian nào (1m, 3m, 5m) ghi nhận sự khác biệt có ý nghĩa thống kê về cả độ bao phủ lẫn mutation score ($p > 0.05$). Mốc gần đạt ý nghĩa thống kê nhất là 5m Mutation Score với p-value thô là 0.0625, nhưng sau hiệu chỉnh Holm thì tăng lên 0.375, chấp nhận giả thuyết không $H_0$.”*

---

### NGƯỜI NÓI 5: Nguyễn Thị Như Ý (Data & Pipeline Engineer) — [9:00 - 11:00]

- **Slide phụ trách:**
    - [Slide 6: Results: Full Corpus](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/presentation/slides_final.pptx#6)
    - [Slide 9: Conclusion and Future Work](file:///f:/Ky%205/SWT301/Github/SE1944_LLM_Unit_Test_Generation/presentation/slides_final.pptx#9)
- **Nội dung trình bày:**
    - **Slide 6 (1:00):** Giải thích số liệu Full Corpus (63 hàm). Chỉ ra trung bình Branch Coverage đạt 18.90% và Mutation Score đạt 16.21% (do tính điểm 0% cho các suite lỗi). Nêu kết luận bác bỏ giả thuyết cho RQ1, RQ2 và RQ4.
    - **Slide 9 (1:00):** Tóm tắt nghiên cứu (14/63 pass, 63/63 EvoSuite pass, 0/6 so sánh có ý nghĩa thống kê). Đề xuất tương lai: Feedback-guided repair và đo đạc Student Benchmark.
- **Lời thoại gợi ý (Script):**
> *“Em xin trình bày kết quả trên toàn bộ mẫu 63 hàm. Khi không lọc bỏ các test suite bị lỗi thực thi, điểm số trung bình của GPT bị kéo giảm đáng kể, chỉ đạt 18.90% độ bao phủ nhánh và 16.21% điểm đột biến. Do đó, các giả thuyết nghiên cứu RQ1, RQ2 (cả sàn và mục tiêu) cũng như RQ4 đều không đạt ý nghĩa thống kê để bác bỏ giả thuyết không $H_0$.”*
> *(Chuyển sang Slide 9)*
> *“Tóm lại, nghiên cứu của nhóm đã chỉ ra các rào cản thực tế của việc ứng dụng LLM sinh test tự động. Trong tương lai, nhóm đề xuất xây dựng bộ công cụ phản hồi lỗi chạy test thời gian thực để nâng cao tỷ lệ sinh test thành công, đồng thời tiến hành đo đạc trực tiếp các bài kiểm thử viết tay của sinh viên trên cùng hệ thống đo lường JaCoCo/PIT này.”*

---

## 3. Chiến thuật Phòng thủ Q&A theo Vai trò

Khi Hội đồng đặt câu hỏi phản biện, **Lê Thế Khang (PL)** sẽ đóng vai trò điều phối câu hỏi cho các thành viên phụ trách mảng tương ứng nhằm thể hiện tính chuyên nghiệp và teamwork:

1. **Nếu câu hỏi về: Lựa chọn Ngữ cảnh / GAP Nghiên cứu / Kết luận Biện luận**
    - *Người trả lời:* **Lê Thế Khang** hoặc **Phạm An Khang**.
    - *Trọng tâm:* Nhấn mạnh tính chặt chẽ trong diễn giải kết quả, không vội vàng kết luận GPT thay thế được sinh viên hoặc EvoSuite đại diện cho con người.
2. **Nếu câu hỏi về: Prompting / API Key / Cơ chế Self-Repair / Dạng lỗi Assertion**
    - *Người trả lời:* **Đỗ Long Vỹ**.
    - *Trọng tâm:* Giải thích cách bóc tách mã nguồn Java bằng Regex/Markdown Parser và việc log chi phí API rất minh bạch (~0.068 USD cho toàn bộ quá trình).
3. **Nếu câu hỏi về: EvoSuite / Cấu hình JaCoCo / PIT Mutation Operators / JDK compatibility**
    - *Người trả lời:* **Huỳnh Cao Phước**.
    - *Trọng tâm:* Giải thích EvoSuite 1.0.6 yêu cầu JDK 8 do dependency `tools.jar` và PIT sử dụng bộ toán tử mặc định (`DEFAULTS`).
4. **Nếu câu hỏi về: Kiểm định Wilcoxon / Holm correction / Cỡ mẫu N / Tại sao kết quả RQ3 không significant**
    - *Người trả lời:* **Nguyễn Thị Như Ý**.
    - *Trọng tâm:* Giải thích phép kiểm Wilcoxon là phi tham số phù hợp với dữ liệu không chuẩn, và Holm correction giúp kiểm soát tỷ lệ lỗi loại I (Family-wise error rate) khi thực hiện nhiều so sánh đồng thời.