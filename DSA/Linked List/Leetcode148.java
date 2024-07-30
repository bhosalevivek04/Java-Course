package com.vivek.linkedlist;

import org.w3c.dom.Node;

public class Leetcode148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }
//    public void bubbleSort(){
//        bubbleSort(size-1,0);
//    }
//    private void bubbleSort(int row, int col ){
//        if (row==0){
//            return;
//        }
//        if (col<row){
//            Node first=get(col);
//            Node second=get(col+1);
//
//            if (first.value>second.value){
//                if (first==hand){
//                    head=second;
//                    first.next=second.next;
//                    second.next=first;
//                }else if(second==tail){
//                    Node prev=get(col -1);
//                    prev.next=second;
//                    tail=first;
//                    first.next=null;
//                    second.next=tail;
//                }else {
//                    Node prev=get(col -1);
//                    prev.next=second;
//                    first.next=second.next;
//                    second.next=first;
//                }
//            }
//            bubbleSort(row,col+1);
//        }else{
//           bubbleSort(row-1,0);
//        }
//    }

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
