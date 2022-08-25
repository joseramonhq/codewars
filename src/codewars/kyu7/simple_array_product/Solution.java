package codewars.kyu7.simple_array_product;

import com.google.common.collect.Sets;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {

    public static int solve(int[][] arr) {
        return Sets.cartesianProduct(Stream.of(arr)
                .map(t -> IntStream.of(t)
                        .boxed()
                        .collect(Collectors.toSet()))
                .toList())
                .stream()
                .map(x -> x.stream()
                        .reduce(1, (c, b) -> c * b))
                .max(Integer::compare)
                .orElse(0);
    }

}
