class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n==0) return 0;
        if(n==1) return nums[0];
        
        int[] money = new int[n];
        money[0] = nums[0];
        money[1] = Math.max(nums[0], nums[1]);
        
        for(int i=2; i<n; i++){
            money[i] =Math.max(money[i-1], money[i-2] + nums[i]);
        }
        return money[n-1];
    }
}
