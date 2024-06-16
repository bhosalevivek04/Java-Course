import java.lang.reflect.Array;

public class Leetcode3110 {
    public static void main(String[] args) {
        System.out.println(scoreOfString("zaz"));
    }

    // public static int scoreOfString(String s) {
    //     int score = 0;
    //     int[] asciiValues = new int[s.length()];

    //     for (int i = 0; i < s.length(); i++) {
    //         asciiValues[i] = (int) s.charAt(i);
    //     }

    //     for (int i = 0; i < asciiValues.length - 1; i++) {
    //         score += Math.abs(asciiValues[i] - asciiValues[i + 1]);
    //     }
    //     return score;
    // }

    public static int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs( s.charAt(i) - s.charAt(i+1));
        }
        return score;
    }
}