package com.vivek.trees.questions;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;

public class Leetcode297 {
    // Encodes a tree to a single string.
    public List<String> serialize(TreeNode root) {
        List<String> list=new ArrayList<>();
        helper(root,list);
        return list;
    }
    void helper(TreeNode node,List<String> list){
        if (node==null){
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));
        helper(node.left,list);
        helper(node.right,list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<String> data) {
        reverse(data);
        TreeNode node=helper2(data);
        return node;
    }

    private TreeNode helper2(List<String> list) {
        String val=list.remove(list.size()-1);
        if (val.charAt(0)=='n'){
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(val));
        node.left=helper2(list);
        node.right=helper2(list);
        return node;
    }
//    static TreeNode res;
//    // Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//        res = root;
//        return "";
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        return res;
//    }
}
