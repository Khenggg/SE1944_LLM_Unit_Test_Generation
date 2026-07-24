package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class REMOVE_DUPLICATES_GPTTest {

    @Test(timeout = 5000)
    public void testRemoveDuplicatesWithNoDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertEquals(expected, REMOVE_DUPLICATES.remove_duplicates(input));
    }

    @Test(timeout = 5000)
    public void testRemoveDuplicatesWithAllDuplicates() {
        List<Integer> input = Arrays.asList(1, 1, 1, 1);
        List<Integer> expected = Arrays.asList();
        Assert.assertEquals(expected, REMOVE_DUPLICATES.remove_duplicates(input));
    }

    @Test(timeout = 5000)
    public void testRemoveDuplicatesWithSomeDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> expected = Arrays.asList(1, 3, 5);
        Assert.assertEquals(expected, REMOVE_DUPLICATES.remove_duplicates(input));
    }

    @Test(timeout = 5000)
    public void testRemoveDuplicatesWithEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        Assert.assertEquals(expected, REMOVE_DUPLICATES.remove_duplicates(input));
    }

    @Test(timeout = 5000)
    public void testRemoveDuplicatesWithSingleElement() {
        List<Integer> input = Arrays.asList(1);
        List<Integer> expected = Arrays.asList(1);
        Assert.assertEquals(expected, REMOVE_DUPLICATES.remove_duplicates(input));
    }

    @Test(timeout = 5000)
    public void testRemoveDuplicatesWithNegativeNumbers() {
        List<Integer> input = Arrays.asList(-1, -2, -2, -3, -4, -4, -5);
        List<Integer> expected = Arrays.asList(-1, -3, -5);
        Assert.assertEquals(expected, REMOVE_DUPLICATES.remove_duplicates(input));
    }

    @Test(timeout = 5000)
    public void testRemoveDuplicatesWithMixedNumbers() {
        List<Integer> input = Arrays.asList(1, -1, 2, -1, 3, 3);
        List<Integer> expected = Arrays.asList(1, 2);
        Assert.assertEquals(expected, REMOVE_DUPLICATES.remove_duplicates(input));
    }

    @Test(timeout = 5000)
    public void testRemoveDuplicatesWithLargeInput() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList();
        Assert.assertEquals(expected, REMOVE_DUPLICATES.remove_duplicates(input));
    }

    @Test(timeout = 5000)
    public void testRemoveDuplicatesWithLargeUniqueInput() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Assert.assertEquals(expected, REMOVE_DUPLICATES.remove_duplicates(input));
    }
}