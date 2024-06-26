import java.util.ArrayList;
import java.util.List;

public class Leetcode17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return padRet("", digits);
    }

    private static final String[] KEYPAD = {
            "", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
    };

    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        String letters = KEYPAD[digit];
        ArrayList<String> list = new ArrayList<>();

        for (char ch : letters.toCharArray()) {
            list.addAll(padRet(p + ch, up.substring(1)));
        }

        return list;
    }
    
    // static void pad(String p, String up) {
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     int digit = up.charAt(0) - '0';
    //     for (int i = (digit - 2) * 3; i < digit * 3; i++) {
    //         char ch = (char) ('a' + i);
    //         pad(p + ch, up.substring(1));
    //     }
    // }

}