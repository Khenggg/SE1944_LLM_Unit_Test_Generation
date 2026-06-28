package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MIN_PATH_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test01");
        humaneval.buggy.MIN_PATH mIN_PATH0 = new humaneval.buggy.MIN_PATH();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test02");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[][] intArray3 = new int[][] { intArray0, intArray1, intArray2 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = humaneval.buggy.MIN_PATH.min_path(intArray3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test03");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test04");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test05");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test06");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test07");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test08");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test09");
        int[] intArray6 = new int[] { ' ', 100, (byte) 1, (byte) 1, (byte) 10, 10 };
        int[] intArray13 = new int[] { ' ', 100, (byte) 1, (byte) 1, (byte) 10, 10 };
        int[] intArray20 = new int[] { ' ', 100, (byte) 1, (byte) 1, (byte) 10, 10 };
        int[][] intArray21 = new int[][] { intArray6, intArray13, intArray20 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = humaneval.buggy.MIN_PATH.min_path(intArray21, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 100, 1, 1, 10, 10 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 100, 1, 1, 10, 10 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 32, 100, 1, 1, 10, 10 });
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test10");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test11");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test12");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, 100);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test13");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test14");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test15");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test16");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test17");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test18");
        int[][] intArray0 = new int[][] {};
        int[] intArray2 = humaneval.buggy.MIN_PATH.min_path(intArray0, 0);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test19");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, 100);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test20");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test21");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test22");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test23");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test24");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = humaneval.buggy.MIN_PATH.min_path(intArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test25");
        int[][] intArray0 = new int[][] {};
        int[] intArray2 = humaneval.buggy.MIN_PATH.min_path(intArray0, 0);
        java.lang.Class<?> wildcardClass3 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test26");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 100);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test27");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test28");
        int[] intArray2 = new int[] { '4', (-1) };
        int[] intArray5 = new int[] { '4', (-1) };
        int[] intArray8 = new int[] { '4', (-1) };
        int[] intArray11 = new int[] { '4', (-1) };
        int[] intArray14 = new int[] { '4', (-1) };
        int[] intArray17 = new int[] { '4', (-1) };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 52, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 52, (-1) });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 52, (-1) });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 52, (-1) });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 52, (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 52, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test29");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test30");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test31");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test32");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test33");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test34");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test35");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test36");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test37");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test38");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test39");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test40");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test41");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test42");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test43");
        int[][] intArray0 = new int[][] {};
        int[] intArray2 = humaneval.buggy.MIN_PATH.min_path(intArray0, 0);
        int[] intArray4 = humaneval.buggy.MIN_PATH.min_path(intArray0, 1);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test44");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test45");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test46");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 100);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test47");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test48");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        int[] intArray26 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] {});
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test49");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 100);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test50");
        int[][] intArray0 = new int[][] {};
        int[] intArray2 = humaneval.buggy.MIN_PATH.min_path(intArray0, 0);
        int[] intArray4 = humaneval.buggy.MIN_PATH.min_path(intArray0, 1);
        int[] intArray6 = humaneval.buggy.MIN_PATH.min_path(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test51");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test52");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) ' ');
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test53");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test54");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test55");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test56");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 10);
        int[] intArray26 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test57");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test58");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test59");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) ' ');
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test60");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test61");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 100);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) 'a');
        java.lang.Class<?> wildcardClass23 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test62");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 100);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) 'a');
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test63");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test64");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test65");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test66");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test67");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = humaneval.buggy.MIN_PATH.min_path(intArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"grid\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test68");
        int[][] intArray0 = new int[][] {};
        int[] intArray2 = humaneval.buggy.MIN_PATH.min_path(intArray0, 0);
        int[] intArray4 = humaneval.buggy.MIN_PATH.min_path(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[][] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test69");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 100);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test70");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test71");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 100);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) 'a');
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1 });
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test72");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test73");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = humaneval.buggy.MIN_PATH.min_path(intArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"grid\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test74");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1 });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test75");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 100);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) 'a');
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test76");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 10);
        int[] intArray26 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        int[] intArray28 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] {});
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test77");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 10);
        int[] intArray26 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] {});
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test78");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test79");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) ' ');
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test80");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, 10);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MIN_PATH_RandoopTest0.test81");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        int[] intArray12 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 1);
        int[] intArray14 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '4');
        int[] intArray16 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) '#');
        int[] intArray18 = humaneval.buggy.MIN_PATH.min_path(intArray10, 0);
        int[] intArray20 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 0);
        int[] intArray22 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 100);
        int[] intArray24 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 10);
        int[] intArray26 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 100);
        int[] intArray28 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (short) 10);
        int[] intArray30 = humaneval.buggy.MIN_PATH.min_path(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 100, (-1), (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 1 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1, 5, 1, 5, 1, 5, 1, 5, 1, 5 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 1 });
        org.junit.Assert.assertNotNull(wildcardClass31);
    }
}

