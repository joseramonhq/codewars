package codewars.kyu7.find_the_nth_occurrence_of_a_word_in_a_string;

import java.util.stream.IntStream;

public class FindOcurrence {

    public static int findNthOccurrence(String subStr, String str, int occurrence) {

        int[] a = IntStream.range(0, str.length())
                .filter(i -> str.substring(i).startsWith(subStr))
                .toArray();
        return a.length < occurrence ? -1 : a[occurrence - 1];
    }
}

