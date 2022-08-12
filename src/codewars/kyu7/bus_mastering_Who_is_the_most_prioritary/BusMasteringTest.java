package codewars.kyu7.bus_mastering_Who_is_the_most_prioritary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BusMasteringTest {
    @Test
    public void basicTests() {
        assertEquals("001000000", BusMastering.arbitrate("001000101", 9));
        assertEquals("000000100", BusMastering.arbitrate("000000101", 9));
        assertEquals("0000", BusMastering.arbitrate("0000", 4));
    }
}
