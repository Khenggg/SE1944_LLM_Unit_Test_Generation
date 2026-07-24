package humaneval.correct;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class EVEN_ODD_PALINDROME_GPTTest {

    @Test(timeout = 5000)
    public void testEvenOddPalindromeWithSmallInput() {
        ArrayList<Integer> result = EVEN_ODD_PALINDROME.even_odd_palindrome(3);
        Assert.assertEquals(1, (int) result.get(0)); // Even palindromes: 2
        Assert.assertEquals(2, (int) result.get(1)); // Odd palindromes: 1, 3
    }

    @Test(timeout = 5000)
    public void testEvenOddPalindromeWithMediumInput() {
        ArrayList<Integer> result = EVEN_ODD_PALINDROME.even_odd_palindrome(12);
        Assert.assertEquals(4, (int) result.get(0)); // Even palindromes: 2, 4, 6, 8
        Assert.assertEquals(6, (int) result.get(1)); // Odd palindromes: 1, 3, 5, 7, 9, 11
    }

    @Test(timeout = 5000)
    public void testEvenOddPalindromeWithSingleDigitInput() {
        ArrayList<Integer> result = EVEN_ODD_PALINDROME.even_odd_palindrome(9);
        Assert.assertEquals(4, (int) result.get(0)); // Even palindromes: 2, 4, 6, 8
        Assert.assertEquals(5, (int) result.get(1)); // Odd palindromes: 1, 3, 5, 7, 9
    }

    @Test(timeout = 5000)
    public void testEvenOddPalindromeWithEdgeCaseInput() {
        ArrayList<Integer> result = EVEN_ODD_PALINDROME.even_odd_palindrome(1);
        Assert.assertEquals(0, (int) result.get(0)); // Even palindromes: none
        Assert.assertEquals(1, (int) result.get(1)); // Odd palindromes: 1
    }

    @Test(timeout = 5000)
    public void testEvenOddPalindromeWithMaxInput() {
        ArrayList<Integer> result = EVEN_ODD_PALINDROME.even_odd_palindrome(1000);
        Assert.assertEquals(250, (int) result.get(0)); // Even palindromes: 2, 4, ..., 998
        Assert.assertEquals(500, (int) result.get(1)); // Odd palindromes: 1, 3, ..., 999
    }

    @Test(timeout = 5000)
    public void testEvenOddPalindromeWithZeroInput() {
        ArrayList<Integer> result = EVEN_ODD_PALINDROME.even_odd_palindrome(0);
        Assert.assertEquals(0, (int) result.get(0)); // Even palindromes: none
        Assert.assertEquals(0, (int) result.get(1)); // Odd palindromes: none
    }

    @Test(timeout = 5000)
    public void testEvenOddPalindromeWithNegativeInput() {
        ArrayList<Integer> result = EVEN_ODD_PALINDROME.even_odd_palindrome(-5);
        Assert.assertEquals(0, (int) result.get(0)); // Even palindromes: none
        Assert.assertEquals(0, (int) result.get(1)); // Odd palindromes: none
    }
}