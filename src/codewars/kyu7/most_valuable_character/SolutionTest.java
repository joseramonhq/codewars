package codewars.kyu7.most_valuable_character;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private static Random random = new Random();

    private static char nh1(String s) {
        char ch = s.charAt(0);
        int m = 0;
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            int temp = s.lastIndexOf(chr) - s.indexOf(chr);
            if (temp > m) {
                m = temp;
                ch = chr;
            } else if (temp == m)
                ch = ch < chr ? ch : chr;
        }
        return ch;
    }

    private static int random(int l, int u) {
        return random.nextInt(u - l) + l;
    }

    @Test
    public void basicTests() {
        assertEquals('a', Solution.solve("a"));
        assertEquals('a', Solution.solve("aa"));
        assertEquals('b', Solution.solve("bcd"));
        assertEquals('x', Solution.solve("axyzxyz"));
        assertEquals('a', Solution.solve("dcbadcba"));
        assertEquals('c', Solution.solve("aabccc"));
        assertEquals('e', Solution.solve("efgefg"));
        assertEquals('e', Solution.solve("efghijefghi"));
        assertEquals('a', Solution.solve("acefacef"));
        assertEquals('a', Solution.solve("acefacefacef"));
    }

    @Test
    public void randomTests() {
        String alph = "abcdefghijklmnopqrstuvwxyzabc";
        for (int i = 0; i < 200; i++) {
            StringBuilder s = new StringBuilder();
            int len = random(100, 2500);
            for (int j = 0; j < len; ++j) {
                int a = random(0, 26);
                s.append(alph.charAt(a));
            }
            assertEquals(nh1(s.toString()), Solution.solve(s.toString()));
        }
    }
}
