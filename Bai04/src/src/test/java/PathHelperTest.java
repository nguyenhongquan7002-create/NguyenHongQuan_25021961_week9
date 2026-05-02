import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.PathHelper;
import java.nio.file.Path;

public class PathHelperTest {
    private final PathHelper p = new PathHelper();

    @Test
    @DisplayName("Build path đúng theo OS (cross-platform)")
    void testBuildPath() {
        Path path = p.buildLogPath("logs", "app.log");
        // dung Path.of -> khong phu thuoc dau '/' hay '\\'
        assertTrue(path.endsWith(Path.of("logs", "app.log")));
    }

    @Test
    @DisplayName("Separator phải là '/' hoặc '\\\\' tuỳ hệ điều hành")
    void testSeparator() {
        String sep = p.separator();
        assertNotNull(sep);
        assertTrue(sep.equals("/") || sep.equals("\\"));
    }
}
