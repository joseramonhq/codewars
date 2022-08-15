package codewars.kyu7.redacted;

public class Dinglemouse {

    public static boolean redacted(String doc1, String doc2) {
        if (doc1.length() != doc2.length()) return false;
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < doc1.length(); i++) {
            if (doc1.charAt(i) == 'X' && doc2.charAt(i) != '\n')
                a.append(doc2.charAt(i));
            else
                a.append(doc1.charAt(i));
        }

        return a.toString().equals(doc2);

    }
}



