import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int low = 0;
        int maxLen = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            int k = high - low + 1;

            while (map.size() < k) {

                char leftChar = s.charAt(low);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                low++;

                k = high - low + 1;
            }

            maxLen = Math.max(maxLen, k);
        }

        return maxLen;
    }
}