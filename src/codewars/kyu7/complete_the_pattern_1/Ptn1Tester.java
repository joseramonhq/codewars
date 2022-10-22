package codewars.kyu7.complete_the_pattern_1;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ptn1Tester {
    @Test
    void testFixedCases() {
        assertEquals(Pattern1.pattern(1), "1", "Pattern for n=1 doesn't match");
        assertEquals(Pattern1.pattern(2), "1\n22", "Pattern for n=2 doesn't match");
        assertEquals(Pattern1.pattern(5), "1\n22\n333\n4444\n55555", "Pattern for n=5 doesn't match");
        assertEquals(Pattern1.pattern(0), "", "Pattern for n=0 doesn't match");
        assertEquals(Pattern1.pattern(-25), "", "Pattern for n=-25 doesn't match");
    }

    @Test
    void testRandomCases() {
        // to prevent cheating, the implementation is stored in a lambda.
        IntToString sol = (n) -> {
            StringBuilder collector = new StringBuilder();
            if (n <= 0) return "";
            for (int i = 1; i <= n; i++) {
                collector.append(String.valueOf(i).repeat(Math.max(0, i)));
                if (i != n) collector.append("\n");
            }
            return collector.toString();
        };

        ThreadLocalRandom r = ThreadLocalRandom.current();
        for (int i = 0; i < 25; i++) {
            int n = r.nextInt(80);
            assertEquals(Pattern1.pattern(n), sol.ptn(n), String.format("Pattern for n=%d doesn't match", n));
        }
        for (int i = 0; i < 5; i++) {
            int n = r.nextInt(80);
            assertEquals(Pattern1.pattern(-n), "", String.format("Pattern for n=%d doesn't match", -n));
        }
    }

    interface IntToString {
        String ptn(int n);
    }

}
