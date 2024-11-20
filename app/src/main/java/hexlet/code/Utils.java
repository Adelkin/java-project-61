package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();

    public static int getRandomNumber(int max) {
        return RANDOM.nextInt(max);
    }

    public static int getRandomNumber(int min, int max) {
        return min + RANDOM.nextInt(max - min + 1);
    }
}
