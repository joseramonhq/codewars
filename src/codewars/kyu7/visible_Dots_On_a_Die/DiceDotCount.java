package codewars.kyu7.visible_Dots_On_a_Die;

import java.util.stream.IntStream;

public class DiceDotCount {

    public int totalAmountVisible(int topNum, int numOfSides) {
        return IntStream.rangeClosed(1, numOfSides)
                .filter(x -> numOfSides + 1 - topNum != x)
                .sum();
    }
}

