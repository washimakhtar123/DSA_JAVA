class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding=nums[0];
        int minEnding=nums[0];

        int maxSum=nums[0];
        int minSum=nums[0];

        int res=Math.abs(nums[0]);

        for(int i=1; i<nums.length; i++){

            maxEnding=Math.max(nums[i],maxEnding+nums[i]);
            minEnding=Math.min(nums[i],minEnding+nums[i]);

            maxSum=Math.max(maxSum,maxEnding);
            minSum=Math.min(minSum,minEnding);

            res=Math.max(Math.abs(maxSum), Math.abs(minSum));
        }
        return res;
    }
}



// class Solution {
//     public int maxAbsoluteSum(int[] nums) {

//         // Current index par ending maximum subarray sum
//         int maxEnding = nums[0];

//         // Current index par ending minimum subarray sum
//         int minEnding = nums[0];

//         // Ab tak ka maximum subarray sum
//         int maxSum = nums[0];

//         // Ab tak ka minimum subarray sum
//         int minSum = nums[0];

//         // Final maximum absolute sum store karega
//         int res =Math.abs(nums[0]);

//         for (int i = 1; i < nums.length; i++) {

//             // Maximum subarray:
//             // Ya to current element se naya subarray start karo
//             // Ya previous maxEnding ke saath current element add karo
//             maxEnding = Math.max(nums[i], maxEnding + nums[i]);

//             // Minimum subarray:
//             // Ya to current element se naya subarray start karo
//             // Ya previous minEnding ke saath current element add karo
//             minEnding = Math.min(nums[i], minEnding + nums[i]);

//             // Ab tak ka maximum subarray sum update karo
//             maxSum = Math.max(maxSum, maxEnding);

//             // Ab tak ka minimum subarray sum update karo
//             minSum = Math.min(minSum, minEnding);

//             // Maximum positive sum ya minimum negative sum
//             // dono me se jiska absolute value bada hai, wahi answer
//             res = Math.max(Math.abs(maxSum), Math.abs(minSum));
//         }

//         // Final maximum absolute subarray sum return karo
//         return res;
//     }
// }
        