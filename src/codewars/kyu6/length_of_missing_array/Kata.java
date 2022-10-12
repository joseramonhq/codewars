package codewars.kyu6.length_of_missing_array;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {

        if (arrayOfArrays == null || arrayOfArrays.length == 0 ||
                Stream.of(arrayOfArrays).anyMatch(Objects::isNull) ||
                Stream.of(arrayOfArrays).anyMatch(x -> x.length == 0))
            return 0;

        Comparator<Object[]> comp = Comparator.comparingInt(a -> a.length);
        int begin = Collections.min(Stream.of(arrayOfArrays)
                .toList(), comp).length;
        int end = Collections.max(Stream.of(arrayOfArrays)
                .toList(), comp).length;

        return IntStream.rangeClosed(begin, end)
                .filter(y -> !Stream.of(arrayOfArrays)
                        .map(x -> x.length)
                        .toList()
                        .contains(y))
                .min()
                .orElse(0);
    }


}

