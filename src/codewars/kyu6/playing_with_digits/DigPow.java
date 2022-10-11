package codewars.kyu6.playing_with_digits;

public class DigPow {

    public static long digPow(int n, int p) {

        int sum = 0;
        for (int j = 0; j < (n + "").length(); p++, j++)
            sum += Math.pow(Integer.parseInt((n + "").charAt(j) + ""), p);
        return (sum % n == 0) ? sum / n : -1;


    }

}

