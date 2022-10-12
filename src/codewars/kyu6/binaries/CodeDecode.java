package codewars.kyu6.binaries;

import java.util.Map;
import java.util.TreeMap;

public class CodeDecode {

    private static final String[] BINARY = new String[]{"10", "11", "0110", "0111", "001100", "001101", "001110", "001111", "00011000", "00011001"};
    public static final Map<String, String> KEY = new TreeMap<>();
    public static final Map<String, String> DECODE = new TreeMap<>();

    static {
        for (int i = 0; i < BINARY.length; i++) {
            KEY.put(i + "", BINARY[i]);
            DECODE.put(BINARY[i], i + "");
        }
    }

    public static String code(String strng) {
        String[] number = strng.split("");
        StringBuilder result = new StringBuilder();
        for (String s : number) result.append(KEY.get(s));
        return result.toString();
    }

    public static String decode(String str) {
        String number = str;
        String chunk;
        StringBuilder decodeNumber = new StringBuilder();
        String key;
        while (number.length() > 0) {
            key = number.length() > 2 ? number.substring(0, 3) : "111";
            switch (key) {
                case "000" -> {
                    chunk = number.substring(0, 8);
                    number = number.substring(8);
                }
                case "001" -> {
                    chunk = number.substring(0, 6);
                    number = number.substring(6);
                }
                case "011" -> {
                    chunk = number.substring(0, 4);
                    number = number.substring(4);
                }
                default -> {
                    chunk = number.substring(0, 2);
                    number = number.substring(2);
                }
            }
            decodeNumber.append(DECODE.get(chunk));

        }

        return decodeNumber.toString();
    }
}

