package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class FIND_ZERO_GPTTest {

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testFindZeroWithSimplePolynomial() {
        List<Double> coefficients = Arrays.asList(-1.0, 0.0, 1.0); // x^2 - 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
        Assert.assertEquals(1.0, FIND_ZERO.poly(coefficients, result), 1e-10);
    }

    @Test(timeout = 5000)
    public void testFindZeroWithLinearPolynomial() {
        List<Double> coefficients = Arrays.asList(1.0, -1.0); // x - 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertEquals(1.0, result, 1e-10);
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testFindZeroWithNoRoot() {
        List<Double> coefficients = Arrays.asList(1.0, 1.0); // x + 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
        Assert.assertTrue(FIND_ZERO.poly(coefficients, result) > 0);
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testFindZeroWithMultipleRoots() {
        List<Double> coefficients = Arrays.asList(1.0, 0.0, -1.0); // x^2 - 1
        double result1 = FIND_ZERO.find_zero(coefficients);
        double result2 = FIND_ZERO.find_zero(Arrays.asList(1.0, 0.0, -1.0)); // x^2 - 1
        Assert.assertTrue(result1 >= -1.0 && result1 <= 1.0);
        Assert.assertTrue(result2 >= -1.0 && result2 <= 1.0);
        Assert.assertEquals(1.0, FIND_ZERO.poly(coefficients, result1), 1e-10);
        Assert.assertEquals(-1.0, FIND_ZERO.poly(coefficients, result2), 1e-10);
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testFindZeroWithHighDegreePolynomial() {
        List<Double> coefficients = Arrays.asList(1.0, 0.0, 0.0, -1.0); // x^3 - 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
        Assert.assertEquals(1.0, FIND_ZERO.poly(coefficients, result), 1e-10);
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testFindZeroWithNegativeCoefficients() {
        List<Double> coefficients = Arrays.asList(-1.0, 0.0, 1.0); // -x^2 + 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
        Assert.assertEquals(1.0, FIND_ZERO.poly(coefficients, result), 1e-10);
    }

    @Test(timeout = 5000)
    public void testFindZeroWithZeroPolynomial() {
        List<Double> coefficients = Arrays.asList(0.0); // 0
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
        Assert.assertEquals(0.0, FIND_ZERO.poly(coefficients, result), 1e-10);
    }

    @Test(timeout = 5000)
    public void testFindZeroWithSmallRange() {
        List<Double> coefficients = Arrays.asList(1.0, -1.0); // x - 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertEquals(1.0, result, 1e-10);
    }

    @Test(timeout = 5000)
    public void testFindZeroWithLargeCoefficients() {
        List<Double> coefficients = Arrays.asList(1e6, -1e6); // 1e6 * x - 1e6
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertEquals(1.0, result, 1e-10);
    }
}