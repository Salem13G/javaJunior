package lesson5;

import static java.lang.Math.min;

public class DZNumbersMethods {
    public static int minNumber(int a, int b, int c) {
        int answer = Math.min(Math.min(a, b), Math.min(c, b));

        return answer;
    }

    public static int maxNumber(int a, int b, int c) {
        int answer = Math.max(Math.max(a, b), Math.max(b, c));
        return answer;

    }

}
