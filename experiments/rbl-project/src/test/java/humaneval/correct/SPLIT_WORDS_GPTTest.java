package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class SPLIT_WORDS_GPTTest {

    @Test(timeout = 5000)
    public void testSplitWordsWithSpaces() {
        String[] result = SPLIT_WORDS.split_words("Hello world!");
        String[] expected = {"Hello", "world!"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testSplitWordsWithCommas() {
        String[] result = SPLIT_WORDS.split_words("Hello,world!");
        String[] expected = {"Hello", "world!"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testSplitWordsWithNoSpacesOrCommas() {
        String[] result = SPLIT_WORDS.split_words("abcdef");
        String[] expected = {"3"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testSplitWordsWithOnlyLowercaseOddLetters() {
        String[] result = SPLIT_WORDS.split_words("aceg");
        String[] expected = {"2"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testSplitWordsWithOnlyLowercaseEvenLetters() {
        String[] result = SPLIT_WORDS.split_words("bdfh");
        String[] expected = {"0"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testSplitWordsWithMixedCase() {
        String[] result = SPLIT_WORDS.split_words("Abcdef");
        String[] expected = {"1"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testSplitWordsWithSpecialCharacters() {
        String[] result = SPLIT_WORDS.split_words("Hello@world!");
        String[] expected = {"Hello@world!"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testSplitWordsWithEmptyString() {
        String[] result = SPLIT_WORDS.split_words("");
        String[] expected = {"0"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testSplitWordsWithOnlySpaces() {
        String[] result = SPLIT_WORDS.split_words("   ");
        String[] expected = {"0"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testSplitWordsWithOnlyCommas() {
        String[] result = SPLIT_WORDS.split_words(",,,");
        String[] expected = {"0"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testSplitWordsWithMixedSpacesAndCommas() {
        String[] result = SPLIT_WORDS.split_words("Hello, world!");
        String[] expected = {"Hello,", "world!"};
        Assert.assertArrayEquals(expected, result);
    }
}