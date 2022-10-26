package codewars.kyu8.object_oriented_piracy;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    @Test
    void oneHundredRandomSheeps() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 100; i++) {
            final double draft = rnd.nextDouble(50, 200);
            final int crew = rnd.nextInt(20, 120);
            final boolean expected = (draft - crew * 1.5) > 20;
            assertEquals(expected, new Ship(draft, crew).isWorthIt(),
                    String.format("<draft: %s, crew: %s>", draft, crew));
        }
    }

    @Test
    void emptyShip() {
        assertFalse(new Ship(0, 0).isWorthIt(), "<draft: 0, crew: 0>");
    }

    @Test
    void regularBoat() {
        assertFalse(new Ship(15, 20).isWorthIt(), "<draft: 15, crew: 20>");
    }

    @Test
    void bigBoat() {
        assertFalse(new Ship(35, 20).isWorthIt(), "<draft: 35, crew: 20>");
    }

    @Test
    void boatOnTheEdge() {
        assertFalse(new Ship(35, 10).isWorthIt(), "<draft: 35, crew: 10>");
    }

    @Test
    void containerTanker() {
        assertTrue(new Ship(60, 15).isWorthIt(), "<draft: 60, crew: 15>");
    }
}
