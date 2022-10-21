package codewars.kyu8.VAPORCODE;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Random r = new Random();

    @Test
    void fixedTests() {
        assertEquals("L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S", Solution.vaporcode("Lets go to the movies"));
        assertEquals("W  H  Y  I  S  N  T  M  Y  C  O  D  E  W  O  R  K  I  N  G", Solution.vaporcode("Why isnt my code working"));
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 500; i++) {
            String s = randomString();
            String expected = String.join("  ", String.join("", s.toUpperCase().split(" ")).split(""));
            assertEquals(expected, Solution.vaporcode(s));
        }
    }

    private String randomString() {
        int length = r.nextInt(20) + 1;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) (r.nextInt(25) + 97);
            s.append(c);
        }
        return s.toString();
    }
}
