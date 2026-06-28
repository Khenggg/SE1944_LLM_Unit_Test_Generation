package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HISTOGRAM_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HISTOGRAM_RandoopTest0.test1");
        java.util.HashMap<java.lang.Character, java.lang.Integer> charMap1 = humaneval.correct.HISTOGRAM.histogram("hi!");
        java.lang.Class<?> wildcardClass2 = charMap1.getClass();
        org.junit.Assert.assertNotNull(charMap1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HISTOGRAM_RandoopTest0.test2");
        humaneval.correct.HISTOGRAM hISTOGRAM0 = new humaneval.correct.HISTOGRAM();
        java.lang.Class<?> wildcardClass1 = hISTOGRAM0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HISTOGRAM_RandoopTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HISTOGRAM_RandoopTest0.test4");
        java.util.HashMap<java.lang.Character, java.lang.Integer> charMap1 = humaneval.correct.HISTOGRAM.histogram("");
        java.lang.Class<?> wildcardClass2 = charMap1.getClass();
        org.junit.Assert.assertNotNull(charMap1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

