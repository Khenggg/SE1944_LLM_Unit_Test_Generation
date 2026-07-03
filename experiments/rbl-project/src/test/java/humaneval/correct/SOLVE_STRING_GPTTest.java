package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class SOLVE_STRING_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertEquals("", SOLVE_STRING.solve_string(""));
    }

    @Test(timeout = 5000)
    public void testNoLetters() {
        Assert.assertEquals("4321", SOLVE_STRING.solve_string("1234"));
        Assert.assertEquals("!@#$", SOLVE_STRING.solve_string("!@#$"));
        Assert.assertEquals("9876543210", SOLVE_STRING.solve_string("0123456789"));
    }

    @Test(timeout = 5000)
    public void testAllLowercase() {
        Assert.assertEquals("AB", SOLVE_STRING.solve_string("ab"));
        Assert.assertEquals("HELLO", SOLVE_STRING.solve_string("hello"));
        Assert.assertEquals("WORLD", SOLVE_STRING.solve_string("world"));
    }

    @Test(timeout = 5000)
    public void testAllUppercase() {
        Assert.assertEquals("ab", SOLVE_STRING.solve_string("AB"));
        Assert.assertEquals("hello", SOLVE_STRING.solve_string("HELLO"));
        Assert.assertEquals("world", SOLVE_STRING.solve_string("WORLD"));
    }

    @Test(timeout = 5000)
    public void testMixedCase() {
        Assert.assertEquals("#A@c", SOLVE_STRING.solve_string("#a@C"));
        Assert.assertEquals("hELLO wORLD", SOLVE_STRING.solve_string("Hello World"));
        Assert.assertEquals("1234!@#", SOLVE_STRING.solve_string("1234!@#"));
    }

    @Test(timeout = 5000)
    public void testOnlySpecialCharacters() {
        Assert.assertEquals("!@#$%^&*()", SOLVE_STRING.solve_string("!@#$%^&*()"));
    }

    @Test(timeout = 5000)
    public void testSingleCharacter() {
        Assert.assertEquals("A", SOLVE_STRING.solve_string("a"));
        Assert.assertEquals("b", SOLVE_STRING.solve_string("B"));
        Assert.assertEquals("1", SOLVE_STRING.solve_string("1"));
        Assert.assertEquals("!", SOLVE_STRING.solve_string("!"));
    }

    @Test(timeout = 5000)
    public void testLongStringWithMixedContent() {
        Assert.assertEquals("1234!@#ABcdEfG", SOLVE_STRING.solve_string("1234!@#abCDeFg"));
        Assert.assertEquals("!@#321", SOLVE_STRING.solve_string("123#@!"));
    }

    @Test(timeout = 5000)
    public void testStringWithNoAlphabeticCharacters() {
        Assert.assertEquals("54321", SOLVE_STRING.solve_string("12345"));
        Assert.assertEquals("9876543210", SOLVE_STRING.solve_string("0123456789"));
    }
}