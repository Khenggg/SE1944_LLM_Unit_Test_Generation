package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ENCODE_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ENCODE_RandoopTest0.test1");
        java.lang.String str1 = humaneval.buggy.ENCODE.encode("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HK!" + "'", str1, "HK!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ENCODE_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ENCODE_RandoopTest0.test3");
        humaneval.buggy.ENCODE eNCODE0 = new humaneval.buggy.ENCODE();
        java.lang.Class<?> wildcardClass1 = eNCODE0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ENCODE_RandoopTest0.test4");
        java.lang.String str1 = humaneval.buggy.ENCODE.encode("HK!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HK!" + "'", str1, "HK!");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ENCODE_RandoopTest0.test5");
        java.lang.String str1 = humaneval.buggy.ENCODE.encode("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }
}

