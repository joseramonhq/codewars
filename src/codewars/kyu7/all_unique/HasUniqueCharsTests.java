package codewars.kyu7.all_unique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HasUniqueCharsTests {

    @Test
    public void testBasicExamples() {
        assertFalse(Kata.hasUniqueChars("  nAa"));
        assertTrue(Kata.hasUniqueChars("abcde"));
        assertFalse(Kata.hasUniqueChars("++-"));
        assertTrue(Kata.hasUniqueChars("AaBbc"));
    }

    @Test
    public void randomTests() {
        var rand = new java.util.Random();

        for (int j = 0; j < 40; j++) {
            int length = rand.nextInt(79) + 1;
            StringBuilder s = new StringBuilder();

            for (int i = 0; i < length; i++) {
                s.append((char) rand.nextInt(128));
            }

            assertEquals(hasUniqueCharsRef(s.toString()), Kata.hasUniqueChars(s.toString()));
        }
    }

    private static boolean hasUniqueCharsRef(String str) {
        return str.chars().distinct().count() == str.length();
    }
}
