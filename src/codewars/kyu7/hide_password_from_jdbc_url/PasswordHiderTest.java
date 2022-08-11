package codewars.kyu7.hide_password_from_jdbc_url;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordHiderTest {

    private static String myHidePasswordFromConnection(String urlString) {
        StringBuilder resultString = new StringBuilder();
        Pattern regex = Pattern.compile("(password=)([^&]*)");
        Matcher regexMatcher = regex.matcher(urlString);
        while (regexMatcher.find()) {
            regexMatcher.appendReplacement(resultString,
                    regexMatcher.group(1) + regexMatcher.group(2)
                            .replaceAll(".", "*"));
        }
        regexMatcher.appendTail(resultString);
        return resultString.toString();
    }

    @Test
    public void hidePasswordFromConnection() {
        assertEquals(
                "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****",
                PasswordHider.hidePasswordFromConnection(
                        "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"));
        assertEquals(
                "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=*****&user=root",
                PasswordHider.hidePasswordFromConnection(
                        "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=12345&user=root"));
    }

    private String selectRandomElement(String... myArray) {
        final int floor = (int) (Math.floor(Math.random() * myArray.length));
        return myArray[floor];
    }

    @Test
    public void randomTests() {
        String[] databaseDriver = {"jdbc:mysql://" //mysql
                , "jdbc:google:mysql://" //mysql on google cloud
                , "jdbc:sqlserver://" //sqlserver
                , "jdbc:postgresql://" //postgresql
                , "jdbc:as400://" // db2
        };

        String[] hosts = {"127.0.0.1", "121.45.6.6", "192.0.0.4", "14.4.5.54"};
        String[] ports = {"1433", "2021"};
        String[] databases = {"products", "rh", "mydatabase", "adatabase"};
        String[] regions = {"us", "mx", "jp", "eu"};
        String[] users = {"root", "toor", "admin", "nimda", "adminadmin", "sys"};
        String[] passwords = {"12345", "g'od", "MyP4$$W0rD!", "1qazxsw23ñedcvfr45tgb", "qwertyuiop"};

        String[] databaseConnectionInfo = new String[10];
        Arrays.setAll(databaseConnectionInfo, (idx) -> Math.random() > 0.5 ?
                String.format("%s%s:%s/%s:%s?user=%s&password=%s", selectRandomElement(databaseDriver),
                        selectRandomElement(hosts), selectRandomElement(ports), selectRandomElement(databases),
                        selectRandomElement(regions), selectRandomElement(users),
                        selectRandomElement(passwords)) :
                String.format("%s%s:%s/%s:%s?password=%s&user=%s", selectRandomElement(databaseDriver),
                        selectRandomElement(hosts), selectRandomElement(ports), selectRandomElement(databases),
                        selectRandomElement(regions), selectRandomElement(passwords),
                        selectRandomElement(users)));

        Arrays.stream(databaseConnectionInfo)
                .forEach(
                        (randomTestData) -> assertEquals(myHidePasswordFromConnection(randomTestData),
                                PasswordHider.hidePasswordFromConnection(randomTestData)));
    }
}
