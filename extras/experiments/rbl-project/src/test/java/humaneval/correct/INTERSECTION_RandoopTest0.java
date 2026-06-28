package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class INTERSECTION_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test01");
        humaneval.correct.INTERSECTION iNTERSECTION0 = new humaneval.correct.INTERSECTION();
        java.lang.Class<?> wildcardClass1 = iNTERSECTION0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test02");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int[] intArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = humaneval.correct.INTERSECTION.intersection(intArray2, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"interval2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 1 });
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test03");
        int[] intArray1 = new int[] { 'a' };
        int[] intArray4 = new int[] { (byte) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = humaneval.correct.INTERSECTION.intersection(intArray1, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 97 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 1 });
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test05");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (byte) 100, (byte) -1, (byte) 1, (short) 0, 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = humaneval.correct.INTERSECTION.intersection(intArray0, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"interval1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 100, (-1), 1, 0, 97, 10 });
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test06");
        int[] intArray0 = null;
        int[] intArray3 = new int[] { ' ', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = humaneval.correct.INTERSECTION.intersection(intArray0, intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"interval1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 32, (-1) });
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test07");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray8 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray13 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str14 = humaneval.correct.INTERSECTION.intersection(intArray8, intArray13);
        int[] intArray21 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray26 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str27 = humaneval.correct.INTERSECTION.intersection(intArray21, intArray26);
        java.lang.String str28 = humaneval.correct.INTERSECTION.intersection(intArray8, intArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = humaneval.correct.INTERSECTION.intersection(intArray1, intArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NO" + "'", str14, "NO");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "NO" + "'", str27, "NO");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "NO" + "'", str28, "NO");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test08");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray24);
        java.lang.Class<?> wildcardClass27 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test09");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test10");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test11");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test12");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test13");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test14");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        java.lang.Class<?> wildcardClass13 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test15");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray24);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test16");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test17");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test18");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray24);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray51);
        java.lang.String str54 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray33);
        java.lang.Class<?> wildcardClass55 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test19");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test20");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test21");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray24);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray51);
        java.lang.String str54 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray33);
        int[] intArray61 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray66 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str67 = humaneval.correct.INTERSECTION.intersection(intArray61, intArray66);
        int[] intArray74 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray79 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str80 = humaneval.correct.INTERSECTION.intersection(intArray74, intArray79);
        int[] intArray87 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray92 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str93 = humaneval.correct.INTERSECTION.intersection(intArray87, intArray92);
        java.lang.String str94 = humaneval.correct.INTERSECTION.intersection(intArray74, intArray92);
        java.lang.String str95 = humaneval.correct.INTERSECTION.intersection(intArray61, intArray74);
        java.lang.String str96 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray61);
        java.lang.Class<?> wildcardClass97 = intArray61.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "NO" + "'", str80, "NO");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertArrayEquals(intArray87, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "NO" + "'", str93, "NO");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "NO" + "'", str94, "NO");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "NO" + "'", str95, "NO");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "NO" + "'", str96, "NO");
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test22");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test23");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test24");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        int[] intArray32 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray37 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str38 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray37);
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray37);
        java.lang.String str40 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray19);
        java.lang.Class<?> wildcardClass41 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NO" + "'", str38, "NO");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "NO" + "'", str40, "NO");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test25");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray12 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str13 = humaneval.correct.INTERSECTION.intersection(intArray7, intArray12);
        int[] intArray20 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray25 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray20, intArray25);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray51);
        int[] intArray60 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray65 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str66 = humaneval.correct.INTERSECTION.intersection(intArray60, intArray65);
        int[] intArray73 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray78 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str79 = humaneval.correct.INTERSECTION.intersection(intArray73, intArray78);
        java.lang.String str80 = humaneval.correct.INTERSECTION.intersection(intArray60, intArray78);
        java.lang.String str81 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray60);
        java.lang.String str82 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray60);
        java.lang.String str83 = humaneval.correct.INTERSECTION.intersection(intArray12, intArray25);
        int[] intArray90 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray95 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str96 = humaneval.correct.INTERSECTION.intersection(intArray90, intArray95);
        java.lang.String str97 = humaneval.correct.INTERSECTION.intersection(intArray12, intArray95);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str98 = humaneval.correct.INTERSECTION.intersection(intArray0, intArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"interval1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NO" + "'", str13, "NO");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "NO" + "'", str66, "NO");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "NO" + "'", str79, "NO");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "NO" + "'", str80, "NO");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "NO" + "'", str81, "NO");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "NO" + "'", str82, "NO");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "NO" + "'", str83, "NO");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertArrayEquals(intArray90, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertArrayEquals(intArray95, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "NO" + "'", str96, "NO");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "NO" + "'", str97, "NO");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test26");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test27");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        int[] intArray32 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray37 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str38 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray37);
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray37);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        int[] intArray59 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray64 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str65 = humaneval.correct.INTERSECTION.intersection(intArray59, intArray64);
        java.lang.String str66 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray64);
        java.lang.String str67 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray46);
        java.lang.String str68 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray46);
        int[] intArray75 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray80 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str81 = humaneval.correct.INTERSECTION.intersection(intArray75, intArray80);
        int[] intArray88 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray93 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str94 = humaneval.correct.INTERSECTION.intersection(intArray88, intArray93);
        java.lang.String str95 = humaneval.correct.INTERSECTION.intersection(intArray75, intArray93);
        java.lang.String str96 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray93);
        java.lang.Class<?> wildcardClass97 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NO" + "'", str38, "NO");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "NO" + "'", str65, "NO");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "NO" + "'", str66, "NO");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NO" + "'", str68, "NO");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "NO" + "'", str81, "NO");
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "NO" + "'", str94, "NO");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "NO" + "'", str95, "NO");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "NO" + "'", str96, "NO");
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test28");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        int[] intArray32 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray37 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str38 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray37);
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray37);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        int[] intArray59 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray64 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str65 = humaneval.correct.INTERSECTION.intersection(intArray59, intArray64);
        java.lang.String str66 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray64);
        java.lang.String str67 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray46);
        java.lang.String str68 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray46);
        java.lang.Class<?> wildcardClass69 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NO" + "'", str38, "NO");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "NO" + "'", str65, "NO");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "NO" + "'", str66, "NO");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NO" + "'", str68, "NO");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test29");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test30");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test31");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray17 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str18 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray17);
        java.lang.Class<?> wildcardClass19 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test32");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        int[] intArray32 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray37 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str38 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray37);
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray37);
        java.lang.String str40 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray19);
        java.lang.Class<?> wildcardClass41 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NO" + "'", str38, "NO");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "NO" + "'", str40, "NO");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test33");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray24);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray51);
        java.lang.String str54 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray51);
        java.lang.Class<?> wildcardClass55 = intArray51.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test34");
        int[] intArray6 = new int[] { (short) 0, 100, (byte) -1, 10, '4', 10 };
        int[] intArray13 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray18 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str19 = humaneval.correct.INTERSECTION.intersection(intArray13, intArray18);
        int[] intArray26 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray31 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str32 = humaneval.correct.INTERSECTION.intersection(intArray26, intArray31);
        java.lang.String str33 = humaneval.correct.INTERSECTION.intersection(intArray13, intArray31);
        int[] intArray40 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray45 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str46 = humaneval.correct.INTERSECTION.intersection(intArray40, intArray45);
        int[] intArray53 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray58 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str59 = humaneval.correct.INTERSECTION.intersection(intArray53, intArray58);
        java.lang.String str60 = humaneval.correct.INTERSECTION.intersection(intArray40, intArray58);
        java.lang.String str61 = humaneval.correct.INTERSECTION.intersection(intArray13, intArray40);
        java.lang.String str62 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray40);
        java.lang.Class<?> wildcardClass63 = intArray40.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 100, (-1), 10, 52, 10 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NO" + "'", str19, "NO");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "NO" + "'", str32, "NO");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "NO" + "'", str33, "NO");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "NO" + "'", str46, "NO");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "NO" + "'", str59, "NO");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "NO" + "'", str60, "NO");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "NO" + "'", str61, "NO");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "NO" + "'", str62, "NO");
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test35");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test36");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test37");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray24);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray51);
        java.lang.String str54 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray33);
        int[] intArray61 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray66 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str67 = humaneval.correct.INTERSECTION.intersection(intArray61, intArray66);
        int[] intArray74 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray79 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str80 = humaneval.correct.INTERSECTION.intersection(intArray74, intArray79);
        int[] intArray87 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray92 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str93 = humaneval.correct.INTERSECTION.intersection(intArray87, intArray92);
        java.lang.String str94 = humaneval.correct.INTERSECTION.intersection(intArray74, intArray92);
        java.lang.String str95 = humaneval.correct.INTERSECTION.intersection(intArray61, intArray74);
        java.lang.String str96 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray74);
        java.lang.Class<?> wildcardClass97 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "NO" + "'", str80, "NO");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertArrayEquals(intArray87, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "NO" + "'", str93, "NO");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "NO" + "'", str94, "NO");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "NO" + "'", str95, "NO");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "NO" + "'", str96, "NO");
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test38");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        int[] intArray32 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray37 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str38 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray37);
        int[] intArray45 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray50 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str51 = humaneval.correct.INTERSECTION.intersection(intArray45, intArray50);
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray50);
        int[] intArray59 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray64 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str65 = humaneval.correct.INTERSECTION.intersection(intArray59, intArray64);
        int[] intArray72 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray77 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str78 = humaneval.correct.INTERSECTION.intersection(intArray72, intArray77);
        java.lang.String str79 = humaneval.correct.INTERSECTION.intersection(intArray59, intArray77);
        java.lang.String str80 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray59);
        java.lang.String str81 = humaneval.correct.INTERSECTION.intersection(intArray24, intArray59);
        java.lang.String str82 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray24);
        int[] intArray89 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray94 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str95 = humaneval.correct.INTERSECTION.intersection(intArray89, intArray94);
        java.lang.String str96 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray94);
        java.lang.Class<?> wildcardClass97 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NO" + "'", str38, "NO");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "NO" + "'", str51, "NO");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "NO" + "'", str65, "NO");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "NO" + "'", str78, "NO");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "NO" + "'", str79, "NO");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "NO" + "'", str80, "NO");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "NO" + "'", str81, "NO");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "NO" + "'", str82, "NO");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertArrayEquals(intArray94, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "NO" + "'", str95, "NO");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "NO" + "'", str96, "NO");
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test39");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        int[] intArray32 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray37 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str38 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray37);
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray37);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        int[] intArray59 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray64 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str65 = humaneval.correct.INTERSECTION.intersection(intArray59, intArray64);
        java.lang.String str66 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray64);
        java.lang.String str67 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray46);
        java.lang.String str68 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray46);
        int[] intArray69 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"interval2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NO" + "'", str38, "NO");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "NO" + "'", str65, "NO");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "NO" + "'", str66, "NO");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NO" + "'", str68, "NO");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test40");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test41");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray17 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str18 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray17);
        int[] intArray25 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray30 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str31 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray30);
        int[] intArray38 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray43 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str44 = humaneval.correct.INTERSECTION.intersection(intArray38, intArray43);
        java.lang.String str45 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray43);
        int[] intArray52 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray57 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str58 = humaneval.correct.INTERSECTION.intersection(intArray52, intArray57);
        int[] intArray65 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray70 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str71 = humaneval.correct.INTERSECTION.intersection(intArray65, intArray70);
        java.lang.String str72 = humaneval.correct.INTERSECTION.intersection(intArray52, intArray70);
        java.lang.String str73 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray52);
        java.lang.String str74 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray25);
        int[] intArray81 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray86 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str87 = humaneval.correct.INTERSECTION.intersection(intArray81, intArray86);
        int[] intArray92 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str93 = humaneval.correct.INTERSECTION.intersection(intArray86, intArray92);
        java.lang.String str94 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray86);
        java.lang.Class<?> wildcardClass95 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NO" + "'", str31, "NO");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "NO" + "'", str44, "NO");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "NO" + "'", str45, "NO");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "NO" + "'", str58, "NO");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "NO" + "'", str71, "NO");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "NO" + "'", str72, "NO");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "NO" + "'", str73, "NO");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "NO" + "'", str74, "NO");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "NO" + "'", str87, "NO");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "NO" + "'", str93, "NO");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "NO" + "'", str94, "NO");
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test42");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        int[] intArray32 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray37 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str38 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray37);
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray37);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        int[] intArray59 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray64 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str65 = humaneval.correct.INTERSECTION.intersection(intArray59, intArray64);
        java.lang.String str66 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray64);
        java.lang.String str67 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray46);
        java.lang.String str68 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray46);
        java.lang.Class<?> wildcardClass69 = intArray46.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NO" + "'", str38, "NO");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "NO" + "'", str65, "NO");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "NO" + "'", str66, "NO");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NO" + "'", str68, "NO");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test43");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray24);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray51);
        java.lang.String str54 = humaneval.correct.INTERSECTION.intersection(intArray24, intArray51);
        java.lang.Class<?> wildcardClass55 = intArray51.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test44");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray12 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str13 = humaneval.correct.INTERSECTION.intersection(intArray7, intArray12);
        int[] intArray20 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray25 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray20, intArray25);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        java.lang.String str40 = humaneval.correct.INTERSECTION.intersection(intArray20, intArray38);
        int[] intArray47 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray52 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray47, intArray52);
        int[] intArray60 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray65 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str66 = humaneval.correct.INTERSECTION.intersection(intArray60, intArray65);
        java.lang.String str67 = humaneval.correct.INTERSECTION.intersection(intArray47, intArray65);
        java.lang.String str68 = humaneval.correct.INTERSECTION.intersection(intArray20, intArray47);
        java.lang.String str69 = humaneval.correct.INTERSECTION.intersection(intArray12, intArray47);
        int[] intArray76 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray81 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str82 = humaneval.correct.INTERSECTION.intersection(intArray76, intArray81);
        int[] intArray89 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray94 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str95 = humaneval.correct.INTERSECTION.intersection(intArray89, intArray94);
        java.lang.String str96 = humaneval.correct.INTERSECTION.intersection(intArray76, intArray94);
        java.lang.String str97 = humaneval.correct.INTERSECTION.intersection(intArray12, intArray94);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str98 = humaneval.correct.INTERSECTION.intersection(intArray0, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"interval1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NO" + "'", str13, "NO");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "NO" + "'", str40, "NO");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "NO" + "'", str66, "NO");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NO" + "'", str68, "NO");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "NO" + "'", str69, "NO");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "NO" + "'", str82, "NO");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertArrayEquals(intArray94, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "NO" + "'", str95, "NO");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "NO" + "'", str96, "NO");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "NO" + "'", str97, "NO");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test45");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray17 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str18 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray17);
        int[] intArray25 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray30 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str31 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray30);
        int[] intArray38 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray43 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str44 = humaneval.correct.INTERSECTION.intersection(intArray38, intArray43);
        int[] intArray51 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray56 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str57 = humaneval.correct.INTERSECTION.intersection(intArray51, intArray56);
        java.lang.String str58 = humaneval.correct.INTERSECTION.intersection(intArray38, intArray56);
        java.lang.String str59 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray38);
        java.lang.String str60 = humaneval.correct.INTERSECTION.intersection(intArray17, intArray25);
        java.lang.Class<?> wildcardClass61 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NO" + "'", str31, "NO");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "NO" + "'", str44, "NO");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "NO" + "'", str57, "NO");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "NO" + "'", str58, "NO");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "NO" + "'", str59, "NO");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "NO" + "'", str60, "NO");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test46");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray17 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str18 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray17);
        int[] intArray25 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray30 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str31 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray30);
        int[] intArray38 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray43 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str44 = humaneval.correct.INTERSECTION.intersection(intArray38, intArray43);
        java.lang.String str45 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray43);
        int[] intArray52 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray57 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str58 = humaneval.correct.INTERSECTION.intersection(intArray52, intArray57);
        int[] intArray65 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray70 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str71 = humaneval.correct.INTERSECTION.intersection(intArray65, intArray70);
        java.lang.String str72 = humaneval.correct.INTERSECTION.intersection(intArray52, intArray70);
        java.lang.String str73 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray52);
        java.lang.String str74 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray25);
        int[] intArray76 = new int[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NO" + "'", str31, "NO");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "NO" + "'", str44, "NO");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "NO" + "'", str45, "NO");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "NO" + "'", str58, "NO");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "NO" + "'", str71, "NO");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "NO" + "'", str72, "NO");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "NO" + "'", str73, "NO");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "NO" + "'", str74, "NO");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { 0 });
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test47");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        int[] intArray32 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray37 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str38 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray37);
        int[] intArray45 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray50 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str51 = humaneval.correct.INTERSECTION.intersection(intArray45, intArray50);
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray50);
        int[] intArray59 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray64 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str65 = humaneval.correct.INTERSECTION.intersection(intArray59, intArray64);
        int[] intArray72 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray77 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str78 = humaneval.correct.INTERSECTION.intersection(intArray72, intArray77);
        java.lang.String str79 = humaneval.correct.INTERSECTION.intersection(intArray59, intArray77);
        java.lang.String str80 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray59);
        java.lang.String str81 = humaneval.correct.INTERSECTION.intersection(intArray24, intArray59);
        java.lang.String str82 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray24);
        java.lang.Class<?> wildcardClass83 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NO" + "'", str38, "NO");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "NO" + "'", str51, "NO");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "NO" + "'", str65, "NO");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "NO" + "'", str78, "NO");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "NO" + "'", str79, "NO");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "NO" + "'", str80, "NO");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "NO" + "'", str81, "NO");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "NO" + "'", str82, "NO");
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test48");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray17 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str18 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray17);
        int[] intArray25 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray30 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str31 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray30);
        int[] intArray38 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray43 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str44 = humaneval.correct.INTERSECTION.intersection(intArray38, intArray43);
        int[] intArray51 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray56 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str57 = humaneval.correct.INTERSECTION.intersection(intArray51, intArray56);
        java.lang.String str58 = humaneval.correct.INTERSECTION.intersection(intArray38, intArray56);
        java.lang.String str59 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray38);
        java.lang.String str60 = humaneval.correct.INTERSECTION.intersection(intArray17, intArray25);
        java.lang.Class<?> wildcardClass61 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NO" + "'", str31, "NO");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "NO" + "'", str44, "NO");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "NO" + "'", str57, "NO");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "NO" + "'", str58, "NO");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "NO" + "'", str59, "NO");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "NO" + "'", str60, "NO");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test49");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test50");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray24);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray51);
        java.lang.String str54 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray33);
        java.lang.Class<?> wildcardClass55 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test51");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray12 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str13 = humaneval.correct.INTERSECTION.intersection(intArray7, intArray12);
        int[] intArray20 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray25 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray20, intArray25);
        java.lang.String str27 = humaneval.correct.INTERSECTION.intersection(intArray7, intArray25);
        int[] intArray34 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray39 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str40 = humaneval.correct.INTERSECTION.intersection(intArray34, intArray39);
        int[] intArray47 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray52 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray47, intArray52);
        java.lang.String str54 = humaneval.correct.INTERSECTION.intersection(intArray34, intArray52);
        java.lang.String str55 = humaneval.correct.INTERSECTION.intersection(intArray7, intArray52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = humaneval.correct.INTERSECTION.intersection(intArray0, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"interval1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NO" + "'", str13, "NO");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "NO" + "'", str27, "NO");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "NO" + "'", str40, "NO");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "NO" + "'", str55, "NO");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test52");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray24);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray51);
        java.lang.String str54 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray51);
        java.lang.Class<?> wildcardClass55 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test53");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray17 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str18 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray17);
        int[] intArray25 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray30 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str31 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray30);
        int[] intArray38 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray43 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str44 = humaneval.correct.INTERSECTION.intersection(intArray38, intArray43);
        int[] intArray51 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray56 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str57 = humaneval.correct.INTERSECTION.intersection(intArray51, intArray56);
        java.lang.String str58 = humaneval.correct.INTERSECTION.intersection(intArray38, intArray56);
        java.lang.String str59 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray38);
        java.lang.String str60 = humaneval.correct.INTERSECTION.intersection(intArray17, intArray25);
        int[] intArray62 = new int[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NO" + "'", str31, "NO");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "NO" + "'", str44, "NO");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "NO" + "'", str57, "NO");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "NO" + "'", str58, "NO");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "NO" + "'", str59, "NO");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "NO" + "'", str60, "NO");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-1) });
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test54");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test55");
        boolean boolean1 = humaneval.correct.INTERSECTION.is_prime((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test56");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray12 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str13 = humaneval.correct.INTERSECTION.intersection(intArray7, intArray12);
        int[] intArray20 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray25 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray20, intArray25);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray51);
        int[] intArray60 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray65 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str66 = humaneval.correct.INTERSECTION.intersection(intArray60, intArray65);
        int[] intArray73 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray78 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str79 = humaneval.correct.INTERSECTION.intersection(intArray73, intArray78);
        java.lang.String str80 = humaneval.correct.INTERSECTION.intersection(intArray60, intArray78);
        java.lang.String str81 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray60);
        java.lang.String str82 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray60);
        java.lang.String str83 = humaneval.correct.INTERSECTION.intersection(intArray12, intArray25);
        int[] intArray90 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray95 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str96 = humaneval.correct.INTERSECTION.intersection(intArray90, intArray95);
        java.lang.String str97 = humaneval.correct.INTERSECTION.intersection(intArray12, intArray95);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str98 = humaneval.correct.INTERSECTION.intersection(intArray0, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"interval1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "NO" + "'", str13, "NO");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "NO" + "'", str66, "NO");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "NO" + "'", str79, "NO");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "NO" + "'", str80, "NO");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "NO" + "'", str81, "NO");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "NO" + "'", str82, "NO");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "NO" + "'", str83, "NO");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertArrayEquals(intArray90, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertArrayEquals(intArray95, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "NO" + "'", str96, "NO");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "NO" + "'", str97, "NO");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test57");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray17 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str18 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray17);
        int[] intArray25 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray30 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str31 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray30);
        int[] intArray38 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray43 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str44 = humaneval.correct.INTERSECTION.intersection(intArray38, intArray43);
        java.lang.String str45 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray43);
        int[] intArray52 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray57 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str58 = humaneval.correct.INTERSECTION.intersection(intArray52, intArray57);
        int[] intArray65 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray70 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str71 = humaneval.correct.INTERSECTION.intersection(intArray65, intArray70);
        java.lang.String str72 = humaneval.correct.INTERSECTION.intersection(intArray52, intArray70);
        java.lang.String str73 = humaneval.correct.INTERSECTION.intersection(intArray43, intArray70);
        java.lang.String str74 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray43);
        java.lang.Class<?> wildcardClass75 = intArray43.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NO" + "'", str31, "NO");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "NO" + "'", str44, "NO");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "NO" + "'", str45, "NO");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "NO" + "'", str58, "NO");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "NO" + "'", str71, "NO");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "NO" + "'", str72, "NO");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "NO" + "'", str73, "NO");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "NO" + "'", str74, "NO");
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test58");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray24);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray51);
        java.lang.String str54 = humaneval.correct.INTERSECTION.intersection(intArray24, intArray51);
        java.lang.Class<?> wildcardClass55 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test59");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray17 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str18 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray17);
        int[] intArray25 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray30 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str31 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray30);
        int[] intArray38 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray43 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str44 = humaneval.correct.INTERSECTION.intersection(intArray38, intArray43);
        java.lang.String str45 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray43);
        int[] intArray52 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray57 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str58 = humaneval.correct.INTERSECTION.intersection(intArray52, intArray57);
        int[] intArray65 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray70 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str71 = humaneval.correct.INTERSECTION.intersection(intArray65, intArray70);
        java.lang.String str72 = humaneval.correct.INTERSECTION.intersection(intArray52, intArray70);
        java.lang.String str73 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray52);
        java.lang.String str74 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray25);
        int[] intArray81 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray86 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str87 = humaneval.correct.INTERSECTION.intersection(intArray81, intArray86);
        int[] intArray92 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str93 = humaneval.correct.INTERSECTION.intersection(intArray86, intArray92);
        java.lang.String str94 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray92);
        java.lang.Class<?> wildcardClass95 = intArray92.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NO" + "'", str31, "NO");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "NO" + "'", str44, "NO");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "NO" + "'", str45, "NO");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "NO" + "'", str58, "NO");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "NO" + "'", str71, "NO");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "NO" + "'", str72, "NO");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "NO" + "'", str73, "NO");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "NO" + "'", str74, "NO");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "NO" + "'", str87, "NO");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "NO" + "'", str93, "NO");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "NO" + "'", str94, "NO");
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test60");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray17 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str18 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray17);
        int[] intArray25 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray30 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str31 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray30);
        int[] intArray38 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray43 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str44 = humaneval.correct.INTERSECTION.intersection(intArray38, intArray43);
        java.lang.String str45 = humaneval.correct.INTERSECTION.intersection(intArray25, intArray43);
        int[] intArray52 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray57 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str58 = humaneval.correct.INTERSECTION.intersection(intArray52, intArray57);
        int[] intArray65 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray70 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str71 = humaneval.correct.INTERSECTION.intersection(intArray65, intArray70);
        java.lang.String str72 = humaneval.correct.INTERSECTION.intersection(intArray52, intArray70);
        java.lang.String str73 = humaneval.correct.INTERSECTION.intersection(intArray43, intArray70);
        java.lang.String str74 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray43);
        int[] intArray81 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray86 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str87 = humaneval.correct.INTERSECTION.intersection(intArray81, intArray86);
        int[] intArray92 = new int[] { 1, (byte) 1, 100, 0 };
        java.lang.String str93 = humaneval.correct.INTERSECTION.intersection(intArray86, intArray92);
        java.lang.String str94 = humaneval.correct.INTERSECTION.intersection(intArray43, intArray92);
        java.lang.Class<?> wildcardClass95 = intArray92.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NO" + "'", str31, "NO");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "NO" + "'", str44, "NO");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "NO" + "'", str45, "NO");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "NO" + "'", str58, "NO");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "NO" + "'", str71, "NO");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "NO" + "'", str72, "NO");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "NO" + "'", str73, "NO");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "NO" + "'", str74, "NO");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "NO" + "'", str87, "NO");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { 1, 1, 100, 0 });
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "NO" + "'", str93, "NO");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "NO" + "'", str94, "NO");
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test61");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        int[] intArray32 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray37 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str38 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray37);
        int[] intArray45 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray50 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str51 = humaneval.correct.INTERSECTION.intersection(intArray45, intArray50);
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray50);
        int[] intArray59 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray64 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str65 = humaneval.correct.INTERSECTION.intersection(intArray59, intArray64);
        int[] intArray72 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray77 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str78 = humaneval.correct.INTERSECTION.intersection(intArray72, intArray77);
        java.lang.String str79 = humaneval.correct.INTERSECTION.intersection(intArray59, intArray77);
        java.lang.String str80 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray59);
        java.lang.String str81 = humaneval.correct.INTERSECTION.intersection(intArray24, intArray59);
        java.lang.String str82 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray24);
        int[] intArray89 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray94 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str95 = humaneval.correct.INTERSECTION.intersection(intArray89, intArray94);
        java.lang.String str96 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray94);
        java.lang.Class<?> wildcardClass97 = intArray94.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NO" + "'", str38, "NO");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "NO" + "'", str51, "NO");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "NO" + "'", str65, "NO");
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "NO" + "'", str78, "NO");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "NO" + "'", str79, "NO");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "NO" + "'", str80, "NO");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "NO" + "'", str81, "NO");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "NO" + "'", str82, "NO");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertArrayEquals(intArray94, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "NO" + "'", str95, "NO");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "NO" + "'", str96, "NO");
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test62");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        int[] intArray32 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray37 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str38 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray37);
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray37);
        java.lang.String str40 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray19);
        int[] intArray47 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray52 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray47, intArray52);
        int[] intArray60 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray65 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str66 = humaneval.correct.INTERSECTION.intersection(intArray60, intArray65);
        java.lang.String str67 = humaneval.correct.INTERSECTION.intersection(intArray47, intArray65);
        java.lang.String str68 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray47);
        java.lang.Class<?> wildcardClass69 = intArray47.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NO" + "'", str38, "NO");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "NO" + "'", str40, "NO");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "NO" + "'", str66, "NO");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NO" + "'", str68, "NO");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test63");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray17 = new int[] { (-1), '4', (byte) 100, 100 };
        java.lang.String str18 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray17);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 52, 100, 100 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test64");
        int[] intArray6 = new int[] { (short) 0, 100, (byte) -1, 10, '4', 10 };
        int[] intArray13 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray18 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str19 = humaneval.correct.INTERSECTION.intersection(intArray13, intArray18);
        int[] intArray26 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray31 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str32 = humaneval.correct.INTERSECTION.intersection(intArray26, intArray31);
        java.lang.String str33 = humaneval.correct.INTERSECTION.intersection(intArray13, intArray31);
        int[] intArray40 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray45 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str46 = humaneval.correct.INTERSECTION.intersection(intArray40, intArray45);
        int[] intArray53 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray58 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str59 = humaneval.correct.INTERSECTION.intersection(intArray53, intArray58);
        java.lang.String str60 = humaneval.correct.INTERSECTION.intersection(intArray40, intArray58);
        java.lang.String str61 = humaneval.correct.INTERSECTION.intersection(intArray13, intArray40);
        java.lang.String str62 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray40);
        java.lang.Class<?> wildcardClass63 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 100, (-1), 10, 52, 10 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "NO" + "'", str19, "NO");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "NO" + "'", str32, "NO");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "NO" + "'", str33, "NO");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "NO" + "'", str46, "NO");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "NO" + "'", str59, "NO");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "NO" + "'", str60, "NO");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "NO" + "'", str61, "NO");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "NO" + "'", str62, "NO");
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test65");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        java.lang.String str26 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray24);
        int[] intArray33 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray38 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray38);
        int[] intArray46 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray51 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str52 = humaneval.correct.INTERSECTION.intersection(intArray46, intArray51);
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray51);
        java.lang.String str54 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray33);
        int[] intArray61 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray66 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str67 = humaneval.correct.INTERSECTION.intersection(intArray61, intArray66);
        int[] intArray74 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray79 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str80 = humaneval.correct.INTERSECTION.intersection(intArray74, intArray79);
        int[] intArray87 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray92 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str93 = humaneval.correct.INTERSECTION.intersection(intArray87, intArray92);
        java.lang.String str94 = humaneval.correct.INTERSECTION.intersection(intArray74, intArray92);
        java.lang.String str95 = humaneval.correct.INTERSECTION.intersection(intArray61, intArray74);
        java.lang.String str96 = humaneval.correct.INTERSECTION.intersection(intArray33, intArray74);
        java.lang.Class<?> wildcardClass97 = intArray74.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NO" + "'", str26, "NO");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NO" + "'", str52, "NO");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "NO" + "'", str80, "NO");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertArrayEquals(intArray87, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "NO" + "'", str93, "NO");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "NO" + "'", str94, "NO");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "NO" + "'", str95, "NO");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "NO" + "'", str96, "NO");
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test66");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray19 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray24 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str25 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray24);
        int[] intArray32 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray37 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str38 = humaneval.correct.INTERSECTION.intersection(intArray32, intArray37);
        java.lang.String str39 = humaneval.correct.INTERSECTION.intersection(intArray19, intArray37);
        java.lang.String str40 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray19);
        int[] intArray47 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray52 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str53 = humaneval.correct.INTERSECTION.intersection(intArray47, intArray52);
        int[] intArray60 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray65 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str66 = humaneval.correct.INTERSECTION.intersection(intArray60, intArray65);
        java.lang.String str67 = humaneval.correct.INTERSECTION.intersection(intArray47, intArray65);
        java.lang.String str68 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray47);
        int[] intArray75 = new int[] { (byte) 0, (-1), (byte) -1, (byte) 10, (byte) 1, (short) -1 };
        java.lang.String str76 = humaneval.correct.INTERSECTION.intersection(intArray47, intArray75);
        java.lang.Class<?> wildcardClass77 = intArray47.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NO" + "'", str25, "NO");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "NO" + "'", str38, "NO");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NO" + "'", str39, "NO");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "NO" + "'", str40, "NO");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NO" + "'", str53, "NO");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "NO" + "'", str66, "NO");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NO" + "'", str68, "NO");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 0, (-1), (-1), 10, 1, (-1) });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "NO" + "'", str76, "NO");
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "INTERSECTION_RandoopTest0.test67");
        int[] intArray6 = new int[] { (short) -1, ' ', 'a', (byte) 100, (byte) 10, (short) 0 };
        int[] intArray11 = new int[] { 100, (byte) -1, (short) 1, (short) 1 };
        java.lang.String str12 = humaneval.correct.INTERSECTION.intersection(intArray6, intArray11);
        int[] intArray17 = new int[] { 1, (byte) 1, 100, 0 };
        java.lang.String str18 = humaneval.correct.INTERSECTION.intersection(intArray11, intArray17);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 32, 97, 100, 10, 0 });
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 100, (-1), 1, 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "NO" + "'", str12, "NO");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 1, 1, 100, 0 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

