package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int MIN_START = 1;
    private static final int MAX_START = 10;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 5;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        String gameDescription = "What number is missing in the progression?";

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.startGame(roundsData, gameDescription);
    }

    private static String[] generateRoundData() {
        Random random = new Random();

        int length = MIN_LENGTH + random.nextInt(MAX_LENGTH - MIN_LENGTH + 1);
        int start = MIN_START + random.nextInt(MAX_START);
        int step = MIN_STEP + random.nextInt(MAX_STEP);

        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }

        int hiddenIndex = random.nextInt(length);
        String correctAnswer = String.valueOf(progression[hiddenIndex]);


        progression[hiddenIndex] = -1;

        StringBuilder question = new StringBuilder();
        for (int number : progression) {
            if (number == -1) {
                question.append(".. ");
            } else {
                question.append(number).append(" ");
            }
        }

        return new String[]{question.toString().trim(), correctAnswer};
    }
}
