package codewars.kyu7.i_will_take_the_biggest_one_and_nothing_else;

import java.util.stream.LongStream;

class Kata {
    public static long maxIntChain(long n) {
        // your code here
        return LongStream.rangeClosed(2, n)
                .map(x -> ((n - x) != x && n > 4) ? x * (n - x) : -1)
                .max()
                .orElse(-1);
    }
}
