package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;

public class BF_GPTTest {

    @Test
    public void testValidInput1() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Saturn", "Uranus"));
        Assert.assertEquals(expected, BF.bf("Jupiter", "Neptune"));
    }

    @Test
    public void testValidInput2() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Venus"));
        Assert.assertEquals(expected, BF.bf("Earth", "Mercury"));
    }

    @Test
    public void testValidInput3() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"));
        Assert.assertEquals(expected, BF.bf("Mercury", "Uranus"));
    }

    @Test
    public void testSamePlanetInput() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Earth", "Earth"));
    }

    @Test
    public void testInvalidPlanet1() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Pluto", "Neptune"));
    }

    @Test
    public void testInvalidPlanet2() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Jupiter", "Pluto"));
    }

    @Test
    public void testBothInvalidPlanets() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Pluto", "Xena"));
    }

    @org.junit.Ignore("Generated test failed on correct code")
    @Test
    public void testReversedPlanets() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Earth", "Mars", "Jupiter", "Saturn"));
        Assert.assertEquals(expected, BF.bf("Uranus", "Mercury"));
    }

    @Test
    public void testAdjacentPlanets() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Venus", "Earth"));
    }

    @Test
    public void testEmptyInput() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("", ""));
    }

    @Test
    public void testNullInput() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf(null, null));
    }

    @Test
    public void testNullAndValidInput() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf(null, "Earth"));
    }

    @Test
    public void testValidAndNullInput() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Earth", null));
    }
}