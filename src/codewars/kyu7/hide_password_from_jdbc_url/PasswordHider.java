package codewars.kyu7.hide_password_from_jdbc_url;


/*We have to create a function that receives a connection string with password included and you have to mask the password i.e. change password by asterisks.

Preconditions:

non empty valid url
password always next to string section password=
assume password will not contain ampersand sign for sake of simplicity
to make it more real it has non ASCII characters
"password=" and "user" will occur only once
empty passwords are not validated but best solutions take empty passwords into account

Example:

input
jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345

output
jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****

Extra readings:

https://alvinalexander.com/java/jdbc-connection-string-mysql-postgresql-sqlserver

STRINGSREGULAR EXPRESSIONSFUNDAMENTALS

 */
public class PasswordHider {
    public static String hidePasswordFromConnection(String urlString) {
        StringBuilder str = new StringBuilder(urlString);

        for (int i = urlString.indexOf("password=") + 9; i < str.length() && str.charAt(i) != '&'; i++)
            str.replace(i, i + 1, "*");

        return str.toString();
    }
}

