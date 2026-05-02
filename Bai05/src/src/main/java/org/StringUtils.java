package org;

// StringUtils: lớp tiện ích để minh hoạ JaCoCo coverage
// Cần test gần hết các nhánh (if/else, while) mới qua được ngưỡng 80%
public class StringUtils {

    // Kiểm tra chuỗi có phải palindrome (đối xứng) hay không
    // Ví dụ: "Madam" -> true, "hello" -> false, null -> false
    public boolean isPalindrome(String s) {
        if (s == null) return false;            // nhánh null
        String t = s.toLowerCase();              // chuẩn hoá về chữ thường
        int i = 0, j = t.length() - 1;
        while (i < j) {                          // so sánh từ 2 đầu vào giữa
            if (t.charAt(i) != t.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // Đảo ngược chuỗi - dùng StringBuilder để tránh tạo nhiều String trung gian
    public String reverse(String s) {
        if (s == null) return "";                // null -> chuỗi rỗng
        return new StringBuilder(s).reverse().toString();
    }
}
