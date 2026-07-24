package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class RESCALE_TO_UNIT_GPTTest {

    @Test(timeout = 5000)
    public void testRescaleToUnitWithPositiveNumbers() {
        double[] input = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] expected = {0.0, 0.25, 0.5, 0.75, 1.0};
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @Test(timeout = 5000)
    public void testRescaleToUnitWithNegativeNumbers() {
        double[] input = {-5.0, -4.0, -3.0, -2.0, -1.0};
        double[] expected = {0.0, 0.2, 0.4, 0.6, 0.8}; // Corrected expected values
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @Test(timeout = 5000)
    public void testRescaleToUnitWithMixedNumbers() {
        double[] input = {-1.0, 0.0, 1.0, 2.0, 3.0};
        double[] expected = {0.0, 0.25, 0.5, 0.75, 1.0};
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @Test(timeout = 5000)
    public void testRescaleToUnitWithSingleElement() {
        double[] input = {42.0};
        double[] expected = {0.0}; // Corrected expected value
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @Test(timeout = 5000)
    public void testRescaleToUnitWithTwoElements() {
        double[] input = {1.0, 3.0};
        double[] expected = {0.0, 1.0};
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @Test(timeout = 5000)
    public void testRescaleToUnitWithIdenticalElements() {
        double[] input = {5.0, 5.0, 5.0};
        double[] expected = {0.0, 0.0, 0.0}; // Corrected expected value
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @Test(timeout = 5000)
    public void testRescaleToUnitWithZeroRange() {
        double[] input = {2.0, 2.0, 2.0, 2.0};
        double[] expected = {0.0, 0.0, 0.0, 0.0}; // Corrected expected value
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @Test(timeout = 5000)
    public void testRescaleToUnitWithEmptyArray() {
        double[] input = {};
        double[] expected = {};
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @Test(expected = NullPointerException.class) // Corrected expected exception
    public void testRescaleToUnitWithNullArray() {
        RESCALE_TO_UNIT.rescale_to_unit(null);
    }
}