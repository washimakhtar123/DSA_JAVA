/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

import java.util.Stack;

class Solution {
    public ListNode removeNodes(ListNode head) {

        Stack<ListNode> st = new Stack<>();

        ListNode current = head;

        // Traverse the linked list
        while (current != null) {

            // Remove nodes smaller than current node
            while (!st.isEmpty() && st.peek().val < current.val) {
                st.pop();
            }

            // Add current node to stack
            st.push(current);

            current = current.next;
        }

        // Rebuild the linked list from stack
        ListNode next = null;

        while (!st.isEmpty()) {

            ListNode node = st.pop();

            node.next = next;
            next = node;
        }

        return next;
    }
}