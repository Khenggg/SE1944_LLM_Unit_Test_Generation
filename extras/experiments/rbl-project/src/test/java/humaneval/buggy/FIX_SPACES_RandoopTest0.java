package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FIX_SPACES_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FIX_SPACES_RandoopTest0.test1");
        java.lang.String str1 = humaneval.buggy.FIX_SPACES.fix_spaces("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FIX_SPACES_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FIX_SPACES_RandoopTest0.test3");
        humaneval.buggy.FIX_SPACES fIX_SPACES0 = new humaneval.buggy.FIX_SPACES();
        java.lang.Class<?> wildcardClass1 = fIX_SPACES0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FIX_SPACES_RandoopTest0.test4");
        java.lang.String str1 = humaneval.buggy.FIX_SPACES.fix_spaces("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }
}

