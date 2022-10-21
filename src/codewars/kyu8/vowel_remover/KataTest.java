package codewars.kyu8.vowel_remover;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    Random r = new Random();

    @Test
    void test1() {
        assertEquals("hll", Kata.shortcut("hello"));
        assertEquals("hw r y tdy?", Kata.shortcut("how are you today?"));
        assertEquals("cmpln", Kata.shortcut("complain"));
        assertEquals("nvr", Kata.shortcut("never"));
    }

    private String randomStr() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789 ";
        StringBuilder s = new StringBuilder();
        int l = r.nextInt(30) + 1;
        for (int i = 0; i < l; i++) {
            s.append(chars.charAt(r.nextInt(chars.length() - 1)));
        }
        return s.toString();
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 500; i++) {
            String s = randomStr();
            assertEquals(shortcut(s), Kata.shortcut(s));
        }
    }

    private String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}
