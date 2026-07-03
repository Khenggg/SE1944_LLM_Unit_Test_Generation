package humaneval.correct;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PRIME_FIB_GPTTest {

    @Test(timeout = 5000)
    public void testIsPrimeWithNegativeNumber() {
        Assert.assertFalse(PRIME_FIB.is_prime(-1));
    }

    @Test(timeout = 5000)
    public void testIsPrimeWithZero() {
        Assert.assertFalse(PRIME_FIB.is_prime(0));
    }

    @Test(timeout = 5000)
    public void testIsPrimeWithOne() {
        Assert.assertFalse(PRIME_FIB.is_prime(1));
    }

    @Test(timeout = 5000)
    public void testIsPrimeWithTwo() {
        Assert.assertTrue(PRIME_FIB.is_prime(2));
    }

    @Test(timeout = 5000)
    public void testIsPrimeWithThree() {
        Assert.assertTrue(PRIME_FIB.is_prime(3));
    }

    @Test(timeout = 5000)
    public void testIsPrimeWithFour() {
        Assert.assertFalse(PRIME_FIB.is_prime(4));
    }

    @Test(timeout = 5000)
    public void testIsPrimeWithLargePrime() {
        Assert.assertTrue(PRIME_FIB.is_prime(29));
    }

    @Test(timeout = 5000)
    public void testIsPrimeWithLargeNonPrime() {
        Assert.assertFalse(PRIME_FIB.is_prime(100));
    }

    @Test(timeout = 5000)
    public void testPrimeFibWithZero() {
        Assert.assertEquals(0, PRIME_FIB.prime_fib(0));
    }

    @Test(timeout = 5000)
    public void testPrimeFibWithOne() {
        Assert.assertEquals(2, PRIME_FIB.prime_fib(1));
    }

    @Test(timeout = 5000)
    public void testPrimeFibWithTwo() {
        Assert.assertEquals(3, PRIME_FIB.prime_fib(2));
    }

    @Test(timeout = 5000)
    public void testPrimeFibWithThree() {
        Assert.assertEquals(5, PRIME_FIB.prime_fib(3));
    }

    @Test(timeout = 5000)
    public void testPrimeFibWithFour() {
        Assert.assertEquals(13, PRIME_FIB.prime_fib(4));
    }

    @Test(timeout = 5000)
    public void testPrimeFibWithFive() {
        Assert.assertEquals(89, PRIME_FIB.prime_fib(5));
    }

    @Test(timeout = 5000)
    public void testPrimeFibWithLargeInput() {
        Assert.assertEquals(233, PRIME_FIB.prime_fib(7));
    }

    @Test(timeout = 5000)
    public void testPrimeFibWithNegativeInput() {
        try {
            PRIME_FIB.prime_fib(-1);
            Assert.fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Input must be non-negative", e.getMessage());
        }
    }
}