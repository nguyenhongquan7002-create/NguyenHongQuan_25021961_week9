package org;

// Lớp tiện ích toán học, dùng để minh hoạ cấu hình dependency Maven
public class MathUtils {

    // Trả về giá trị lớn hơn giữa hai số nguyên
    public static int max(int a, int b) {
        if (a >= b) return a;   // nếu a >= b thì a là max
        return b;
    }

    // Chia a cho b, ném IllegalArgumentException khi b = 0
    public static int divide(int a, int b) {
        if (b == 0) {
            // không cho phép chia cho 0 - đây là input không hợp lệ
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }
}
