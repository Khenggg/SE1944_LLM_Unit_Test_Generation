package humaneval.correct;

import org.junit.Assert;
import org.junit.Test;

public class GET_CLOSET_VOWEL_GPTTest {

    @Test(timeout = 5000)
    public void testGetClosestVowelWithValidInput() {
        Assert.assertEquals("u", GET_CLOSET_VOWEL.get_closet_vowel("yogurt"));
        Assert.assertEquals("U", GET_CLOSET_VOWEL.get_closet_vowel("FULL"));
    }

    @Test(timeout = 5000)
    public void testGetClosestVowelWithNoVowelBetweenConsonants() {
        Assert.assertEquals("", GET_CLOSET_VOWEL.get_closet_vowel("quick"));
        Assert.assertEquals("", GET_CLOSET_VOWEL.get_closet_vowel("bcd"));
    }

    @Test(timeout = 5000)
    public void testGetClosestVowelWithVowelAtStartOrEnd() {
        Assert.assertEquals("", GET_CLOSET_VOWEL.get_closet_vowel("ab"));
        Assert.assertEquals("", GET_CLOSET_VOWEL.get_closet_vowel("aquick"));
        Assert.assertEquals("", GET_CLOSET_VOWEL.get_closet_vowel("quicku"));
    }

    @Test(timeout = 5000)
    public void testGetClosestVowelWithMultipleVowels() {
        Assert.assertEquals("o", GET_CLOSET_VOWEL.get_closet_vowel("bacon"));
        Assert.assertEquals("i", GET_CLOSET_VOWEL.get_closet_vowel("biscuit"));
    }

    @Test(timeout = 5000)
    public void testGetClosestVowelWithConsonantsOnly() {
        Assert.assertEquals("", GET_CLOSET_VOWEL.get_closet_vowel("bcdfgh"));
        Assert.assertEquals("", GET_CLOSET_VOWEL.get_closet_vowel("xyz"));
    }

    @Test(timeout = 5000)
    public void testGetClosestVowelWithSingleCharacter() {
        Assert.assertEquals("", GET_CLOSET_VOWEL.get_closet_vowel("a"));
        Assert.assertEquals("", GET_CLOSET_VOWEL.get_closet_vowel("b"));
    }

    @Test(timeout = 5000)
    public void testGetClosestVowelWithTwoCharacters() {
        Assert.assertEquals("", GET_CLOSET_VOWEL.get_closet_vowel("ab"));
        Assert.assertEquals("", GET_CLOSET_VOWEL.get_closet_vowel("ba"));
    }

    @Test(timeout = 5000)
    public void testGetClosestVowelWithMixedCase() {
        Assert.assertEquals("A", GET_CLOSET_VOWEL.get_closet_vowel("bAcdE"));
        Assert.assertEquals("e", GET_CLOSET_VOWEL.get_closet_vowel("bEcdE"));
    }

    @Test(timeout = 5000)
    public void testGetClosestVowelWithLongInput() {
        Assert.assertEquals("o", GET_CLOSET_VOWEL.get_closet_vowel("thisisalongwordwithvowelsandconsonants"));
        Assert.assertEquals("u", GET_CLOSET_VOWEL.get_closet_vowel("thequickbrownfoxjumpsoverthelazydog"));
    }
}