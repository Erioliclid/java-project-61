package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class ForthGame {
    public static void gcd() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String name = Cli.greeting();

        int round = 0;

        while (round < 3) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;
            int symbol = random.nextInt(3);

            int realAnswer = 0;

            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0 && num2 % i == 0){
                    realAnswer = i;
                }
            }

            System.out.println("Question: " + num1 + " " + num2);
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
