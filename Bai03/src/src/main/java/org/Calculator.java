package org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Calculator: lớp đơn giản để minh hoạ pipeline CI - build và chạy test
public class Calculator {
    // Logger SLF4J - sau này được Logback nối vào lúc runtime
    private static final Logger LOG = LoggerFactory.getLogger(Calculator.class);

    // Cộng hai số, đồng thời ghi log INFO để chứng minh logging tích hợp
    public int add(int a, int b) {
        LOG.info("add({},{})", a, b);   // parameterized logging - không cộng chuỗi thủ công
        return a + b;
    }

    // Trừ hai số - không log để tránh quá nhiều output
    public int sub(int a, int b) {
        return a - b;
    }
}
