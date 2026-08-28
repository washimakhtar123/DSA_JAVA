/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        // If list is empty or nothing needs to be reversed
        if (head == null || left == right) {
            return head;
        }

        // 'before' will point to the node before left
        ListNode before = null;

        // curr will reach the left position
        ListNode curr = head;

        int pos = 1;

        // Move curr to the 'left' position
        while (pos < left) {
            before = curr;
            curr = curr.next;
            pos++;
        }

        // Save the first node of the reversing part
        ListNode first = curr;

        // Normal linked-list reversal
        ListNode prev = null;

        while (pos <= right) {

            // Save next node
            ListNode next = curr.next;

            // Reverse the link
            curr.next = prev;

            // Move prev forward
            prev = curr;

            // Move curr forward
            curr = next;

            pos++;
        }

        // Connect the node before 'left'
        // with the new first node of reversed part
        if (before != null) {
            before.next = prev;
        } else {
            // If left == 1, prev becomes the new head
            head = prev;
        }

        // 'first' is now the last node of reversed part
        // Connect it with the remaining list
        first.next = curr;

        return head;
    }
}