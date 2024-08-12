package com.vivek.stack_queue.questions;
//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/description/
import java.util.Stack;

public class Leetcode1541 {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int insertions = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                    if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                        i++;
                    } else {
                        insertions++;
                    }
                } else {
                    insertions++;
                    if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                        i++;
                    } else {
                        insertions++;
                    }
                }
            }
        }

        insertions += stack.size() * 2;

        return insertions;
    }
}
