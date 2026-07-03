package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class WORDS_IN_SENTENCE_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyString() {
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
        String input = "this is";
        String expected = "is";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testMultipleWordsMixedLengths() {
        String input = "lets go for swimming";
        String expected = "go for";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testAllWordsNonPrimeLengths() {
        String input = "this test code";
        String expected = "";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testAllWordsPrimeLengths() {
        String input = "a is it";
        String expected = "a is it";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testLongSentenceWithMixedLengths() {
        String input = "The quick brown fox jumps over the lazy dog";
        String expected = "The fox the";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSingleCharacterWords() {
        String input = "a b c d e";
        String expected = "a b c d e";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithTwoCharacterWords() {
        String input = "to be or not to be";
        String expected = "to be or to be";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithThreeCharacterWords() {
        String input = "the cat sat";
        String expected = "the cat sat";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithFourCharacterWords() {
        String input = "this test code";
        String expected = "";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithFiveCharacterWords() {
        String input = "hello world apple";
        String expected = "apple";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithSixCharacterWords() {
        String input = "banana orange grape";
        String expected = "banana orange";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithSevenCharacterWords() {
        String input = "example sentence testing";
        String expected = "example testing";
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
        String expected = "";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }

    @Test(timeout = 5000)
    public void testSentenceWithTenCharacterWords() {
        String input = "abcdefghijk lmnopqrstuv";
        String expected = "";
        Assert.assertEquals(expected, WORDS_IN_SENTENCE.words_in_sentence(input));
    }
}