package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class FIX_SPACES_GPTTest {

    @Test(timeout = 5000)
    public void testFixSpaces_EmptyString() {
        Assert.assertEquals("", FIX_SPACES.fix_spaces(""));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_NoSpaces() {
        Assert.assertEquals("Example", FIX_SPACES.fix_spaces("Example"));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_OneSpace() {
        Assert.assertEquals("Example_1", FIX_SPACES.fix_spaces("Example 1"));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_LeadingSpace() {
        Assert.assertEquals("_Example_2", FIX_SPACES.fix_spaces(" Example 2"));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_TrailingSpace() {
        Assert.assertEquals("Example_3_", FIX_SPACES.fix_spaces("Example 3 "));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_ConsecutiveSpaces() {
        Assert.assertEquals("_Example-3", FIX_SPACES.fix_spaces(" Example   3"));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_MultipleConsecutiveSpaces() {
        Assert.assertEquals("Hello-World", FIX_SPACES.fix_spaces("Hello    World"));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_OnlySpaces() {
        Assert.assertEquals("-", FIX_SPACES.fix_spaces("     "));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_MixedSpaces() {
        Assert.assertEquals("_Hello-World_", FIX_SPACES.fix_spaces(" Hello    World "));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_ThreeConsecutiveSpaces() {
        Assert.assertEquals("A-B", FIX_SPACES.fix_spaces("A   B"));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_SingleCharacter() {
        Assert.assertEquals("A", FIX_SPACES.fix_spaces("A"));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_SpacesAtStartAndEnd() {
        Assert.assertEquals("_A_B_", FIX_SPACES.fix_spaces(" A B "));
    }

    @Test(timeout = 5000)
    public void testFixSpaces_ComplexString() {
        Assert.assertEquals("_This-is-a-test-", FIX_SPACES.fix_spaces("  This  is   a test  "));
    }
}