package codewars.kyu7.find_the_nth_occurrence_of_a_word_in_a_string;

public class FindOcurrence {
    public static int findNthOccurrence(String subStr, String str, int occurrence) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith(subStr))
                counter++;
            if (counter == occurrence)
                return i;
        }
        return -1;
    }
}

