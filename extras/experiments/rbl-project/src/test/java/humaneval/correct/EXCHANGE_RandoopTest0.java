package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EXCHANGE_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test02");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Class<?> wildcardClass13 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test03");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.String str25 = humaneval.correct.EXCHANGE.exchange(intList15, intList23);
        java.lang.String str26 = humaneval.correct.EXCHANGE.exchange(intList2, intList23);
        java.lang.Class<?> wildcardClass27 = intList23.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YES" + "'", str25, "YES");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "YES" + "'", str26, "YES");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test04");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        java.lang.String str13 = humaneval.correct.EXCHANGE.exchange(intList3, intList11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = humaneval.correct.EXCHANGE.exchange(intList0, intList11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"lst1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "YES" + "'", str13, "YES");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test05");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.String str25 = humaneval.correct.EXCHANGE.exchange(intList15, intList23);
        java.lang.String str26 = humaneval.correct.EXCHANGE.exchange(intList2, intList23);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.String str39 = humaneval.correct.EXCHANGE.exchange(intList29, intList37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.String str52 = humaneval.correct.EXCHANGE.exchange(intList42, intList50);
        java.lang.String str53 = humaneval.correct.EXCHANGE.exchange(intList29, intList50);
        java.lang.String str54 = humaneval.correct.EXCHANGE.exchange(intList23, intList50);
        java.lang.Class<?> wildcardClass55 = intList23.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YES" + "'", str25, "YES");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "YES" + "'", str26, "YES");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "YES" + "'", str39, "YES");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "YES" + "'", str52, "YES");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "YES" + "'", str53, "YES");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test06");
        humaneval.correct.EXCHANGE eXCHANGE0 = new humaneval.correct.EXCHANGE();
        java.lang.Class<?> wildcardClass1 = eXCHANGE0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test07");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.String str25 = humaneval.correct.EXCHANGE.exchange(intList15, intList23);
        java.lang.String str26 = humaneval.correct.EXCHANGE.exchange(intList2, intList23);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.String str39 = humaneval.correct.EXCHANGE.exchange(intList29, intList37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.String str52 = humaneval.correct.EXCHANGE.exchange(intList42, intList50);
        java.lang.String str53 = humaneval.correct.EXCHANGE.exchange(intList29, intList50);
        java.lang.String str54 = humaneval.correct.EXCHANGE.exchange(intList23, intList50);
        java.lang.Class<?> wildcardClass55 = intList50.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YES" + "'", str25, "YES");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "YES" + "'", str26, "YES");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "YES" + "'", str39, "YES");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "YES" + "'", str52, "YES");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "YES" + "'", str53, "YES");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test08");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.String str25 = humaneval.correct.EXCHANGE.exchange(intList15, intList23);
        java.lang.String str26 = humaneval.correct.EXCHANGE.exchange(intList2, intList23);
        java.lang.Class<?> wildcardClass27 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YES" + "'", str25, "YES");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "YES" + "'", str26, "YES");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test09");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Class<?> wildcardClass13 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test10");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.String str25 = humaneval.correct.EXCHANGE.exchange(intList15, intList23);
        java.lang.String str26 = humaneval.correct.EXCHANGE.exchange(intList2, intList23);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.String str39 = humaneval.correct.EXCHANGE.exchange(intList29, intList37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.String str52 = humaneval.correct.EXCHANGE.exchange(intList42, intList50);
        java.lang.String str53 = humaneval.correct.EXCHANGE.exchange(intList29, intList50);
        java.lang.String str54 = humaneval.correct.EXCHANGE.exchange(intList23, intList50);
        java.util.ArrayList<java.lang.Integer> intList55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = humaneval.correct.EXCHANGE.exchange(intList23, intList55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"lst2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YES" + "'", str25, "YES");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "YES" + "'", str26, "YES");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "YES" + "'", str39, "YES");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "YES" + "'", str52, "YES");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "YES" + "'", str53, "YES");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test11");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.String str17 = humaneval.correct.EXCHANGE.exchange(intList7, intList15);
        java.lang.String str18 = humaneval.correct.EXCHANGE.exchange(intList3, intList7);
        java.lang.Class<?> wildcardClass19 = intList3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "YES" + "'", str17, "YES");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "YES" + "'", str18, "YES");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test12");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.String str25 = humaneval.correct.EXCHANGE.exchange(intList15, intList23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.String str38 = humaneval.correct.EXCHANGE.exchange(intList28, intList36);
        java.lang.String str39 = humaneval.correct.EXCHANGE.exchange(intList15, intList36);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.String str52 = humaneval.correct.EXCHANGE.exchange(intList42, intList50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList63 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.String str65 = humaneval.correct.EXCHANGE.exchange(intList55, intList63);
        java.lang.String str66 = humaneval.correct.EXCHANGE.exchange(intList42, intList63);
        java.lang.String str67 = humaneval.correct.EXCHANGE.exchange(intList36, intList63);
        java.lang.String str68 = humaneval.correct.EXCHANGE.exchange(intList2, intList36);
        java.lang.Class<?> wildcardClass69 = intList36.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YES" + "'", str25, "YES");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "YES" + "'", str38, "YES");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "YES" + "'", str39, "YES");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "YES" + "'", str52, "YES");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "YES" + "'", str65, "YES");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "YES" + "'", str66, "YES");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "YES" + "'", str68, "YES");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test13");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.String str17 = humaneval.correct.EXCHANGE.exchange(intList7, intList15);
        java.lang.String str18 = humaneval.correct.EXCHANGE.exchange(intList3, intList7);
        java.lang.Class<?> wildcardClass19 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "YES" + "'", str17, "YES");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "YES" + "'", str18, "YES");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test14");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.String str25 = humaneval.correct.EXCHANGE.exchange(intList15, intList23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.String str38 = humaneval.correct.EXCHANGE.exchange(intList28, intList36);
        java.lang.String str39 = humaneval.correct.EXCHANGE.exchange(intList15, intList36);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.String str52 = humaneval.correct.EXCHANGE.exchange(intList42, intList50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList63 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.String str65 = humaneval.correct.EXCHANGE.exchange(intList55, intList63);
        java.lang.String str66 = humaneval.correct.EXCHANGE.exchange(intList42, intList63);
        java.lang.String str67 = humaneval.correct.EXCHANGE.exchange(intList36, intList63);
        java.lang.String str68 = humaneval.correct.EXCHANGE.exchange(intList10, intList36);
        java.lang.Class<?> wildcardClass69 = intList10.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YES" + "'", str25, "YES");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "YES" + "'", str38, "YES");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "YES" + "'", str39, "YES");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "YES" + "'", str52, "YES");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "YES" + "'", str65, "YES");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "YES" + "'", str66, "YES");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NO" + "'", str68, "NO");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test15");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.String str17 = humaneval.correct.EXCHANGE.exchange(intList7, intList15);
        java.lang.String str18 = humaneval.correct.EXCHANGE.exchange(intList3, intList7);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.String str36 = humaneval.correct.EXCHANGE.exchange(intList26, intList34);
        java.lang.String str37 = humaneval.correct.EXCHANGE.exchange(intList22, intList26);
        java.lang.String str38 = humaneval.correct.EXCHANGE.exchange(intList7, intList22);
        java.lang.Class<?> wildcardClass39 = intList7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "YES" + "'", str17, "YES");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "YES" + "'", str18, "YES");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new java.lang.Integer[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "YES" + "'", str36, "YES");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "YES" + "'", str37, "YES");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "YES" + "'", str38, "YES");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test16");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.String str25 = humaneval.correct.EXCHANGE.exchange(intList15, intList23);
        java.lang.String str26 = humaneval.correct.EXCHANGE.exchange(intList2, intList23);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        java.lang.String str39 = humaneval.correct.EXCHANGE.exchange(intList29, intList37);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.String str52 = humaneval.correct.EXCHANGE.exchange(intList42, intList50);
        java.lang.String str53 = humaneval.correct.EXCHANGE.exchange(intList29, intList50);
        java.lang.String str54 = humaneval.correct.EXCHANGE.exchange(intList23, intList50);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        java.lang.String str67 = humaneval.correct.EXCHANGE.exchange(intList57, intList65);
        java.lang.String str68 = humaneval.correct.EXCHANGE.exchange(intList50, intList57);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList79 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        java.lang.String str81 = humaneval.correct.EXCHANGE.exchange(intList71, intList79);
        java.lang.String str82 = humaneval.correct.EXCHANGE.exchange(intList50, intList79);
        java.lang.Class<?> wildcardClass83 = intList79.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YES" + "'", str25, "YES");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "YES" + "'", str26, "YES");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "YES" + "'", str39, "YES");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "YES" + "'", str52, "YES");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "YES" + "'", str53, "YES");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "NO" + "'", str54, "NO");
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "YES" + "'", str67, "YES");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NO" + "'", str68, "NO");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "YES" + "'", str81, "YES");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "NO" + "'", str82, "NO");
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test17");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.String str25 = humaneval.correct.EXCHANGE.exchange(intList15, intList23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.String str38 = humaneval.correct.EXCHANGE.exchange(intList28, intList36);
        java.lang.String str39 = humaneval.correct.EXCHANGE.exchange(intList15, intList36);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.String str52 = humaneval.correct.EXCHANGE.exchange(intList42, intList50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList63 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.String str65 = humaneval.correct.EXCHANGE.exchange(intList55, intList63);
        java.lang.String str66 = humaneval.correct.EXCHANGE.exchange(intList42, intList63);
        java.lang.String str67 = humaneval.correct.EXCHANGE.exchange(intList36, intList63);
        java.lang.String str68 = humaneval.correct.EXCHANGE.exchange(intList2, intList36);
        java.lang.Class<?> wildcardClass69 = intList2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YES" + "'", str25, "YES");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "YES" + "'", str38, "YES");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "YES" + "'", str39, "YES");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "YES" + "'", str52, "YES");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "YES" + "'", str65, "YES");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "YES" + "'", str66, "YES");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "YES" + "'", str68, "YES");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test18");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        java.lang.String str25 = humaneval.correct.EXCHANGE.exchange(intList15, intList23);
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        java.lang.String str38 = humaneval.correct.EXCHANGE.exchange(intList28, intList36);
        java.lang.String str39 = humaneval.correct.EXCHANGE.exchange(intList15, intList36);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        java.lang.String str52 = humaneval.correct.EXCHANGE.exchange(intList42, intList50);
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        java.lang.Integer[] intArray62 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList63 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList63, intArray62);
        java.lang.String str65 = humaneval.correct.EXCHANGE.exchange(intList55, intList63);
        java.lang.String str66 = humaneval.correct.EXCHANGE.exchange(intList42, intList63);
        java.lang.String str67 = humaneval.correct.EXCHANGE.exchange(intList36, intList63);
        java.lang.String str68 = humaneval.correct.EXCHANGE.exchange(intList10, intList36);
        java.lang.Class<?> wildcardClass69 = intList36.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "YES" + "'", str25, "YES");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "YES" + "'", str38, "YES");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "YES" + "'", str39, "YES");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "YES" + "'", str52, "YES");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "YES" + "'", str65, "YES");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "YES" + "'", str66, "YES");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "NO" + "'", str67, "NO");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "NO" + "'", str68, "NO");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test19");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        java.lang.String str12 = humaneval.correct.EXCHANGE.exchange(intList2, intList10);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 100, (-1) };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        java.lang.String str18 = humaneval.correct.EXCHANGE.exchange(intList10, intList16);
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList21 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList21, intArray20);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        java.lang.String str31 = humaneval.correct.EXCHANGE.exchange(intList21, intList29);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        java.lang.String str44 = humaneval.correct.EXCHANGE.exchange(intList34, intList42);
        java.lang.String str45 = humaneval.correct.EXCHANGE.exchange(intList21, intList42);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList56 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        java.lang.String str58 = humaneval.correct.EXCHANGE.exchange(intList48, intList56);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList61 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList69 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        java.lang.String str71 = humaneval.correct.EXCHANGE.exchange(intList61, intList69);
        java.lang.String str72 = humaneval.correct.EXCHANGE.exchange(intList48, intList69);
        java.lang.String str73 = humaneval.correct.EXCHANGE.exchange(intList42, intList69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList76 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList84 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        java.lang.String str86 = humaneval.correct.EXCHANGE.exchange(intList76, intList84);
        java.lang.String str87 = humaneval.correct.EXCHANGE.exchange(intList69, intList76);
        java.lang.String str88 = humaneval.correct.EXCHANGE.exchange(intList16, intList69);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YES" + "'", str12, "YES");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new java.lang.Integer[] { 100, (-1) });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NO" + "'", str18, "NO");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "YES" + "'", str31, "YES");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "YES" + "'", str44, "YES");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "YES" + "'", str45, "YES");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "YES" + "'", str58, "YES");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "YES" + "'", str71, "YES");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "YES" + "'", str72, "YES");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "NO" + "'", str73, "NO");
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "YES" + "'", str86, "YES");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "NO" + "'", str87, "NO");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "YES" + "'", str88, "YES");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EXCHANGE_RandoopTest0.test20");
        java.lang.Integer[] intArray2 = new java.lang.Integer[] { 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList3 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList3, intArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList7 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList7, intArray6);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList15 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList15, intArray14);
        java.lang.String str17 = humaneval.correct.EXCHANGE.exchange(intList7, intList15);
        java.lang.String str18 = humaneval.correct.EXCHANGE.exchange(intList3, intList7);
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, (-1) };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList34 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList34, intArray33);
        java.lang.String str36 = humaneval.correct.EXCHANGE.exchange(intList26, intList34);
        java.lang.String str37 = humaneval.correct.EXCHANGE.exchange(intList22, intList26);
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList40 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        java.lang.String str50 = humaneval.correct.EXCHANGE.exchange(intList40, intList48);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 1, 1, 10, 1, (-1) };
        java.util.ArrayList<java.lang.Integer> intList61 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        java.lang.String str63 = humaneval.correct.EXCHANGE.exchange(intList53, intList61);
        java.lang.String str64 = humaneval.correct.EXCHANGE.exchange(intList40, intList61);
        java.lang.String str65 = humaneval.correct.EXCHANGE.exchange(intList22, intList61);
        java.lang.String str66 = humaneval.correct.EXCHANGE.exchange(intList3, intList61);
        java.lang.Class<?> wildcardClass67 = intList61.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new java.lang.Integer[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "YES" + "'", str17, "YES");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "YES" + "'", str18, "YES");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new java.lang.Integer[] { 10, (-1) });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "YES" + "'", str36, "YES");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "YES" + "'", str37, "YES");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "YES" + "'", str50, "YES");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new java.lang.Integer[] { 10 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new java.lang.Integer[] { 1, 1, 10, 1, (-1) });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "YES" + "'", str63, "YES");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "YES" + "'", str64, "YES");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "YES" + "'", str65, "YES");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "YES" + "'", str66, "YES");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }
}

