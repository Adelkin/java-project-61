package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final int MAX_NUMBER = 100;
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void start() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.startGame(roundsData, DESCRIPTION);
    }

    private static String[] generateRoundData() {
        int number1 = Utils.getRandomNumber(MAX_NUMBER);
        int number2 = Utils.getRandomNumber(MAX_NUMBER);
        String operator = OPERATORS[Utils.getRandomNumber(OPERATORS.length)];

        String question = number1 + " " + operator + " " + number2;
        String correctAnswer = Integer.toString(calculate(number1, number2, operator));

        return new String[]{question, correctAnswer};
    }

    private static int calculate(int number1, int number2, String operator) {
        return switch (operator) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };
    }
}
