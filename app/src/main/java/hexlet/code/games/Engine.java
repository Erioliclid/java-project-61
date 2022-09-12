package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

import java.util.Scanner;

public class Engine {
    static boolean result = true;

    public static void game() {
        for (int i = 0; i < 3; i++) {
            if (result) {
                switch (App.answer) {
                    case 1:
                        Cli.greeting();
                        break;
                    case 2:
                        engine(Even.even());
                        break;
                    case 3:
                        engine(Calc.calc());
                        break;
                    case 4:
                        engine(GCD.gcd());
                        break;
                    case 5:
                        engine(Progression.progression());
                        break;
                    case 6:
                        engine(Prime.prime());
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Wrong command");
                }
            }
        }
        if (result) {
            System.out.println("Congratulations, " + App.name + "!");
        }
    }

    public static void engine(String[] gameKey) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + gameKey[0]);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase(gameKey[1])) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + gameKey[1] + "'.\n" +
                    "Let's try again, " + App.name + "!");
            result = false;
        }
    }
}
