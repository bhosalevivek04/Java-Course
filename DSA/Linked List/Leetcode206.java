package com.vivek.linkedlist;

public class Leetcode206
{
    public static ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;

        while (present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if (next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}
