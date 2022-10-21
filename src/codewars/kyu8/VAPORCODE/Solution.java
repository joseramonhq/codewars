package codewars.kyu8.VAPORCODE;

public class Solution {
    public static String vaporcode(String s) {
        return String.join("  ", s.toUpperCase().replace(" ", "").split(""));
    }
}
