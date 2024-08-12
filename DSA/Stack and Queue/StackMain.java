package com.vivek.stack_queue;

public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stack=new CustomStack(5);
        DynamicStack stack=new DynamicStack(5);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

//        System.out.println(stack.peek());
    }
}
