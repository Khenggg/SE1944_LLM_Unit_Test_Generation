package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;

public class NUMERICAL_LETTER_GRADE_GPTTest {

    @Test(timeout = 5000)
    public void testAllGrades() {
        double[] grades = {4.0, 3.8, 3.4, 3.1, 2.8, 2.4, 2.1, 1.8, 1.4, 1.2, 0.8, 0.1, 0.0};
        String[] expected = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"};
        Assert.assertArrayEquals(expected, NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }

    @Test(timeout = 5000)
    public void testBoundaryValues() {
        double[] grades = {3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};
        String[] expected = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E"};
        Assert.assertArrayEquals(expected, NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }

    @Test(timeout = 5000)
    public void testSingleGrade() {
        double[] grades = {4.0};
        String[] expected = {"A+"};
        Assert.assertArrayEquals(expected, NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));

        grades = new double[]{0.0};
        expected = new String[]{"E"};
        Assert.assertArrayEquals(expected, NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }

    @Test(timeout = 5000)
    public void testEmptyArray() {
        double[] grades = {};
        String[] expected = {};
        Assert.assertArrayEquals(expected, NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }

    @Test(timeout = 5000)
    public void testNegativeGrades() {
        double[] grades = {-1.0, -0.5, -0.1};
        String[] expected = {"E", "E", "E"};
        Assert.assertArrayEquals(expected, NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }

    @Test(timeout = 5000)
    public void testGradesWithDecimals() {
        double[] grades = {3.75, 2.85, 1.65, 0.25};
        String[] expected = {"A", "B", "C", "D-"};
        Assert.assertArrayEquals(expected, NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }

    @Test(timeout = 5000)
    public void testGradesAtExactBoundaries() {
        double[] grades = {3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};
        String[] expected = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E"};
        Assert.assertArrayEquals(expected, NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }
}