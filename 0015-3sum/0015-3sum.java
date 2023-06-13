class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int target = 0;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(target==sum){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(sum<target)j++;
                else k--;                
            }
        }
        list.addAll(set);
        return list;
    }
}

