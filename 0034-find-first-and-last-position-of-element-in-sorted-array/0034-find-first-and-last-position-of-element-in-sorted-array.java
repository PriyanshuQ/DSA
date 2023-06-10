class Solution {
     public int[] searchRange(int[] nums, int target) {
       int left = 0 ;
        int right = nums.length -1;
        int output [] = new int[2];
            while (left <= right){
               if (nums[left] == target){
                   output[0] = left;
                    while (left < right){
                        if (nums[right] == target ){
                            output[1] = right;
                            return output;
                        }else {
                            right = right - 1;
                        }
                    }
                    output[1] = left;
                   return output;
               }else if (nums[left] < target){
                   left = left + 1;
               }else if (nums[right] > target) {
                   right = right - 1;
               }
            }
        return new int[] {-1 , -1};
    }
}