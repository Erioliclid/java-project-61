package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;

public class Even {
    public static String[] even() {
        Random random = new Random();
        int num = random.nextInt(100) + 1;

        String realAnswer = "yes";
        if (num % 2 == 1) {
            realAnswer = "no";
        }
        String[] gameKey = {Integer.toString(num), realAnswer};
        return gameKey;
    }
}
