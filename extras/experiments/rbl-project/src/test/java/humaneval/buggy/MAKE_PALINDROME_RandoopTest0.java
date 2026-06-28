package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MAKE_PALINDROME_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test01");
        humaneval.buggy.MAKE_PALINDROME mAKE_PALINDROME0 = new humaneval.buggy.MAKE_PALINDROME();
        java.lang.Class<?> wildcardClass1 = mAKE_PALINDROME0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test02");
        boolean boolean1 = humaneval.buggy.MAKE_PALINDROME.is_palindrome("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test04");
        java.lang.String str1 = humaneval.buggy.MAKE_PALINDROME.make_palindrome("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test05");
        boolean boolean1 = humaneval.buggy.MAKE_PALINDROME.is_palindrome("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test06");
        java.lang.String str1 = humaneval.buggy.MAKE_PALINDROME.make_palindrome("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi" + "'", str1, "hi!hi");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test07");
        boolean boolean1 = humaneval.buggy.MAKE_PALINDROME.is_palindrome("hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test08");
        java.lang.String str1 = humaneval.buggy.MAKE_PALINDROME.make_palindrome("hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!h" + "'", str1, "hi!hihi!h");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test09");
        boolean boolean1 = humaneval.buggy.MAKE_PALINDROME.is_palindrome("hi!hihi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test10");
        java.lang.String str1 = humaneval.buggy.MAKE_PALINDROME.make_palindrome("hi!hihi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hhi!hihi!" + "'", str1, "hi!hihi!hhi!hihi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test11");
        boolean boolean1 = humaneval.buggy.MAKE_PALINDROME.is_palindrome("hi!hihi!hhi!hihi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test12");
        java.lang.String str1 = humaneval.buggy.MAKE_PALINDROME.make_palindrome("hi!hihi!hhi!hihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hhi!hihi!hi!hihi!hhi!hihi" + "'", str1, "hi!hihi!hhi!hihi!hi!hihi!hhi!hihi");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test13");
        boolean boolean1 = humaneval.buggy.MAKE_PALINDROME.is_palindrome("hi!hihi!hhi!hihi!hi!hihi!hhi!hihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test14");
        java.lang.String str1 = humaneval.buggy.MAKE_PALINDROME.make_palindrome("hi!hihi!hhi!hihi!hi!hihi!hhi!hihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!h" + "'", str1, "hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!h");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test15");
        boolean boolean1 = humaneval.buggy.MAKE_PALINDROME.is_palindrome("hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test16");
        java.lang.String str1 = humaneval.buggy.MAKE_PALINDROME.make_palindrome("hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!" + "'", str1, "hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test17");
        boolean boolean1 = humaneval.buggy.MAKE_PALINDROME.is_palindrome("hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test18");
        java.lang.String str1 = humaneval.buggy.MAKE_PALINDROME.make_palindrome("hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi" + "'", str1, "hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test19");
        java.lang.String str1 = humaneval.buggy.MAKE_PALINDROME.make_palindrome("hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhihi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hh" + "'", str1, "hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhihi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hh");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test20");
        java.lang.String str1 = humaneval.buggy.MAKE_PALINDROME.make_palindrome("hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhihi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhihi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhihi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!" + "'", str1, "hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhihi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhihi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test21");
        boolean boolean1 = humaneval.buggy.MAKE_PALINDROME.is_palindrome("hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhihi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test22");
        boolean boolean1 = humaneval.buggy.MAKE_PALINDROME.is_palindrome("hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhihi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhihi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test23");
        boolean boolean1 = humaneval.buggy.MAKE_PALINDROME.is_palindrome("hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi!hhi!hihi!hhi!hihi!hi!hihi!hhi!hihihi!hihi!hhi!hihi!hi!hihi!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

