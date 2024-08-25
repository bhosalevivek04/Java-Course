package com.vivek.trees.questions;

public class Leetcode108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return populateSorted(nums, 0, nums.length - 1);
    }

    private TreeNode populateSorted(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = populateSorted(nums, start, mid - 1);
        node.right = populateSorted(nums, mid + 1, end);
        return node;
    }
}
