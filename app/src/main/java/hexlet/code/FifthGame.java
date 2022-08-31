package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class FifthGame {
    public static void progression() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String name = Cli.greeting();

        System.out.println("What number is missing in the progression?");

        int round = 0;
        while (round < 3) {

            int[] array = new int[random.nextInt(10) + 5];
            int step = random.nextInt(9) + 2;

            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    array[i] = random.nextInt(5);
                } else {
                    array[i] = array[i - 1] + step;
                }
            }

            int hiddemNum = random.nextInt(array.length);
            int realAnswer = array[hiddemNum];

            System.out.println("Question: ");
            for (int i = 0; i < array.length; i++) {
                if (i == hiddemNum) {
                    System.out.print(".. ");
                } else {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
            int answer = scanner.nextInt();

            if (answer == realAnswer) {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + realAnswer + "'.\n" +
                        "Let's try again, " + name);
                break;
            }
        }
        if (round == 3) {
            System.out.println("Congratulations, " + name);
        }
    }
}
