package codewars.kyu7.i_will_take_the_biggest_one_and_nothing_else;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void exampleTestCases() {
        assertEquals(8, Kata.maxIntChain(6), "Incorrect Result!");
        assertEquals(24, Kata.maxIntChain(10), "Incorrect Result");
        assertEquals(168, Kata.maxIntChain(26), "Incorrect Result");
        assertEquals(255, Kata.maxIntChain(32), "Incorrect Result");
        assertEquals(323, Kata.maxIntChain(36), "Incorrect Result");
        assertEquals(380, Kata.maxIntChain(39), "Incorrect Result");
    }

    @Test
    void primeIntegers() {
        assertEquals(6, Kata.maxIntChain(5), "Incorrect Result");
        assertEquals(12, Kata.maxIntChain(7), "Incorrect Result");
        assertEquals(30, Kata.maxIntChain(11), "Incorrect Result");
        assertEquals(42, Kata.maxIntChain(13), "Incorrect Result");
        assertEquals(72, Kata.maxIntChain(17), "Incorrect Result");
    }

    @Test
    void startingIntegersLessThan5() {
        assertEquals(-1, Kata.maxIntChain(1), "Incorrect Result");
        assertEquals(-1, Kata.maxIntChain(2), "Incorrect Result");
        assertEquals(-1, Kata.maxIntChain(3), "Incorrect Result");
        assertEquals(-1, Kata.maxIntChain(4), "Incorrect Result");
    }

}
