package codewars.kyu7.complete_the_pattern_1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pattern1 {
    public static String pattern(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(x -> (x + "").repeat(x))
                .collect(Collectors.joining("\n"));
    }
}

