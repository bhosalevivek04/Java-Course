package com.vivek.trees.questions;

public class Leetcode104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        int depth=Math.max(leftHeight, rightHeight) + 1;
        return depth;
    }
}
