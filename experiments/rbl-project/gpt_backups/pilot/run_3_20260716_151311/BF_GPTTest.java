package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;

public class BF_GPTTest {

    @Test(timeout = 5000)
    public void testValidPlanetsBetweenJupiterAndNeptune() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Saturn", "Uranus"));
        Assert.assertEquals(expected, BF.bf("Jupiter", "Neptune"));
    }

    @Test(timeout = 5000)
    public void testValidPlanetsBetweenEarthAndMercury() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Venus"));
        Assert.assertEquals(expected, BF.bf("Earth", "Mercury"));
    }

    @Test(timeout = 5000)
    public void testValidPlanetsBetweenMercuryAndUranus() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"));
        Assert.assertEquals(expected, BF.bf("Mercury", "Uranus"));
    }

    @Test(timeout = 5000)
    public void testInvalidPlanet1() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("InvalidPlanet", "Earth"));
    }

    @Test(timeout = 5000)
    public void testInvalidPlanet2() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Earth", "InvalidPlanet"));
    }

    @Test(timeout = 5000)
    public void testBothInvalidPlanets() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("InvalidPlanet1", "InvalidPlanet2"));
    }

    @Test(timeout = 5000)
    public void testSamePlanetInput() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Earth", "Earth"));
    }

    @Test(timeout = 5000)
    public void testPlanetsInReverseOrder() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Saturn", "Uranus"));
        Assert.assertEquals(expected, BF.bf("Neptune", "Jupiter"));
    }

    @Test(timeout = 5000)
    public void testPlanetsWithSameIndex() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Mars", "Mars"));
    }

    @Test(timeout = 5000)
    public void testPlanetsWithAdjacentOrbits() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Earth", "Mars"));
    }

    @Test(timeout = 5000)
    public void testPlanetsWithAdjacentOrbitsReversed() {
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(expected, BF.bf("Mars", "Earth"));
    }
}