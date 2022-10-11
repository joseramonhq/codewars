package codewars.kyu4.large_factorial;

import java.math.BigInteger;

public class Kata {

    public static String Factorial(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));
        return factorial.toString();
    }
}
