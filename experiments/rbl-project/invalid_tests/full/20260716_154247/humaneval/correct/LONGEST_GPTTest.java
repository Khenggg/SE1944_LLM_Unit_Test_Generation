package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LONGEST_GPTTest {

    @Test(timeout = 5000)
    public void testLongestWithMultipleLongestStrings() {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "blueberry", "kiwi", "strawberry");
        String result = LONGEST.longest(input);
        Assert.assertEquals("strawberry", result);
    }

    @Test(timeout = 5000)
    public void testLongestWithSingleString() {
        List<String> input = Collections.singletonList("apple");
        String result = LONGEST.longest(input);
        Assert.assertEquals("apple", result);
    }

    @Test(timeout = 5000)
    public void testLongestWithEmptyList() {
        List<String> input = Collections.emptyList();
        String result = LONGEST.longest(input);
        Assert.assertNull(result);
    }

    @Test(timeout = 5000)
    public void testLongestWithAllEmptyStrings() {
        List<String> input = Arrays.asList("", "", "");
        String result = LONGEST.longest(input);
        Assert.assertEquals("", result);
    }

    @Test(timeout = 5000)
    public void testLongestWithDifferentLengthStrings() {
        List<String> input = Arrays.asList("a", "ab", "abc", "abcd", "abcde");
        String result = LONGEST.longest(input);
        Assert.assertEquals("abcde", result);
    }

    @Test(timeout = 5000)
    public void testLongestWithNullStrings() {
        List<String> input = Arrays.asList(null, "apple", null);
        String result = LONGEST.longest(input);
        Assert.assertEquals("apple", result);
    }

    @Test(timeout = 5000)
    public void testLongestWithAllSameLengthStrings() {
        List<String> input = Arrays.asList("cat", "dog", "bat");
        String result = LONGEST.longest(input);
        Assert.assertEquals("cat", result);
    }

    @Test(timeout = 5000)
    public void testLongestWithLongStrings() {
        List<String> input = Arrays.asList("longeststring", "longerstring", "short");
        String result = LONGEST.longest(input);
        Assert.assertEquals("longeststring", result);
    }
}