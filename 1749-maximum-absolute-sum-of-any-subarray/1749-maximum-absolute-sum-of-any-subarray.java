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

        