package hexlet.code.games;

import hexlet.code.Engine;

import hexlet.code.Utils;

public class GCD {
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.startGame(roundsData, gameDescription);
    }

    private static String[] generateRoundData() {
        int number1 = Utils.getRandomNumber(1, MAX_NUMBER);
        int number2 = Utils.getRandomNumber(1, MAX_NUMBER);
        String question = number1 + " " + number2;
        String correctAnswer = String.valueOf(findGCD(number1, number2));

        return new String[]{question, correctAnswer};
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
