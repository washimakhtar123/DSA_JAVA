import java.util.Stack;

class Solution {
    public String removeDuplicates(String s, int k) {

        // Stack stores:
        // [character, count]
        Stack<int[]> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // If stack is not empty and
            // top character is same as current character
            if (!st.isEmpty() && st.peek()[0] == ch) {

                // Increase the count
                st.peek()[1]++;

                // If count becomes k,
                // remove the complete group
                if (st.peek()[1] == k) {
                    st.pop();
                }

            } else {

                // New character, so start count from 1
                st.push(new int[]{ch, 1});
            }
        }

        // Build the final answer
        StringBuilder ans = new StringBuilder();

        for (int[] pair : st) {

            // Add character according to its count
            for (int i = 0; i < pair[1]; i++) {
                ans.append((char) pair[0]);
            }
        }

        return ans.toString();
    }
}