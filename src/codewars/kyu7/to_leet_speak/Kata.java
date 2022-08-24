package codewars.kyu7.to_leet_speak;

class Kata {
    static String toLeetSpeak(final String speak) {
        String speak2 = speak;
        char[] leet = {'@', '8', '(', 'D', '3', 'F', '6', '#', '!', 'J', 'K', '1', 'M', 'N', '0', 'P', 'Q', 'R', '$', '7', 'U', 'V', 'W', 'X', 'Y', '2'};
        for (char c = 'A'; c <= 'Z'; c++) {
            speak2 = speak2.replace(c, leet[c - 65]);
        }
        return speak2;
    }
}
