package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class SPECIAL_FILTER_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyArray() {
        int[] nums = {};
        Assert.assertEquals(0, SPECIAL_FILTER.special_filter(nums));
    }

    @Test(timeout = 5000)
    public void testAllElementsLessThanOrEqualToTen() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertEquals(0, SPECIAL_FILTER.special_filter(nums));
    }

    @Test(timeout = 5000)
    public void testSingleElementGreaterThanTenWithOddDigits() {
        int[] nums = {13};
        Assert.assertEquals(1, SPECIAL_FILTER.special_filter(nums));
    }

    @Test(timeout = 5000)
    public void testSingleElementGreaterThanTenWithEvenDigits() {
        int[] nums = {12};
        Assert.assertEquals(0, SPECIAL_FILTER.special_filter(nums));
    }

    @Test(timeout = 5000)
    public void testMultipleElementsWithMixedConditions() {
        int[] nums = {15, -73, 14, -15, 33, 21, 109};
        Assert.assertEquals(3, SPECIAL_FILTER.special_filter(nums));
    }

    @Test(timeout = 5000)
    public void testNegativeNumbers() {
        int[] nums = {-11, -13, -15, -17};
        Assert.assertEquals(0, SPECIAL_FILTER.special_filter(nums));
    }

    @Test(timeout = 5000)
    public void testBoundaryValues() {
        int[] nums = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Assert.assertEquals(4, SPECIAL_FILTER.special_filter(nums)); // 11, 13, 15, 19
    }

    @Test(timeout = 5000)
    public void testAllOddFirstAndLastDigits() {
        int[] nums = {31, 53, 75, 97, 111};
        Assert.assertEquals(5, SPECIAL_FILTER.special_filter(nums));
    }

    @Test(timeout = 5000)
    public void testAllEvenFirstAndLastDigits() {
        int[] nums = {20, 42, 64, 86, 80};
        Assert.assertEquals(0, SPECIAL_FILTER.special_filter(nums));
    }

    @Test(timeout = 5000)
    public void testMixedOddAndEvenDigits() {
        int[] nums = {21, 34, 45, 56, 67, 78, 89, 90};
        Assert.assertEquals(3, SPECIAL_FILTER.special_filter(nums)); // 21, 45, 89
    }

    @Test(timeout = 5000)
    public void testLargeNumbers() {
        int[] nums = {1001, 2002, 3003, 4004, 5005};
        Assert.assertEquals(3, SPECIAL_FILTER.special_filter(nums)); // 1001, 3003, 5005
    }

    @Test(timeout = 5000)
    public void testSingleLargeNumber() {
        int[] nums = {10001};
        Assert.assertEquals(1, SPECIAL_FILTER.special_filter(nums)); // 10001
    }

    @Test(timeout = 5000)
    public void testSingleNumberGreaterThanTenWithOddFirstEvenLast() {
        int[] nums = {21};
        Assert.assertEquals(0, SPECIAL_FILTER.special_filter(nums)); // 21 (last digit is even)
    }

    @Test(timeout = 5000)
    public void testSingleNumberGreaterThanTenWithEvenFirstOddLast() {
        int[] nums = {12};
        Assert.assertEquals(0, SPECIAL_FILTER.special_filter(nums)); // 12 (first digit is even)
    }
}