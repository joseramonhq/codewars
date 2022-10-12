package codewars.kyu6.What_century_is_it;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    public static String whatCentury(int year) {
        Map<Integer, String> post = new HashMap<>();
        post.put(0, "th");
        post.put(1, "st");
        post.put(2, "nd");
        post.put(3, "rd");
        int n = ((year + 99) / 100);
        if ((n % 10 >= 1) && (n % 10 <= 3) && ((n < 10) || (n > 20))) {
            return n + post.get(n % 10);
        }
        return n + post.get(0);
    }

    @Test
    public void testSomething() {
        assertEquals("20th", Solution.whatCentury(1999));
        assertEquals("21st", Solution.whatCentury(2011));
        assertEquals("22nd", Solution.whatCentury(2154));
        assertEquals("23rd", Solution.whatCentury(2259));
        assertEquals("12th", Solution.whatCentury(1124));
        assertEquals("20th", Solution.whatCentury(2000));
    }

    @Test
    public void testSomeRandomValues() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int casual = rand.nextInt(9000) + 1000;
            System.out.println(casual + "\t" + SolutionTest.whatCentury(casual) + "\t" + Solution.whatCentury(casual));
            assertEquals(SolutionTest.whatCentury(casual), Solution.whatCentury(casual));
        }
    }
}
