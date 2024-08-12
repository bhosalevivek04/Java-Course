package com.vivek.stack_queue.questions;
//https://www.hackerrank.com/challenges/game-of-two-stacks/problem?isFullScreen=true
import java.util.*;
public class TwoStacks {
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return twoStacksHelper(maxSum, a, b, 0, 0) - 1;
    }

    private static int twoStacksHelper(int x, List<Integer> a, List<Integer> b, int sum, int count) {
        if (sum > x) {
            return count;
        }
        if (a.isEmpty() || b.isEmpty()) {
            return count;
        }
        int ans1 = twoStacksHelper(x, a.subList(1, a.size()), b, sum + a.get(0), count + 1);
        int ans2 = twoStacksHelper(x, a, b.subList(1, b.size()), sum + b.get(0), count + 1);

        return Math.max(ans1, ans2);
    }
}
