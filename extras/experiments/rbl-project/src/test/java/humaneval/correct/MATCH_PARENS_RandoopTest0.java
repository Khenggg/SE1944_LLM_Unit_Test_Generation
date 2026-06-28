package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MATCH_PARENS_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test001");
        humaneval.correct.MATCH_PARENS mATCH_PARENS0 = new humaneval.correct.MATCH_PARENS();
        java.lang.Class<?> wildcardClass1 = mATCH_PARENS0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test002");
        boolean boolean1 = humaneval.correct.MATCH_PARENS.check("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test004");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = humaneval.correct.MATCH_PARENS.match_parens(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test005");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test006");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = humaneval.correct.MATCH_PARENS.match_parens(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"lst\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test007");
        boolean boolean1 = humaneval.correct.MATCH_PARENS.check("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test008");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test009");
        boolean boolean1 = humaneval.correct.MATCH_PARENS.check("No");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test010");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test011");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass10 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test012");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test013");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test014");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test015");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test016");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test017");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test018");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test019");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test020");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.correct.MATCH_PARENS.match_parens(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test021");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass14 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test022");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.correct.MATCH_PARENS.match_parens(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "" });
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test023");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test024");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test025");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass10 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test026");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test027");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test028");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test029");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test030");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test031");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test032");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test033");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test034");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass16 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test035");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test036");
        java.lang.String[] strArray1 = new java.lang.String[] { "No" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.correct.MATCH_PARENS.match_parens(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "No" });
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test037");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test038");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test039");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass12 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test040");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test041");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "No", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test042");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test043");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test044");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "No", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test045");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass15 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test046");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass14 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test047");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass18 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test048");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass18 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test049");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass19 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test050");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test051");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test052");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass19 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test053");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass21 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test054");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass20 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test055");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test056");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "No", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test057");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test058");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test059");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass22 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test060");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test061");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test062");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test063");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test064");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass12 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test065");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass10 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test066");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass20 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test067");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test068");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test069");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass24 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test070");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass25 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test071");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass10 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test072");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "No", "", "", "hi!" };
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "No", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test073");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass23 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test074");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test075");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test076");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test077");
        java.lang.String[] strArray4 = new java.lang.String[] { "No", "", "No", "No" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "No", "", "No", "No" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test078");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "No", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test079");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass10 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test080");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test081");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass26 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test082");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test083");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "No", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test084");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass22 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test085");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass15 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test086");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass12 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test087");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "No" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "No" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test088");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test089");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass10 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test090");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass10 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test091");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass14 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test092");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "No", "", "", "hi!" };
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "No", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test093");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test094");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass27 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test095");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass28 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test096");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test097");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass21 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test098");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test099");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass14 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test100");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test101");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass16 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test102");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass30 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test103");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test104");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test105");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "No" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "No" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test106");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass16 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test107");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "No" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "No" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test108");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass24 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test109");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str31 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass32 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No" + "'", str31, "No");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test110");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test111");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass12 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test112");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "No", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test113");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass23 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test114");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test115");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test116");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test117");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "No", "hi!", "", "No", "No" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "No", "hi!", "", "No", "No" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test118");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str31 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str32 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str33 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass34 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No" + "'", str31, "No");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No" + "'", str32, "No");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "No" + "'", str33, "No");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test119");
        java.lang.String[] strArray4 = new java.lang.String[] { "No", "", "No", "No" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "No", "", "No", "No" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test120");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass18 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test121");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass29 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test122");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "No" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "No" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test123");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass14 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test124");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass20 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test125");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "No" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "No" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test126");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass31 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test127");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "No" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "No" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test128");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass19 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test129");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test130");
        java.lang.String[] strArray4 = new java.lang.String[] { "No", "", "No", "No" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "No", "", "No", "No" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test131");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass17 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test132");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass14 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test133");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test134");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "No", "hi!", "", "No", "No" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass10 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "No", "hi!", "", "No", "No" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test135");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass14 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test136");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str31 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str32 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str33 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str34 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass35 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No" + "'", str31, "No");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No" + "'", str32, "No");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "No" + "'", str33, "No");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "No" + "'", str34, "No");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test137");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "No" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass10 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "No" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test138");
        java.lang.String[] strArray4 = new java.lang.String[] { "No", "", "No", "No" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "No", "", "No", "No" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test139");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass26 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test140");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass21 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test141");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "No", "hi!", "", "No", "No" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "No", "hi!", "", "No", "No" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test142");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str31 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str32 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass33 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No" + "'", str31, "No");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No" + "'", str32, "No");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test143");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass14 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test144");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "No", "", "", "hi!" };
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "No", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test145");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test146");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass18 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test147");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass25 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test148");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass27 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test149");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass18 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test150");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test151");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str31 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str32 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str33 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str34 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str35 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str36 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass37 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No" + "'", str31, "No");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No" + "'", str32, "No");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "No" + "'", str33, "No");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "No" + "'", str34, "No");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "No" + "'", str35, "No");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "No" + "'", str36, "No");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test152");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test153");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass16 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test154");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass16 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test155");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "No", "hi!", "", "No", "No" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "No", "hi!", "", "No", "No" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test156");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "No", "", "", "hi!" };
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "No", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test157");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "No", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass12 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test158");
        java.lang.String[] strArray4 = new java.lang.String[] { "No", "", "No", "No" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "No", "", "No", "No" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test159");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "No" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "No" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test160");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "No", "hi!", "", "No", "No" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "No", "hi!", "", "No", "No" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test161");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test162");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "No", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass14 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test163");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str31 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str32 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str33 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str34 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str35 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str36 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str37 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass38 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No" + "'", str31, "No");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No" + "'", str32, "No");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "No" + "'", str33, "No");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "No" + "'", str34, "No");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "No" + "'", str35, "No");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "No" + "'", str36, "No");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "No" + "'", str37, "No");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test164");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass20 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test165");
        java.lang.String[] strArray4 = new java.lang.String[] { "No", "", "No", "No" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "No", "", "No", "No" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test166");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass20 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test167");
        java.lang.String[] strArray2 = new java.lang.String[] { "No", "" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "No", "" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test168");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test169");
        java.lang.String[] strArray2 = new java.lang.String[] { "No", "" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "No", "" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test170");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str31 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str32 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str33 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str34 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str35 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass36 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No" + "'", str31, "No");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No" + "'", str32, "No");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "No" + "'", str33, "No");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "No" + "'", str34, "No");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "No" + "'", str35, "No");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test171");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass28 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test172");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass16 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test173");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "No", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass15 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test174");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "No", "No", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test175");
        java.lang.String[] strArray2 = new java.lang.String[] { "No", "" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "No", "" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test176");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str31 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No" + "'", str31, "No");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test177");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass16 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test178");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass15 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test179");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass31 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "No", "hi!", "", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test180");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str31 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str32 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str33 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str34 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str35 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str36 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str37 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str38 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str39 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass40 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No" + "'", str31, "No");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No" + "'", str32, "No");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "No" + "'", str33, "No");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "No" + "'", str34, "No");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "No" + "'", str35, "No");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "No" + "'", str36, "No");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "No" + "'", str37, "No");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "No" + "'", str38, "No");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "No" + "'", str39, "No");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test181");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "hi!" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass17 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test182");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "No", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test183");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "No", "", "", "hi!" };
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray5);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "No", "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test184");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass23 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "hi!", "", "", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test185");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass22 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test186");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test187");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str23 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str24 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str25 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str26 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str27 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str28 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str29 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str30 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str31 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str32 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str33 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str34 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str35 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str36 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str37 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str38 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass39 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No" + "'", str23, "No");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No" + "'", str24, "No");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No" + "'", str25, "No");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No" + "'", str26, "No");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No" + "'", str27, "No");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No" + "'", str28, "No");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No" + "'", str29, "No");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No" + "'", str30, "No");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No" + "'", str31, "No");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No" + "'", str32, "No");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "No" + "'", str33, "No");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "No" + "'", str34, "No");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "No" + "'", str35, "No");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "No" + "'", str36, "No");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "No" + "'", str37, "No");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "No" + "'", str38, "No");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test188");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str21 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str22 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass23 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No" + "'", str21, "No");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No" + "'", str22, "No");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test189");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "No", "" };
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray3);
        java.lang.Class<?> wildcardClass15 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "No", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test190");
        java.lang.String[] strArray6 = new java.lang.String[] { "No", "", "", "", "No", "" };
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray6);
        java.lang.Class<?> wildcardClass21 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "No", "", "", "", "No", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test191");
        java.lang.String[] strArray2 = new java.lang.String[] { "No", "" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "No", "" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test192");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "No" };
        java.lang.String str3 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str4 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray2);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "No" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No" + "'", str3, "No");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No" + "'", str4, "No");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MATCH_PARENS_RandoopTest0.test193");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "No", "", "" };
        java.lang.String str5 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str6 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str7 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str8 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str9 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str10 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str11 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str12 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str13 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str14 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str15 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str16 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str17 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str18 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str19 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.String str20 = humaneval.correct.MATCH_PARENS.match_parens(strArray4);
        java.lang.Class<?> wildcardClass21 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "No", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No" + "'", str5, "No");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No" + "'", str6, "No");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No" + "'", str7, "No");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No" + "'", str8, "No");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No" + "'", str9, "No");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No" + "'", str10, "No");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No" + "'", str11, "No");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No" + "'", str12, "No");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No" + "'", str13, "No");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No" + "'", str14, "No");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No" + "'", str15, "No");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No" + "'", str16, "No");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No" + "'", str17, "No");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No" + "'", str18, "No");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No" + "'", str19, "No");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No" + "'", str20, "No");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }
}

