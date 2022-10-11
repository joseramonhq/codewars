package codewars.kyu6.convert_string_to_camel_case;

class Solution {

    static String toCamelCase(String s) {

        String[] a = s.split("[-_]");
        StringBuilder x = new StringBuilder(a[0]);
        for (int i = 1; i < a.length; i++)
            x.append(a[i].replaceAll("^.", a[i].substring(0, 1).toUpperCase()));
        return x.toString();
    }
}
