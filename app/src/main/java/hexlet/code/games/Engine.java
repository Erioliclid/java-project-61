package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

import java.util.Scanner;

public class Engine {
    static boolean result = true;

    public static void game() {
//      Проверка на приветствие
        if (App.answer >= 1 && App.answer <= 6) {
            App.name = Cli.greeting();
        }
//      Проверка на условие игры
        if (App.answer == 1) {
            System.exit(0);
        } else if (App.answer == 2) {
            System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        } else if (App.answer == 3) {
            System.out.println("What is the result of the expression?");
        } else if (App.answer == 4) {
            System.out.println("Find the greatest common divisor of given numbers.");
        } else if (App.answer == 5) {
            System.out.println("What number is missing in the progression?");
        } else if (App.answer == 6) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        } else {
            System.out.println("Wrong command");
            System.exit(0);
        }
//      Игра
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
