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
    public ListNode reverseKGroup(ListNode head, int k) {

        // Dummy node helps us handle the first group
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // prev points to the node before current group
        ListNode prev = dummy;

        while (true) {

            // Find the kth node of current group
            ListNode kth = prev;

            for (int i = 0; i < k; i++) {

                kth = kth.next;

                // Less than k nodes are remaining
                // so we don't reverse this group
                if (kth == null) {
                    return dummy.next;
                }
            }

            // Store the node after current group
            ListNode nextGroup = kth.next;

            // Start reversing the group
            ListNode curr = prev.next;
            ListNode previous = nextGroup;

            while (curr != nextGroup) {

                // Save next node
                ListNode next = curr.next;

                // Reverse the link
                curr.next = previous;

                // Move previous forward
                previous = curr;

                // Move current forward
                curr = next;
            }

            // Save the old first node
            // because after reversing it becomes the last node
            ListNode groupStart = prev.next;

            // Connect prev to the new first node
            prev.next = kth;

            // Move prev to the end of reversed group
            prev = groupStart;
        }
    }
}