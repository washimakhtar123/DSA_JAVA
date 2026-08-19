import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        // Initially, assume that no greater element exists
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        // Stack will store elements for finding next greater element
        Stack<Integer> st = new Stack<>();

        // Traverse the array twice because it is circular
        for (int i = 2 * n - 1; i >= 0; i--) {

            // Convert current index into valid array index
            int index = i % n;

            // Remove all elements smaller than or equal to current element
            // because they cannot be the next greater element
            while (!st.isEmpty() && st.peek() <= nums[index]) {
                st.pop();
            }

            // We only need to update answer during the first traversal
            if (i < n) {

                // If stack is not empty, top is the next greater element
                if (!st.isEmpty()) {
                    ans[index] = st.peek();
                }
            }

            // Push current element into stack
            st.push(nums[index]);
        }

        return ans;
    }
}