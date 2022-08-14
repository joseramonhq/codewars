package codewars.kyu7.shifter_words;

import java.util.stream.Stream;

public class Shifter {
    public static int count(String st) {
        return Math.toIntExact(Stream.of(st.split(" "))
                .filter(x -> x.matches("^([HINOSXZMW]+)$"))
                .distinct()
                .count());
    }
}
