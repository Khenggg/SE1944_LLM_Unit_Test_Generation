package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class SOLVE_STRING_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertEquals("", SOLVE_STRING.solve_string(""));
    }

    @Test(timeout = 5000)
    public void testOnlyDigits() {
        Assert.assertEquals("4321", SOLVE_STRING.solve_string("1234"));
    }

    @Test(timeout = 5000)
    public void testOnlyLowercaseLetters() {
        Assert.assertEquals("AB", SOLVE_STRING.solve_string("ab"));
    }

    @Test(timeout = 5000)
    public void testOnlyUppercaseLetters() {
        Assert.assertEquals("ab", SOLVE_STRING.solve_string("AB"));
    }

    @Test(timeout = 5000)
    public void testMixedCaseLetters() {
        Assert.assertEquals("#A@c", SOLVE_STRING.solve_string("#a@C"));
    }

    @Test(timeout = 5000)
    public void testSpecialCharactersOnly() {
        Assert.assertEquals("!@#$%^&*", SOLVE_STRING.solve_string("!@#$%^&*"));
    }

    @Test(timeout = 5000)
    public void testMixedContent() {
        Assert.assertEquals("1234ABcd!@#", SOLVE_STRING.solve_string("1234abCD!@#"));
    }

    @Test(timeout = 5000)
    public void testAllLowercaseWithSpecialChars() {
        Assert.assertEquals("!@#ABCD", SOLVE_STRING.solve_string("!@#abcd"));
    }

    @Test(timeout = 5000)
    public void testAllUppercaseWithSpecialChars() {
        Assert.assertEquals("!@#abcd", SOLVE_STRING.solve_string("!@#ABCD"));
    }

    @Test(timeout = 5000)
    public void testSingleLetter() {
        Assert.assertEquals("a", SOLVE_STRING.solve_string("A"));
        Assert.assertEquals("A", SOLVE_STRING.solve_string("a"));
    }

    @Test(timeout = 5000)
    public void testLongStringWithMixedContent() {
        Assert.assertEquals("1234!@#ABcdEFgh", SOLVE_STRING.solve_string("1234!@#abCDefGH"));
    }

    @Test(timeout = 5000)
    public void testStringWithNoLetters() {
        Assert.assertEquals("9876543210", SOLVE_STRING.solve_string("0123456789"));
    }

    @Test(timeout = 5000)
    public void testStringWithOnlyOneLetterAndDigits() {
        Assert.assertEquals("1A", SOLVE_STRING.solve_string("1a"));
        Assert.assertEquals("1a", SOLVE_STRING.solve_string("1A"));
    }

    @Test(timeout = 5000)
    public void testStringWithSpaces() {
        Assert.assertEquals(" A b C ", SOLVE_STRING.solve_string(" a B c "));
    }

    @Test(timeout = 5000)
    public void testStringWithMixedSpacesAndSpecialChars() {
        Assert.assertEquals("! @ # A B C !", SOLVE_STRING.solve_string("! @ # a b c !"));
    }
}