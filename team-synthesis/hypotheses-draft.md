# Bản Nháp Giả Thuyết

Các giả thuyết dưới đây bám theo `team-synthesis/rq-final.md` và dùng cùng đơn vị phân tích: mỗi function/method trong dataset có một cặp kết quả gồm `GPT-4/GPT-4o-generated tests` và `student-written tests`.

## RQ1 - Ngưỡng Branch Coverage

Unit tests do GPT-4/GPT-4o sinh ra có đạt branch coverage >=80% không?

- **H0_1:** Median branch coverage của unit tests do GPT-4/GPT-4o sinh ra thấp hơn 80%.
- **H1_1:** Median branch coverage của unit tests do GPT-4/GPT-4o sinh ra đạt ít nhất 80%.

Kiểm định dự kiến: one-sample Wilcoxon signed-rank test với ngưỡng 80%.

## RQ2 - Ngưỡng Mutation Score

Unit tests do GPT-4/GPT-4o sinh ra có đạt mutation score >=60% không?

- **H0_2:** Median mutation score của unit tests do GPT-4/GPT-4o sinh ra thấp hơn 60%.
- **H1_2:** Median mutation score của unit tests do GPT-4/GPT-4o sinh ra đạt ít nhất 60%.

Kiểm định dự kiến: one-sample Wilcoxon signed-rank test với ngưỡng 60%.

## RQ3 - So Sánh Với Unit Tests Do Sinh Viên Viết

Unit tests do GPT-4/GPT-4o sinh ra có khác biệt có ý nghĩa thống kê so với unit tests do sinh viên viết trên cùng functions không?

- **H0_3a:** Không có khác biệt có ý nghĩa thống kê về branch coverage giữa GPT-4/GPT-4o-generated tests và student-written tests.
- **H1_3a:** Có khác biệt có ý nghĩa thống kê về branch coverage giữa GPT-4/GPT-4o-generated tests và student-written tests.

- **H0_3b:** Không có khác biệt có ý nghĩa thống kê về mutation score giữa GPT-4/GPT-4o-generated tests và student-written tests.
- **H1_3b:** Có khác biệt có ý nghĩa thống kê về mutation score giữa GPT-4/GPT-4o-generated tests và student-written tests.

Kiểm định dự kiến: paired Wilcoxon signed-rank test vì hai test suites được đánh giá trên cùng functions.

## RQ4 - Tỷ Lệ Đạt Đồng Thời Hai Ngưỡng

Unit tests do GPT-4/GPT-4o sinh ra có đạt đồng thời cả hai ngưỡng trên đa số functions không?

- **H0_4:** Tỷ lệ functions mà GPT-4/GPT-4o-generated tests đạt cả branch coverage >=80% và mutation score >=60% là <=50%.
- **H1_4:** Tỷ lệ functions mà GPT-4/GPT-4o-generated tests đạt cả branch coverage >=80% và mutation score >=60% là >50%.

Kiểm định dự kiến: exact binomial test hoặc sign test trên kết quả đạt/không đạt của từng function.

## Ghi Chú Phân Tích

- Dùng cùng một tập functions cho GPT-generated tests và student-written tests.
- Loại riêng hoặc báo cáo riêng các tests không compile/chạy được, vì coverage và mutation score không có ý nghĩa nếu test suite không executable.
- Báo cáo descriptive statistics trước: median, IQR, min/max và số lượng executable test suites.
- Nếu kiểm định nhiều giả thuyết cùng lúc, dùng hiệu chỉnh multiple-comparison đơn giản như Holm correction.
