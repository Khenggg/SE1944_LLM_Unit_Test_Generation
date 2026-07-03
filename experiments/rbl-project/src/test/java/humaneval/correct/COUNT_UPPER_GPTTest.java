package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class COUNT_UPPER_GPTTest {

    @Test(timeout = 5000)
    public void testCountUpperWithUppercaseVowelsAtEvenIndices() {
        Assert.assertEquals(1, COUNT_UPPER.count_upper("aBCdEf"));
        Assert.assertEquals(2, COUNT_UPPER.count_upper("AEIOU"));
        Assert.assertEquals(1, COUNT_UPPER.count_upper("AabcE"));
        Assert.assertEquals(0, COUNT_UPPER.count_upper("aEIOU"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithNoUppercaseVowels() {
        Assert.assertEquals(0, COUNT_UPPER.count_upper("abcdefg"));
        Assert.assertEquals(0, COUNT_UPPER.count_upper("dBBE"));
        Assert.assertEquals(0, COUNT_UPPER.count_upper("xyz"));
        Assert.assertEquals(0, COUNT_UPPER.count_upper("bcdfgh"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithMixedCase() {
        Assert.assertEquals(1, COUNT_UPPER.count_upper("AbcdeEf"));
        Assert.assertEquals(0, COUNT_UPPER.count_upper("aBcDeF"));
        Assert.assertEquals(1, COUNT_UPPER.count_upper("AeIoU"));
        Assert.assertEquals(0, COUNT_UPPER.count_upper("aEIoU"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithEmptyString() {
        Assert.assertEquals(0, COUNT_UPPER.count_upper(""));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithSingleCharacter() {
        Assert.assertEquals(0, COUNT_UPPER.count_upper("a"));
        Assert.assertEquals(0, COUNT_UPPER.count_upper("b"));
        Assert.assertEquals(1, COUNT_UPPER.count_upper("A"));
        Assert.assertEquals(0, COUNT_UPPER.count_upper("E"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithSpecialCharacters() {
        Assert.assertEquals(0, COUNT_UPPER.count_upper("!@#$%^&*()"));
        Assert.assertEquals(1, COUNT_UPPER.count_upper("A!B@C#D$E%"));
        Assert.assertEquals(0, COUNT_UPPER.count_upper("12345"));
        Assert.assertEquals(1, COUNT_UPPER.count_upper("A1B2C3D4E5"));
    }

    @Test(timeout = 5000)
    public void testCountUpperWithLongString() {
        Assert.assertEquals(5, COUNT_UPPER.count_upper("AEIOUAEIOUAEIOU"));
        Assert.assertEquals(0, COUNT_UPPER.count_upper("abcdefghijklmnopqrstuvwxyz"));
        Assert.assertEquals(3, COUNT_UPPER.count_upper("A1E2I3O4U5A6E7I8O9U0"));
    }
}