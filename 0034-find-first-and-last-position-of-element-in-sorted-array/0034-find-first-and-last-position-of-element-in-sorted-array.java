class Solution {
     public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int[] ans = new int[2];

        while(low<=high){
            if(nums[low]==target){
                ans[0]=low;
                while(low<high){
                    if(nums[high]==target){
                        ans[1]=high;
                        return ans;
                    }else high = high-1;
                }
                ans[1]=low;
                return ans;
            }else if(nums[low]<target){
                low = low+1;
            }else if(nums[high]>target){
                high=high-1;
            }
        }
        return new int[]{-1, -1};
    }
}