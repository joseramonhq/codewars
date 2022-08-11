package codewars.kyu7.move_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoveTenTest {

    @Test
    void sampleTests() {
        assertEquals("docdmkco", MoveTen.moveTen("testcase"));
        assertEquals("mynogkbc", MoveTen.moveTen("codewars"));
        assertEquals("ohkwzvodocdrobo", MoveTen.moveTen("exampletesthere"));
    }
}
