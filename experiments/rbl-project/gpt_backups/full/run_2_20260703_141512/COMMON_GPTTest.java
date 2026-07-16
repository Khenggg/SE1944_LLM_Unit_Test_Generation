package humaneval.correct;

import java.util.*;
import org.junit.Test;
import org.junit.Assert;

public class COMMON_GPTTest {

    @Test(timeout = 5000)
    public void testCommonWithUniqueElements() {
        int[] l1 = {1, 4, 3, 34, 653, 2, 5};
        int[] l2 = {5, 7, 1, 5, 9, 653, 121};
        int[] expected = {1, 5, 653};
        Assert.assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test(timeout = 5000)
    public void testCommonWithPartialOverlap() {
        int[] l1 = {5, 3, 2, 8};
        int[] l2 = {3, 2};
        int[] expected = {2, 3};
        Assert.assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test(timeout = 5000)
    public void testCommonWithNoCommonElements() {
        int[] l1 = {1, 2, 3};
        int[] l2 = {4, 5, 6};
        int[] expected = {};
        Assert.assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test(timeout = 5000)
    public void testCommonWithEmptyFirstList() {
        int[] l1 = {};
        int[] l2 = {1, 2, 3};
        int[] expected = {};
        Assert.assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test(timeout = 5000)
    public void testCommonWithEmptySecondList() {
        int[] l1 = {1, 2, 3};
        int[] l2 = {};
        int[] expected = {};
        Assert.assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test(timeout = 5000)
    public void testCommonWithBothListsEmpty() {
        int[] l1 = {};
        int[] l2 = {};
        int[] expected = {};
        Assert.assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test(timeout = 5000)
    public void testCommonWithDuplicatesInFirstList() {
        int[] l1 = {1, 2, 2, 3};
        int[] l2 = {2, 3, 3};
        int[] expected = {2, 3};
        Assert.assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test(timeout = 5000)
    public void testCommonWithDuplicatesInSecondList() {
        int[] l1 = {2, 3, 3};
        int[] l2 = {1, 2, 2, 3};
        int[] expected = {2, 3};
        Assert.assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test(timeout = 5000)
    public void testCommonWithAllElementsCommon() {
        int[] l1 = {1, 2, 3};
        int[] l2 = {1, 2, 3};
        int[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test(timeout = 5000)
    public void testCommonWithNegativeAndPositiveNumbers() {
        int[] l1 = {-1, -2, 0, 1, 2};
        int[] l2 = {0, 1, 3, -1};
        int[] expected = {-1, 0, 1};
        Assert.assertArrayEquals(expected, COMMON.common(l1, l2));
    }

    @Test(timeout = 5000)
    public void testCommonWithLargeNumbers() {
        int[] l1 = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        int[] l2 = {Integer.MIN_VALUE, 0, -1};
        int[] expected = {Integer.MIN_VALUE, 0};
        Assert.assertArrayEquals(expected, COMMON.common(l1, l2));
    }
}