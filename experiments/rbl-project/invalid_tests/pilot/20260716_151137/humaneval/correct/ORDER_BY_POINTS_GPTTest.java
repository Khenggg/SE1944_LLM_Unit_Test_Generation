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
        Integer[] expected = {-1, -2, -3, -11, -21};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithMixedNumbers() {
        Integer[] input = {1, -1, 11, -11, 2, -2};
        Integer[] expected = {-1, -2, 1, 11, 2};
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
    public void testOrderByPointsWithZero() {
        Integer[] input = {0, 10, -10};
        Integer[] expected = {0, -10, 10};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithSameDigitSum() {
        Integer[] input = {12, 21, 3, 30, 102};
        Integer[] expected = {3, 12, 21, 30, 102};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithLargeNumbers() {
        Integer[] input = {1000, 100, 10, 1, 0};
        Integer[] expected = {0, 1, 10, 100, 1000};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }

    @Test(timeout = 5000)
    public void testOrderByPointsWithNegativeAndPositiveSameDigitSum() {
        Integer[] input = {-12, 21, -3, 30, 102};
        Integer[] expected = {-3, -12, 21, 30, 102};
        Assert.assertArrayEquals(expected, ORDER_BY_POINTS.order_by_points(input));
    }
}