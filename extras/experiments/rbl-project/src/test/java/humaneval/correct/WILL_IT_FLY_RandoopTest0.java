package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WILL_IT_FLY_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test001");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test003");
        humaneval.correct.WILL_IT_FLY wILL_IT_FLY0 = new humaneval.correct.WILL_IT_FLY();
        java.lang.Class<?> wildcardClass1 = wILL_IT_FLY0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test004");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test005");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test006");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test007");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test008");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test009");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test010");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test011");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test012");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test013");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test014");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test015");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 100);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test016");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test017");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test018");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test019");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test020");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test021");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test022");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test023");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test024");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test025");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test026");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test027");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test028");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test029");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test030");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test031");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) (short) 100);
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, 1);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test032");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test033");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test034");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test035");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test036");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 1);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test037");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 100);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test038");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 10);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '4');
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test039");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test040");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test041");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test042");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test043");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test044");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test045");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test046");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 10);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test047");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) 'a');
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test048");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test049");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test050");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (short) 100);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test051");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test052");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test053");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test054");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 1);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 0);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test055");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test056");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '4');
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test057");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test058");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test059");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test060");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test061");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test062");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test063");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test064");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) -1);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test065");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) 'a');
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '4');
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test066");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) -1);
        boolean boolean23 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test067");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test068");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test069");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) 'a');
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '4');
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test070");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test071");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test072");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test073");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test074");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test075");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test076");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test077");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test078");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 100);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test079");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test080");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test081");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean22 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test082");
        int[] intArray2 = new int[] { 1, (short) 100 };
        boolean boolean4 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1, 100 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test083");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test084");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 1);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (-1));
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test085");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test086");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test087");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test088");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test089");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test090");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test091");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) (short) 100);
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test092");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test093");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) -1);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test094");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test095");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test096");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 10);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test097");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) -1);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test098");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test099");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test100");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test101");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test102");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test103");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test104");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test105");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test106");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test107");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test108");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test109");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test110");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test111");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test112");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test113");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 1);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test114");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 1);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (byte) 10);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test115");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test116");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test117");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test118");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test119");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (-1));
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test120");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test121");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 1);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (-1));
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test122");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test123");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test124");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test125");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test126");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test127");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test128");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test129");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) -1);
        boolean boolean23 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) -1);
        boolean boolean25 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test130");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test131");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test132");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 1);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test133");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (short) 1);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test134");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test135");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test136");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 1);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test137");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test138");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test139");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test140");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test141");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean22 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test142");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test143");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 1);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test144");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test145");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test146");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test147");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) -1);
        boolean boolean23 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) -1);
        boolean boolean25 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test148");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test149");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test150");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        boolean boolean22 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test151");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '4');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test152");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 1);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test153");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test154");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (byte) -1);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test155");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test156");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test157");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (byte) -1);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test158");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test159");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) -1);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test160");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) 'a');
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test161");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 0);
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test162");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test163");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (short) 1);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 0);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test164");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 1);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (-1));
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test165");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test166");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) -1);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test167");
        int[] intArray2 = new int[] { (short) 1, (short) 100 };
        boolean boolean4 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) '4');
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1, 100 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test168");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test169");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 1);
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test170");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) -1);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean23 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test171");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test172");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) 'a');
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test173");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test174");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test175");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) (short) 100);
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, 1);
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test176");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test177");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 1);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (-1));
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test178");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test179");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test180");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test181");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 100);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test182");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) (short) 100);
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test183");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test184");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) 'a');
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test185");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test186");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test187");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (-1));
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 10);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test188");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test189");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 100);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test190");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) 'a');
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test191");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test192");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 100);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean22 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test193");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean22 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test194");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test195");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) -1);
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 10);
        boolean boolean23 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test196");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 10);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test197");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test198");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 1);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (-1));
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test199");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test200");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test201");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test202");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 0);
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean23 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test203");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 1);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) '#');
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 100);
        boolean boolean23 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test204");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) -1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean22 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test205");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 1);
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test206");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test207");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"q\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test208");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 100);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test209");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) (short) 100);
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) (byte) -1);
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test210");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test211");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test212");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 100);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test213");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 0);
        boolean boolean18 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 10);
        boolean boolean20 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 1);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test214");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 0);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) ' ');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test215");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 10);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 1);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) 'a');
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test216");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 10);
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean19 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean21 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) -1);
        boolean boolean23 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) -1);
        boolean boolean25 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test217");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 10);
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, 1);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) (byte) 10);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test218");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) '#');
        boolean boolean8 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        boolean boolean10 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (byte) 100);
        boolean boolean12 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean14 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, (int) (short) 10);
        boolean boolean16 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WILL_IT_FLY_RandoopTest0.test219");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean7 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean9 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (short) 0);
        boolean boolean11 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) (byte) 100);
        boolean boolean13 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        boolean boolean15 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, (int) ' ');
        boolean boolean17 = humaneval.correct.WILL_IT_FLY.will_it_fly(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}

