package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class MAKE_PALINDROME_GPTTest {

    @Test(timeout = 5000)
    public void testIsPalindrome_EmptyString() {
        Assert.assertTrue(MAKE_PALINDROME.is_palindrome(""));
    }

    @Test(timeout = 5000)
    public void testIsPalindrome_SingleCharacter() {
        Assert.assertTrue(MAKE_PALINDROME.is_palindrome("a"));
    }

    @Test(timeout = 5000)
    public void testIsPalindrome_PalindromeEvenLength() {
        Assert.assertTrue(MAKE_PALINDROME.is_palindrome("abba"));
    }

    @Test(timeout = 5000)
    public void testIsPalindrome_PalindromeOddLength() {
        Assert.assertTrue(MAKE_PALINDROME.is_palindrome("racecar"));
    }

    @Test(timeout = 5000)
    public void testIsPalindrome_NonPalindrome() {
        Assert.assertFalse(MAKE_PALINDROME.is_palindrome("hello"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testIsPalindrome_SpecialCharacters() {
        Assert.assertTrue(MAKE_PALINDROME.is_palindrome("A man, a plan, a canal, Panama"));
    }

    @Test(timeout = 5000)
    public void testMakePalindrome_EmptyString() {
        Assert.assertEquals("", MAKE_PALINDROME.make_palindrome(""));
    }

    @Test(timeout = 5000)
    public void testMakePalindrome_SingleCharacter() {
        Assert.assertEquals("a", MAKE_PALINDROME.make_palindrome("a"));
    }

    @Test(timeout = 5000)
    public void testMakePalindrome_AlreadyPalindrome() {
        Assert.assertEquals("abba", MAKE_PALINDROME.make_palindrome("abba"));
    }

    @Test(timeout = 5000)
    public void testMakePalindrome_NonPalindrome() {
        Assert.assertEquals("racecar", MAKE_PALINDROME.make_palindrome("racecar"));
    }

    @Test(timeout = 5000)
    public void testMakePalindrome_NonPalindromeWithSuffix() {
        Assert.assertEquals("abcba", MAKE_PALINDROME.make_palindrome("abc"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testMakePalindrome_SingleCharacterSuffix() {
        Assert.assertEquals("abccba", MAKE_PALINDROME.make_palindrome("abc"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testMakePalindrome_SpecialCharacters() {
        Assert.assertEquals("A man, a plan, a canal, PanamA man, a plan, a canal, PanamA", 
                            MAKE_PALINDROME.make_palindrome("A man, a plan, a canal, Panam"));
    }

    @Test(timeout = 5000)
    public void testMakePalindrome_LongString() {
        Assert.assertEquals("abcdefedcba", MAKE_PALINDROME.make_palindrome("abcdef"));
    }
}