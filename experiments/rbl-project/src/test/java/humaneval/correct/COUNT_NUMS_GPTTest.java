package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class COUNT_NUMS_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        Assert.assertEquals(0, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testSinglePositiveNumber() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        Assert.assertEquals(1, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testSingleNegativeNumber() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-5);
        Assert.assertEquals(1, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testSingleZero() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        Assert.assertEquals(0, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testMultiplePositiveNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        Assert.assertEquals(3, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testMultipleNegativeNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(-2);
        arr.add(-3);
        Assert.assertEquals(3, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testMixedNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-2);
        arr.add(0);
        arr.add(3);
        Assert.assertEquals(3, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testLargeNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(123456);
        arr.add(-654321);
        Assert.assertEquals(2, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testSingleDigitNegative() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        Assert.assertEquals(1, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testSingleDigitPositive() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        Assert.assertEquals(1, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testNegativeSum() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-10);
        arr.add(-20);
        Assert.assertEquals(0, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testPositiveAndNegativeWithZero() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(-10);
        arr.add(0);
        Assert.assertEquals(2, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testAllZeros() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(0);
        Assert.assertEquals(0, COUNT_NUMS.count_nums(arr));
    }
}