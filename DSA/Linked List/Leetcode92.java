package com.vivek.linkedlist;

class Leetcode92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        for (int i = 1; current != null && i < left; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        ListNode next = null;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
}
