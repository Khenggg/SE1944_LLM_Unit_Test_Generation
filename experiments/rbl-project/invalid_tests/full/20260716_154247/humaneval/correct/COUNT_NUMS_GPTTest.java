package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class COUNT_NUMS_GPTTest {

    @Test(timeout = 5000)
    public void testCountNums_EmptyList() {
        ArrayList<Integer> arr = new ArrayList<>();
        Assert.assertEquals(0, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_SinglePositiveNumber() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        Assert.assertEquals(1, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_SingleNegativeNumber() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-5);
        Assert.assertEquals(1, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_SingleZero() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        Assert.assertEquals(0, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_MultiplePositiveNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        Assert.assertEquals(3, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_MultipleNegativeNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(-2);
        arr.add(-3);
        Assert.assertEquals(3, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_MixedNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-2);
        arr.add(0);
        arr.add(3);
        Assert.assertEquals(2, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_NegativeAndPositiveWithZero() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(0);
        arr.add(2);
        Assert.assertEquals(1, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_LargeNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1000000);
        arr.add(-999999);
        Assert.assertEquals(2, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_SingleDigitNegative() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        Assert.assertEquals(0, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_SingleDigitPositive() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        Assert.assertEquals(1, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_NegativeAndPositiveSingleDigit() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-3);
        arr.add(3);
        Assert.assertEquals(1, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_LargeList() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = -1000; i <= 1000; i++) {
            arr.add(i);
        }
        Assert.assertEquals(1717, COUNT_NUMS.count_nums(arr));
    }
}