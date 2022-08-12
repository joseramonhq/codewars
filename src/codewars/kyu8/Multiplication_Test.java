package codewars.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTest {
    @Test
    public void test_Associativity_Of_Multiplication() {
        for (int i = 0; i < 100; i++) {
            Double a = Math.random();
            Double b = Math.random();
            Double c = Math.random();
            String message = String.format("(%g * %g) * %g == %g * (%g * %g)", a, b, c, a, b, c);
            assertEquals(
                    Multiply.multiply(c, Multiply.multiply(a, b)),
                    Multiply.multiply(a, Multiply.multiply(b, c)),
                    1E-14, message);
        }
    }
}
