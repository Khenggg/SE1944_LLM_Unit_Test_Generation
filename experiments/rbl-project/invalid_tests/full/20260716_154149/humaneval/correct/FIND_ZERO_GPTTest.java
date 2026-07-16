package humaneval.correct;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class FIND_ZERO_GPTTest {

    @Test(timeout = 5000)
    public void testFindZeroWithSimpleRoot() {
        List<Double> coefficients = Arrays.asList(0.0, 0.0, 1.0); // x^2
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
        Assert.assertEquals(0.0, FIND_ZERO.poly(coefficients, result), 1e-10);
    }

    @Test(timeout = 5000)
    public void testFindZeroWithLinearRoot() {
        List<Double> coefficients = Arrays.asList(-1.0, 1.0); // x - 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertEquals(1.0, result, 1e-10);
        Assert.assertEquals(0.0, FIND_ZERO.poly(coefficients, result), 1e-10);
    }

    @Test(timeout = 5000)
    public void testFindZeroWithNoRootInRange() {
        List<Double> coefficients = Arrays.asList(1.0, 1.0); // x + 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
        Assert.assertNotEquals(0.0, FIND_ZERO.poly(coefficients, result), 1e-10);
    }

    @Test(timeout = 5000)
    public void testFindZeroWithMultipleRoots() {
        List<Double> coefficients = Arrays.asList(1.0, 0.0, -1.0); // x^2 - 1
        double result1 = FIND_ZERO.find_zero(coefficients);
        double result2 = FIND_ZERO.find_zero(Arrays.asList(1.0, 0.0, -1.0)); // x^2 - 1
        Assert.assertTrue(result1 == -1.0 || result1 == 1.0);
        Assert.assertTrue(result2 == -1.0 || result2 == 1.0);
    }

    @Test(timeout = 5000)
    public void testFindZeroWithHighDegreePolynomial() {
        List<Double> coefficients = Arrays.asList(1.0, 0.0, 0.0, -1.0); // x^3 - 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
        Assert.assertEquals(0.0, FIND_ZERO.poly(coefficients, result), 1e-10, "Root not found close enough to zero");
    }

    @Test(timeout = 5000)
    public void testFindZeroWithEdgeCase() {
        List<Double> coefficients = Arrays.asList(0.0); // Constant function
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
        Assert.assertNotEquals(0.0, FIND_ZERO.poly(coefficients, result), 1e-10);
    }

    @Test(timeout = 5000)
    public void testFindZeroWithNegativeCoefficients() {
        List<Double> coefficients = Arrays.asList(-1.0, 0.0, 1.0); // -x^2 + 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
        Assert.assertEquals(0.0, FIND_ZERO.poly(coefficients, result), 1e-10);
    }

    @Test(timeout = 5000)
    public void testFindZeroWithSmallValues() {
        List<Double> coefficients = Arrays.asList(1e-10, -1e-10); // 1e-10 * x - 1e-10
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertEquals(1.0, result, 1e-10);
        Assert.assertEquals(0.0, FIND_ZERO.poly(coefficients, result), 1e-10);
    }

    @Test(timeout = 5000)
    public void testFindZeroWithLargeValues() {
        List<Double> coefficients = Arrays.asList(1e10, -1e10); // 1e10 * x - 1e10
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertEquals(1.0, result, 1e-10);
        Assert.assertEquals(0.0, FIND_ZERO.poly(coefficients, result), 1e-10);
    }
}