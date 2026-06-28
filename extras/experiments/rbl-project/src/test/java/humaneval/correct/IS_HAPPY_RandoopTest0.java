package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IS_HAPPY_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IS_HAPPY_RandoopTest0.test1");
        boolean boolean1 = humaneval.correct.IS_HAPPY.is_happy("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IS_HAPPY_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IS_HAPPY_RandoopTest0.test3");
        humaneval.correct.IS_HAPPY iS_HAPPY0 = new humaneval.correct.IS_HAPPY();
        java.lang.Class<?> wildcardClass1 = iS_HAPPY0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IS_HAPPY_RandoopTest0.test4");
        boolean boolean1 = humaneval.correct.IS_HAPPY.is_happy("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

