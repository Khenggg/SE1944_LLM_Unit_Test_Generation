package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;

public class UNIQUE_DIGITS_GPTTest {

    @Test(timeout = 5000)
    public void testUniqueDigitsWithAllOddDigits() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(15, 33, 1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 15, 33));
        Assert.assertEquals(expected, UNIQUE_DIGITS.unique_digits(input));
    }

    @Test(timeout = 5000)
    public void testUniqueDigitsWithMixedDigits() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(15, 33, 1422, 1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 15, 33));
        Assert.assertEquals(expected, UNIQUE_DIGITS.unique_digits(input));
    }

    @Test(timeout = 5000)
    public void testUniqueDigitsWithNoOddDigits() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(152, 323, 1422, 10));
        ArrayList<Integer> expected = new ArrayList<>();
        Assert.assertEquals(expected, UNIQUE_DIGITS.unique_digits(input));
    }

    @Test(timeout = 5000)
    public void testUniqueDigitsWithEmptyList() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        Assert.assertEquals(expected, UNIQUE_DIGITS.unique_digits(input));
    }

    @Test(timeout = 5000)
    public void testUniqueDigitsWithSingleOddDigit() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(7));
        Assert.assertEquals(expected, UNIQUE_DIGITS.unique_digits(input));
    }

    @Test(timeout = 5000)
    public void testUniqueDigitsWithSingleEvenDigit() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2));
        ArrayList<Integer> expected = new ArrayList<>();
        Assert.assertEquals(expected, UNIQUE_DIGITS.unique_digits(input));
    }

    @Test(timeout = 5000)
    public void testUniqueDigitsWithAllEvenDigits() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(246, 482, 20));
        ArrayList<Integer> expected = new ArrayList<>();
        Assert.assertEquals(expected, UNIQUE_DIGITS.unique_digits(input));
    }

    @Test(timeout = 5000)
    public void testUniqueDigitsWithLargeNumbers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(13579, 24680, 11111));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(11111, 13579));
        Assert.assertEquals(expected, UNIQUE_DIGITS.unique_digits(input));
    }

    @Test(timeout = 5000)
    public void testUniqueDigitsWithNegativeNumbers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-15, -33, -1));
        ArrayList<Integer> expected = new ArrayList<>();
        Assert.assertEquals(expected, UNIQUE_DIGITS.unique_digits(input));
    }

    @Test(timeout = 5000)
    public void testUniqueDigitsWithZero() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 1, 3, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5));
        Assert.assertEquals(expected, UNIQUE_DIGITS.unique_digits(input));
    }
}