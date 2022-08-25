package codewars.kyu7.math_pow;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTests {
    private static final BigInteger two = new BigInteger("2");
    private static final BigInteger no = new BigInteger("-1");

    @Test
    public void FixedTest1() {
        assertEquals(no, KidMath.pow(no, no));
    }

    @Test
    public void FixedTest2() {
        assertEquals(no, KidMath.pow(two, no));
    }

    @Test
    public void FixedTest3() {
        assertEquals(new BigInteger("4"), KidMath.pow(two, two));
    }

    @Test
    public void FixedTest4() {
        final BigInteger three = new BigInteger("3");
        assertEquals(new BigInteger("81"), KidMath.pow(three, three));
    }

    private static BigInteger random() {
        return new BigInteger((int) (Math.random() * 10) + "");
    }

    @Test
    public void RandomTests() {
        for (int i = 0; i < 100; i++) {
            BigInteger a = random(), b = random();
            assertEquals(pow(a, b), KidMath.pow(a, b));
        }
    }

    private static BigInteger pow(BigInteger a, BigInteger b) {
        return b.compareTo(BigInteger.ONE) < 0 ? new BigInteger("-1") : b.equals(BigInteger.ONE) ? a : pow(a.multiply(a), b.subtract(BigInteger.ONE));
    }
}
