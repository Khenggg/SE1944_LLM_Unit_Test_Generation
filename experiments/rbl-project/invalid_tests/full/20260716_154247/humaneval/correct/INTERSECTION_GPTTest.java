package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class INTERSECTION_GPTTest {

    @Test(timeout = 5000)
    public void testIntersectionPrimeLength() {
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{1, 2}, new int[]{2, 3}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{-1, 1}, new int[]{0, 4}));
        Assert.assertEquals("YES", INTERSECTION.intersection(new int[]{-3, -1}, new int[]{-5, 5}));
        Assert.assertEquals("YES", INTERSECTION.intersection(new int[]{5, 10}, new int[]{8, 12}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{1, 5}, new int[]{6, 10}));
    }

    @Test(timeout = 5000)
    public void testIntersectionNoOverlap() {
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{1, 2}, new int[]{3, 4}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{-5, -3}, new int[]{-2, 0}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{10, 15}, new int[]{5, 9}));
    }

    @Test(timeout = 5000)
    public void testIntersectionZeroLength() {
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{1, 1}, new int[]{1, 1}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{2, 2}, new int[]{2, 2}));
    }

    @Test(timeout = 5000)
    public void testIntersectionNegativeLength() {
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{3, 2}, new int[]{1, 4}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{-1, -2}, new int[]{-3, -4}));
    }

    @Test(timeout = 5000)
    public void testIntersectionEdgeCases() {
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE}));
        Assert.assertEquals("YES", INTERSECTION.intersection(new int[]{2, 5}, new int[]{3, 4}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{Integer.MAX_VALUE - 1, Integer.MAX_VALUE}, new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}));
    }
}