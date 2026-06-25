const pptxgen = require("pptxgenjs");
const fs = require("fs");
const path = require("path");

const pptx = new pptxgen();
pptx.author = "SE1944 Nhóm 01";
pptx.company = "SE1944";
pptx.subject = "Bảo vệ đề cương nghiên cứu";
pptx.title = "Sinh Unit Test Tự Động Cho Hàm Java Dùng GPT-4o-mini";
pptx.lang = "vi-VN";
pptx.defineLayout({ name: "CUSTOM_WIDE", width: 13.333, height: 7.5 });
pptx.layout = "CUSTOM_WIDE";
pptx.theme = {
  headFontFace: "Aptos Display",
  bodyFontFace: "Aptos",
  lang: "vi-VN",
};

const C = {
  bg: "F7FAFC",
  navy: "0F2742",
  ink: "1B2633",
  muted: "52616F",
  teal: "14A3A5",
  tealDark: "0B6F73",
  orange: "F59E0B",
  red: "D64545",
  green: "24A148",
  white: "FFFFFF",
  line: "D8E1E8",
  pale: "EAF7F7",
  bluePale: "EAF1FA",
  amberPale: "FFF4D6",
};

const W = 13.333;
const M = 0.55;

function bg(slide, section, page) {
  slide.background = { color: C.bg };
  slide.addShape(pptx.ShapeType.rect, {
    x: 0,
    y: 0,
    w: W,
    h: 0.18,
    fill: { color: C.teal },
    line: { color: C.teal },
  });
  slide.addText(section, {
    x: M,
    y: 0.28,
    w: 6.5,
    h: 0.22,
    fontSize: 7.8,
    bold: true,
    color: C.tealDark,
    margin: 0,
    fit: "shrink",
  });
  slide.addText("SE1944 Nhóm 01 | RT-SWT-001", {
    x: M,
    y: 7.08,
    w: 3.3,
    h: 0.18,
    fontSize: 7.5,
    color: C.muted,
    margin: 0,
  });
  slide.addText(page, {
    x: W - 1.15,
    y: 7.08,
    w: 0.6,
    h: 0.18,
    fontSize: 8,
    color: C.muted,
    align: "right",
    margin: 0,
  });
}

function addTitle(slide, t, sub) {
  slide.addText(t, {
    x: M,
    y: 0.72,
    w: 8.4,
    h: 0.55,
    fontFace: "Aptos Display",
    fontSize: 24,
    bold: true,
    color: C.navy,
    margin: 0,
    fit: "shrink",
  });
  if (sub) {
    slide.addText(sub, {
      x: M,
      y: 1.32,
      w: 8.5,
      h: 0.28,
      fontSize: 10.5,
      color: C.muted,
      margin: 0,
      fit: "shrink",
    });
  }
}

function card(slide, x, y, w, h, fill = C.white) {
  slide.addShape(pptx.ShapeType.roundRect, {
    x,
    y,
    w,
    h,
    rectRadius: 0.06,
    fill: { color: fill },
    line: { color: C.line, width: 1 },
    shadow: { type: "outer", color: "CBD5E1", opacity: 0.14, blur: 1, angle: 45, distance: 1 },
  });
}

function bullet(slide, items, x, y, w, h, fontSize = 9.6) {
  const runs = [];
  items.forEach((item, idx) => {
    if (idx) runs.push({ text: "\n", options: {} });
    runs.push({ text: item, options: { bullet: { type: "bullet" }, hanging: 4 } });
  });
  slide.addText(runs, {
    x,
    y,
    w,
    h,
    fontSize,
    color: C.ink,
    fit: "shrink",
    margin: 0.04,
    paraSpaceAfterPt: 4,
  });
}

function metric(slide, x, y, w, label, value, note, color = C.tealDark) {
  card(slide, x, y, w, 1.12);
  slide.addText(label, { x: x + 0.14, y: y + 0.13, w: w - 0.28, h: 0.18, fontSize: 7.5, bold: true, color: C.muted, margin: 0, fit: "shrink" });
  slide.addText(value, { x: x + 0.14, y: y + 0.43, w: w - 0.28, h: 0.38, fontSize: 18, bold: true, color, margin: 0, fit: "shrink" });
  slide.addText(note, { x: x + 0.14, y: y + 0.88, w: w - 0.28, h: 0.12, fontSize: 6.8, color: C.muted, margin: 0, fit: "shrink" });
}

function chip(slide, text, x, y, w, fill = C.tealDark) {
  slide.addShape(pptx.ShapeType.roundRect, {
    x,
    y,
    w,
    h: 0.32,
    rectRadius: 0.04,
    fill: { color: fill },
    line: { color: fill },
  });
  slide.addText(text, {
    x: x + 0.08,
    y: y + 0.08,
    w: w - 0.16,
    h: 0.12,
    fontSize: 7.6,
    bold: true,
    color: C.white,
    align: "center",
    margin: 0,
    fit: "shrink",
  });
}

function src(slide, text) {
  slide.addText(text, {
    x: 8.3,
    y: 7.08,
    w: 3.85,
    h: 0.16,
    fontSize: 6.4,
    color: "6B7280",
    align: "right",
    margin: 0,
    fit: "shrink",
  });
}

// 1
{
  const s = pptx.addSlide();
  s.background = { color: C.navy };
  s.addShape(pptx.ShapeType.rect, { x: 0, y: 0, w: W, h: 7.5, fill: { color: C.navy }, line: { color: C.navy } });
  s.addShape(pptx.ShapeType.rect, { x: 0, y: 6.95, w: W, h: 0.55, fill: { color: C.teal }, line: { color: C.teal } });
  s.addText("RT-SWT-001 | BẢO VỆ ĐỀ CƯƠNG NGHIÊN CỨU", { x: 0.65, y: 0.7, w: 4.8, h: 0.22, fontSize: 9, bold: true, color: "A8F3F0", margin: 0 });
  s.addText("Sinh Unit Test Tự Động Cho Hàm Java", { x: 0.65, y: 1.25, w: 8.2, h: 0.62, fontFace: "Aptos Display", fontSize: 31, bold: true, color: C.white, margin: 0, fit: "shrink" });
  s.addText("Dùng GPT-4o-mini: paired comparison với Student Benchmark Tests", { x: 0.65, y: 2.05, w: 7.7, h: 0.5, fontSize: 16.5, color: "DBEAFE", margin: 0, fit: "shrink" });
  const names = [
    ["PL  Lê Thế Khang"],
    ["DG  Huỳnh Cao Phước"],
    ["LR  Phạm An Khang"],
    ["MS  Nguyễn Thị Như Ý"],
    ["RW  Đỗ Long Vỹ"],
  ];
  names.forEach(([n], i) => chip(s, n, 0.65 + (i % 3) * 2.55, 4.05 + Math.floor(i / 3) * 0.55, 2.22, "164E63"));
  s.addText("SE1944 - Nhóm 01", { x: 0.65, y: 5.55, w: 2.5, h: 0.25, fontSize: 12, bold: true, color: "D1FAE5", margin: 0 });
  s.addText("Ngày bảo vệ: cập nhật theo lịch thực tế", { x: 0.65, y: 5.9, w: 3.2, h: 0.22, fontSize: 9.5, color: "CBD5E1", margin: 0 });
  s.addText("HumanEval-Java | GPT-4o-mini | JaCoCo + PIT | Wilcoxon + Binomial", { x: 0.65, y: 7.1, w: 6.9, h: 0.18, fontSize: 8, bold: true, color: C.white, margin: 0 });
}

// 2
{
  const s = pptx.addSlide();
  bg(s, "ĐẶT VẤN ĐỀ", "02");
  addTitle(s, "Vấn Đề Nghiên Cứu", "Vì sao Branch Coverage chưa đủ để đánh giá unit test do LLM sinh ra?");
  const cols = [
    ["Bối cảnh", C.bluePale, ["Viết unit test thủ công tốn thời gian và dễ bỏ sót edge cases.", "LLM test generation là hướng SOTA giúp tự động hóa một phần quy trình kiểm thử."]],
    ["Hiện trạng", C.pale, ["GPT-4, LLaMA-3 và GPT-4o-mini đã cho thấy khả năng sinh test khá tốt.", "Nhưng coverage cao không đồng nghĩa với fault detection tốt."]],
    ["Research GAP", C.amberPale, ["GAP-D: thiếu paired comparison giữa GPT-4o-mini và Student Benchmark trên cùng HumanEval-Java functions.", "GAP-M: cần dùng Mutation Score bên cạnh Branch Coverage để tránh đánh giá lệch."]],
  ];
  cols.forEach(([h, fill, items], i) => {
    const x = M + i * 4.1;
    card(s, x, 1.88, 3.72, 3.75, fill);
    s.addText(h, { x: x + 0.18, y: 2.12, w: 3.3, h: 0.26, fontSize: 14, bold: true, color: C.navy, margin: 0 });
    bullet(s, items, x + 0.22, 2.68, 3.2, 2.05, 10);
  });
  s.addShape(pptx.ShapeType.rect, { x: M, y: 6.03, w: 12.2, h: 0.62, fill: { color: C.navy }, line: { color: C.navy } });
  s.addText("Ý nghĩa: cần cơ sở khoa học để biết AI hỗ trợ được sinh viên đến mức nào trước khi dùng trong học tập hoặc chấm bài.", { x: M + 0.22, y: 6.23, w: 11.7, h: 0.22, fontSize: 10.5, bold: true, color: C.white, margin: 0, fit: "shrink" });
  src(s, "Nguồn: proposal.md; gap-statement-final.md");
}

// 3
{
  const s = pptx.addSlide();
  bg(s, "NGHIÊN CỨU LIÊN QUAN", "03");
  addTitle(s, "Tổng Quan Related Work & GAP Mapping", "Bảng bằng chứng gộp: N = 39 papers sau khi loại trùng");
  metric(s, 0.65, 1.75, 2.3, "SỐ PAPER", "39", "paper đã tổng hợp", C.navy);
  metric(s, 3.22, 1.75, 2.3, "GAP-D CHÍNH", "0", "paper làm paired Java student baseline", C.red);
  metric(s, 5.79, 1.75, 2.3, "GAP-M PHỤ", "12", "paper ủng hộ dùng 2 metric", C.tealDark);
    const rows = [
    ["[005]", "Al-Tse\'23", "TestPilot: 52.8% Branch Coverage", "Không đo Mutation Score"],
    ["[010]", "Huang\'26", "ULT: 30.22% BC, 40.21% MS", "Chưa có paired baseline với sinh viên"],
    ["[019]", "Multi-Agent\'26", "Tương đương test case sinh viên", "Trễ và tốn API token"],
    ["[024]", "AgoneTest\'25", "Có đánh giá GPT-4o-mini trên Java", "Compile ban đầu còn thấp"],
    ["[026]", "MutGen\'26", "100% coverage vẫn có thể chỉ 4% MS", "Mutation feedback tốn tài nguyên"],
  ];
  s.addTable([["ID", "Paper", "Bằng chứng chính", "Hạn chế"], ...rows], {
    x: 0.65,
    y: 3.25,
    w: 10.8,
    h: 2.6,
    colW: [1.0, 1.55, 4.25, 4.0],
    rowH: [0.38, 0.55, 0.55, 0.55, 0.55, 0.55],
    border: { type: "solid", color: C.line, pt: 0.8 },
    fill: C.white,
    margin: 0.06,
    fontSize: 8.0,
    color: C.ink,
    fit: "shrink",
  });
  src(s, "Nguồn: evidence-table-merged.md; gap-statement-final.md");
}

// 4
{
  const s = pptx.addSlide();
  bg(s, "CÂU HỎI NGHIÊN CỨU", "04");
  addTitle(s, "Bốn Câu Hỏi Nghiên Cứu (Research Questions)", "Đánh giá theo ngưỡng, paired comparison và độ tin cậy kép");
  const rq = [
    ["RQ1", "Branch Coverage", "Trung vị BC-AI >= 30.22%", "One-sample Wilcoxon"],
    ["RQ2", "Mutation Score", "Trung vị MS-AI >= 4.0% sàn và >= 40.21% mục tiêu", "One-sample Wilcoxon"],
    ["RQ3", "AI vs Student", "So sánh paired BC/MS trên cùng hàm", "Paired Wilcoxon, two-tailed"],
    ["RQ4", "Độ tin cậy kép", "BC >= 30.22% và MS >= 4.0% cho >50% số hàm", "Exact Binomial Test"],
  ];
  rq.forEach((r, i) => {
    const x = 0.75 + (i % 2) * 6.0;
    const y = 1.85 + Math.floor(i / 2) * 2.12;
    card(s, x, y, 5.4, 1.55, i === 1 ? C.amberPale : i === 2 ? C.bluePale : C.white);
    s.addText(r[0], { x: x + 0.18, y: y + 0.26, w: 0.58, h: 0.28, fontSize: 13, bold: true, color: C.tealDark, margin: 0 });
    s.addText(r[1], { x: x + 1.03, y: y + 0.23, w: 2.3, h: 0.2, fontSize: 12.3, bold: true, color: C.navy, margin: 0 });
    s.addText(r[2], { x: x + 1.03, y: y + 0.58, w: 3.95, h: 0.24, fontSize: 9.3, color: C.ink, margin: 0, fit: "shrink" });
    s.addText(r[3], { x: x + 1.03, y: y + 1.03, w: 2.9, h: 0.16, fontSize: 7.8, bold: true, color: C.tealDark, margin: 0, fit: "shrink" });
  });
  s.addText("Đóng góp chính: cùng 50 hàm được đo hai lần - test do GPT-4o-mini sinh và Student Benchmark test - bằng cùng pipeline JaCoCo/PIT.", { x: 0.85, y: 6.25, w: 10.8, h: 0.28, fontSize: 10.2, bold: true, color: C.navy, align: "center", margin: 0, fit: "shrink" });
  src(s, "Nguồn: rq-final.md; hypotheses-draft.md");
}

// 5
{
  const s = pptx.addSlide();
  bg(s, "QUY TRÌNH THỰC NGHIỆM", "05");
  addTitle(s, "Pipeline Thực Nghiệm", "Sáu bước tự động từ lọc dataset đến kiểm định thống kê");
  const steps = [
    ["1", "Lọc Dataset", "N=50; CC 5-16"],
    ["2", "LLM Prompting", "GPT-4o-mini; temp=0"],
    ["3", "Hậu xử lý", "Tách code JUnit 4"],
    ["4", "Compile + Repair", "Maven; sửa 1 vòng"],
    ["5", "Đo metric", "JaCoCo + PIT"],
    ["6", "Thống kê", "scipy Wilcoxon/Binomial"],
  ];
  steps.forEach((st, i) => {
    const x = 0.55 + i * 2.08;
    const y = i % 2 === 0 ? 2.35 : 3.75;
    card(s, x, y, 1.72, 0.95);
    s.addText(st[0], { x: x + 0.12, y: y + 0.18, w: 0.24, h: 0.18, fontSize: 10, bold: true, color: C.tealDark, margin: 0 });
    s.addText(st[1], { x: x + 0.48, y: y + 0.16, w: 1.05, h: 0.16, fontSize: 8.7, bold: true, color: C.navy, margin: 0, fit: "shrink" });
    s.addText(st[2], { x: x + 0.48, y: y + 0.47, w: 1.0, h: 0.18, fontSize: 7.2, color: C.muted, margin: 0, fit: "shrink" });
  });
  s.addShape(pptx.ShapeType.rect, { x: 0.85, y: 5.78, w: 11.55, h: 0.55, fill: { color: C.navy }, line: { color: C.navy } });
  s.addText("Quy tắc lỗi: test vẫn fail sau 1 vòng repair sẽ nhận 0% coverage và 0% mutation score, nhưng vẫn báo riêng compile status.", { x: 1.05, y: 5.96, w: 11.15, h: 0.15, fontSize: 9.5, bold: true, color: C.white, margin: 0, fit: "shrink" });
  src(s, "Nguồn: proposal.md; setup_experiment.py; generate_gpt_tests.py");
}

// 6
{
  const s = pptx.addSlide();
  bg(s, "DATASET & BASELINE", "06");
  addTitle(s, "Dataset HumanEval-Java & Student Baseline", "Thiết kế paired comparison có kiểm soát trên cùng các hàm Java");
  metric(s, 0.75, 1.88, 2.3, "BENCHMARK GỐC", "163", "hàm Java", C.navy);
  metric(s, 3.35, 1.88, 2.3, "MẪU CHỌN", "50", "CC từ 5 đến 16", C.tealDark);
  metric(s, 5.95, 1.88, 2.3, "SO SÁNH", "2x", "AI test vs Student test", C.orange);
  card(s, 0.75, 3.78, 5.4, 1.8, C.bluePale);
  s.addText("Vì sao chọn mẫu này?", { x: 1.0, y: 4.0, w: 2.8, h: 0.22, fontSize: 13, bold: true, color: C.navy, margin: 0 });
  bullet(s, ["Các hàm thuật toán, chuỗi và toán học khá độc lập.", "CC 5-16 tránh hàm quá dễ nhưng vẫn đủ khả thi.", "Repo local đã có correct Java code và benchmark tests."], 1.0, 4.38, 4.7, 0.88, 9.2);
  card(s, 6.6, 3.78, 5.6, 1.8, C.pale);
  s.addText("Thiết kế paired baseline", { x: 6.85, y: 4.0, w: 3.2, h: 0.22, fontSize: 13, bold: true, color: C.navy, margin: 0 });
  bullet(s, ["Student Benchmark tests được đo trên đúng cùng target functions.", "Cả hai test suite dùng chung Maven, JaCoCo và PIT pipeline.", "RQ3 dùng chênh lệch paired, không chỉ so sánh trung bình tổng."], 6.85, 4.38, 4.85, 0.88, 9.2);
  src(s, "Nguồn: human-eval-java; proposal.md");
}

// 7
{
  const s = pptx.addSlide();
  bg(s, "CẤU HÌNH", "07");
  addTitle(s, "Cấu Hình LLM & Đo Lường", "Sinh test có tính tái lập, công cụ cố định, ground truth tự động");
  const panels = [
    ["Sinh test bằng LLM", 0.75, [["Model", "gpt-4o-mini-2024-07-18"], ["Temperature", "0"], ["top_p", "1"], ["max_tokens", "2000"], ["Prompting", "Zero-shot prompt có cấu trúc cho JUnit 4"]]],
    ["Đo lường", 6.75, [["Branch Coverage", "JaCoCo v0.8.7+"], ["Mutation Score", "PIT / PiTest v1.7.4+"], ["Mutators", "DEFAULTS"], ["Ground Truth", "mã Java trong humaneval.correct"], ["IAA", "Không áp dụng: đo bằng metric tự động"]]],
  ];
  panels.forEach(([head, x, rows]) => {
    card(s, x, 1.9, 5.55, 3.9);
    s.addText(head, { x: x + 0.25, y: 2.15, w: 3.2, h: 0.28, fontSize: 14, bold: true, color: C.navy, margin: 0 });
    rows.forEach((r, i) => {
      const yy = 2.7 + i * 0.52;
      s.addText(r[0].toUpperCase(), { x: x + 0.28, y: yy, w: 1.45, h: 0.18, fontSize: 7.3, bold: true, color: C.tealDark, margin: 0, fit: "shrink" });
      s.addText(r[1], { x: x + 1.65, y: yy - 0.02, w: 3.5, h: 0.18, fontSize: 9.2, color: C.ink, margin: 0, fit: "shrink" });
      s.addShape(pptx.ShapeType.line, { x: x + 0.28, y: yy + 0.29, w: 4.9, h: 0, line: { color: "DDE8EF", width: 0.6 } });
    });
  });
  s.addText("Điểm neo tái lập: cố định model version, prompt template, temperature, raw outputs, compile logs và metric CSV có timestamp.", { x: 0.95, y: 6.25, w: 11.3, h: 0.22, fontSize: 9.8, bold: true, color: C.navy, align: "center", margin: 0, fit: "shrink" });
  src(s, "Nguồn: proposal.md; test_api.py");
}

// 8
{
  const s = pptx.addSlide();
  bg(s, "KẾ HOẠCH ĐÁNH GIÁ", "08");
  addTitle(s, "Cách Diễn Giải Kết Quả", "Chỉ reject H0 khi p-value đạt và metric đi đúng hướng mong đợi");
    const rows = [
    ["[005]", "Al-Tse\'23", "TestPilot: 52.8% Branch Coverage", "Không đo Mutation Score"],
    ["[010]", "Huang\'26", "ULT: 30.22% BC, 40.21% MS", "Chưa có paired baseline với sinh viên"],
    ["[019]", "Multi-Agent\'26", "Tương đương test case sinh viên", "Trễ và tốn API token"],
    ["[024]", "AgoneTest\'25", "Có đánh giá GPT-4o-mini trên Java", "Compile ban đầu còn thấp"],
    ["[026]", "MutGen\'26", "100% coverage vẫn có thể chỉ 4% MS", "Mutation feedback tốn tài nguyên"],
  ];
  s.addTable([["RQ", "Tiêu chí", "Reject H0 khi..."], ...rows], {
    x: 0.75,
    y: 1.82,
    w: 5.7,
    h: 3.75,
    colW: [0.75, 1.75, 3.2],
    rowH: [0.38, 0.52, 0.52, 0.52, 0.52, 0.52],
    border: { type: "solid", color: C.line, pt: 0.8 },
    fill: C.white,
    margin: 0.06,
    fontSize: 8,
    color: C.ink,
    fit: "shrink",
  });
  const cases = [
    ["Double Positive", "BC và MS đạt", "AI tests mạnh cả về cấu trúc và logic.", C.green, C.white],
    ["Mixed", "BC đạt, MS fail", "Coverage Blindness: code được chạy nhưng không bắt lỗi tốt.", C.orange, C.amberPale],
    ["Double Negative", "BC và MS fail", "Zero-shot GPT-4o-mini cần prompt hoặc feedback mạnh hơn.", C.red, C.white],
  ];
  cases.forEach((c, i) => {
    const y = 2.0 + i * 1.16;
    card(s, 7.05, y, 5.25, 0.86, c[4]);
    s.addShape(pptx.ShapeType.rect, { x: 7.05, y, w: 0.12, h: 0.86, fill: { color: c[3] }, line: { color: c[3] } });
    s.addText(c[0], { x: 7.35, y: y + 0.13, w: 1.9, h: 0.16, fontSize: 10.3, bold: true, color: C.navy, margin: 0 });
    s.addText(c[1], { x: 9.4, y: y + 0.13, w: 2.2, h: 0.16, fontSize: 8.5, bold: true, color: c[3], margin: 0, fit: "shrink" });
    s.addText(c[2], { x: 7.35, y: y + 0.48, w: 4.55, h: 0.14, fontSize: 7.8, color: C.ink, margin: 0, fit: "shrink" });
  });
  src(s, "Nguồn: proposal.md; rq-final.md");
}

// 9
{
  const s = pptx.addSlide();
  bg(s, "ĐỘ TIN CẬY NGHIÊN CỨU", "09");
  addTitle(s, "Rủi Ro Về Độ Tin Cậy & Cách Giảm Thiểu", "Các Threats to Validity chính được nêu rõ và có cách xử lý");
  const threats = [
    ["Internal", "Model drift", "Cố định API model version và temperature = 0."],
    ["External", "Phạm vi dataset", "Giới hạn kết luận ở standalone Java unit-level functions."],
    ["Construct", "Metric chưa đủ rộng", "Báo cáo compile/pass status cùng với BC và MS."],
    ["Conclusion", "N nhỏ / lỗi compile", "Dùng N=50 và 1-round self-repair; báo cáo mẫu bị loại."],
  ];
  threats.forEach((t, i) => {
    const x = 0.78 + (i % 2) * 6.0;
    const y = 1.9 + Math.floor(i / 2) * 1.85;
    card(s, x, y, 5.45, 1.35);
    chip(s, t[0], x + 0.2, y + 0.2, 1.08, i < 2 ? C.tealDark : C.orange);
    s.addText(t[1], { x: x + 1.55, y: y + 0.2, w: 2.8, h: 0.18, fontSize: 12, bold: true, color: C.navy, margin: 0, fit: "shrink" });
    s.addText(t[2], { x: x + 1.55, y: y + 0.62, w: 3.55, h: 0.26, fontSize: 9, color: C.ink, margin: 0, fit: "shrink" });
  });
  s.addText("Ý chính: kể cả kết quả âm tính vẫn có giá trị, vì GAP paired student-baseline hiện vẫn chưa được giải quyết.", { x: 1.0, y: 6.02, w: 11.0, h: 0.25, fontSize: 10.2, bold: true, color: C.navy, align: "center", margin: 0, fit: "shrink" });
  src(s, "Nguồn: proposal.md; gap-statement-final.md");
}

// 10
{
  const s = pptx.addSlide();
  bg(s, "KẾ HOẠCH", "10");
  addTitle(s, "Timeline, Vai Trò & Chi Phí", "Kế hoạch thực hiện gọn trong tuần 5-10");
  const roles = [
    ["PL", "Khang", "Tiến độ, review, blockers"],
    ["DG", "Phước", "Dataset và baseline"],
    ["LR", "An Khang", "API runner và logs"],
    ["MS", "Như Ý", "JaCoCo/PIT và thống kê"],
    ["RW", "Vỹ", "Related work và báo cáo"],
  ];
  roles.forEach((r, i) => {
    const x = 0.75 + i * 2.45;
    card(s, x, 1.8, 2.0, 1.15, i % 2 ? C.pale : C.white);
    s.addText(r[0], { x: x + 0.15, y: 1.98, w: 0.55, h: 0.22, fontSize: 15, bold: true, color: C.tealDark, margin: 0 });
    s.addText(r[1], { x: x + 0.72, y: 2.0, w: 1.0, h: 0.18, fontSize: 9.8, bold: true, color: C.navy, margin: 0, fit: "shrink" });
    s.addText(r[2], { x: x + 0.15, y: 2.38, w: 1.65, h: 0.22, fontSize: 7.6, color: C.muted, margin: 0, fit: "shrink" });
  });
  const weeks = [
    ["W5", "Proposal + dataset + test API"],
    ["W6", "Nộp proposal + bảo vệ gate"],
    ["W7", "Pilot run 10% mẫu"],
    ["W8", "Full experiment + metrics"],
    ["W9-10", "Báo cáo cuối + presentation"],
  ];
  weeks.forEach((w, i) => {
    const x = 0.85 + i * 2.45;
    s.addShape(pptx.ShapeType.roundRect, { x, y: 4.25, w: 2.05, h: 0.74, rectRadius: 0.05, fill: { color: i === 1 ? C.orange : C.teal }, line: { color: i === 1 ? C.orange : C.teal } });
    s.addText(w[0], { x: x + 0.18, y: 4.37, w: 0.62, h: 0.16, fontSize: 10.3, bold: true, color: C.white, margin: 0 });
    s.addText(w[1], { x: x + 0.18, y: 4.66, w: 1.55, h: 0.13, fontSize: 6.8, color: C.white, margin: 0, fit: "shrink" });
  });
  metric(s, 0.85, 5.72, 2.5, "CHI PHÍ API", "~$1.33", "khoảng 33,000 VND", C.orange);
  s.addText("Chi phí ước tính gồm token input/output của gpt-4o-mini và phần dự phòng cho pilot + one-round repair.", { x: 3.65, y: 6.05, w: 7.8, h: 0.18, fontSize: 8.8, color: C.muted, margin: 0, fit: "shrink" });
  src(s, "Nguồn: proposal.md");
}

// 11
{
  const s = pptx.addSlide();
  bg(s, "Q&A", "11");
  s.addText("Q&A", { x: 0.75, y: 1.0, w: 2.3, h: 0.8, fontFace: "Aptos Display", fontSize: 44, bold: true, color: C.navy, margin: 0 });
  s.addText("Câu hỏi phản biện dự kiến", { x: 0.82, y: 2.2, w: 3.8, h: 0.25, fontSize: 13, bold: true, color: C.tealDark, margin: 0 });
  card(s, 0.82, 2.62, 5.55, 1.45, C.amberPale);
  s.addText("\"Vì sao nhóm chọn các ngưỡng 30.22% và 4.0%?\"", { x: 1.1, y: 3.07, w: 5.0, h: 0.28, fontSize: 14, bold: true, color: C.navy, align: "center", margin: 0, fit: "shrink" });
  card(s, 6.85, 1.38, 5.55, 4.55);
  s.addText("Trả lời ngắn", { x: 7.15, y: 1.7, w: 1.8, h: 0.22, fontSize: 13, bold: true, color: C.navy, margin: 0 });
  bullet(s, [
    "30.22% là average Branch Coverage trên benchmark ULT trong [010].",
    "4.0% là mutation-score floor cảnh báo từ [026]: coverage cao vẫn có thể bắt lỗi logic rất yếu.",
    "40.21% là target Mutation Score từ [010], dùng làm ngưỡng tham chiếu mạnh hơn.",
    "Các ngưỡng được chọn theo Case 2 trong barem RBL để bảo đảm cơ sở thực nghiệm.",
  ], 7.15, 2.22, 4.78, 2.3, 10);
  s.addText("Backup: bảng Related Work đầy đủ trong evidence-table-merged.md", { x: 7.15, y: 5.35, w: 4.6, h: 0.18, fontSize: 8.4, bold: true, color: C.tealDark, margin: 0, fit: "shrink" });
  src(s, "Nguồn: slide_outline.md; evidence-table-merged.md");
}

const outDir = path.join(__dirname, "..", "outputs", "presentations");
fs.mkdirSync(outDir, { recursive: true });
pptx.writeFile({ fileName: path.join(outDir, "SE1944_research_proposal_defense.pptx") });
