package codewars.kyu7.driving_school_series_2;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;


class KataTest {

    @Test
    void basicTest() {
        assertEquals(30, Kata.cost(1), "For input 1");
        assertEquals(30, Kata.cost(45), "For input 45");
        assertEquals(30, Kata.cost(63), "For input 63");
        assertEquals(40, Kata.cost(84), "For input 84");
        assertEquals(50, Kata.cost(102), "For input 102");
        assertEquals(100, Kata.cost(273), "For input 273");
    }

    @Test
    void rendomTest() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            final int n = rand.nextInt(1000000) + 1;
            int answer = cost(n);
            assertEquals(answer, Kata.cost(n), "For input \"" + n + "\"");
        }

    }

    private static int cost(int mins) {
        return 30 + (mins > 65 ? (int) (Math.ceil((mins - 65) / 30.0)) : 0) * 10;
    }
}
