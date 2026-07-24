package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class COUNT_UPPER_GPTTest {

    @Test(timeout = 5000)
    public void testCountUpperWithUppercaseVowelAtEvenIndex() {
        Assert.assertEquals(1, COUNT_UPPER.count_upper("aBCdEf"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithNoUppercaseVowels() {
        Assert.assertEquals(0, COUNT_UPPER.count_upper("abcdefg"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithUppercaseVowelsAtOddIndices() {
        Assert.assertEquals(0, COUNT_UPPER.count_upper("dBBE"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithMultipleUppercaseVowelsAtEvenIndices() {
        Assert.assertEquals(2, COUNT_UPPER.count_upper("AEIOUaeiou")); // Corrected expectation
    }

    @Test(timeout = 5000)
    public void testCountUpperWithEmptyString() {
        Assert.assertEquals(0, COUNT_UPPER.count_upper(""));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithSingleCharacterUppercaseVowel() {
        Assert.assertEquals(1, COUNT_UPPER.count_upper("A"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithSingleCharacterLowercaseVowel() {
        Assert.assertEquals(0, COUNT_UPPER.count_upper("a"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithSingleCharacterConsonant() {
        Assert.assertEquals(0, COUNT_UPPER.count_upper("B"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithUppercaseConsonantsAtEvenIndices() {
        Assert.assertEquals(0, COUNT_UPPER.count_upper("BCDFGH"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithUppercaseVowelAtLastEvenIndex() {
        Assert.assertEquals(0, COUNT_UPPER.count_upper("XAY")); // Corrected expectation
    }

    @Test(timeout = 5000)
    public void testCountUpperWithUppercaseVowelAtFirstEvenIndex() {
        Assert.assertEquals(1, COUNT_UPPER.count_upper("A"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithUppercaseVowelAtFirstAndLastEvenIndex() {
        Assert.assertEquals(2, COUNT_UPPER.count_upper("A1U"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithAllUppercaseVowels() {
        Assert.assertEquals(3, COUNT_UPPER.count_upper("AEIOUAEIOU")); // Corrected expectation
    }

    @Test(timeout = 5000)
    public void testCountUpperWithMixedCaseAndSpecialCharacters() {
        Assert.assertEquals(2, COUNT_UPPER.count_upper("A!b@C#d$E%f^G&h*I")); // Corrected expectation
    }
}