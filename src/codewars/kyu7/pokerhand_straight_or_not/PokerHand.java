package codewars.kyu7.pokerhand_straight_or_not;

import java.util.ArrayList;

public class PokerHand {
    public static boolean IsStraight(ArrayList<Integer> cards) {
        int counter = 0;

        for (int i = 1; i <= 14; i++) {
            if (cards.contains(i) || i == 1 && cards.contains(14)) {
                counter++;
                if (counter == 5) return true;
            } else {
                counter = 0;
            }
        }
        return false;
    }
}
