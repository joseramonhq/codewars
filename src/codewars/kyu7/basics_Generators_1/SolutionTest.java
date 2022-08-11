package codewars.kyu7.basics_Generators_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SolutionTest {
    Generator gen;

    @BeforeEach
    public void beforeEach() {
        gen = new Generator();
    }

    @Test
    public void fixedTests() {

        assertEquals(gen.next(), 1);
        assertEquals(gen.next(), 2);
        assertEquals(gen.next(), 3);
        assertEquals(gen.next(), 4);
        assertEquals(gen.next(), 5);
        assertEquals(gen.next(10), 10);
    }


    @Test
    public void randomTests() {

        for (int i = 0; i < 100; i++) {
            int a = (int) Math.floor(Math.random() * 10000);
            //System.out.println(a);
            assertEquals(a, gen.next(a), "Generator => " + a);
        }
    }

    @Test
    public void randomTestsFalse() {

        for (int i = 0; i < 100; i++) {
            int a = (int) Math.floor(Math.random() * 10000);
            //System.out.println(a);
            assertNotEquals(a + 1, gen.next(a), "Generator => " + a);
        }
    }
}
