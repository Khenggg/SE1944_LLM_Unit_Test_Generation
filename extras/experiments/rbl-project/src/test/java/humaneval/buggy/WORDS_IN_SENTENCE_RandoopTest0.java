package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WORDS_IN_SENTENCE_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WORDS_IN_SENTENCE_RandoopTest0.test1");
        java.lang.String str1 = humaneval.buggy.WORDS_IN_SENTENCE.words_in_sentence("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WORDS_IN_SENTENCE_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WORDS_IN_SENTENCE_RandoopTest0.test3");
        humaneval.buggy.WORDS_IN_SENTENCE wORDS_IN_SENTENCE0 = new humaneval.buggy.WORDS_IN_SENTENCE();
        java.lang.Class<?> wildcardClass1 = wORDS_IN_SENTENCE0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WORDS_IN_SENTENCE_RandoopTest0.test4");
        java.lang.String str1 = humaneval.buggy.WORDS_IN_SENTENCE.words_in_sentence("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }
}

