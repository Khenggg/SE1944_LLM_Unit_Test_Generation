package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class MATCH_PARENS_GPTTest {

    @Test(timeout = 5000)
    public void testBalancedParentheses() {
        Assert.assertEquals("Yes", MATCH_PARENS.match_parens(new String[]{"()(", ")"}));
        Assert.assertEquals("Yes", MATCH_PARENS.match_parens(new String[]{"(())", "()"}));
        Assert.assertEquals("Yes", MATCH_PARENS.match_parens(new String[]{"()", "()"}));
        Assert.assertEquals("Yes", MATCH_PARENS.match_parens(new String[]{"((()))", "()"}));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testUnbalancedParentheses() {
        Assert.assertEquals("No", MATCH_PARENS.match_parens(new String[]{")", ")"}));
        Assert.assertEquals("No", MATCH_PARENS.match_parens(new String[]{"(", ")("}));
        Assert.assertEquals("No", MATCH_PARENS.match_parens(new String[]{"(()", ")("}));
        Assert.assertEquals("No", MATCH_PARENS.match_parens(new String[]{"())", "(()"}));
    }

    @Test(timeout = 5000)
    public void testEmptyStrings() {
        Assert.assertEquals("Yes", MATCH_PARENS.match_parens(new String[]{"", ""}));
        Assert.assertEquals("No", MATCH_PARENS.match_parens(new String[]{"(", ""}));
        Assert.assertEquals("No", MATCH_PARENS.match_parens(new String[]{"", ")"}));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test(timeout = 5000)
    public void testSingleParentheses() {
        Assert.assertEquals("No", MATCH_PARENS.match_parens(new String[]{"(", ")"}));
        Assert.assertEquals("No", MATCH_PARENS.match_parens(new String[]{")", "("}));
    }

    @Test(timeout = 5000)
    public void testLongUnbalanced() {
        Assert.assertEquals("No", MATCH_PARENS.match_parens(new String[]{"(((((", "))))))"}));
        Assert.assertEquals("No", MATCH_PARENS.match_parens(new String[]{"(((((", "))))"}));
    }

    @Test(timeout = 5000)
    public void testLongBalanced() {
        Assert.assertEquals("Yes", MATCH_PARENS.match_parens(new String[]{"((((()))))", "(()())"}));
        Assert.assertEquals("Yes", MATCH_PARENS.match_parens(new String[]{"()()()()", "((()))"}));
    }

    @Test(timeout = 5000)
    public void testMixedParentheses() {
        Assert.assertEquals("Yes", MATCH_PARENS.match_parens(new String[]{"()()(", "())()"}));
        Assert.assertEquals("No", MATCH_PARENS.match_parens(new String[]{"()()(", ")))()"}));
    }
}