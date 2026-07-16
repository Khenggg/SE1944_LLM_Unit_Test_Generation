package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;

public class ORDER_BY_POINTS_GPTTest {

    @Test(timeout = 5000)
    public void testOrderByPointsWithPositiveNumbers() {
        Integer[] input = {1, 11, 2, 21, 3};
        Integer[] expected = {1, 2, 3, 11, 21};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithNegativeNumbers() {
        Integer[] input = {-1, -11, -2, -21, -3};
        Integer[] expected = {-3, -2, -1, -11, -21};
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

    @Test(timeout = 5000)
    public void testOrderByPointsWithAllSameDigits() {
        Integer[] input = {22, 2, 11, 20, 1};
        Integer[] expected = {1, 2, 11, 20, 22};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithZeros() {
        Integer[] input = {0, 0, 0, 0};
        Integer[] expected = {0, 0, 0, 0};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithNegativeAndPositiveZeros() {
        Integer[] input = {0, -0, 0, -0};
        Integer[] expected = {0, 0, -0, -0};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithLargeNumbers() {
        Integer[] input = {1000, 100, 10, 1};
        Integer[] expected = {1, 10, 100, 1000};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithNegativeLargeNumbers() {
        Integer[] input = {-1000, -100, -10, -1};
        Integer[] expected = {-1, -10, -100, -1000};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithMixedLargeNumbers() {
        Integer[] input = {1000, -100, 10, -1};
        Integer[] expected = {-1, 10, -100, 1000};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }
}