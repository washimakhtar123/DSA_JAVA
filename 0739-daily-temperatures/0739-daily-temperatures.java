import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] ans = new int[n];

        // Stack will store indexes
        Stack<Integer> st = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove indexes whose temperature
            // is smaller or equal to current temperature
            while (!st.isEmpty() &&
                   temperatures[st.peek()] <= temperatures[i]) {

                st.pop();
            }

            // If stack is not empty,
            // top index contains the next warmer day
            if (!st.isEmpty()) {
                ans[i] = st.peek() - i;
            }

            // Store current index in stack
            st.push(i);
        }

        return ans;
    }
}