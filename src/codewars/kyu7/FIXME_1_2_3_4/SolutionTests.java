package codewars.kyu7.FIXME_1_2_3_4;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SolutionTests {

    @Test
    public void testEnglish() {
        assertEquals(1, Dinglemouse.getNumber("one").intValue());
        assertEquals(2, Dinglemouse.getNumber("two").intValue());
        assertEquals(3, Dinglemouse.getNumber("three").intValue());
        assertEquals(4, Dinglemouse.getNumber("four").intValue());
    }

    @Test
    public void testJapanese() {
        assertEquals(1, Dinglemouse.getNumber("ichi").intValue());
        assertEquals(2, Dinglemouse.getNumber("ni").intValue());
        assertEquals(3, Dinglemouse.getNumber("san").intValue());
        assertEquals(4, Dinglemouse.getNumber("shi").intValue());
    }

    @Test
    public void testFrench() {
        assertEquals(1, Dinglemouse.getNumber("un").intValue());
        assertEquals(2, Dinglemouse.getNumber("deux").intValue());
        assertEquals(3, Dinglemouse.getNumber("trois").intValue());
        assertEquals(4, Dinglemouse.getNumber("quatre").intValue());
    }

    @Test
    public void testZ() {
        final String errMsg = "Don't try to re-write the API. The getNumber should return a MyNumber enum!";

        // Make sure a MyNumber is returned
        assertNotNull(Dinglemouse.getNumber("one"), errMsg);
        assertNotNull(Dinglemouse.getNumber("two"), errMsg);
        assertNotNull(Dinglemouse.getNumber("three"), errMsg);

        assertNotNull(Dinglemouse.getNumber("one"), errMsg);
        assertNotNull(Dinglemouse.getNumber("two"), errMsg);
        assertNotNull(Dinglemouse.getNumber("three"), errMsg);

        // Try to ensure it's an enum
        assertEquals("ONE", "" + Dinglemouse.getNumber("one"), errMsg);
        assertEquals("TWO", "" + Dinglemouse.getNumber("two"), errMsg);
        assertEquals("THREE", "" + Dinglemouse.getNumber("three"), errMsg);

        assertEquals("ONE", "" + Dinglemouse.MyNumber.valueOf("ONE"), errMsg);
        assertEquals("TWO", "" + Dinglemouse.MyNumber.valueOf("TWO"), errMsg);
        assertEquals("THREE", "" + Dinglemouse.MyNumber.valueOf("THREE"), errMsg);

        assertEquals(0, Dinglemouse.MyNumber.valueOf("ONE").ordinal(), errMsg);
        assertEquals(1, Dinglemouse.MyNumber.valueOf("TWO").ordinal(), errMsg);
        assertEquals(2, Dinglemouse.MyNumber.valueOf("THREE").ordinal(), errMsg);

        assertEquals(0, Dinglemouse.getNumber("ichi").ordinal(), errMsg);
        assertEquals(1, Dinglemouse.getNumber("ni").ordinal(), errMsg);
        assertEquals(2, Dinglemouse.getNumber("san").ordinal(), errMsg);
    }

    // =====================

    private static Map<String, Integer> map = new HashMap<>() {{
        put("one", 1);
        put("two", 2);
        put("three", 3);
        put("four", 4);

        put("ichi", 1);
        put("ni", 2);
        put("san", 3);
        put("shi", 4);

        put("un", 1);
        put("deux", 2);
        put("trois", 3);
        put("quatre", 4);
    }};

    @Test
    public void random() {
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.shuffle(keys);
        for (int r = 1; r <= 100; r++) {
            int keyIdx = (int) (Math.random() * keys.size());
            String key = keys.get(keyIdx);
            int expected = map.get(key);
            System.out.printf("Random Test #%d %s => %d%n", r, key, expected);
            assertEquals(expected, Dinglemouse.getNumber(key).intValue());
        }
    }

}
