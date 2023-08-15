class Solution {
    public int maxSum(int[] nums){
        int ans=-1;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int t=nums[i], maxDigit=0;
            while(t!=0){
                maxDigit=Math.max(t%10, maxDigit);
                t=t/10;
            }
            if(!map.containsKey(maxDigit)) map.put(maxDigit, new ArrayList<>());
            map.get(maxDigit).add(nums[i]);
        }
        for(Map.Entry<Integer, List<Integer>> entry:map.entrySet()){
            entry.getValue().sort(Comparator.reverseOrder());
            if(entry.getValue().size()>=2) ans=Math.max(ans, entry.getValue().get(0)+entry.getValue().get(1));
        }
        return ans;
    }
}