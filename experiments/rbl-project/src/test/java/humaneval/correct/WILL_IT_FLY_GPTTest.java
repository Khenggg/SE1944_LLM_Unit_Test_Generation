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
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{5}, 5));
    }

    @Test(timeout = 5000)
    public void testSingleElementGreaterThanWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{6}, 5));
    }

    @Test(timeout = 5000)
    public void testTwoElementsUnbalanced() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{1, 2}, 5));
    }

    @Test(timeout = 5000)
    public void testTwoElementsBalancedUnderWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{2, 2}, 5));
    }

    @Test(timeout = 5000)
    public void testTwoElementsBalancedEqualWeight() {
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{2, 2}, 4));
    }

    @Test(timeout = 5000)
    public void testTwoElementsBalancedOverWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{2, 2}, 3));
    }

    @Test(timeout = 5000)
    public void testThreeElementsBalancedUnderWeight() {
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{3, 2, 3}, 9));
    }

    @Test(timeout = 5000)
    public void testThreeElementsBalancedEqualWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{3, 2, 3}, 8));
    }

    @Test(timeout = 5000)
    public void testThreeElementsBalancedOverWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{3, 2, 3}, 7));
    }

    @Test(timeout = 5000)
    public void testThreeElementsUnbalanced() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{3, 2, 4}, 9));
    }

    @Test(timeout = 5000)
    public void testLargeBalancedArrayUnderWeight() {
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{1, 2, 3, 2, 1}, 10));
    }

    @Test(timeout = 5000)
    public void testLargeBalancedArrayEqualWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{1, 2, 3, 2, 1}, 9));
    }

    @Test(timeout = 5000)
    public void testLargeBalancedArrayOverWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{1, 2, 3, 2, 1}, 8));
    }

    @Test(timeout = 5000)
    public void testLargeUnbalancedArray() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{1, 2, 3, 4, 5}, 20));
    }

    @Test(timeout = 5000)
    public void testNegativeElementsBalancedUnderWeight() {
        Assert.assertTrue(WILL_IT_FLY.will_it_fly(new int[]{-1, -2, -1}, 5));
    }

    @Test(timeout = 5000)
    public void testNegativeElementsBalancedEqualWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{-1, -2, -1}, 4));
    }

    @Test(timeout = 5000)
    public void testNegativeElementsBalancedOverWeight() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{-1, -2, -1}, 3));
    }

    @Test(timeout = 5000)
    public void testNegativeElementsUnbalanced() {
        Assert.assertFalse(WILL_IT_FLY.will_it_fly(new int[]{-1, -2, -3}, 5));
    }
}