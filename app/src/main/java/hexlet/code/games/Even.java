package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final int ROUNDS = 3;
    private static final Random RANDOM = new Random();

    public static void start() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            int number = RANDOM.nextInt(100);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            roundsData[i][0] = String.valueOf(number);
            roundsData[i][1] = correctAnswer;
        }

        Engine.startGame(roundsData, gameDescription);
    }
}
