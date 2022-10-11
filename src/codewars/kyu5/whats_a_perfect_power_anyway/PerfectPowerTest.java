package codewars.kyu5.whats_a_perfect_power_anyway;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static java.lang.Math.*;
import static org.junit.jupiter.api.Assertions.*;


public class PerfectPowerTest {

    @Test
    public void test0() {
        assertNull(PerfectPower.isPerfectPower(0), "0 is not a perfect number");
    }
    

    @Test
    public void test1() {
        assertNull(PerfectPower.isPerfectPower(1), "1 is not a perfect number");

    }

    @Test
    public void test2() {
        assertNull(PerfectPower.isPerfectPower(2), "2 is not a perfect number");

    }

    @Test
    public void test3() {
        assertNull(PerfectPower.isPerfectPower(3), "3 is not a perfect number");

    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{2, 2}, PerfectPower.isPerfectPower(4), "4 = 2^2");
    }

    @Test
    public void test5() {
        assertNull(PerfectPower.isPerfectPower(5), "5 is not a perfect power");
    }

    @Test
    public void test8() {
        assertArrayEquals(new int[]{2, 3}, PerfectPower.isPerfectPower(8), "8 = 2^3");
    }

    @Test
    public void test9() {
        assertArrayEquals(new int[]{3, 2}, PerfectPower.isPerfectPower(9), "9 = 3^2");
    }

    @Test
    public void testUpTo500() {
        int[] pp = {4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484};
        for (int i : pp) assertNotNull(PerfectPower.isPerfectPower(i), i + " is a perfect power");
    }

    @Test
    public void testRandomPerfectPowers() {
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            int m = rnd.nextInt(254) + 2;
            int k = (int) (rnd.nextDouble() * (log(Integer.MAX_VALUE) / log(m) - 2.0) + 2.0);
            int l = ipow(m, k);
            int[] r = PerfectPower.isPerfectPower(l);
            assertNotNull(r, l + " is a perfect power");
            assertEquals(l, ipow(r[0], r[1]), r[0] + "^" + r[1] + "!=" + l);
        }
    }

    @Test
    public void testRandomNumbers() {
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            int l = rnd.nextInt(Integer.MAX_VALUE);
            int[] r = PerfectPower.isPerfectPower(l);
            if (r != null) assertEquals(l, ipow(r[0], r[1]), r[0] + "^" + r[1] + "!=" + l);
        }
    }

    @Test
    public void testRandomNumbersExact() {
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            int l = rnd.nextInt(1000000);
            int[] s = solution(l);
            int[] r = PerfectPower.isPerfectPower(l);
            if (s == null) {
                assertNull(r, l + " is not a perfect power");
            } else {
                assertNotNull(r, l + " is a perfect power");
                assertEquals(l, ipow(r[0], r[1]), r[0] + "^" + r[1] + "!=" + l);
            }
        }
    }

    private static int[] solution(int n) {
        for (int i = 2; ; i++) {
            int r = root(n, i);
            if (r < 2) return null;
            if (ipow(r, i) == n) return new int[]{r, i};
        }
    }

    private static int root(int n, int r) {
        return (int) round(pow(n, 1.0 / r));
    }

    private static int ipow(int b, int e) {
        int p = 1;
        for (; e > 0; e >>= 1) {
            if ((e & 1) == 1) p *= b;
            b *= b;
        }
        return p;
    }

}
