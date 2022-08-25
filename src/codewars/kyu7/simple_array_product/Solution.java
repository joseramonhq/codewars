package codewars.kyu7.simple_array_product;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {

    public static int solve(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int index = arr.length - 1;
        int[] mutantIndex = new int[arr.length];
        int combinations = Stream.of(arr)
                .mapToInt(x -> x.length)
                .reduce(1, (a, b) -> a * b);

        for (int i = 0; i < combinations; i++) {
            int prod = IntStream.range(0, arr.length)
                    .map(x -> arr[x][mutantIndex[x]])
                    .reduce(1, (a, b) -> a * b);
            if (prod > max) max = prod;
            handler(mutantIndex, index, arr);
        }
        return max;

    }

    public static void handler(int[] counter, int index, int[][] arr) {
        counter[index]++;
        if (counter[index] >= arr[index].length) {
            counter[index] = 0;
            index--;
            if (index >= 0) {
                handler(counter, index, arr);
            }
        }
    }

    /*public static int solve(int[][] arr) {
        String[] combinations = IntStream.rangeClosed(0, (int) Math.pow(2, arr.length))
                .mapToObj(x -> String.format("%0" + arr.length + "d", Integer.parseInt(Integer.toBinaryString(x))))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(combinations));
        int max = 1;
        int prod = 1;
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < combinations.length; i++) {
            prod = 1;
            for (int j = 0; j < arr.length; j++) {
                System.out.println();
                prod *= Integer.parseInt(String.valueOf(arr[j][Integer.parseInt(combinations[i].charAt(j) + "")]));
            }
            results.add(prod);
        }
        return Collections.max(results);

    }*/
}
