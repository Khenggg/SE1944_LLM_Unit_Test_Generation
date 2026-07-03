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
        Assert.assertEquals("tHKS", ENCODE.encode("This"));
    }

    @Test(timeout = 5000)
    public void testEncodeMixedCase() {
        Assert.assertEquals("tHKS KS C MGSSCGG", ENCODE.encode("This is a message"));
    }

    @Test(timeout = 5000)
    public void testEncodeAllVowels() {
        Assert.assertEquals("cDgFhJkL", ENCODE.encode("aEIoU"));
    }

    @Test(timeout = 5000)
    public void testEncodeEmptyString() {
        Assert.assertEquals("", ENCODE.encode(""));
    }

    @Test(timeout = 5000)
    public void testEncodeSingleCharacter() {
        Assert.assertEquals("B", ENCODE.encode("a"));
        Assert.assertEquals("C", ENCODE.encode("e"));
        Assert.assertEquals("G", ENCODE.encode("i"));
        Assert.assertEquals("K", ENCODE.encode("o"));
        Assert.assertEquals("W", ENCODE.encode("u"));
        Assert.assertEquals("b", ENCODE.encode("A"));
        Assert.assertEquals("c", ENCODE.encode("E"));
        Assert.assertEquals("g", ENCODE.encode("I"));
        Assert.assertEquals("k", ENCODE.encode("O"));
        Assert.assertEquals("w", ENCODE.encode("U"));
    }

    @Test(timeout = 5000)
    public void testEncodeNoVowels() {
        Assert.assertEquals("TST", ENCODE.encode("test"));
        Assert.assertEquals("THS", ENCODE.encode("THIS"));
    }

    @Test(timeout = 5000)
    public void testEncodeAllUppercase() {
        Assert.assertEquals("tHIS IS A MESSG", ENCODE.encode("THIS IS A MESSAGE"));
    }

    @Test(timeout = 5000)
    public void testEncodeAllLowercase() {
        Assert.assertEquals("tHIS IS A MESSG", ENCODE.encode("this is a message"));
    }

    @Test(timeout = 5000)
    public void testEncodeSpecialCharacters() {
        Assert.assertEquals("tHIS IS A MESSG!", ENCODE.encode("this is a message!"));
        Assert.assertEquals("tHIS IS A MESSG@123", ENCODE.encode("this is a message@123"));
    }

    @Test(timeout = 5000)
    public void testEncodeLongString() {
        String input = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String expected = "BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghijklmnopqrstuvwxyz";
        Assert.assertEquals(expected, ENCODE.encode(input));
    }
}