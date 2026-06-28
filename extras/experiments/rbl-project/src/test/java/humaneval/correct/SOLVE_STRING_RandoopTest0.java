package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SOLVE_STRING_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SOLVE_STRING_RandoopTest0.test1");
        java.lang.String str1 = humaneval.correct.SOLVE_STRING.solve_string("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SOLVE_STRING_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SOLVE_STRING_RandoopTest0.test3");
        humaneval.correct.SOLVE_STRING sOLVE_STRING0 = new humaneval.correct.SOLVE_STRING();
        java.lang.Class<?> wildcardClass1 = sOLVE_STRING0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SOLVE_STRING_RandoopTest0.test4");
        java.lang.String str1 = humaneval.correct.SOLVE_STRING.solve_string("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SOLVE_STRING_RandoopTest0.test5");
        java.lang.String str1 = humaneval.correct.SOLVE_STRING.solve_string("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }
}

