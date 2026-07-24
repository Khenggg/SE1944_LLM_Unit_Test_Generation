package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class MIN_SUBARRAY_SUM_GPTTest {

    @Test(timeout = 5000)
    public void testPositiveNumbers() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(2L);
        nums.add(3L);
        nums.add(4L);
        nums.add(1L);
        nums.add(2L);
        nums.add(4L);
        Assert.assertEquals(1L, MIN_SUBARRAY_SUM.min_subarray_sum(nums));
    }

    @Test(timeout = 5000)
    public void testAllNegativeNumbers() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(-1L);
        nums.add(-2L);
        nums.add(-3L);
        Assert.assertEquals(-6L, MIN_SUBARRAY_SUM.min_subarray_sum(nums));
    }

    @Test(timeout = 5000)
    public void testMixedNumbers() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(1L);
        nums.add(-2L);
        nums.add(3L);
        nums.add(-4L);
        nums.add(5L);
        Assert.assertEquals(-4L, MIN_SUBARRAY_SUM.min_subarray_sum(nums));
    }

    @Test(timeout = 5000)
    public void testSingleElementPositive() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(5L);
        Assert.assertEquals(5L, MIN_SUBARRAY_SUM.min_subarray_sum(nums));
    }

    @Test(timeout = 5000)
    public void testSingleElementNegative() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(-5L);
        Assert.assertEquals(-5L, MIN_SUBARRAY_SUM.min_subarray_sum(nums));
    }

    @Test(timeout = 5000)
    public void testAllZeros() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(0L);
        nums.add(0L);
        nums.add(0L);
        Assert.assertEquals(0L, MIN_SUBARRAY_SUM.min_subarray_sum(nums));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testLargeNumbers() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(Long.MAX_VALUE);
        nums.add(Long.MIN_VALUE);
        Assert.assertEquals(Long.MIN_VALUE, MIN_SUBARRAY_SUM.min_subarray_sum(nums));
    }

    @Test(timeout = 5000)
    public void testEmptyArray() {
        ArrayList<Long> nums = new ArrayList<>();
        try {
            MIN_SUBARRAY_SUM.min_subarray_sum(nums);
            Assert.fail("Expected an exception for empty array");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }
    }

    @Test(timeout = 5000)
    public void testTwoElementsPositive() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(1L);
        nums.add(2L);
        Assert.assertEquals(1L, MIN_SUBARRAY_SUM.min_subarray_sum(nums));
    }

    @Test(timeout = 5000)
    public void testTwoElementsNegative() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(-1L);
        nums.add(-2L);
        Assert.assertEquals(-3L, MIN_SUBARRAY_SUM.min_subarray_sum(nums));
    }

    @Test(timeout = 5000)
    public void testTwoElementsMixed() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(1L);
        nums.add(-2L);
        Assert.assertEquals(-2L, MIN_SUBARRAY_SUM.min_subarray_sum(nums));
    }
}