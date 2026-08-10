class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Remainder 0 has occurred once
        map.put(0, 1);

        int sum = 0;
        int result = 0;

        for (int num : nums) {

            sum += num;

            // Java can give negative remainder
            int rem = ((sum % k) + k) % k;

            // Previous same remainder => divisible subarrays
            result += map.getOrDefault(rem, 0);

            // Store this remainder
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return result;
    }
}