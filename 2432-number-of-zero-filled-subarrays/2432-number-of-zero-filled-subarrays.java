class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        long length = 0;
        for(int i:nums){
            if(i==0) res+= ++length;
            else length = 0;
        }
        return res;
    }
}