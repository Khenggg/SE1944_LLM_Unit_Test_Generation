package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class COMPARE_ONE_GPTTest {

    @Test(timeout = 5000)
    public void testCompareOneWithIntegerAndFloat() {
        Assert.assertEquals(2.5, COMPARE_ONE.compare_one(1, 2.5));
    }

    @Test(timeout = 5000)
    public void testCompareOneWithIntegerAndStringFloat() {
        Assert.assertEquals("2,3", COMPARE_ONE.compare_one(1, "2,3"));
    }

    @Test(timeout = 5000)
    public void testCompareOneWithStringFloatAndStringInteger() {
        Assert.assertEquals("6", COMPARE_ONE.compare_one("5,1", "6"));
    }

    @Test(timeout = 5000)
    public void testCompareOneWithEqualIntegers() {
        Assert.assertNull(COMPARE_ONE.compare_one(1, 1));
    }

    @Test(timeout = 5000)
    public void testCompareOneWithEqualFloats() {
        Assert.assertNull(COMPARE_ONE.compare_one(2.5, 2.5));
    }

    @Test(timeout = 5000)
    public void testCompareOneWithEqualStrings() {
        Assert.assertNull(COMPARE_ONE.compare_one("1", "1"));
    }

    @Test(timeout = 5000)
    public void testCompareOneWithStringAndIntegerEqualAfterConversion() {
        Assert.assertNull(COMPARE_ONE.compare_one("1", 1));
    }

    @Test(timeout = 5000)
    public void testCompareOneWithStringFloatAndInteger() {
        Assert.assertEquals("2,5", COMPARE_ONE.compare_one("2,5", 2));
    }

    @Test(timeout = 5000)
    public void testCompareOneWithStringIntegerAndFloat() {
        Assert.assertEquals(3.0, COMPARE_ONE.compare_one("2", 3.0));
    }

    @Test(timeout = 5000)
    public void testCompareOneWithNegativeValues() {
        Assert.assertEquals(-1, COMPARE_ONE.compare_one(-1, -2));
    }

    @Test(timeout = 5000)
    public void testCompareOneWithNegativeStringAndPositiveInteger() {
        Assert.assertEquals(1, COMPARE_ONE.compare_one("-1", 1));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testCompareOneWithStringRepresentingNegativeFloatAndInteger() {
        Assert.assertEquals("-1.5", COMPARE_ONE.compare_one("-1.5", 0));
    }

    @Test(timeout = 5000)
    public void testCompareOneWithStringRepresentingFloatAndStringRepresentingInteger() {
        Assert.assertEquals("3", COMPARE_ONE.compare_one("2.5", "3"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testCompareOneWithNullValues() {
        Assert.assertNull(COMPARE_ONE.compare_one(null, null));
        Assert.assertNull(COMPARE_ONE.compare_one(null, 1));
        Assert.assertNull(COMPARE_ONE.compare_one(1, null));
    }
}