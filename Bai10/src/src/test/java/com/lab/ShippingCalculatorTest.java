package com.lab;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    private final ShippingCalculator calc = new ShippingCalculator();

    @Test
    @DisplayName("STANDARD: 5kg = 15000")
    void testStandard() {
        assertEquals(15000.0, calc.calculate(5, "STANDARD"));
    }

    @Test
    @DisplayName("EXPRESS: 5kg = 5*5000+20000 = 45000")
    void testExpress() {
        assertEquals(45000.0, calc.calculate(5, "EXPRESS"));
    }

    @Test
    @DisplayName("Trọng lượng âm ném IllegalArgumentException")
    void testInvalidWeight() {
        assertThrows(IllegalArgumentException.class,
            () -> calc.calculate(-1, "STANDARD"));
    }

    // Loi 4 tu nghi: ban dau test sai expectation -> sua lai cho dung
    @Test
    @DisplayName("Loại không tồn tại -> IllegalArgumentException")
    void testUnknownTypeThrows() {
        assertThrows(IllegalArgumentException.class,
            () -> calc.calculate(2, "AIRMAIL"));
    }
}
