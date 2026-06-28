package humaneval.correct;

// Write a function that returns true if the given number is the multiplication of 3 prime numbers
// and false otherwise.
// Knowing that (a) is less then 100. 
// Example:
// is_multiply_prime(30) == True
// 30 = 2 * 3 * 5

public class IS_MULTIPLY_PRIME {
    public static boolean is_prime(int n) {
        for (int i = 2; i < n; i += 1) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean is_multiply_prime(int a) {
        if (a < 8) return false; // 2 * 2 * 2 = 8 is the smallest product of 3 primes
        for (int i = 2; i * i * i <= a; i += 1){
            if (! is_prime(i)) continue;
            for (int j = i; i * j * j <= a; j += 1) {
                if (! is_prime(j)) continue;
                int k = a / (i * j);
                if (a % (i * j) == 0 && is_prime(k) && k >= j) {
                    return true;
                }
            }
        }
        return false;
    }
}
