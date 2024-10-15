package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void startGame(String[][] roundsData, String gameDescription) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");

        System.out.println(gameDescription);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + roundsData[i][0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();

            if (playerAnswer.equals(roundsData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + playerAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + roundsData[i][1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
