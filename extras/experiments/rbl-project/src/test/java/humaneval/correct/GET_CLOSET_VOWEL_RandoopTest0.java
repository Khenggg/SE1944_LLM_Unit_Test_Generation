package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GET_CLOSET_VOWEL_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_CLOSET_VOWEL_RandoopTest0.test1");
        java.lang.String str1 = humaneval.correct.GET_CLOSET_VOWEL.get_closet_vowel("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i" + "'", str1, "i");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_CLOSET_VOWEL_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_CLOSET_VOWEL_RandoopTest0.test3");
        humaneval.correct.GET_CLOSET_VOWEL gET_CLOSET_VOWEL0 = new humaneval.correct.GET_CLOSET_VOWEL();
        java.lang.Class<?> wildcardClass1 = gET_CLOSET_VOWEL0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_CLOSET_VOWEL_RandoopTest0.test4");
        java.lang.String str1 = humaneval.correct.GET_CLOSET_VOWEL.get_closet_vowel("i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GET_CLOSET_VOWEL_RandoopTest0.test5");
        java.lang.String str1 = humaneval.correct.GET_CLOSET_VOWEL.get_closet_vowel("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }
}

