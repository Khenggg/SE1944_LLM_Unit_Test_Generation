package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class LARGEST_PRIME_FACTOR_GPTTest {

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_13195() {
        Assert.assertEquals(29, LARGEST_PRIME_FACTOR.largest_prime_factor(13195));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_2048() {
        Assert.assertEquals(2, LARGEST_PRIME_FACTOR.largest_prime_factor(2048));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_100() {
        Assert.assertEquals(5, LARGEST_PRIME_FACTOR.largest_prime_factor(100));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_49() {
        Assert.assertEquals(7, LARGEST_PRIME_FACTOR.largest_prime_factor(49));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_15() {
        Assert.assertEquals(5, LARGEST_PRIME_FACTOR.largest_prime_factor(15));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_77() {
        Assert.assertEquals(11, LARGEST_PRIME_FACTOR.largest_prime_factor(77));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_1() {
        try {
            LARGEST_PRIME_FACTOR.largest_prime_factor(1);
            Assert.fail("Expected an IllegalArgumentException for input 1");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_2() {
        try {
            LARGEST_PRIME_FACTOR.largest_prime_factor(2);
            Assert.fail("Expected an IllegalArgumentException for input 2");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_9() {
        Assert.assertEquals(3, LARGEST_PRIME_FACTOR.largest_prime_factor(9));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_28() {
        Assert.assertEquals(7, LARGEST_PRIME_FACTOR.largest_prime_factor(28));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_1001() {
        Assert.assertEquals(143, LARGEST_PRIME_FACTOR.largest_prime_factor(1001));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_121() {
        Assert.assertEquals(11, LARGEST_PRIME_FACTOR.largest_prime_factor(121));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_200() {
        Assert.assertEquals(5, LARGEST_PRIME_FACTOR.largest_prime_factor(200));
    }
}