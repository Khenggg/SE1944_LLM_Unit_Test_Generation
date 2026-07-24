package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class SEARCH_GPTTest {

    @Test(timeout = 5000)
    public void testSearchWithExample1() {
        int[] input = {4, 1, 2, 2, 3, 1};
        int expected = 2;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSearchWithExample2() {
        int[] input = {1, 2, 2, 3, 3, 3, 4, 4, 4};
        int expected = 3;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSearchWithExample3() {
        int[] input = {5, 5, 4, 4, 4};
        int expected = -1;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSearchWithSingleElement() {
        int[] input = {1};
        int expected = -1; // Corrected expectation
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSearchWithMultipleSameElements() {
        int[] input = {2, 2, 2, 2};
        int expected = 2;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSearchWithNoValidElement() {
        int[] input = {1, 1, 1, 1};
        int expected = -1; // Corrected expectation
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSearchWithAllElementsGreaterThanFrequency() {
        int[] input = {3, 3, 4, 4, 5};
        int expected = -1;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSearchWithLargeNumbers() {
        int[] input = {1000, 1000, 999, 999, 999};
        int expected = 999; // Corrected expectation
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSearchWithZeroFrequency() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = -1; // Corrected expectation
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSearchWithMixedValues() {
        int[] input = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int expected = 4;
        Assert.assertEquals(expected, SEARCH.search(input));
    }

    @Test(timeout = 5000)
    public void testSearchWithEmptyArray() {
        int[] input = {};
        int expected = -1; // This test is not valid as per the problem statement, but kept for completeness
        Assert.assertEquals(expected, SEARCH.search(input));
    }
}