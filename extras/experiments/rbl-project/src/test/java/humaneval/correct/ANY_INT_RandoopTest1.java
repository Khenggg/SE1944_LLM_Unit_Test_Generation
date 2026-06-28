package humaneval.correct;

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
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (byte) 10, (double) (short) -1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test502");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(100.0d, (double) (-1.0f), 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test503");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 0L, (double) (short) 100, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test504");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (short) 0, (double) 10.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test505");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(100.0d, (double) 10L, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test506");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(10.0d, (-1.0d), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test507");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (-1.0f), (double) 0.0f, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test508");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 0.0f, (double) 1.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test509");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 10.0f, (double) (short) 10, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test510");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(100.0d, (double) (-1), (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test511");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((-1.0d), (double) 100L, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test512");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(0.0d, (double) (short) 1, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test513");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (byte) 10, (double) 1.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test514");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(0.0d, (double) 1.0f, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test515");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) '#', (double) (byte) 0, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test516");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (byte) 0, (double) '4', (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test517");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) '#', 0.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test518");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 1, 0.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test519");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 0L, (double) 'a', (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test520");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 10.0f, (double) '#', (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test521");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 100, (double) (byte) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test522");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (-1), (double) 100, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test523");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(0.0d, (double) (byte) 1, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test524");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (-1L), (double) (byte) 0, (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test525");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 100, (double) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test526");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (-1), 0.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test527");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) '#', (double) (-1), (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test528");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (byte) 100, (double) (byte) 100, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test529");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(1.0d, (double) 1, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test530");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(10.0d, (-1.0d), (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test531");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((-1.0d), (double) (byte) 10, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test532");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 10.0f, (double) 100.0f, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test533");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (short) 10, (double) (short) 1, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test534");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) ' ', (-1.0d), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test535");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(0.0d, (double) (-1L), (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test536");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 1.0f, (double) 0.0f, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test537");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 1, (double) 10L, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test538");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 100, (double) (short) -1, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test539");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (byte) 0, (double) (short) 100, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test540");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(1.0d, 100.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test541");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (-1), (double) 100, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test542");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (short) -1, 0.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test543");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 100, (double) (-1.0f), 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test544");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 'a', (double) 100L, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test545");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (-1), (double) 0L, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test546");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(100.0d, (double) 0, (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test547");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (byte) 0, 0.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test548");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 0, 100.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test549");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 10L, 10.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test550");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (byte) 1, 1.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test551");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) ' ', 1.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test552");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (byte) -1, (double) (short) -1, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test553");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 0.0f, (double) 0.0f, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test554");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 10L, 10.0d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test555");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (short) 10, (double) (byte) 100, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test556");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (-1L), 10.0d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test557");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(10.0d, (double) 1L, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test558");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 10, (double) 0.0f, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test559");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (-1.0f), (double) (-1.0f), (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test560");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 10L, (double) (short) 100, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test561");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 10L, (double) ' ', (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test562");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 100L, (double) 100, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test563");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (-1.0f), (-1.0d), (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test564");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (-1L), (double) (byte) 1, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test565");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 100.0f, (double) (byte) -1, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test566");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(0.0d, (double) (short) 10, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test567");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) ' ', (double) (-1.0f), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test568");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 10, (-1.0d), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test569");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(10.0d, (double) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test570");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 1, (double) 0.0f, (double) 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test571");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (-1), (double) (short) 1, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test572");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 10, (double) (byte) 10, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test573");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(0.0d, (double) 100L, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test574");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) '#', (double) (short) 10, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test575");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) (short) 0, (double) 'a', (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test576");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int(0.0d, (double) (short) 0, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ANY_INT_RandoopTest1.test577");
        boolean boolean3 = humaneval.correct.ANY_INT.any_int((double) 1, (double) (short) 0, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

