package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class COUNT_UP_TO_GPTTest {

    @Test(timeout = 5000)
    public void testCountUpToZero() {
        List<Integer> result = COUNT_UP_TO.count_up_to(0);
        Assert.assertEquals("Expected empty list for input 0", Arrays.asList(), result);
    }

    @Test(timeout = 5000)
    public void testCountUpToOne() {
        List<Integer> result = COUNT_UP_TO.count_up_to(1);
        Assert.assertEquals("Expected empty list for input 1", Arrays.asList(), result);
    }

    @Test(timeout = 5000)
    public void testCountUpToTwo() {
        List<Integer> result = COUNT_UP_TO.count_up_to(2);
        Assert.assertEquals("Expected empty list for input 2", Arrays.asList(), result);
    }

    @Test(timeout = 5000)
    public void testCountUpToThree() {
        List<Integer> result = COUNT_UP_TO.count_up_to(3);
        Assert.assertEquals("Expected list with 2 for input 3", Arrays.asList(2), result);
    }

    @Test(timeout = 5000)
    public void testCountUpToFive() {
        List<Integer> result = COUNT_UP_TO.count_up_to(5);
        Assert.assertEquals("Expected list with 2 and 3 for input 5", Arrays.asList(2, 3), result);
    }

    @Test(timeout = 5000)
    public void testCountUpToEleven() {
        List<Integer> result = COUNT_UP_TO.count_up_to(11);
        Assert.assertEquals("Expected list with 2, 3, 5, 7 for input 11", Arrays.asList(2, 3, 5, 7), result);
    }

    @Test(timeout = 5000)
    public void testCountUpToTwenty() {
        List<Integer> result = COUNT_UP_TO.count_up_to(20);
        Assert.assertEquals("Expected list with primes less than 20", Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19), result);
    }

    @Test(timeout = 5000)
    public void testCountUpToNegative() {
        List<Integer> result = COUNT_UP_TO.count_up_to(-5);
        Assert.assertEquals("Expected empty list for negative input", Arrays.asList(), result);
    }

    @Test(timeout = 5000)
    public void testCountUpToLargeNumber() {
        List<Integer> result = COUNT_UP_TO.count_up_to(100);
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        Assert.assertEquals("Expected list of primes less than 100", expected, result);
    }
}
