package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class ThirdGame {
    public static void calc() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String name = Cli.greeting();

        int round = 0;

        while (round < 3) {
            int num1 = random.nextInt(20) + 1;
            int num2 = random.nextInt(20) + 1;
            int symbol = random.nextInt(3);
            char operand = 's';
            int realAnswer = 0;

            switch (symbol) {
                case 0:
                    operand = '+';
                    realAnswer = num1 + num2;
                    break;
                case 1:
                    operand = '-';
                    realAnswer = num1 - num2;
                    break;
                case 2:
                    operand = '*';
                    realAnswer = num1 * num2;
                    break;
            }

            System.out.println("Question: " + num1 + " " + operand + " " + num2);
            int answer = scanner.nextInt();

            if (answer == realAnswer) {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was" + "'" + realAnswer + "'.\n" +
                        "Let's try again, " + name);
                break;
            }
        }
        if (round == 3) {
            System.out.println("Congratulations, " + name);
        }
    }
}
