package codewars.kyu7.laxative_shot_roulette;

public class Kata {

    public static double getChance(int n, int x, int a) {
        double prod = 1;

        for (int i = 0; i < a; i++) {
            prod *= (double) (n - x - i) / (n - i);
        }
        return Math.round(prod * 100) / 100d;
    }
}
