package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class COMPARE_ONE_RandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0.0d, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test002");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1), obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test003");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0.0f, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0.0d, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test006");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1L), (java.lang.Object) true);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test008");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) "hi!", obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test009");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass2 = cOMPARE_ONE1.getClass();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) cOMPARE_ONE1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test010");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) 100L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class java.lang.Integer (java.lang.Boolean and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Integer (java.lang.Short and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test013");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class humaneval.buggy.COMPARE_ONE cannot be cast to class java.lang.Integer (humaneval.buggy.COMPARE_ONE is in unnamed module of loader 'app'; java.lang.Integer is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test015");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) -1, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Integer (java.lang.Short and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1.0d), (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Integer (java.lang.Float and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test018");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1.0d), obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Integer.doubleValue()\" because \"b\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test020");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass1 = cOMPARE_ONE0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class humaneval.buggy.COMPARE_ONE cannot be cast to class java.lang.Integer (humaneval.buggy.COMPARE_ONE is in unnamed module of loader 'app'; java.lang.Integer is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1), (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test022");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test023");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 10, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test025");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '#', (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test028");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test029");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test030");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test031");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 10.0d, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test034");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100L, (java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test035");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) ' ', (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Integer (java.lang.Character and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test038");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) true);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test039");
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) "", obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test040");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test042");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test043");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test044");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Integer (java.lang.Short and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test046");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test047");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test048");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0f, (java.lang.Object) 'a');
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0f, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test051");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test052");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) "", obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1), (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test054");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) false, (java.lang.Object) 1L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '#', (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test056");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) false, (java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class java.lang.Integer (java.lang.Double and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test058");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 10L, (java.lang.Object) 'a');
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test061");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) 0, (java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test062");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) (short) 100);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test063");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test064");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) 0, (java.lang.Object) 10L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) "hi!", (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) "", (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0.0f, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test068");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) false, (java.lang.Object) '4');
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0.0d, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Integer (java.lang.Short and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test070");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) 10, (java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0.0d, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Integer (java.lang.Byte and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) ' ', (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Integer (java.lang.Character and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test073");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) "hi!", (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test074");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) 10L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1), (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test076");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 10.0f, (java.lang.Object) 1L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class java.lang.Integer (java.lang.Short and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test078");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0.0d, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test080");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test081");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 10, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test084");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) -1, (java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test085");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 10.0f, (java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test086");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) 'a');
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test087");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test088");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, obj3);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test089");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) 100L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test090");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test091");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, (java.lang.Object) false);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test092");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) (short) 0);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test093");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 10, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test094");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test095");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, obj2);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test096");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100L, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class java.lang.Integer (java.lang.Long and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test097");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) ' ', obj3);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0f, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1), (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test100");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class humaneval.buggy.COMPARE_ONE cannot be cast to class java.lang.Integer (humaneval.buggy.COMPARE_ONE is in unnamed module of loader 'app'; java.lang.Integer is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) ' ', (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test102");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, obj6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test103");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test104");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100, (java.lang.Object) cOMPARE_ONE2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test105");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 10L, (java.lang.Object) true);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test106");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test107");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 10, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test108");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, obj7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test109");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, obj6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one(obj6, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test110");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) cOMPARE_ONE2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test111");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1), (java.lang.Object) cOMPARE_ONE1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) 1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test113");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) 'a');
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one(obj7, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test114");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one(obj5, (java.lang.Object) false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test115");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass3 = cOMPARE_ONE0.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE4 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE6 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE6);
        java.lang.Class<?> wildcardClass8 = cOMPARE_ONE6.getClass();
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE4, (java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = cOMPARE_ONE4.getClass();
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) cOMPARE_ONE4);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test117");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE4 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE4.getClass();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, (java.lang.Object) cOMPARE_ONE2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test118");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) cOMPARE_ONE1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test119");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Integer.doubleValue()\" because \"b\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test120");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test121");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass2 = cOMPARE_ONE1.getClass();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 10L, (java.lang.Object) cOMPARE_ONE1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test122");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test123");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) '#');
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) '#');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test124");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) -1, (java.lang.Object) 10L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) "hi!", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test126");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 'a');
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one(obj4, (java.lang.Object) false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test128");
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 10.0d, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test129");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Integer.doubleValue()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test130");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test131");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass1 = cOMPARE_ONE0.getClass();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test132");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test133");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) 'a');
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0L, obj8);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test134");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) "hi!", (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test135");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1L), (java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Integer (java.lang.Byte and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1), (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test138");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) (short) 10);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test139");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, obj6);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE8 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) cOMPARE_ONE8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.Integer (java.lang.Class and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class java.lang.Integer (java.lang.Character and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test141");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0.0d, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Integer.doubleValue()\" because \"b\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test142");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test143");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) cOMPARE_ONE9);
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 0L, obj10);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test144");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE2.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test145");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE2.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) -1, obj6);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test146");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class humaneval.buggy.COMPARE_ONE cannot be cast to class java.lang.Integer (humaneval.buggy.COMPARE_ONE is in unnamed module of loader 'app'; java.lang.Integer is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test147");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass2 = cOMPARE_ONE1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 10.0d, (java.lang.Object) cOMPARE_ONE1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class humaneval.buggy.COMPARE_ONE cannot be cast to class java.lang.Integer (humaneval.buggy.COMPARE_ONE is in unnamed module of loader 'app'; java.lang.Integer is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test148");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE1.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 10, (java.lang.Object) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one(obj5, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test149");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass1 = cOMPARE_ONE0.getClass();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, (java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test150");
        java.lang.Object obj0 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) cOMPARE_ONE1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test151");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass1 = cOMPARE_ONE0.getClass();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, obj2);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test152");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE0.getClass();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, (java.lang.Object) 'a');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test153");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, obj6);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE8 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) cOMPARE_ONE8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test154");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1L), obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test155");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test156");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1L), obj1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test157");
        java.lang.Object obj0 = null;
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE4 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE4.getClass();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, obj8);
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, obj8);
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, obj10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test158");
        java.lang.Object obj0 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) cOMPARE_ONE1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test159");
        java.lang.Object obj1 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one(obj1, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE5 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE5, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass8 = cOMPARE_ONE5.getClass();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass8, (java.lang.Object) (byte) 1);
        java.lang.Object obj11 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one(obj11, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Class<?> wildcardClass14 = cOMPARE_ONE12.getClass();
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass8, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, obj15);
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, obj15);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test160");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE1.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) (byte) 1);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) ' ', (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test161");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test162");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) cOMPARE_ONE9);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 'a');
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) 'a');
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass18 = cOMPARE_ONE0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test163");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass3 = cOMPARE_ONE0.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) (byte) 1);
        java.lang.Object obj6 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE7 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one(obj6, (java.lang.Object) cOMPARE_ONE7);
        java.lang.Class<?> wildcardClass9 = cOMPARE_ONE7.getClass();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) cOMPARE_ONE7);
        java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE7, (java.lang.Object) '#');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test164");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, obj3);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test165");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) (-1.0f));
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test166");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass2 = cOMPARE_ONE1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test167");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class java.lang.Integer (java.lang.Class and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test168");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test169");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) 10, (java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test170");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test171");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1), (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test173");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0f, (java.lang.Object) true);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test174");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE4 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE4.getClass();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, obj8);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE10 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, (java.lang.Object) cOMPARE_ONE10);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE13 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE13, (java.lang.Object) 'a');
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, (java.lang.Object) 'a');
        java.lang.Object obj18 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 'a');
        java.lang.Object obj20 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (short) 10);
        java.lang.Object obj21 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) (short) 10);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test175");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj3);
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test176");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1L), obj2);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) -1, obj2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) "", (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test178");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) cOMPARE_ONE9);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 'a');
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) 'a');
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = obj17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test179");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = cOMPARE_ONE1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1, (java.lang.Object) cOMPARE_ONE1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test180");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) cOMPARE_ONE9);
        java.lang.Class<?> wildcardClass11 = cOMPARE_ONE9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) "", (java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test181");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) cOMPARE_ONE9);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 'a');
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) 'a');
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 'a');
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = obj19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test182");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass3 = cOMPARE_ONE0.getClass();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1L), obj6);
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) -1, obj6);
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test183");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1L), obj2);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0f, (java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test184");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass3 = cOMPARE_ONE0.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) (byte) 1);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one(obj5, (java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test185");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1.0f, (java.lang.Object) (short) 0);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test186");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) cOMPARE_ONE9);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 'a');
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) 'a');
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 'a');
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass20 = cOMPARE_ONE0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test187");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE4 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE4.getClass();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, (java.lang.Object) cOMPARE_ONE2);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE10 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Class<?> wildcardClass14 = cOMPARE_ONE12.getClass();
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE10, (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass14, obj16);
        java.lang.Class<?> wildcardClass18 = obj16.getClass();
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) wildcardClass18);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE20 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE22 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj23 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE22);
        java.lang.Class<?> wildcardClass24 = cOMPARE_ONE22.getClass();
        java.lang.Object obj25 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE20, (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = humaneval.buggy.COMPARE_ONE.compare_one(obj19, (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = humaneval.buggy.COMPARE_ONE.compare_one(obj8, obj19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) -1, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class java.lang.Double (java.lang.Integer and java.lang.Double are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test190");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) cOMPARE_ONE2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test191");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE4 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE4.getClass();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, obj8);
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) wildcardClass10);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE13 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE15 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE15);
        java.lang.Class<?> wildcardClass17 = cOMPARE_ONE15.getClass();
        java.lang.Object obj18 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE13, (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '#', (java.lang.Object) wildcardClass17);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE20 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass21 = cOMPARE_ONE20.getClass();
        java.lang.Object obj22 = humaneval.buggy.COMPARE_ONE.compare_one(obj19, (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass10, obj22);
        java.lang.Object obj24 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) 1, obj23);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test192");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) 1, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test193");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) (short) 0);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE8 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE11 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE11);
        java.lang.Class<?> wildcardClass13 = cOMPARE_ONE11.getClass();
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE9, (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass13, obj15);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE17 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj18 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass13, (java.lang.Object) cOMPARE_ONE17);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE20 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj21 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE20);
        java.lang.Object obj23 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE20, (java.lang.Object) 'a');
        java.lang.Object obj24 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass13, (java.lang.Object) 'a');
        java.lang.Object obj25 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE8, (java.lang.Object) 'a');
        java.lang.Object obj26 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, obj25);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test194");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE4 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE4.getClass();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, (java.lang.Object) cOMPARE_ONE2);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE11 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE11);
        java.lang.Class<?> wildcardClass13 = cOMPARE_ONE11.getClass();
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE9, (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass13, obj15);
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, obj16);
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one(obj16, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test195");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1L), obj2);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) -1, obj2);
        java.lang.Class<?> wildcardClass5 = obj2.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test196");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one(obj5, (java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) 1, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class java.lang.Integer (java.lang.Byte and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test198");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE5 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Class<?> wildcardClass7 = cOMPARE_ONE5.getClass();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass2, (java.lang.Object) cOMPARE_ONE3);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE10 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Class<?> wildcardClass14 = cOMPARE_ONE12.getClass();
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE10, (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass14, obj16);
        java.lang.Object obj18 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass2, obj17);
        java.lang.Object obj20 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass2, (java.lang.Object) 'a');
        java.lang.Object obj21 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', obj20);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test199");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass8 = cOMPARE_ONE0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test200");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj3);
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        java.lang.Object obj7 = null;
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE8 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE10 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE10);
        java.lang.Class<?> wildcardClass12 = cOMPARE_ONE10.getClass();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE8, (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = cOMPARE_ONE8.getClass();
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one(obj7, (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one(obj3, obj15);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test201");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE4 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE4.getClass();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, (java.lang.Object) cOMPARE_ONE2);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE11 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE11);
        java.lang.Class<?> wildcardClass13 = cOMPARE_ONE11.getClass();
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE9, (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass13, obj15);
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, obj16);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Object obj20 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1L), obj19);
        java.lang.Object obj21 = humaneval.buggy.COMPARE_ONE.compare_one(obj17, obj20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test202");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) true);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE1.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE7 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE7);
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE7, (java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass11 = cOMPARE_ONE7.getClass();
        java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) cOMPARE_ONE7);
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE7, (java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test203");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '#', (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test204");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100L, (java.lang.Object) 100L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test205");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) 'a');
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE9);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE9, obj11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one(obj11, obj14);
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, obj14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = obj16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test206");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE1.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE6 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE6, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass9 = cOMPARE_ONE6.getClass();
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass9, (java.lang.Object) (byte) 1);
        java.lang.Object obj12 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE13 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one(obj12, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Class<?> wildcardClass15 = cOMPARE_ONE13.getClass();
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass9, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj16);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one(obj16, obj18);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test207");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100L, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test208");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (short) 100);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test209");
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test210");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE5 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE7 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE7);
        java.lang.Class<?> wildcardClass9 = cOMPARE_ONE7.getClass();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE5, (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Class<?> wildcardClass12 = cOMPARE_ONE5.getClass();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = obj13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test211");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj3);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one(obj3, obj6);
        java.lang.Class<?> wildcardClass8 = obj6.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test212");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, obj6);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE8 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) cOMPARE_ONE8);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE11 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE11);
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE11, (java.lang.Object) 'a');
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) 'a');
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE17 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE19 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj20 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE19);
        java.lang.Class<?> wildcardClass21 = cOMPARE_ONE19.getClass();
        java.lang.Object obj22 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE17, (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass21, obj23);
        java.lang.Class<?> wildcardClass25 = obj23.getClass();
        java.lang.Object obj26 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) wildcardClass25);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE28 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE30 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj31 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE30);
        java.lang.Class<?> wildcardClass32 = cOMPARE_ONE30.getClass();
        java.lang.Object obj33 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE28, (java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '#', (java.lang.Object) wildcardClass32);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE35 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass36 = cOMPARE_ONE35.getClass();
        java.lang.Object obj37 = humaneval.buggy.COMPARE_ONE.compare_one(obj34, (java.lang.Object) wildcardClass36);
        java.lang.Object obj38 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass25, obj37);
        java.lang.Object obj40 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass25, (java.lang.Object) (short) -1);
        java.lang.Object obj41 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', obj40);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test213");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one(obj2, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test214");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, obj7);
        java.lang.Class<?> wildcardClass10 = obj7.getClass();
        java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one(obj7, (java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test215");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj3);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one(obj3, obj6);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE9);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE9, obj11);
        java.lang.Class<?> wildcardClass14 = obj11.getClass();
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one(obj3, obj11);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test216");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) cOMPARE_ONE1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test217");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) cOMPARE_ONE9);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) cOMPARE_ONE12);
        java.lang.Class<?> wildcardClass14 = cOMPARE_ONE12.getClass();
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) 100, (java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test218");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        java.lang.Class<?> wildcardClass9 = obj7.getClass();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) wildcardClass9);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE14 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE14);
        java.lang.Class<?> wildcardClass16 = cOMPARE_ONE14.getClass();
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass16, obj18);
        java.lang.Class<?> wildcardClass20 = obj18.getClass();
        java.lang.Object obj21 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = humaneval.buggy.COMPARE_ONE.compare_one(obj10, (java.lang.Object) wildcardClass20);
        java.lang.Object obj24 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass20, (java.lang.Object) 'a');
        java.lang.Object obj26 = humaneval.buggy.COMPARE_ONE.compare_one(obj24, (java.lang.Object) 100L);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test219");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '#', (java.lang.Object) wildcardClass5);
        java.lang.Object obj8 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one(obj8, (java.lang.Object) cOMPARE_ONE9);
        java.lang.Class<?> wildcardClass11 = obj8.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass15 = cOMPARE_ONE12.getClass();
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass15, (java.lang.Object) (byte) 1);
        java.lang.Object obj18 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE19 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj20 = humaneval.buggy.COMPARE_ONE.compare_one(obj18, (java.lang.Object) cOMPARE_ONE19);
        java.lang.Class<?> wildcardClass21 = cOMPARE_ONE19.getClass();
        java.lang.Object obj22 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass15, (java.lang.Object) cOMPARE_ONE19);
        java.lang.Object obj23 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass11, obj22);
        java.lang.Object obj24 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = humaneval.buggy.COMPARE_ONE.compare_one(obj24, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Integer.doubleValue()\" because \"a\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test220");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) cOMPARE_ONE9);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 'a');
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) 'a');
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 'a');
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE19 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE21 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj22 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE21);
        java.lang.Class<?> wildcardClass23 = cOMPARE_ONE21.getClass();
        java.lang.Object obj24 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE19, (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Object obj26 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass23, obj25);
        java.lang.Class<?> wildcardClass27 = obj25.getClass();
        java.lang.Object obj28 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) wildcardClass27);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE30 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE32 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj33 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE32);
        java.lang.Class<?> wildcardClass34 = cOMPARE_ONE32.getClass();
        java.lang.Object obj35 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE30, (java.lang.Object) wildcardClass34);
        java.lang.Object obj36 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '#', (java.lang.Object) wildcardClass34);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE37 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass38 = cOMPARE_ONE37.getClass();
        java.lang.Object obj39 = humaneval.buggy.COMPARE_ONE.compare_one(obj36, (java.lang.Object) wildcardClass38);
        java.lang.Object obj40 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass27, obj39);
        java.lang.Object obj42 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass27, (java.lang.Object) (short) -1);
        java.lang.Object obj43 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, obj42);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test221");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, obj7);
        java.lang.Class<?> wildcardClass10 = obj7.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE11 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE11, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass14 = cOMPARE_ONE11.getClass();
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass14, (java.lang.Object) (byte) 1);
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one(obj7, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test222");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) '#');
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE4 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) cOMPARE_ONE4);
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one(obj2, (java.lang.Object) cOMPARE_ONE4);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test223");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, obj6);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE8 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) cOMPARE_ONE8);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE11 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE11);
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE11, (java.lang.Object) 'a');
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) 'a');
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE16 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Class<?> wildcardClass17 = cOMPARE_ONE16.getClass();
        java.lang.Object obj18 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) wildcardClass17);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE20 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj22 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE20, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass23 = cOMPARE_ONE20.getClass();
        java.lang.Object obj24 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = humaneval.buggy.COMPARE_ONE.compare_one(obj18, (java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test224");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE4 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE4.getClass();
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, (java.lang.Object) cOMPARE_ONE2);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE11 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE11);
        java.lang.Class<?> wildcardClass13 = cOMPARE_ONE11.getClass();
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE9, (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass13, obj15);
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, obj16);
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, (java.lang.Object) 'a');
        java.lang.Object obj21 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, (java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = humaneval.buggy.COMPARE_ONE.compare_one(obj21, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test225");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass3 = cOMPARE_ONE0.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) (byte) 1);
        java.lang.Object obj6 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE7 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one(obj6, (java.lang.Object) cOMPARE_ONE7);
        java.lang.Class<?> wildcardClass9 = cOMPARE_ONE7.getClass();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) cOMPARE_ONE7);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE11 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE13 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Class<?> wildcardClass15 = cOMPARE_ONE13.getClass();
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE11, (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = cOMPARE_ONE11.getClass();
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass17, (java.lang.Object) 1.0f);
        java.lang.Object obj20 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) 1.0f);
        java.lang.Object obj21 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE22 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj23 = humaneval.buggy.COMPARE_ONE.compare_one(obj21, (java.lang.Object) cOMPARE_ONE22);
        java.lang.Object obj24 = humaneval.buggy.COMPARE_ONE.compare_one(obj20, obj21);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test226");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE5 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Class<?> wildcardClass7 = cOMPARE_ONE5.getClass();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass2, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass10 = cOMPARE_ONE3.getClass();
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (byte) 0, (java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test227");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE5 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE7 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE7);
        java.lang.Class<?> wildcardClass9 = cOMPARE_ONE7.getClass();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE5, (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Class<?> wildcardClass12 = cOMPARE_ONE5.getClass();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = cOMPARE_ONE1.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE15 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE17 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj18 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE17);
        java.lang.Class<?> wildcardClass19 = cOMPARE_ONE17.getClass();
        java.lang.Object obj20 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE15, (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass19, (java.lang.Object) (short) 0);
        java.lang.Object obj23 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass14, (java.lang.Object) (short) 0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test228");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) (-1.0f));
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE8 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE10 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE10);
        java.lang.Class<?> wildcardClass12 = cOMPARE_ONE10.getClass();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE8, (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = cOMPARE_ONE8.getClass();
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass14, (java.lang.Object) 1.0f);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE17 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE17, (java.lang.Object) '#');
        java.lang.Object obj20 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass14, obj19);
        java.lang.Object obj21 = humaneval.buggy.COMPARE_ONE.compare_one(obj7, (java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test229");
        java.lang.Object obj0 = null;
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) cOMPARE_ONE2);
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) true);
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, obj5);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test230");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) (-1L));
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 'a', obj8);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test231");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '#', (java.lang.Object) wildcardClass5);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE8 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE10 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE10);
        java.lang.Class<?> wildcardClass12 = cOMPARE_ONE10.getClass();
        java.lang.Object obj13 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE8, (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = cOMPARE_ONE8.getClass();
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass14, (java.lang.Object) 1.0f);
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj16);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test232");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj7);
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, obj7);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE11 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE13 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Class<?> wildcardClass15 = cOMPARE_ONE13.getClass();
        java.lang.Object obj16 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE11, (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass15, obj17);
        java.lang.Class<?> wildcardClass19 = obj17.getClass();
        java.lang.Object obj20 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) wildcardClass19);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE21 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE23 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj24 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE23);
        java.lang.Class<?> wildcardClass25 = cOMPARE_ONE23.getClass();
        java.lang.Object obj26 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE21, (java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = humaneval.buggy.COMPARE_ONE.compare_one(obj20, (java.lang.Object) wildcardClass25);
        java.lang.Object obj28 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, obj27);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test233");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) '#', (java.lang.Object) wildcardClass5);
        java.lang.Object obj8 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one(obj8, (java.lang.Object) cOMPARE_ONE9);
        java.lang.Class<?> wildcardClass11 = obj8.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass15 = cOMPARE_ONE12.getClass();
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass15, (java.lang.Object) (byte) 1);
        java.lang.Object obj18 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE19 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj20 = humaneval.buggy.COMPARE_ONE.compare_one(obj18, (java.lang.Object) cOMPARE_ONE19);
        java.lang.Class<?> wildcardClass21 = cOMPARE_ONE19.getClass();
        java.lang.Object obj22 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass15, (java.lang.Object) cOMPARE_ONE19);
        java.lang.Object obj23 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass11, obj22);
        java.lang.Object obj24 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object obj27 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (-1L), obj26);
        java.lang.Object obj28 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, obj26);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test234");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE6 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE8 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE8);
        java.lang.Class<?> wildcardClass10 = cOMPARE_ONE8.getClass();
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE6, (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) cOMPARE_ONE6);
        java.lang.Class<?> wildcardClass13 = cOMPARE_ONE6.getClass();
        java.lang.Object obj14 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 10, (java.lang.Object) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass13, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test235");
        java.lang.Object obj0 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one(obj0, obj3);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test236");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE1 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE3 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE3.getClass();
        java.lang.Object obj6 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) wildcardClass5);
        java.lang.Class<?> wildcardClass7 = cOMPARE_ONE1.getClass();
        java.lang.Object obj9 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass7, (java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class java.lang.Integer (java.lang.Float and java.lang.Integer are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test237");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE2 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = cOMPARE_ONE0.getClass();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, (java.lang.Object) 1.0f);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE9 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj11 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE9, (java.lang.Object) '#');
        java.lang.Object obj12 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, obj11);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE14 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE14);
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE14, (java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass18 = cOMPARE_ONE14.getClass();
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, (java.lang.Object) cOMPARE_ONE14);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test238");
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE0 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass3 = cOMPARE_ONE0.getClass();
        java.lang.Object obj5 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) (byte) 1);
        java.lang.Object obj6 = new java.lang.Object();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE7 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj8 = humaneval.buggy.COMPARE_ONE.compare_one(obj6, (java.lang.Object) cOMPARE_ONE7);
        java.lang.Class<?> wildcardClass9 = cOMPARE_ONE7.getClass();
        java.lang.Object obj10 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) cOMPARE_ONE7);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE12 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE14 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj15 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE14);
        java.lang.Class<?> wildcardClass16 = cOMPARE_ONE14.getClass();
        java.lang.Object obj17 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Object obj19 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass16, obj18);
        java.lang.Class<?> wildcardClass20 = obj18.getClass();
        java.lang.Object obj21 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) wildcardClass20);
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE23 = new humaneval.buggy.COMPARE_ONE();
        humaneval.buggy.COMPARE_ONE cOMPARE_ONE25 = new humaneval.buggy.COMPARE_ONE();
        java.lang.Object obj26 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE25);
        java.lang.Class<?> wildcardClass27 = cOMPARE_ONE25.getClass();
        java.lang.Object obj28 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE23, (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass27, obj29);
        java.lang.Class<?> wildcardClass31 = obj29.getClass();
        java.lang.Object obj32 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = humaneval.buggy.COMPARE_ONE.compare_one(obj21, (java.lang.Object) wildcardClass31);
        java.lang.Object obj35 = humaneval.buggy.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass31, (java.lang.Object) 'a');
        java.lang.Object obj36 = humaneval.buggy.COMPARE_ONE.compare_one(obj10, (java.lang.Object) wildcardClass31);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
    }
}

