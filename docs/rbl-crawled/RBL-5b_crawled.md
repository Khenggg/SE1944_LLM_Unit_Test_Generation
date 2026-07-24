# Crawled Document Content

## Page 1

# RBL-5b: Kiểm Tra AI Writing — Dấu Hiệu Cần Tránh

**Áp dụng:** Trước khi nộp báo cáo cuối (Tuần 10)
**Mục đích:** Tránh các dấu hiệu AI viết thường bị phát hiện bởi reviewer và công cụ detect

> **Lưu ý:** Dùng AI để hỗ trợ viết là chấp nhận được, nhưng nộp văn bản AI viết nguyên văn là vi phạm. Hướng dẫn này giúp bạn kiểm tra và viết lại cho đúng giọng văn nghiên cứu.

## ⚠️ Phân biệt 2 loại kiểm tra — PHẢI làm CẢ HAI

| | AI Writing Check | Plagiarism Check |
| :--- | :--- | :--- |
| **Kiểm tra gì** | Văn bản có phải AI tạo ra không | Văn bản có sao chép từ nguồn khác không |
| **Công cụ** | SciSpace, ZeroGPT, GPTZero | Turnitin, iThenticate, Copyleaks |
| **Vấn đề khi vi phạm** | Nộp văn bản AI viết nguyên văn | Copy-paste từ paper mà không cite đúng cách |

> **Lưu ý về plagiarism:** Trích dẫn từ paper phải dùng `\cite{}` **VÀ** phải diễn giải lại bằng lời của mình (paraphrase). Copy nguyên câu dù có `\cite{}` vẫn là đạo văn — phải dùng dấu ngoặc kép `"..."` và ghi rõ là quotation.

## 🛠️ Phần 1 — Công cụ kiểm tra AI

Chạy báo cáo qua **ít nhất 2 công cụ** sau:

---

## Page 2

| Công cụ | Địa chỉ | Đặc điểm | Lưu ý |
| :--- | :--- | :--- | :--- |
| **SciSpace** | [typeset.io/ai-detector](https://typeset.io/ai-detector) | Chuyên cho academic text | Free, tốt cho SE paper |
| **ZeroGPT** | [zerogpt.com](https://zerogpt.com) | Phát hiện từng đoạn | Free, show % per paragraph |
| **Copyleaks** | [copyleaks.com/ai-content-detector](https://copyleaks.com/ai-content-detector) | Kết quả chi tiết per sentence | Có free tier |
| **GPTZero** | [gptzero.me](https://gptzero.me) | Phổ biến nhất | Free tier giới hạn |

### Cách dùng:
1. Copy từng section (không paste cả paper cùng lúc — kết quả kém chính xác hơn)
2. Chạy qua $\ge 2$ công cụ — nếu cả 2 đều cảnh báo 1 đoạn, đoạn đó cần viết lại
3. Ghi kết quả vào `paper/quality/ai_check_log.md` (% AI per section + ngày check)

### Đọc kết quả % AI:

| % AI (trung bình 2 công cụ) | Đánh giá | Hành động |
| :--- | :---: | :--- |
| < 20% |  Tốt | Kiểm tra thêm văn phong (Phần 2) |
| 20–50% | ⚠️ Cần xem lại | Đọc kỹ đoạn được highlight, viết lại những đoạn máy móc |
| > 50% trong bất kỳ section | ❌ Không chấp nhận được | Viết lại toàn bộ section từ đầu |

> Không có ngưỡng % tuyệt đối — công cụ detect AI không hoàn hảo. Quan trọng hơn là kiểm tra dấu hiệu văn phong ở Phần 2.

---

## Page 3

## 🚨 Phần 2 — Dấu hiệu AI viết cần tránh

### 2A. Dấu hiệu về văn phong

| Dấu hiệu | Ví dụ AI viết | Viết lại thế nào |
| :--- | :--- | :--- |
| **Mở đầu sáo rỗng** | "In the rapidly evolving landscape of artificial intelligence..." | Bắt đầu bằng vấn đề cụ thể: "Unit testing accounts for 30–50% of development time..." |
| **Tính từ thổi phồng** | "groundbreaking", "revolutionary", "unprecedented", "remarkable" | Dùng số liệu: "increases F1 by 12pp" thay vì "remarkable improvement" |
| **Liệt kê kiểu AI** | "Firstly... Secondly... Thirdly..." hoặc "(1)... (2)... (3)..." | Viết đoạn liền mạch, không liệt kê máy móc |
| **Kết luận chung chung** | "In conclusion, this paper has demonstrated..." | Nêu finding cụ thể: "GPT-4o mini achieves 0.82 BLEU, comparable to EvoSuite (p=0.31)" |
| **Hedging quá mức** | "It is worth noting that", "It should be mentioned that", "It is important to highlight" | Viết thẳng: "Notably, our results differ from..." |
| **Symmetry phải rõ ràng** | "While A has advantages, it also has disadvantages" (không cụ thể) | Nêu cụ thể advantage/disadvantage là gì |

### 2B. Dấu hiệu về cấu trúc câu

| Dấu hiệu | Ví dụ | Sửa |
| :--- | :--- | :--- |
| **Câu bị động thụ động nhiều** | "It was found that... It was observed that... It was noted that..." | Dùng active: "Our results show...", "We observe..." |
| **Câu quá dài và quá trau chuốt** | "The aforementioned methodology, which was carefully designed to ensure reproducibility while simultaneously addressing the limitations of prior work, demonstrates..." | Cắt thành 2 câu ngắn |

---

## Page 4

| Dấu hiệu | Ví dụ | Sửa |
| :--- | :--- | :--- |
| **Transition cứng nhắc** | "Furthermore,", "Moreover,", "Additionally," ở đầu mỗi câu | Dùng thưa hơn, thay bằng "Also," hoặc viết liền |
| **Tránh đặt số cụ thể** | "a significant portion", "a large number of" | Ghi số thật: "63% of" |

### 2C. Dấu hiệu về nội dung

| Dấu hiệu | Mô tả | Cách phát hiện |
| :--- | :--- | :--- |
| **Claim không có citation** | "Studies have shown that LLMs struggle with..." mà không cite | Grep `shown that` / `research suggests` — mỗi cái phải có `\cite{}` |
| **Số liệu không tìm được** | "Achieves 85% accuracy" mà không có Table/Figure nguồn | Mỗi số trong §4 phải trace về 1 cell trong `full_analysis.ipynb` |
| **Related work mô tả sai paper** | Tóm tắt paper không khớp với abstract thật | Cross-check từng sentence với abstract gốc |
| **Future work quá generic** | "Future work could explore more datasets and larger models" | Viết cụ thể: "Future work could evaluate GPT-4o on domain-specific datasets such as..." |

## ✅ Phần 3 — Quy trình tự check trước khi nộp

### Bước 1: Chạy AI detector
* Section §1 Introduction → ZeroGPT → ghi % + màu highlight
* Section §2 Related Work → ZeroGPT → ghi %
* Section §3 Methodology → SciSpace → ghi %
* Section §4 Results → SciSpace → ghi %
* Section §5 Discussion → ZeroGPT + SciSpace → ghi %
* Section §6–7 → ZeroGPT → ghi %

---

## Page 5

Lưu screenshot kết quả vào `paper/quality/ai_check_log.md` .

### Bước 2: Đọc lại bằng "tester test"
Đọc to từng đoạn. Hỏi: *"Câu này có phải mình đã thực sự nghĩ và viết không, hay chỉ là pattern AI?"*
Nếu đọc thấy câu nào "nghe hay nhưng không nói điều gì cụ thể" → viết lại.

### Bước 3: Kiểm tra citation density
* [ ] §1 Introduction: mỗi claim về prior work có `\cite{}`
* [ ] §2 Related Work: mỗi tên paper / số liệu có `\cite{}`
* [ ] §3 Methodology: dataset có cite, metric tool có cite
* [ ] §5 Discussion: mỗi so sánh với prior work có `\cite{}`

*Không cite:* §4 Results (số liệu của mình), §7 Conclusion (kết luận của mình).

### Bước 4: Kiểm tra số liệu
* [ ] Mỗi số trong §4 → trace về cell cụ thể trong `full_analysis.ipynb`
* [ ] Số trong Abstract khớp với §4
* [ ] Số trong §5 Discussion khớp với §4 (không thay đổi khi diễn giải)

## ✍️ Phần 4 — Cách viết lại đoạn AI

### Quy trình 4 bước:

1. **Đọc và hiểu đoạn đó muốn nói gì**
   $\rightarrow$ Tóm tắt bằng 1 câu đơn giản
2. **Bỏ hết đoạn AI, viết từ tóm tắt đó**
   $\rightarrow$ Không nhìn lại đoạn AI khi viết
3. **Thêm số liệu / paper cụ thể**
   $\rightarrow$ Mỗi claim mơ hồ $\rightarrow$ thêm con số hoặc citation
4. **Đọc lại — nghe có như bạn nói chuyện không?**
   $\rightarrow$ Nếu không $\rightarrow$ viết lại thêm 1 lần nữa

---

## Page 6

### Ví dụ thực tế:

**AI viết:**
> *"It is widely acknowledged that the quality of bug reports plays a crucial role in the software development lifecycle, as high-quality reports enable developers to efficiently identify and resolve defects, thereby enhancing overall software reliability."*

**Viết lại:**
> *"Poor-quality bug reports account for 40% of reopened issues [Chaparro 2017]. Key deficits include missing steps-to-reproduce (S2R) and expected behavior (EB), which developers report as the primary causes of delayed triage [Zimmermann 2010]."*

## 📋 Template `ai_check_log.md`

```markdown
# AI Writing Check Log

**Paper:** [Tên paper]
**Ngày check cuối:** YYYY-MM-DD

| Section | ZeroGPT % | SciSpace % | Đoạn cần viết lại | Đã sửa |
| :--- | :---: | :---: | :--- | :---: |
| §1 Introduction | [%] | [%] | [mô tả đoạn] |  / ❌ |
| §2 Related Work | [%] | [%] | | |
| §3 Methodology | [%] | [%] | | |
| §4 Results | [%] | [%] | | |
| §5 Discussion | [%] | [%] | | |
| §6 Threats | [%] | [%] | | |
| §7 Conclusion | [%] | [%] | | |

**Kết luận:** [Đã đạt / Cần sửa thêm]
```

---
© *L.T.Q.Chi — SWT301 Research-Based Learning, FPT University. Tài liệu được thiết kế riêng cho học phần SWT301. Không sao chép hoặc phân phối lại khi chưa được phép.*
