package hexlet.code.games;

import java.util.Random;

public class Even {
    public static String[] even() {
        Random random = new Random();
        int num = random.nextInt();

        String realAnswer = "yes";
        if (num % 2 == 1 || num % 2 == -1) {
            realAnswer = "no";
        }
        String[] gameKey = {Integer.toString(num), realAnswer};
        return gameKey;
    }
}
