package codewars.kyu7.summation_triangle_1;

public class TriangleSum {
    public static long getSum(long n) {
        return ++n * (n + 1) * (4 * n - 1) / 6;
    }
}

