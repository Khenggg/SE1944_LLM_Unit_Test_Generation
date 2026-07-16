package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;

public class GET_ODD_COLLATZ_GPTTest {

    @Test(timeout = 5000)
    public void testGetOddCollatzWithOddInput() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 5));
        Assert.assertEquals(expected, GET_ODD_COLLATZ.get_odd_collatz(5));
    }

    @Test(timeout = 5000)
    public void testGetOddCollatzWithEvenInput() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 7));
        Assert.assertEquals(expected, GET_ODD_COLLATZ.get_odd_collatz(6));
    }

    @Test(timeout = 5000)
    public void testGetOddCollatzWithInputOne() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1));
        Assert.assertEquals(expected, GET_ODD_COLLATZ.get_odd_collatz(1));
    }

    @Test(timeout = 5000)
    public void testGetOddCollatzWithLargeOddInput() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 7, 21));
        Assert.assertEquals(expected, GET_ODD_COLLATZ.get_odd_collatz(21));
    }

    @Test(timeout = 5000)
    public void testGetOddCollatzWithLargeEvenInput() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 17));
        Assert.assertEquals(expected, GET_ODD_COLLATZ.get_odd_collatz(18));
    }

    @Test(timeout = 5000)
    public void testGetOddCollatzWithInputTwo() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1));
        Assert.assertEquals(expected, GET_ODD_COLLATZ.get_odd_collatz(2));
    }

    @Test(timeout = 5000)
    public void testGetOddCollatzWithInputThree() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3));
        Assert.assertEquals(expected, GET_ODD_COLLATZ.get_odd_collatz(3));
    }

    @Test(timeout = 5000)
    public void testGetOddCollatzWithInputFour() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1));
        Assert.assertEquals(expected, GET_ODD_COLLATZ.get_odd_collatz(4));
    }

    @Test(timeout = 5000)
    public void testGetOddCollatzWithInputZero() {
        ArrayList<Integer> expected = new ArrayList<>();
        Assert.assertEquals(expected, GET_ODD_COLLATZ.get_odd_collatz(0));
    }

    @Test(timeout = 5000)
    public void testGetOddCollatzWithNegativeInput() {
        ArrayList<Integer> expected = new ArrayList<>();
        Assert.assertEquals(expected, GET_ODD_COLLATZ.get_odd_collatz(-5));
    }
}