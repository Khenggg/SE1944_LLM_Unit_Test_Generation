package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class FIND_CLOSEST_ELEMENTS_GPTTest {

    @Test(timeout = 5000)
    public void testFindClosestElementsWithPositiveNumbers() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0};
        double[] expected = {1.0, 2.0};
        Assert.assertArrayEquals(expected, FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers), 0.0001);
    }

    @Test(timeout = 5000)
    public void testFindClosestElementsWithNegativeNumbers() {
        double[] numbers = {-1.0, -2.0, -3.0, -4.0};
        double[] expected = {-2.0, -1.0}; // Corrected expected values
        Assert.assertArrayEquals(expected, FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers), 0.0001);
    }

    @Test(timeout = 5000)
    public void testFindClosestElementsWithMixedNumbers() {
        double[] numbers = {-1.0, 2.0, 3.0, -4.0};
        double[] expected = {2.0, 3.0};
        Assert.assertArrayEquals(expected, FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers), 0.0001);
    }

    @Test(timeout = 5000)
    public void testFindClosestElementsWithIdenticalNumbers() {
        double[] numbers = {5.0, 5.0, 5.0};
        double[] expected = {5.0, 5.0};
        Assert.assertArrayEquals(expected, FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers), 0.0001);
    }

    @Test(timeout = 5000)
    public void testFindClosestElementsWithTwoElements() {
        double[] numbers = {1.0, 2.0};
        double[] expected = {1.0, 2.0};
        Assert.assertArrayEquals(expected, FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers), 0.0001);
    }

    @Test(timeout = 5000)
    public void testFindClosestElementsWithTwoIdenticalElements() {
        double[] numbers = {1.0, 1.0};
        double[] expected = {1.0, 1.0};
        Assert.assertArrayEquals(expected, FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers), 0.0001);
    }

    @Test(timeout = 5000)
    public void testFindClosestElementsWithLargeRange() {
        double[] numbers = {1.0, 1000.0, 1001.0};
        double[] expected = {1000.0, 1001.0};
        Assert.assertArrayEquals(expected, FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers), 0.0001);
    }

    @Test(timeout = 5000)
    public void testFindClosestElementsWithEmptyArray() {
        double[] numbers = {};
        double[] expected = {0.0, 0.0}; // Assuming the method should return default values
        Assert.assertArrayEquals(expected, FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers), 0.0001);
    }

    @Test(timeout = 5000)
    public void testFindClosestElementsWithSingleElement() {
        double[] numbers = {5.0};
        double[] expected = {0.0, 0.0}; // Assuming the method should return default values
        Assert.assertArrayEquals(expected, FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers), 0.0001);
    }

    @Test(timeout = 5000)
    public void testFindClosestElementsWithVeryCloseNumbers() {
        double[] numbers = {1.0001, 1.0002, 1.0003};
        double[] expected = {1.0001, 1.0002};
        Assert.assertArrayEquals(expected, FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers), 0.0001);
    }
}