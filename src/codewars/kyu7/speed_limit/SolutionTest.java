package codewars.kyu7.speed_limit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static int speedLimit(final int speed, final int[] signals) {
        int penalty = 0;

        for (int signal : signals) {
            if (speed > signal) {
                if (speed - signal >= 30) {
                    penalty += 500;
                } else if (speed - signal >= 20 && speed - signal < 30) {
                    penalty += 250;
                } else if (speed - signal >= 10 && speed - signal < 20) {
                    penalty += 100;
                }
            }
        }
        return penalty;
    }

    @Test
    void testSpeedLimit() {

        assertEquals(0, Kata.speedLimit(60, new int[]{80, 70, 60}));
        assertEquals(250, Kata.speedLimit(100, new int[]{110, 100, 80}));
        assertEquals(500, Kata.speedLimit(130, new int[]{140, 130, 100}));
        assertEquals(100, Kata.speedLimit(110, new int[]{120, 110, 100}));
        assertEquals(1500, Kata.speedLimit(220, new int[]{120, 110, 100}));
        assertEquals(850, Kata.speedLimit(100, new int[]{70, 80, 90, 100}));


    }

    @Test
    void emptyTest() {

        assertEquals(0, Kata.speedLimit(0, new int[]{15, 25, 35, 46,}));
        assertEquals(0, Kata.speedLimit(60, new int[]{}));
    }

    @Test
    void randomTestCases() {

        final int SPEED_LIMIT = 220;
        final int[] SIGNALS_LIMIT = new int[]{80, 90, 100, 110, 120};

        for (int i = 0; i < 100; i++) {
            int speed = randIntSpeed(SPEED_LIMIT);
            int[] signals = new int[new Random().nextInt(20)];

            int[] copysignals = new int[signals.length];
            for (int j = 0; j < signals.length; j++) {
                signals[j] = randIntSignals(SIGNALS_LIMIT);
                copysignals[j] = signals[j];
            }


            int result = SolutionTest.speedLimit(speed, signals);
            int actual = Kata.speedLimit(speed, copysignals);
            assertEquals(result, actual, "Testing for: " + speed + Arrays.toString(signals));
        }
    }

    private int randIntSpeed(int speedLimit) {//cualquier velocidad debajo del limite.
        return (new Random().nextInt(speedLimit));
    }

    private int randIntSignals(int[] signalsLimit) {//cualquier señal

        int random = new Random().nextInt(4);

        return signalsLimit[random];
    }

}
