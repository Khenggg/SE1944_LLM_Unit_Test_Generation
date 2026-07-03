package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class REMOVE_VOWELS_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertEquals("", REMOVE_VOWELS.remove_vowels(""));
    }

    @Test(timeout = 5000)
    public void testStringWithVowels() {
        Assert.assertEquals("bcdf\nghjklm", REMOVE_VOWELS.remove_vowels("abcdef\nghijklm"));
    }

    @Test(timeout = 5000)
    public void testStringWithOnlyVowels() {
        Assert.assertEquals("", REMOVE_VOWELS.remove_vowels("aaaaa"));
    }

    @Test(timeout = 5000)
    public void testMixedCaseVowels() {
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
    public void testStringWithSpacesAndVowels() {
        Assert.assertEquals("  ", REMOVE_VOWELS.remove_vowels(" a e i o u "));
    }

    @Test(timeout = 5000)
    public void testStringWithSpecialCharacters() {
        Assert.assertEquals("!@#$%^&*()", REMOVE_VOWELS.remove_vowels("!@#$%^&*()aeiou"));
    }

    @Test(timeout = 5000)
    public void testStringWithNumbers() {
        Assert.assertEquals("1234567890", REMOVE_VOWELS.remove_vowels("1234567890aeiou"));
    }

    @Test(timeout = 5000)
    public void testLongString() {
        String input = "This is a long string with vowels and consonants.";
        String expected = "Ths s  lng strng wth vwls nd cnsnnts.";
        Assert.assertEquals(expected, REMOVE_VOWELS.remove_vowels(input));
    }
}