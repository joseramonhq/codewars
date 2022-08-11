package codewars.kyu7.move_10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveTen {
    public static String moveTen(String s) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        return Stream.of(s.split(""))
                .map(x -> letters.charAt((letters.indexOf(x) + 10) % 26) + "")
                .collect(Collectors.joining());
    }
}