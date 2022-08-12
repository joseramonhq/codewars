package codewars.kyu7.pokerhand_straight_or_not;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PokerHandTest {
    ArrayList<Integer> hand;

    @BeforeEach
    public void beforeEach() {
        hand = new ArrayList<>();
    }

    @Test
    public void test1IsStraight() {

        hand.add(2);
        hand.add(3);
        hand.add(4);
        hand.add(5);
        hand.add(6);
        assertTrue(PokerHand.IsStraight(hand));
    }

    @Test
    public void test2IsStraight() {
        hand.add(14);
        hand.add(5);
        hand.add(4);
        hand.add(2);
        hand.add(3);
        assertTrue(PokerHand.IsStraight(hand));
    }

    @Test
    public void test3IsStraight() {
        hand.add(2);
        hand.add(3);
        assertFalse(PokerHand.IsStraight(hand));
    }

    @Test
    public void test4IsStraight() {
        hand.add(7);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(3);
        hand.add(4);
        hand.add(14);
        assertFalse(PokerHand.IsStraight(hand));
    }

    @Test
    public void test5IsStraight() {
        hand.add(2);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(3);
        hand.add(4);
        hand.add(14);
        assertFalse(PokerHand.IsStraight(hand));
    }

    @Test
    public void test6IsStraight() {
        hand.add(10);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(13);
        hand.add(4);
        hand.add(14);
        assertTrue(PokerHand.IsStraight(hand));
    }

    @Test
    public void test7IsStraight() {
        hand.add(10);
        hand.add(14);
        hand.add(14);
        hand.add(13);
        hand.add(12);
        hand.add(10);
        hand.add(11);
        assertTrue(PokerHand.IsStraight(hand));
    }

    @Test
    public void test8IsStraight() {
        hand.add(2);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(10);
        hand.add(13);
        hand.add(14);
        assertTrue(PokerHand.IsStraight(hand));
    }

    @Test
    public void test9IsStraight() {
        hand.add(3);
        hand.add(4);
        hand.add(5);
        hand.add(6);
        hand.add(8);
        hand.add(9);
        hand.add(10);
        assertFalse(PokerHand.IsStraight(hand));
    }

    @Test
    public void testIsStraightAllVariationsrRandomized() {
        for (int i = 1; i < 11; i++) {
            hand.add(i == 1 ? 14 : i);
            for (int j = i + 1; j < i + 5; j++) {
                hand.add(j);
            }
            hand.add(ThreadLocalRandom.current().nextInt(2, 15));
            hand.add(ThreadLocalRandom.current().nextInt(2, 15));
            Collections.shuffle(hand);
            assertTrue(PokerHand.IsStraight(hand));
        }
    }
}
