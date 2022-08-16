package codewars.kyu7.find_the_nth_occurrence_of_a_word_in_a_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {
    @Test
    void sample() {
        String string = "This is an example. Return the nth occurrence of example in this example string.";
        assertEquals(11, FindOcurrence.findNthOccurrence("example", string, 1));
        assertEquals(49, FindOcurrence.findNthOccurrence("example", string, 2));
        assertEquals(65, FindOcurrence.findNthOccurrence("example", string, 3));
        assertEquals(-1, FindOcurrence.findNthOccurrence("example", string, 4));
    }
}
