import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of every character
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int result = 0;
        boolean hasOdd = false;

        // Check frequency of every character
        for (char ch : map.keySet()) {

            int freq = map.get(ch);

            // Use the even part of frequency
            result += (freq / 2) * 2;

            // If frequency is odd,
            // one character can potentially be used in center
            if (freq % 2 == 1) {
                hasOdd = true;
            }
        }

        // One odd character can be placed in the center
        if (hasOdd) {
            result++;
        }

        return result;
    }
}