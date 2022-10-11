package codewars.kyu6.backspaces_in_string;

public class BackspacesInString {
    public String cleanString(String s) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        for (String ss : s.split(""))
            if (ss.equals("#") && i > 0)
                str.deleteCharAt(--i);
            else if (!ss.equals("#")) {
                str.append(ss);
                i++;
            }
        return str.toString();

    }
}

