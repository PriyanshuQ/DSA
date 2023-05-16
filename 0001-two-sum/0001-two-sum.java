class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num2 = target-nums[i];
            if(map.containsKey(num2)){
                result[0]=i;
                result[1]=map.get(num2);
            }
            map.put(nums[i], i);
        }
        return result;
    }
}