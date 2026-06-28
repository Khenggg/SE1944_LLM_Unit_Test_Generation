package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class STRONGEST_EXTENSION_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test002");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.lang.String str3 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!.hi!" + "'", str3, "hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test003");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!.hi!.hi!.null" + "'", str2, "hi!.hi!.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test004");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test005");
        humaneval.buggy.STRONGEST_EXTENSION sTRONGEST_EXTENSION0 = new humaneval.buggy.STRONGEST_EXTENSION();
        java.lang.Class<?> wildcardClass1 = sTRONGEST_EXTENSION0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test006");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test007");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test008");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!" + "'", str4, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!" + "'", str5, "hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test009");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!" + "'", str4, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str5, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test010");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test011");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!" + "'", str4, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".hi!.hi!" + "'", str5, ".hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test012");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray2);
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!.hi!.hi!.null" + "'", str3, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.null" + "'", str4, "hi!.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test013");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray2);
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!.hi!.hi!.null" + "'", str3, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".null" + "'", str4, ".null");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test014");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray9);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".hi!.null.hi!.hi!" + "'", str12, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test015");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test016");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!" + "'", str4, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".hi!" + "'", str5, ".hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test017");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!.hi!.hi!.hi!.hi!.null", ".hi!.null" };
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!.hi!.hi!.hi!.hi!.null", ".hi!.null" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null" + "'", str4, "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test018");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.null" + "'", str7, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".null" + "'", str8, ".null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.null" + "'", str9, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.null" + "'", str10, ".hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test019");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.null" + "'", str5, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".null" + "'", str6, ".null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test020");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".null" + "'", str5, ".null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test021");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray10);
        java.lang.Class<?> wildcardClass15 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.null.hi!.hi!" + "'", str13, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str14, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test022");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!" + "'", str10, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.null.hi!" + "'", str11, "hi!.hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test023");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".hi!.hi!" + "'", str6, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test024");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray2);
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!.hi!.hi!.null" + "'", str3, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test025");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray9);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test026");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.null" + "'", str6, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".null" + "'", str7, ".null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test027");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test028");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.null" + "'", str6, "hi!.hi!.hi!.null.hi!.hi!.null.null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test029");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".hi!.hi!" + "'", str6, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test030");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".hi!.null.hi!.hi!.hi!" + "'", str8, ".hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!" + "'", str9, "hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test031");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.hi!" + "'", str7, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test032");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null.hi!", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.null.hi!.null" + "'", str7, "hi!.hi!.null.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.null" + "'", str8, "hi!.null");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test033");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.null.hi!.hi!.hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test034");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray10);
        java.lang.Class<?> wildcardClass15 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test035");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray2);
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!.hi!.hi!.null" + "'", str3, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test036");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null.null" + "'", str6, "hi!.hi!.hi!.null.null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test037");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.null.hi!" + "'", str9, "hi!.hi!.hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test038");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.hi!" + "'", str7, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.hi!" + "'", str9, ".hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test039");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".hi!.null.hi!" + "'", str6, ".hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!" + "'", str7, ".hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test040");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.null" + "'", str7, "hi!.hi!.hi!.null.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".null.null" + "'", str8, ".null.null");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test041");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test042");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray12);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray12);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray12);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray12);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray12);
        java.lang.Class<?> wildcardClass19 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".hi!.null.hi!.hi!" + "'", str15, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str16, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.hi!" + "'", str17, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".null.hi!.hi!" + "'", str18, ".null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test043");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null.hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".null" + "'", str5, ".null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.null.hi!.null" + "'", str6, "hi!.hi!.null.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test044");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!" + "'", str9, ".hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test045");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray11);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray11);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray11);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray11);
        java.lang.Class<?> wildcardClass17 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.null.hi!.hi!" + "'", str14, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str15, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".hi!.hi!" + "'", str16, ".hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test046");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray13);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray13);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray13);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray13);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray13);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray13);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray13);
        java.lang.Class<?> wildcardClass21 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".hi!.null.hi!.hi!" + "'", str16, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str17, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".hi!.hi!" + "'", str18, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".null.hi!.hi!" + "'", str19, ".null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str20, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test047");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test048");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!", strArray9);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str11, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!" + "'", str12, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test049");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.hi!" + "'", str7, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str8, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test050");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test051");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray14);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray14);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray14);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray14);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray14);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray14);
        java.lang.String str21 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!", strArray14);
        java.lang.String str22 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.null.hi!.hi!" + "'", str17, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str18, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str19, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!.hi!.hi!" + "'", str20, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str21, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ".hi!.hi!.hi!" + "'", str22, ".hi!.hi!.hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test052");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!" + "'", str11, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.null.hi!" + "'", str12, "hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!" + "'", str13, ".hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test053");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test054");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test055");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.null", strArray7);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.null" + "'", str9, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".null" + "'", str10, ".null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.null" + "'", str11, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".hi!.null" + "'", str12, ".hi!.null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.null.null.null" + "'", str13, "hi!.hi!.hi!.null.null.null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.null.hi!.null" + "'", str14, ".hi!.null.hi!.null");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test056");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!" + "'", str4, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".hi!.null.hi!" + "'", str5, ".hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test057");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test058");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!" + "'", str9, "hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test059");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!" + "'", str10, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.hi!.null.hi!" + "'", str11, ".hi!.hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test060");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!", strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str10, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test061");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray12);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray12);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray12);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray12);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".hi!.null.hi!.hi!" + "'", str15, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str16, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.hi!" + "'", str17, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str18, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test062");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str6, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.null.hi!.hi!.hi!" + "'", str7, ".hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test063");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.hi!" + "'", str11, ".hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test064");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.null" + "'", str6, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".null" + "'", str7, ".null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".null.hi!.hi!.hi!.hi!.hi!.null" + "'", str8, ".null.hi!.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test065");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test066");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".hi!.hi!" + "'", str6, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test067");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray11);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray11);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray11);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray11);
        java.lang.Class<?> wildcardClass17 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.null.hi!.hi!" + "'", str14, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str15, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test068");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".null" + "'", str5, ".null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".hi!.hi!.null.hi!.null" + "'", str6, ".hi!.hi!.null.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test069");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!.hi!.hi!.hi!.hi!.null", ".hi!.null" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!.hi!.hi!.hi!.hi!.null", ".hi!.null" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null" + "'", str5, "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.null..hi!.null" + "'", str6, "hi!.hi!.null..hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test070");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".null.hi!.hi!.null" + "'", str6, ".null.hi!.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test071");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!", strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.null" + "'", str9, "hi!.hi!.hi!.null.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".null.null" + "'", str10, ".null.null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.null" + "'", str11, "hi!.null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".hi!.hi!.null" + "'", str12, ".hi!.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test072");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!", strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test073");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!.hi!", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".null.hi!.hi!.hi!.hi!.hi!" + "'", str13, ".null.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.hi!.null.hi!.null.hi!.hi!" + "'", str14, ".hi!.hi!.null.hi!.null.hi!.hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test074");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!.hi!.hi!.hi!.null" + "'", str2, "hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test075");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null.hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.null.hi!.null" + "'", str6, "hi!.hi!.null.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test076");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test077");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray13);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray13);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray13);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray13);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray13);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray13);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!", strArray13);
        java.lang.Class<?> wildcardClass21 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".hi!.null.hi!.hi!" + "'", str16, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str17, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str18, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!.hi!.hi!" + "'", str19, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str20, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test078");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray9);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".hi!.hi!" + "'", str12, ".hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test079");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!" + "'", str11, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.null.hi!" + "'", str12, "hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test080");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!.hi!", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!.hi!.hi!.hi!", strArray10);
        java.lang.Class<?> wildcardClass15 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".null.hi!.hi!.hi!.hi!.hi!" + "'", str13, ".null.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".null.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str14, ".null.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test081");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test082");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray5);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.null" + "'", str8, "hi!.hi!.hi!.null.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".null.null" + "'", str9, ".null.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null" + "'", str10, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test083");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test084");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!" + "'", str11, ".hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test085");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray6);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.null", strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.null" + "'", str8, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".null" + "'", str9, ".null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null" + "'", str10, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.null" + "'", str11, ".hi!.null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.null.null.null" + "'", str12, "hi!.hi!.hi!.null.null.null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test086");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".null.hi!.hi!.hi!" + "'", str9, ".null.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test087");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null..hi!.null", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".hi!.null.hi!.hi!.hi!" + "'", str8, ".hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.null..hi!.null.hi!" + "'", str9, "hi!.hi!.null..hi!.null.hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test088");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test089");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray13);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray13);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray13);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray13);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray13);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray13);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.null.null", strArray13);
        java.lang.Class<?> wildcardClass21 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".hi!.null.hi!.hi!" + "'", str16, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str17, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".hi!.hi!" + "'", str18, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str19, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!.null.null.hi!.hi!" + "'", str20, "hi!.null.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test090");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.null", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".hi!.hi!" + "'", str8, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str9, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".null.null.hi!" + "'", str11, ".null.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test091");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.hi!.hi!.hi!" + "'", str9, ".hi!.hi!.hi!.hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test092");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null.null", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.null" + "'", str6, "hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.null" + "'", str7, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".hi!.hi!.null.hi!.null.null.null" + "'", str8, ".hi!.hi!.null.hi!.null.null.null");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test093");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!..hi!.null", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!" + "'", str10, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test094");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!" + "'", str12, "hi!.hi!.hi!.null.hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test095");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.null.null", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test096");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray10);
        java.lang.Class<?> wildcardClass15 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test097");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray12);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray12);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray12);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray12);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.Class<?> wildcardClass19 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".hi!.null.hi!.hi!" + "'", str15, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str16, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str17, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!" + "'", str18, "hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test098");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.null", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.null.hi!.null.null" + "'", str7, ".hi!.null.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".null" + "'", str8, ".null");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test099");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".hi!.hi!" + "'", str6, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str7, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test100");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".null" + "'", str6, ".null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.null");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test101");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".hi!.hi!" + "'", str12, ".hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test102");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray11);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray11);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray11);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray11);
        java.lang.Class<?> wildcardClass17 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.null.hi!.hi!" + "'", str14, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str15, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".hi!.null.hi!.hi!" + "'", str16, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test103");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray8);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray8);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!" + "'", str9, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!" + "'", str12, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.null.hi!" + "'", str13, "hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!" + "'", str14, ".hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".hi!.hi!.hi!.hi!" + "'", str15, ".hi!.hi!.hi!.hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test104");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray15);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray15);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray15);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray15);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray15);
        java.lang.String str21 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray15);
        java.lang.String str22 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray15);
        java.lang.String str23 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray15);
        java.lang.String str24 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str17, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".hi!.null.hi!.hi!" + "'", str18, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str19, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ".hi!.hi!" + "'", str20, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".null.hi!.hi!" + "'", str21, ".null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str22, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str23, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str24, "hi!.hi!.hi!.hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test105");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.null.null.hi!.hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.null.null.hi!.hi!.hi!" + "'", str9, "hi!.null.null.hi!.hi!.hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test106");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test107");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str6, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".null.hi!.hi!.hi!" + "'", str7, ".null.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test108");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray14);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray14);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray14);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray14);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray14);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray14);
        java.lang.String str21 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray14);
        java.lang.String str22 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!", strArray14);
        java.lang.Class<?> wildcardClass23 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.null.hi!.hi!" + "'", str17, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str18, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".hi!.hi!" + "'", str19, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ".null.hi!.hi!" + "'", str20, ".null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str21, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str22, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test109");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray9);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray9);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray9);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray9);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!", strArray9);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.null", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!" + "'", str10, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!" + "'", str13, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.null.hi!" + "'", str14, "hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".hi!" + "'", str15, ".hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".hi!.hi!.null.hi!.hi!" + "'", str16, ".hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.null.hi!" + "'", str17, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.null.hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test110");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.null", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.null" + "'", str6, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.null.null" + "'", str7, "hi!.null.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".null.hi!.hi!.null" + "'", str8, ".null.hi!.hi!.null");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test111");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!.hi!", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".null.hi!.hi!.hi!.hi!.hi!" + "'", str13, ".null.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test112");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".null" + "'", str5, ".null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".null" + "'", str6, ".null");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test113");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray10);
        java.lang.Class<?> wildcardClass15 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test114");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!" + "'", str11, "hi!.hi!.hi!.null.hi!.hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test115");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray13);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray13);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray13);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray13);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray13);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray13);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray13);
        java.lang.Class<?> wildcardClass21 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".hi!.null.hi!.hi!" + "'", str16, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str17, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".hi!.hi!" + "'", str18, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".null.hi!.hi!" + "'", str19, ".null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ".hi!.hi!" + "'", str20, ".hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test116");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray12);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray12);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray12);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray12);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray12);
        java.lang.Class<?> wildcardClass19 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".hi!.null.hi!.hi!" + "'", str15, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str16, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.hi!" + "'", str17, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str18, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test117");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray12);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray12);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray12);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!", strArray12);
        java.lang.Class<?> wildcardClass19 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.null.hi!.hi!" + "'", str17, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str18, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test118");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null", strArray6);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.null" + "'", str8, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".null" + "'", str9, ".null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null" + "'", str10, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.hi!.null.hi!.null.null" + "'", str11, ".hi!.hi!.null.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".hi!.hi!.null.hi!.null" + "'", str12, ".hi!.hi!.null.hi!.null");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test119");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.hi!" + "'", str7, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test120");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null..hi!.null", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!", strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.null.hi!.hi!.hi!" + "'", str10, ".hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!" + "'", str11, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.null..hi!.null.hi!" + "'", str12, "hi!.hi!.null..hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.hi!.hi!" + "'", str13, ".hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test121");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray15);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray15);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray15);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray15);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray15);
        java.lang.String str21 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray15);
        java.lang.String str22 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!", strArray15);
        java.lang.String str23 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!", strArray15);
        java.lang.String str24 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str17, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".hi!.null.hi!.hi!" + "'", str18, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str19, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str20, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!.hi!.hi!" + "'", str21, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str22, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str23, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str24, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test122");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str6, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null.hi!" + "'", str7, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null.hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test123");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.null" + "'", str5, "hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.null" + "'", str6, "hi!.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test124");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.hi!" + "'", str9, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str10, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test125");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray14);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray14);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray14);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray14);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray14);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray14);
        java.lang.String str21 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!", strArray14);
        java.lang.String str22 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!", strArray14);
        java.lang.Class<?> wildcardClass23 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.null.hi!.hi!" + "'", str17, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str18, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str19, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!.hi!.hi!" + "'", str20, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str21, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str22, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test126");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.null", strArray7);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.null.hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.null" + "'", str9, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".null" + "'", str10, ".null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.null" + "'", str11, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".hi!.null" + "'", str12, ".hi!.null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.null.null.null" + "'", str13, "hi!.hi!.hi!.null.null.null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.null.hi!.null" + "'", str14, "hi!.hi!.hi!.hi!.null.hi!.null");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test127");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!", strArray7);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str9, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.null" + "'", str10, "hi!.hi!.hi!.null.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".null.null" + "'", str11, ".null.null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.null" + "'", str12, "hi!.null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.hi!.null" + "'", str13, ".hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null" + "'", str14, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test128");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!", strArray5);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null..hi!.null.hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".null.hi!.hi!.null" + "'", str8, ".null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.null.hi!.null" + "'", str9, "hi!.hi!.hi!.null.hi!.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.null..hi!.null.hi!.null" + "'", str10, "hi!.hi!.null..hi!.null.hi!.null");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test129");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!", strArray7);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null.null", strArray7);
        java.lang.Class<?> wildcardClass15 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str9, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.null" + "'", str10, "hi!.hi!.hi!.null.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".null.null" + "'", str11, ".null.null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.null" + "'", str12, "hi!.null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.hi!.null" + "'", str13, ".hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.hi!.null.hi!.null.null.null" + "'", str14, ".hi!.hi!.null.hi!.null.null.null");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test130");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray11);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray11);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray11);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.null.hi!.hi!" + "'", str14, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test131");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!" + "'", str11, ".hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".hi!.hi!.null.hi!.hi!.hi!" + "'", str12, ".hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str13, "hi!.hi!.hi!.null.hi!.hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test132");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str6, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test133");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.null.null", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.hi!" + "'", str7, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str8, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.null.null.hi!" + "'", str9, "hi!.null.null.hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test134");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!", strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.hi!.null.hi!.hi!" + "'", str13, ".hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test135");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray8);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray8);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null..hi!.null", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!" + "'", str9, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.null..hi!.null.hi!" + "'", str15, "hi!.hi!.null..hi!.null.hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test136");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray2);
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!.hi!.hi!.hi!.null" + "'", str3, "hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.null" + "'", str4, "hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test137");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".hi!.hi!" + "'", str8, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.null.hi!" + "'", str10, ".hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test138");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.null", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".hi!.null.hi!.null.null" + "'", str6, ".hi!.null.hi!.null.null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test139");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.null.null.hi!.hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test140");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray13);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray13);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray13);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray13);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray13);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray13);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null..hi!.null.hi!.null", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".hi!.null.hi!.hi!" + "'", str16, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str17, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str18, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!.hi!.hi!" + "'", str19, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!.hi!.null..hi!.null.hi!.null.hi!.hi!" + "'", str20, "hi!.hi!.null..hi!.null.hi!.null.hi!.hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test141");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray12);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray12);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray12);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!.null", strArray12);
        java.lang.Class<?> wildcardClass19 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.null.hi!.hi!" + "'", str17, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".null.hi!.hi!.null.hi!.hi!" + "'", str18, ".null.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test142");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test143");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".null.hi!.hi!.hi!" + "'", str8, ".null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test144");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray11);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray11);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!", strArray11);
        java.lang.Class<?> wildcardClass17 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".hi!.hi!.hi!.hi!" + "'", str16, ".hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test145");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str6, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.null.hi!" + "'", str7, ".hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test146");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.null.hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.null.hi!" + "'", str11, ".hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".null.null.hi!.hi!" + "'", str12, ".null.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test147");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.null.hi!.hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.hi!" + "'", str7, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.null.hi!.hi!.hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test148");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test149");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test150");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray11);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!.hi!", strArray11);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!.hi!.hi!.hi!", strArray11);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".null.hi!.hi!.hi!.hi!.hi!" + "'", str14, ".null.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".null.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str15, ".null.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!.hi!.hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test151");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.null.null.hi!.hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.null" + "'", str5, "hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.null.null.hi!.hi!.null" + "'", str6, "hi!.null.null.hi!.hi!.null");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test152");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str6, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test153");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray6);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!.hi!.hi!.hi!.null", strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.null" + "'", str9, "hi!.hi!.hi!.null.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".null.null" + "'", str10, ".null.null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.null.null" + "'", str11, "hi!.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".null.hi!.hi!.hi!.hi!.hi!.null.null" + "'", str12, ".null.hi!.hi!.hi!.hi!.hi!.null.null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test154");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!.hi!.hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test155");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.null.hi!", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.null.hi!" + "'", str10, ".hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".null.null.hi!.hi!" + "'", str11, ".null.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test156");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray14);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray14);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray14);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray14);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray14);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray14);
        java.lang.String str21 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray14);
        java.lang.String str22 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.hi!", strArray14);
        java.lang.Class<?> wildcardClass23 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.null.hi!.hi!" + "'", str17, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str18, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".hi!.hi!" + "'", str19, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str20, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str21, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!" + "'", str22, "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test157");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".hi!.hi!" + "'", str6, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test158");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray9);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray9);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray9);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray9);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!", strArray9);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!" + "'", str10, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!" + "'", str13, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.null.hi!" + "'", str14, "hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".hi!" + "'", str15, ".hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".hi!.hi!.null.hi!.hi!" + "'", str16, ".hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!" + "'", str17, "hi!.hi!.hi!.hi!.hi!.null.hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test159");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray11);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!", strArray11);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.hi!" + "'", str14, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test160");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray8);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray8);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!" + "'", str9, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!" + "'", str12, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.null.hi!" + "'", str13, "hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.null.hi!" + "'", str14, "hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".hi!" + "'", str15, ".hi!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test161");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.null.null", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.null.hi!" + "'", str9, ".hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.null.null.null.hi!" + "'", str11, "hi!.hi!.hi!.null.null.null.hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test162");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray5);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.null" + "'", str8, "hi!.hi!.hi!.null.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".null.null" + "'", str9, ".null.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.null" + "'", str10, "hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test163");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray12);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray12);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!", strArray12);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.null.null", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.hi!.hi!.hi!" + "'", str17, ".hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".hi!.null.hi!.null.null.hi!.hi!" + "'", str18, ".hi!.null.hi!.null.null.hi!.hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test164");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.hi!" + "'", str7, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!" + "'", str9, "hi!.hi!.hi!.null.hi!.hi!.null.hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test165");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.hi!.null.hi!.null.hi!" + "'", str13, ".hi!.hi!.null.hi!.null.hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test166");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.null", strArray5);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null.null" + "'", str8, "hi!.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.null.hi!.null.null" + "'", str9, ".hi!.null.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.null" + "'", str10, "hi!.null");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test167");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!", strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!" + "'", str11, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.null.hi!" + "'", str12, "hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test168");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.null.hi!.null.hi!.hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.null" + "'", str6, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".null" + "'", str7, ".null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".null.null.hi!.null.hi!.hi!.null" + "'", str8, ".null.null.hi!.null.hi!.hi!.null");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test169");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.null" + "'", str6, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".null" + "'", str7, ".null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.null");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test170");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null", strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.null" + "'", str7, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".null" + "'", str8, ".null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.null" + "'", str9, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.hi!.null.hi!.null.null" + "'", str10, ".hi!.hi!.null.hi!.null.null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test171");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null.null" + "'", str7, "hi!.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null.null" + "'", str8, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null.null");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test172");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str6, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test173");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.null.hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".null" + "'", str6, ".null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".null.null.hi!.null" + "'", str8, ".null.null.hi!.null");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test174");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray11);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray11);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray11);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null.null", strArray11);
        java.lang.Class<?> wildcardClass17 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.null.hi!.hi!" + "'", str14, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str15, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".hi!.hi!.null.hi!.null.null.hi!.hi!" + "'", str16, ".hi!.hi!.null.hi!.null.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test175");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.null", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.hi!" + "'", str7, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.null.hi!.null.hi!" + "'", str9, ".hi!.null.hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test176");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray11);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray11);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!", strArray11);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.hi!" + "'", str14, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test177");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.null.hi!" + "'", str9, ".hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!" + "'", str11, "hi!.hi!.hi!.null.hi!.hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test178");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray8);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray8);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray8);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.null.hi!.hi!.hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!" + "'", str9, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!" + "'", str13, "hi!.hi!.hi!.null.hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".null.null.hi!.hi!.hi!.hi!" + "'", str15, ".null.null.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test179");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.null", strArray10);
        java.lang.Class<?> wildcardClass15 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.hi!" + "'", str13, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.null.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test180");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test181");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.null", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.null.hi!.null.hi!" + "'", str11, ".hi!.null.hi!.null.hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test182");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray9);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray9);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray9);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray9);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray9);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray9);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!", strArray9);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null..hi!.null.hi!.hi!", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!" + "'", str10, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.null..hi!.null.hi!.hi!.hi!" + "'", str17, "hi!.hi!.null..hi!.null.hi!.hi!.hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test183");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.null.null.hi!", strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.hi!" + "'", str9, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str10, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.null.null.hi!.hi!" + "'", str13, "hi!.null.null.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test184");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.null.null.hi!.hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".null.hi!.hi!.hi!" + "'", str9, ".null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.null.hi!.null.null.hi!.hi!.hi!" + "'", str11, ".hi!.null.hi!.null.null.hi!.hi!.hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test185");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".null.hi!.hi!.null" + "'", str9, ".null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null.hi!.null" + "'", str10, "hi!.hi!.hi!.null.hi!.null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!.null" + "'", str11, ".hi!.null.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.null" + "'", str12, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.null");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test186");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.null", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!.null.hi!" + "'", str7, "hi!.hi!.hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".hi!.hi!.hi!.hi!" + "'", str8, ".hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.null.hi!.hi!" + "'", str9, ".hi!.null.hi!.hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test187");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray14);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray14);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray14);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray14);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray14);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray14);
        java.lang.String str21 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!", strArray14);
        java.lang.String str22 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.null.null.hi!.hi!", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.null.hi!.hi!" + "'", str17, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str18, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str19, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!.hi!.hi!" + "'", str20, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str21, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ".hi!.null.hi!.null.null.hi!.hi!.hi!.hi!" + "'", str22, ".hi!.null.hi!.null.null.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test188");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null.null", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.hi!.null.hi!.null.null.hi!" + "'", str13, ".hi!.hi!.null.hi!.null.null.hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test189");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!" + "'", str5, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str6, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test190");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.hi!" + "'", str10, ".hi!.hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test191");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray8);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!", strArray8);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null..hi!.null", strArray8);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!", strArray8);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!" + "'", str9, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.null.hi!.hi!.hi!" + "'", str11, ".hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!" + "'", str12, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.null..hi!.null.hi!" + "'", str13, "hi!.hi!.null..hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.hi!.hi!" + "'", str14, ".hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!" + "'", str15, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test192");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray15);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray15);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray15);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray15);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray15);
        java.lang.String str21 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray15);
        java.lang.String str22 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray15);
        java.lang.String str23 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray15);
        java.lang.String str24 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.null.hi!.hi!", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str17, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".hi!.null.hi!.hi!" + "'", str18, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str19, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ".hi!.hi!" + "'", str20, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".null.hi!.hi!" + "'", str21, ".null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str22, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str23, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str24, "hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test193");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray14);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray14);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray14);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray14);
        java.lang.String str19 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray14);
        java.lang.String str20 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!", strArray14);
        java.lang.String str21 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.null.hi!", strArray14);
        java.lang.String str22 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!" + "'", str15, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str17, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str18, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ".hi!.null.hi!.hi!" + "'", str19, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str20, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ".null.null.hi!.hi!.hi!" + "'", str21, ".null.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!" + "'", str22, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test194");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test195");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray8);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray8);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray8);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray8);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.null.null.hi!.hi!", strArray8);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null..hi!.null.hi!.null", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!" + "'", str9, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.hi!" + "'", str10, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".hi!.hi!" + "'", str12, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.null.null.hi!.hi!.hi!" + "'", str14, "hi!.null.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.null..hi!.null.hi!.null.hi!" + "'", str15, "hi!.hi!.null..hi!.null.hi!.null.hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test196");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!.hi!.hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test197");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!..hi!.null", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.null.hi!" + "'", str9, ".hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test198");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!.hi!.hi!.hi!.hi!.null", ".hi!.null" };
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null.null.null", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!.hi!.hi!.hi!.hi!.null", ".hi!.null" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null" + "'", str5, "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".hi!.hi!.null.hi!.null.null.null..hi!.null" + "'", str6, ".hi!.hi!.null.hi!.null.null.null..hi!.null");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test199");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null..hi!.null", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.null.hi!.hi!.hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.null.hi!.hi!.hi!" + "'", str10, ".hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!" + "'", str11, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.null..hi!.null.hi!" + "'", str12, "hi!.hi!.null..hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test200");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str7, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.null.hi!" + "'", str9, ".hi!.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test201");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!", strArray10);
        java.lang.Class<?> wildcardClass15 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.hi!" + "'", str13, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test202");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null..hi!.null.hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.hi!" + "'", str9, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.null..hi!.null.hi!.hi!" + "'", str12, "hi!.hi!.null..hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.hi!.null.hi!.null.hi!" + "'", str13, ".hi!.hi!.null.hi!.null.hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test203");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.hi!" + "'", str7, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str8, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test204");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.hi!" + "'", str13, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.hi!" + "'", str14, ".hi!.hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test205");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test206");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test207");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.null.null.hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.hi!" + "'", str9, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str10, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.null.null.hi!.hi!" + "'", str13, "hi!.null.null.hi!.hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test208");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.null", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null.null" + "'", str7, "hi!.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".hi!.null.hi!.null.null" + "'", str8, ".hi!.null.hi!.null.null");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test209");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!.null.hi!" + "'", str9, ".hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test210");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!", strArray7);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str9, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.null" + "'", str10, "hi!.hi!.hi!.null.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".null.null" + "'", str11, ".null.null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.null.null" + "'", str12, "hi!.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".hi!.hi!.null.hi!.null" + "'", str13, ".hi!.hi!.null.hi!.null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.null.null" + "'", str14, "hi!.hi!.hi!.null.null");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test211");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray12);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray12);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray12);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray12);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".hi!.null.hi!.hi!" + "'", str15, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!" + "'", str16, "hi!.hi!.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".hi!.hi!" + "'", str17, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str18, "hi!.hi!.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test212");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.null", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".null.hi!.hi!.hi!" + "'", str10, ".null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.null.null.hi!" + "'", str11, "hi!.hi!.hi!.null.null.hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test213");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test214");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.null.null.hi!.hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".hi!" + "'", str10, ".hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.hi!.null.hi!.null.null.hi!.hi!.hi!" + "'", str11, ".hi!.hi!.null.hi!.null.null.hi!.hi!.hi!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test215");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray7);
        java.lang.Class<?> wildcardClass14 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!" + "'", str8, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test216");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray7);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!", strArray7);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null", strArray7);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null", strArray7);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null", strArray7);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.null.null.hi!", strArray7);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null" + "'", str9, "hi!.hi!.hi!.null.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.null" + "'", str10, "hi!.hi!.hi!.null.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".null.null" + "'", str11, ".null.null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!.null.null" + "'", str12, "hi!.hi!.hi!.null.null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.null.null.hi!.null" + "'", str13, "hi!.null.null.hi!.null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null" + "'", str14, "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test217");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray8);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray8);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null.null", strArray8);
        java.lang.Class<?> wildcardClass16 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!" + "'", str9, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null.null.hi!" + "'", str15, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.null.null.hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test218");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray4);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray4);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray4);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!.hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.hi!.hi!.null" + "'", str5, "hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.null" + "'", str6, "hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.hi!.null" + "'", str7, "hi!.hi!.hi!.null.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!.hi!.null" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!..hi!.null.hi!.hi!.null");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test219");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray8);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray8);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray8);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.null", strArray8);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!" + "'", str9, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!" + "'", str12, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.null.hi!" + "'", str13, "hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.null.hi!" + "'", str14, "hi!.hi!.null.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".null.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str15, ".null.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test220");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray6);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray6);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!", strArray6);
        java.lang.String str10 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!", strArray6);
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null.hi!.hi!.hi!", strArray6);
        java.lang.Class<?> wildcardClass12 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!.hi!" + "'", str7, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".hi!.hi!" + "'", str8, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!.hi!.hi!" + "'", str9, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str10, "hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".hi!.null.hi!.hi!.hi!.hi!" + "'", str11, ".hi!.null.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test221");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str11 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str12 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray10);
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray10);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.hi!.null.hi!.hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!.hi!.hi!" + "'", str11, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!.hi!.hi!" + "'", str12, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str14, ".hi!.hi!.null.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test222");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" };
        java.lang.String str13 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray12);
        java.lang.String str14 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!", strArray12);
        java.lang.String str15 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!.null", strArray12);
        java.lang.String str16 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray12);
        java.lang.String str17 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".null.null.hi!.null", strArray12);
        java.lang.String str18 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.null.hi!.hi!", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!.hi!", "hi!.hi!.hi!.null", "hi!.hi!", "hi!", "hi!", "hi!.hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!.hi!.hi!" + "'", str13, "hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!.hi!.hi!.hi!.hi!" + "'", str14, "hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".hi!.null.hi!.hi!" + "'", str15, ".hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!" + "'", str16, "hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ".null.null.hi!.null.hi!.hi!" + "'", str17, ".null.null.hi!.null.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!" + "'", str18, "hi!.hi!.hi!.hi!.hi!.null.hi!.hi!.hi!.hi!");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test223");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray5);
        java.lang.String str7 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(".hi!", strArray5);
        java.lang.String str8 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!.hi!.hi!", strArray5);
        java.lang.String str9 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!" + "'", str6, "hi!.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".hi!.hi!" + "'", str7, ".hi!.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!.hi!.hi!.hi!.hi!.hi!.hi!" + "'", str8, "hi!.hi!.hi!.hi!.hi!.hi!.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".hi!" + "'", str9, ".hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "STRONGEST_EXTENSION_RandoopTest0.test224");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.hi!", strArray3);
        java.lang.String str5 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!", strArray3);
        java.lang.String str6 = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension("hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!.hi!.hi!.hi!.null" + "'", str4, "hi!.hi!.hi!.hi!.null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!.null" + "'", str5, "hi!.null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.null" + "'", str6, "hi!.hi!.hi!.null.hi!.hi!.hi!.hi!.hi!.null");
    }
}

