import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.Greeter;

public class GreeterTest {
    private final Greeter g = new Greeter();

    @Test @DisplayName("Tên bình thường")
    void normal()   { assertEquals("Hello, Quan", g.hello("quan")); }

    @Test @DisplayName("Tên rỗng -> guest")
    void blank()    { assertEquals("Hello, Guest", g.hello("")); }

    @Test @DisplayName("Tên null -> guest")
    void nullCase() { assertEquals("Hello, Guest", g.hello(null)); }
}
