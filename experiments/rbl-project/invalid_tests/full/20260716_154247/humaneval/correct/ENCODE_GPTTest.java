package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class ENCODE_GPTTest {

    @Test(timeout = 5000)
    public void testEncodeLowercase() {
        Assert.assertEquals("TGST", ENCODE.encode("test"));
    }

    @Test(timeout = 5000)
    public void testEncodeUppercase() {
        Assert.assertEquals("tHIS IS A MGSSG", ENCODE.encode("This is a message"));
    }

    @Test(timeout = 5000)
    public void testEncodeMixedCase() {
        Assert.assertEquals("tHKS KS C MGSSCGG", ENCODE.encode("This is a message"));
    }

    @Test(timeout = 5000)
    public void testEncodeAllVowels() {
        Assert.assertEquals("C", ENCODE.encode("a"));
        Assert.assertEquals("G", ENCODE.encode("e"));
        Assert.assertEquals("K", ENCODE.encode("i"));
        Assert.assertEquals("M", ENCODE.encode("o"));
        Assert.assertEquals("W", ENCODE.encode("u"));
    }

    @Test(timeout = 5000)
    public void testEncodeAllUppercaseVowels() {
        Assert.assertEquals("C", ENCODE.encode("A"));
        Assert.assertEquals("G", ENCODE.encode("E"));
        Assert.assertEquals("K", ENCODE.encode("I"));
        Assert.assertEquals("M", ENCODE.encode("O"));
        Assert.assertEquals("W", ENCODE.encode("U"));
    }

    @Test(timeout = 5000)
    public void testEncodeEmptyString() {
        Assert.assertEquals("", ENCODE.encode(""));
    }

    @Test(timeout = 5000)
    public void testEncodeNoVowels() {
        Assert.assertEquals("TST", ENCODE.encode("test"));
        Assert.assertEquals("THS", ENCODE.encode("this"));
        Assert.assertEquals("BCDFGHJKLMNPQRSTVWXYZ", ENCODE.encode("abcdefghijklmnopqrstuvwxyz".replaceAll("[aeiou]", "")));
    }

    @Test(timeout = 5000)
    public void testEncodeAllCharacters() {
        Assert.assertEquals("tHIS IS A MGSSG", ENCODE.encode("This is a message"));
        Assert.assertEquals("TST", ENCODE.encode("Test"));
        Assert.assertEquals("G", ENCODE.encode("e"));
        Assert.assertEquals("C", ENCODE.encode("A"));
    }

    @Test(timeout = 5000)
    public void testEncodeLongString() {
        String input = "abcdefghijklmnopqrstuvwxyz";
        String expected = "BCDFGHJKLMNPQRSTVWXYZ";
        Assert.assertEquals(expected, ENCODE.encode(input));
    }

    @Test(timeout = 5000)
    public void testEncodeSpecialCharacters() {
        Assert.assertEquals("tHIS IS A MGSSG", ENCODE.encode("This is a message!"));
        Assert.assertEquals("tHIS IS A MGSSG", ENCODE.encode("This is a message."));
    }
}