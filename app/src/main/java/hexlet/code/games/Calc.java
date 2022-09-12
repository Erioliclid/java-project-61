package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static String[] calc() {
        Random random = new Random();

        int num1 = random.nextInt(20) + 1;
        int num2 = random.nextInt(20) + 1;
        char[] symbols = {'+', '-', '*'};
        int symbol = random.nextInt(symbols.length);

        String quest = "";
        quest = num1 + " " + symbols[symbol] + " " + num2;

        int realAnswer = 0;
        switch (symbol) {
            case 0:
                realAnswer = num1 + num2;
                break;
            case 1:
                realAnswer = num1 - num2;
                break;
            case 2:
                realAnswer = num1 * num2;
                break;
        }
        String[] gameKey = {quest, Integer.toString(realAnswer)};
        return gameKey;
    }
}
