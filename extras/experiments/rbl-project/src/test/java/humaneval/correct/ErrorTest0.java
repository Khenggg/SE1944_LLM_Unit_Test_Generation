package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        humaneval.correct.GET_ROW.Tuple tuple6 = gET_ROW0.new Tuple((int) (byte) 100, 0);
        tuple6.x = ' ';
        humaneval.correct.GET_ROW gET_ROW9 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple12 = gET_ROW9.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList13 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList15 = humaneval.correct.GET_ROW.get_row(intListList13, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList17 = humaneval.correct.GET_ROW.get_row(intListList13, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList19 = humaneval.correct.GET_ROW.get_row(intListList13, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList21 = humaneval.correct.GET_ROW.get_row(intListList13, (int) 'a');
        boolean boolean22 = tuple12.equals((java.lang.Object) intListList13);
        boolean boolean24 = tuple12.equals((java.lang.Object) 1L);
        boolean boolean25 = tuple6.equals((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tuple3 and tuple12", tuple3.equals(tuple12) ? tuple3.hashCode() == tuple12.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        humaneval.correct.GET_ROW.Tuple tuple6 = gET_ROW0.new Tuple((int) (byte) 100, 0);
        tuple6.x = ' ';
        tuple6.x = 10;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tuple3 and tuple6", tuple3.equals(tuple6) ? tuple3.hashCode() == tuple6.hashCode() : true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        humaneval.correct.GET_ROW gET_ROW14 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple17 = gET_ROW14.new Tuple((int) (short) 10, (int) (byte) 0);
        humaneval.correct.GET_ROW.Tuple tuple20 = gET_ROW14.new Tuple((int) 'a', (int) (byte) 1);
        boolean boolean21 = tuple3.equals((java.lang.Object) tuple20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tuple3 and tuple17", tuple3.equals(tuple17) ? tuple3.hashCode() == tuple17.hashCode() : true);
    }
}

