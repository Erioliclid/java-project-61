package hexlet.code.games;

import java.util.Random;

public class Prime {
    public static String[] prime() {
        Random random = new Random();
        int num = random.nextInt(50);

        String realAnswer = "yes";
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                realAnswer = "no";
            }
        }

        String[] gameKey = {Integer.toString(num), realAnswer};
        return gameKey;
    }
}