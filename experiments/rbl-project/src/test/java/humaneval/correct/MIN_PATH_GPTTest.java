package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class MIN_PATH_GPTTest {

    @Test(timeout = 5000)
    public void testMinPathBasicCase() {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 3;
        int[] expected = {1, 2, 1};
        Assert.assertArrayEquals(expected, MIN_PATH.min_path(grid, k));
    }

    @Test(timeout = 5000)
    public void testMinPathSingleCell() {
        int[][] grid = {{1}};
        int k = 1;
        int[] expected = {1};
        Assert.assertArrayEquals(expected, MIN_PATH.min_path(grid, k));
    }

    @Test(timeout = 5000)
    public void testMinPathWithLargerGrid() {
        int[][] grid = {{5, 9, 3}, {4, 1, 6}, {7, 8, 2}};
        int k = 1;
        int[] expected = {1};
        Assert.assertArrayEquals(expected, MIN_PATH.min_path(grid, k));
    }

    @Test(timeout = 5000)
    public void testMinPathWithDifferentK() {
        int[][] grid = {{1, 2}, {3, 4}};
        int k = 2;
        int[] expected = {1, 1};
        Assert.assertArrayEquals(expected, MIN_PATH.min_path(grid, k));
    }

    @Test(timeout = 5000)
    public void testMinPathEdgeCaseKEqualsGridSize() {
        int[][] grid = {{1, 2}, {3, 4}};
        int k = 4;
        int[] expected = {1, 1, 1, 1};
        Assert.assertArrayEquals(expected, MIN_PATH.min_path(grid, k));
    }

    @Test(timeout = 5000)
    public void testMinPathWithNoAdjacentOnes() {
        int[][] grid = {{2, 3}, {4, 1}};
        int k = 3;
        int[] expected = {1, 1, 1};
        Assert.assertArrayEquals(expected, MIN_PATH.min_path(grid, k));
    }

    @Test(timeout = 5000)
    public void testMinPathWithMaxK() {
        int[][] grid = {{1, 2}, {3, 4}};
        int k = 10; // Testing with a larger k than possible cells
        int[] expected = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // Assuming it repeats 1
        Assert.assertArrayEquals(expected, MIN_PATH.min_path(grid, k));
    }

    @Test(timeout = 5000)
    public void testMinPathWithMinimumGridSize() {
        int[][] grid = {{1, 2}, {3, 4}};
        int k = 1;
        int[] expected = {1};
        Assert.assertArrayEquals(expected, MIN_PATH.min_path(grid, k));
    }

    @Test(timeout = 5000)
    public void testMinPathWithAllOnes() {
        int[][] grid = {{1, 1}, {1, 1}};
        int k = 4;
        int[] expected = {1, 1, 1, 1};
        Assert.assertArrayEquals(expected, MIN_PATH.min_path(grid, k));
    }
}