class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = left + (right-left)/2;

        while(left<=right){
            mid = left+(right-left)/2;
            if(nums[mid]>target) right=mid-1;
            else if(nums[mid]<target) left=mid+1;
            else return mid;
        }
        return right+1;
    }
}
