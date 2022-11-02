package codewars.kyu7.functions_of_integers_on_cartesian_plane;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncijTest {

    public static BigInteger solMin(int n) {
        BigInteger N = BigInteger.valueOf(n);
        BigInteger r = N.pow(3).multiply(BigInteger.valueOf(2)); // 2 * n ^ 3
        BigInteger a = N.pow(2).multiply(BigInteger.valueOf(3)); // 3 * n ^ 2
        return r.add(a).add(N).divide(BigInteger.valueOf(6));
    }

    public static BigInteger solMax(int n) {
        BigInteger N = BigInteger.valueOf(n);
        BigInteger r = N.pow(3).multiply(BigInteger.valueOf(4)); // 4 * n ^ 3
        BigInteger a = N.pow(2).multiply(BigInteger.valueOf(3)); // 3 * n ^ 2
        BigInteger b = N.multiply(BigInteger.valueOf(-1)); // - n
        return r.add(a).add(b).divide(BigInteger.valueOf(6));
    }

    public static BigInteger solSum(int n) {
        BigInteger N = BigInteger.valueOf(n);
        BigInteger r = N.pow(3); // n ^ 3
        BigInteger a = N.pow(2); // n ^ 2
        return r.add(a);
    }

    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(55), Funcij.sumin(5));
    }

    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(91), Funcij.sumin(6));
    }

    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(204), Funcij.sumin(8));
    }

    @Test
    public void test4() {
        assertEquals(BigInteger.valueOf(372), Funcij.sumax(8));
    }

    @Test
    public void test5() {
        assertEquals(BigInteger.valueOf(576), Funcij.sumsum(8));
    }

    @Test
    public void test6() {
        assertEquals(BigInteger.valueOf(16275715), Funcij.sumin(365));
    }

    @Test
    public void test6_a() {
        assertEquals(BigInteger.valueOf(32484635), Funcij.sumax(365));
    }

    @Test
    public void test7() {
        assertEquals(BigInteger.valueOf(389549900), Funcij.sumsum(730));
    }

    @Test
    public void test8() {
        assertEquals(BigInteger.valueOf(332833500), Funcij.sumin(999));
    }

    @Test
    public void test8_a() {
        assertEquals(BigInteger.valueOf(665167500), Funcij.sumax(999));
    }

    @Test
    public void test9() {
        assertEquals(BigInteger.valueOf(2668667000L), Funcij.sumin(2000));
    }

    @Test
    public void test10() {
        assertEquals(BigInteger.valueOf(21341334000L), Funcij.sumin(4000));
    }

    @Test
    public void test11() {
        assertEquals(BigInteger.valueOf(41679167500L), Funcij.sumin(5000));
    }

    @Test
    public void test11_a() {
        assertEquals(BigInteger.valueOf(125025000000L), Funcij.sumsum(5000));
    }

    @Test
    public void testA() {
        System.out.println("****** Random test ******");
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            int n = Math.round(rnd.nextInt(100) * (60 - 10) + 800);
            System.out.println("Numbers : " + n);
            assertEquals(FuncijTest.solMin(n), Funcij.sumin(n));
            n = Math.round(rnd.nextInt(103) * (60 - 10) + 807);
            System.out.println("Numbers : " + n);
            assertEquals(FuncijTest.solMax(n), Funcij.sumax(n));
            n = Math.round(rnd.nextInt(101) * (60 - 10) + 802);
            System.out.println("Numbers : " + n);
            assertEquals(FuncijTest.solSum(n), Funcij.sumsum(n));
        }
    }

}
