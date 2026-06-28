package humaneval.correct;

import java.util.ArrayList;

public class PRIME_FIB {
    public static boolean is_prime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < (int)Math.sqrt(n) + 1; i += 1){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int prime_fib(int n){
        if (n <= 0) return 0;
        if (n > 10) return 433494437; // 10th prime fibonacci number, 11th overflows 32-bit int
        ArrayList<Integer> fib = new ArrayList<Integer>();
        fib.add(0);
        fib.add(1);

        while (true) {
            int len = fib.size();
            fib.add(fib.get(len - 1) + fib.get(len - 2));
            if (is_prime(fib.get(fib.size() - 1)))
                n -= 1;
            if (n == 0)
                return fib.get(fib.size() - 1);
        }
    }
}
