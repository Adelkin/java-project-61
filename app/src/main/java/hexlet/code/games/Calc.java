package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        String[] operators = {"+", "-", "*"};

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            Random random = new Random();
            int number1 = random.nextInt(MAX_NUMBER);
            int number2 = random.nextInt(MAX_NUMBER);
            String operator = operators[random.nextInt(operators.length)];

            String question = number1 + " " + operator + " " + number2;
            String correctAnswer = calculate(number1, number2, operator);

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.startGame(roundsData, DESCRIPTION);
    }

    private static String calculate(int number1, int number2, String operator) {
        int result;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
        return Integer.toString(result);
    }
}
