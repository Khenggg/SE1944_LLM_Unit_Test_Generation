package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class IS_NESTED_GPTTest {

    @Test(timeout = 5000)
    public void testValidNestedBrackets() {
        Assert.assertTrue(IS_NESTED.is_nested("[[]]"));
        Assert.assertTrue(IS_NESTED.is_nested("[[][]]"));
        Assert.assertTrue(IS_NESTED.is_nested("[[]][["));
    }

    @Test(timeout = 5000)
    public void testInvalidNestedBrackets() {
        Assert.assertFalse(IS_NESTED.is_nested("[]]]]]]][[[[[]"));
        Assert.assertFalse(IS_NESTED.is_nested("[][]"));
        Assert.assertFalse(IS_NESTED.is_nested("[]"));
    }

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertFalse(IS_NESTED.is_nested(""));
    }

    @Test(timeout = 5000)
    public void testSingleBracket() {
        Assert.assertFalse(IS_NESTED.is_nested("["));
        Assert.assertFalse(IS_NESTED.is_nested("]"));
    }

    @Test(timeout = 5000)
    public void testMultipleSingleBrackets() {
        Assert.assertTrue(IS_NESTED.is_nested("[[]][[]]"));
        Assert.assertFalse(IS_NESTED.is_nested("[][][]"));
    }

    @Test(timeout = 5000)
    public void testLongValidNestedBrackets() {
        Assert.assertTrue(IS_NESTED.is_nested("[[[]]]"));
        Assert.assertTrue(IS_NESTED.is_nested("[[[[]]]][[[]]]"));
    }

    @Test(timeout = 5000)
    public void testLongInvalidBrackets() {
        Assert.assertFalse(IS_NESTED.is_nested("[][[[]]][]]"));
        Assert.assertFalse(IS_NESTED.is_nested("][[[]]]"));
    }

    @Test(timeout = 5000)
    public void testAllClosingBrackets() {
        Assert.assertFalse(IS_NESTED.is_nested("]]]]"));
    }

    @Test(timeout = 5000)
    public void testAllOpeningBrackets() {
        Assert.assertFalse(IS_NESTED.is_nested("[[[["));
    }
}