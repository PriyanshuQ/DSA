class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        int count = 0;
        for(int i:nums){
            if(!set.contains(i-1)){
                int curr = i;
                int streak=1;
                while(set.contains(curr+1)){
                    curr++;
                    streak++;
                }
                count = Math.max(streak, count);
            }
        }
        return count;
    }
}