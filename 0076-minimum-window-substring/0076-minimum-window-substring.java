class Solution {

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] freq = new int[256];

        // Store frequency of t
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]++;
        }

        int low = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        int count = t.length();

        for (int high = 0; high < s.length(); high++) {

            if (freq[s.charAt(high)] > 0) {
                count--;
            }

            freq[s.charAt(high)]--;

            while (count == 0) {

                int len = high - low + 1;

                if (len < minLen) {
                    minLen = len;
                    start = low;
                }

                freq[s.charAt(low)]++;

                if (freq[s.charAt(low)] > 0) {
                    count++;
                }

                low++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}