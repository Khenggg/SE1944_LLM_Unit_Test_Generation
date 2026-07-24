package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class ANY_INT_GPTTest {

    @Test(timeout = 5000)
    public void testSumOfTwoEqualsThird() {
        Assert.assertTrue(ANY_INT.any_int(5, 2, 7)); // 5 + 2 = 7
        Assert.assertTrue(ANY_INT.any_int(3, -2, 1)); // 3 + (-2) = 1
        Assert.assertTrue(ANY_INT.any_int(0, 0, 0)); // 0 + 0 = 0
    }

    @Test(timeout = 5000)
    public void testSumOfTwoNotEqualsThird() {
        Assert.assertFalse(ANY_INT.any_int(3, 2, 2)); // 3 + 2 != 2
        Assert.assertFalse(ANY_INT.any_int(1, 1, 3)); // 1 + 1 != 3
        Assert.assertFalse(ANY_INT.any_int(10, 5, 4)); // 10 + 5 != 4
    }

    @Test(timeout = 5000)
    public void testNonIntegerValues() {
        Assert.assertFalse(ANY_INT.any_int(3.6, -2.2, 2)); // Not all values are integers
        Assert.assertFalse(ANY_INT.any_int(1.0, 2.0, 3.0)); // Not all values are integers
        Assert.assertFalse(ANY_INT.any_int(2.5, 2, 5)); // Not all values are integers
    }

    @Test(timeout = 5000)
    public void testNegativeNumbers() {
        Assert.assertTrue(ANY_INT.any_int(-5, -2, -7)); // -5 + -2 = -7
        Assert.assertFalse(ANY_INT.any_int(-3, 2, 1)); // -3 + 2 != 1
        Assert.assertFalse(ANY_INT.any_int(-1, -1, -3)); // -1 + -1 != -3
    }

    @Test(timeout = 5000)
    public void testZeroValues() {
        Assert.assertTrue(ANY_INT.any_int(0, 0, 0)); // 0 + 0 = 0
        Assert.assertFalse(ANY_INT.any_int(0, 1, 1)); // 0 + 1 != 1
        Assert.assertFalse(ANY_INT.any_int(0, 2, 3)); // 0 + 2 != 3
    }

    @Test(timeout = 5000)
    public void testLargeNumbers() {
        Assert.assertTrue(ANY_INT.any_int(1000000, 2000000, 3000000)); // 1000000 + 2000000 = 3000000
        Assert.assertFalse(ANY_INT.any_int(1000000, 2000000, 4000000)); // 1000000 + 2000000 != 4000000
    }

    @Test(timeout = 5000)
    public void testBoundaryValues() {
        Assert.assertTrue(ANY_INT.any_int(Integer.MAX_VALUE, Integer.MAX_VALUE, (double)Integer.MAX_VALUE + Integer.MAX_VALUE)); // Edge case with max int values
        Assert.assertFalse(ANY_INT.any_int(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); // Edge case with max int values
    }
}