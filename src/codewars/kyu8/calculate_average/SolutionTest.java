package codewars.kyu8.calculate_average;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, Kata.find_average(new int[]{1, 1, 1}), DELTA);
        assertEquals(2, Kata.find_average(new int[]{1, 2, 3}), DELTA);
        assertEquals(2.5, Kata.find_average(new int[]{1, 2, 3, 4}), DELTA);

        System.out.println("Running 20 random tests...");

        for (int i = 0; i < 20; i++) {
            int[] arr = randArray();
            assertEquals(solution(arr), Kata.find_average(arr), DELTA);
        }
    }

    private static int[] randArray() {
        int size = (int) Math.floor(Math.random() * 5 + 2);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.floor(Math.random() * 20 + 1);
        }
        return arr;
    }

    private static double solution(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (sum + 0.0) / arr.length;
    }
}
