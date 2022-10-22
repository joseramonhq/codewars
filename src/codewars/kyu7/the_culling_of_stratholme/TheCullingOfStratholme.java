package codewars.kyu7.the_culling_of_stratholme;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TheCullingOfStratholme {
    public static String purify(String s) {
        return Stream.of(s.split(" +"))
                .map(x -> x.replaceAll(".?[iI]+.?", ""))
                .filter(x -> !x.equals(""))
                .collect(Collectors.joining(" "));
    }
}
