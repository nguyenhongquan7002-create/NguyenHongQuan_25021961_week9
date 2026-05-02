import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.StringUtils;

public class StringUtilsTest {
    private final StringUtils u = new StringUtils();

    @Test @DisplayName("Palindrome - true case")
    void palindromeTrue()  { assertTrue(u.isPalindrome("Madam")); }

    @Test @DisplayName("Palindrome - false case")
    void palindromeFalse() { assertFalse(u.isPalindrome("hello")); }

    @Test @DisplayName("Palindrome - null")
    void palindromeNull()  { assertFalse(u.isPalindrome(null)); }

    @Test @DisplayName("Reverse - bình thường")
    void reverseOk()       { assertEquals("cba", u.reverse("abc")); }

    @Test @DisplayName("Reverse - null trả về rỗng")
    void reverseNull()     { assertEquals("", u.reverse(null)); }
}
