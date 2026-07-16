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

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testRescaleToUnitWithNegativeNumbers() {
        double[] input = {-5.0, -4.0, -3.0, -2.0, -1.0};
        double[] expected = {0.0, 0.25, 0.5, 0.75, 1.0};
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @Test(timeout = 5000)
    public void testRescaleToUnitWithMixedNumbers() {
        double[] input = {-1.0, 0.0, 1.0, 2.0, 3.0};
        double[] expected = {0.0, 0.25, 0.5, 0.75, 1.0};
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testRescaleToUnitWithSingleElement() {
        double[] input = {42.0};
        double[] expected = {0.0};
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testRescaleToUnitWithIdenticalElements() {
        double[] input = {5.0, 5.0, 5.0};
        double[] expected = {0.0, 0.0, 0.0};
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testRescaleToUnitWithZeroRange() {
        double[] input = {2.0, 2.0, 2.0, 2.0};
        double[] expected = {0.0, 0.0, 0.0, 0.0};
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @Test(timeout = 5000)
    public void testRescaleToUnitWithEmptyArray() {
        double[] input = {};
        double[] expected = {};
        Assert.assertArrayEquals(expected, RESCALE_TO_UNIT.rescale_to_unit(input), 0.0001);
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRescaleToUnitWithNullArray() {
        RESCALE_TO_UNIT.rescale_to_unit(null);
    }
}