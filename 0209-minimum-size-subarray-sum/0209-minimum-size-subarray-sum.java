class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int low=0;
        int high=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;

        while(high<nums.length){
            sum+=nums[high++];
            while(sum>=target){
                minLength=Math.min(minLength, high-low);
                sum-=nums[low++];
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}