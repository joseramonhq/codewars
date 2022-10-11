package codewars.kyu6.stop_gninnips_my_sdrow;

public class SpinWords {

    public String spinWords(String sentence) {

        String[] a = sentence.split(" ");
        StringBuilder sentenceBuilder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() >= 5) {
                a[i] = new StringBuilder(a[i]).reverse().toString();
            }
            sentenceBuilder.append(a[i]).append(" ");
        }
        sentence = sentenceBuilder.toString();
        return sentence.trim();
    }
}
