package codewars.kyu6.chasers_schedule;

import java.util.stream.LongStream;

public class Kata {
    public static int solution(int speed, int time) {
        return Math.toIntExact(LongStream.of(patternCalculator(patternsGenerator(time), speed)).max().orElse(0));
    }


    public static String[] patternsGenerator(int time) {
        return LongStream.rangeClosed(0, Long.parseLong("1".repeat(time), 2))
                .mapToObj(x -> String.format("%" + time + "s",
                                Long.toBinaryString(x))
                        .replaceAll(" ", "0"))
                .filter(x -> !x.contains("11"))
                .toArray(String[]::new);
    }

    public static long[] patternCalculator(String[] str, int speed) {

        long[] results = new long[str.length];
        long sum = 0;
        for (int j = 0; j < str.length; j++) {
            for (int i = 0; i < str[j].length(); i++)
                if (str[j].charAt(i) == '0')
                    sum += speed;
                else
                    sum += speed-- * 2L;

            results[j] = sum;
            sum = 0;
        }
        return results;
    }
}