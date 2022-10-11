package codewars.kyu6.backspaces_in_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCleanStringWithFixedData() {
        final BackspacesInString bis = new BackspacesInString();
        assertEquals("ac", bis.cleanString("abc#d##c"));
        assertEquals("", bis.cleanString("abc####d##c#"));
        assertEquals("jf", bis.cleanString("abjd####jfk#"));
        assertEquals("gdasda", bis.cleanString("gfh#jds###d#dsd####dasdaskhj###dhkjs####df##s##d##"));
        assertEquals("6+yqw8hfklsd-=-f", bis.cleanString("831####jns###s#cas/*####-5##s##6+yqw87e##hfklsd-=-28##fds##"));
        assertEquals("jdsfdasns", bis.cleanString("######831###dhkj####jd#dsfsdnjkf###d####dasns"));
        assertEquals("", bis.cleanString(""));
        assertEquals("", bis.cleanString("#######"));
        assertEquals("sa", bis.cleanString("####gfdsgf##hhs#dg####fjhsd###dbs########afns#######sdanfl##db#####s#a"));
        assertEquals("hskjdgd", bis.cleanString("#hskjdf#gd"));
        assertEquals("hsk48hjjdfgd", bis.cleanString("hsk48hjjdfgd"));
        assertEquals("Io4f", bis.cleanString("fjnwui#NI#(*N#ION#Onfjen################Io4f"));
        assertEquals("6d87hbaskj$$%$$2332ff", bis.cleanString("####6d87hbaskjdnf###$$%W#$@#$2332fr#f"));
        assertEquals("9OooooO", bis.cleanString("#9#9#9#9o#9#9#9#Oooooo#OOOooO#OO######"));
        assertEquals("0", bis.cleanString("0###0###0"));
        assertEquals("904rfDj*fsf09mfednkmfd;m", bis.cleanString("904rfn#jlkcn#####Djva2###*(#fsdgfd####fsdg###09849###mfenf##dnjn##kmfd;l#mg03###"));
    }

    @Test
    public void testCleanStringWithRandomData() {
        final BackspacesInString bis = new BackspacesInString();
        for (int i = 0; i < 20; i++) {
            final String randomData = generateRandomData();
            final String answer = solveFor(randomData);
            assertEquals(answer, bis.cleanString(randomData));
        }
    }

    private String generateRandomData() {
        StringBuilder str = new StringBuilder("" + randomCharacter());
        while (Math.random() < 0.9 && str.length() < 15) {
            str.append(Math.random() > 0.4 ? randomCharacter() : '#');
        }
        return str.toString();
    }

    private String solveFor(String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#' && sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
            else if (c != '#') sb.append(c);
        }
        return sb.toString();
    }

    private char randomCharacter() {
        final int rnd = (int) (Math.random() * 52);
        final char base = (rnd < 26) ? 'A' : 'a';
        return (char) (base + rnd % 26);
    }
}
