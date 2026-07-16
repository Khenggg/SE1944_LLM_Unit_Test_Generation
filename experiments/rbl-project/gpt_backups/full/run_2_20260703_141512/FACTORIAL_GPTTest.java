package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;

public class FACTORIAL_GPTTest {

    @Test(timeout = 5000)
    public void testFactorialWithZero() {
        ArrayList<Integer> result = FACTORIAL.factorial(0);
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testFactorialWithOne() {
        ArrayList<Integer> result = FACTORIAL.factorial(1);
        Assert.assertEquals(Arrays.asList(1), result);
    }

    @Test(timeout = 5000)
    public void testFactorialWithTwo() {
        ArrayList<Integer> result = FACTORIAL.factorial(2);
        Assert.assertEquals(Arrays.asList(1, 2), result);
    }

    @Test(timeout = 5000)
    public void testFactorialWithThree() {
        ArrayList<Integer> result = FACTORIAL.factorial(3);
        Assert.assertEquals(Arrays.asList(1, 2, 6), result);
    }

    @Test(timeout = 5000)
    public void testFactorialWithFour() {
        ArrayList<Integer> result = FACTORIAL.factorial(4);
        Assert.assertEquals(Arrays.asList(1, 2, 6, 24), result);
    }

    @Test(timeout = 5000)
    public void testFactorialWithFive() {
        ArrayList<Integer> result = FACTORIAL.factorial(5);
        Assert.assertEquals(Arrays.asList(1, 2, 6, 24, 15), result);
    }

    @Test(timeout = 5000)
    public void testFactorialWithNegativeInput() {
        ArrayList<Integer> result = FACTORIAL.factorial(-5);
        Assert.assertTrue(result.isEmpty());
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testFactorialWithLargeInput() {
        ArrayList<Integer> result = FACTORIAL.factorial(10);
        Assert.assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 21, 40320, 36, 3628800), result);
    }

    @Test(timeout = 5000)
    public void testFactorialWithEvenInput() {
        ArrayList<Integer> result = FACTORIAL.factorial(6);
        Assert.assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720), result);
    }

    @Test(timeout = 5000)
    public void testFactorialWithOddInput() {
        ArrayList<Integer> result = FACTORIAL.factorial(7);
        Assert.assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 28), result);
    }
}