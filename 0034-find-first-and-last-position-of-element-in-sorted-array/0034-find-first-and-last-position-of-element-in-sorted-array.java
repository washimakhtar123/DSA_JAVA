class Solution {
    public int[] searchRange(int[] nums, int target) {

        // First occurrence find karo
        int first = findFirst(nums, target);

        // Last occurrence find karo
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    // First occurrence find karne ka function
    public int findFirst(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {

                // Target mil gaya, answer store karo
                ans = mid;

                // Ab left side mein aur pehla occurrence check karo
                high = mid - 1;

            } else if (nums[mid] < target) {

                // Target right side mein hoga
                low = mid + 1;

            } else {

                // Target left side mein hoga
                high = mid - 1;
            }
        }

        return ans;
    }

    // Last occurrence find karne ka function
    public int findLast(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {

                // Target mil gaya, answer store karo
                ans = mid;

                // Ab right side mein last occurrence check karo
                low = mid + 1;

            } else if (nums[mid] < target) {

                // Target right side mein hoga
                low = mid + 1;

            } else {

                // Target left side mein hoga
                high = mid - 1;
            }
        }

        return ans;
    }
}