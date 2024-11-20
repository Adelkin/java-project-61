package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

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
        int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
        int start = Utils.getRandomNumber(MIN_START, MAX_START);
        int step = Utils.getRandomNumber(MIN_STEP, MAX_STEP);

        int[] progression = generateProgression(start, step, length);
        int hiddenIndex = Utils.getRandomNumber(0, length - 1);

        String correctAnswer = String.valueOf(progression[hiddenIndex]);
        progression[hiddenIndex] = -1;

        StringBuilder question = new StringBuilder();
        for (int number : progression) {
            question.append(number == -1 ? ".. " : number + " ");
        }

        return new String[]{question.toString().trim(), correctAnswer};
    }

    private static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
}
