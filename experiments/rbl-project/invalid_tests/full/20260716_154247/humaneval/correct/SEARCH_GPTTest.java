package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class SEARCH_GPTTest {

    @Test(timeout = 5000)
    public void testExample1() {
        int[] input = {4, 1, 2, 2, 3, 1};
        int expected = 2;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testExample2() {
        int[] input = {1, 2, 2, 3, 3, 3, 4, 4, 4};
        int expected = 3;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testExample3() {
        int[] input = {5, 5, 4, 4, 4};
        int expected = -1;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSingleElementGreaterThanOne() {
        int[] input = {3};
        int expected = -1;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSingleElementEqualToOne() {
        int[] input = {1};
        int expected = 1;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testMultipleSameElements() {
        int[] input = {2, 2, 2, 2};
        int expected = 2;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testNoValidElement() {
        int[] input = {1, 1, 2, 2, 3};
        int expected = -1;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testAllElementsSameFrequency() {
        int[] input = {1, 2, 2, 3, 3};
        int expected = 2;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testLargeNumbers() {
        int[] input = {1000, 1000, 999, 999, 999};
        int expected = 999;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testBoundaryValues() {
        int[] input = {1, 1, 2, 2, 3, 3, 4, 4, 4, 4};
        int expected = 4;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testHighFrequencyLowValue() {
        int[] input = {1, 1, 1, 1, 1, 2, 2, 3};
        int expected = 1;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testHighValueLowFrequency() {
        int[] input = {10, 10, 10, 1, 1, 1};
        int expected = -1;
        Assert.assertEquals(expected, SEARCH.search(input));
    }
}