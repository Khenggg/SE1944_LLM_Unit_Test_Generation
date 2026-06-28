package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FILE_NAME_CHECK_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FILE_NAME_CHECK_RandoopTest0.test1");
        java.lang.String str1 = humaneval.correct.FILE_NAME_CHECK.file_name_check("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "No" + "'", str1, "No");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FILE_NAME_CHECK_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FILE_NAME_CHECK_RandoopTest0.test3");
        humaneval.correct.FILE_NAME_CHECK fILE_NAME_CHECK0 = new humaneval.correct.FILE_NAME_CHECK();
        java.lang.Class<?> wildcardClass1 = fILE_NAME_CHECK0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FILE_NAME_CHECK_RandoopTest0.test4");
        java.lang.String str1 = humaneval.correct.FILE_NAME_CHECK.file_name_check("No");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "No" + "'", str1, "No");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FILE_NAME_CHECK_RandoopTest0.test5");
        java.lang.String str1 = humaneval.correct.FILE_NAME_CHECK.file_name_check("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "No" + "'", str1, "No");
    }
}

