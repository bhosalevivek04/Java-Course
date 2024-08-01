package com.vivek.linkedlist;

public class Leetcode25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            ListNode tail = current;
            ListNode newEnd = current;

            // Check if there are at least k nodes left to reverse
            for (int i = 0; i < k; i++) {
                if (tail == null) {
                    return dummy.next;
                }
                tail = tail.next;
            }

            // Reverse k nodes
            ListNode last = prev;
            ListNode next = null;
            for (int i = 0; i < k; i++) {
                next = current.next;
                current.next = prev.next;
                prev.next = current;
                current = next;
            }

            newEnd.next = current;
            prev = newEnd;
        }

        return dummy.next;
    }

    public ListNode reverseAltKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            ListNode tail = current;
            ListNode newEnd = current;

            // Check if there are at least k nodes left to reverse
            for (int i = 0; i < k; i++) {
                if (tail == null) {
                    return dummy.next;
                }
                tail = tail.next;
            }

            // Reverse k nodes
            ListNode last = prev;
            ListNode next = null;
            for (int i = 0; i < k; i++) {
                next = current.next;
                current.next = prev.next;
                prev.next = current;
                current = next;
            }

            newEnd.next = current;
            for (int i = 0; i < k &&current!=null; i++) {
                prev=current;
                current=current.next;
            }
        }

        return dummy.next;
    }
}
