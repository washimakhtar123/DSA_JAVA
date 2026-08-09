class Solution {
    public int pivotIndex(int[] nums) {

        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];

        // Fill the prefix array
        // prefix[i] = i ke LEFT side ka total sum
        prefix[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        // Fill the suffix array
        // suffix[i] = i ke RIGHT side ka total sum
        suffix[nums.length - 1] = 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i + 1];
        }

        // Compare prefix and suffix at SAME index
        for (int i = 0; i < nums.length; i++) {

            if (prefix[i] == suffix[i]) {
                return i;
            }
        }

        return -1;
    }
}