/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter");
        System.out.print(
                "1 - Greet\n" +
                        "2 - Even\n" +
                        "3 - Calc\n" +
                        "4 - GCD\n" +
                        "5 - Progression\n" +
                        "6 - Prime\n" +
                        "0 - Exit\n" +
                        "Your choice: "
        );

        int answer = scanner.nextInt();
        switch (answer) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                SecondGame.even();
                break;
            case 3:
                ThirdGame.calc();
                break;
            case 4:
                ForthGame.gcd();
                break;
            case 5:
                FifthGame.progression();
                break;
                case 6:
                SixthGame.prime();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Wrong command");
        }
    }
}
