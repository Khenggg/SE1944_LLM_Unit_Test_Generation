package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;

public class ORDER_BY_POINTS_GPTTest {

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testOrderByPointsWithPositiveNumbers() {
        Integer[] input = {1, 11, 2, 20};
        Integer[] expected = {1, 2, 11, 20};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testOrderByPointsWithNegativeNumbers() {
        Integer[] input = {-1, -11, -2, -20};
        Integer[] expected = {-1, -2, -11, -20};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithMixedNumbers() {
        Integer[] input = {1, -1, 11, -11, -12};
        Integer[] expected = {-1, -11, 1, -12, 11};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithSingleElement() {
        Integer[] input = {5};
        Integer[] expected = {5};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testOrderByPointsWithSameDigitSum() {
        Integer[] input = {10, 1, 2, 20};
        Integer[] expected = {1, 2, 10, 20};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithAllZeros() {
        Integer[] input = {0, 0, 0};
        Integer[] expected = {0, 0, 0};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testOrderByPointsWithLargeNumbers() {
        Integer[] input = {1000, 100, 10, 1};
        Integer[] expected = {1, 10, 100, 1000};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithNegativeAndPositiveMixed() {
        Integer[] input = {3, -3, 30, -30, 300, -300};
        Integer[] expected = {-3, -30, -300, 3, 30, 300};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithDuplicates() {
        Integer[] input = {1, 1, 2, 2, 3, 3};
        Integer[] expected = {1, 1, 2, 2, 3, 3};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }
}