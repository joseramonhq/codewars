package codewars.kyu7.decimal_descomposition;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DecimalDecomposition {

    public static String decimalDecomposition(int number) {
        String[] nums = new StringBuilder(number + "").reverse().toString().split("");
        String[] sb = new String[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            if (!nums[i].equals("0"))
                sb[sb.length - 1 - i] = String.valueOf((Integer.parseInt(nums[i]) * (int) Math.pow(10, i)));
        }
        return Stream.of(sb).filter(Objects::nonNull).collect(Collectors.joining("+"));
    }
}


