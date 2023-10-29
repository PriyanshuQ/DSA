class Solution {
    public int jump(int[] nums) {
        int current=0, farthest=0, jumps=0;
        for(int i=0;i<nums.length-1;i++){
            farthest= Math.max(farthest, nums[i]+i);
            if(i==current){
                current= farthest;
                jumps++;
            }
        }
        return jumps;
    }
}

//far=2 curr=2 jump=1
//far=4 curr=4 jump=2

//When i is equal to current, it means that we have reached the maximum reachable position from the previous jump. This indicates that we need to make another jump to continue moving forward.