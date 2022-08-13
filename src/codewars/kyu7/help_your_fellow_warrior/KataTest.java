package codewars.kyu7.help_your_fellow_warrior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void basicTestOfHonor() {
        assertEquals("2kyus: 1, 1kyus: 4", Kata.getHonorPath(2, 11));
        assertEquals("2kyus: 0, 1kyus: 4", Kata.getHonorPath(2, 10));
        assertEquals("2kyus: 1, 1kyus: 0", Kata.getHonorPath(2, 3));
        assertEquals("", Kata.getHonorPath(11, 2));
        assertEquals("", Kata.getHonorPath(11, 11));

    }

    private static class KataReferenceImplementation {

        public static String getHonorPath(int honorScore, int targetHonorScore) {
            String honorPath = "";
            if (honorScore < targetHonorScore) {
                int score = targetHonorScore - honorScore;
                if (score % 2 == 0) {
                    honorPath = "2kyus: " + 0;
                } else {
                    honorPath = "2kyus: " + score % 2;
                }
                honorPath = honorPath + ", 1kyus: " + score / 2;
                return honorPath;
            }
            return honorPath;
        }

    }

    @Test
    public void randomTestOfHonor() {

        final int toRun = (int) Math.floor(Math.random() * 20 + 150);
        for (int i = 0; i < toRun; i++) {
            final int randHonor = (int) Math.ceil(Math.random() * 30);
            final int randTargetHonor = (int) Math.ceil(Math.random() * 30);
            assertEquals(KataReferenceImplementation.getHonorPath(randHonor, randTargetHonor), Kata.getHonorPath(randHonor, randTargetHonor));
        }
    }
}
