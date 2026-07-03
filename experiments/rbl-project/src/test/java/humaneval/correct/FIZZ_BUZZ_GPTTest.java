package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class FIZZ_BUZZ_GPTTest {

    @Test(timeout = 5000)
    public void testFizzBuzzWithZero() {
        int result = FIZZ_BUZZ.fizz_buzz(0);
        Assert.assertEquals(0, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithOne() {
        int result = FIZZ_BUZZ.fizz_buzz(1);
        Assert.assertEquals(0, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithTwo() {
        int result = FIZZ_BUZZ.fizz_buzz(2);
        Assert.assertEquals(0, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithSeven() {
        int result = FIZZ_BUZZ.fizz_buzz(8);
        Assert.assertEquals(1, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithEleven() {
        int result = FIZZ_BUZZ.fizz_buzz(12);
        Assert.assertEquals(1, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithThirteen() {
        int result = FIZZ_BUZZ.fizz_buzz(14);
        Assert.assertEquals(1, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithSeventeen() {
        int result = FIZZ_BUZZ.fizz_buzz(18);
        Assert.assertEquals(2, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithTwentySeven() {
        int result = FIZZ_BUZZ.fizz_buzz(28);
        Assert.assertEquals(3, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithThirtySeven() {
        int result = FIZZ_BUZZ.fizz_buzz(38);
        Assert.assertEquals(4, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithFortySeven() {
        int result = FIZZ_BUZZ.fizz_buzz(48);
        Assert.assertEquals(5, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithFifty() {
        int result = FIZZ_BUZZ.fizz_buzz(51);
        Assert.assertEquals(5, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithLargeNumber() {
        int result = FIZZ_BUZZ.fizz_buzz(100);
        Assert.assertEquals(10, result);
    }

    @Test(timeout = 5000)
    public void testFizzBuzzWithNegativeNumber() {
        int result = FIZZ_BUZZ.fizz_buzz(-5);
        Assert.assertEquals(0, result);
    }
}