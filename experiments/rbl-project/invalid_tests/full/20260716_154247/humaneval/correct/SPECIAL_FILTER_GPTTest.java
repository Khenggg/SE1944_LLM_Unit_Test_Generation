package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class SPECIAL_FILTER_GPTTest {

    @Test(timeout = 5000)
    public void testSpecialFilterWithMixedValues() {
        int[] input = {15, -73, 14, -15};
        int expected = 1;
        int actual = SPECIAL_FILTER.special_filter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSpecialFilterWithMultipleValidNumbers() {
        int[] input = {33, -2, -3, 45, 21, 109};
        int expected = 2;
        int actual = SPECIAL_FILTER.special_filter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSpecialFilterWithNoValidNumbers() {
        int[] input = {5, 7, 8, 9, 10};
        int expected = 0;
        int actual = SPECIAL_FILTER.special_filter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSpecialFilterWithAllNegativeNumbers() {
        int[] input = {-1, -2, -3, -4, -5};
        int expected = 0;
        int actual = SPECIAL_FILTER.special_filter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSpecialFilterWithAllValidNumbers() {
        int[] input = {11, 13, 15, 17, 19, 31, 33, 35, 37, 39};
        int expected = 10;
        int actual = SPECIAL_FILTER.special_filter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSpecialFilterWithBoundaryValues() {
        int[] input = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int expected = 5; // 11, 13, 15, 17, 19
        int actual = SPECIAL_FILTER.special_filter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSpecialFilterWithSingleElementGreaterThanTen() {
        int[] input = {11};
        int expected = 1; // 11 is valid
        int actual = SPECIAL_FILTER.special_filter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSpecialFilterWithSingleElementNotGreaterThanTen() {
        int[] input = {9};
        int expected = 0; // 9 is not valid
        int actual = SPECIAL_FILTER.special_filter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSpecialFilterWithEmptyArray() {
        int[] input = {};
        int expected = 0; // No elements to evaluate
        int actual = SPECIAL_FILTER.special_filter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSpecialFilterWithLargeNumbers() {
        int[] input = {1001, 2002, 3003, 4004, 5005};
        int expected = 3; // Only 1001, 3003, and 5005 are valid
        int actual = SPECIAL_FILTER.special_filter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testSpecialFilterWithNumbersEndingInEvenDigits() {
        int[] input = {21, 32, 43, 54, 65, 76, 87, 98};
        int expected = 4; // 21, 43, 65, 87 are valid
        int actual = SPECIAL_FILTER.special_filter(input);
        Assert.assertEquals(expected, actual);
    }
}