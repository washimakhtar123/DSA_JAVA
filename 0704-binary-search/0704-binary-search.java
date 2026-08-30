class Solution {
    public int search(int[] nums, int target) {
        // Low pointer starting index par hai
        int low = 0;
        // High pointer last index par hai
        int high = nums.length - 1;
        // Jab tak search range valid hai
        while (low <= high) {
            // Middle index find kar rahe hain
            int guess = (low + high) / 2;
            // Agar middle element target ke equal hai
            // to uska index return kar do
            if (nums[guess] == target) {
                return guess;
            // Agar middle element target se chhota hai
            // to target right side mein hoga
            } else if (nums[guess] < target) {
                low = guess + 1;
            // Agar middle element target se bada hai
            // to target left side mein hoga
            } else {
                high = guess - 1;
            }
        }
        // Target nahi mila
        return -1;
    }
}