import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {

        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of every character
        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first character
        // whose frequency is exactly 1
        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (map.get(ch) == 1) {
                return i;
            }
        }

        // No unique character found
        return -1;
    }
}