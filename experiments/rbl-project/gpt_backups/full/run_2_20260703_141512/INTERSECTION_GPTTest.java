package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class INTERSECTION_GPTTest {

    @Test(timeout = 5000)
    public void testIntersectionPrimeLength() {
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{1, 2}, new int[]{2, 3}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{-1, 1}, new int[]{0, 4}));
        Assert.assertEquals("YES", INTERSECTION.intersection(new int[]{-3, -1}, new int[]{-5, 5}));
        Assert.assertEquals("YES", INTERSECTION.intersection(new int[]{1, 5}, new int[]{3, 7}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{1, 1}, new int[]{1, 1}));
    }

    @Test(timeout = 5000)
    public void testNoIntersection() {
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{1, 2}, new int[]{3, 4}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{-5, -3}, new int[]{-2, 0}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{5, 10}, new int[]{1, 4}));
    }

    @Test(timeout = 5000)
    public void testEdgeCases() {
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{1, 2}, new int[]{2, 2}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{2, 2}, new int[]{1, 1}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{0, 0}, new int[]{0, 0}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{-1, 0}, new int[]{1, 2}));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testNegativeIntervals() {
        Assert.assertEquals("YES", INTERSECTION.intersection(new int[]{-5, -3}, new int[]{-4, -2}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{-10, -5}, new int[]{-4, -1}));
    }

    @Test(timeout = 5000)
    public void testLargeIntervals() {
        Assert.assertEquals("YES", INTERSECTION.intersection(new int[]{1000000, 1000005}, new int[]{1000003, 1000010}));
        Assert.assertEquals("NO", INTERSECTION.intersection(new int[]{1000000, 1000002}, new int[]{1000003, 1000010}));
    }
}