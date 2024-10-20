package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.startGame(roundsData, gameDescription);
    }

    private static String[] generateRoundData() {
        Random random = new Random();
        int number = MIN_NUMBER + random.nextInt(MAX_NUMBER);

        String correctAnswer = isPrime(number) ? "yes" : "no";
        String question = String.valueOf(number);

        return new String[]{question, correctAnswer};
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
