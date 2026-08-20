import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        // Traverse every digit
        for (char digit : num.toCharArray()) {

            // Remove bigger digits from stack
            // if we still have digits to remove
            while (!st.isEmpty()
                    && k > 0
                    && st.peek() > digit) {

                st.pop();
                k--;
            }

            // Add current digit to stack
            st.push(digit);
        }

        // If k is still remaining,
        // remove digits from the end
        while (k > 0) {
            st.pop();
            k--;
        }

        // Build the answer
        StringBuilder ans = new StringBuilder();

        for (char ch : st) {
            ans.append(ch);
        }

        // Remove leading zeros
        int i = 0;

        while (i < ans.length() - 1 && ans.charAt(i) == '0') {
            i++;
        }

        ans = new StringBuilder(ans.substring(i));

        // If nothing is left, return "0"
        if (ans.length() == 0) {
            return "0";
        }

        return ans.toString();
    }
}