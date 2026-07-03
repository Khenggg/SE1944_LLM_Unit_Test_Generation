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
        String[] extensions = {"AA", "BB", "Cc"};
        String expected = "TestClass.AA"; // AA and BB have the same strength, AA comes first
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testEmptyExtensions() {
        String className = "TestClass";
        String[] extensions = {};
        String expected = "TestClass.null"; // No extensions, should return null
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testNullClassName() {
        String className = null;
        String[] extensions = {"Extension"};
        String expected = "null.Extension"; // Class name is null
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testNullExtensions() {
        String className = "TestClass";
        String[] extensions = null;
        String expected = "TestClass.null"; // Extensions are null
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testAllUppercaseAndLowercase() {
        String className = "TestClass";
        String[] extensions = {"aBcDeF", "GHIJKL", "mnopqr"};
        String expected = "TestClass.GHIJKL"; // GHIJKL has the highest strength
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testAllLowercase() {
        String className = "TestClass";
        String[] extensions = {"abc", "def", "ghi"};
        String expected = "TestClass.abc"; // All have the same strength, first one is chosen
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }

    @Test(timeout = 5000)
    public void testMixedCaseExtensions() {
        String className = "TestClass";
        String[] extensions = {"AbC", "dEf", "GhI"};
        String expected = "TestClass.AbC"; // AbC has the highest strength
        Assert.assertEquals(expected, STRONGEST_EXTENSION.strongest_extension(className, extensions));
    }
}