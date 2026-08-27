/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


 class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        // Dummy node helps when left = 1
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move prev to the node just before 'left'
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // curr points to the first node that we need to reverse
        ListNode curr = prev.next;

        // Reverse nodes one by one
        for (int i = 0; i < right - left; i++) {

            // Node that will be moved to the front
            ListNode next = curr.next;

            // Remove 'next' from its current position
            curr.next = next.next;

            // Put 'next' before curr
            next.next = prev.next;

            // Connect prev to the moved node
            prev.next = next;
        }

        return dummy.next;
    }
}