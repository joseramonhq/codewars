package codewars.kyu7.functions_of_integers_on_cartesian_plane;

import java.math.BigInteger;

public class Funcij {

    public static BigInteger sumin(int n) {
        return BigInteger.valueOf(n * (n + 1L) / 2L * n - (n - 1L) * n * (n + 1L) / 6L);
    }

    public static BigInteger sumax(int n) {
        return BigInteger.valueOf(n * (n + 1L) / 2L * n + (n - 1L) * n * (n + 1L) / 6L);
    }

    public static BigInteger sumsum(int n) {
        return sumin(n).add(sumax(n));
    }
}

