package codewars.kyu7.see_You_Next_Happy_Year;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HappyYear {
    static public int nextHappyYear(int year) {
        return IntStream.rangeClosed(year + 1, 10000)
                .dropWhile(x -> Integer.parseInt(Stream.of((x + "").split(""))
                        .distinct()
                        .collect(Collectors.joining())) != x)
                .limit(1)
                .findFirst()
                .orElse(year);
    }
}