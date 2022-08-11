package codewars.kyu7.visible_Dots_On_a_Die;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
