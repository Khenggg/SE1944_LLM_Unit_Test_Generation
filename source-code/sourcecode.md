# Danh sách các hàm Java thực nghiệm (Java Functions for Experiment)

Tài liệu này chứa danh sách các hàm Java được tuyển chọn từ các thuật toán kinh điển và các thư viện tiện ích chuẩn trên mạng (đảm bảo không phải do AI tự bịa ra). Các hàm được thiết kế đơn giản, độc lập và được kiểm soát chặt chẽ trong khoảng độ phức tạp Cyclomatic Complexity (CC) từ 5 đến 15.

---

## 1. Hàm `isValidIPv4` (Kiểm tra định dạng địa chỉ IPv4)
*   **Mục đích**: Xác thực xem một chuỗi đầu vào có phải là địa chỉ IPv4 hợp lệ hay không (gồm 4 nhóm số từ 0-255 cách nhau bởi dấu chấm).
*   **Mã nguồn Java**:
```java
public static boolean isValidIPv4(String ip) {
    if (ip == null || ip.isEmpty()) {
        return false;
    }
    String[] parts = ip.split("\\.");
    if (parts.length != 4) {
        return false;
    }
    for (String part : parts) {
        try {
            if (part.length() > 3 || part.isEmpty()) {
                return false;
            }
            int val = Integer.parseInt(part);
            if (val < 0 || val > 255) {
                return false;
            }
            if (part.length() > 1 && part.startsWith("0")) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }
    return true;
}
```
*   **Phân tích độ phức tạp Cyclomatic (CC = 12)**:
    *   Hệ số cơ bản: $+1$
    *   `ip == null` (nhánh `if`): $+1$
    *   `|| ip.isEmpty()` (toán tử logic): $+1$
    *   `parts.length != 4` (nhánh `if`): $+1$
    *   `for (String part : parts)` (vòng lặp): $+1$
    *   `part.length() > 3` (nhánh `if`): $+1$
    *   `|| part.isEmpty()` (toán tử logic): $+1$
    *   `val < 0` (nhánh `if`): $+1$
    *   `|| val > 255` (toán tử logic): $+1$
    *   `part.length() > 1` (nhánh `if`): $+1$
    *   `&& part.startsWith("0")` (toán tử logic): $+1$
    *   `catch (NumberFormatException e)` (nhánh ngoại lệ): $+1$
    *   **Tổng cộng**: $1 + 11 = 12$ CC.

---

## 2. Hàm `binarySearch` (Thuật toán Tìm kiếm nhị phân)
*   **Mục đích**: Tìm kiếm vị trí của một số nguyên trong mảng đã được sắp xếp bằng giải thuật tìm kiếm nhị phân với các giới hạn chỉ mục trái/phải.
*   **Mã nguồn Java**:
```java
public static int binarySearch(int[] arr, int target, int left, int right) {
    if (arr == null || left > right) {
        return -1;
    }
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1;
}
```
*   **Phân tích độ phức tạp Cyclomatic (CC = 6)**:
    *   Hệ số cơ bản: $+1$
    *   `arr == null` (nhánh `if`): $+1$
    *   `|| left > right` (toán tử logic): $+1$
    *   `while (left <= right)` (vòng lặp): $+1$
    *   `arr[mid] == target` (nhánh `if`): $+1$
    *   `arr[mid] < target` (nhánh `if`): $+1$
    *   **Tổng cộng**: $1 + 5 = 6$ CC.

---

## 3. Hàm `isNumeric` (Kiểm tra định dạng chuỗi số thực)
*   **Mục đích**: Xác định xem một chuỗi ký tự nhập vào có phải là một số thực hợp lệ hay không (cho phép dấu âm/dương và dấu chấm thập phân duy nhất).
*   **Mã nguồn Java**:
```java
public static boolean isNumeric(String str) {
    if (str == null || str.isEmpty()) {
        return false;
    }
    boolean hasDecimal = false;
    int start = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0;
    if (start == 1 && str.length() == 1) {
        return false;
    }
    for (int i = start; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c == '.') {
            if (hasDecimal) {
                return false;
            }
            hasDecimal = true;
        } else if (c < '0' || c > '9') {
            return false;
        }
    }
    return true;
}
```
*   **Phân tích độ phức tạp Cyclomatic (CC = 12)**:
    *   Hệ số cơ bản: $+1$
    *   `str == null` (nhánh `if`): $+1$
    *   `|| str.isEmpty()` (toán tử logic): $+1$
    *   `str.charAt(0) == '-'` (toán tử ba ngôi): $+1$
    *   `|| str.charAt(0) == '+'` (toán tử logic): $+1$
    *   `start == 1` (nhánh `if`): $+1$
    *   `&& str.length() == 1` (toán tử logic): $+1$
    *   `for (int i = start; ...)` (vòng lặp): $+1$
    *   `c == '.'` (nhánh `if`): $+1$
    *   `hasDecimal` (nhánh `if` lồng): $+1$
    *   `c < '0'` (nhánh `else if`): $+1$
    *   `|| c > '9'` (toán tử logic): $+1$
    *   **Tổng cộng**: $1 + 11 = 12$ CC.

---

## 4. Hàm `isValidSudokuGroup` (Kiểm tra tính hợp lệ nhóm số Sudoku)
*   **Mục đích**: Kiểm tra xem một tập hợp 9 ô số trong game Sudoku (một hàng hoặc một cột) có chứa các số từ 1-9 hợp lệ mà không bị lặp lại hay không (bỏ qua ô trống mang giá trị 0).
*   **Mã nguồn Java**:
```java
public static boolean isValidSudokuGroup(int[] group) {
    if (group == null || group.length != 9) {
        return false;
    }
    boolean[] seen = new boolean[10];
    for (int num : group) {
        if (num < 0 || num > 9) {
            return false;
        }
        if (num != 0) {
            if (seen[num]) {
                return false;
            }
            seen[num] = true;
        }
    }
    return true;
}
```
*   **Phân tích độ phức tạp Cyclomatic (CC = 8)**:
    *   Hệ số cơ bản: $+1$
    *   `group == null` (nhánh `if`): $+1$
    *   `|| group.length != 9` (toán tử logic): $+1$
    *   `for (int num : group)` (vòng lặp): $+1$
    *   `num < 0` (nhánh `if`): $+1$
    *   `|| num > 9` (toán tử logic): $+1$
    *   `num != 0` (nhánh `if`): $+1$
    *   `seen[num]` (nhánh `if` lồng): $+1$
    *   **Tổng cộng**: $1 + 7 = 8$ CC.

---

## 5. Hàm `getDaysInMonth` (Tính số ngày trong tháng của một năm)
*   **Mục đích**: Nhận vào tháng và năm, trả về số ngày thực tế của tháng đó (có chứa giải thuật tính năm nhuận dương lịch cho tháng 2).
*   **Mã nguồn Java**:
```java
public static int getDaysInMonth(int month, int year) {
    if (month < 1 || month > 12) {
        return -1;
    }
    if (month == 4 || month == 6 || month == 9 || month == 11) {
        return 30;
    }
    if (month == 2) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return isLeap ? 29 : 28;
    }
    return 31;
}
```
*   **Phân tích độ phức tạp Cyclomatic (CC = 12)**:
    *   Hệ số cơ bản: $+1$
    *   `month < 1` (nhánh `if`): $+1$
    *   `|| month > 12` (toán tử logic): $+1$
    *   `month == 4` (nhánh `if`): $+1$
    *   `|| month == 6` (toán tử logic): $+1$
    *   `|| month == 9` (toán tử logic): $+1$
    *   `|| month == 11` (toán tử logic): $+1$
    *   `month == 2` (nhánh `if`): $+1$
    *   `year % 4 == 0` (toán tử logic): $+1$
    *   `&& year % 100 != 0` (toán tử logic): $+1$
    *   `|| year % 400 == 0` (toán tử logic): $+1$
    *   Toán tử ba ngôi `isLeap ? 29 : 28`: $+1$
    *   **Tổng cộng**: $1 + 11 = 12$ CC.

---

## 6. Hàm `findSecondLargest` (Tìm số lớn thứ hai trong mảng)
*   **Mục đích**: Nhận vào một mảng số nguyên và tìm phần tử có giá trị lớn thứ hai (loại trừ các giá trị trùng lặp với phần tử lớn nhất).
*   **Mã nguồn Java**:
```java
public static int findSecondLargest(int[] arr) {
    if (arr == null || arr.length < 2) {
        return Integer.MIN_VALUE;
    }
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    for (int num : arr) {
        if (num > first) {
            second = first;
            first = num;
        } else if (num > second && num != first) {
            second = num;
        }
    }
    return second;
}
```
*   **Phân tích độ phức tạp Cyclomatic (CC = 7)**:
    *   Hệ số cơ bản: $+1$
    *   `arr == null` (nhánh `if`): $+1$
    *   `|| arr.length < 2` (toán tử logic): $+1$
    *   `for (int num : arr)` (vòng lặp): $+1$
    *   `num > first` (nhánh `if`): $+1$
    *   `num > second` (nhánh `else if`): $+1$
    *   `&& num != first` (toán tử logic): $+1$
    *   **Tổng cộng**: $1 + 6 = 7$ CC.

---

## 7. Hàm `runLengthEncode` (Mã hóa chuỗi theo độ dài lặp)
*   **Mục đích**: Thực hiện giải thuật nén cơ bản Run-Length Encoding trên một chuỗi đầu vào (ví dụ: chuỗi "aaabb" mã hóa thành "a3b2").
*   **Mã nguồn Java**:
```java
public static String runLengthEncode(String str) {
    if (str == null || str.isEmpty()) {
        return "";
    }
    StringBuilder encoded = new StringBuilder();
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == str.charAt(i - 1)) {
            count++;
        } else {
            encoded.append(str.charAt(i - 1)).append(count);
            count = 1;
        }
    }
    encoded.append(str.charAt(str.length() - 1)).append(count);
    return encoded.toString();
}
```
*   **Phân tích độ phức tạp Cyclomatic (CC = 5)**:
    *   Hệ số cơ bản: $+1$
    *   `str == null` (nhánh `if`): $+1$
    *   `|| str.isEmpty()` (toán tử logic): $+1$
    *   `for (int i = 1; ...)` (vòng lặp): $+1$
    *   `str.charAt(i) == str.charAt(i - 1)` (nhánh `if`): $+1$
    *   **Tổng cộng**: $1 + 4 = 5$ CC.

---

## 8. Hàm `bubbleSort` (Thuật toán Sắp xếp nổi bọt tối ưu)
*   **Mục đích**: Sắp xếp mảng số nguyên tăng dần bằng thuật toán bubble sort có sử dụng cờ hiệu tối ưu `swapped` để dừng sớm nếu mảng đã có thứ tự.
*   **Mã nguồn Java**:
```java
public static void bubbleSort(int[] arr) {
    if (arr == null || arr.length <= 1) {
        return;
    }
    int n = arr.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }
}
```
*   **Phân tích độ phức tạp Cyclomatic (CC = 7)**:
    *   Hệ số cơ bản: $+1$
    *   `arr == null` (nhánh `if`): $+1$
    *   `|| arr.length <= 1` (toán tử logic): $+1$
    *   `for (int i = 0; ...)` (vòng lặp ngoài): $+1$
    *   `for (int j = 0; ...)` (vòng lặp trong): $+1$
    *   `arr[j] > arr[j + 1]` (nhánh `if`): $+1$
    *   `!swapped` (nhánh `if` kiểm tra cờ): $+1$
    *   **Tổng cộng**: $1 + 6 = 7$ CC.

---

## 9. Hàm `parseBooleanCustom` (Chuyển đổi Boolean nâng cao)
*   **Mục đích**: Ánh xạ một chuỗi ký tự thành giá trị logic Boolean, hỗ trợ phong phú các từ khoá khác nhau như "true", "yes", "1" (trả về true); "false", "no", "0" (trả về false).
*   **Mã nguồn Java**:
```java
public static Boolean parseBooleanCustom(String val) {
    if (val == null || val.trim().isEmpty()) {
        return null;
    }
    String cleanVal = val.trim().toLowerCase();
    if (cleanVal.equals("true") || cleanVal.equals("yes") || cleanVal.equals("1")) {
        return true;
    }
    if (cleanVal.equals("false") || cleanVal.equals("no") || cleanVal.equals("0")) {
        return false;
    }
    return null;
}
```
*   **Phân tích độ phức tạp Cyclomatic (CC = 9)**:
    *   Hệ số cơ bản: $+1$
    *   `val == null` (nhánh `if`): $+1$
    *   `|| val.trim().isEmpty()` (toán tử logic): $+1$
    *   `cleanVal.equals("true")` (nhánh `if`): $+1$
    *   `|| cleanVal.equals("yes")` (toán tử logic): $+1$
    *   `|| cleanVal.equals("1")` (toán tử logic): $+1$
    *   `cleanVal.equals("false")` (nhánh `if`): $+1$
    *   `|| cleanVal.equals("no")` (toán tử logic): $+1$
    *   `|| cleanVal.equals("0")` (toán tử logic): $+1$
    *   **Tổng cộng**: $1 + 8 = 9$ CC.

---

## 10. Hàm `validatePassword` (Đánh giá độ bảo mật mật khẩu cơ bản)
*   **Mục đích**: Xác định xem mật khẩu nhập vào có hợp lệ dựa trên độ dài (8-20 ký tự) và phải có ít nhất 1 chữ hoa, 1 chữ thường và 1 chữ số.
*   **Mã nguồn Java**:
```java
public static boolean validatePassword(String password) {
    if (password == null || password.length() < 8 || password.length() > 20) {
        return false;
    }
    boolean hasUpper = false;
    boolean hasLower = false;
    boolean hasDigit = false;
    for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);
        if (Character.isUpperCase(c)) {
            hasUpper = true;
        } else if (Character.isLowerCase(c)) {
            hasLower = true;
        } else if (Character.isDigit(c)) {
            hasDigit = true;
        }
    }
    return hasUpper && hasLower && hasDigit;
}
```
*   **Phân tích độ phức tạp Cyclomatic (CC = 10)**:
    *   Hệ số cơ bản: $+1$
    *   `password == null` (nhánh `if`): $+1$
    *   `|| password.length() < 8` (toán tử logic): $+1$
    *   `|| password.length() > 20` (toán tử logic): $+1$
    *   `for (int i = 0; ...)` (vòng lặp): $+1$
    *   `Character.isUpperCase(c)` (nhánh `if`): $+1$
    *   `Character.isLowerCase(c)` (nhánh `else if`): $+1$
    *   `Character.isDigit(c)` (nhánh `else if` lồng tiếp): $+1$
    *   `hasUpper && ...` (toán tử logic kiểm tra đầu ra): $+1$
    *   `&& hasLower ...` (toán tử logic kiểm tra đầu ra): $+1$
    *   **Tổng cộng**: $1 + 9 = 10$ CC.
