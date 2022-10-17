package codewars.kyu8.count_by_x;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KataTest {
    @Test
    public void fixedTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, Kata.countBy(1, 10));
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, Kata.countBy(2, 5));
        assertArrayEquals(new int[]{3, 6, 9, 12, 15, 18, 21}, Kata.countBy(3, 7));
        assertArrayEquals(new int[]{50, 100, 150, 200, 250}, Kata.countBy(50, 5));
        assertArrayEquals(new int[]{100, 200, 300, 400, 500, 600}, Kata.countBy(100, 6));
    }

    private static int[] sol(int x, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = x * (i + 1);
        }
        return arr;
    }

    @Test
    public void randomTests() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int a = r.nextInt(99) + 1;
            int b = r.nextInt(19) + 1;
            assertArrayEquals(sol(a, b), Kata.countBy(a, b));
        }
    }
}
