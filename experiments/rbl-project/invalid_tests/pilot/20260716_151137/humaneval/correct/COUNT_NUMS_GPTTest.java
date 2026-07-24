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
    public void testCountNums_MultipleNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-2);
        arr.add(3);
        arr.add(-4);
        Assert.assertEquals(2, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_NegativeAndPositiveWithZero() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(0);
        arr.add(2);
        arr.add(-3);
        Assert.assertEquals(2, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_LargeNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1000000);
        arr.add(-999999);
        arr.add(123456);
        arr.add(-654321);
        Assert.assertEquals(4, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_SingleDigitNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-1);
        arr.add(0);
        Assert.assertEquals(1, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_NegativeSum() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-10);
        arr.add(-20);
        arr.add(-30);
        Assert.assertEquals(0, COUNT_NUMS.count_nums(arr));
    }

    @Test(timeout = 5000)
    public void testCountNums_PositiveSumWithNegatives() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(10);
        arr.add(-2);
        arr.add(20);
        Assert.assertEquals(2, COUNT_NUMS.count_nums(arr));
    }
}