package codewars.kyu8.calculate_average;

import java.util.stream.IntStream;

public class Kata {
    public static double find_average(int[] array) {
        return IntStream.of(array)
                .average()
                .orElse(0);
    }
}
