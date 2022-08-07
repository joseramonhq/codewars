package codewars.kyu7.visible_Dots_On_a_Die;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*Your task is to return the number of visible dots on a die after it has been rolled(that means the total count of dots that would not be touching the table when rolled)
6, 8, 10, 12, 20 sided dice are the possible inputs for "numOfSides"
topNum is equal to the number that is on top, or the number that was rolled.
for this exercise, all opposite faces add up to be 1 more than the total amount of sides Example: 6 sided die
would have 6 opposite 1, 4 opposite 3, and so on. for this exercise, the 10 sided die starts at 1 and ends on 10.
Note: topNum will never be greater than numOfSides*/

public class DiceDotCount {

    public int totalAmountVisible(int topNum, int numOfSides) {
        return IntStream.rangeClosed(1, numOfSides)
                .filter(x -> numOfSides + 1 - topNum != x)
                .sum();
    }
}

class SolutionTest {

    DiceDotCount ddc = new DiceDotCount();

    @Test
    public void testSomething() {
        assertEquals(17, ddc.totalAmountVisible(3, 6));
        assertEquals(30, ddc.totalAmountVisible(3, 8));
        assertEquals(66, ddc.totalAmountVisible(1, 12));
    }

    @Test
    public void testSomething1() {
        for (int i = 0; i < 93; i++) {
            List<Integer> numOfSidesList = Arrays.asList(6, 8, 10, 12, 20);
            long seed = System.nanoTime();
            Collections.shuffle(numOfSidesList, new Random(seed));
            int numOfSides = numOfSidesList.get(0);
            Random r = new Random();
            int topNum = r.nextInt((numOfSides - 1) + 1) + 1;
            assertEquals(ddc.totalAmountVisible(topNum, numOfSides), ((numOfSides - 2) / 2) * (numOfSides + 1) + topNum);
        }
    }
}