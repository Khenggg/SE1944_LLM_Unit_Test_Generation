package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class IS_HAPPY_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertFalse(IS_HAPPY.is_happy(""));
    }

    @Test(timeout = 5000)
    public void testStringLengthLessThanThree() {
        Assert.assertFalse(IS_HAPPY.is_happy("a"));
        Assert.assertFalse(IS_HAPPY.is_happy("aa"));
        Assert.assertFalse(IS_HAPPY.is_happy("ab"));
    }

    @Test(timeout = 5000)
    public void testStringWithThreeIdenticalCharacters() {
        Assert.assertFalse(IS_HAPPY.is_happy("aaa"));
    }

    @Test(timeout = 5000)
    public void testStringWithTwoIdenticalCharacters() {
        Assert.assertFalse(IS_HAPPY.is_happy("aab"));
        Assert.assertFalse(IS_HAPPY.is_happy("abb"));
        Assert.assertFalse(IS_HAPPY.is_happy("bba"));
    }

    @Test(timeout = 5000)
    public void testStringWithThreeDistinctCharacters() {
        Assert.assertTrue(IS_HAPPY.is_happy("abc"));
        Assert.assertTrue(IS_HAPPY.is_happy("adb"));
        Assert.assertTrue(IS_HAPPY.is_happy("xyz"));
    }

    @Test(timeout = 5000)
    public void testStringWithConsecutiveIdenticalCharacters() {
        Assert.assertFalse(IS_HAPPY.is_happy("aabb"));
        Assert.assertFalse(IS_HAPPY.is_happy("xyy"));
        Assert.assertFalse(IS_HAPPY.is_happy("xzz"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testStringWithNonConsecutiveIdenticalCharacters() {
        Assert.assertTrue(IS_HAPPY.is_happy("abac"));
        Assert.assertTrue(IS_HAPPY.is_happy("abcabc"));
    }

    @Test(timeout = 5000)
    public void testLongStringWithHappyPattern() {
        Assert.assertTrue(IS_HAPPY.is_happy("abcdefg"));
        Assert.assertTrue(IS_HAPPY.is_happy("abcdeabcde"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testLongStringWithUnhappyPattern() {
        Assert.assertFalse(IS_HAPPY.is_happy("abcdeaa"));
        Assert.assertFalse(IS_HAPPY.is_happy("abcdeabca"));
    }

    @Test(timeout = 5000)
    public void testStringWithSpecialCharacters() {
        Assert.assertTrue(IS_HAPPY.is_happy("!@#"));
        Assert.assertFalse(IS_HAPPY.is_happy("!!@"));
        Assert.assertFalse(IS_HAPPY.is_happy("!@!"));
    }

    @Test(timeout = 5000)
    public void testStringWithNumbers() {
        Assert.assertTrue(IS_HAPPY.is_happy("123"));
        Assert.assertFalse(IS_HAPPY.is_happy("112"));
        Assert.assertFalse(IS_HAPPY.is_happy("121"));
    }
}