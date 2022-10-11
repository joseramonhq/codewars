package codewars.kyu8.the_feast_of_many_beasts;

public class Kata {

    public static boolean feast(String beast, String dish) {

        return beast.startsWith(dish.substring(0, 1)) && beast.endsWith(dish.substring(dish.length() - 1));

    }

}


