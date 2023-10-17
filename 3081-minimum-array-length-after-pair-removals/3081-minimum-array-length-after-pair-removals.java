class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int i = 0;
        if((long)nums.get(0) == (long)nums.get(nums.size() - 1)) return nums.size(); 
        int max = 0;
       while(i < nums.size()) {
           int j = i + 1;
           while(j < nums.size() && nums.get(i) == nums.get(j)) j++;
           int temp = j - i;
           if(temp > 1) max = Math.max(temp, max);
           i = j;
       }
        
        int cnt = 0;
        
        int distinct = nums.size() - max;
        if(distinct >= max) {
            if(nums.size() % 2 != 0) cnt++;
        }
        else cnt += max - distinct;
        return cnt;
    }
}