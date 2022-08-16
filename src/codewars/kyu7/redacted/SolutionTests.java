package codewars.kyu7.redacted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTests {

    private boolean test(String doc1, String doc2) {
        System.out.printf("doc1: %s\ndoc2: %s\n----------%n", doc1.replace("X", "<span style='color:red;'>X</span>"), doc2);
        return Dinglemouse.redacted(doc1, doc2);
    }

    @Test
    public void ex1() {
        String doc1 = "TOP SECRET:\nThe missile launch code for Sunday XXXXXXXXXX is:\nXXXXXXXXXXXXXXXXX";
        String doc2 = "TOP SECRET:\nThe missile launch code for Sunday 5th August is:\n7-ZERO-8X-ALPHA-1";
        assertTrue(test(doc1, doc2));
    }

    @Test
    public void ex2() {
        String doc1 = "The name of the mole is Professor XXXXX";
        String doc2 = "The name of the mole is Professor Plum";
        assertFalse(test(doc1, doc2));
    }

    @Test
    public void ex3() {
        String doc1 = "XXXXXXXX XXXXXXX XXXXXXXXXXXXXXXXXXX\nXXXX XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX XXXXXXXXX XXXXXXXXXXXXX XXXXX";
        String doc2 = "Area-51. Medical Report. 23/Oct/1969\nE.T. subject 4 was given an asprin after reporting sick for duty today";
        assertTrue(test(doc1, doc2));
    }

    @Test
    public void yes() {
        String doc1, doc2;

        // single word
        doc1 = "This is a XXXX. Can you pass it?";
        doc2 = "This is a test. Can you pass it?";
        assertTrue(test(doc1, doc2));

        // multi word
        doc1 = "This is a XXXX. Can you XXXX it?";
        doc2 = "This is a test. Can you pass it?";
        assertTrue(test(doc1, doc2));

        // multi word and spaces
        doc1 = "This XXXXXXXXX. Can XXXXXXXX it?";
        doc2 = "This is a test. Can you pass it?";
        assertTrue(test(doc1, doc2));

        // non letters
        doc1 = "This XXXXXXXXXX Can XXXXXXXX XXX";
        doc2 = "This is a test. Can you pass it?";
        assertTrue(test(doc1, doc2));
    }

    @Test
    public void no() {
        String doc1, doc2;

        // single word
        doc1 = "This is a XXXX. Will you pass it?";
        doc2 = "This is a test. Will you fail it?";
        assertFalse(test(doc1, doc2));

        // multi word
        doc1 = "This is a XXXX. Will you XXXX it?";
        doc2 = "This is a test. Did they pass it?";
        assertFalse(test(doc1, doc2));

        // multi word and spaces
        doc1 = "This XXXXXXXXX. Can XXXXXXXX it?";
        doc2 = "This is a test. Did you pass it?";
        assertFalse(test(doc1, doc2));

        // non letters
        doc1 = "This XXXXXXXXXX Will XXXXXXXX XXX?";
        doc2 = "This is a test. Will you pass it?!";
        assertFalse(test(doc1, doc2));
    }

    @Test
    public void whitespace() {
        String doc1, doc2;

        // newlines
        // - leading
        doc1 = "\n\n\nLine1\nXXXXX";
        doc2 = "Line1\nLine2";
        assertFalse(test(doc1, doc2));
        doc1 = "\n\n\nLine1\nXXXXX";
        doc2 = "\n\n\nLine1\nLine2";
        assertTrue(test(doc1, doc2));
        // - trailing
        doc1 = "Line1\nXXXXX\n\n\n";
        doc2 = "Line1\nLine2";
        assertFalse(test(doc1, doc2));
        doc1 = "Line1\nXXXXX\n\n\n";
        doc2 = "Line1\nLine2\n\n\n";
        assertTrue(test(doc1, doc2));
        // - leading and trailing
        doc1 = "\nLine1\nXXXXX\n\n\n";
        doc2 = "\n\nLine1\nLine2\n\n";
        assertFalse(test(doc1, doc2));
        doc1 = "\n\nLine1\nXXXXX\n\n";
        doc2 = "\n\nLine1\nLine2\n\n";
        assertTrue(test(doc1, doc2));
        // - middle
        doc1 = "Line1\n\nXXXXX";
        doc2 = "Line1\nLine2";
        assertFalse(test(doc1, doc2));

        // not allowed to redact newlines!
        doc1 = "Line1\nXLine2X";
        doc2 = "Line1\n\nLine2\n";
        assertFalse(test(doc1, doc2));

        // spaces
        // - leading
        doc1 = " XXXXX. The final frontier";
        doc2 = " Space. The final frontier";
        assertTrue(test(doc1, doc2));
        // - middle
        doc1 = "The quick brown fox  is XXXX";
        doc2 = "The quick  brown fox is here";
        assertFalse(test(doc1, doc2));
        // - trailing
        doc1 = "And the winner is XXXXXXXXXXXXXX";
        doc2 = "And the winner is a mystery...  ";
        assertTrue(test(doc1, doc2));

        // X redacting another X
        doc1 = "On the treasure map X marks the XXXX";
        doc2 = "On the treasure map X marks the spot";
        assertTrue(test(doc1, doc2));
        doc1 = "The doctor marked your XXXXXXXX with an XXX before taking the XXXXX";
        doc2 = "The doctor marked your shoulder with an 'X' before taking the X-ray";
        assertTrue(test(doc1, doc2));
    }

    @Test
    public void edge() {
        String doc1, doc2;

        // $ may confuse regex
        doc1 = "The price is $XXXXX";
        doc2 = "The price is $20.93";
        assertTrue(test(doc1, doc2));

        // prevent any regex solutions
        doc1 = "More (XXXXX) to muck up reg.*{99} [solutions]+";
        doc2 = "More (stuff) to muck up reg.*{99} [solutions]+";
        assertTrue(test(doc1, doc2));

        doc1 = "More (XXXXX) to muck up reg.*{99} [solutions]+";
        doc2 = "More (stuff) to muck up regZ*{99} [solutions]+";
        assertFalse(test(doc1, doc2));

        doc1 = "More ^XXXXX) to muck up reg.*{99} [solutions]+";
        doc2 = "More ^stuff) to muck up reg.*{99} [solutions]+";
        assertTrue(test(doc1, doc2));

        doc1 = "abX\\s";
        doc2 = "abc\\s";
        assertTrue(test(doc1, doc2));

        doc1 = "B4B|XXX|LOL";
        doc2 = "B4B|WTF|LOL";
        assertTrue(test(doc1, doc2));

        // most basic case
        doc1 = "X";
        doc2 = "X";
        assertTrue(test(doc1, doc2));

        // empty docs
        doc1 = "";
        doc2 = "";
        assertTrue(test(doc1, doc2));

        // same length. No redaction
        doc1 = "There is no redaction in this document. Is it some kind of a trick?";
        doc2 = "There is no redaction in this document. Is it some kind of a trick?";
        assertTrue(test(doc1, doc2));

        // same length. No redaction
        doc1 = "There is no redaction in this document. Is it some kind of a trick?";
        doc2 = "There is no redaction in this document. Is it your idea of a trick?";
        assertFalse(test(doc1, doc2));

        // different length. No redaction
        doc1 = "There is no redaction in this document. Is it some kind of a trick?";
        doc2 = "There is no redaction in this document. Is it some kind of trick?";
        assertFalse(test(doc1, doc2));

        // letter case
        doc1 = "abc XXX ghi";
        doc2 = "Abc def ghi";
        assertFalse(test(doc1, doc2));
    }

    private String[] makeDocs() {
        String alphaNum = "        \n\n\nabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789....,,,???$\\*^|";
        int count = 100;
        StringBuilder sbDoc1 = new StringBuilder(), sbDoc2 = new StringBuilder();
        while (count-- != 0) {
            int idx = (int) (Math.random() * alphaNum.length());
            char ch = alphaNum.charAt(idx);
            sbDoc1.append(Math.random() < 0.2 ? 'X' : ch);
            if (Math.random() > 0.05) sbDoc2.append(ch); // sometimes the lengths are different
        }
        return new String[]{sbDoc1.toString(), sbDoc2.toString()};
    }

    private static class DinglemouseAnswer20180807 {

        static boolean redacted(String doc1, String doc2) {
            //System.out.println(String.format("DOC1 '%s'\nDOC2 '%s'", doc1, doc2));
            if (doc1.length() != doc2.length()) return false;
            int i = 0;
            for (char c1 : doc1.toCharArray()) {
                char c2 = doc2.charAt(i++);
                if (c1 != c2 && (c1 != 'X' || c2 == '\n')) return false;
            }
            return true;
        }

    }

    @Test
    public void random() {
        for (int r = 0; r < 50; r++) {
            String[] docs = makeDocs();
            String doc1 = docs[0], doc2 = docs[1];
            boolean expected = DinglemouseAnswer20180807.redacted(doc1, doc2);
            if (expected) assertTrue(test(doc1, doc2));
            else assertFalse(test(doc1, doc2));
        }
    }

}
