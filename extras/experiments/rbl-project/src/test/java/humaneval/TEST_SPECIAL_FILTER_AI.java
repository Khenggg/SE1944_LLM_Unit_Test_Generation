package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class TEST_SPECIAL_FILTER_AI {
    @Test
    public void testEmptyArray() {
        assertEquals(0, humaneval.correct.SPECIAL_FILTER.special_filter(new int[]{}));
    }

    @Test
    public void testNoNumbersGreaterThanTen() {
        assertEquals(0, humaneval.correct.SPECIAL_FILTER.special_filter(new int[]{5, 9, 10, -15, -33}));
    }

    @Test
    public void testSingleMatchingElement() {
        assertEquals(1, humaneval.correct.SPECIAL_FILTER.special_filter(new int[]{15}));
    }

    @Test
    public void testMultipleElementsSomeMatching() {
        // 15: matches (first 1, last 5 odd)
        // 33: matches (first 3, last 3 odd)
        // 14: no (last 4 even)
        // 25: no (first 2 even)
        assertEquals(2, humaneval.correct.SPECIAL_FILTER.special_filter(new int[]{15, 33, 14, 25, -15}));
    }

    @Test
    public void testLargeNumbers() {
        // 109: matches (first 1, last 9 odd)
        // 135: matches (first 1, last 5 odd)
        // 205: no (first 2 even)
        assertEquals(2, humaneval.correct.SPECIAL_FILTER.special_filter(new int[]{109, 135, 205}));
    }
}
