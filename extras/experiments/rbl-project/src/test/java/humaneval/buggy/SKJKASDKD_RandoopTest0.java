package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SKJKASDKD_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test001");
        humaneval.buggy.SKJKASDKD sKJKASDKD0 = new humaneval.buggy.SKJKASDKD();
        java.lang.Class<?> wildcardClass1 = sKJKASDKD0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test002");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test004");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test005");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime(48);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test006");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass2 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test007");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test008");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"lst\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test009");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test010");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test011");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test012");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass3 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test013");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test014");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test015");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test016");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test017");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test018");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass4 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test019");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test020");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test021");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test022");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test023");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test024");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test025");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test026");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test027");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test028");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test029");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test030");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test031");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test032");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test033");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test034");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test035");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test036");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime(112);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test037");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test038");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass6 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test039");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test040");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test041");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass8 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 112 + "'", int7 == 112);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test042");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test043");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test044");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test045");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass5 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test046");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test047");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test048");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test049");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test050");
        int[] intArray3 = new int[] { 48, (-1), (short) 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 48, (-1), 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test051");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test052");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime(49);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test053");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test054");
        int[] intArray3 = new int[] { 48, (-1), (short) 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 48, (-1), 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test055");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass7 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test056");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 112 + "'", int7 == 112);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 112 + "'", int8 == 112);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test057");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass6 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test058");
        boolean boolean1 = humaneval.buggy.SKJKASDKD.is_prime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test059");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test060");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test061");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test062");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test063");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test064");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass8 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test065");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test066");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test067");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test068");
        int[] intArray3 = new int[] { 48, (-1), (short) 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 48, (-1), 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test069");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test070");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test071");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test072");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test073");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test074");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test075");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test076");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass10 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 112 + "'", int7 == 112);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 112 + "'", int8 == 112);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test077");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test078");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test079");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test080");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test081");
        int[] intArray1 = new int[] { 1 };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test082");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (byte) -1, 49, (byte) 1 };
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 10, (-1), 49, 1 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test083");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test084");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test085");
        int[] intArray3 = new int[] { (short) 100, 10, 0 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test086");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass10 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test087");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test088");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (byte) -1, 49, (byte) 1 };
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 10, (-1), 49, 1 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test089");
        int[] intArray3 = new int[] { (-1), (byte) 10, (short) -1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 10, (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test090");
        int[] intArray1 = new int[] { 1 };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test091");
        int[] intArray1 = new int[] { 1 };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass5 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test092");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test093");
        int[] intArray3 = new int[] { (short) 100, 10, 0 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test094");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test095");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test096");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test097");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test098");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test099");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass12 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test100");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (byte) -1, 49, (byte) 1 };
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 10, (-1), 49, 1 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test101");
        int[] intArray3 = new int[] { (short) 100, 10, 0 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test102");
        int[] intArray3 = new int[] { (-1), (byte) 10, (short) -1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 10, (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test103");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 112 + "'", int7 == 112);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 112 + "'", int8 == 112);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 112 + "'", int10 == 112);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test104");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (byte) -1, 49, (byte) 1 };
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 10, (-1), 49, 1 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test105");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass16 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test106");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test107");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test108");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test109");
        int[] intArray3 = new int[] { (-1), (byte) 10, (short) -1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 10, (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test110");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test111");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test112");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test113");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test114");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass14 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test115");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass12 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 112 + "'", int7 == 112);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 112 + "'", int8 == 112);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 112 + "'", int10 == 112);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 112 + "'", int11 == 112);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test116");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test117");
        int[] intArray3 = new int[] { (-1), (byte) 10, (short) -1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 10, (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test118");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test119");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test120");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test121");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test122");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass18 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test123");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test124");
        int[] intArray1 = new int[] { 1 };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test125");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test126");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test127");
        int[] intArray3 = new int[] { (-1), (byte) 10, (short) -1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 10, (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test128");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test129");
        int[] intArray3 = new int[] { 48, (-1), (short) 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 48, (-1), 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test130");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test131");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test132");
        int[] intArray1 = new int[] { 1 };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass7 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test133");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass20 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test134");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test135");
        int[] intArray1 = new int[] { 1 };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test136");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test137");
        int[] intArray3 = new int[] { (short) 100, 10, 0 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test138");
        int[] intArray3 = new int[] { (short) 100, 10, 0 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test139");
        int[] intArray3 = new int[] { (short) 100, 10, 0 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test140");
        int[] intArray3 = new int[] { (-1), (byte) 10, (short) -1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 10, (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test141");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test142");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test143");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (byte) -1, 49, (byte) 1 };
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 10, (-1), 49, 1 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test144");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test145");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test146");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int22 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test147");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test148");
        int[] intArray3 = new int[] { 48, (-1), (short) 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 48, (-1), 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test149");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test150");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test151");
        int[] intArray1 = new int[] { 1 };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test152");
        int[] intArray3 = new int[] { 48, (-1), (short) 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 48, (-1), 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test153");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass14 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 112 + "'", int7 == 112);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 112 + "'", int8 == 112);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 112 + "'", int10 == 112);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 112 + "'", int11 == 112);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 112 + "'", int13 == 112);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test154");
        int[] intArray3 = new int[] { (-1), (byte) 10, (short) -1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 10, (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test155");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test156");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test157");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int22 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test158");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 112 + "'", int7 == 112);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 112 + "'", int8 == 112);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 112 + "'", int10 == 112);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 112 + "'", int11 == 112);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 112 + "'", int13 == 112);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 112 + "'", int14 == 112);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test159");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 112 + "'", int7 == 112);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 112 + "'", int8 == 112);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 112 + "'", int10 == 112);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 112 + "'", int11 == 112);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test160");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass22 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test161");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass22 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test162");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test163");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test164");
        int[] intArray3 = new int[] { 48, (-1), (short) 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 48, (-1), 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test165");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test166");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass13 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test167");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test168");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test169");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int22 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int23 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int24 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 49 + "'", int23 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49 + "'", int24 == 49);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test170");
        int[] intArray3 = new int[] { 1, (short) 0, (byte) 0 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 0, 0 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test171");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass18 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 112 + "'", int7 == 112);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 112 + "'", int8 == 112);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 112 + "'", int10 == 112);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 112 + "'", int11 == 112);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 112 + "'", int13 == 112);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 112 + "'", int14 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 112 + "'", int15 == 112);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 112 + "'", int16 == 112);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 112 + "'", int17 == 112);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test172");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test173");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test174");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test175");
        int[] intArray3 = new int[] { (-1), (byte) 10, (short) -1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 10, (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test176");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int22 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int23 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int24 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int25 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass26 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 49 + "'", int23 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49 + "'", int24 == 49);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 49 + "'", int25 == 49);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test177");
        int[] intArray5 = new int[] { (short) -1, (short) 10, (byte) -1, 49, (byte) 1 };
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray5);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1), 10, (-1), 49, 1 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test178");
        int[] intArray1 = new int[] { 1 };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test179");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test180");
        int[] intArray3 = new int[] { (short) 100, 10, 0 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test181");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test182");
        int[] intArray4 = new int[] { (short) 1, (byte) 0, (short) 0, 10 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1, 0, 0, 10 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test183");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test184");
        int[] intArray3 = new int[] { (-1), (byte) 10, (short) -1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 10, (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test185");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test186");
        int[] intArray3 = new int[] { (short) 100, 10, 0 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test187");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test188");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int22 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int23 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        java.lang.Class<?> wildcardClass24 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 48 + "'", int23 == 48);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test189");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test190");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test191");
        int[] intArray2 = new int[] { 49, 0 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 49, 0 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test192");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass16 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test193");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test194");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass17 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test195");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 112 + "'", int7 == 112);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 112 + "'", int8 == 112);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 112 + "'", int10 == 112);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 112 + "'", int11 == 112);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 112 + "'", int13 == 112);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 112 + "'", int14 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 112 + "'", int15 == 112);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 112 + "'", int16 == 112);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 112 + "'", int17 == 112);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 112 + "'", int18 == 112);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 112 + "'", int19 == 112);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test196");
        int[] intArray3 = new int[] { 10, (byte) 1, 1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 10, 1, 1 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test197");
        int[] intArray1 = new int[] { '#' };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass18 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 35 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test198");
        int[] intArray3 = new int[] { (-1), (byte) 10, (short) -1 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 10, (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test199");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test200");
        int[] intArray3 = new int[] { (byte) 1, (byte) 100, 100 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 100, 100 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test201");
        int[] intArray2 = new int[] { 49, (short) 100 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 49, 100 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test202");
        int[] intArray1 = new int[] { 1 };
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray1);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test203");
        int[] intArray6 = new int[] { (byte) 10, (short) -1, (byte) -1, '#', (short) 0, 100 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, (-1), (-1), 35, 0, 100 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test204");
        int[] intArray3 = new int[] { (short) 100, 10, 0 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 10, 0 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test205");
        int[] intArray6 = new int[] { 100, (byte) 0, (short) 100, 1, 10, (short) 1 };
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        int int22 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 0, 100, 1, 10, 1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test206");
        int[] intArray0 = new int[] {};
        int int1 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int2 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int22 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int23 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        int int24 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 48 + "'", int23 == 48);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 48 + "'", int24 == 48);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test207");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass21 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test208");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int22 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test209");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test210");
        int[] intArray2 = new int[] { (-1), (short) 100 };
        int int3 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test211");
        int[] intArray4 = new int[] { (byte) -1, (short) -1, 'a', 0 };
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray4);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), (-1), 97, 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 112 + "'", int5 == 112);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 112 + "'", int7 == 112);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 112 + "'", int8 == 112);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 112 + "'", int10 == 112);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 112 + "'", int11 == 112);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 112 + "'", int12 == 112);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 112 + "'", int13 == 112);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 112 + "'", int14 == 112);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 112 + "'", int15 == 112);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 112 + "'", int16 == 112);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 112 + "'", int17 == 112);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 112 + "'", int18 == 112);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SKJKASDKD_RandoopTest0.test212");
        int[] intArray3 = new int[] { (-1), (short) 100, 10 };
        int int4 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int5 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int6 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int7 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int8 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int9 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int10 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int11 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int12 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int13 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int14 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int15 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int16 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int17 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int18 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int19 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int20 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        int int21 = humaneval.buggy.SKJKASDKD.skjkasdkd(intArray3);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100, 10 });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}

