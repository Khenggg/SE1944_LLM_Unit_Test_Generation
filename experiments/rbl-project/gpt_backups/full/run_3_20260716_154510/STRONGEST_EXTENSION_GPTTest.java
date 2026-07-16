package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class STRONGEST_EXTENSION_GPTTest {

    @Test(timeout = 5000)
    public void testSingleExtensionAllUppercase() {
        String className = "TestClass";
        String[] extensions = {"EXTENSION"};
        String expected = "TestClass.EXTENSION";
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testSingleExtensionAllLowercase() {
        String className = "TestClass";
        String[] extensions = {"extension"};
        String expected = "TestClass.extension";
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testMultipleExtensionsDifferentStrengths() {
        String className = "TestClass";
        String[] extensions = {"AA", "Be", "CC"};
        String expected = "TestClass.AA";
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testMultipleExtensionsSameStrength() {
        String className = "TestClass";
        String[] extensions = {"A", "B", "C"};
        String expected = "TestClass.A";
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testEmptyExtensions() {
        String className = "TestClass";
        String[] extensions = {};
        String expected = "TestClass.null";
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testNoUppercaseLetters() {
        String className = "TestClass";
        String[] extensions = {"abc", "def", "ghi"};
        String expected = "TestClass.abc";
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testNoLowercaseLetters() {
        String className = "TestClass";
        String[] extensions = {"ABC", "DEF", "GHI"};
        String expected = "TestClass.ABC";
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testMixedCaseExtensions() {
        String className = "TestClass";
        String[] extensions = {"AbC", "dEf", "GhI"};
        String expected = "TestClass.AbC";
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testAllUppercaseAndLowercaseSameCount() {
        String className = "TestClass";
        String[] extensions = {"Aa", "Bb", "Cc"};
        String expected = "TestClass.Aa";
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testClassNameWithSpecialCharacters() {
        String className = "Test@Class";
        String[] extensions = {"Ext1", "Ext2"};
        String expected = "Test@Class.Ext1";
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }
}