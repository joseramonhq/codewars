package codewars.kyu7.simple_fun_37_house_numbers_sum;

import java.util.stream.IntStream;

public class Kata {
    public static int houseNumbersSum(final int[] arr) {
        return IntStream.of(arr)
                .takeWhile(x -> x != 0)
                .sum();
    }
}

