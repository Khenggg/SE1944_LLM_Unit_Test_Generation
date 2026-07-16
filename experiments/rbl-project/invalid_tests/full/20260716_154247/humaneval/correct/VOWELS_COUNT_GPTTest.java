package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class VOWELS_COUNT_GPTTest {

    @Test(timeout = 5000)
    public void testVowelsCountWithLowercaseVowels() {
        Assert.assertEquals(2, VOWELS_COUNT.vowels_count("abcde"));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithUppercaseVowels() {
        Assert.assertEquals(3, VOWELS_COUNT.vowels_count("ACEDY"));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithMixedCaseVowels() {
        Assert.assertEquals(4, VOWELS_COUNT.vowels_count("AbEcIdO"));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithOnlyConsonants() {
        Assert.assertEquals(0, VOWELS_COUNT.vowels_count("bcdfghjklmnpqrstvwxyz"));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithEmptyString() {
        Assert.assertEquals(0, VOWELS_COUNT.vowels_count(""));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithSingleVowel() {
        Assert.assertEquals(1, VOWELS_COUNT.vowels_count("a"));
        Assert.assertEquals(1, VOWELS_COUNT.vowels_count("A"));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithSingleConsonant() {
        Assert.assertEquals(0, VOWELS_COUNT.vowels_count("b"));
        Assert.assertEquals(0, VOWELS_COUNT.vowels_count("B"));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithYAtEnd() {
        Assert.assertEquals(1, VOWELS_COUNT.vowels_count("happy"));
        Assert.assertEquals(1, VOWELS_COUNT.vowels_count("HAPPY"));
        Assert.assertEquals(2, VOWELS_COUNT.vowels_count("happyy"));
        Assert.assertEquals(2, VOWELS_COUNT.vowels_count("HAPPYY"));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithYNotAtEnd() {
        Assert.assertEquals(0, VOWELS_COUNT.vowels_count("y"));
        Assert.assertEquals(0, VOWELS_COUNT.vowels_count("Y"));
        Assert.assertEquals(1, VOWELS_COUNT.vowels_count("yes"));
        Assert.assertEquals(1, VOWELS_COUNT.vowels_count("YES"));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithAllVowels() {
        Assert.assertEquals(5, VOWELS_COUNT.vowels_count("aeiou"));
        Assert.assertEquals(5, VOWELS_COUNT.vowels_count("AEIOU"));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithAllVowelsAndYAtEnd() {
        Assert.assertEquals(6, VOWELS_COUNT.vowels_count("aeiouy"));
        Assert.assertEquals(6, VOWELS_COUNT.vowels_count("AEIOUY"));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithLongString() {
        Assert.assertEquals(8, VOWELS_COUNT.vowels_count("This is a long string with vowels."));
    }

    @Test(timeout = 5000)
    public void testVowelsCountWithSpecialCharacters() {
        Assert.assertEquals(3, VOWELS_COUNT.vowels_count("h@ppy!"));
        Assert.assertEquals(4, VOWELS_COUNT.vowels_count("h@ppy y!"));
    }
}