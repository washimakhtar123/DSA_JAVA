class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=nums[0];

        int maxEnding=nums[0];
        int  maxSum=nums[0];

        int minEnding=nums[0];
        int  minSum=nums[0];

        for(int i=1; i<nums.length; i++){
            totalSum+=nums[i];

            //normal kadans s maxSubArryaSum nukalna hai
            maxEnding=Math.max(nums[i],maxEnding+nums[i]);
            maxSum=Math.max(maxSum,maxEnding);

            //normal kadans s minSubArryaSum nukalna hai
            minEnding=Math.min(nums[i],minEnding+nums[i]);
            minSum=Math.min(minSum,minEnding);
        }

         // Agar saare elements negative hain
        if (maxSum < 0) {
            return maxSum;
        }
          // Circular maximum = total - minimum subarray
          int CirculerMaximum=totalSum-minSum;

           // Normal maximum vs circular maximum
           return Math.max(maxSum,CirculerMaximum);

    }
}