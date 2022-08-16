package codewars.kyu6.extract_file_name;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileNameExtractorTest {
    SecureRandom r = new SecureRandom();

    @Test
    public void testSample() {
        assertEquals(
                "FILE_NAME.EXTENSION",
                FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
        );
        assertEquals(
                "FILE_NAME.EXTENSION",
                FileNameExtractor.extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34")
        );
        assertEquals(
                "FILE_NAM-E.EXTENSION",
                FileNameExtractor.extractFileName("1_FILE_NAM-E.EXTENSION.OTHEREXTENSIONadasdassdassds34")
        );
    }

    @Test
    public void testRandomly() {
        for (int i = 0; i < 35; i++) {
            int firstPart = r.nextInt(10000);
            String filename = new BigInteger(130, r).toString(32);
            String extension = new BigInteger(130, r).toString(32).substring(0, 3);
            String tstfilename = firstPart + "_" + filename + "." + extension + "." + firstPart + "a";
            assertEquals(
                    filename + "." + extension,
                    FileNameExtractor.extractFileName(tstfilename)
            );
        }
    }
}