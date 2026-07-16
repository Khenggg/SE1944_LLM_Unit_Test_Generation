package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class FIX_SPACES_GPTTest {

    @Test(timeout = 5000)
    public void testSingleWord() {
        Assert.assertEquals("Example", FIX_SPACES.fix_spaces("Example"));
    }

    @Test(timeout = 5000)
    public void testSingleSpace() {
        Assert.assertEquals("Example_1", FIX_SPACES.fix_spaces("Example 1"));
    }

    @Test(timeout = 5000)
    public void testLeadingSpace() {
        Assert.assertEquals("_Example_2", FIX_SPACES.fix_spaces(" Example 2"));
    }

    @Test(timeout = 5000)
    public void testMultipleSpaces() {
        Assert.assertEquals("_Example-3", FIX_SPACES.fix_spaces(" Example   3"));
    }

    @Test(timeout = 5000)
    public void testMultipleSpacesOnly() {
        Assert.assertEquals("-", FIX_SPACES.fix_spaces("   "));
    }

    @Test(timeout = 5000)
    public void testTwoConsecutiveSpaces() {
        Assert.assertEquals("Hello__World", FIX_SPACES.fix_spaces("Hello  World"));
    }

    @Test(timeout = 5000)
    public void testThreeConsecutiveSpaces() {
        Assert.assertEquals("Hello-World", FIX_SPACES.fix_spaces("Hello   World"));
    }

    @Test(timeout = 5000)
    public void testLeadingAndTrailingSpaces() {
        Assert.assertEquals("__Hello-World__", FIX_SPACES.fix_spaces("  Hello   World  "));
    }

    @Test(timeout = 5000)
    public void testOnlySpaces() {
        Assert.assertEquals("-", FIX_SPACES.fix_spaces("     "));
    }

    @Test(timeout = 5000)
    public void testEmptyString() {
        Assert.assertEquals("", FIX_SPACES.fix_spaces(""));
    }

    @Test(timeout = 5000)
    public void testNoSpaces() {
        Assert.assertEquals("NoSpaces", FIX_SPACES.fix_spaces("NoSpaces"));
    }

    @Test(timeout = 5000)
    public void testSpacesAtEnd() {
        Assert.assertEquals("EndSpace_", FIX_SPACES.fix_spaces("EndSpace "));
    }

    @Test(timeout = 5000)
    public void testSpacesAtStartAndEnd() {
        Assert.assertEquals("_StartSpace_", FIX_SPACES.fix_spaces(" StartSpace "));
    }

    @Test(timeout = 5000)
    public void testMixedSpaces() {
        Assert.assertEquals("A_B-C", FIX_SPACES.fix_spaces("A  B   C"));
    }
}