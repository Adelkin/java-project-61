package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final int MAX_NUMBER = 100;
    private static final int ROUNDS = 3;

    public static void start() {
        String[][] roundsData = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            Random random = new Random();
            int number1 = random.nextInt(MAX_NUMBER) + 1;
            int number2 = random.nextInt(MAX_NUMBER) + 1;
            String question = number1 + " " + number2;
            String correctAnswer = String.valueOf(findGCD(number1, number2));
            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.startGame(roundsData, "Find the greatest common divisor of given numbers.");
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
