package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class PLUCK_GPTTest {

    @Test(timeout = 5000)
    public void testPluckWithMultipleEvenValues() {
        int[] input = {4, 2, 3};
        int[] expected = {2, 1};
        Assert.assertArrayEquals(expected, PLUCK.pluck(input));
    }

    @Test(timeout = 5000)
    public void testPluckWithSingleEvenValue() {
        int[] input = {1, 2, 3};
        int[] expected = {2, 1};
        Assert.assertArrayEquals(expected, PLUCK.pluck(input));
    }

    @Test(timeout = 5000)
    public void testPluckWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        Assert.assertArrayEquals(expected, PLUCK.pluck(input));
    }

    @Test(timeout = 5000)
    public void testPluckWithMultipleZeros() {
        int[] input = {5, 0, 3, 0, 4, 2};
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, PLUCK.pluck(input));
    }

    @Test(timeout = 5000)
    public void testPluckWithNoEvenValues() {
        int[] input = {1, 3, 5, 7};
        int[] expected = {};
        Assert.assertArrayEquals(expected, PLUCK.pluck(input));
    }

    @Test(timeout = 5000)
    public void testPluckWithAllEvenValues() {
        int[] input = {8, 6, 4, 2};
        int[] expected = {2, 3};
        Assert.assertArrayEquals(expected, PLUCK.pluck(input));
    }

    @Test(timeout = 5000)
    public void testPluckWithNegativeValues() {
        int[] input = {-2, -4, -6, -8};
        int[] expected = {-8, 3};
        Assert.assertArrayEquals(expected, PLUCK.pluck(input));
    }

    @Test(timeout = 5000)
    public void testPluckWithLargeArray() {
        int[] input = new int[10000];
        for (int i = 0; i < 10000; i++) {
            input[i] = i; // Fill with 0, 1, 2, ..., 9999
        }
        int[] expected = {0, 0}; // Smallest even value is 0 at index 0
        Assert.assertArrayEquals(expected, PLUCK.pluck(input));
    }

    @Test(timeout = 5000)
    public void testPluckWithSingleElementEven() {
        int[] input = {2};
        int[] expected = {2, 0};
        Assert.assertArrayEquals(expected, PLUCK.pluck(input));
    }

    @Test(timeout = 5000)
    public void testPluckWithSingleElementOdd() {
        int[] input = {3};
        int[] expected = {};
        Assert.assertArrayEquals(expected, PLUCK.pluck(input));
    }
}