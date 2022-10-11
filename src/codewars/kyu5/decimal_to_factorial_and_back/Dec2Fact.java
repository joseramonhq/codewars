package codewars.kyu5.decimal_to_factorial_and_back;

public class Dec2Fact {

    public static String dec2FactString(long nb) {
        StringBuilder res = new StringBuilder();
        StringBuilder retRes = new StringBuilder();
        int previous = 37;
        while (previous != 1) {
            previous--;
            long fact = findFact(previous);
            int coeff = (int) Math.floor(1.0 * nb / fact);
            if (coeff <= 0 && res.toString().equals("")) continue;
            res.append(coeff).append("x").append(previous).append("!+");
            if (coeff > 9) {
                char letter = (char) (coeff - 10 + 65);
                retRes.append(letter);
            } else retRes.append(coeff);
            nb -= coeff * fact;
        }
        return retRes + "0";
    }

    public static long factString2Dec(String str) {
        long sumRes = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            long currFact = findFact(str.length() - i - 1);
            sumRes += Character.getNumericValue(str.charAt(i)) * currFact;
        }
        return sumRes;
    }

    public static long findFact(long x) {
        long res = 1;
        for (int i = 1; i <= x; i++) {
            res *= i;
        }
        return res;
    }
}

