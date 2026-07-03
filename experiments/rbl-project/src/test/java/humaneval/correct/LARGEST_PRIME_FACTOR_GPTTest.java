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
        // This case is invalid as per the assumption n > 1
        // However, we can check if the method handles it gracefully
        try {
            LARGEST_PRIME_FACTOR.largest_prime_factor(1);
            Assert.fail("Expected an IllegalArgumentException for input 1");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_2() {
        // This case is invalid as per the assumption n > 1
        try {
            LARGEST_PRIME_FACTOR.largest_prime_factor(2);
            Assert.fail("Expected an IllegalArgumentException for input 2");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_3() {
        // This case is invalid as per the assumption n > 1
        try {
            LARGEST_PRIME_FACTOR.largest_prime_factor(3);
            Assert.fail("Expected an IllegalArgumentException for input 3");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_4() {
        Assert.assertEquals(2, LARGEST_PRIME_FACTOR.largest_prime_factor(4));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_9() {
        Assert.assertEquals(3, LARGEST_PRIME_FACTOR.largest_prime_factor(9));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_21() {
        Assert.assertEquals(7, LARGEST_PRIME_FACTOR.largest_prime_factor(21));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_1001() {
        Assert.assertEquals(143, LARGEST_PRIME_FACTOR.largest_prime_factor(1001));
    }

    @Test(timeout = 5000)
    public void testLargestPrimeFactor_9973() {
        Assert.assertEquals(9973, LARGEST_PRIME_FACTOR.largest_prime_factor(9973 * 2)); // 9973 is prime
    }
}