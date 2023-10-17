class Solution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);
        int n=0;
        int ways=0;

        for(int i=0;i<nums.size();i++){
            if(i==0 && n<nums.get(i)) ways++;
            if(i>0 && n>nums.get(i-1) && n<nums.get(i)) ways++;
            n++;
        }
        if(n>nums.get(nums.size()-1)) ways++;
        return ways;
    }
}