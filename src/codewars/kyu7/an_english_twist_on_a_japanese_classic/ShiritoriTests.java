package codewars.kyu7.an_english_twist_on_a_japanese_classic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShiritoriTests {


    /**
     * The test1 function tests the Shiritori.theGame function by creating an ArrayList of Strings
     * and then calling the function with that list as a parameter. The expected result is an ArrayList
     * containing only those words in the original list that were not repeated in order to form a valid
     * shiritori game. This test checks for this behavior, and passes if it is found, or fails otherwise.
     *
     * @author joseramonhq@gmail.com
     */
    @Test
    public void test1() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat"));
        List<String> expected = new ArrayList<>(Arrays.asList("dog", "goose"
                , "elephant", "tiger", "rhino", "orc", "cat"));
        assertEquals(expected, Shiritori.theGame(words));

    }

    /**
     * The test2 function tests the Shiritori.theGame function by creating an ArrayList of Strings
     * and then calling the function with that list as a parameter. The expected result is an ArrayList
     * containing only &quot;dog&quot; and &quot;goose&quot;. This test checks to see if this is true, and if not, throws an error message.
     *
     * @author joseramonhq@gmail.com
     */
    @Test
    public void test2() {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("dog", "goose", "tiger", "cat", "elephant", "rhino", "orc"));
        List<String> expected = new ArrayList<>(Arrays.asList("dog", "goose"));
        assertEquals(expected, Shiritori.theGame(words));

    }

    /**
     * The test3 function tests the Shiritori.theGame function by creating an ArrayList of Strings
     * and then calling the function with that list as a parameter. The expected result is an ArrayList
     * containing only &quot;dog&quot;, &quot;goose&quot;, &quot;elephant&quot; and &quot;tiger&quot;. This test checks to see if this is true,
     * which it should be because those are all words in the original list that start with a vowel. If it's not,
     * then there's something wrong with your code!
     *
     * @author joseramonhq@gmail.com
     */


    @Test
    public void test3() {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("dog", "goose", "elephant", "tiger", "cat", "rhino", "rhino", "orc"));
        List<String> expected = new ArrayList<>(Arrays.asList("dog", "goose"
                , "elephant", "tiger"));
        assertEquals(expected, Shiritori.theGame(words));

    }

    @Test
    public void TestEmpty() {
        ArrayList<String> words = new ArrayList<>();
        assertEquals(new ArrayList<String>(), Shiritori.theGame(words));

    }

    /**
     * The TestEStrings function tests the Shiritori.theGame function by creating an ArrayList of Strings
     * and checking if the returned ArrayList is empty.
     *
     * @author joseramonhq@gmail.com
     */

    @Test
    public void TestEStrings() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("", "", "", "", "", "", ""));
        assertEquals(new ArrayList<String>(), Shiritori.theGame(words));
    }

    @Test
    public void TestMidEStrings() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("ab", "bc", "", "de", "", "", ""));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("ab", "bc"));
        assertEquals(expected, Shiritori.theGame(words));
    }

    /**
     * The RandomTests function tests the Shiritori.theGame function by creating a list of random words and checking if the
     * returned list is equal to what it should be. The RandomTests function runs 25 times, each time with a different set of
     * 10 random words as input. It then checks if the returned value is equal to what it should be, and prints out whether or not
     * they are equal in order for us to see how many times this test passed/failed. If all 25 tests pass, then we know that our
     * Shiritori class works correctly! This test will help us ensure that our code works
     *
     * @author joseramonhq@gmail.com
     */

    @Test
    public void RandomTests() {

        ArrayList<String> randomWords = new ArrayList<>(Arrays.asList("dog", "goose", "tiger", "cat", "elephant", "rhino", "orc",
                "leopard", "spanish", "english", "german", "japanese", "chinese",
                "taco", "burrito", "enchilada", "potato", "fries", "wings", "ramen",
                "spaghetti", "curry", "nutella", "apple", "yams", "tabasco", "ketchup", "mustard",
                "broccoli", "ice", "hamburger", "", "soup", "poutine", "olives", "spinach"));

        Random rand = new Random();
        for (int k = 0; k < 25; k++) {
            int length = randomWords.size() - 1;

            ArrayList<String> wordList = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                String randomS = randomWords.get(rand.nextInt(length));
                wordList.add(randomS);

            }
            List<String> expected = ShiritoriCheck.theGame(wordList);

            List<String> actual = Shiritori.theGame(wordList);
            assertEquals(expected, actual);
        }

    }

    public static class ShiritoriCheck {
        /**
         * The theGame function takes a list of strings and returns the longest string
         * that can be made from the other strings in the list.  If no such string exists,
         * it returns an empty arraylist.  The function assumes that all of the input strings are non-empty,
         * and that they all have at least one character.  It also assumes that there is at least one valid solution to this problem (i.e., if you were to remove every single character from each word in this game, then there would be no way to make a valid sentence).
         *
         * @param words Store the words that are input by the user
         * @return A list of strings
         * @author Trelent
         */
        public static List<String> theGame(ArrayList<String> words) {
            if (words.isEmpty() || words.get(0).equals("")) {
                return new ArrayList<>();
            }
            ArrayList<String> retList = new ArrayList<>();
            retList.add(words.get(0));
            for (int i = 0; i < words.size() - 1; i++) {
                if (words.get(i + 1).equals("")) {
                    return retList;
                }
                char end = ' ';
                char beg = ' ';
                if (!words.get(i).equals("") && !words.get(i + 1).equals("")) {
                    end = words.get(i).charAt(words.get(i).length() - 1);
                    beg = words.get(i + 1).charAt(0);
                }

                if (end == beg) {
                    retList.add(words.get(i + 1));
                } else {
                    return retList;
                }


            }
            return retList;
        }

    }
}
