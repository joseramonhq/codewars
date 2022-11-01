package codewars.kyu6.validate_credit_card_number;

import java.util.stream.IntStream;

public class Validate {

    public static boolean validate(String str) {
        return IntStream.range(0, str.length())
                .map(x -> Integer.parseInt(str.charAt(x) + "") * (x % 2 == (str.length() + 1) % 2 ? 1 : 2))
                .map(num -> num > 9 ? num - 9 : num)
                .sum() % 10 == 0;
    }

}
