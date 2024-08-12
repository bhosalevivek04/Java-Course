package com.vivek.stack_queue.questions;

import java.util.Map;
import java.util.Stack;

//https://leetcode.com/problems/largest-rectangle-in-histogram/description/
public class Leetcode84 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int max=0;
        stack.push(0);
        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty()&& heights[i]<heights[stack.peek()]){
                max=getMax(heights,stack,max,i);
            }
            stack.push(i);
        }
        int i= heights.length;
        while (!stack.isEmpty())
        {
            max=getMax(heights,stack,max,i);
        }
        return max;
    }

    private int getMax(int[] heights, Stack<Integer> stack, int max, int i) {
        int area;
        int popped=stack.pop();
        if (stack.isEmpty()){
            area=heights[popped]*i;
        }else{
            area=heights[popped]*(i-1-stack.peek());
        }
        return Math.max(max,area);
    }
}