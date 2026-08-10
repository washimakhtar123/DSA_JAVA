import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // sum = 0 has occurred once
        // because empty array ka sum = 0 hota hai
        map.put(0, 1);

        int sum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            // We need previous sum = sum - k
            if (map.containsKey(sum - k)) {
                result += map.get(sum - k);
            }

            // Store current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}

