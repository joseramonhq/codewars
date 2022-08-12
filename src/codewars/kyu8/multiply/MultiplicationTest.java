package codewars.kyu8.multiply;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MultiplicationTest {
    Double a;
    Double b;
    Double c;
    String message;

    @BeforeEach
    void beforeEach() {
        a = Math.random();
        b = Math.random();
        c = Math.random();
        message = String.format("(%g * %g) * %g == %g * (%g * %g)", a, b, c, a, b, c);
    }


    @Test
    public void test_Associativity_Of_Multiplication() {
        for (int i = 0; i < 100; i++) {
            Assertions.assertEquals(
                    Multiply.multiply(c, Multiply.multiply(a, b)),
                    Multiply.multiply(a, Multiply.multiply(b, c)),
                    1E-14, message);
        }
    }

    @Test
    public void test_Associativity_Of_MultiplicationFail() {
        for (int i = 0; i < 100; i++) {

            assertNotEquals(
                    -35.97347,
                    Multiply.multiply(a, Multiply.multiply(b, c)),
                    1E-14, message);
        }
    }
}
