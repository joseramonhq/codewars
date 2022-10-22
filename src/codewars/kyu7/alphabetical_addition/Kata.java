package codewars.kyu7.alphabetical_addition;

import java.util.stream.Stream;

public class Kata {

    public static String addLetters(String... letters) {
        if (letters.length == 0) return "z";
        String abc = "abcdefghijklmnopqrstuvwxyz";
        return abc.charAt((Stream.of(letters)
                .mapToInt(x -> abc.indexOf(x) + 1)
                .sum() - 1) % 26) + "";
    }
}

