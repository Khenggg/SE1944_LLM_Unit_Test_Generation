package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class PROD_SIGNS_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyArray() {
        int[] arr = {};
        int expected = -10;
        int actual = PROD_SIGNS.prod_signs(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testArrayWithZero() {
        int[] arr = {0, 1, 2};
        int expected = 0;
        int actual = PROD_SIGNS.prod_signs(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testArrayWithPositiveNumbers() {
        int[] arr = {1, 2, 3};
        int expected = 6; // 1 + 2 + 3 = 6, product of signs = 1
        int actual = PROD_SIGNS.prod_signs(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testArrayWithNegativeNumbers() {
        int[] arr = {-1, -2, -3};
        int expected = -6; // |-1| + |-2| + |-3| = 6, product of signs = -1
        int actual = PROD_SIGNS.prod_signs(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testArrayWithMixedNumbers() {
        int[] arr = {1, -2, 3, -4};
        int expected = -6; // |1| + |-2| + |3| + |-4| = 10, product of signs = 1 * -1 * 1 * -1 = 1
        int actual = PROD_SIGNS.prod_signs(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testArrayWithMultipleZeros() {
        int[] arr = {0, 0, 0};
        int expected = 0; // product of signs = 0
        int actual = PROD_SIGNS.prod_signs(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testArrayWithSingleNegativeNumber() {
        int[] arr = {-5};
        int expected = -5; // |-5| = 5, product of signs = -1
        int actual = PROD_SIGNS.prod_signs(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testArrayWithSinglePositiveNumber() {
        int[] arr = {5};
        int expected = 5; // |5| = 5, product of signs = 1
        int actual = PROD_SIGNS.prod_signs(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testArrayWithAllNegativeAndZero() {
        int[] arr = {-1, -2, 0};
        int expected = 0; // product of signs = 0
        int actual = PROD_SIGNS.prod_signs(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 5000)
    public void testArrayWithAllPositiveAndNegative() {
        int[] arr = {1, -1, 2, -2};
        int expected = -6; // |1| + |-1| + |2| + |-2| = 6, product of signs = 1 * -1 * 1 * -1 = 1
        int actual = PROD_SIGNS.prod_signs(arr);
        Assert.assertEquals(expected, actual);
    }
}