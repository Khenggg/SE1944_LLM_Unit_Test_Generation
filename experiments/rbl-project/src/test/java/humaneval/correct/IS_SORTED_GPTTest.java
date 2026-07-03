package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class IS_SORTED_GPTTest {

    @Test(timeout = 5000)
    public void testSingleElement() {
        Assert.assertTrue(IS_SORTED.is_sorted(new int[]{5}));
    }

    @Test(timeout = 5000)
    public void testSortedArray() {
        Assert.assertTrue(IS_SORTED.is_sorted(new int[]{1, 2, 3, 4, 5}));
        Assert.assertTrue(IS_SORTED.is_sorted(new int[]{1, 2, 3, 4, 5, 6}));
        Assert.assertTrue(IS_SORTED.is_sorted(new int[]{1, 2, 2, 3, 3, 4}));
    }

    @Test(timeout = 5000)
    public void testUnsortedArray() {
        Assert.assertFalse(IS_SORTED.is_sorted(new int[]{1, 3, 2, 4, 5}));
        Assert.assertFalse(IS_SORTED.is_sorted(new int[]{1, 3, 2, 4, 5, 6, 7}));
    }

    @Test(timeout = 5000)
    public void testArrayWithDuplicates() {
        Assert.assertFalse(IS_SORTED.is_sorted(new int[]{1, 2, 2, 2, 3, 4}));
        Assert.assertFalse(IS_SORTED.is_sorted(new int[]{1, 2, 3, 4, 5, 5}));
        Assert.assertFalse(IS_SORTED.is_sorted(new int[]{1, 1, 1, 2, 3}));
    }

    @Test(timeout = 5000)
    public void testEmptyArray() {
        Assert.assertTrue(IS_SORTED.is_sorted(new int[]{}));
    }

    @Test(timeout = 5000)
    public void testArrayWithOneDuplicate() {
        Assert.assertTrue(IS_SORTED.is_sorted(new int[]{1, 2, 2, 3}));
        Assert.assertTrue(IS_SORTED.is_sorted(new int[]{0, 1, 1, 2}));
    }

    @Test(timeout = 5000)
    public void testArrayWithTwoDuplicates() {
        Assert.assertFalse(IS_SORTED.is_sorted(new int[]{1, 2, 2, 2, 3}));
        Assert.assertFalse(IS_SORTED.is_sorted(new int[]{1, 1, 2, 2, 3}));
    }

    @Test(timeout = 5000)
    public void testLargeArray() {
        Assert.assertTrue(IS_SORTED.is_sorted(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
        Assert.assertFalse(IS_SORTED.is_sorted(new int[]{0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9}));
    }
}