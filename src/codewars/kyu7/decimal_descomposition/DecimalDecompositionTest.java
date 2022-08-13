package codewars.kyu7.decimal_descomposition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecimalDecompositionTest {

    @Test
    public void basicTests() {
        assertEquals("100+20+6", DecimalDecomposition.decimalDecomposition(126));
        assertEquals("100", DecimalDecomposition.decimalDecomposition(100));
        assertEquals("1000+200+10", DecimalDecomposition.decimalDecomposition(1210));
        assertEquals("700000+10000+2000+600+50+4", DecimalDecomposition.decimalDecomposition(712654));
    }

    @Test
    public void randomTests() {
        DecimalDe d = new DecimalDe();

        for (int i = 0; i < 100; i++) {
            int numb = (int) Math.ceil(Math.random() * 100000);
            assertEquals(d.decimalDecomposition(numb), DecimalDecomposition.decimalDecomposition(numb));
        }
    }

    private static class DecimalDe {
        public String decimalDecomposition(int number) {
            String num = number + "";
            StringBuilder aux = new StringBuilder();
            for (int i = 0; i < num.length(); i++) {
                aux.append(num.charAt(i));
                aux.append("0".repeat(num.length() - i - 1));
                aux.append("+");

            }
            aux = new StringBuilder(aux.substring(0, aux.length() - 1));
            String[] ar = aux.toString().split("\\+");
            aux = new StringBuilder();
            for (String s : ar) {
                if (Integer.parseInt(s) != 0) {
                    aux.append(s).append("+");
                }
            }
            return aux.substring(0, aux.length() - 1);
        }
    }
}
