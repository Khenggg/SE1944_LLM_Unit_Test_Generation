package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class VALID_DATE_GPTTest {

    @Test(timeout = 5000)
    public void testValidDate() {
        Assert.assertTrue(VALID_DATE.valid_date("03-11-2000"));
        Assert.assertTrue(VALID_DATE.valid_date("06-04-2020"));
    }

    @Test(timeout = 5000)
    public void testInvalidDateFormat() {
        Assert.assertFalse(VALID_DATE.valid_date("06/04/2020"));
        Assert.assertFalse(VALID_DATE.valid_date("04-0-2040"));
        Assert.assertFalse(VALID_DATE.valid_date("04-31-2020"));
        Assert.assertFalse(VALID_DATE.valid_date("13-01-2012"));
    }

    @Test(timeout = 5000)
    public void testInvalidDaysInMonth() {
        Assert.assertFalse(VALID_DATE.valid_date("04-31-2020")); // April has 30 days
        Assert.assertFalse(VALID_DATE.valid_date("06-31-2020")); // June has 30 days
        Assert.assertFalse(VALID_DATE.valid_date("09-31-2020")); // September has 30 days
        Assert.assertFalse(VALID_DATE.valid_date("11-31-2020")); // November has 30 days
        Assert.assertFalse(VALID_DATE.valid_date("02-30-2020")); // February has 29 days in leap year
        Assert.assertFalse(VALID_DATE.valid_date("02-29-2021")); // February has 28 days in non-leap year
    }

    @Test(timeout = 5000)
    public void testEdgeCases() {
        Assert.assertFalse(VALID_DATE.valid_date("00-01-2020")); // Month less than 1
        Assert.assertFalse(VALID_DATE.valid_date("01-00-2020")); // Day less than 1
        Assert.assertFalse(VALID_DATE.valid_date("12-32-2020")); // Day greater than 31
        Assert.assertFalse(VALID_DATE.valid_date("13-01-2020")); // Month greater than 12
    }

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertFalse(VALID_DATE.valid_date(""));
    }

    @Test(timeout = 5000)
    public void testNullInput() {
        Assert.assertFalse(VALID_DATE.valid_date(null));
    }

    @Test(timeout = 5000)
    public void testWhitespaceInput() {
        Assert.assertFalse(VALID_DATE.valid_date("   "));
    }

    @Test(timeout = 5000)
    public void testInvalidLength() {
        Assert.assertFalse(VALID_DATE.valid_date("01-01-2020-Extra")); // More than 3 parts
    }
}