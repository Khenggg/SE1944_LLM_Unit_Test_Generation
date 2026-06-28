package humaneval.buggy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ANY_INT_RandoopTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test501");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 10, (double) (short) -1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test502");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(100.0d, (double) (-1.0f), 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test503");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0L, (double) (short) 100, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test504");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 0, (double) 10.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test505");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(100.0d, (double) 10L, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test506");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(10.0d, (-1.0d), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test507");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1.0f), (double) 0.0f, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test508");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0.0f, (double) 1.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test509");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10.0f, (double) (short) 10, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test510");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(100.0d, (double) (-1), (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test511");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((-1.0d), (double) 100L, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test512");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) (short) 1, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test513");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 10, (double) 1.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test514");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) 1.0f, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test515");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '#', (double) (byte) 0, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test516");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 0, (double) '4', (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test517");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '#', 0.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test518");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1, 0.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test519");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0L, (double) 'a', (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test520");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10.0f, (double) '#', (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test521");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100, (double) (byte) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test522");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1), (double) 100, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test523");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) (byte) 1, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test524");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1L), (double) (byte) 0, (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test525");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100, (double) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test526");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1), 0.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test527");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '#', (double) (-1), (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test528");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 100, (double) (byte) 100, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test529");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(1.0d, (double) 1, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test530");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(10.0d, (-1.0d), (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test531");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((-1.0d), (double) (byte) 10, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test532");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10.0f, (double) 100.0f, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test533");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 10, (double) (short) 1, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test534");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) ' ', (-1.0d), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test535");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) (-1L), (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test536");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1.0f, (double) 0.0f, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test537");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1, (double) 10L, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test538");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100, (double) (short) -1, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test539");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 0, (double) (short) 100, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test540");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(1.0d, 100.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test541");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1), (double) 100, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test542");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) -1, 0.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test543");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100, (double) (-1.0f), 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test544");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 'a', (double) 100L, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test545");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1), (double) 0L, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test546");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(100.0d, (double) 0, (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test547");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 0, 0.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test548");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0, 100.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test549");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10L, 10.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test550");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 1, 1.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test551");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) ' ', 1.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test552");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) -1, (double) (short) -1, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test553");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0.0f, (double) 0.0f, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test554");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10L, 10.0d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test555");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 10, (double) (byte) 100, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test556");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1L), 10.0d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test557");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(10.0d, (double) 1L, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test558");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10, (double) 0.0f, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test559");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1.0f), (double) (-1.0f), (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test560");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10L, (double) (short) 100, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test561");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10L, (double) ' ', (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test562");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100L, (double) 100, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test563");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1.0f), (-1.0d), (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test564");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1L), (double) (byte) 1, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test565");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100.0f, (double) (byte) -1, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test566");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) (short) 10, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test567");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) ' ', (double) (-1.0f), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test568");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10, (-1.0d), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test569");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(10.0d, (double) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test570");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1, (double) 0.0f, (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test571");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1), (double) (short) 1, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test572");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10, (double) (byte) 10, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test573");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) 100L, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test574");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '#', (double) (short) 10, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test575");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 0, (double) 'a', (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test576");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) (short) 0, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test577");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1, (double) (short) 0, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test578");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 100, (double) (-1.0f), (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test579");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100L, (double) (byte) 100, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test580");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10.0f, (double) (short) 0, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test581");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) 1L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test582");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10, 10.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test583");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100, (double) (byte) 0, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test584");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(100.0d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test585");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 1, 1.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test586");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 1, (double) (byte) -1, (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test587");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) ' ', 0.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test588");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '#', (double) 100, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test589");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0L, (double) 'a', (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test590");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10.0f, (double) (short) 100, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test591");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1L, (double) ' ', (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test592");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100L, (-1.0d), 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test593");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) ' ', (double) (byte) 1, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test594");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0, (double) 0, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test595");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 10, (double) (byte) 100, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test596");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1.0f), (double) 1L, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test597");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1, (double) (byte) -1, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test598");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 10, (double) 10.0f, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test599");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) -1, (double) 0L, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test600");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 100, (double) (short) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test601");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0, (double) 0L, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test602");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100.0f, (double) 1L, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test603");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 10, (double) (byte) 1, (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test604");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100, (double) (short) 1, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test605");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(10.0d, 0.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test606");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) 'a', 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test607");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1, (double) (byte) 0, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test608");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '4', 100.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test609");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 10, (double) (short) -1, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test610");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100L, (double) (byte) 100, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test611");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 10, (double) (byte) 100, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test612");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1L, (double) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test613");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100L, 100.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test614");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '4', (double) (byte) 1, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test615");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 0, 0.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test616");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 'a', 10.0d, (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test617");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(10.0d, 10.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test618");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) 1.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test619");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '#', (double) (short) 100, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test620");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1L), (double) 10L, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test621");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1L, (double) (short) 1, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test622");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(1.0d, (double) 0, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test623");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(1.0d, (double) (-1.0f), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test624");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1L, (double) 1, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test625");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1, (double) 0.0f, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test626");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '#', (double) 0L, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test627");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1.0f), (double) (byte) 0, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test628");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10.0f, (double) 100, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test629");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(10.0d, (double) 10.0f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test630");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) -1, (double) 0, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test631");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1.0f), (double) 1.0f, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test632");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10L, (double) 1.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test633");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 1, (double) 1, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test634");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 1, (double) 100, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test635");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10L, (double) 1L, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test636");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 0, (double) 'a', (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test637");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, 1.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test638");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) '4', (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test639");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 10, (double) (-1L), (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test640");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100.0f, 100.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test641");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '4', 0.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test642");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '4', (double) 'a', (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test643");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1.0f, (double) (short) 0, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test644");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10, (double) 100L, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test645");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1.0f), (double) 0L, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test646");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 1, (double) (-1), (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test647");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100, (double) (short) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test648");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '4', (double) 10, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test649");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(10.0d, (double) ' ', (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test650");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1), (double) 1, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test651");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 100, (double) (byte) -1, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test652");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100L, 0.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test653");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 100, (double) '4', (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test654");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(1.0d, (double) 1.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test655");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0L, (double) '4', (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test656");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 10, (double) 0, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test657");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((-1.0d), (double) 100L, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test658");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '4', (double) (-1.0f), (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test659");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1L), (double) (byte) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test660");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1L), (double) (byte) 0, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test661");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(100.0d, (double) 100.0f, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test662");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1.0f), (double) 100L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test663");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 10, (double) 10L, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test664");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) -1, (-1.0d), (double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test665");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1.0f, (double) (byte) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test666");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10L, (double) 100, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test667");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(100.0d, 0.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test668");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '4', (double) 100.0f, (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test669");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1, (double) 100, (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test670");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100, (double) (short) -1, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test671");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '4', (double) (-1), (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test672");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0L, (double) (short) 100, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test673");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 10, (double) 10.0f, (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test674");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100L, (double) (-1), (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test675");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1.0f), (double) 1, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test676");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 10, (double) 10.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test677");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0, (double) (short) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test678");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (-1.0d), (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test679");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '4', 0.0d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test680");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 'a', (double) 10.0f, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test681");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1), (double) 0L, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test682");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1, (double) 'a', (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test683");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100.0f, (double) (-1), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test684");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1.0f, (double) (short) 1, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test685");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) -1, (double) 'a', (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test686");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test687");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) '#', (double) ' ', (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test688");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10L, (double) (short) 100, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test689");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(10.0d, (double) (-1L), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test690");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1L, (double) '#', (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test691");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) -1, (double) (byte) 1, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test692");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1.0f, (double) 0L, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test693");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(1.0d, (double) (short) 100, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test694");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 100, (double) (-1L), (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test695");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100, (double) 0, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test696");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) 'a', (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test697");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 10, (double) (-1.0f), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test698");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) -1, 0.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test699");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1L, 10.0d, (double) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test700");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1), (double) 1L, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test701");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0.0f, (double) 0.0f, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test702");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 10, (double) (short) 0, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test703");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10.0f, (double) (short) -1, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test704");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10, (double) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test705");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 100, (double) 100L, (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test706");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 1, (double) 0.0f, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test707");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 10L, 0.0d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test708");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 100, (double) 100L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test709");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1.0f, (double) 0L, (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test710");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) ' ', (double) 100, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test711");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 100, (double) (-1L), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test712");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 1, (-1.0d), (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test713");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) 10.0f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test714");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(10.0d, (double) (byte) 0, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test715");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 10, (double) (byte) -1, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test716");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0, (double) (byte) 0, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test717");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 100, 10.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test718");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(1.0d, 100.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test719");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(1.0d, (double) 'a', (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test720");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 100, (-1.0d), 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test721");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) -1, 100.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test722");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 1, 100.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test723");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(10.0d, (double) (-1L), (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test724");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 100, (double) 100L, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test725");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(100.0d, (double) 1L, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test726");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, (double) 10.0f, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test727");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 1L, (double) (short) 100, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test728");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) 0, (double) 100.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test729");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (short) -1, (double) (short) -1, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test730");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (-1L), (double) (-1.0f), (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test731");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0.0f, (double) 0.0f, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test732");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 1, (double) (short) -1, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test733");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) -1, (double) (-1.0f), 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test734");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0L, (double) (byte) 10, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test735");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) 0, (double) 100L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test736");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int(0.0d, 0.0d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test737");
        boolean boolean3 = humaneval.buggy.ANY_INT.any_int((double) (byte) 0, (double) (-1.0f), 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

