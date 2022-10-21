package codewars.kyu8.count_by_x;

import java.util.stream.IntStream;

public class Kata {

    /**
     * The countBy function takes an integer x and a positive integer n,
     * and returns an array of integers where each element is equal to x times the index of that element.
     * For example, countBy(2, 5) returns [2, 4, 6, 8, 10].
     *
     * @param x Multiply the numbers in the range
     * @param n Specify the number of times to multiply x by n
     * @return An array of integers
     * @author joseramonhq@gmail.com
     */
    public static int[] countBy(int x, int n) {
        return IntStream.rangeClosed(1, n)
                .map(y -> y * x)
                .toArray();
    }
}
