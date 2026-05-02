import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorTest {
    private static Logger logger = LoggerFactory.getLogger(CalculatorTest.class);
    private final Calculator c = new Calculator();

    @BeforeAll
    static void initAll() {
        logger.info("=== Bắt đầu chạy CalculatorTest ===");
    }

    @AfterAll
    static void tearDownAll() {
        logger.info("=== Kết thúc ===");
    }

    @Test
    @DisplayName("Kiểm thử hàm add")
    void testAdd() {
        assertEquals(7, c.add(3, 4));
        assertEquals(0, c.add(-3, 3));
    }

    @Test
    @DisplayName("Kiểm thử hàm sub")
    void testSub() {
        assertEquals(1, c.sub(3, 2));
    }
}
