import org.junit.Test;

import static java.lang.Boolean.TRUE;
import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindrome() {
        PalindromeNumber palindrome = new PalindromeNumber();
        assertEquals(TRUE, palindrome.isPalindrome(121));
    }
}
