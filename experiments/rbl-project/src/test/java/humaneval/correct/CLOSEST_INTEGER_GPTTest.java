package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class CLOSEST_INTEGER_GPTTest {

    @Test(timeout = 5000)
    public void testClosestIntegerPositiveWholeNumber() {
        Assert.assertEquals(10, CLOSEST_INTEGER.closest_integer("10"));
    }

    @Test(timeout = 5000)
    public void testClosestIntegerPositiveDecimal() {
        Assert.assertEquals(15, CLOSEST_INTEGER.closest_integer("15.3"));
    }

    @Test(timeout = 5000)
    public void testClosestIntegerPositiveEquidistant() {
        Assert.assertEquals(15, CLOSEST_INTEGER.closest_integer("14.5"));
    }

    @Test(timeout = 5000)
    public void testClosestIntegerNegativeWholeNumber() {
        Assert.assertEquals(-10, CLOSEST_INTEGER.closest_integer("-10"));
    }

    @Test(timeout = 5000)
    public void testClosestIntegerNegativeDecimal() {
        Assert.assertEquals(-15, CLOSEST_INTEGER.closest_integer("-15.3"));
    }

    @Test(timeout = 5000)
    public void testClosestIntegerNegativeEquidistant() {
        Assert.assertEquals(-15, CLOSEST_INTEGER.closest_integer("-14.5"));
    }

    @Test(timeout = 5000)
    public void testClosestIntegerZero() {
        Assert.assertEquals(0, CLOSEST_INTEGER.closest_integer("0"));
    }

    @Test(timeout = 5000)
    public void testClosestIntegerPositiveZeroPointFive() {
        Assert.assertEquals(1, CLOSEST_INTEGER.closest_integer("0.5"));
    }

    @Test(timeout = 5000)
    public void testClosestIntegerNegativeZeroPointFive() {
        Assert.assertEquals(-1, CLOSEST_INTEGER.closest_integer("-0.5"));
    }

    @Test(timeout = 5000)
    public void testClosestIntegerTrailingZeros() {
        Assert.assertEquals(2, CLOSEST_INTEGER.closest_integer("2.00"));
        Assert.assertEquals(-3, CLOSEST_INTEGER.closest_integer("-3.00"));
    }

    @Test(expected = NumberFormatException.class)
    public void testClosestIntegerInvalidInput() {
        CLOSEST_INTEGER.closest_integer("invalid");
    }

    @Test(timeout = 5000)
    public void testClosestIntegerLargeNumber() {
        Assert.assertEquals(1000000, CLOSEST_INTEGER.closest_integer("1000000.4"));
        Assert.assertEquals(1000000, CLOSEST_INTEGER.closest_integer("1000000.5"));
    }

    @Test(timeout = 5000)
    public void testClosestIntegerSmallNumber() {
        Assert.assertEquals(0, CLOSEST_INTEGER.closest_integer("0.4"));
        Assert.assertEquals(0, CLOSEST_INTEGER.closest_integer("0.5"));
    }
}