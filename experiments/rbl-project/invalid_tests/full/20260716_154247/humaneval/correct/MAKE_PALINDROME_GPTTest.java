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

    @Test(timeout = 5000)
    public void testIsPalindrome_SpecialCharacters() {
        Assert.assertFalse(MAKE_PALINDROME.is_palindrome("A man, a plan, a canal, Panama"));
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
        Assert.assertEquals("racecar", MAKE_PALINDROME.make_palindrome("racec"));
    }

    @Test(timeout = 5000)
    public void testMakePalindrome_ComplexCase() {
        Assert.assertEquals("abcba", MAKE_PALINDROME.make_palindrome("abc"));
    }

    @Test(timeout = 5000)
    public void testMakePalindrome_SuffixNeeded() {
        Assert.assertEquals("abcba", MAKE_PALINDROME.make_palindrome("abc"));
    }

    @Test(timeout = 5000)
    public void testMakePalindrome_SuffixWithSpecialCharacters() {
        Assert.assertEquals("A man, a plan, a canal, PanamA man, a plan, a canal, PanamA", 
            MAKE_PALINDROME.make_palindrome("A man, a plan, a canal, Panam"));
    }

    @Test(timeout = 5000)
    public void testMakePalindrome_NonAlphabeticCharacters() {
        Assert.assertEquals("12321", MAKE_PALINDROME.make_palindrome("123"));
    }

    @Test(timeout = 5000)
    public void testMakePalindrome_LongString() {
        Assert.assertEquals("abcdefghijklmmlkjihgfedcba", MAKE_PALINDROME.make_palindrome("abcdefghijklm"));
    }
}