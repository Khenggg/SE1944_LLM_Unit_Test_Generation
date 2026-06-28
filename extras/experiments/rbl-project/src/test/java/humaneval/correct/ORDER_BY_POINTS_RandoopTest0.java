package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ORDER_BY_POINTS_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test01");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test02");
        java.lang.Integer[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer[] intArray1 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"nums\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test03");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test05");
        humaneval.correct.ORDER_BY_POINTS oRDER_BY_POINTS0 = new humaneval.correct.ORDER_BY_POINTS();
        java.lang.Class<?> wildcardClass1 = oRDER_BY_POINTS0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test06");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test07");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test08");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test09");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Class<?> wildcardClass6 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test10");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Class<?> wildcardClass6 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test11");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test12");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test13");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Class<?> wildcardClass11 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test14");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test15");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test16");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test17");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test18");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test19");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test20");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test21");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test22");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test23");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test24");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test25");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test26");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test27");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test28");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test29");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test30");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test31");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test32");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test33");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test34");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test35");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test36");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test37");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test38");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test39");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test40");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Class<?> wildcardClass10 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test41");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Class<?> wildcardClass11 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test42");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Class<?> wildcardClass11 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test43");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test44");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test45");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test46");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test47");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test48");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test49");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray12 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray11);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test50");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray12 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test51");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.lang.Integer[] intArray2 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray1);
        java.lang.Integer[] intArray3 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test52");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test53");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test54");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Class<?> wildcardClass9 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test55");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test56");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test57");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test58");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test59");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test60");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.lang.Integer[] intArray2 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray1);
        java.lang.Integer[] intArray3 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray2);
        java.lang.Integer[] intArray4 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray2);
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test61");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray12 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray13 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray12);
        java.lang.Integer[] intArray14 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray12);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test62");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Integer[] intArray12 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test63");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test64");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test65");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test66");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray12 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray13 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray14 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray15 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray14);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test67");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Class<?> wildcardClass9 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test68");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.lang.Integer[] intArray2 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray1);
        java.lang.Integer[] intArray3 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray2);
        java.lang.Integer[] intArray4 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test69");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray10);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test70");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test71");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray12 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray13 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test72");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test73");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test74");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test75");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray12 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray11);
        java.lang.Integer[] intArray13 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray12);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test76");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test77");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test78");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray9);
        java.lang.Integer[] intArray12 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray11);
        java.lang.Integer[] intArray13 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray11);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test79");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test80");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test81");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray8);
        java.lang.Class<?> wildcardClass10 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test82");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Class<?> wildcardClass9 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test83");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { (-1) };
        java.lang.Integer[] intArray2 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray1);
        java.lang.Integer[] intArray3 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray2);
        java.lang.Integer[] intArray4 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray2);
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray2);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1) });
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test84");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray12 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray13 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray14 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray15 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new java.lang.Integer[] { 0, 0, 10, 100 });
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test85");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), 10, (-1) };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray6);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray7);
        java.lang.Integer[] intArray12 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray11);
        java.lang.Class<?> wildcardClass13 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { (-1), (-1), 10, (-1) });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { (-1), (-1), (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ORDER_BY_POINTS_RandoopTest0.test86");
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 10, 0, 0, 100 };
        java.lang.Integer[] intArray5 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray4);
        java.lang.Integer[] intArray6 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray7 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray8 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray9 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray10 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray11 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray5);
        java.lang.Integer[] intArray12 = humaneval.correct.ORDER_BY_POINTS.order_by_points(intArray11);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new java.lang.Integer[] { 10, 0, 0, 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new java.lang.Integer[] { 0, 0, 10, 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new java.lang.Integer[] { 0, 0, 10, 100 });
    }
}

