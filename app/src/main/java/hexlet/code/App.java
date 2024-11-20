package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCDGAME = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);

        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case GREET -> Cli.greet();
            case EVEN -> Even.start();
            case CALC -> Calc.start();
            case GCDGAME -> GCD.start();
            case PROGRESSION -> Progression.start();
            case PRIME -> Prime.start();
            case EXIT -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice. Exiting...");
        }

        scanner.close();
    }
}
