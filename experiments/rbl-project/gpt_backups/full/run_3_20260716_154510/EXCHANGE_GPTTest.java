package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class EXCHANGE_GPTTest {

    @Test(timeout = 5000)
    public void testAllEvenInLst1() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(2);
        lst1.add(4);
        lst1.add(6);
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(1);
        lst2.add(3);
        Assert.assertEquals("YES", EXCHANGE.exchange(lst1, lst2));
    }

    @Test(timeout = 5000)
    public void testAllOddInLst1() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(3);
        lst1.add(5);
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(2);
        lst2.add(4);
        Assert.assertEquals("NO", EXCHANGE.exchange(lst1, lst2));
    }

    @Test(timeout = 5000)
    public void testMixedLst1WithSufficientEvensInLst2() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(2);
        lst2.add(4);
        Assert.assertEquals("YES", EXCHANGE.exchange(lst1, lst2));
    }

    @Test(timeout = 5000)
    public void testMixedLst1WithInsufficientEvensInLst2() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(3);
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(1);
        lst2.add(5);
        Assert.assertEquals("NO", EXCHANGE.exchange(lst1, lst2));
    }

    @Test(timeout = 5000)
    public void testEmptyLst2() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(2);
        ArrayList<Integer> lst2 = new ArrayList<>();
        Assert.assertEquals("NO", EXCHANGE.exchange(lst1, lst2));
    }

    @Test(timeout = 5000)
    public void testEmptyLst1() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(2);
        Assert.assertEquals("YES", EXCHANGE.exchange(lst1, lst2));
    }

    @Test(timeout = 5000)
    public void testSingleElementEvenInLst1() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(2);
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(1);
        Assert.assertEquals("YES", EXCHANGE.exchange(lst1, lst2));
    }

    @Test(timeout = 5000)
    public void testSingleElementOddInLst1() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(2);
        Assert.assertEquals("YES", EXCHANGE.exchange(lst1, lst2));
    }

    @Test(timeout = 5000)
    public void testMultipleEvensInLst2() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(3);
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(2);
        lst2.add(4);
        lst2.add(6);
        Assert.assertEquals("YES", EXCHANGE.exchange(lst1, lst2));
    }

    @Test(timeout = 5000)
    public void testMultipleOddsInLst1AndEvensInLst2() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(3);
        lst1.add(5);
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(2);
        lst2.add(4);
        Assert.assertEquals("NO", EXCHANGE.exchange(lst1, lst2));
    }
}