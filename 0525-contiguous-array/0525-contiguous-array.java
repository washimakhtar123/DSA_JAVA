class Solution {
    public int findMaxLength(int[] nums) {

        int n = nums.length;
        int zero = 0;
        int one = 0;
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // for subarray starting from index 0
        map.put(0, -1);

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                zero++;
            } else {
                one++;
            }

            int diff = zero - one;

            if (!map.containsKey(diff)) {
                map.put(diff, i);
            } else {
                int idx = map.get(diff);

                res = Math.max(res, i - idx);
            }
        }

        return res;
    }
}