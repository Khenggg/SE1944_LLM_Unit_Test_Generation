package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class TRIPLES_SUM_TO_ZERO_GPTTest {

    @Test(timeout = 5000)
    public void testTriplesSumToZero_WithPositiveAndNegativeNumbers() {
        int[] input = {1, 3, -2, 1};
        Assert.assertTrue(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(input));
    }

    @Test(timeout = 5000)
    public void testTriplesSumToZero_WithNoTriplesSummingToZero() {
        int[] input = {1, 3, 5, 0};
        Assert.assertFalse(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(input));
    }

    @Test(timeout = 5000)
    public void testTriplesSumToZero_WithDistinctElementsSummingToZero() {
        int[] input = {2, 4, -5, 3, 9, 7};
        Assert.assertTrue(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(input));
    }

    @Test(timeout = 5000)
    public void testTriplesSumToZero_WithOnlyPositiveNumbers() {
        int[] input = {1, 2, 3, 7};
        Assert.assertFalse(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(input));
    }

    @Test(timeout = 5000)
    public void testTriplesSumToZero_WithSingleElement() {
        int[] input = {1};
        Assert.assertFalse(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(input));
    }

    @Test(timeout = 5000)
    public void testTriplesSumToZero_WithTwoElements() {
        int[] input = {1, -1};
        Assert.assertFalse(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(input));
    }

    @Test(timeout = 5000)
    public void testTriplesSumToZero_WithThreeElementsSummingToZero() {
        int[] input = {1, -1, 0};
        Assert.assertTrue(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(input));
    }

    @Test(timeout = 5000)
    public void testTriplesSumToZero_WithAllZeroes() {
        int[] input = {0, 0, 0};
        Assert.assertTrue(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(input));
    }

    @Test(timeout = 5000)
    public void testTriplesSumToZero_WithNegativeNumbersOnly() {
        int[] input = {-1, -2, -3, -4};
        Assert.assertFalse(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(input));
    }

    @Test(timeout = 5000)
    public void testTriplesSumToZero_WithMixedNumbers() {
        int[] input = {1, -1, 2, -2, 3};
        Assert.assertTrue(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(input));
    }

    @Test(timeout = 5000)
    public void testTriplesSumToZero_WithLargeInput() {
        int[] input = new int[1000];
        for (int i = 0; i < 1000; i++) {
            input[i] = i - 500; // Range from -500 to 499
        }
        Assert.assertTrue(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(input));
    }
}