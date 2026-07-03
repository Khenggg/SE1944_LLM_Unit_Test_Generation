package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class GET_MAX_TRIPLES_GPTTest {

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithMinimumInput() {
        Assert.assertEquals(0, GET_MAX_TRIPLES.get_max_triples(1));
    }

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithTwoElements() {
        Assert.assertEquals(0, GET_MAX_TRIPLES.get_max_triples(2));
    }

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithThreeElements() {
        Assert.assertEquals(1, GET_MAX_TRIPLES.get_max_triples(3));
    }

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithFourElements() {
        Assert.assertEquals(1, GET_MAX_TRIPLES.get_max_triples(4));
    }

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithFiveElements() {
        Assert.assertEquals(1, GET_MAX_TRIPLES.get_max_triples(5));
    }

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithSixElements() {
        Assert.assertEquals(4, GET_MAX_TRIPLES.get_max_triples(6));
    }

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithSevenElements() {
        Assert.assertEquals(6, GET_MAX_TRIPLES.get_max_triples(7));
    }

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithEightElements() {
        Assert.assertEquals(10, GET_MAX_TRIPLES.get_max_triples(8));
    }

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithNineElements() {
        Assert.assertEquals(20, GET_MAX_TRIPLES.get_max_triples(9));
    }

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithTenElements() {
        Assert.assertEquals(35, GET_MAX_TRIPLES.get_max_triples(10));
    }

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithLargeInput() {
        Assert.assertEquals(0, GET_MAX_TRIPLES.get_max_triples(0));
    }

    @Test(timeout = 5000)
    public void testGetMaxTriplesWithNegativeInput() {
        Assert.assertEquals(0, GET_MAX_TRIPLES.get_max_triples(-5));
    }
}