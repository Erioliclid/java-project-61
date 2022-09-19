package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

import java.util.Scanner;

public class Engine {
    static private boolean result = true;

    public static void game() {
//      Проверка на условие игры
        switch (App.getAnswer()) {
            case 2 -> System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
            case 3 -> System.out.println("What is the result of the expression?");
            case 4 -> System.out.println("Find the greatest common divisor of given numbers.");
            case 5 -> System.out.println("What number is missing in the progression?");
            case 6 -> System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            default -> System.exit(0);
        }
//      Игра
        for (int i = 0; i < 3; i++) {
            if (result) {
                switch (App.getAnswer()) {
                    case 1 -> Cli.greeting();
                    case 2 -> engine(Even.even());
                    case 3 -> engine(Calc.calc());
                    case 4 -> engine(GCD.gcd());
                    case 5 -> engine(Progression.progression());
                    case 6 -> engine(Prime.prime());
                    case 0 -> System.exit(0);
                    default -> System.out.println("Wrong command");
                }
            }
        }
        if (result) {
            System.out.println("Congratulations, " + App.getName() + "!");
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
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + gameKey[1] + "'.\n"
                    + "Let's try again, " + App.getName() + "!");
            result = false;
        }
    }
}
