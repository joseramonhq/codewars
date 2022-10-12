package codewars.kyu7.FIXME_Hours_to_Seconds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTests {

    private void doTest(final int h) {
        assertEquals(CheckAnswer.hoursToSeconds(h), Dinglemouse.hoursToSeconds(h), "Sorry, try again :-(");
    }


    @Test
    public void test0() {
        doTest(0);
    }

    @Test
    public void test123() {
        doTest(1);
        doTest(2);
        doTest(3);
    }

    @Test
    public void test24() {
        doTest(24);
    }

    @Test
    public void testXXX() {
        doTest(Integer.MAX_VALUE / 3600);
    }

    @Test
    public void testYYY() {
        doTest(Integer.MAX_VALUE / 3600 + 1);
    }

    @Test
    public void testZZZ() {
        doTest(1000000);
    }

    @Test
    public void testRandom() {
        for (int r = 0; r < 500; r++) {
            final int h = (int) (Math.random() * 600000);
            doTest(h);
        }
    }

}

class CheckAnswer {
    public static long hoursToSeconds(final int hours) {
        return hours * 3600L;
    }
}
