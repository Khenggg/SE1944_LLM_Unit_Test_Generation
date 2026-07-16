package humaneval.correct;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class MOVE_ONE_BALL_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        Assert.assertTrue(MOVE_ONE_BALL.move_one_ball(arr));
    }

    @Test(timeout = 5000)
    public void testSingleElementArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        Assert.assertTrue(MOVE_ONE_BALL.move_one_ball(arr));
    }

    @Test(timeout = 5000)
    public void testAlreadySortedArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        Assert.assertTrue(MOVE_ONE_BALL.move_one_ball(arr));
    }

    @Test(timeout = 5000)
    public void testReverseSortedArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        Assert.assertFalse(MOVE_ONE_BALL.move_one_ball(arr));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testUnsortedArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        Assert.assertFalse(MOVE_ONE_BALL.move_one_ball(arr));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testArrayWithDuplicates() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(2);
        Assert.assertFalse(MOVE_ONE_BALL.move_one_ball(arr));
    }

    @Test(timeout = 5000)
    public void testArrayWithAllSameElements() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(2);
        Assert.assertTrue(MOVE_ONE_BALL.move_one_ball(arr));
    }

    @Test(timeout = 5000)
    public void testArrayWithNegativeAndPositiveNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(0);
        arr.add(1);
        Assert.assertTrue(MOVE_ONE_BALL.move_one_ball(arr));
    }

    @Test(timeout = 5000)
    public void testArrayWithNegativeNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-3);
        arr.add(-1);
        arr.add(-2);
        Assert.assertFalse(MOVE_ONE_BALL.move_one_ball(arr));
    }

    @Test(timeout = 5000)
    public void testArrayWithLargeNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1000000);
        arr.add(999999);
        arr.add(1000001);
        Assert.assertFalse(MOVE_ONE_BALL.move_one_ball(arr));
    }

    @Test(timeout = 5000)
    public void testArrayWithMixedValues() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        Assert.assertFalse(MOVE_ONE_BALL.move_one_ball(arr));
    }
}