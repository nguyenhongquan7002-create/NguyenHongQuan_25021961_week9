import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.Hello;

public class HelloTest {
    @Test
    @DisplayName("Greet trả về chuỗi đúng định dạng")
    void greet() {
        assertEquals("Hello, Quan!", Hello.greet("Quan"));
    }
}
