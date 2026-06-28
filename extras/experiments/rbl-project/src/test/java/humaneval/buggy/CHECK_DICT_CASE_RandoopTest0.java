package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CHECK_DICT_CASE_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CHECK_DICT_CASE_RandoopTest0.test1");
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = humaneval.buggy.CHECK_DICT_CASE.check_dict_case(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.HashMap.size()\" because \"dict\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CHECK_DICT_CASE_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CHECK_DICT_CASE_RandoopTest0.test3");
        humaneval.buggy.CHECK_DICT_CASE cHECK_DICT_CASE0 = new humaneval.buggy.CHECK_DICT_CASE();
        java.lang.Class<?> wildcardClass1 = cHECK_DICT_CASE0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

