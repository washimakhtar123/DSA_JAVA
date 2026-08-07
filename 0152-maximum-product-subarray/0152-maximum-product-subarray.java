class Solution {
    public int maxProduct(int[] nums) {
        int minEnding=nums[0];
        int maxEnding=nums[0];
        int ans=nums[0];

        for(int i=1; i<nums.length; i++){
            int c1=nums[i];
            int c2=minEnding*nums[i];
            int c3=maxEnding*nums[i];

            maxEnding=Math.max(c1,Math.max(c2,c3));
            minEnding=Math.min(c1,Math.min(c2,c3));
            ans=Math.max(ans,Math.max(maxEnding,minEnding));

        }
        return ans;
    }
}