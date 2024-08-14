package com.vivek.trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        BinaryTree tree=new BinaryTree();
//        tree.populate(scanner);
////        tree.display();
//        tree.preetyDisplay();
//        scanner.close();

//        BST tree = new BST();
//        int[] nums = {1,2,3,4,5,6};
//        tree.populatedSorted(nums);
//        tree.display();

        BinaryTree tree=new BinaryTree();
        Scanner scanner=new Scanner(System.in);
        tree.populate(scanner);
        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
    }
}
