package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final int ROUNDS = 3;
    private static final int MAX_NUMBER = 100; // Константа для максимального числа
    private static final Random RANDOM = new Random();

    public static void start() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            int number = RANDOM.nextInt(MAX_NUMBER);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            roundsData[i][0] = String.valueOf(number);
            roundsData[i][1] = correctAnswer;
        }

        Engine.startGame(roundsData, gameDescription);
    }
}
