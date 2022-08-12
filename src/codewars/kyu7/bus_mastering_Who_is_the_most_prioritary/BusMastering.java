package codewars.kyu7.bus_mastering_Who_is_the_most_prioritary;

public class BusMastering {
    public static String arbitrate(String input, int n) {
        return input.contains("1") ? new StringBuilder("0".repeat(n)).replace(input.indexOf("1"), input.indexOf("1") + 1, "1")
                .toString() : input;
    }
}

