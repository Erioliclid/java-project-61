package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static String[] calc() {
        Random random = new Random();
        int randomPoint = 20;
        int num1 = random.nextInt(randomPoint);
        int num2 = random.nextInt(randomPoint);
        char[] symbols = {'+', '-', '*'};
        int symbol = random.nextInt(symbols.length);

        String quest = "";
        quest = num1 + " " + symbols[symbol] + " " + num2;

        int realAnswer = 0;
        switch (symbol) {
            case 0 -> realAnswer = num1 + num2;
            case 1 -> realAnswer = num1 - num2;
            case 2 -> realAnswer = num1 * num2;
            default -> {
            }
        }
        String[] gameKey = {quest, Integer.toString(realAnswer)};
        return gameKey;
    }
}
