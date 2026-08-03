class Solution {
    public void sortColors(int[] nums) {
        //brute force approach
    //     int zero = 0;
    //     int one = 0;
    //     int two = 0;

    //     // Count 0s, 1s, and 2s
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] == 0) {
    //             zero++;
    //         } else if (nums[i] == 1) {
    //             one++;
    //         } else {
    //             two++;
    //         }
    //     }

    //     // Fill 0s
    //     int index = 0;
    //     for (int i = 0; i < zero; i++) {
    //         nums[index++] = 0;
    //     }

    //     // Fill 1s
    //     for (int i = 0; i < one; i++) {
    //         nums[index++] = 1;
    //     }

    //     // Fill 2s
    //     for (int i = 0; i < two; i++) {
    //         nums[index++] = 2;
    //     }
    // }

    //optimal approach
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else { // nums[mid] == 2
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}