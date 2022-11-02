package codewars.kyu7.speed_limit;

import java.util.stream.IntStream;

public class Kata {
    public static int speedLimit(final int speed, final int[] signals) {
        return IntStream.of(signals)
                .map(x -> speed < x + 10 ? 0 : speed >= x + 30 ? 500 : speed >= x + 20 ? 250 : 100)
                .sum();
    }
}
