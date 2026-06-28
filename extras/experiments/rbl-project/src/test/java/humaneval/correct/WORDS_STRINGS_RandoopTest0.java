package humaneval.correct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WORDS_STRINGS_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WORDS_STRINGS_RandoopTest0.test1");
        java.util.ArrayList<java.lang.String> strList1 = humaneval.correct.WORDS_STRINGS.words_strings("hi!");
        java.lang.Class<?> wildcardClass2 = strList1.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WORDS_STRINGS_RandoopTest0.test2");
        humaneval.correct.WORDS_STRINGS wORDS_STRINGS0 = new humaneval.correct.WORDS_STRINGS();
        java.lang.Class<?> wildcardClass1 = wORDS_STRINGS0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WORDS_STRINGS_RandoopTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WORDS_STRINGS_RandoopTest0.test4");
        java.util.ArrayList<java.lang.String> strList1 = humaneval.correct.WORDS_STRINGS.words_strings("");
        java.lang.Class<?> wildcardClass2 = strList1.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

