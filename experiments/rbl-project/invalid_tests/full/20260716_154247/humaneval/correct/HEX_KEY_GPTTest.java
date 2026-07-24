package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class HEX_KEY_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertEquals(0, HEX_KEY.hex_key(""));
    }

    @Test(timeout = 5000)
    public void testNoPrimeDigits() {
        Assert.assertEquals(0, HEX_KEY.hex_key("014689A0CDEF"));
    }

    @Test(timeout = 5000)
    public void testSinglePrimeDigit() {
        Assert.assertEquals(1, HEX_KEY.hex_key("2"));
        Assert.assertEquals(1, HEX_KEY.hex_key("3"));
        Assert.assertEquals(1, HEX_KEY.hex_key("5"));
        Assert.assertEquals(1, HEX_KEY.hex_key("7"));
        Assert.assertEquals(1, HEX_KEY.hex_key("B"));
        Assert.assertEquals(1, HEX_KEY.hex_key("D"));
    }

    @Test(timeout = 5000)
    public void testMultiplePrimeDigits() {
        Assert.assertEquals(1, HEX_KEY.hex_key("AB"));
        Assert.assertEquals(2, HEX_KEY.hex_key("1077E"));
        Assert.assertEquals(4, HEX_KEY.hex_key("ABED1A33"));
        Assert.assertEquals(6, HEX_KEY.hex_key("123456789ABCDEF0"));
        Assert.assertEquals(2, HEX_KEY.hex_key("2020"));
    }

    @Test(timeout = 5000)
    public void testAllPrimeDigits() {
        Assert.assertEquals(6, HEX_KEY.hex_key("2357BD"));
    }

    @Test(timeout = 5000)
    public void testMixedDigits() {
        Assert.assertEquals(4, HEX_KEY.hex_key("123456789BDBD"));
        Assert.assertEquals(0, HEX_KEY.hex_key("00000000"));
        Assert.assertEquals(1, HEX_KEY.hex_key("A2B3C4D5E6F7"));
    }

    @Test(timeout = 5000)
    public void testUpperCaseHexDigits() {
        Assert.assertEquals(1, HEX_KEY.hex_key("A2B3C4D5E6F7B"));
        Assert.assertEquals(0, HEX_KEY.hex_key("A0C0E0F0"));
    }

    @Test(timeout = 5000)
    public void testLowerCaseHexDigits() {
        Assert.assertEquals(0, HEX_KEY.hex_key("a2b3c4d5e6f7")); // Assuming input is always uppercase
    }
}