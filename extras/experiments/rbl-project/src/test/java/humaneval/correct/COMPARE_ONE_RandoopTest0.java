package humaneval.correct;

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
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0.0d, (java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test002");
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (-1), obj1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test003");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0.0f, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test004");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0, (java.lang.Object) ' ');
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test005");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0.0d, (java.lang.Object) 10L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test006");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (-1L), (java.lang.Object) true);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test007");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1.0f) + "'", obj2, (-1.0f));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test008");
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) "hi!", obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test009");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Class<?> wildcardClass2 = cOMPARE_ONE1.getClass();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) cOMPARE_ONE1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test010");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) 100L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test011");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) true);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1.0d + "'", obj2, 1.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test012");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, (java.lang.Object) 1.0d);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1.0d + "'", obj2, 1.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test013");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) 1, (java.lang.Object) 1L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test015");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Class<?> wildcardClass2 = cOMPARE_ONE1.getClass();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) cOMPARE_ONE1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test016");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, obj1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test017");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100, (java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100 + "'", obj2, 100);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test018");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 10.0d, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0d + "'", obj2, 10.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test019");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) 0);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test020");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, (java.lang.Object) 10.0f);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 10.0f, (java.lang.Object) '4');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test021");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test022");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test023");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test024");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100, (java.lang.Object) 1.0d);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100 + "'", obj2, 100);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test025");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0f, (java.lang.Object) (short) 10);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test026");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100L, (java.lang.Object) '#');
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test027");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100, (java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100 + "'", obj2, 100);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test028");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) -1, (java.lang.Object) 1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1 + "'", obj2, 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) "", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test030");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) ' ');
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test031");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 10.0d, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0d + "'", obj2, 10.0d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test032");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) -1, (java.lang.Object) (-1));
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (byte) -1 + "'", obj2, (byte) -1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test033");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 100.0f);
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test034");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test035");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) (byte) 100);
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test036");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) 100);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test037");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test038");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) 0, (java.lang.Object) ' ');
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test039");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) 0, (java.lang.Object) 1L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test040");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test041");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) "hi!", obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0d + "'", obj3, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test042");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) 'a');
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test043");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) 100);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Class<?> wildcardClass5 = cOMPARE_ONE1.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test044");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) 0, (java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test045");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one(obj2, (java.lang.Object) 10.0f);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1.0d + "'", obj2, 1.0d);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test046");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 'a', (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) "", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test048");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one(obj0, obj5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test049");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) 100.0d);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, obj6);
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test050");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) wildcardClass4);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test051");
        java.lang.Object obj0 = new java.lang.Object();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass5 = obj0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test052");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) ' ', (java.lang.Object) (short) 100);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test053");
        java.lang.Object obj0 = new java.lang.Object();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) 100.0f);
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test054");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE4, (java.lang.Object) (byte) 100);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) cOMPARE_ONE4);
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) (short) 100);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test055");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one(obj1, obj6);
        java.lang.Class<?> wildcardClass9 = obj1.getClass();
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (-1L), obj1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test056");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) 10, (java.lang.Object) 10.0d);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0d + "'", obj2, 10.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test057");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 100.0f);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0f + "'", obj4, 100.0f);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test058");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE3 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) cOMPARE_ONE3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test059");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, (java.lang.Object) (-1));
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (short) 1 + "'", obj2, (short) 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test060");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) 100);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) -1);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) -1, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test061");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE3 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) cOMPARE_ONE3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test062");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) 10, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test063");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) 1.0d);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1.0d + "'", obj2, 1.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test064");
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, obj1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test065");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 10.0d, (java.lang.Object) 100);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100 + "'", obj2, 100);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test066");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test067");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) 0.0d);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test068");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 10, obj3);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0d + "'", obj3, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test069");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test070");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, obj4);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one(obj4, (java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test071");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) cOMPARE_ONE2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test072");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) 100.0d);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0.0d, obj6);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test073");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE3 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 1, (java.lang.Object) '4');
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) "", (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test075");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) 100);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test076");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, (java.lang.Object) 10.0d);
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) 0, obj8);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test077");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) 10);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10 + "'", obj2, 10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test078");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test079");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) true, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test080");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE3 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) cOMPARE_ONE3);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE9 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE9, (java.lang.Object) 100.0f);
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, obj11);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test081");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) 10L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test082");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, (java.lang.Object) 100.0d);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass4, obj7);
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one(obj0, obj8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test083");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) 100);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass5, (java.lang.Object) 10.0d);
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10.0d + "'", obj9, 10.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test084");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, obj5);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test085");
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, obj1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test086");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Class<?> wildcardClass3 = cOMPARE_ONE1.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1L);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1.0d + "'", obj2, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test087");
        java.lang.Object obj0 = new java.lang.Object();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) 100.0f);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0f + "'", obj6, 100.0f);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test088");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) '4');
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test089");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test090");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) 100.0d);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, obj6);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE9 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE9, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE13 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE9, (java.lang.Object) 1.0d);
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) cOMPARE_ONE9);
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one(obj6, obj16);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0d + "'", obj14, 1.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0d + "'", obj15, 1.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0d + "'", obj17, 100.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test091");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass2, (java.lang.Object) 10.0f);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0.0f, (java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test092");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one(obj6, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test093");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE3 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass9 = cOMPARE_ONE3.getClass();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test094");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 10.0f, (java.lang.Object) 1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1 + "'", obj2, 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test095");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one(obj9, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE13 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one(obj9, obj14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass17, (java.lang.Object) 1.0f);
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = obj20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0d + "'", obj14, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test096");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Class<?> wildcardClass9 = cOMPARE_ONE1.getClass();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 0.0d);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test097");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) 10L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test098");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one(obj9, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE13 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one(obj9, obj14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass17, (java.lang.Object) 1.0f);
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = humaneval.correct.COMPARE_ONE.compare_one(obj19, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0d + "'", obj14, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test099");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = cOMPARE_ONE0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) 100, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test101");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass3 = cOMPARE_ONE0.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test102");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one(obj8, (java.lang.Object) (short) 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test103");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE6 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE6);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) 1.0d);
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass10, (java.lang.Object) true);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one(obj13, (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass16 = obj13.getClass();
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one(obj12, (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 10, obj12);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 10 + "'", obj18, 10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test104");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Class<?> wildcardClass2 = cOMPARE_ONE1.getClass();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (-1.0f), (java.lang.Object) cOMPARE_ONE1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test105");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one(obj0, obj5);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE9 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE9);
        java.lang.Class<?> wildcardClass11 = cOMPARE_ONE9.getClass();
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0d + "'", obj10, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test106");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one(obj9, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE13 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one(obj9, obj14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass17, (java.lang.Object) 1.0f);
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj19);
        java.lang.Class<?> wildcardClass21 = cOMPARE_ONE1.getClass();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE24 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj26 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE24, (java.lang.Object) (byte) 100);
        java.lang.Object obj27 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass23, obj26);
        java.lang.Object obj28 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj27);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0d + "'", obj14, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test107");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100L, (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one(obj6, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE10 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = humaneval.correct.COMPARE_ONE.compare_one(obj6, obj11);
        java.lang.Class<?> wildcardClass14 = obj11.getClass();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one(obj5, obj11);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0d + "'", obj3, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0d + "'", obj11, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0d + "'", obj13, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0d + "'", obj15, 1.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test108");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) 100.0d);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) 100.0d);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test109");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) 100, (java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test110");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) 100);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE11 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one(obj7, obj12);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE16 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE16);
        java.lang.Class<?> wildcardClass18 = cOMPARE_ONE16.getClass();
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj7);
        java.lang.Class<?> wildcardClass21 = cOMPARE_ONE1.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0d + "'", obj12, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0d + "'", obj14, 1.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0d + "'", obj17, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test111");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (-1L), (java.lang.Object) 100L);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test112");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) 0, (java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test113");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE3 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass9 = cOMPARE_ONE3.getClass();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass9, (java.lang.Object) (short) 1);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE12 = new humaneval.correct.COMPARE_ONE();
        java.lang.Class<?> wildcardClass13 = cOMPARE_ONE12.getClass();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one(obj11, (java.lang.Object) cOMPARE_ONE12);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test114");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0f, (java.lang.Object) 0);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test115");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE6 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE6);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) 1.0d);
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass10 = cOMPARE_ONE2.getClass();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) cOMPARE_ONE2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test116");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE5, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE9 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE9);
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE5, (java.lang.Object) 1.0d);
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj13 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0d + "'", obj10, 1.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0d + "'", obj11, 1.0d);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test117");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (byte) 0, (java.lang.Object) 1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test118");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Class<?> wildcardClass9 = cOMPARE_ONE1.getClass();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE12 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE16 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE16);
        java.lang.Object obj18 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 1.0d);
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Class<?> wildcardClass20 = cOMPARE_ONE12.getClass();
        java.lang.Object obj21 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0f, (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0d + "'", obj17, 1.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test119");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass3 = cOMPARE_ONE0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test120");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, (java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) "", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test121");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass7 = cOMPARE_ONE2.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test122");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one(obj8, (java.lang.Object) 1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test123");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) true, obj7);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1.0d + "'", obj9, 1.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test124");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0, (java.lang.Object) 0.0d);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test125");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one(obj9, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE13 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one(obj9, obj14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass17, (java.lang.Object) 1.0f);
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = humaneval.correct.COMPARE_ONE.compare_one(obj20, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0d + "'", obj14, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test126");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) 100);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE11 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one(obj7, obj12);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE16 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE16);
        java.lang.Class<?> wildcardClass18 = cOMPARE_ONE16.getClass();
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = obj20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0d + "'", obj12, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0d + "'", obj14, 1.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0d + "'", obj17, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test127");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test128");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one(obj1, obj6);
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 10.0f, obj1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test129");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = cOMPARE_ONE0.getClass();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass7, obj8);
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass7, (java.lang.Object) 1);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE13 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE13, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass17, (java.lang.Object) (-1.0d));
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1, obj19);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Object obj23 = humaneval.correct.COMPARE_ONE.compare_one(obj21, (java.lang.Object) (byte) 0);
        java.lang.Object obj24 = humaneval.correct.COMPARE_ONE.compare_one(obj20, obj21);
        java.lang.Class<?> wildcardClass25 = obj21.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.Double");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1 + "'", obj20, 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test130");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one(obj0, obj5);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE10 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE10, (java.lang.Object) (byte) 100);
        java.lang.Object obj13 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE10);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE15 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass17, (java.lang.Object) (byte) 0);
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one(obj13, (java.lang.Object) wildcardClass17);
        java.lang.Object obj21 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) wildcardClass17);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0d + "'", obj13, 1.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1.0d + "'", obj20, 1.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1.0d + "'", obj21, 1.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test131");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, obj4);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test132");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) -1);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one(obj8, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE12 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one(obj8, obj13);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE17 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj18 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE17);
        java.lang.Class<?> wildcardClass19 = cOMPARE_ONE17.getClass();
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one(obj8, (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, obj8);
        java.lang.Object obj22 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '#', obj21);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0d + "'", obj13, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0d + "'", obj15, 1.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test133");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = cOMPARE_ONE0.getClass();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass7, obj8);
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass7, (java.lang.Object) 1);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE13 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE13, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass17, (java.lang.Object) (-1.0d));
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1, obj19);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Object obj23 = humaneval.correct.COMPARE_ONE.compare_one(obj21, (java.lang.Object) (byte) 0);
        java.lang.Object obj24 = humaneval.correct.COMPARE_ONE.compare_one(obj20, obj21);
        java.lang.Object obj26 = humaneval.correct.COMPARE_ONE.compare_one(obj21, (java.lang.Object) 0.0d);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.Double");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1 + "'", obj20, 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test134");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) 100);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE11 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one(obj7, obj12);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE16 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE16);
        java.lang.Class<?> wildcardClass18 = cOMPARE_ONE16.getClass();
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj7);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE22 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj24 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE22, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE26 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj27 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE26);
        java.lang.Object obj28 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE22, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE22);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Object obj32 = humaneval.correct.COMPARE_ONE.compare_one(obj30, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE34 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj35 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE34);
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = humaneval.correct.COMPARE_ONE.compare_one(obj30, obj35);
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj40 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass38, (java.lang.Object) 1.0f);
        java.lang.Object obj41 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE22, obj40);
        java.lang.Object obj42 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) cOMPARE_ONE22);
        java.lang.Class<?> wildcardClass43 = obj7.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0d + "'", obj12, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0d + "'", obj14, 1.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0d + "'", obj17, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0d + "'", obj28, 1.0d);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0d + "'", obj35, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1.0d + "'", obj37, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test135");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass3, (java.lang.Object) 100.0d);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) 'a');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test136");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE3 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass7, (java.lang.Object) (-1.0d));
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) wildcardClass7);
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) wildcardClass7);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Double");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test137");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE3 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) cOMPARE_ONE3);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE10 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE10, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE14 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE14);
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE10, (java.lang.Object) 1.0d);
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) cOMPARE_ONE10);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass18, (java.lang.Object) true);
        java.lang.Object obj21 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, obj20);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0d + "'", obj15, 1.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0d + "'", obj17, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test138");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Class<?> wildcardClass1 = cOMPARE_ONE0.getClass();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one(obj3, (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, (java.lang.Object) 100.0d);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass6, obj9);
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one(obj2, (java.lang.Object) wildcardClass6);
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass1, obj11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test139");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one(obj0, obj5);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE9 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE9);
        java.lang.Class<?> wildcardClass11 = cOMPARE_ONE9.getClass();
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE15 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE15, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass14, obj17);
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass20 = obj0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0d + "'", obj10, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test140");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one(obj1, obj6);
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 10.0f, obj1);
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test141");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 0, (java.lang.Object) 10);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10 + "'", obj2, 10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test142");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass8 = cOMPARE_ONE1.getClass();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass8, obj9);
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass8, (java.lang.Object) 1);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE14 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE14, (java.lang.Object) (byte) 100);
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE14);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass18, (java.lang.Object) (-1.0d));
        java.lang.Object obj21 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1, obj20);
        java.lang.Object obj22 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 10L, obj20);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0d + "'", obj17, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Double");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test143");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Class<?> wildcardClass4 = cOMPARE_ONE2.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100L, (java.lang.Object) wildcardClass4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one(obj6, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE10 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = humaneval.correct.COMPARE_ONE.compare_one(obj6, obj11);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100L, (java.lang.Object) wildcardClass14);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0d + "'", obj3, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0d + "'", obj11, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0d + "'", obj13, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test144");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test145");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE9 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE9, (java.lang.Object) 100.0f);
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one(obj8, (java.lang.Object) 100.0f);
        java.lang.Object obj13 = humaneval.correct.COMPARE_ONE.compare_one(obj6, (java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0d + "'", obj13, 1.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test146");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) '#');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test147");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj9);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test148");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '#', obj1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test149");
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) ' ');
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test150");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) 100);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) -1);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE11 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one(obj7, obj12);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE16 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE16);
        java.lang.Class<?> wildcardClass18 = cOMPARE_ONE16.getClass();
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, obj7);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE22 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj24 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE22, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE26 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj27 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE26);
        java.lang.Object obj28 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE22, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE22);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Object obj32 = humaneval.correct.COMPARE_ONE.compare_one(obj30, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE34 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj35 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE34);
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = humaneval.correct.COMPARE_ONE.compare_one(obj30, obj35);
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj40 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass38, (java.lang.Object) 1.0f);
        java.lang.Object obj41 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE22, obj40);
        java.lang.Object obj42 = humaneval.correct.COMPARE_ONE.compare_one(obj7, (java.lang.Object) cOMPARE_ONE22);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE44 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj46 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE44, (java.lang.Object) (byte) 100);
        java.lang.Object obj47 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE44);
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        java.lang.Object obj49 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE22, (java.lang.Object) wildcardClass48);
        java.lang.Class<?> wildcardClass50 = cOMPARE_ONE22.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0d + "'", obj12, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0d + "'", obj14, 1.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0d + "'", obj17, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0d + "'", obj28, 1.0d);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0d + "'", obj35, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1.0d + "'", obj37, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1.0d + "'", obj47, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test151");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE0 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE0, (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE10 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE10, (java.lang.Object) (byte) 100);
        java.lang.Object obj13 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE10);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass14, (java.lang.Object) (-1.0d));
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass7, (java.lang.Object) 1L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0d + "'", obj13, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "class java.lang.Double");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test152");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one(obj0, obj5);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass8, (java.lang.Object) 10.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE12 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE16 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE16);
        java.lang.Object obj18 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 1.0d);
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Object obj22 = humaneval.correct.COMPARE_ONE.compare_one(obj20, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE24 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj25 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = humaneval.correct.COMPARE_ONE.compare_one(obj20, obj25);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj30 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass28, (java.lang.Object) 1.0f);
        java.lang.Object obj31 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, obj30);
        java.lang.Object obj32 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass8, (java.lang.Object) cOMPARE_ONE12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = obj32.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0d + "'", obj17, 1.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0d + "'", obj25, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test153");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one(obj0, obj5);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass8, (java.lang.Object) 10.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE12 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE16 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE16);
        java.lang.Object obj18 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 1.0d);
        java.lang.Object obj19 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Object obj22 = humaneval.correct.COMPARE_ONE.compare_one(obj20, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE24 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj25 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = humaneval.correct.COMPARE_ONE.compare_one(obj20, obj25);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj30 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass28, (java.lang.Object) 1.0f);
        java.lang.Object obj31 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, obj30);
        java.lang.Object obj32 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass8, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Class<?> wildcardClass33 = cOMPARE_ONE12.getClass();
        humaneval.correct.COMPARE_ONE cOMPARE_ONE35 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj37 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE35, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE39 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj40 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE39);
        java.lang.Object obj41 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE35, (java.lang.Object) 1.0d);
        java.lang.Object obj42 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE35);
        java.lang.Object obj43 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE12, (java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0d + "'", obj17, 1.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0d + "'", obj25, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1.0d + "'", obj40, 1.0d);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1.0d + "'", obj41, 1.0d);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test154");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE3 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE3, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) '4', (java.lang.Object) cOMPARE_ONE3);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (short) 100, (java.lang.Object) cOMPARE_ONE3);
        java.lang.Class<?> wildcardClass9 = cOMPARE_ONE3.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj13 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass11, (java.lang.Object) 10.0f);
        java.lang.Object obj14 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass9, obj13);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test155");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) 1.0d);
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100.0d, (java.lang.Object) cOMPARE_ONE1);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass9, (java.lang.Object) true);
        java.lang.Object obj13 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass9, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "class java.lang.Double");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "class java.lang.Double");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test156");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE1 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE1, (java.lang.Object) (byte) 100);
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE1);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE6 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE6);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass8, (java.lang.Object) (byte) 0);
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one(obj4, (java.lang.Object) wildcardClass8);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE13 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE13, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE13);
        java.lang.Object obj18 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE13, (java.lang.Object) (byte) -1);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Object obj21 = humaneval.correct.COMPARE_ONE.compare_one(obj19, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE23 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj24 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = humaneval.correct.COMPARE_ONE.compare_one(obj19, obj24);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE28 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj29 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE28);
        java.lang.Class<?> wildcardClass30 = cOMPARE_ONE28.getClass();
        java.lang.Object obj31 = humaneval.correct.COMPARE_ONE.compare_one(obj19, (java.lang.Object) wildcardClass30);
        java.lang.Object obj32 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE13, obj19);
        java.lang.Object obj33 = humaneval.correct.COMPARE_ONE.compare_one(obj11, obj19);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0d + "'", obj11, 1.0d);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0d + "'", obj16, 1.0d);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0d + "'", obj24, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1.0d + "'", obj26, 1.0d);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1.0d + "'", obj29, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0d + "'", obj33, 1.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test157");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) -1);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one(obj8, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE12 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one(obj8, obj13);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE17 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj18 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE17);
        java.lang.Class<?> wildcardClass19 = cOMPARE_ONE17.getClass();
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one(obj8, (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, obj8);
        java.lang.Class<?> wildcardClass22 = obj8.getClass();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass22, obj23);
        java.lang.Object obj25 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) wildcardClass22);
        java.lang.Object obj27 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1L, (java.lang.Object) true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0d + "'", obj13, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0d + "'", obj15, 1.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test158");
        humaneval.correct.COMPARE_ONE cOMPARE_ONE2 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj4 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE2);
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, (java.lang.Object) (byte) -1);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one(obj8, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE12 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj13 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one(obj8, obj13);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE17 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj18 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE17);
        java.lang.Class<?> wildcardClass19 = cOMPARE_ONE17.getClass();
        java.lang.Object obj20 = humaneval.correct.COMPARE_ONE.compare_one(obj8, (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE2, obj8);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE23 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj25 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE23, (java.lang.Object) 100.0f);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE27 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj28 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE27);
        java.lang.Object obj29 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE23, (java.lang.Object) 1.0d);
        java.lang.Object obj30 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 0L, (java.lang.Object) cOMPARE_ONE23);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Object obj33 = humaneval.correct.COMPARE_ONE.compare_one(obj31, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE35 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj36 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE35);
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = humaneval.correct.COMPARE_ONE.compare_one(obj31, obj36);
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        java.lang.Object obj41 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass39, (java.lang.Object) 1.0f);
        java.lang.Object obj42 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE23, obj41);
        java.lang.Object obj43 = humaneval.correct.COMPARE_ONE.compare_one(obj8, (java.lang.Object) cOMPARE_ONE23);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE45 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj47 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE45, (java.lang.Object) (byte) 100);
        java.lang.Object obj48 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE45);
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.Object obj50 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE23, (java.lang.Object) wildcardClass49);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE52 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj54 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) cOMPARE_ONE52, (java.lang.Object) (byte) 100);
        java.lang.Object obj55 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE52);
        java.lang.Object obj56 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) wildcardClass49, obj55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) "hi!", obj55);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0d + "'", obj13, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0d + "'", obj15, 1.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1.0d + "'", obj18, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0d + "'", obj28, 1.0d);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1.0d + "'", obj29, 1.0d);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1.0d + "'", obj36, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1.0d + "'", obj38, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1.0d + "'", obj48, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 1.0d + "'", obj55, 1.0d);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 1.0d + "'", obj56, 1.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test159");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one(obj1, obj6);
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 10.0f, obj1);
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass12 = obj1.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test160");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Object obj3 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE5 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj6 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE5);
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = humaneval.correct.COMPARE_ONE.compare_one(obj1, obj6);
        java.lang.Object obj9 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 10.0f, obj1);
        java.lang.Object obj11 = humaneval.correct.COMPARE_ONE.compare_one(obj1, (java.lang.Object) (-1L));
        humaneval.correct.COMPARE_ONE cOMPARE_ONE14 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE14);
        java.lang.Class<?> wildcardClass16 = cOMPARE_ONE14.getClass();
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 100L, (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) (-1L), (java.lang.Object) wildcardClass16);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0d + "'", obj6, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0d + "'", obj15, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "COMPARE_ONE_RandoopTest0.test161");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) (byte) 0);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE4 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj5 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE4);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = humaneval.correct.COMPARE_ONE.compare_one(obj0, obj5);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE9 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj10 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE9);
        java.lang.Class<?> wildcardClass11 = cOMPARE_ONE9.getClass();
        java.lang.Object obj12 = humaneval.correct.COMPARE_ONE.compare_one(obj0, (java.lang.Object) wildcardClass11);
        humaneval.correct.COMPARE_ONE cOMPARE_ONE14 = new humaneval.correct.COMPARE_ONE();
        java.lang.Object obj15 = humaneval.correct.COMPARE_ONE.compare_one((java.lang.Object) 1.0d, (java.lang.Object) cOMPARE_ONE14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = humaneval.correct.COMPARE_ONE.compare_one(obj12, (java.lang.Object) wildcardClass16);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0d + "'", obj5, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 1.0d + "'", obj7, 1.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0d + "'", obj10, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1.0d + "'", obj15, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj17);
    }
}

