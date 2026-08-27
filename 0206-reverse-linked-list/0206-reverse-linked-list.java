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
    public ListNode reverseList(ListNode head) {

        // Previous node initially null
        ListNode prev = null;

        // Current node starts from head
        ListNode curr = head;

        while (curr != null) {

            // Save the next node
            ListNode next = curr.next;

            // Reverse the current node's link
            curr.next = prev;

            // Move prev one step forward
            prev = curr;

            // Move curr one step forward
            curr = next;
        }

        // prev is the new head
        return prev;
    }
}