package codewars.kyu5.whats_a_perfect_power_anyway;

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        int i, j;

        for (i = 2; i <= Math.sqrt(n); i++) {
            for (j = 1; Math.pow(i, j) <= n; j++) {
                if (Math.pow(i, j) == n)
                    return new int[]{i, j};
            }
        }
        return null;
    }
}
