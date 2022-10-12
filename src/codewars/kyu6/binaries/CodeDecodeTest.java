package codewars.kyu6.binaries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeDecodeTest {

    private static void testingCode(String s, String expected) {
        String actual = CodeDecode.code(s);
        assertEquals(expected, actual);
    }

    private static void testingDecode(String s, String expected) {
        String actual = CodeDecode.decode(s);
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests code");
        testingCode("62", "0011100110");
        testingCode("55337700", "001101001101011101110011110011111010");
        testingCode("1119441933000055", "1111110001100100110000110011000110010111011110101010001101001101");
        testingCode("69", "00111000011001");
        testingCode("86", "00011000001110");

        testingCode("032", "1001110110");
        testingCode("000100", "101010111010");
        testingCode("975", "00011001001111001101");
        testingCode("99889933", "00011001000110010001100000011000000110010001100101110111");
        testingCode("974", "00011001001111001100");
        testingCode("5191", "001101110001100111");
        testingCode("112222228855", "11110110011001100110011001100001100000011000001101001101");

        testingCode("83199", "000110000111110001100100011001");
        testingCode("55992266775519", "0011010011010001100100011001011001100011100011100011110011110011010011011100011001");
        testingCode("278", "011000111100011000");
        testingCode("4477221119", "0011000011000011110011110110011011111100011001");
        testingCode("22662219889933", "011001100011100011100110011011000110010001100000011000000110010001100101110111");

        testingCode("227733228899", "01100110001111001111011101110110011000011000000110000001100100011001");
        testingCode("29", "011000011001");
        testingCode("240", "011000110010");
        testingCode("55555511119333333444", "0011010011010011010011010011010011011111111100011001011101110111011101110111001100001100001100");
        testingCode("51933", "001101110001100101110111");
    }

    @Test
    public void test2() {
        System.out.println("Fixed Tests decode");
        testingDecode("10001111", "07");
        testingDecode("001100001100001100001110001110001110011101110111001110001110001110001111001111001111001100001100001100", "444666333666777444");
        testingDecode("01110111110001100100011000000110000011110011110111011100110000110001100110", "33198877334422");
        testingDecode("0011010011010011011010101111110011000011000011000011100011100011100011100011100011100001100100011001000110011100011001001111001111001111001111001111001111", "55500011144466666699919777777");
        testingDecode("01110111011111000110010011110011110011110011110011110011110111011101110110011001100110011001101111111010101100011001000110000001100000011000", "3331977777733322222211100019888");

        testingDecode("001110001110101011110011010011010011000011000001100000011000", "660011554488");
        testingDecode("00110000110000111100111100111100111100011000000110000001100000011000001100001100", "447777888844");
        testingDecode("10000110000110", "082");
        testingDecode("000110000001100011000110011111101011111100011001101000011001000110011100011001", "881911001119009919");
        testingDecode("0011000011000011000110011001100110011001100110011001100110011001101100011001000110000001100000011000001110001110001110001111001111001111001110001110001110", "44422222222222219888666777666");

        testingDecode("00110110", "50");
        testingDecode("101010001100001100001100000110000001100000011000011101110111000110010001100100011001011001100110001100001100001100000110000001100000011000001110001110001110", "000444888333999222444888666");
        testingDecode("111111000110010001100100011001000110010001100100011001000110010001100100011001000110000001100000011000000110000001100000011000", "111999999999888888");
        testingDecode("0110011001100111011101111010100110011001100011010011010011010111011101111100011001", "22233300022255533319");
        testingDecode("001101001101001101111111001110001110001110001101001101001101001111001111001111111111", "555111666555777111");

        testingDecode("0011100011100111011111000110010001100000011000001100001100", "6633198844");
        testingDecode("1010100011110011110011110011110011110011111111110001100100011001000110010011010011010011011111111100011001000110000001100000011000011101110111", "00077777711199955511119888333");
        testingDecode("0001100100011000", "98");
        testingDecode("001100001101", "45");
        testingDecode("1111110001100100111000111001110111001110001110", "1119663366");
    }

    //.................................
    private static String dec2Bin(String s) {
        String[] dict = {"10", "11", "0110", "0111", "001100", "001101", "001110", "001111", "00011000", "00011001"};
        return dict[Integer.parseInt(s)];
    }

    private static String codePL(String strng) {
        int lg = strng.length();
        String[] ret = new String[lg];
        for (int start = 0; start < lg; start += 1) {
            String d = Character.toString(strng.charAt(start));
            ret[start] = dec2Bin(d);
        }
        return String.join("", ret);
    }

    //.................................
    private static int randint(int min, int max) {
        return (int) (min + Math.random() * ((max - min) + 1));
    }

    private static String doEx(int sz) {
        int k = sz * randint(1, 5);
        int i = 0;
        StringBuilder res = new StringBuilder();
        while (i < k) {
            res.append(new String(new char[sz]).replace("\0", String.valueOf((char) randint(48, 57))));
            if (randint(1, 500) % 251 == 0)
                res.append(new String(new char[sz]).replace("\0", "0"));
            if (randint(1, 50) % 10 == 0) res.append("19");
            i++;
        }
        return res.toString();
    }

    private static void random_tests0() {
        int i = 0;
        while (i < 50) {
            String s = doEx(randint(2, 6));
            String sol = codePL(s);
            testingCode(s, sol);
            i++;
        }
    }

    private static void random_tests1() {
        int i = 0;
        while (i < 50) {
            String s = doEx(randint(2, 6));
            String sol = codePL(s);
            testingDecode(sol, s);
            i++;
        }
    }

    @Test
    public void test3() {
        System.out.println("Random Tests code");
        random_tests0();
    }

    @Test
    public void test4() {
        System.out.println("Random Tests decode");
        random_tests1();
    }
}
