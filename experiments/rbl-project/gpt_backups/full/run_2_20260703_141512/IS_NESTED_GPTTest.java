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

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testMultipleUnmatchedBrackets() {
        Assert.assertFalse(IS_NESTED.is_nested("[][][]"));
        Assert.assertFalse(IS_NESTED.is_nested("[]][[]"));
        Assert.assertFalse(IS_NESTED.is_nested("]][["));
    }

    @Test(timeout = 5000)
    public void testLongValidNestedBrackets() {
        Assert.assertTrue(IS_NESTED.is_nested("[[[]]]"));
        Assert.assertTrue(IS_NESTED.is_nested("[[[[]]]]"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testLongInvalidBrackets() {
        Assert.assertFalse(IS_NESTED.is_nested("[][[[]]][]]"));
        Assert.assertFalse(IS_NESTED.is_nested("[][[[]]][][["));
    }

    @Test(timeout = 5000)
    public void testNestedWithExtraBrackets() {
        Assert.assertTrue(IS_NESTED.is_nested("[[[]]][[]]"));
        Assert.assertTrue(IS_NESTED.is_nested("[[]][[[]]]"));
    }
}