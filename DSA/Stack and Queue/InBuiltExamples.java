package com.vivek.stack_queue;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack=new Stack<>();
//        stack.push(34);
//        stack.push(54);
//        stack.push(2);
//        stack.push(53);
//        stack.push(32);
//
//        System.out.println(stack.pop());
//        System.out.println(stack);
//
//
//        Queue<Integer> queue=new LinkedList<>();
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//        queue.add(6);
//        queue.add(7);
//
//        System.out.println(queue.remove());

        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(89);
        deque.addLast(43);
        deque.removeFirst();
        System.out.println(deque);
    }
}
