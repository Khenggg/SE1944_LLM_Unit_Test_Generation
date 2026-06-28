package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SORT_ARRAY_BINARY_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test001");
        humaneval.correct.SORT_ARRAY_BINARY sORT_ARRAY_BINARY0 = new humaneval.correct.SORT_ARRAY_BINARY();
        java.lang.Class<?> wildcardClass1 = sORT_ARRAY_BINARY0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test002");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test004");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test005");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ArrayList<java.lang.Integer> intList1 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.sort(java.util.Comparator)\" because \"list\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test006");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test007");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test008");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass9 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test009");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test010");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test011");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test012");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.lang.Class<?> wildcardClass7 = intList4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test013");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test014");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test015");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test016");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test017");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test018");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.lang.Class<?> wildcardClass8 = intList4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test019");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test020");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test021");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass9 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test022");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test023");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test024");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test025");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test026");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.lang.Class<?> wildcardClass8 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test027");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test028");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test029");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test030");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test031");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 100, (-1), (-1) });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test032");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass8 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test033");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test034");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test035");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test036");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test037");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test038");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test039");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test040");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test041");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test042");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass11 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test043");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass10 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test044");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test045");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test046");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass8 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 100, (-1), (-1) });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test047");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test048");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test049");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test050");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass10 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test051");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test052");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test053");
        int int1 = humaneval.correct.SORT_ARRAY_BINARY.number_ones((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test054");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test055");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test056");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test057");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test058");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass11 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test059");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test060");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test061");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test062");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test063");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test064");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test065");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass14 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test066");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test067");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test068");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test069");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass8 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 100, (-1), (-1) });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test070");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test071");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test072");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test073");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test074");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test075");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test076");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test077");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test078");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.lang.Class<?> wildcardClass7 = intList4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 100, (-1), (-1) });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test079");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass10 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test080");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass12 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test081");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList17 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.lang.Class<?> wildcardClass18 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test082");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList17 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList18 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList17);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test083");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test084");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test085");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test086");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test087");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test088");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test089");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test090");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test091");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test092");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass15 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test093");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { (-1), 2, 3, 1, 3, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), 2, 3, 1, 3, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test094");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass13 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test095");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test096");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test097");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test098");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test099");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test100");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test101");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass12 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test102");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test103");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test104");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test105");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test106");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList4 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList2);
        java.util.ArrayList<java.lang.Integer> intList5 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.lang.Class<?> wildcardClass6 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 100 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test107");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test108");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.lang.Class<?> wildcardClass10 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test109");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test110");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.lang.Class<?> wildcardClass15 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test111");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.lang.Class<?> wildcardClass14 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test112");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass11 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test113");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test114");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.lang.Class<?> wildcardClass9 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test115");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test116");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test117");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass13 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test118");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.lang.Class<?> wildcardClass16 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test119");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test120");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test121");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass16 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test122");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList15);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test123");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList4 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList2);
        java.lang.Class<?> wildcardClass5 = intList4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 100 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test124");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass10 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test125");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass12 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test126");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test127");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass14 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test128");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test129");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test130");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test131");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test132");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test133");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test134");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test135");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test136");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test137");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass12 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test138");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList17 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass18 = intList17.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test139");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test140");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test141");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass9 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test142");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test143");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test144");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test145");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test146");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test147");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass11 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test148");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 100, (-1), (-1) });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test149");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test150");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList15);
        java.util.ArrayList<java.lang.Integer> intList17 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList15);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test151");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass14 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test152");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test153");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test154");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.lang.Class<?> wildcardClass12 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test155");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList4 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList2);
        java.lang.Class<?> wildcardClass5 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 100 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test156");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList4 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList2);
        java.util.ArrayList<java.lang.Integer> intList5 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList2);
        java.lang.Class<?> wildcardClass6 = intList5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 100 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test157");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test158");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 2, 1, (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.lang.Class<?> wildcardClass9 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 2, 1, (-1), 3 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test159");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test160");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test161");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, (-1), 3, 1, 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, (-1), 3, 1, 100, 100 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test162");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test163");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList17 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass18 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test164");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.lang.Class<?> wildcardClass11 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test165");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList17 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList18 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test166");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass13 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test167");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.lang.Class<?> wildcardClass17 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test168");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test169");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test170");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test171");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.util.ArrayList<java.lang.Integer> intList4 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList2);
        java.util.ArrayList<java.lang.Integer> intList5 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList2);
        java.lang.Class<?> wildcardClass6 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 100 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test172");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.lang.Class<?> wildcardClass14 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test173");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass14 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test174");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test175");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test176");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test177");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test178");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 100, (-1), (-1) });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test179");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test180");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList15);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test181");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test182");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test183");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass12 = intList11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test184");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass10 = intList9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test185");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass16 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test186");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, (-1), 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 0, (-1), 1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test187");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList15);
        java.lang.Class<?> wildcardClass17 = intList15.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test188");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test189");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test190");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test191");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test192");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass16 = intList13.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test193");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.lang.Class<?> wildcardClass15 = intList6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test194");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test195");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList7);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList9);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList10);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList16 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList17 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList18 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList17);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 3, 3, 3, 1, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList17);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test196");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 10, 100, 100, 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList9 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList10 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList11 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList8);
        java.util.ArrayList<java.lang.Integer> intList12 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList11);
        java.util.ArrayList<java.lang.Integer> intList13 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList12);
        java.util.ArrayList<java.lang.Integer> intList14 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList13);
        java.util.ArrayList<java.lang.Integer> intList15 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList14);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 10, 100, 100, 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList9);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList13);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList15);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test197");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        java.util.ArrayList<java.lang.Integer> intList6 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList6);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { 100, (-1), (-1) });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SORT_ARRAY_BINARY_RandoopTest0.test198");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 0, 3, 100, 0 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        java.util.ArrayList<java.lang.Integer> intList7 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.util.ArrayList<java.lang.Integer> intList8 = humaneval.correct.SORT_ARRAY_BINARY.sort_array_binary(intList5);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 0, 3, 100, 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intList7);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

