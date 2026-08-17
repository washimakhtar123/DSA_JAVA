import java.util.Stack;

class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = st.pop();
        }
    }
}
