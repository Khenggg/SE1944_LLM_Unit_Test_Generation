package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class ANY_INT_GPTTest {

    @Test(timeout = 5000)
    public void testSumOfTwoEqualsThird() {
        Assert.assertTrue(ANY_INT.any_int(5, 2, 7));
        Assert.assertTrue(ANY_INT.any_int(3, -2, 1));
        Assert.assertTrue(ANY_INT.any_int(0, 0, 0));
        Assert.assertTrue(ANY_INT.any_int(10, 5, 15));
    }

    @Test(timeout = 5000)
    public void testSumOfTwoNotEqualsThird() {
        Assert.assertFalse(ANY_INT.any_int(3, 2, 2));
        Assert.assertFalse(ANY_INT.any_int(1, 1, 3));
        Assert.assertFalse(ANY_INT.any_int(1, 2, 4));
        Assert.assertFalse(ANY_INT.any_int(10, 10, 5));
    }

    @Test(timeout = 5000)
    public void testNonIntegerValues() {
        Assert.assertFalse(ANY_INT.any_int(3.6, -2.2, 2));
        Assert.assertFalse(ANY_INT.any_int(1.1, 2.2, 3.3));
        Assert.assertFalse(ANY_INT.any_int(5.0, 2.0, 7.1));
        Assert.assertFalse(ANY_INT.any_int(0.5, 0.5, 1.1));
    }

    @Test(timeout = 5000)
    public void testNegativeNumbers() {
        Assert.assertTrue(ANY_INT.any_int(-3, -2, -5));
        Assert.assertTrue(ANY_INT.any_int(-1, -1, -2));
        Assert.assertFalse(ANY_INT.any_int(-1, -2, -4));
    }

    @Test(timeout = 5000)
    public void testZeroValues() {
        Assert.assertTrue(ANY_INT.any_int(0, 0, 0));
        Assert.assertFalse(ANY_INT.any_int(0, 1, 1));
        Assert.assertFalse(ANY_INT.any_int(0, 1, 2));
    }

    @Test(timeout = 5000)
    public void testLargeNumbers() {
        Assert.assertTrue(ANY_INT.any_int(1000000, 2000000, 3000000));
        Assert.assertFalse(ANY_INT.any_int(1000000, 2000000, 4000000));
    }

    @Test(timeout = 5000)
    public void testSmallNumbers() {
        Assert.assertTrue(ANY_INT.any_int(0.0001, 0.0002, 0.0003));
        Assert.assertFalse(ANY_INT.any_int(0.0001, 0.0002, 0.0004));
    }
}