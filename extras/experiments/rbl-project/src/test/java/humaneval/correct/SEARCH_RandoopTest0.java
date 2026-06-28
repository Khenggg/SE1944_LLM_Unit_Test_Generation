package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SEARCH_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test001");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = humaneval.correct.SEARCH.search(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test003");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.correct.SEARCH.search(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test004");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass3 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test005");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass4 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test006");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test007");
        humaneval.correct.SEARCH sEARCH0 = new humaneval.correct.SEARCH();
        java.lang.Class<?> wildcardClass1 = sEARCH0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test008");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass2 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test009");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = humaneval.correct.SEARCH.search(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 32, (-1), 1 });
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test010");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test011");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test012");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test013");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test014");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test015");
        int[] intArray3 = new int[] { 1, (-1), '4' };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = humaneval.correct.SEARCH.search(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, (-1), 52 });
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test016");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test017");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test018");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test019");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test020");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test021");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test022");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test023");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test024");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test025");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test026");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test027");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test028");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test029");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test030");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test031");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test032");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test033");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test034");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test035");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test036");
        int[] intArray4 = new int[] { (byte) 10, 'a', (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = humaneval.correct.SEARCH.search(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 97, (-1), 35 });
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test037");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test038");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test039");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test040");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test041");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test042");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test043");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test044");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test045");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test046");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test047");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test048");
        int[] intArray6 = new int[] { 0, (short) 100, 1, (short) -1, 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = humaneval.correct.SEARCH.search(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 100, 1, (-1), 100, 97 });
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test049");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test050");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test051");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass5 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test052");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test053");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test054");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test055");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        int int8 = humaneval.correct.SEARCH.search(intArray6);
        int int9 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test056");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test057");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        int int8 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test058");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test059");
        int[] intArray5 = new int[] { 0, 1, (-1), (-1), (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = humaneval.correct.SEARCH.search(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 1, (-1), (-1), 1 });
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test060");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass7 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test061");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test062");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        int int17 = humaneval.correct.SEARCH.search(intArray0);
        int int18 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test063");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test064");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test065");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        int int8 = humaneval.correct.SEARCH.search(intArray6);
        int int9 = humaneval.correct.SEARCH.search(intArray6);
        int int10 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test066");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        int int8 = humaneval.correct.SEARCH.search(intArray6);
        int int9 = humaneval.correct.SEARCH.search(intArray6);
        int int10 = humaneval.correct.SEARCH.search(intArray6);
        int int11 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test067");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test068");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test069");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test070");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test071");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test072");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        int int7 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test073");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test074");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test075");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test076");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        int int17 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test077");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        int int8 = humaneval.correct.SEARCH.search(intArray6);
        int int9 = humaneval.correct.SEARCH.search(intArray6);
        int int10 = humaneval.correct.SEARCH.search(intArray6);
        int int11 = humaneval.correct.SEARCH.search(intArray6);
        int int12 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test078");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test079");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        int int7 = humaneval.correct.SEARCH.search(intArray1);
        int int8 = humaneval.correct.SEARCH.search(intArray1);
        int int9 = humaneval.correct.SEARCH.search(intArray1);
        int int10 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test080");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test081");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test082");
        int[] intArray2 = new int[] { (short) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int3 = humaneval.correct.SEARCH.search(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1, (-1) });
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test083");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test084");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test085");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        int int7 = humaneval.correct.SEARCH.search(intArray1);
        int int8 = humaneval.correct.SEARCH.search(intArray1);
        int int9 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test086");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 1, 35, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test087");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test088");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test089");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 1, 35, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test090");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        int int17 = humaneval.correct.SEARCH.search(intArray0);
        int int18 = humaneval.correct.SEARCH.search(intArray0);
        int int19 = humaneval.correct.SEARCH.search(intArray0);
        int int20 = humaneval.correct.SEARCH.search(intArray0);
        int int21 = humaneval.correct.SEARCH.search(intArray0);
        int int22 = humaneval.correct.SEARCH.search(intArray0);
        int int23 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass24 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test091");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        int int13 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test092");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        int int7 = humaneval.correct.SEARCH.search(intArray1);
        int int8 = humaneval.correct.SEARCH.search(intArray1);
        int int9 = humaneval.correct.SEARCH.search(intArray1);
        int int10 = humaneval.correct.SEARCH.search(intArray1);
        int int11 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test093");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        int int17 = humaneval.correct.SEARCH.search(intArray0);
        int int18 = humaneval.correct.SEARCH.search(intArray0);
        int int19 = humaneval.correct.SEARCH.search(intArray0);
        int int20 = humaneval.correct.SEARCH.search(intArray0);
        int int21 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass22 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test094");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        int int17 = humaneval.correct.SEARCH.search(intArray0);
        int int18 = humaneval.correct.SEARCH.search(intArray0);
        int int19 = humaneval.correct.SEARCH.search(intArray0);
        int int20 = humaneval.correct.SEARCH.search(intArray0);
        int int21 = humaneval.correct.SEARCH.search(intArray0);
        int int22 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test095");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        int int17 = humaneval.correct.SEARCH.search(intArray0);
        int int18 = humaneval.correct.SEARCH.search(intArray0);
        int int19 = humaneval.correct.SEARCH.search(intArray0);
        int int20 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test096");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        int int14 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test097");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test098");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 1, 35, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test099");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass13 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test100");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        int int7 = humaneval.correct.SEARCH.search(intArray1);
        int int8 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test101");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        int int14 = humaneval.correct.SEARCH.search(intArray3);
        int int15 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test102");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        int int13 = humaneval.correct.SEARCH.search(intArray5);
        int int14 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass15 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test103");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test104");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        int int13 = humaneval.correct.SEARCH.search(intArray5);
        int int14 = humaneval.correct.SEARCH.search(intArray5);
        int int15 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test105");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        int int8 = humaneval.correct.SEARCH.search(intArray6);
        int int9 = humaneval.correct.SEARCH.search(intArray6);
        int int10 = humaneval.correct.SEARCH.search(intArray6);
        int int11 = humaneval.correct.SEARCH.search(intArray6);
        int int12 = humaneval.correct.SEARCH.search(intArray6);
        int int13 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test106");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 1, 35, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test107");
        int[] intArray2 = new int[] { '4', (short) 0 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 52, 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test108");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        int int17 = humaneval.correct.SEARCH.search(intArray0);
        int int18 = humaneval.correct.SEARCH.search(intArray0);
        int int19 = humaneval.correct.SEARCH.search(intArray0);
        int int20 = humaneval.correct.SEARCH.search(intArray0);
        int int21 = humaneval.correct.SEARCH.search(intArray0);
        int int22 = humaneval.correct.SEARCH.search(intArray0);
        int int23 = humaneval.correct.SEARCH.search(intArray0);
        int int24 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test109");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        int int7 = humaneval.correct.SEARCH.search(intArray1);
        int int8 = humaneval.correct.SEARCH.search(intArray1);
        int int9 = humaneval.correct.SEARCH.search(intArray1);
        int int10 = humaneval.correct.SEARCH.search(intArray1);
        int int11 = humaneval.correct.SEARCH.search(intArray1);
        int int12 = humaneval.correct.SEARCH.search(intArray1);
        int int13 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test110");
        int[] intArray3 = new int[] { (short) 10, (short) 0, (short) 10 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 0, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test111");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        int int14 = humaneval.correct.SEARCH.search(intArray3);
        int int15 = humaneval.correct.SEARCH.search(intArray3);
        int int16 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test112");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test113");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test114");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        int int8 = humaneval.correct.SEARCH.search(intArray6);
        int int9 = humaneval.correct.SEARCH.search(intArray6);
        int int10 = humaneval.correct.SEARCH.search(intArray6);
        int int11 = humaneval.correct.SEARCH.search(intArray6);
        int int12 = humaneval.correct.SEARCH.search(intArray6);
        int int13 = humaneval.correct.SEARCH.search(intArray6);
        int int14 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test115");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        int int7 = humaneval.correct.SEARCH.search(intArray1);
        int int8 = humaneval.correct.SEARCH.search(intArray1);
        int int9 = humaneval.correct.SEARCH.search(intArray1);
        int int10 = humaneval.correct.SEARCH.search(intArray1);
        int int11 = humaneval.correct.SEARCH.search(intArray1);
        int int12 = humaneval.correct.SEARCH.search(intArray1);
        int int13 = humaneval.correct.SEARCH.search(intArray1);
        int int14 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass15 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test116");
        int[] intArray2 = new int[] { '4', (short) 0 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 52, 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test117");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        int int13 = humaneval.correct.SEARCH.search(intArray5);
        int int14 = humaneval.correct.SEARCH.search(intArray5);
        int int15 = humaneval.correct.SEARCH.search(intArray5);
        int int16 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass17 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test118");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        int int18 = humaneval.correct.SEARCH.search(intArray2);
        int int19 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test119");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        int int18 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test120");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test121");
        int[] intArray3 = new int[] { (short) 10, (short) 0, (short) 10 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 0, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test122");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        int int14 = humaneval.correct.SEARCH.search(intArray3);
        int int15 = humaneval.correct.SEARCH.search(intArray3);
        int int16 = humaneval.correct.SEARCH.search(intArray3);
        int int17 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test123");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test124");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test125");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        int int7 = humaneval.correct.SEARCH.search(intArray1);
        int int8 = humaneval.correct.SEARCH.search(intArray1);
        int int9 = humaneval.correct.SEARCH.search(intArray1);
        int int10 = humaneval.correct.SEARCH.search(intArray1);
        int int11 = humaneval.correct.SEARCH.search(intArray1);
        int int12 = humaneval.correct.SEARCH.search(intArray1);
        int int13 = humaneval.correct.SEARCH.search(intArray1);
        int int14 = humaneval.correct.SEARCH.search(intArray1);
        int int15 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass16 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test126");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 1, 35, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test127");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        int int18 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test128");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        int int18 = humaneval.correct.SEARCH.search(intArray2);
        int int19 = humaneval.correct.SEARCH.search(intArray2);
        int int20 = humaneval.correct.SEARCH.search(intArray2);
        int int21 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test129");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        int int8 = humaneval.correct.SEARCH.search(intArray6);
        int int9 = humaneval.correct.SEARCH.search(intArray6);
        int int10 = humaneval.correct.SEARCH.search(intArray6);
        int int11 = humaneval.correct.SEARCH.search(intArray6);
        int int12 = humaneval.correct.SEARCH.search(intArray6);
        int int13 = humaneval.correct.SEARCH.search(intArray6);
        int int14 = humaneval.correct.SEARCH.search(intArray6);
        int int15 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test130");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        int int17 = humaneval.correct.SEARCH.search(intArray0);
        int int18 = humaneval.correct.SEARCH.search(intArray0);
        int int19 = humaneval.correct.SEARCH.search(intArray0);
        int int20 = humaneval.correct.SEARCH.search(intArray0);
        int int21 = humaneval.correct.SEARCH.search(intArray0);
        int int22 = humaneval.correct.SEARCH.search(intArray0);
        int int23 = humaneval.correct.SEARCH.search(intArray0);
        int int24 = humaneval.correct.SEARCH.search(intArray0);
        int int25 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass26 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test131");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        int int13 = humaneval.correct.SEARCH.search(intArray5);
        int int14 = humaneval.correct.SEARCH.search(intArray5);
        int int15 = humaneval.correct.SEARCH.search(intArray5);
        int int16 = humaneval.correct.SEARCH.search(intArray5);
        int int17 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass18 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test132");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        int int17 = humaneval.correct.SEARCH.search(intArray0);
        int int18 = humaneval.correct.SEARCH.search(intArray0);
        int int19 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test133");
        int[] intArray3 = new int[] { (short) 10, (short) 0, (short) 10 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 0, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test134");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        int int18 = humaneval.correct.SEARCH.search(intArray2);
        int int19 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test135");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        int int18 = humaneval.correct.SEARCH.search(intArray2);
        int int19 = humaneval.correct.SEARCH.search(intArray2);
        int int20 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test136");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 1, 35, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test137");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        int int14 = humaneval.correct.SEARCH.search(intArray3);
        int int15 = humaneval.correct.SEARCH.search(intArray3);
        int int16 = humaneval.correct.SEARCH.search(intArray3);
        int int17 = humaneval.correct.SEARCH.search(intArray3);
        int int18 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test138");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass13 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 1, 35, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test139");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1, 100 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test140");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        int int7 = humaneval.correct.SEARCH.search(intArray1);
        int int8 = humaneval.correct.SEARCH.search(intArray1);
        int int9 = humaneval.correct.SEARCH.search(intArray1);
        int int10 = humaneval.correct.SEARCH.search(intArray1);
        int int11 = humaneval.correct.SEARCH.search(intArray1);
        int int12 = humaneval.correct.SEARCH.search(intArray1);
        int int13 = humaneval.correct.SEARCH.search(intArray1);
        int int14 = humaneval.correct.SEARCH.search(intArray1);
        int int15 = humaneval.correct.SEARCH.search(intArray1);
        int int16 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass17 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test141");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        int int13 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 1, 35, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test142");
        int[] intArray2 = new int[] { 10, 'a' };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        int int18 = humaneval.correct.SEARCH.search(intArray2);
        int int19 = humaneval.correct.SEARCH.search(intArray2);
        int int20 = humaneval.correct.SEARCH.search(intArray2);
        int int21 = humaneval.correct.SEARCH.search(intArray2);
        int int22 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 97 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test143");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test144");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test145");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        int int14 = humaneval.correct.SEARCH.search(intArray3);
        int int15 = humaneval.correct.SEARCH.search(intArray3);
        int int16 = humaneval.correct.SEARCH.search(intArray3);
        int int17 = humaneval.correct.SEARCH.search(intArray3);
        int int18 = humaneval.correct.SEARCH.search(intArray3);
        int int19 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test146");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        int int18 = humaneval.correct.SEARCH.search(intArray2);
        int int19 = humaneval.correct.SEARCH.search(intArray2);
        int int20 = humaneval.correct.SEARCH.search(intArray2);
        int int21 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test147");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        int int13 = humaneval.correct.SEARCH.search(intArray5);
        int int14 = humaneval.correct.SEARCH.search(intArray5);
        int int15 = humaneval.correct.SEARCH.search(intArray5);
        int int16 = humaneval.correct.SEARCH.search(intArray5);
        int int17 = humaneval.correct.SEARCH.search(intArray5);
        int int18 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass19 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test148");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test149");
        int[] intArray5 = new int[] { 'a', '#', '#', (short) 100, '#' };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 35, 35, 100, 35 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test150");
        int[] intArray5 = new int[] { 'a', '#', '#', (short) 100, '#' };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 35, 35, 100, 35 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test151");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        int int13 = humaneval.correct.SEARCH.search(intArray5);
        int int14 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass15 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 1, 35, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test152");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        int int8 = humaneval.correct.SEARCH.search(intArray6);
        int int9 = humaneval.correct.SEARCH.search(intArray6);
        int int10 = humaneval.correct.SEARCH.search(intArray6);
        int int11 = humaneval.correct.SEARCH.search(intArray6);
        int int12 = humaneval.correct.SEARCH.search(intArray6);
        int int13 = humaneval.correct.SEARCH.search(intArray6);
        int int14 = humaneval.correct.SEARCH.search(intArray6);
        int int15 = humaneval.correct.SEARCH.search(intArray6);
        int int16 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test153");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test154");
        int[] intArray2 = new int[] { (byte) 1, 10 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1, 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test155");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        int int7 = humaneval.correct.SEARCH.search(intArray1);
        int int8 = humaneval.correct.SEARCH.search(intArray1);
        int int9 = humaneval.correct.SEARCH.search(intArray1);
        int int10 = humaneval.correct.SEARCH.search(intArray1);
        int int11 = humaneval.correct.SEARCH.search(intArray1);
        int int12 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass13 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test156");
        int[] intArray2 = new int[] { '4', (short) 0 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 52, 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test157");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test158");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test159");
        int[] intArray2 = new int[] { (short) 0, (short) 10 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test160");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 1, 100 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test161");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        int int8 = humaneval.correct.SEARCH.search(intArray6);
        int int9 = humaneval.correct.SEARCH.search(intArray6);
        int int10 = humaneval.correct.SEARCH.search(intArray6);
        int int11 = humaneval.correct.SEARCH.search(intArray6);
        int int12 = humaneval.correct.SEARCH.search(intArray6);
        int int13 = humaneval.correct.SEARCH.search(intArray6);
        int int14 = humaneval.correct.SEARCH.search(intArray6);
        int int15 = humaneval.correct.SEARCH.search(intArray6);
        int int16 = humaneval.correct.SEARCH.search(intArray6);
        int int17 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test162");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        int int14 = humaneval.correct.SEARCH.search(intArray3);
        int int15 = humaneval.correct.SEARCH.search(intArray3);
        int int16 = humaneval.correct.SEARCH.search(intArray3);
        int int17 = humaneval.correct.SEARCH.search(intArray3);
        int int18 = humaneval.correct.SEARCH.search(intArray3);
        int int19 = humaneval.correct.SEARCH.search(intArray3);
        int int20 = humaneval.correct.SEARCH.search(intArray3);
        int int21 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test163");
        int[] intArray2 = new int[] { '4', (short) 0 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 52, 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test164");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        int int17 = humaneval.correct.SEARCH.search(intArray0);
        int int18 = humaneval.correct.SEARCH.search(intArray0);
        int int19 = humaneval.correct.SEARCH.search(intArray0);
        int int20 = humaneval.correct.SEARCH.search(intArray0);
        int int21 = humaneval.correct.SEARCH.search(intArray0);
        int int22 = humaneval.correct.SEARCH.search(intArray0);
        int int23 = humaneval.correct.SEARCH.search(intArray0);
        int int24 = humaneval.correct.SEARCH.search(intArray0);
        int int25 = humaneval.correct.SEARCH.search(intArray0);
        int int26 = humaneval.correct.SEARCH.search(intArray0);
        java.lang.Class<?> wildcardClass27 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test165");
        int[] intArray6 = new int[] { (byte) 0, ' ', 'a', 10, ' ', (short) 10 };
        int int7 = humaneval.correct.SEARCH.search(intArray6);
        int int8 = humaneval.correct.SEARCH.search(intArray6);
        int int9 = humaneval.correct.SEARCH.search(intArray6);
        int int10 = humaneval.correct.SEARCH.search(intArray6);
        int int11 = humaneval.correct.SEARCH.search(intArray6);
        int int12 = humaneval.correct.SEARCH.search(intArray6);
        int int13 = humaneval.correct.SEARCH.search(intArray6);
        int int14 = humaneval.correct.SEARCH.search(intArray6);
        int int15 = humaneval.correct.SEARCH.search(intArray6);
        int int16 = humaneval.correct.SEARCH.search(intArray6);
        int int17 = humaneval.correct.SEARCH.search(intArray6);
        int int18 = humaneval.correct.SEARCH.search(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 32, 97, 10, 32, 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test166");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        int int18 = humaneval.correct.SEARCH.search(intArray2);
        int int19 = humaneval.correct.SEARCH.search(intArray2);
        int int20 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test167");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        int int14 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test168");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        int int18 = humaneval.correct.SEARCH.search(intArray2);
        int int19 = humaneval.correct.SEARCH.search(intArray2);
        int int20 = humaneval.correct.SEARCH.search(intArray2);
        int int21 = humaneval.correct.SEARCH.search(intArray2);
        int int22 = humaneval.correct.SEARCH.search(intArray2);
        int int23 = humaneval.correct.SEARCH.search(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test169");
        int[] intArray3 = new int[] { (short) 10, (short) 0, (short) 10 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 0, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test170");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        int int3 = humaneval.correct.SEARCH.search(intArray1);
        int int4 = humaneval.correct.SEARCH.search(intArray1);
        int int5 = humaneval.correct.SEARCH.search(intArray1);
        int int6 = humaneval.correct.SEARCH.search(intArray1);
        int int7 = humaneval.correct.SEARCH.search(intArray1);
        int int8 = humaneval.correct.SEARCH.search(intArray1);
        int int9 = humaneval.correct.SEARCH.search(intArray1);
        int int10 = humaneval.correct.SEARCH.search(intArray1);
        int int11 = humaneval.correct.SEARCH.search(intArray1);
        int int12 = humaneval.correct.SEARCH.search(intArray1);
        int int13 = humaneval.correct.SEARCH.search(intArray1);
        int int14 = humaneval.correct.SEARCH.search(intArray1);
        int int15 = humaneval.correct.SEARCH.search(intArray1);
        int int16 = humaneval.correct.SEARCH.search(intArray1);
        int int17 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass18 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test171");
        int[] intArray3 = new int[] { (byte) 1, 'a', (short) 100 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        int int14 = humaneval.correct.SEARCH.search(intArray3);
        int int15 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test172");
        int[] intArray1 = new int[] { (short) 0 };
        int int2 = humaneval.correct.SEARCH.search(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test173");
        int[] intArray5 = new int[] { 'a', '#', '#', (short) 100, '#' };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 35, 35, 100, 35 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test174");
        int[] intArray5 = new int[] { '4', (byte) 10, (short) 0, 1, 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        int int13 = humaneval.correct.SEARCH.search(intArray5);
        int int14 = humaneval.correct.SEARCH.search(intArray5);
        int int15 = humaneval.correct.SEARCH.search(intArray5);
        int int16 = humaneval.correct.SEARCH.search(intArray5);
        int int17 = humaneval.correct.SEARCH.search(intArray5);
        int int18 = humaneval.correct.SEARCH.search(intArray5);
        int int19 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass20 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, 10, 0, 1, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test175");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        int int10 = humaneval.correct.SEARCH.search(intArray2);
        int int11 = humaneval.correct.SEARCH.search(intArray2);
        int int12 = humaneval.correct.SEARCH.search(intArray2);
        int int13 = humaneval.correct.SEARCH.search(intArray2);
        int int14 = humaneval.correct.SEARCH.search(intArray2);
        int int15 = humaneval.correct.SEARCH.search(intArray2);
        int int16 = humaneval.correct.SEARCH.search(intArray2);
        int int17 = humaneval.correct.SEARCH.search(intArray2);
        int int18 = humaneval.correct.SEARCH.search(intArray2);
        int int19 = humaneval.correct.SEARCH.search(intArray2);
        int int20 = humaneval.correct.SEARCH.search(intArray2);
        int int21 = humaneval.correct.SEARCH.search(intArray2);
        int int22 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test176");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.correct.SEARCH.search(intArray0);
        int int2 = humaneval.correct.SEARCH.search(intArray0);
        int int3 = humaneval.correct.SEARCH.search(intArray0);
        int int4 = humaneval.correct.SEARCH.search(intArray0);
        int int5 = humaneval.correct.SEARCH.search(intArray0);
        int int6 = humaneval.correct.SEARCH.search(intArray0);
        int int7 = humaneval.correct.SEARCH.search(intArray0);
        int int8 = humaneval.correct.SEARCH.search(intArray0);
        int int9 = humaneval.correct.SEARCH.search(intArray0);
        int int10 = humaneval.correct.SEARCH.search(intArray0);
        int int11 = humaneval.correct.SEARCH.search(intArray0);
        int int12 = humaneval.correct.SEARCH.search(intArray0);
        int int13 = humaneval.correct.SEARCH.search(intArray0);
        int int14 = humaneval.correct.SEARCH.search(intArray0);
        int int15 = humaneval.correct.SEARCH.search(intArray0);
        int int16 = humaneval.correct.SEARCH.search(intArray0);
        int int17 = humaneval.correct.SEARCH.search(intArray0);
        int int18 = humaneval.correct.SEARCH.search(intArray0);
        int int19 = humaneval.correct.SEARCH.search(intArray0);
        int int20 = humaneval.correct.SEARCH.search(intArray0);
        int int21 = humaneval.correct.SEARCH.search(intArray0);
        int int22 = humaneval.correct.SEARCH.search(intArray0);
        int int23 = humaneval.correct.SEARCH.search(intArray0);
        int int24 = humaneval.correct.SEARCH.search(intArray0);
        int int25 = humaneval.correct.SEARCH.search(intArray0);
        int int26 = humaneval.correct.SEARCH.search(intArray0);
        int int27 = humaneval.correct.SEARCH.search(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test177");
        int[] intArray3 = new int[] { (short) 10, (short) 0, (short) 10 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 0, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test178");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        int int14 = humaneval.correct.SEARCH.search(intArray3);
        int int15 = humaneval.correct.SEARCH.search(intArray3);
        int int16 = humaneval.correct.SEARCH.search(intArray3);
        int int17 = humaneval.correct.SEARCH.search(intArray3);
        int int18 = humaneval.correct.SEARCH.search(intArray3);
        int int19 = humaneval.correct.SEARCH.search(intArray3);
        int int20 = humaneval.correct.SEARCH.search(intArray3);
        int int21 = humaneval.correct.SEARCH.search(intArray3);
        int int22 = humaneval.correct.SEARCH.search(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test179");
        int[] intArray3 = new int[] { '#', (byte) 100, 1 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        int int10 = humaneval.correct.SEARCH.search(intArray3);
        int int11 = humaneval.correct.SEARCH.search(intArray3);
        int int12 = humaneval.correct.SEARCH.search(intArray3);
        int int13 = humaneval.correct.SEARCH.search(intArray3);
        int int14 = humaneval.correct.SEARCH.search(intArray3);
        int int15 = humaneval.correct.SEARCH.search(intArray3);
        int int16 = humaneval.correct.SEARCH.search(intArray3);
        int int17 = humaneval.correct.SEARCH.search(intArray3);
        int int18 = humaneval.correct.SEARCH.search(intArray3);
        int int19 = humaneval.correct.SEARCH.search(intArray3);
        int int20 = humaneval.correct.SEARCH.search(intArray3);
        java.lang.Class<?> wildcardClass21 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 35, 100, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test180");
        int[] intArray3 = new int[] { (short) 10, (short) 0, (short) 10 };
        int int4 = humaneval.correct.SEARCH.search(intArray3);
        int int5 = humaneval.correct.SEARCH.search(intArray3);
        int int6 = humaneval.correct.SEARCH.search(intArray3);
        int int7 = humaneval.correct.SEARCH.search(intArray3);
        int int8 = humaneval.correct.SEARCH.search(intArray3);
        int int9 = humaneval.correct.SEARCH.search(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 0, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test181");
        int[] intArray5 = new int[] { 'a', '#', '#', (short) 100, '#' };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 35, 35, 100, 35 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test182");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        int int13 = humaneval.correct.SEARCH.search(intArray5);
        int int14 = humaneval.correct.SEARCH.search(intArray5);
        int int15 = humaneval.correct.SEARCH.search(intArray5);
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 1, 35, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test183");
        int[] intArray5 = new int[] { 100, (short) 10, 1, '#', (byte) 0 };
        int int6 = humaneval.correct.SEARCH.search(intArray5);
        int int7 = humaneval.correct.SEARCH.search(intArray5);
        int int8 = humaneval.correct.SEARCH.search(intArray5);
        int int9 = humaneval.correct.SEARCH.search(intArray5);
        int int10 = humaneval.correct.SEARCH.search(intArray5);
        int int11 = humaneval.correct.SEARCH.search(intArray5);
        int int12 = humaneval.correct.SEARCH.search(intArray5);
        int int13 = humaneval.correct.SEARCH.search(intArray5);
        int int14 = humaneval.correct.SEARCH.search(intArray5);
        int int15 = humaneval.correct.SEARCH.search(intArray5);
        int int16 = humaneval.correct.SEARCH.search(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 10, 1, 35, 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test184");
        int[] intArray4 = new int[] { 0, (short) 1, 0, (byte) 1 };
        int int5 = humaneval.correct.SEARCH.search(intArray4);
        int int6 = humaneval.correct.SEARCH.search(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 1, 0, 1 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test185");
        int[] intArray2 = new int[] { (short) 0, (short) 10 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test186");
        int[] intArray2 = new int[] { '4', (short) 0 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        int int7 = humaneval.correct.SEARCH.search(intArray2);
        int int8 = humaneval.correct.SEARCH.search(intArray2);
        int int9 = humaneval.correct.SEARCH.search(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 52, 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SEARCH_RandoopTest0.test187");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int int3 = humaneval.correct.SEARCH.search(intArray2);
        int int4 = humaneval.correct.SEARCH.search(intArray2);
        int int5 = humaneval.correct.SEARCH.search(intArray2);
        int int6 = humaneval.correct.SEARCH.search(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 10 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

