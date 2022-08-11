package codewars.kyu7.move_10;

public class MoveTen {
    public static String moveTen(String s) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        return s.chars().map(x -> (((x - 97) + 10) % 26) + 97).collect(StringBuilder::new,
                        StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}