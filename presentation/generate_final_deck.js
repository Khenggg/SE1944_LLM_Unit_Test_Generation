const pptxgen = require('pptxgenjs');
const fs = require('fs');
const path = require('path');

const pptx = new pptxgen();
pptx.author = 'SE1944 Nhóm 01';
pptx.company = 'FPT University';
pptx.subject = 'RBL-5A final presentation';
pptx.title = 'Đánh giá GPT-4o-mini sinh unit test Java';
pptx.lang = 'vi-VN';
pptx.layout = 'LAYOUT_WIDE';
pptx.theme = { headFontFace: 'Aptos Display', bodyFontFace: 'Aptos', lang: 'vi-VN' };
pptx.defineLayout({ name: 'LAYOUT_WIDE', width: 13.333, height: 7.5 });

const C = {
  white: 'FFFFFF', ink: '111111', muted: '595959', line: 'D6D6D6', panel: 'F2F2F2',
  blue: '2563EB', bluePale: 'EAF2FF', red: 'C62828', redPale: 'FCECEC',
  green: '147A4B', greenPale: 'EAF7EF', amber: '9A6700', amberPale: 'FFF6DD',
};
const W = 13.333;
const M = 0.44;
const figDir = path.join(__dirname, '..', 'results', 'figures');

function addText(slide, text, x, y, w, h, fontSize, options = {}) {
  slide.addText(text, {
    x, y, w, h, fontFace: options.fontFace || 'Aptos', fontSize,
    bold: options.bold || false, color: options.color || C.ink,
    margin: options.margin === undefined ? 0 : options.margin,
    align: options.align || 'left', valign: options.valign || 'top',
    breakLine: false, fit: options.fit || 'shrink',
  });
}

function rect(slide, x, y, w, h, fill = C.panel, line = C.line) {
  slide.addShape(pptx.ShapeType.rect, { x, y, w, h, fill: { color: fill }, line: { color: line, width: 0.7 } });
}

function chrome(slide, page, section) {
  slide.background = { color: C.white };
  addText(slide, 'SE1944  |  EMPIRICAL STUDY', M, 0.25, 3.7, 0.18, 8.5, { color: C.muted, bold: true });
  addText(slide, section, 9.7, 0.25, 3.15, 0.18, 8.5, { color: C.muted, bold: true, align: 'right' });
  slide.addShape(pptx.ShapeType.rect, { x: M, y: 0.62, w: 12.45, h: 0.02, fill: { color: C.ink }, line: { color: C.ink } });
  addText(slide, String(page).padStart(2, '0'), 12.18, 7.08, 0.65, 0.18, 8.5, { color: C.muted, align: 'right' });
}

function title(slide, text, subtitle) {
  addText(slide, text, M, 0.95, 10.7, 0.44, 27, { bold: true, fontFace: 'Aptos Display' });
  if (subtitle) addText(slide, subtitle, M, 1.53, 10.7, 0.34, 12.8, { color: C.muted });
}

function metric(slide, x, y, w, label, value, note, color = C.ink) {
  rect(slide, x, y, w, 1.38);
  addText(slide, label.toUpperCase(), x + 0.18, y + 0.16, w - 0.36, 0.17, 8, { color: C.muted, bold: true });
  addText(slide, value, x + 0.18, y + 0.46, w - 0.36, 0.34, 22, { color, bold: true });
  addText(slide, note, x + 0.18, y + 1.03, w - 0.36, 0.16, 8.5, { color: C.muted });
}

function bullets(slide, items, x, y, w, size = 14, color = C.ink, gap = 0.52) {
  items.forEach((item, index) => {
    addText(slide, '•', x, y + index * gap, 0.18, 0.25, size, { color, bold: true });
    addText(slide, item, x + 0.22, y + index * gap, w - 0.22, 0.36, size, { color });
  });
}

// 1. Cover
{
  const s = pptx.addSlide();
  s.background = { color: C.white };
  addText(s, 'SE1944  |  RBL-5A FINAL PRESENTATION', M, 0.42, 5.4, 0.2, 10, { color: C.muted, bold: true });
  addText(s, 'Zero-shot GPT-4o-mini tạo được 14 test suite chạy hợp lệ trên 63 hàm Java', M, 1.82, 11.15, 1.5, 34, { bold: true, fontFace: 'Aptos Display' });
  addText(s, 'Đánh giá bằng execution validity, branch coverage, mutation score và paired comparison với EvoSuite.', M, 3.72, 8.6, 0.55, 17, { color: C.muted });
  s.addShape(pptx.ShapeType.rect, { x: M, y: 5.63, w: 12.45, h: 0.02, fill: { color: C.ink }, line: { color: C.ink } });
  addText(s, 'Lê Thế Khang  |  Huỳnh Cao Phước  |  Phạm An Khang  |  Nguyễn Thị Như Ý  |  Đỗ Long Vỹ', M, 5.97, 11.9, 0.2, 11.3, { color: C.ink });
  addText(s, 'HumanEval-Java  •  GPT-4o-mini-2024-07-18  •  JaCoCo + PIT  •  16 July 2026', M, 6.55, 11.5, 0.2, 9.5, { color: C.muted });
  s.addNotes('0:30. Chào giảng viên, giới thiệu nhóm và nêu scope: đánh giá zero-shot GPT-4o-mini trên 63 hàm Java. Không đọc từng metric ở slide này.');
}

// 2. Problem and scope
{
  const s = pptx.addSlide(); chrome(s, 2, 'WHY THIS STUDY');
  title(s, 'API trả text không đồng nghĩa test suite hợp lệ', 'Đánh giá cần tách generation, compilation, execution và fault detection.');
  metric(s, M, 2.75, 3.62, 'API generation', '63 / 63', 'mọi target đều trả content', C.green);
  metric(s, 4.86, 2.75, 3.62, 'Executable suites', '14 / 63', 'compile và pass', C.red);
  metric(s, 9.28, 2.75, 3.62, 'Invalid suites', '49 / 63', '47 assertion; 2 compile failure', C.red);
  addText(s, 'Ranh giới diễn giải', M, 5.15, 3.0, 0.24, 14, { bold: true });
  addText(s, 'EvoSuite là comparator kỹ thuật có thể tái lập, không phải student-written data. So sánh với student benchmark được hoãn vì chưa có đo lường per-function tương thích.', M, 5.58, 11.8, 0.55, 14, { color: C.muted });
  s.addNotes('1:00. Nêu vấn đề thực tế: API trả code không chứng minh test đúng. Nhấn mạnh 63/63 response nhưng chỉ 14/63 suite compile và pass. EvoSuite không phải student proxy.');
}

// 3. Research questions
{
  const s = pptx.addSlide(); chrome(s, 3, 'RESEARCH QUESTIONS');
  title(s, 'Năm RQ liên kết quality threshold với execution reality', 'RQ3 chỉ dùng SUT mà GPT và EvoSuite đều pass.');
  const rows = [
    ['RQ1', 'GPT có vượt 30.22% branch coverage không?'],
    ['RQ2', 'GPT có vượt mutation-score floor 4.00% và target 40.21% không?'],
    ['RQ3', 'Ở budget 1, 3, 5 phút, GPT có khác EvoSuite trên cùng SUT không?'],
    ['RQ4', 'Có hơn một nửa SUT đạt đồng thời cả hai threshold không?'],
    ['RQ5', 'Failure pattern nào ngăn test đạt các threshold?'],
  ];
  rows.forEach((row, i) => {
    const y = 2.48 + i * 0.72;
    addText(s, row[0], 0.58, y, 0.7, 0.22, 14, { color: C.blue, bold: true });
    addText(s, row[1], 1.48, y, 10.7, 0.28, 13.5);
    if (i < rows.length - 1) s.addShape(pptx.ShapeType.line, { x: M, y: y + 0.47, w: 11.95, h: 0, line: { color: C.line, width: 0.7 } });
  });
  s.addNotes('1:30. Lướt qua năm RQ. Giải thích RQ3 chỉ ghép khi cả GPT và EvoSuite đều pass; RQ5 mô tả failure pattern nên không có p-value.');
}

// 4. Pipeline
{
  const s = pptx.addSlide(); chrome(s, 4, 'METHOD');
  title(s, 'Một pipeline cố định đo cả hai tool trên cùng 63 SUT', 'Zero-shot generation được ghi riêng với execution validity và metric quality.');
  const steps = [
    ['01', 'Source', '63 correct Java functions'], ['02', 'Generate', 'GPT-4o-mini; temp = 0'],
    ['03', 'Validate', 'Maven compile + run'], ['04', 'Measure', 'JaCoCo + PIT'],
    ['05', 'Compare', 'Paired Wilcoxon + Holm'],
  ];
  steps.forEach((step, i) => {
    const x = 0.45 + i * 2.55;
    rect(s, x, 2.82, 2.18, 1.64, i === 2 ? C.redPale : C.panel, i === 2 ? 'E3B7B7' : C.line);
    addText(s, step[0], x + 0.17, 3.05, 0.45, 0.18, 10, { color: C.blue, bold: true });
    addText(s, step[1], x + 0.17, 3.42, 1.8, 0.24, 15, { bold: true });
    addText(s, step[2], x + 0.17, 3.92, 1.82, 0.3, 9.7, { color: C.muted });
    if (i < 4) addText(s, '→', x + 2.2, 3.47, 0.28, 0.25, 16, { color: C.muted, align: 'center' });
  });
  addText(s, 'Archive EvoSuite 1/3/5 phút không được generate lại; chúng được đo lại bằng cùng Maven/JaCoCo/PIT pipeline trên Temurin JDK 8.', M, 5.42, 11.8, 0.42, 13.3, { color: C.muted });
  s.addNotes('1:30. Đi từ source đến generation, validation, measurement, comparison. Nêu temperature = 0, một repair pass được phép, và EvoSuite archive chỉ được đo lại chứ không generate lại.');
}

// 5. Execution evidence
{
  const s = pptx.addSlide(); chrome(s, 5, 'RESULTS: VALIDITY');
  title(s, 'Execution validity là giới hạn chính của zero-shot protocol', 'Chỉ 14 test suite pass sau generation và một repair cycle được phép.');
  s.addImage({ path: path.join(figDir, 'fig1_execution_status.png'), x: M, y: 2.33, w: 7.15, h: 3.78, sizing: { type: 'contain', x: M, y: 2.33, w: 7.15, h: 3.78 } });
  metric(s, 8.46, 2.6, 3.85, 'Assertion failures', '47', '95.9% số suite invalid', C.red);
  metric(s, 8.46, 4.32, 3.85, 'Compile failures', '2', '4.1% số suite invalid', C.red);
  addText(s, 'Kết luận: API success không được tính là test-suite success.', 8.46, 6.1, 3.85, 0.35, 11.3, { color: C.muted });
  s.addNotes('1:00. Dừng ở cột assertion failure: 47/49 suite invalid thất bại vì assertion, nên oracle validity là bottleneck chính. Không gọi API success là test success.');
}

// 6. Full corpus quality
{
  const s = pptx.addSlide(); chrome(s, 6, 'RESULTS: FULL CORPUS');
  title(s, 'Kết quả full corpus không đạt các giả thuyết đã định trước', 'Số liệu gồm toàn bộ 63 target, không chỉ executable subset.');
  s.addImage({ path: path.join(figDir, 'fig2_gpt_metric_distribution.png'), x: M, y: 2.3, w: 7.0, h: 3.8, sizing: { type: 'contain', x: M, y: 2.3, w: 7.0, h: 3.8 } });
  metric(s, 8.3, 2.55, 4.0, 'Aggregate branch coverage', '18.90%', '144 / 762 branches', C.red);
  metric(s, 8.3, 4.27, 4.0, 'Aggregate mutation score', '16.21%', '135 / 833 mutants', C.red);
  addText(s, 'RQ1, cả hai RQ2 threshold và RQ4 đều không được hỗ trợ (p > 0.05). Dual success: 13 / 63 = 20.63%.', 8.3, 6.02, 4.0, 0.52, 11, { color: C.muted });
  s.addNotes('1:30. Đây là full corpus: không lọc các suite fail. Nêu 18.90% branch, 16.21% mutation, dual success 13/63. Kết luận RQ1, RQ2 và RQ4 không được hỗ trợ.');
}

// 7. Paired comparison
{
  const s = pptx.addSlide(); chrome(s, 7, 'RESULTS: PAIRED COMPARISON');
  title(s, 'Không có GPT–EvoSuite comparison nào significant sau Holm', 'RQ3 dùng 14 branch pairs và 13 mutation pairs vì chỉ ghép suite pass ở cả hai tool.');
  s.addImage({ path: path.join(figDir, 'fig3_gpt_vs_evosuite_paired.png'), x: M, y: 2.34, w: 7.18, h: 3.75, sizing: { type: 'contain', x: M, y: 2.34, w: 7.18, h: 3.75 } });
  metric(s, 8.5, 2.58, 3.78, 'Closest comparison', '5m mutation', 'raw p = 0.062509', C.amber);
  metric(s, 8.5, 4.3, 3.78, 'After adjustment', 'p = 0.375053', 'not statistically significant', C.ink);
  addText(s, 'Không được tổng quát hóa pass-conditioned GPT mean sang full 63-SUT corpus.', 8.5, 6.0, 3.78, 0.54, 10.6, { color: C.muted });
  s.addNotes('1:30. RQ3 là câu hỏi có điều kiện trên suite pass ở cả hai tool. 5-minute mutation gần nhất nhưng raw p=0.062509 và Holm p=0.375053, vì vậy không significant.');
}

// 8. Interpretation
{
  const s = pptx.addSlide(); chrome(s, 8, 'INTERPRETATION');
  title(s, 'Bottleneck là oracle validity, không phải khả năng API trả code', 'Kết quả âm cho zero-shot reliability vẫn cho thấy workflow cần kiểm soát chặt.');
  rect(s, M, 2.58, 5.7, 3.05, C.bluePale, 'B9CEF6');
  addText(s, 'Evidence supports', 0.68, 2.89, 3.0, 0.24, 15, { bold: true });
  bullets(s, ['Gate bằng compilation và execution.', 'Báo branch coverage kèm mutation score.', 'Dùng EvoSuite theo budget đã nêu.'], 0.68, 3.48, 4.85, 12.8);
  rect(s, 6.95, 2.58, 5.7, 3.05, C.redPale, 'E3B7B7');
  addText(s, 'Evidence does not support', 7.2, 2.89, 3.9, 0.24, 15, { bold: true });
  bullets(s, ['GPT zero-shot luôn sinh test Java hợp lệ.', 'GPT tương đương EvoSuite trong mọi setting.', 'Bất kỳ suy luận nào về student-written tests.'], 7.2, 3.48, 4.85, 12.8);
  s.addNotes('1:30. Cân bằng kết luận: kết quả âm vẫn hữu ích. Nói rõ evidence supports strict validation và không supports bất kỳ kết luận nào về student benchmark.');
}

// 9. Conclusion
{
  const s = pptx.addSlide(); chrome(s, 9, 'CONCLUSION');
  title(s, 'Bước tiếp theo: repair feedback và student baseline', 'Nghiên cứu này thiết lập ranh giới hiện tại và baseline có thể tái lập cho follow-up experiment.');
  metric(s, M, 2.78, 3.62, 'Current result', '14 / 63', 'GPT suites executable', C.red);
  metric(s, 4.86, 2.78, 3.62, 'Technical baseline', '63 / 63', 'EvoSuite suites pass mỗi budget', C.green);
  metric(s, 9.28, 2.78, 3.62, 'Inference', '0 / 6', 'RQ3 significant after Holm', C.ink);
  addText(s, 'Future work', M, 5.05, 2.5, 0.24, 15, { bold: true });
  bullets(s, ['Repair assertion bằng execution feedback.', 'Lặp lại trên benchmark/model khác.', 'Đo student suites bằng cùng pipeline trước khi so sánh.'], M, 5.48, 11.5, 12.4, C.muted, 0.4);
  s.addNotes('1:00. Chốt bằng ba con số: 14/63 executable, 63/63 EvoSuite pass tại mỗi budget, 0/6 RQ3 comparison significant sau Holm. Mời câu hỏi. Tổng thời lượng mục tiêu: 11 phút.');
}

const output = path.join(__dirname, 'slides_final.pptx');
fs.mkdirSync(path.dirname(output), { recursive: true });
pptx.writeFile({ fileName: output });
