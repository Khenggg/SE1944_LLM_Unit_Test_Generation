package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class DOUBLE_THE_DIFFERENCE_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyList() {
        double[] input = {};
        int expected = 0;
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testAllNegativeNumbers() {
        double[] input = {-1, -2, -3};
        int expected = 0;
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testMixedNumbers() {
        double[] input = {1, 3, 2, 0};
        int expected = 10; // 1^2 + 3^2 + 0^2 = 1 + 9 + 0 = 10
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testOnlyZero() {
        double[] input = {0};
        int expected = 0;
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSingleOddPositiveNumber() {
        double[] input = {5};
        int expected = 25; // 5^2 = 25
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSingleEvenPositiveNumber() {
        double[] input = {4};
        int expected = 0; // No odd numbers
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSingleNegativeNumber() {
        double[] input = {-3};
        int expected = 0; // No positive odd numbers
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testPositiveAndNegativeMixed() {
        double[] input = {9, -2};
        int expected = 81; // 9^2 = 81
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testNonIntegerValues() {
        double[] input = {1.5, 2.5, 3.0, 4.0};
        int expected = 9; // 3^2 = 9 (only 3 is odd and an integer)
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testAllZeros() {
        double[] input = {0, 0, 0};
        int expected = 0; // No odd numbers
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }
}