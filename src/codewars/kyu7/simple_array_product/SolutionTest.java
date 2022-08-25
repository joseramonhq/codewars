package codewars.kyu7.simple_array_product;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private static Random random = new Random();

    private static int ob2w(int[][] arr) {
        int p = 1, q = 1;
        for (int[] e : arr) {
            int x = Integer.MAX_VALUE, y = Integer.MIN_VALUE;
            for (int i : e) {
                if (i < x) x = i;
                if (i > y) y = i;
            }
            Integer[] temp = {p * x, q * x, p * y, q * y};
            p = Collections.min(Arrays.asList(temp));
            q = Collections.max(Arrays.asList(temp));
        }
        return Math.max(p, q);
    }

    private static int[][] rand_13() {
        int len = random(2, 6);
        int[][] arr = new int[len][];
        for (int i = 0; i < len; ++i) {
            int testLen = random(2, 6);
            int[] temp = new int[testLen];
            for (int j = 0; j < testLen; ++j) {
                temp[j] = random(-20, 20);
            }
            arr[i] = temp;
        }
        return arr;
    }

    private static int random(int l, int u) {
        return random.nextInt(u - l) + l;
    }

    @Test
    public void basicTests() {
        assertEquals(8, Solution.solve(new int[][]{{1, 2}, {3, 4}}));
        assertEquals(45, Solution.solve(new int[][]{{10, -15}, {-1, -3}}));
        assertEquals(12, Solution.solve(new int[][]{{-1, 2, -3, 4}, {1, -2, 3, -4}}));
        assertEquals(17600, Solution.solve(new int[][]{{-11, -6}, {-20, -20}, {18, -4}, {-20, 1}}));
        assertEquals(3584, Solution.solve(new int[][]{{14, 2}, {0, -16}, {-12, -16}}));
        assertEquals(12, Solution.solve(new int[][]{{-3, -4}, {1, 2, -3}}));
        assertEquals(-40, Solution.solve(new int[][]{{-2, -15, -12, -8, -16}, {-4, -15, -7}, {-10, -5}}));


    }

    @Test
    public void randomTests() {
        for (int i = 0; i < 100; i++) {
            int[][] arr = rand_13();
            int exp = ob2w(arr);
            assertEquals(exp, Solution.solve(arr));
            //assertArrayEquals(ob2w(arr),Solution.solve(arr));
        }
    }
}
