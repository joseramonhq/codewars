package codewars.kyu5.decimal_to_factorial_and_back;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dec2FactTest {

    Random randomGenerator = new Random();

    @Test
    public void test1() {
        int r = randomGenerator.nextInt(3);
        if (r == 0) {
            assertEquals("A0000000000", Dec2Fact.dec2FactString(36288000));
        }
    }

    @Test
    public void test2() {
        int r = randomGenerator.nextInt(2);
        if (r == 1) {
            assertEquals(36288000, Dec2Fact.factString2Dec("A0000000000"));
        }
    }

    @Test
    public void test3() {
        int r = randomGenerator.nextInt(2);
        if (r == 0) {
            assertEquals("4042100", Dec2Fact.dec2FactString(2990));
        }
    }

    @Test
    public void test4() {
        int r = randomGenerator.nextInt(2);
        if (r == 0) {
            assertEquals(2990, Dec2Fact.factString2Dec("4042100"));
        }
    }

    @Test
    public void test5() {
        int r = randomGenerator.nextInt(2);
        if (r == 0) {
            assertEquals("341010", Dec2Fact.dec2FactString(463));
        }
    }

    @Test
    public void test6() {
        int r = randomGenerator.nextInt(2);
        if (r == 1) {
            assertEquals(463, Dec2Fact.factString2Dec("341010"));
        }
    }

    @Test
    public void test7() {
        assertEquals("14F9122694751231010", Dec2Fact.dec2FactString(8150835199999999L));
    }

    @Test
    public void test8() {
        int r = randomGenerator.nextInt(2);
        if (r == 1) {
            assertEquals(8150835199999999L, Dec2Fact.factString2Dec("14F9122694751231010"));
        }
    }

    @Test
    public void test9() {
        assertEquals("2DCAA5842344512200", Dec2Fact.dec2FactString(1000000000000000L));
    }

    @Test
    public void test10() {
        int r = randomGenerator.nextInt(2);
        if (r == 1) {
            assertEquals(1000000000000000L, Dec2Fact.factString2Dec("2DCAA5842344512200"));
        }
    }

    @Test
    public void test11() {
        assertEquals("1212210", Dec2Fact.dec2FactString(1001L));
    }

    @Test
    public void test12() {
        int r = randomGenerator.nextInt(2);
        if (r == 1) {
            assertEquals(1001L, Dec2Fact.factString2Dec("1212210"));
        }
    }

    @Test
    public void test13() {
        assertEquals("26A2116333000", Dec2Fact.dec2FactString(1234567890L));
    }

    @Test
    public void test14() {
        int r = randomGenerator.nextInt(2);
        if (r == 1) {
            assertEquals(1234567890L, Dec2Fact.factString2Dec("26A2116333000"));
        }
    }

    @Test
    public void test15() {
        assertEquals(9876543210L, Dec2Fact.factString2Dec("17747074033000"));
    }

    @Test
    public void test16() {
        int r = randomGenerator.nextInt(2);
        if (r == 1) {
            assertEquals("17747074033000", Dec2Fact.dec2FactString(9876543210L));
        }
    }

    @Test
    public void test17() {
        assertEquals("13110", Dec2Fact.dec2FactString(45L));
    }

    @Test
    public void test18() {
        int r = randomGenerator.nextInt(4);
        if (r == 0) {
            assertEquals(45L, Dec2Fact.factString2Dec("13110"));
        }
    }

    @Test
    public void test19() {
        assertEquals(992L, Dec2Fact.factString2Dec("1211100"));
    }

    @Test
    public void test20() {
        int r = randomGenerator.nextInt(4);
        if (r == 1) {
            assertEquals("1211100", Dec2Fact.dec2FactString(992L));
        }
    }
}
