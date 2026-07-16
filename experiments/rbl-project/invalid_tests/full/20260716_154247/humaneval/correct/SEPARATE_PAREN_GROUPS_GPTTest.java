package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class SEPARATE_PAREN_GROUPS_GPTTest {

    @Test(timeout = 5000)
    public void testEmptyString() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("");
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testNoParentheses() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("abc");
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testSinglePair() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("()");
        Assert.assertEquals(Arrays.asList("()"), result);
    }

    @Test(timeout = 5000)
    public void testNestedParentheses() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("(())");
        Assert.assertEquals(Arrays.asList("(())"), result);
    }

    @Test(timeout = 5000)
    public void testMultiplePairs() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("()()()");
        Assert.assertEquals(Arrays.asList("()", "()", "()"), result);
    }

    @Test(timeout = 5000)
    public void testMixedContent() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("a(b)c(d)e(f)g");
        Assert.assertEquals(Arrays.asList("(b)", "(d)", "(f)"), result);
    }

    @Test(timeout = 5000)
    public void testUnmatchedOpeningParenthesis() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("(()");
        Assert.assertEquals(Arrays.asList("()"), result);
    }

    @Test(timeout = 5000)
    public void testUnmatchedClosingParenthesis() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("())");
        Assert.assertEquals(Arrays.asList("()"), result);
    }

    @Test(timeout = 5000)
    public void testComplexNested() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("a(b(c)d)e(f(g)h)i");
        Assert.assertEquals(Arrays.asList("(b(c)d)", "(f(g))"), result);
    }

    @Test(timeout = 5000)
    public void testMultipleNested() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("((()))(())");
        Assert.assertEquals(Arrays.asList("((()))", "(())"), result);
    }

    @Test(timeout = 5000)
    public void testOnlyClosingParentheses() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups(")))");
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testOnlyOpeningParentheses() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("((((");
        Assert.assertTrue(result.isEmpty());
    }

    @Test(timeout = 5000)
    public void testLongStringWithMixedParentheses() {
        List<String> result = SEPARATE_PAREN_GROUPS.separate_paren_groups("a(b(c)d)e(f(g(h)))i(j(k)l)m");
        Assert.assertEquals(Arrays.asList("(b(c)d)", "(f(g(h)))", "(j(k))"), result);
    }
}