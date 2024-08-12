package com.vivek.stack_queue.questions;
//https://leetcode.com/problems/implement-queue-using-stacks/
import java.util.Stack;

public class MyQueue2 {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue2() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(x);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public int pop() {
        if (first.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return first.pop();
    }

    public int peek() {
        if (first.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return first.peek();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
