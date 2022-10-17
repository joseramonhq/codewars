package codewars.kyu8.count_by_x;

import java.util.stream.IntStream;

public class Kata {

    public static int[] countBy(int x, int n) {
        return IntStream.rangeClosed(1, n)
                .map(y -> y * x)
                .toArray();
    }
}
