import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderServiceTest {
    private static Logger logger = LoggerFactory.getLogger(OrderServiceTest.class);
    private final OrderService s = new OrderService();

    @BeforeAll
    static void initAll() {
        logger.info("=== Bắt đầu chạy OrderServiceTest ===");
    }

    @AfterAll
    static void tearDownAll() {
        logger.info("=== Kết thúc ===");
    }

    @Test @DisplayName("Tổng đúng cho input hợp lệ")
    void totalOk()      { assertEquals(60.0, s.total(3, 20.0)); }

    @Test @DisplayName("Số lượng <=0 ném IllegalArgumentException")
    void invalidQty()   { assertThrows(IllegalArgumentException.class, () -> s.total(0, 10)); }

    @Test @DisplayName("Giá âm ném IllegalArgumentException")
    void invalidPrice() { assertThrows(IllegalArgumentException.class, () -> s.total(2, -1)); }
}
