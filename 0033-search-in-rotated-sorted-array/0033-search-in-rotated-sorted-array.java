class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            // Middle index
            int mid = low + (high - low) / 2;

            // Target mil gaya
            if (nums[mid] == target) {
                return mid;
            }

            // Check karo left half sorted hai ya nahi
            if (nums[low] <= nums[mid]) {

                // Agar target left sorted range ke andar hai
                if (nums[low] <= target && target < nums[mid]) {

                    // Left side mein search karo
                    high = mid - 1;

                } else {

                    // Target right side mein hoga
                    low = mid + 1;
                }

            } else {

                // Right half sorted hai

                // Agar target right sorted range ke andar hai
                if (nums[mid] < target && target <= nums[high]) {

                    // Right side mein search karo
                    low = mid + 1;

                } else {

                    // Target left side mein hoga
                    high = mid - 1;
                }
            }
        }

        // Target nahi mila
        return -1;
    }
}