package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class REMOVE_VOWELS_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "REMOVE_VOWELS_RandoopTest0.test1");
        java.lang.String str1 = humaneval.buggy.REMOVE_VOWELS.remove_vowels("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!" + "'", str1, "h!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "REMOVE_VOWELS_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "REMOVE_VOWELS_RandoopTest0.test3");
        humaneval.buggy.REMOVE_VOWELS rEMOVE_VOWELS0 = new humaneval.buggy.REMOVE_VOWELS();
        java.lang.Class<?> wildcardClass1 = rEMOVE_VOWELS0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "REMOVE_VOWELS_RandoopTest0.test4");
        java.lang.String str1 = humaneval.buggy.REMOVE_VOWELS.remove_vowels("h!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!" + "'", str1, "h!");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "REMOVE_VOWELS_RandoopTest0.test5");
        java.lang.String str1 = humaneval.buggy.REMOVE_VOWELS.remove_vowels("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }
}

