package humaneval.correct;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class FIND_ZERO_GPTTest {

    @Test
    public void testFindZeroWithSimpleRoot() {
        List<Double> coefficients = Arrays.asList(0.0, 1.0); // f(x) = x
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertEquals(0.0, result, 1e-10);
    }

    @Test
    public void testFindZeroWithQuadraticRoot() {
        List<Double> coefficients = Arrays.asList(1.0, 0.0, -1.0); // f(x) = x^2 - 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
    }

    @Test
    public void testFindZeroWithNoRootInRange() {
        List<Double> coefficients = Arrays.asList(1.0, 1.0); // f(x) = x + 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result > 1.0 || result < -1.0);
    }

    @Test
    public void testFindZeroWithMultipleRoots() {
        List<Double> coefficients = Arrays.asList(1.0, 0.0, -1.0); // f(x) = x^2 - 1
        double result1 = FIND_ZERO.find_zero(coefficients);
        double result2 = FIND_ZERO.find_zero(Arrays.asList(1.0, 0.0, 1.0)); // f(x) = x^2 + 1
        Assert.assertTrue(result1 >= -1.0 && result1 <= 1.0);
        Assert.assertTrue(result2 > 1.0 || result2 < -1.0);
    }

    @Test
    public void testFindZeroWithHighDegreePolynomial() {
        List<Double> coefficients = Arrays.asList(1.0, 0.0, 0.0, -1.0); // f(x) = x^3 - 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= 0.0 && result <= 1.0);
    }

    @Test
    public void testFindZeroWithSmallCoefficients() {
        List<Double> coefficients = Arrays.asList(1e-10, -1e-10); // f(x) = 1e-10 * x - 1e-10
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertEquals(1.0, result, 1e-10);
    }

    @Test
    public void testFindZeroWithLargeCoefficients() {
        List<Double> coefficients = Arrays.asList(1e10, -1e10); // f(x) = 1e10 * x - 1e10
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertEquals(1.0, result, 1e-10);
    }

    @Test
    public void testFindZeroWithConstantFunction() {
        List<Double> coefficients = Arrays.asList(5.0); // f(x) = 5
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result > 1.0 || result < -1.0);
    }

    @Test
    public void testFindZeroWithEmptyList() {
        List<Double> coefficients = Arrays.asList(); // f(x) = 0
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result > 1.0 || result < -1.0);
    }

    @Test
    public void testFindZeroWithNegativeCoefficients() {
        List<Double> coefficients = Arrays.asList(-1.0, 0.0, 1.0); // f(x) = -x^2 + 1
        double result = FIND_ZERO.find_zero(coefficients);
        Assert.assertTrue(result >= -1.0 && result <= 1.0);
    }
}