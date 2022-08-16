package codewars.kyu6.extract_file_name;

public class FileNameExtractor {

    public static String extractFileName(String dirtyFileName) {
        return dirtyFileName.replaceAll("\\d+_([\\w_-]+\\.[\\w]+)\\..*$", "$1");
    }
}
