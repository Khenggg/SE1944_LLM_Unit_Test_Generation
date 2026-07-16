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
        Assert.assertFalse(VALID_DATE.valid_date("15-01-2012"));
    }

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertFalse(VALID_DATE.valid_date(""));
    }

    @Test(timeout = 5000)
    public void testInvalidMonth() {
        Assert.assertFalse(VALID_DATE.valid_date("00-10-2020"));
        Assert.assertFalse(VALID_DATE.valid_date("13-10-2020"));
    }

    @Test(timeout = 5000)
    public void testInvalidDaysInMonth() {
        Assert.assertFalse(VALID_DATE.valid_date("04-31-2020")); // April has 30 days
        Assert.assertFalse(VALID_DATE.valid_date("06-31-2020")); // June has 30 days
        Assert.assertFalse(VALID_DATE.valid_date("09-31-2020")); // September has 30 days
        Assert.assertFalse(VALID_DATE.valid_date("02-30-2020")); // February has 29 days in leap year
        Assert.assertFalse(VALID_DATE.valid_date("02-29-2019")); // February has 28 days in non-leap year
        Assert.assertTrue(VALID_DATE.valid_date("02-29-2020")); // February has 29 days in leap year
    }

    @Test(timeout = 5000)
    public void testBoundaryValues() {
        Assert.assertTrue(VALID_DATE.valid_date("01-01-2000")); // First day of the year
        Assert.assertTrue(VALID_DATE.valid_date("12-31-2000")); // Last day of the year
        Assert.assertFalse(VALID_DATE.valid_date("01-00-2000")); // Invalid day
        Assert.assertFalse(VALID_DATE.valid_date("12-32-2000")); // Invalid day
    }

    @Test(timeout = 5000)
    public void testInvalidInputWithExtraParts() {
        Assert.assertFalse(VALID_DATE.valid_date("01-01-2000-Extra"));
        Assert.assertFalse(VALID_DATE.valid_date("01-01-2000-01"));
    }

    @Test(timeout = 5000)
    public void testInvalidCharacters() {
        Assert.assertFalse(VALID_DATE.valid_date("01-01-20a0"));
        Assert.assertFalse(VALID_DATE.valid_date("01-01-20.0"));
    }
}