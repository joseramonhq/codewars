package codewars.kyu8.vowel_remover;

public class Kata {
    /**
     * The shortcut function takes a string and removes all vowels from it.
     *
     * @param input Store the user's input
     * @return The input string with all vowels removed
     * @author Trelent
     */
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}

