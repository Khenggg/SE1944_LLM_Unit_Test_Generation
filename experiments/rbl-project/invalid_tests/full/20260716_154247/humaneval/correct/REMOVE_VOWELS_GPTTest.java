package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class REMOVE_VOWELS_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertEquals("", REMOVE_VOWELS.remove_vowels(""));
    }

    @Test(timeout = 5000)
    public void testStringWithNewline() {
        Assert.assertEquals("bcdf\nghjklm", REMOVE_VOWELS.remove_vowels("abcdef\nghijklm"));
    }

    @Test(timeout = 5000)
    public void testStringWithVowels() {
        Assert.assertEquals("bcdf", REMOVE_VOWELS.remove_vowels("abcdef"));
    }

    @Test(timeout = 5000)
    public void testStringWithOnlyVowels() {
        Assert.assertEquals("", REMOVE_VOWELS.remove_vowels("aaaaa"));
    }

    @Test(timeout = 5000)
    public void testStringWithMixedCaseVowels() {
        Assert.assertEquals("B", REMOVE_VOWELS.remove_vowels("aaBAA"));
    }

    @Test(timeout = 5000)
    public void testStringWithNoVowels() {
        Assert.assertEquals("zbcd", REMOVE_VOWELS.remove_vowels("zbcd"));
    }

    @Test(timeout = 5000)
    public void testStringWithAllVowels() {
        Assert.assertEquals("", REMOVE_VOWELS.remove_vowels("AEIOUaeiou"));
    }

    @Test(timeout = 5000)
    public void testStringWithSpecialCharacters() {
        Assert.assertEquals("!@#$%^&*()", REMOVE_VOWELS.remove_vowels("!@#$%^&*()"));
    }

    @Test(timeout = 5000)
    public void testStringWithSpaces() {
        Assert.assertEquals(" b c d ", REMOVE_VOWELS.remove_vowels(" a b c d e "));
    }

    @Test(timeout = 5000)
    public void testStringWithMixedContent() {
        Assert.assertEquals("Ths s n xmpl", REMOVE_VOWELS.remove_vowels("This is an example"));
    }
}