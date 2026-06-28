package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GET_ROW_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test01");
        humaneval.correct.GET_ROW gET_ROW0 = null;
        // The following exception was thrown during execution in test generation
        try {
            humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to humaneval.correct.GET_ROW$Tuple with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test02");
        humaneval.correct.GET_ROW gET_ROW0 = null;
        // The following exception was thrown during execution in test generation
        try {
            humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to humaneval.correct.GET_ROW$Tuple with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test03");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.size()\" because \"lst\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test04");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.size()\" because \"lst\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test05");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = intListList0.getClass();
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test06");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList4 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(tupleList4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test07");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList4 = humaneval.correct.GET_ROW.get_row(intListList0, (int) ' ');
        java.lang.Class<?> wildcardClass5 = tupleList4.getClass();
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(tupleList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test08");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.size()\" because \"lst\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test09");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList4 = humaneval.correct.GET_ROW.get_row(intListList0, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList0, 1);
        java.lang.Class<?> wildcardClass9 = intListList0.getClass();
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(tupleList4);
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test10");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList4 = humaneval.correct.GET_ROW.get_row(intListList0, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList0, (int) 'a');
        java.lang.Class<?> wildcardClass9 = intListList0.getClass();
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(tupleList4);
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test11");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList4 = humaneval.correct.GET_ROW.get_row(intListList0, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList0, 1);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList0, (int) '#');
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(tupleList4);
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test12");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        int int14 = tuple3.y;
        tuple3.y = (byte) 10;
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test13");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        humaneval.correct.GET_ROW.Tuple tuple6 = gET_ROW0.new Tuple((int) (byte) 100, 0);
        int int7 = tuple6.x;
        tuple6.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test14");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        boolean boolean15 = tuple3.equals((java.lang.Object) 1L);
        int int16 = tuple3.x;
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test15");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        humaneval.correct.GET_ROW.Tuple tuple6 = gET_ROW0.new Tuple((int) (byte) 100, 0);
        tuple6.x = '#';
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test16");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        int int14 = tuple3.y;
        tuple3.x = (byte) 100;
        int int17 = tuple3.x;
        int int18 = tuple3.x;
        tuple3.y = (short) -1;
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test17");
        humaneval.correct.GET_ROW gET_ROW0 = null;
        // The following exception was thrown during execution in test generation
        try {
            humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to humaneval.correct.GET_ROW$Tuple with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test18");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        int int4 = tuple3.x;
        int int5 = tuple3.x;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test19");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        java.lang.Class<?> wildcardClass14 = intListList4.getClass();
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test20");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        int int14 = tuple3.y;
        tuple3.x = (byte) 100;
        humaneval.correct.GET_ROW gET_ROW17 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple20 = gET_ROW17.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList21 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList23 = humaneval.correct.GET_ROW.get_row(intListList21, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList25 = humaneval.correct.GET_ROW.get_row(intListList21, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList27 = humaneval.correct.GET_ROW.get_row(intListList21, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList29 = humaneval.correct.GET_ROW.get_row(intListList21, (int) 'a');
        boolean boolean30 = tuple20.equals((java.lang.Object) intListList21);
        boolean boolean32 = tuple20.equals((java.lang.Object) 1L);
        tuple20.x = 100;
        tuple20.y = 100;
        tuple20.y = 'a';
        boolean boolean39 = tuple3.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(tupleList23);
        org.junit.Assert.assertNotNull(tupleList25);
        org.junit.Assert.assertNotNull(tupleList27);
        org.junit.Assert.assertNotNull(tupleList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test21");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList4 = humaneval.correct.GET_ROW.get_row(intListList0, 100);
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(tupleList4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test22");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        humaneval.correct.GET_ROW.Tuple tuple6 = gET_ROW0.new Tuple((int) (byte) 100, 0);
        int int7 = tuple6.y;
        tuple6.x = (short) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test23");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = tuple3.equals(obj14);
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test24");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        humaneval.correct.GET_ROW.Tuple tuple6 = gET_ROW0.new Tuple((int) 'a', (int) (byte) 1);
        humaneval.correct.GET_ROW.Tuple tuple9 = gET_ROW0.new Tuple((int) (short) 1, (-1));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test25");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        boolean boolean15 = tuple3.equals((java.lang.Object) 1L);
        tuple3.x = 100;
        tuple3.y = 100;
        int int20 = tuple3.y;
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test26");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        tuple3.x = (byte) 0;
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test27");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList4 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(tupleList4);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test28");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        int int14 = tuple3.y;
        boolean boolean16 = tuple3.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test29");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList4 = humaneval.correct.GET_ROW.get_row(intListList0, 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList0, 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) -1);
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(tupleList4);
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test30");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        tuple3.y = 10;
        tuple3.x = 10;
        java.lang.Class<?> wildcardClass8 = tuple3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test31");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        humaneval.correct.GET_ROW.Tuple tuple6 = gET_ROW0.new Tuple((int) (byte) 100, 0);
        tuple6.x = ' ';
        tuple6.y = 10;
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test32");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        tuple3.y = 10;
        tuple3.x = 10;
        tuple3.y = (byte) 10;
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test33");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList4 = humaneval.correct.GET_ROW.get_row(intListList0, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = tupleList6.getClass();
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(tupleList4);
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test34");
        humaneval.correct.GET_ROW gET_ROW0 = null;
        // The following exception was thrown during execution in test generation
        try {
            humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple(10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to humaneval.correct.GET_ROW$Tuple with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test35");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        int int14 = tuple3.x;
        tuple3.x = 52;
        int int17 = tuple3.y;
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test36");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        tuple3.y = 10;
        tuple3.x = 10;
        tuple3.x = 10;
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test37");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList4 = humaneval.correct.GET_ROW.get_row(intListList0, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) -1);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) -1);
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(tupleList4);
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test38");
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList0 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList2 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList4 = humaneval.correct.GET_ROW.get_row(intListList0, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList0, (int) '#');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList0, (int) (byte) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList0, (int) ' ');
        org.junit.Assert.assertNotNull(tupleList2);
        org.junit.Assert.assertNotNull(tupleList4);
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test39");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        boolean boolean15 = tuple3.equals((java.lang.Object) 1L);
        tuple3.x = 100;
        int int18 = tuple3.x;
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test40");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        int int14 = tuple3.y;
        tuple3.x = (byte) 100;
        int int17 = tuple3.x;
        humaneval.correct.GET_ROW gET_ROW18 = new humaneval.correct.GET_ROW();
        boolean boolean19 = tuple3.equals((java.lang.Object) gET_ROW18);
        int int20 = tuple3.y;
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test41");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        boolean boolean15 = tuple3.equals((java.lang.Object) 1L);
        tuple3.x = 100;
        tuple3.y = 100;
        tuple3.y = (short) 0;
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_ROW_RandoopTest0.test42");
        humaneval.correct.GET_ROW gET_ROW0 = new humaneval.correct.GET_ROW();
        humaneval.correct.GET_ROW.Tuple tuple3 = gET_ROW0.new Tuple((int) (short) 10, (int) (byte) 0);
        java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> intListList4 = new java.util.ArrayList<java.util.ArrayList<java.lang.Integer>>();
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList6 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 0);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList8 = humaneval.correct.GET_ROW.get_row(intListList4, (int) ' ');
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList10 = humaneval.correct.GET_ROW.get_row(intListList4, (int) (short) 10);
        java.util.ArrayList<humaneval.correct.GET_ROW.Tuple> tupleList12 = humaneval.correct.GET_ROW.get_row(intListList4, (int) 'a');
        boolean boolean13 = tuple3.equals((java.lang.Object) intListList4);
        int int14 = tuple3.y;
        tuple3.x = ' ';
        tuple3.y = (byte) 100;
        org.junit.Assert.assertNotNull(tupleList6);
        org.junit.Assert.assertNotNull(tupleList8);
        org.junit.Assert.assertNotNull(tupleList10);
        org.junit.Assert.assertNotNull(tupleList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }
}

