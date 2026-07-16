package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class IS_HAPPY_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertFalse(IS_HAPPY.is_happy(""));
    }

    @Test(timeout = 5000)
    public void testStringLengthOne() {
        Assert.assertFalse(IS_HAPPY.is_happy("a"));
    }

    @Test(timeout = 5000)
    public void testStringLengthTwo() {
        Assert.assertFalse(IS_HAPPY.is_happy("aa"));
    }

    @Test(timeout = 5000)
    public void testStringLengthThreeAllSame() {
        Assert.assertFalse(IS_HAPPY.is_happy("aaa"));
    }

    @Test(timeout = 5000)
    public void testStringLengthThreeTwoSame() {
        Assert.assertFalse(IS_HAPPY.is_happy("aab"));
    }

    @Test(timeout = 5000)
    public void testStringLengthThreeAllDistinct() {
        Assert.assertTrue(IS_HAPPY.is_happy("abc"));
    }

    @Test(timeout = 5000)
    public void testStringLengthFourWithTwoSame() {
        Assert.assertFalse(IS_HAPPY.is_happy("aabb"));
    }

    @Test(timeout = 5000)
    public void testStringLengthFourAllDistinct() {
        Assert.assertTrue(IS_HAPPY.is_happy("abcd"));
    }

    @Test(timeout = 5000)
    public void testStringLengthFiveWithTwoSame() {
        Assert.assertTrue(IS_HAPPY.is_happy("abca"));
    }

    @Test(timeout = 5000)
    public void testStringLengthFiveAllDistinct() {
        Assert.assertTrue(IS_HAPPY.is_happy("abcde"));
    }

    @Test(timeout = 5000)
    public void testStringLengthFiveWithAdjacentSame() {
        Assert.assertFalse(IS_HAPPY.is_happy("abccde"));
    }

    @Test(timeout = 5000)
    public void testStringLengthSixWithAdjacentSame() {
        Assert.assertFalse(IS_HAPPY.is_happy("abcabc"));
    }

    @Test(timeout = 5000)
    public void testStringLengthSixAllDistinct() {
        Assert.assertTrue(IS_HAPPY.is_happy("abcdef"));
    }

    @Test(timeout = 5000)
    public void testStringWithSpecialCharacters() {
        Assert.assertTrue(IS_HAPPY.is_happy("a!@#"));
        Assert.assertFalse(IS_HAPPY.is_happy("a!!@"));
    }

    @Test(timeout = 5000)
    public void testStringWithNumbers() {
        Assert.assertTrue(IS_HAPPY.is_happy("12345"));
        Assert.assertFalse(IS_HAPPY.is_happy("12333"));
    }

    @Test(timeout = 5000)
    public void testStringWithMixedCharacters() {
        Assert.assertTrue(IS_HAPPY.is_happy("a1b2c3"));
        Assert.assertFalse(IS_HAPPY.is_happy("a1b2a3"));
    }
}