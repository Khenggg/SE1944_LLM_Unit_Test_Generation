package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;

public class BF_GPTTest {

    @Test(timeout = 5000)
    public void testValidInput1() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Saturn", "Uranus"));
        Assert.assertEquals(expected, BF.bf("Jupiter", "Neptune"));
    }

    @Test(timeout = 5000)
    public void testValidInput2() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Venus"));
        Assert.assertEquals(expected, BF.bf("Earth", "Mercury"));
    }

    @Test(timeout = 5000)
    public void testValidInput3() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"));
        Assert.assertEquals(expected, BF.bf("Mercury", "Uranus"));
    }

    @Test(timeout = 5000)
    public void testSamePlanetInput() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Earth", "Earth"));
    }

    @Test(timeout = 5000)
    public void testInvalidPlanet1() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Pluto", "Neptune"));
    }

    @Test(timeout = 5000)
    public void testInvalidPlanet2() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Jupiter", "Pluto"));
    }

    @Test(timeout = 5000)
    public void testBothInvalidPlanets() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Pluto", "Xena"));
    }

    @Test(timeout = 5000)
    public void testReversedPlanets() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Earth", "Mars", "Jupiter", "Saturn"));
        Assert.assertEquals(expected, BF.bf("Mercury", "Uranus"));
    }

    @Test(timeout = 5000)
    public void testAdjacentPlanets() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Earth", "Mars"));
    }

    @Test(timeout = 5000)
    public void testEmptyInput() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("", ""));
    }

    @Test(timeout = 5000)
    public void testNullInput1() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf(null, "Neptune"));
    }

    @Test(timeout = 5000)
    public void testNullInput2() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Jupiter", null));
    }

    @Test(timeout = 5000)
    public void testNullInputBoth() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf(null, null));
    }
}