package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.HashMap;

public class HISTOGRAM_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyString() {
        HashMap<Character, Integer> result = HISTOGRAM.histogram("");
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testSingleCharacter() {
        HashMap<Character, Integer> result = HISTOGRAM.histogram("a");
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        Assert.assertEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testMultipleUniqueCharacters() {
        HashMap<Character, Integer> result = HISTOGRAM.histogram("a b c");
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put('b', 1);
        expected.put('c', 1);
        Assert.assertEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testTwoCharactersWithSameCount() {
        HashMap<Character, Integer> result = HISTOGRAM.histogram("a b a b");
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Assert.assertEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testOneCharacterDominates() {
        HashMap<Character, Integer> result = HISTOGRAM.histogram("b b b b a");
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('b', 4);
        Assert.assertEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testAllSameCharacters() {
        HashMap<Character, Integer> result = HISTOGRAM.histogram("c c c c");
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('c', 4);
        Assert.assertEquals(expected, result);
    }

    @Test(timeout = 5000)
    public void testMultipleCharactersWithDifferentCounts() {
        HashMap<Character, Integer> result = HISTOGRAM.histogram("d e e d d e");
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('d', 3);
        expected.put('e', 3);
        Assert.assertEquals(expected, result);
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testCharactersWithSpaces() {
        HashMap<Character, Integer> result = HISTOGRAM.histogram("a   b  a b");
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Assert.assertEquals(expected, result);
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testNoLetters() {
        HashMap<Character, Integer> result = HISTOGRAM.histogram("1 2 3");
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testMixedCharacters() {
        HashMap<Character, Integer> result = HISTOGRAM.histogram("a b c d e f g h i j k l m n o p q r s t u v w x y z");
        HashMap<Character, Integer> expected = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            expected.put(c, 1);
        }
        Assert.assertEquals(expected, result);
    }
}