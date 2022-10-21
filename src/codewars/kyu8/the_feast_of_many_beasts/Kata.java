package codewars.kyu8.the_feast_of_many_beasts;

public class Kata {

    /**
     * The feast function returns true if the beast starts with the first letter of
     * dish and ends with the last letter of dish. Otherwise, it returns false.
     *
     * @param beast Determine if the feast is successful
     * @param dish  Determine the first letter of the beast and last letter of dish
     * @return True if the first and last letters of the string passed in as beast match
     * @author Trelent
     */
    public static boolean feast(String beast, String dish) {

        return beast.startsWith(dish.substring(0, 1)) && beast.endsWith(dish.substring(dish.length() - 1));

    }

}


