package codewars.kyu6.hidden_cubic_numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Cubes {

    public String isSumOfCubes(String s) {
        List<String> list = new ArrayList<>();
        String[] num = s.replaceAll("^.*?(\\d)", "$1")
                .replaceAll("[^0-9]+", " ")
                .split(" "), a;

        for (String str : num) {
            a = str.split("(?<=\\G.{3}?)");
            for (String str2 : a)
                if (isCubic(str2))
                    list.add(str2);
        }
        if (list.size() > 0)
            return String.join(" ", list) + " " + list.stream()
                    .mapToInt(Integer::parseInt)
                    .sum() + " Lucky";
        return "Unlucky";

    }

    public static boolean isCubic(String nume) {
        return Stream.of(nume.split(""))
                .mapToInt(Integer::parseInt)
                .map(x -> x * x * x)
                .sum() == Integer.parseInt(nume);

    }
}

