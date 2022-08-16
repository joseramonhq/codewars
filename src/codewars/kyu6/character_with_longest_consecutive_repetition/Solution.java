package codewars.kyu6.character_with_longest_consecutive_repetition;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static Object[] longestRepetition(String s) {
        String str;
        return new Object[]{(str = IntStream.range(65, 91)
                .mapToObj(x -> Stream.of(s.replaceAll("[^" + Character.toString(x) + Character.toUpperCase(x) + "]+", "-")
                                .split("-"))
                        .max(Comparator.comparing(y -> y.length()))
                        .orElse(""))
                .max(Comparator.comparing(x -> x.length()))
                .orElse("")).equals("") ? "" : str.charAt(0) + "", Math.max(0, s.indexOf(str))};

       /* return new Object[]{str = Stream.of(s.replaceAll("[^Cc]", "-")
                        .split("-"))
                .max(Comparator.comparing(x -> x.length())).orElse(""), str.length()};
                */

    }
}

