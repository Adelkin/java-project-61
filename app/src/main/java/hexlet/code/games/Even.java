package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.startGame(roundsData, gameDescription);
    }

    private static String[] generateRoundData() {
        int number = Utils.getRandomNumber(MAX_NUMBER);
        String question = String.valueOf(number);
        String correctAnswer = isEven(number) ? "yes" : "no";

        return new String[]{question, correctAnswer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
