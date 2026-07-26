// import java.util.ArrayList;

// class Solution {
//     public int[] sortedSquares(int[] nums) {

//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();

//         // Separate negative and positive numbers
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] >= 0) {
//                 pos.add(nums[i] * nums[i]);
//             } else {
//                 neg.add(nums[i] * nums[i]);
//             }
//         }

//         int[] result = new int[nums.length];

//         int i = neg.size() - 1; // negative squares in reverse order
//         int j = 0;
//         int k = 0;

//         // Merge two sorted lists
//         while (i >= 0 && j < pos.size()) {
//             if (neg.get(i) <= pos.get(j)) {
//                 result[k++] = neg.get(i--);
//             } else {
//                 result[k++] = pos.get(j++);
//             }
//         }

//         while (i >= 0) {
//             result[k++] = neg.get(i--);
//         }

//         while (j < pos.size()) {
//             result[k++] = pos.get(j++);
//         }

//         return result;
//     }
// }


class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int k = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[k] = leftSquare;
                left++;
            } else {
                result[k] = rightSquare;
                right--;
            }

            k--;
        }

        return result;
    }
}