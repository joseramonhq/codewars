package codewars.kyu5.primes_in_numbers;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PrimeDecomp {
    public static String factors(int n) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                map.put(i, (!map.containsKey(i)) ? 1 : map.get(i) + 1);
                n /= i--;
            }
        }
        return map.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Map.Entry::getKey))
                .map(x -> "(" + (x.getValue() < 2 ? x.getKey() : x.getKey() + "**" + x.getValue()) + ")")
                .collect(Collectors.joining());
    }
}



