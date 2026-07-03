package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class GET_ROW_GPTTest {

    @Test(timeout = 5000)
    public void testGetRow_EmptyList() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        ArrayList<GET_ROW.Tuple> result = GET_ROW.get_row(lst, 1);
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testGetRow_NoMatch() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<Integer>() {{ add(1); add(2); }});
        lst.add(new ArrayList<Integer>() {{ add(3); add(4); }});
        ArrayList<GET_ROW.Tuple> result = GET_ROW.get_row(lst, 5);
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testGetRow_SingleMatch() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<Integer>() {{ add(1); add(2); }});
        lst.add(new ArrayList<Integer>() {{ add(3); add(4); add(5); }});
        lst.add(new ArrayList<Integer>() {{ add(6); add(7); add(2); }});
        ArrayList<GET_ROW.Tuple> result = GET_ROW.get_row(lst, 2);
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.contains(new GET_ROW().new Tuple(0, 1)));
        Assert.assertTrue(result.contains(new GET_ROW().new Tuple(2, 2)));
    }

    @Test(timeout = 5000)
    public void testGetRow_MultipleMatchesInSameRow() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<Integer>() {{ add(1); add(2); add(2); }});
        lst.add(new ArrayList<Integer>() {{ add(3); add(4); }});
        ArrayList<GET_ROW.Tuple> result = GET_ROW.get_row(lst, 2);
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.contains(new GET_ROW().new Tuple(0, 1)));
        Assert.assertTrue(result.contains(new GET_ROW().new Tuple(0, 2)));
    }

    @Test(timeout = 5000)
    public void testGetRow_MultipleRows() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<Integer>() {{ add(1); add(2); }});
        lst.add(new ArrayList<Integer>() {{ add(2); add(3); }});
        lst.add(new ArrayList<Integer>() {{ add(4); add(2); }});
        ArrayList<GET_ROW.Tuple> result = GET_ROW.get_row(lst, 2);
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.contains(new GET_ROW().new Tuple(0, 1)));
        Assert.assertTrue(result.contains(new GET_ROW().new Tuple(1, 0)));
        Assert.assertTrue(result.contains(new GET_ROW().new Tuple(2, 1)));
    }

    @Test(timeout = 5000)
    public void testGetRow_NegativeNumbers() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<Integer>() {{ add(-1); add(-2); }});
        lst.add(new ArrayList<Integer>() {{ add(-3); add(-4); }});
        ArrayList<GET_ROW.Tuple> result = GET_ROW.get_row(lst, -2);
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(new GET_ROW().new Tuple(0, 1)));
    }

    @Test(timeout = 5000)
    public void testGetRow_LargeNumbers() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<Integer>() {{ add(Integer.MAX_VALUE); }});
        lst.add(new ArrayList<Integer>() {{ add(Integer.MIN_VALUE); }});
        ArrayList<GET_ROW.Tuple> result = GET_ROW.get_row(lst, Integer.MAX_VALUE);
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(new GET_ROW().new Tuple(0, 0)));
    }

    @Test(timeout = 5000)
    public void testGetRow_SingleElementMatch() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<Integer>() {{ add(1); }});
        ArrayList<GET_ROW.Tuple> result = GET_ROW.get_row(lst, 1);
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(new GET_ROW().new Tuple(0, 0)));
    }

    @Test(timeout = 5000)
    public void testGetRow_SingleElementNoMatch() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<Integer>() {{ add(1); }});
        ArrayList<GET_ROW.Tuple> result = GET_ROW.get_row(lst, 2);
        Assert.assertTrue(result.isEmpty());
    }
}