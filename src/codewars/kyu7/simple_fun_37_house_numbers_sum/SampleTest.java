package codewars.kyu7.simple_fun_37_house_numbers_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {
    @Test
    public void basicTests() {
        doTest(new int[]{5, 1, 2, 3, 0, 1, 5, 0, 2}, 11);
        doTest(new int[]{4, 2, 1, 6, 0}, 13);
        doTest(new int[]{4, 1, 2, 3, 0, 10, 2}, 10);
        doTest(new int[]{0, 1, 2, 3, 4, 5}, 0);
    }

    private void doTest(final int[] arr, int expected) {
        assertEquals(expected, Kata.houseNumbersSum(arr));
    }
}
