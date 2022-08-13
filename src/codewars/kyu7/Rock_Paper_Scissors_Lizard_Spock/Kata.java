package codewars.kyu7.Rock_Paper_Scissors_Lizard_Spock;

import java.util.List;

public class Kata {

    public static String rpsls(String player1, String player2) {

        if (player1.equalsIgnoreCase(player2)) return "Draw!";

        List<String> list = List.of("scissors cuts paper",
                "paper covers rock",
                "rock crushes lizard",
                "lizard poisons spock",
                "spock smashes scissors",
                "scissors decapitates lizard",
                "lizard eats paper",
                "paper disproves spock",
                "spock vaporizes rock",
                "rock crushes scissors"
        );
        String game = "";
        for (String a : list)
            if (a.contains(player1) && a.contains(player2))
                game = a;
        return "Player " + (game.startsWith(player1.toLowerCase()) ? 1 : 2) + " Won!";
    }
}


