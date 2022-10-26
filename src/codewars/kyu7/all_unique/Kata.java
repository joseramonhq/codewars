package codewars.kyu7.all_unique;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {

    public static boolean hasUniqueChars(String str) {
        return str.equals(Stream.of(str.split(""))
                .distinct()
                .collect(Collectors.joining()));
    }
}
