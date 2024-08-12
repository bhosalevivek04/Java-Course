package com.vivek.stack_queue.questions;

import java.util.Stack;
//https://leetcode.com/problems/implement-queue-using-stacks/
public class MyQueue {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int item) {
        first.push(item);
    }

    public int pop() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }

        if (!second.isEmpty()) {
            return second.pop();
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }

    public int peek() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }

        if (!second.isEmpty()) {
            return second.peek();
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}