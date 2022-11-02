package codewars.kyu7.driving_school_series_2;

public class Kata {
    public static int cost(int mins) {
        if (mins <= 65) return 30;
        mins = mins - 60;
        return 30 + ((mins % 30 <= 5) ? mins / 30 : (int) Math.ceil(mins / 30d)) * 10;
    }
}
