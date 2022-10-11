package codewars.kyu8.the_feast_of_many_beasts;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void fixedTest() {
        assertTrue(Kata.feast("great blue heron", "garlic nann"));
        assertTrue(Kata.feast("chickadee", "chocolate cake"));
        assertTrue(Kata.feast("marmot", "mulberry tart"));
        assertTrue(Kata.feast("porcupine", "pie"));
        assertTrue(Kata.feast("slow loris", "salsas"));
        assertTrue(Kata.feast("ox", "orange lox"));
        assertTrue(Kata.feast("blue-footed booby", "blueberry"));
        assertFalse(Kata.feast("cat", "yogurt"));
        assertFalse(Kata.feast("brown bear", "bear claw"));
        assertFalse(Kata.feast("electric eel", "lasagna"));
    }

    @Test
    public void randomTest() {
        Random r = new Random();
        StringBuilder beast;
        StringBuilder dish;
        for (int i = 0; i < 100; i++) {
            beast = new StringBuilder();
            dish = new StringBuilder();
            for (int j = 0; j < 10; j++) {
                beast.append((char) r.nextInt(122 + 1 - 97) + 97);
                dish.append((char) r.nextInt(122 + 1 - 97) + 97);
            }
            assertEquals(feast(beast.toString(), dish.toString()), Kata.feast(beast.toString(), dish.toString()));
        }

    }

    private static boolean feast(String beast, String dish) {

        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);

    }
}
