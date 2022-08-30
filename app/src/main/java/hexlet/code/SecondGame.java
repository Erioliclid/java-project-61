package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class SecondGame {
    public static void even() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String name = Cli.greeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        int round = 0;
        while (round < 3) {
            int num = random.nextInt(100) + 1;
            System.out.println("Question: " + num);
            String answer = scanner.nextLine();

            if ((num % 2 == 0 && answer.equalsIgnoreCase("yes")) || (num % 2 == 1 && answer.equalsIgnoreCase("no"))) {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.println(
                        "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                                "Let's try again, Bill!");
                break;
            }
        }
        if (round == 3) {
            System.out.println("Congratulations, " + name);
        }
    }
}
