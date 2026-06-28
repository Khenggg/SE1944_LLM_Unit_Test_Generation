package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VOWELS_COUNT_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VOWELS_COUNT_RandoopTest0.test1");
        int int1 = humaneval.buggy.VOWELS_COUNT.vowels_count("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VOWELS_COUNT_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VOWELS_COUNT_RandoopTest0.test3");
        humaneval.buggy.VOWELS_COUNT vOWELS_COUNT0 = new humaneval.buggy.VOWELS_COUNT();
        java.lang.Class<?> wildcardClass1 = vOWELS_COUNT0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "VOWELS_COUNT_RandoopTest0.test4");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.VOWELS_COUNT.vowels_count("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }
}

