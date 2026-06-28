package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HEX_KEY_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HEX_KEY_RandoopTest0.test1");
        int int1 = humaneval.correct.HEX_KEY.hex_key("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HEX_KEY_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HEX_KEY_RandoopTest0.test3");
        humaneval.correct.HEX_KEY hEX_KEY0 = new humaneval.correct.HEX_KEY();
        java.lang.Class<?> wildcardClass1 = hEX_KEY0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HEX_KEY_RandoopTest0.test4");
        int int1 = humaneval.correct.HEX_KEY.hex_key("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }
}

