package codewars.kyu7.triangles_from_dots;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangularNumbersTest {
    @Test
    public void numberOfDots() {
        assertEquals(BigInteger.valueOf(1L), TriangularNumbers.numberOfDots(BigInteger.valueOf(1L)));
        assertEquals(BigInteger.valueOf(3L), TriangularNumbers.numberOfDots(BigInteger.valueOf(2L)));
        assertEquals(BigInteger.valueOf(6L), TriangularNumbers.numberOfDots(BigInteger.valueOf(3L)));
        assertEquals(BigInteger.valueOf(10L), TriangularNumbers.numberOfDots(BigInteger.valueOf(4L)));
    }

    @Test
    public void random() {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            BigInteger n = new BigInteger(random.nextInt(10000), random);
            assertEquals(n.multiply(n.add(BigInteger.ONE)).divide(BigInteger.valueOf(2L)), TriangularNumbers.numberOfDots(n));
        }
    }
}
