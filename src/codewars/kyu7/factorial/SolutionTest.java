package codewars.kyu7.factorial;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testSomething() {
        assertEquals(1L, Factorial.factorial(0));
        assertEquals(1L, Factorial.factorial(1));
        assertEquals(24L, Factorial.factorial(4));
        assertEquals(5040L, Factorial.factorial(7));
        assertEquals(355687428096000L, Factorial.factorial(17));
        assertEquals(2432902008176640000L, Factorial.factorial(20));
    }

    @Test
    void randomTest() {
        Random rng = new Random();
        for (int i = 0; i < 100; i++) {
            int n = rng.nextInt(21);
            long factorial = LongStream.rangeClosed(1, n)
                    .reduce(1, (long x, long y) -> x * y);
            assertEquals(factorial, Factorial.factorial(n));
        }
    }
}
