package codewars.kyu7.most_valuable_character;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Solution {
    public static char solve(String s) {

        Integer[] sInts = IntStream.range(0, s.length())
                .map(x -> s.lastIndexOf(s.charAt(x)) - s.indexOf(s.charAt(x)))
                .boxed()
                .toArray(Integer[]::new);
        int maxInt = Collections.max(Arrays.asList(sInts));
        int[] finalIndex = IntStream.range(0, sInts.length)
                .filter(x -> sInts[x] == maxInt)
                .toArray();
        int[] ch = Arrays.stream(finalIndex)
                .map(s::charAt)
                .sorted()
                .toArray();

        return (char) ch[0];
    }
}

