package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class LARGEST_SMALLEST_INTEGERS_GPTTest {

    @Test(timeout = 5000)
    public void testAllPositiveIntegers() {
        int[] input = {2, 4, 1, 3, 5, 7};
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }

    @Test(timeout = 5000)
    public void testAllNegativeIntegers() {
        int[] input = {-2, -4, -1, -3, -5, -7};
        int[] expected = {-1, 0};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }

    @Test(timeout = 5000)
    public void testMixedIntegers() {
        int[] input = {2, -4, 1, -3, 5, -7};
        int[] expected = {-3, 1};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }

    @Test(timeout = 5000)
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {0, 0};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }

    @Test(timeout = 5000)
    public void testArrayWithZero() {
        int[] input = {0};
        int[] expected = {0, 0};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }

    @Test(timeout = 5000)
    public void testArrayWithOnlyZero() {
        int[] input = {0, 0, 0};
        int[] expected = {0, 0};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }

    @Test(timeout = 5000)
    public void testArrayWithOnePositive() {
        int[] input = {5};
        int[] expected = {0, 5};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }

    @Test(timeout = 5000)
    public void testArrayWithOneNegative() {
        int[] input = {-5};
        int[] expected = {-5, 0};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }

    @Test(timeout = 5000)
    public void testArrayWithMultipleSamePositive() {
        int[] input = {3, 3, 3};
        int[] expected = {0, 3};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }

    @Test(timeout = 5000)
    public void testArrayWithMultipleSameNegative() {
        int[] input = {-3, -3, -3};
        int[] expected = {-3, 0};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }

    @Test(timeout = 5000)
    public void testArrayWithNegativeAndZero() {
        int[] input = {-1, 0, -2};
        int[] expected = {-1, 0};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }

    @Test(timeout = 5000)
    public void testArrayWithPositiveAndZero() {
        int[] input = {1, 0, 2};
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(input));
    }
}