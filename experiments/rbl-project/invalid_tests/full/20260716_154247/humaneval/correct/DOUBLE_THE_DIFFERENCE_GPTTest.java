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
    public void testNoOddNumbers() {
        double[] input = {2, 4, 6, 8};
        int expected = 0;
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSingleOddNumber() {
        double[] input = {3};
        int expected = 9; // 3 * 3
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSingleEvenNumber() {
        double[] input = {2};
        int expected = 0;
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testMixedNumbers() {
        double[] input = {1, 3, 2, 0};
        int expected = 10; // 1 * 1 + 3 * 3 + 0
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testMixedWithNegatives() {
        double[] input = {9, -2, -3, 5};
        int expected = 106; // 9 * 9 + 5 * 5
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testZeroInList() {
        double[] input = {0, 1, 3};
        int expected = 10; // 1 * 1 + 3 * 3 + 0
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testNonIntegerValues() {
        double[] input = {1.5, 2.5, 3.0, 4.0};
        int expected = 9; // 3 * 3
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testLargeNumbers() {
        double[] input = {1001, 1003, 1005};
        int expected = 10060035; // 1001 * 1001 + 1003 * 1003 + 1005 * 1005
        int actual = DOUBLE_THE_DIFFERENCE.double_the_difference(input);
        Assert.assertEquals(expected, actual);
    }
}