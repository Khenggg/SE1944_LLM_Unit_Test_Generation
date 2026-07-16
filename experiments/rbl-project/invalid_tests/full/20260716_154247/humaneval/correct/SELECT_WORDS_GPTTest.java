package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class SELECT_WORDS_GPTTest {

    @Test(timeout = 5000)
    public void testSelectWords_EmptyString() {
        ArrayList<String> result = SELECT_WORDS.select_words("", 3);
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testSelectWords_NoWordsWithNConsonants() {
        ArrayList<String> result = SELECT_WORDS.select_words("simple white space", 2);
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testSelectWords_ExactMatch() {
        ArrayList<String> result = SELECT_WORDS.select_words("Mary had a little lamb", 4);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("little", result.get(0));
    }

    @Test(timeout = 5000)
    public void testSelectWords_MultipleMatches() {
        ArrayList<String> result = SELECT_WORDS.select_words("Mary had a little lamb", 3);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals("Mary", result.get(0));
        Assert.assertEquals("lamb", result.get(1));
    }

    @Test(timeout = 5000)
    public void testSelectWords_SingleWordWithNConsonants() {
        ArrayList<String> result = SELECT_WORDS.select_words("Hello world", 4);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("world", result.get(0));
    }

    @Test(timeout = 5000)
    public void testSelectWords_NegativeConsonants() {
        ArrayList<String> result = SELECT_WORDS.select_words("Mary had a little lamb", -1);
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testSelectWords_ZeroConsonants() {
        ArrayList<String> result = SELECT_WORDS.select_words("a e i o u", 0);
        Assert.assertEquals(5, result.size());
        Assert.assertEquals("a", result.get(0));
        Assert.assertEquals("e", result.get(1));
        Assert.assertEquals("i", result.get(2));
        Assert.assertEquals("o", result.get(3));
        Assert.assertEquals("u", result.get(4));
    }

    @Test(timeout = 5000)
    public void testSelectWords_ConsonantsInUppercase() {
        ArrayList<String> result = SELECT_WORDS.select_words("HELLO world", 3);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("HELLO", result.get(0));
    }

    @Test(timeout = 5000)
    public void testSelectWords_MixedCase() {
        ArrayList<String> result = SELECT_WORDS.select_words("Mary Had A Little Lamb", 4);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("Little", result.get(0));
    }

    @Test(timeout = 5000)
    public void testSelectWords_SingleCharacterWords() {
        ArrayList<String> result = SELECT_WORDS.select_words("a b c d e f g h i j k l m n o p q r s t u v w x y z", 1);
        Assert.assertEquals(21, result.size());
    }

    @Test(timeout = 5000)
    public void testSelectWords_SpecialCharacters() {
        ArrayList<String> result = SELECT_WORDS.select_words("Hello, world!", 4);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("world", result.get(0));
    }
}