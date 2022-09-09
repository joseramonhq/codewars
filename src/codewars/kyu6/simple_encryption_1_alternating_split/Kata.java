package codewars.kyu6.simple_encryption_1_alternating_split;

public class Kata {

    public static String encrypt(final String text, final int n) {
        if (text == null || text.equals("")) return text;
        StringBuilder sb, str = new StringBuilder(text);
        for (int times = 0; times < n; times++) {
            sb = new StringBuilder(str.toString());
            str = new StringBuilder();
            for (int i = 1; i < sb.length(); i += 2) {
                str.append(sb.charAt(i));
            }
            for (int i = 0; i < sb.length(); i += 2) {
                str.append(sb.charAt(i));
            }
        }
        return str.toString();
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null || encryptedText.equals("")) return encryptedText;
        StringBuilder sb, str = new StringBuilder(encryptedText);
        for (int times = 0; times < n; times++) {
            sb = new StringBuilder(str.toString());
            int index = 0;
            for (int i = 0; i < sb.length(); i++) {
                if (i < sb.length() / 2)
                    str.replace(i * 2 + 1, i * 2 + 2, sb.substring(i, i + 1));
                else {
                    str.replace(index, index + 1, sb.substring(i, i + 1));
                    index += 2;
                }
            }
        }
        return str.toString();
    }
}
