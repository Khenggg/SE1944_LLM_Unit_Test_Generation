package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;

public class SORT_ARRAY_BINARY_GPTTest {

    @Test(timeout = 5000)
    public void testSortArrayBinaryWithPositiveIntegers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(expected, SORT_ARRAY_BINARY.sort_array_binary(input));
    }

    @Test(timeout = 5000)
    public void testSortArrayBinaryWithNegativeIntegers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2, -3, -4, -5, -6));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-6, -5, -4, -3, -2));
        Assert.assertEquals(expected, SORT_ARRAY_BINARY.sort_array_binary(input));
    }

    @Test(timeout = 5000)
    public void testSortArrayBinaryWithMixedIntegers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 0, 2, 3, 4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        Assert.assertEquals(expected, SORT_ARRAY_BINARY.sort_array_binary(input));
    }

    @Test(timeout = 5000)
    public void testSortArrayBinaryWithAllZeros() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        Assert.assertEquals(expected, SORT_ARRAY_BINARY.sort_array_binary(input));
    }

    @Test(timeout = 5000)
    public void testSortArrayBinaryWithSingleElement() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5));
        Assert.assertEquals(expected, SORT_ARRAY_BINARY.sort_array_binary(input));
    }

    @Test(timeout = 5000)
    public void testSortArrayBinaryWithTwoElementsSameOnes() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 5));
        Assert.assertEquals(expected, SORT_ARRAY_BINARY.sort_array_binary(input));
    }

    @Test(timeout = 5000)
    public void testSortArrayBinaryWithTwoElementsDifferentOnes() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 3));
        Assert.assertEquals(expected, SORT_ARRAY_BINARY.sort_array_binary(input));
    }

    @Test(timeout = 5000)
    public void testSortArrayBinaryWithLargeNumbers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1024, 2048, 512, 256));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(256, 512, 1024, 2048));
        Assert.assertEquals(expected, SORT_ARRAY_BINARY.sort_array_binary(input));
    }

    @Test(timeout = 5000)
    public void testSortArrayBinaryWithEmptyArray() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        Assert.assertEquals(expected, SORT_ARRAY_BINARY.sort_array_binary(input));
    }
}