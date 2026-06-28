package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class COUNT_UPPER_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COUNT_UPPER_RandoopTest0.test1");
        int int1 = humaneval.buggy.COUNT_UPPER.count_upper("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COUNT_UPPER_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COUNT_UPPER_RandoopTest0.test3");
        humaneval.buggy.COUNT_UPPER cOUNT_UPPER0 = new humaneval.buggy.COUNT_UPPER();
        java.lang.Class<?> wildcardClass1 = cOUNT_UPPER0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COUNT_UPPER_RandoopTest0.test4");
        int int1 = humaneval.buggy.COUNT_UPPER.count_upper("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }
}

