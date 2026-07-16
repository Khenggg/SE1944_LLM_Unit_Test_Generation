package humaneval.correct;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class GET_ROW_GPTTest {

    @Test(timeout = 5000)
    public void testGetRow_EmptyList() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        ArrayList<GET_ROW.Tuple> expected = new ArrayList<>();
        Assert.assertEquals(expected, GET_ROW.get_row(input, 1));
    }

    @Test(timeout = 5000)
    public void testGetRow_NoMatches() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<Integer>() {{ add(1); add(2); }});
        input.add(new ArrayList<Integer>() {{ add(3); add(4); }});
        ArrayList<GET_ROW.Tuple> expected = new ArrayList<>();
        Assert.assertEquals(expected, GET_ROW.get_row(input, 5));
    }

    @Test(timeout = 5000)
    public void testGetRow_SingleMatch() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<Integer>() {{ add(1); add(2); }});
        input.add(new ArrayList<Integer>() {{ add(3); add(4); add(5); }});
        ArrayList<GET_ROW.Tuple> expected = new ArrayList<>();
        expected.add(new GET_ROW().new Tuple(1, 2));
        Assert.assertEquals(expected, GET_ROW.get_row(input, 4));
    }

    @Test(timeout = 5000)
    public void testGetRow_MultipleMatchesInSameRow() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<Integer>() {{ add(1); add(2); add(3); add(2); }});
        input.add(new ArrayList<Integer>() {{ add(4); add(5); }});
        ArrayList<GET_ROW.Tuple> expected = new ArrayList<>();
        expected.add(new GET_ROW().new Tuple(0, 3));
        expected.add(new GET_ROW().new Tuple(0, 1));
        Assert.assertEquals(expected, GET_ROW.get_row(input, 2));
    }

    @Test(timeout = 5000)
    public void testGetRow_MultipleRows() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<Integer>() {{ add(1); add(2); }});
        input.add(new ArrayList<Integer>() {{ add(2); add(3); }});
        input.add(new ArrayList<Integer>() {{ add(4); add(2); }});
        ArrayList<GET_ROW.Tuple> expected = new ArrayList<>();
        expected.add(new GET_ROW().new Tuple(0, 1));
        expected.add(new GET_ROW().new Tuple(1, 0));
        expected.add(new GET_ROW().new Tuple(2, 1));
        Assert.assertEquals(expected, GET_ROW.get_row(input, 2));
    }

    @Test(timeout = 5000)
    public void testGetRow_AllElementsMatch() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<Integer>() {{ add(1); add(1); }});
        input.add(new ArrayList<Integer>() {{ add(1); add(1); }});
        ArrayList<GET_ROW.Tuple> expected = new ArrayList<>();
        expected.add(new GET_ROW().new Tuple(0, 0));
        expected.add(new GET_ROW().new Tuple(0, 1));
        expected.add(new GET_ROW().new Tuple(1, 0));
        expected.add(new GET_ROW().new Tuple(1, 1));
        Assert.assertEquals(expected, GET_ROW.get_row(input, 1));
    }

    @Test(timeout = 5000)
    public void testGetRow_NegativeNumbers() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<Integer>() {{ add(-1); add(-2); }});
        input.add(new ArrayList<Integer>() {{ add(-3); add(-4); }});
        ArrayList<GET_ROW.Tuple> expected = new ArrayList<>();
        expected.add(new GET_ROW().new Tuple(0, 0));
        Assert.assertEquals(expected, GET_ROW.get_row(input, -1));
    }

    @Test(timeout = 5000)
    public void testGetRow_LargeInput() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 1000; j++) {
                row.add(i + j);
            }
            input.add(row);
        }
        ArrayList<GET_ROW.Tuple> expected = new ArrayList<>();
        expected.add(new GET_ROW().new Tuple(999, 999));
        Assert.assertEquals(expected, GET_ROW.get_row(input, 1998));
    }
}