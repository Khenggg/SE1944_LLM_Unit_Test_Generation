package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class CHECK_IF_LAST_CHAR_IS_A_LETTER_GPTTest {

    @Test(timeout = 5000)
    public void testLastCharacterIsLetter() {
        Assert.assertTrue(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e"));
    }

    @Test(timeout = 5000)
    public void testLastCharacterIsNotLetter() {
        Assert.assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pie"));
    }

    @Test(timeout = 5000)
    public void testLastCharacterIsSpace() {
        Assert.assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e "));
    }

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(""));
    }

    @Test(timeout = 5000)
    public void testSingleLetter() {
        Assert.assertTrue(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("a"));
    }

    @Test(timeout = 5000)
    public void testSingleNonLetter() {
        Assert.assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("1"));
    }

    @Test(timeout = 5000)
    public void testMultipleSpaces() {
        Assert.assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e    "));
    }

    @Test(timeout = 5000)
    public void testLastCharacterIsSpecialCharacter() {
        Assert.assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e!"));
    }

    @Test(timeout = 5000)
    public void testLastCharacterIsUppercaseLetter() {
        Assert.assertTrue(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi E"));
    }

    @Test(timeout = 5000)
    public void testLastCharacterIsMixedCase() {
        Assert.assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi eE"));
    }

    @Test(timeout = 5000)
    public void testLastCharacterIsDigit() {
        Assert.assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi 3"));
    }

    @Test(timeout = 5000)
    public void testLastCharacterIsUnderscore() {
        Assert.assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e_"));
    }

    @Test(timeout = 5000)
    public void testLastCharacterIsTab() {
        Assert.assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e\t"));
    }
}