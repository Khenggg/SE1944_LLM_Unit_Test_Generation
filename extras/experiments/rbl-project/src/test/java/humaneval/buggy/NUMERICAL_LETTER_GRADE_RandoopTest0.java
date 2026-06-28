package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NUMERICAL_LETTER_GRADE_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test01");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test02");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray1 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"grades\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test03");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test04");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test05");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test06");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test07");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test08");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test09");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test10");
        humaneval.buggy.NUMERICAL_LETTER_GRADE nUMERICAL_LETTER_GRADE0 = new humaneval.buggy.NUMERICAL_LETTER_GRADE();
        java.lang.Class<?> wildcardClass1 = nUMERICAL_LETTER_GRADE0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test11");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test12");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass11 = strArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test13");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test14");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test15");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass13 = strArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test16");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test17");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass14 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test18");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass10 = strArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test19");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test20");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass14 = strArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test21");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test22");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass16 = strArray15.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test23");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray16 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass17 = strArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test24");
        double[] doubleArray1 = new double[] { 100.0f };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray3 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test25");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray16 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray17 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass18 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test26");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass15 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test27");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test28");
        double[] doubleArray1 = new double[] { 100.0f };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray3 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test29");
        double[] doubleArray1 = new double[] { 100.0f };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test30");
        double[] doubleArray1 = new double[] { 100.0f };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test31");
        double[] doubleArray1 = new double[] { (byte) 10 };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test32");
        double[] doubleArray2 = new double[] { (-1L), 10.0d };
        java.lang.String[] strArray3 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray2);
        java.lang.String[] strArray4 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray2);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "E", "A" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "E", "A" });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test33");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray16 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass17 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test34");
        double[] doubleArray5 = new double[] { '4', 10.0f, 0, 100L, 100 };
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 10.0d, 0.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "E", "A", "A" });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test35");
        double[] doubleArray1 = new double[] { (byte) 10 };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test36");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray16 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray17 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray18 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass19 = strArray18.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test37");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass16 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test38");
        double[] doubleArray1 = new double[] { 100.0f };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray3 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray4 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test39");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray16 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray17 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray18 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray19 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray20 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray21 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass22 = strArray21.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test40");
        double[] doubleArray1 = new double[] { (byte) 10 };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray3 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test41");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray16 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray17 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray18 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray19 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray20 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass21 = strArray20.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test42");
        double[] doubleArray2 = new double[] { (-1L), 10.0d };
        java.lang.String[] strArray3 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "E", "A" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test43");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray16 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray17 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray18 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray19 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass20 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test44");
        double[] doubleArray1 = new double[] { (byte) 10 };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray3 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray4 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A" });
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test45");
        double[] doubleArray1 = new double[] { (byte) 10 };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray3 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray4 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test46");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray16 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray17 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray18 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass19 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test47");
        double[] doubleArray1 = new double[] { (byte) 10 };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray3 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test48");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray16 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray17 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.Class<?> wildcardClass18 = strArray17.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test49");
        double[] doubleArray1 = new double[] { 100.0f };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray3 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray4 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass8 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test50");
        double[] doubleArray1 = new double[] { 100.0f };
        java.lang.String[] strArray2 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray3 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray4 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray1);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test51");
        double[] doubleArray5 = new double[] { '4', 10.0f, 0, 100L, 100 };
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray5);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 10.0d, 0.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "E", "A", "A" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "E", "A", "A" });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NUMERICAL_LETTER_GRADE_RandoopTest0.test52");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        java.lang.String[] strArray5 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray6 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray7 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray8 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray9 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray10 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray11 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray12 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray13 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray14 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray15 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray16 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray17 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray18 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray19 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray20 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray21 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray22 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        java.lang.String[] strArray23 = humaneval.buggy.NUMERICAL_LETTER_GRADE.numerical_letter_grade(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "A", "A", "A", "E" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "A", "A", "A", "E" });
    }
}

