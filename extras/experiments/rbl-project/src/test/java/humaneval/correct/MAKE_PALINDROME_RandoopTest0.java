package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MAKE_PALINDROME_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test1");
        humaneval.correct.MAKE_PALINDROME mAKE_PALINDROME0 = new humaneval.correct.MAKE_PALINDROME();
        java.lang.Class<?> wildcardClass1 = mAKE_PALINDROME0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test2");
        boolean boolean1 = humaneval.correct.MAKE_PALINDROME.is_palindrome("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test4");
        java.lang.String str1 = humaneval.correct.MAKE_PALINDROME.make_palindrome("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test5");
        boolean boolean1 = humaneval.correct.MAKE_PALINDROME.is_palindrome("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test6");
        java.lang.String str1 = humaneval.correct.MAKE_PALINDROME.make_palindrome("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ih" + "'", str1, "hi!ih");
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test7");
        boolean boolean1 = humaneval.correct.MAKE_PALINDROME.is_palindrome("hi!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MAKE_PALINDROME_RandoopTest0.test8");
        java.lang.String str1 = humaneval.correct.MAKE_PALINDROME.make_palindrome("hi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ih" + "'", str1, "hi!ih");
    }
}

