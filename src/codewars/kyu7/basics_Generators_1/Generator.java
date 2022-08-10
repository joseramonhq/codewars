package codewars.kyu7.basics_Generators_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/*Basics - Generators #1
Generators are very useful things in programming, in this series we will learn how to use generators and see how we can apply generators to common programming challenges.
Task
You must complete the generator function that must increment a counter by 1 each time also if the argument is supplied (will always be a number) you must then change the counter to that number.
Important
The counter must start at 1 when the generator is initialized
More Info: Iterators and Generators (JavaScript), Generators Overview (PHP)

 */
public class Generator {
    private int i = 1;

    public int next() {
        return i++;
    }

    public int next(int a) {
        return a;
    }

}


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