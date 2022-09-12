package hexlet.code.games;

import java.util.Random;

public class GCD {
    public static String[] gcd() {
        Random random = new Random();
        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;
        int realAnswer = 0;

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                realAnswer = i;
            }
        }
        String[] gameKey = {num1 + " " + num2, Integer.toString(realAnswer)};
        return gameKey;
    }
}
