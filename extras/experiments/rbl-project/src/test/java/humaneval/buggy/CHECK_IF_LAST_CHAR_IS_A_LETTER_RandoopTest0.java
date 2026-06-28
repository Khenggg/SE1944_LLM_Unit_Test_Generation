package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CHECK_IF_LAST_CHAR_IS_A_LETTER_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CHECK_IF_LAST_CHAR_IS_A_LETTER_RandoopTest0.test1");
        boolean boolean1 = humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CHECK_IF_LAST_CHAR_IS_A_LETTER_RandoopTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CHECK_IF_LAST_CHAR_IS_A_LETTER_RandoopTest0.test3");
        humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER cHECK_IF_LAST_CHAR_IS_A_LETTER0 = new humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER();
        java.lang.Class<?> wildcardClass1 = cHECK_IF_LAST_CHAR_IS_A_LETTER0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CHECK_IF_LAST_CHAR_IS_A_LETTER_RandoopTest0.test4");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = humaneval.buggy.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }
}

