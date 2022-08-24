package codewars.kyu7.an_english_twist_on_a_japanese_classic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Shiritori {
    public static List<String> theGame(List<String> words) {
        List<String> words2 = new ArrayList<>(words);
        words2.add("");
        return words2.stream()
                .allMatch(x -> x.equals("")) ? new ArrayList<>() : words.subList(0, (int) IntStream.range(0, words2.size() - 2)
                .takeWhile(x -> !words2.get(x).equals("") && !words2.get(x + 1).equals("") && words2.get(x)
                        .endsWith(words2.get(x + 1)
                                .substring(0, 1)))
                .count() + 1);
    }
}
