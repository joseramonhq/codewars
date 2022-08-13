package codewars.kyu7.parallel_resistors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResistanceTest {

    @Test
    public void resistanceTest1() {

        assertEquals(10.0, ParallelResistors.resistance(20, 20), 1e-10);
    }

    @Test
    public void resistanceTest2() {

        assertEquals(8.0, ParallelResistors.resistance(20, 20, 40), 1e-10);
    }

    @Test
    public void radomTest() {
        for (int i = 0; i < 10; i++) {
            int r1 = (int) (Math.random() * 10);
            int r2 = (int) (Math.random() * 100);
            int r3 = (int) (Math.random() * 1000);
            assertEquals(sol(r1, r2, r3), ParallelResistors.resistance(r1, r2, r3), 1e-10);
        }
    }

    private double sol(int... resistors) {
        double sum = 0.0;

        for (int i : resistors) {
            sum += (double) 1 / i;
        }

        return 1 / sum;
    }
}
