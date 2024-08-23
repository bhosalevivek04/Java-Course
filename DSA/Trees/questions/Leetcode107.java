package com.vivek.trees.questions;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Leetcode107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.pollFirst();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.addLast(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.addLast(currentNode.right);
                }
            }
            // Instead of adding to the end, add the current level to the start of the result list
            result.add(0, currentLevel);
        }
        return result;
    }
}
