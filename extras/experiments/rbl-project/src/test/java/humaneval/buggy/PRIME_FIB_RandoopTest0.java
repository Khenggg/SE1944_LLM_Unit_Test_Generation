package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PRIME_FIB_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test01");
        humaneval.buggy.PRIME_FIB pRIME_FIB0 = new humaneval.buggy.PRIME_FIB();
        java.lang.Class<?> wildcardClass1 = pRIME_FIB0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test02");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test04");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test05");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test06");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test07");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test08");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test09");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test10");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test11");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test12");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test13");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test14");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test15");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test16");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test17");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test18");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test19");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test20");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test21");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test22");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test23");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test24");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test25");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test26");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test27");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test28");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test29");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test30");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test31");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test32");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test33");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test34");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test35");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test36");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test37");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test38");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test39");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = humaneval.buggy.PRIME_FIB.prime_fib((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PRIME_FIB_RandoopTest0.test40");
        boolean boolean1 = humaneval.buggy.PRIME_FIB.is_prime((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

