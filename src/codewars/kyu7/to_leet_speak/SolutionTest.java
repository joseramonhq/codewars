package codewars.kyu7.to_leet_speak;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("1337", Kata.toLeetSpeak("LEET"));
        assertEquals("(0D3W@R$", Kata.toLeetSpeak("CODEWARS"));
        assertEquals("#3110 W0R1D", Kata.toLeetSpeak("HELLO WORLD"));
        assertEquals("10R3M !P$UM D010R $!7 @M37", Kata.toLeetSpeak("LOREM IPSUM DOLOR SIT AMET"));
        assertEquals("7#3 QU!(K 8R0WN F0X JUMP$ 0V3R 7#3 1@2Y D06", Kata.toLeetSpeak("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
        assertEquals("10R3M !P$UM D010R $!7 @M37", Kata.toLeetSpeak("LOREM IPSUM DOLOR SIT AMET"));
        assertEquals("7#3 QU!(K 8R0WN F0X JUMP$ 0V3R 7#3 1@2Y D06", Kata.toLeetSpeak("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
    }

    @Test
    public void testRandom() {
        final Random r = new Random();
        for (int i = 0; i < 100; i++) {
            final int size = r.nextInt(100);
            final StringBuilder sb = new StringBuilder(size);
            for (int j = 0; j < size; j++) {
                sb.append((char) (48 + r.nextInt(47)));
            }
            final String in = sb.toString();
            assertEquals(toLeetSpeak(in), Kata.toLeetSpeak(in));
        }
    }

    private static String toLeetSpeak(final String speak) {
        final StringBuilder sb = new StringBuilder(speak.length());
        for (int i = 0; i < speak.length(); i++) {
            switch (speak.charAt(i)) {
                case 'A' -> sb.append('@');
                case 'B' -> sb.append('8');
                case 'C' -> sb.append('(');
                case 'E' -> sb.append('3');
                case 'G' -> sb.append('6');
                case 'H' -> sb.append('#');
                case 'I' -> sb.append('!');
                case 'L' -> sb.append('1');
                case 'O' -> sb.append('0');
                case 'S' -> sb.append('$');
                case 'T' -> sb.append('7');
                case 'Z' -> sb.append('2');
                default -> sb.append(speak.charAt(i));
            }
        }
        return sb.toString();
    }
}
