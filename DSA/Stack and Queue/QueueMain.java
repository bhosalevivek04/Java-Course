package com.vivek.stack_queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue=new CustomQueue(5);
//        queue.insert(5);
//        queue.insert(10);
//        queue.insert(15);
//        queue.insert(20);
//        queue.insert(25);
//
//        queue.display();
//        System.out.println(queue.remove());
//        queue.display();

//        CircularQueue queue=new CircularQueue(5);
//        queue.insert(5);
//        queue.insert(10);
//        queue.insert(15);
//        queue.insert(20);
//        queue.insert(25);
//
//        queue.display();
//        queue.remove();
//        queue.insert(133);
//        queue.display();

        DynamicQueue queue=new DynamicQueue(5);
        queue.insert(5);
        queue.insert(10);
        queue.insert(15);
        queue.insert(20);
        queue.insert(25);
        queue.insert(133);

        queue.display();
//        queue.remove();
//        queue.display();

    }
}
