package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class WORDS_STRINGS_GPTTest {

    @Test(timeout = 5000)
    public void testNormalInputWithSpaces() {
        String input = "Hi my name is John";
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Hi");
        expected.add("my");
        expected.add("name");
        expected.add("is");
        expected.add("John");
        Assert.assertEquals(expected, WORDS_STRINGS.words_strings(input));
    }

    @Test(timeout = 5000)
    public void testNormalInputWithCommas() {
        String input = "One, two, three, four, five, six";
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("One");
        expected.add("two");
        expected.add("three");
        expected.add("four");
        expected.add("five");
        expected.add("six");
        Assert.assertEquals(expected, WORDS_STRINGS.words_strings(input));
    }

    @Test(timeout = 5000)
    public void testInputWithMixedSeparators() {
        String input = "Hello, world this is a test";
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Hello");
        expected.add("world");
        expected.add("this");
        expected.add("is");
        expected.add("a");
        expected.add("test");
        Assert.assertEquals(expected, WORDS_STRINGS.words_strings(input));
    }

    @Test(timeout = 5000)
    public void testEmptyInput() {
        String input = "";
        ArrayList<String> expected = new ArrayList<String>();
        Assert.assertEquals(expected, WORDS_STRINGS.words_strings(input));
    }

    @Test(timeout = 5000)
    public void testNullInput() {
        String input = null;
        ArrayList<String> expected = new ArrayList<String>();
        Assert.assertEquals(expected, WORDS_STRINGS.words_strings(input));
    }

    @Test(timeout = 5000)
    public void testInputWithOnlySpaces() {
        String input = "     ";
        ArrayList<String> expected = new ArrayList<String>();
        Assert.assertEquals(expected, WORDS_STRINGS.words_strings(input));
    }

    @Test(timeout = 5000)
    public void testInputWithLeadingAndTrailingSpaces() {
        String input = "   Hello, world   ";
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Hello");
        expected.add("world");
        Assert.assertEquals(expected, WORDS_STRINGS.words_strings(input));
    }

    @Test(timeout = 5000)
    public void testInputWithMultipleCommas() {
        String input = "One,,two,,,three";
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("One");
        expected.add("two");
        expected.add("three");
        Assert.assertEquals(expected, WORDS_STRINGS.words_strings(input));
    }

    @Test(timeout = 5000)
    public void testInputWithMultipleSpaces() {
        String input = "One    two   three";
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("One");
        expected.add("two");
        expected.add("three");
        Assert.assertEquals(expected, WORDS_STRINGS.words_strings(input));
    }

    @Test(timeout = 5000)
    public void testInputWithOnlyCommas() {
        String input = ",,,";
        ArrayList<String> expected = new ArrayList<String>();
        Assert.assertEquals(expected, WORDS_STRINGS.words_strings(input));
    }
}