package codewars.kyu7.binary_addition;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @ParameterizedTest(name = "a = {1}, b = {2}")
    @CsvSource(value = """
                           10,    1,   1
                            1,    0,   1
                            1,    1,   0
                          100,    2,   2
                       111111,   51,  12
                         1110,    5,   9
                        10100,   10,  10
                     11001000,  100, 100
                1000000000001, 4096,   1
                1111111111111111111111111111111, 0, 2147483647
            """)
    @DisplayName("Basic tests")
    void basicTests(String expected, int a, int b) {
        assertEquals(expected, Kata.binaryAddition(a, b));
    }

    @Test
    @DisplayName("Random tests")
    void randomTests() {
        int top = Integer.MAX_VALUE / 2;
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < 40; i++) {
            int a = rand.nextInt(top), b = rand.nextInt(top);
            assertEquals(Integer.toBinaryString(a + b), Kata.binaryAddition(a, b), String.format("a = %d, b = %d", a, b));
        }
    }
}
