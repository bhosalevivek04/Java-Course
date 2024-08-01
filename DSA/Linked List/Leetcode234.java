package com.vivek.linkedlist;

import static com.vivek.linkedlist.Leetcode206.reverseList;
import static com.vivek.linkedlist.Leetcode876.middleNode;

public class Leetcode234 {
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode headSecond=reverseList(mid);
        ListNode rereverseHead=headSecond;
        while (head != null && headSecond != null) {

            if (head.val!=headSecond.val){
                break;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        reverseList(rereverseHead);
        return head==null||headSecond==null;
    }

}
