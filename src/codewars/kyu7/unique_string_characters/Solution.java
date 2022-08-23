package codewars.kyu7.unique_string_characters;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public static String solve(String a, String b) {
        return Stream.concat(Stream.of(a.split("")), Stream.of(b.split("")))
                .filter(x -> a.contains(x) ^ b.contains(x))
                .collect(Collectors.joining());
    }
}
