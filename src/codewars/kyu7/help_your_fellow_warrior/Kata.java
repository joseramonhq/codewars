package codewars.kyu7.help_your_fellow_warrior;

public class Kata {
    public static String getHonorPath(int h, int t) {
        return h >= t ? "" : "2kyus: " + ((t - h) % 2) + ", 1kyus: " + (t - h) / 2;
    }
}

