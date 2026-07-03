package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class VOWELS_COUNT_GPTTest {

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertEquals(0, VOWELS_COUNT.vowels_count(""));
    }

    @Test(timeout = 5000)
    public void testNoVowels() {
        Assert.assertEquals(0, VOWELS_COUNT.vowels_count("bcdfghjklmnpqrstvwxyz"));
    }

    @Test(timeout = 5000)
    public void testOnlyVowelsLowercase() {
        Assert.assertEquals(5, VOWELS_COUNT.vowels_count("aeiou"));
    }

    @Test(timeout = 5000)
    public void testOnlyVowelsUppercase() {
        Assert.assertEquals(5, VOWELS_COUNT.vowels_count("AEIOU"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testMixedCaseVowels() {
        Assert.assertEquals(5, VOWELS_COUNT.vowels_count("aAeEiIoOuU"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testVowelsWithConsonants() {
        Assert.assertEquals(3, VOWELS_COUNT.vowels_count("abcde"));
    }

    @Test(timeout = 5000)
    public void testVowelsWithYAtEnd() {
        Assert.assertEquals(3, VOWELS_COUNT.vowels_count("ACEDY"));
    }

    @Test(timeout = 5000)
    public void testVowelsWithYNotAtEnd() {
        Assert.assertEquals(2, VOWELS_COUNT.vowels_count("ACEDYx"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testYAsVowelAtEnd() {
        Assert.assertEquals(1, VOWELS_COUNT.vowels_count("play"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testYAsVowelAtEndUppercase() {
        Assert.assertEquals(1, VOWELS_COUNT.vowels_count("PLAY"));
    }

    @Test(timeout = 5000)
    public void testYNotVowelInMiddle() {
        Assert.assertEquals(2, VOWELS_COUNT.vowels_count("happy"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testLongStringWithVowels() {
        Assert.assertEquals(10, VOWELS_COUNT.vowels_count("This is a long string with vowels."));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testStringWithSpecialCharacters() {
        Assert.assertEquals(3, VOWELS_COUNT.vowels_count("h@ppy!"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testStringWithNumbers() {
        Assert.assertEquals(2, VOWELS_COUNT.vowels_count("h3ll0"));
    }

    @Test(timeout = 5000)
    public void testStringWithOnlyY() {
        Assert.assertEquals(1, VOWELS_COUNT.vowels_count("y"));
    }

    @Test(timeout = 5000)
    public void testStringWithOnlyUppercaseY() {
        Assert.assertEquals(1, VOWELS_COUNT.vowels_count("Y"));
    }

    @Test(timeout = 5000)
    public void testStringWithMultipleYs() {
        Assert.assertEquals(2, VOWELS_COUNT.vowels_count("yummy"));
    }
}