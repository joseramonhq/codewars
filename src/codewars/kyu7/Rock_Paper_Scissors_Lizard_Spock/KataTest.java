package codewars.kyu7.Rock_Paper_Scissors_Lizard_Spock;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {

    @Test
    void player1Wins() {
        assertEquals("Player 1 Won!", Kata.rpsls("rock", "lizard"));
        assertEquals("Player 1 Won!", Kata.rpsls("paper", "rock"));
        assertEquals("Player 1 Won!", Kata.rpsls("scissors", "lizard"));
        assertEquals("Player 1 Won!", Kata.rpsls("lizard", "paper"));
        assertEquals("Player 1 Won!", Kata.rpsls("spock", "rock"));
    }

    @Test
    void player2Wins() {
        assertEquals("Player 2 Won!", Kata.rpsls("lizard", "scissors"));
        assertEquals("Player 2 Won!", Kata.rpsls("spock", "lizard"));
        assertEquals("Player 2 Won!", Kata.rpsls("paper", "lizard"));
        assertEquals("Player 2 Won!", Kata.rpsls("scissors", "spock"));
        assertEquals("Player 2 Won!", Kata.rpsls("rock", "spock"));
    }

    @Test
    void draws() {
        assertEquals("Draw!", Kata.rpsls("rock", "rock"));
        assertEquals("Draw!", Kata.rpsls("spock", "spock"));
    }

    private static final Map<String, String> OUTCOME = Map.of(
            "scissors", "paper lizard",
            "paper", "rock spock",
            "rock", "lizard scissors",
            "lizard", "spock paper",
            "spock", "scissors rock"
    );

    private static String rsplsMeh(String a, String b) {
        int cmp = outcome(a, b) - outcome(b, a);
        return cmp == 0 ? "Draw!" : String.format("Player %d Won!", cmp > 0 ? 1 : 2);
    }

    private static int outcome(String a, String b) {
        return OUTCOME.get(a).contains(b) ? 1 : 0;
    }

    private static final String[] CNDS = {"scissors", "paper", "rock", "lizard", "spock"};
    private static final Random R = new Random();

    private static String choice() {
        return CNDS[R.nextInt(CNDS.length)];
    }

    @Test
    void randomTests() {
        for (int i = 0; i < 100; i++) {
            String a = choice(), b = choice(), exp = rsplsMeh(a, b);
            assertEquals(exp, Kata.rpsls(a, b));
        }
    }
}
