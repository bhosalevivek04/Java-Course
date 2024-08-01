package com.vivek.linkedlist;

import static com.vivek.linkedlist.Leetcode206.reverseList;
import static com.vivek.linkedlist.Leetcode876.middleNode;

public class Leetcode143 {
    public void reorderList(ListNode head) {
        if (head==null||head.next==null){
            return;
        }
        ListNode mid=middleNode(head);

        ListNode hs=reverseList(mid);
        ListNode hf=head;

        while (hf!=null&&hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if (hf!=null){
            hf.next=null;
        }
    }
}
