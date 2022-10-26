package codewars.kyu7.summation_triangle_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("All test cases")
class TriangleSumTests {
    @Test
    @DisplayName("Small tests")
    void test0() {
        assertEquals(1, TriangleSum.getSum(0));
        assertEquals(7, TriangleSum.getSum(1));
        assertEquals(22, TriangleSum.getSum(2));
        assertEquals(50, TriangleSum.getSum(3));
    }

    @Test
    @DisplayName("Medium tests")
    void test1() {
        assertEquals(691951, TriangleSum.getSum(100));
        assertEquals(83959751, TriangleSum.getSum(500));
        assertEquals(669169501, TriangleSum.getSum(1000));
    }

    @Test
    @DisplayName("Large tests")
    void test2() {
        assertEquals(666916695001L, TriangleSum.getSum(10000));
        assertEquals(666691666950001L, TriangleSum.getSum(100000));
        assertEquals(666669166669500001L, TriangleSum.getSum(1000000));
    }

    @Test
    @DisplayName("Random tests 500x")
    void test3() {
        Random r = new Random();
        for (int i = 0; i < 500; i++) {
            int n = r.nextInt(1000000);
            assertEquals(((n * (n * (4 * (long) n + 15) + 17) + 6) / 6), TriangleSum.getSum(n));
        }
    }
}
