class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        recurssion(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    void recurssion(int index, int[] nums, List<Integer>ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds)); 
        for(int i = index;i<nums.length;i++) {
            if(i!=index && nums[i] == nums[i-1]) continue; 
            ds.add(nums[i]); 
            recurssion(i+1, nums, ds, ans); 
            ds.remove(ds.size() - 1);
        }
    }
}