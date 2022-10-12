package codewars.kyu6.What_century_is_it;

public class Solution {
    public static String whatCentury(int year) {
        int century = Integer.parseInt(String.valueOf(year).substring(0, 2)) + (year % 100 == 0 ? 0 : 1);

        return century + switch (century) {
            case 11, 12, 13 -> "th";
            default -> switch (century % 10) {
                case 1 -> "st";
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
            };
        };
    }
}


