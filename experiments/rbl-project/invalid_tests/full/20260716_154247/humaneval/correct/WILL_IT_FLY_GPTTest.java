package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class WILL_IT_FLY_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyArray() {
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{}, 5));
    }

    @Test(timeout = 5000)
    public void testSingleElementLessThanWeight() {
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{3}, 5));
    }

    @Test(timeout = 5000)
    public void testSingleElementEqualToWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{5}, 5));
    }

    @Test(timeout = 5000)
    public void testSingleElementGreaterThanWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{6}, 5));
    }

    @Test(timeout = 5000)
    public void testTwoElementUnbalanced() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{1, 2}, 5));
    }

    @Test(timeout = 5000)
    public void testTwoElementBalancedUnderWeight() {
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{2, 2}, 5));
    }

    @Test(timeout = 5000)
    public void testTwoElementBalancedEqualWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{2, 2}, 4));
    }

    @Test(timeout = 5000)
    public void testTwoElementBalancedOverWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{2, 2}, 3));
    }

    @Test(timeout = 5000)
    public void testThreeElementBalancedUnderWeight() {
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{3, 2, 3}, 9));
    }

    @Test(timeout = 5000)
    public void testThreeElementBalancedEqualWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{3, 2, 3}, 8));
    }

    @Test(timeout = 5000)
    public void testThreeElementBalancedOverWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{3, 2, 3}, 7));
    }

    @Test(timeout = 5000)
    public void testThreeElementUnbalanced() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{3, 2, 4}, 10));
    }

    @Test(timeout = 5000)
    public void testLargeBalancedUnderWeight() {
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{1, 2, 1}, 5));
    }

    @Test(timeout = 5000)
    public void testLargeBalancedEqualWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{1, 2, 1}, 4));
    }

    @Test(timeout = 5000)
    public void testLargeBalancedOverWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{1, 2, 1}, 3));
    }

    @Test(timeout = 5000)
    public void testLargeUnbalanced() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{1, 2, 3}, 10));
    }

    @Test(timeout = 5000)
    public void testNegativeElements() {
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{-1, -2, -1}, 0));
    }

    @Test(timeout = 5000)
    public void testNegativeElementsOverWeight() {
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{-1, -2, -1}, -1));
    }

    @Test(timeout = 5000)
    public void testMixedElements() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{1, 2, 1, 3}, 10));
    }
}