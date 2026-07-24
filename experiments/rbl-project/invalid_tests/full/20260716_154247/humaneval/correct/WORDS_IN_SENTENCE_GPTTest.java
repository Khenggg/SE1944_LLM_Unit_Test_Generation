package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class WORDS_IN_SENTENCE_GPTTest {

    @Test(timeout = 5000)
    public void testEmptySentence() {
        String input = "";
        String expected = "";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSingleWordPrimeLength() {
        String input = "a";
        String expected = "a";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSingleWordNonPrimeLength() {
        String input = "abc";
        String expected = "";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testTwoWordsBothPrimeLengths() {
        String input = "is it";
        String expected = "is it";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testTwoWordsOnePrimeOneNonPrime() {
        String input = "is test";
        String expected = "is";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testTwoWordsBothNonPrimeLengths() {
        String input = "abc def";
        String expected = "";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testMultipleWordsMixedLengths() {
        String input = "This is a test";
        String expected = "is";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testAllWordsNonPrimeLengths() {
        String input = "hello world";
        String expected = "";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testAllWordsPrimeLengths() {
        String input = "I am an";
        String expected = "I am an";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testLongSentenceWithMixedLengths() {
        String input = "This is a simple test for prime lengths";
        String expected = "is a for";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithSingleCharacterWords() {
        String input = "a b c d e";
        String expected = "a b c d e";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithTwoCharacterWords() {
        String input = "to be or not";
        String expected = "to be or";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithThreeCharacterWords() {
        String input = "the cat sat";
        String expected = "the cat";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithFourCharacterWords() {
        String input = "word test case";
        String expected = "case";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithFiveCharacterWords() {
        String input = "hello world again";
        String expected = "again";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithSixCharacterWords() {
        String input = "banana apple orange";
        String expected = "";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithSevenCharacterWords() {
        String input = "example sentence testing";
        String expected = "example";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithEightCharacterWords() {
        String input = "abcdefgh ijklmnop";
        String expected = "";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithNineCharacterWords() {
        String input = "abcdefghij klmnopqrst";
        String expected = "abcdefghij";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithTenCharacterWords() {
        String input = "abcdefghijk lmnopqrstuv";
        String expected = "";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }
}