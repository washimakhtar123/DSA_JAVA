class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0;
        int result = Integer.MAX_VALUE;

         int sum=0;
        while(high<nums.length){//company hiring fire concep based question
            sum=sum+nums[high];//yha hire ker rhi 
            while(sum>=target){// yha chek ker rhi hai 
                int len=high-low+1;//yha chek ker rhi kitne log kaam ker rhe hai ager o target k barber hai to 
                result=Math.min(result, len);

                sum=sum-nums[low];// yha fire ker rhi hai logo tak tak jab tak sub na fire ho jaye
                low++;
            }
            high++;// jo bache hai unko hire ker rhi ahi
        }
      return result == Integer.MAX_VALUE ? 0 : result;        
    }
}