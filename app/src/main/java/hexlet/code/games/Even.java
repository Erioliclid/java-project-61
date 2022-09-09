package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String name = Cli.greeting();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        int round = 0;
        while (round < 3) {
            int num = random.nextInt(100) + 1;
            String yes = "yes";
            String no = "no";

            System.out.println("Question: " + num);

            String realAnswer = yes;
            if (num % 2 == 1) {
                realAnswer = no;
            }

            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(realAnswer)) {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + realAnswer + "'.\n" +
                        "Let's try again, " + name);
                break;
            }
        }

        if (round == 3) {
            System.out.println("Congratulations, " + name);
        }
    }
}
