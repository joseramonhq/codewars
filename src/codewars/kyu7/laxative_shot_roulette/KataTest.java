package codewars.kyu7.laxative_shot_roulette;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void testChances() {

        assertEquals(0.5, Kata.getChance(2, 1, 1), 0);
        assertEquals(0.25, Kata.getChance(4, 1, 3), 0);
        assertEquals(0.33, Kata.getChance(100, 10, 10), 0);
        assertEquals(0.04, Kata.getChance(1000, 150, 20), 0);
        assertEquals(0.29, Kata.getChance(25, 5, 5), 0);
        assertEquals(0.42, Kata.getChance(9, 3, 2), 0);
    }

    @Test
    public void lotsOfShots() {

        assertEquals(0.21, Kata.getChance(4000, 200, 30), 0);
        assertEquals(0.36, Kata.getChance(10000, 100, 100), 0);
        assertEquals(0.37, Kata.getChance(1000000, 5000, 200), 0);
        assertEquals(0.0, Kata.getChance(1000000, 5000, 20000), 0);
    }

    @Test
    public void randomTests() {
        int[] n_arr = new int[100];
        int[] x_arr = new int[100];
        int[] a_arr = new int[100];

        for (int z = 0; z < 100; z++) {
            n_arr[z] = 100 + (int) (Math.random() * 400);
            x_arr[z] = 50 + (int) (Math.random() * 40);
            a_arr[z] = 10 + (int) (Math.random() * 90);
        }

        for (int c = 0; c < 100; c++) {
            assertEquals(KataTest.testValuea1q34(n_arr[c], x_arr[c], a_arr[c]), Kata.getChance(n_arr[c], x_arr[c], a_arr[c]), 0);
        }
    }

    private static double testValuea1q34(int n, int x, int a) {

        double chance = 1;

        for (int i = 0; i < a; i++) {

            chance *= (double) (n - x - i) / (n - i);
        }
        chance = Math.round(chance * 100);
        chance = chance / 100;

        return chance;
    }


}
