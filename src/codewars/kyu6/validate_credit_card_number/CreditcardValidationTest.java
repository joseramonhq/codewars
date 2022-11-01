package codewars.kyu6.validate_credit_card_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditcardValidationTest {
    @Test
    public void test891() {
        assertFalse(Validate.validate("891"));
    }

    @Test
    public void test123() {
        assertFalse(Validate.validate("123"));
    }

    @Test
    public void test1() {
        assertFalse(Validate.validate("1"));
    }

    @Test
    public void test2121() {
        assertTrue(Validate.validate("2121"));
    }

    @Test
    public void test1230() {
        assertTrue(Validate.validate("1230"));
    }

    @Test
    public void test8675309() {
        assertFalse(Validate.validate("8675309"));
    }

    @Test
    public void test4111111111111111() {
        assertTrue(Validate.validate("4111111111111111"));
    }

    @Test
    public void test26() {
        assertTrue(Validate.validate("26"));
    }

    @Test
    public void test2626262626262626() {
        assertTrue(Validate.validate("2626262626262626"));
    }

    @Test
    public void test91() {
        assertTrue(Validate.validate("91"));
    }

    @Test
    public void test92() {
        assertFalse(Validate.validate("92"));
    }

    @Test
    public void test912030() {
        assertTrue(Validate.validate("912030"));
    }

    @Test
    public void test922030() {
        assertFalse(Validate.validate("922030"));
    }
}
