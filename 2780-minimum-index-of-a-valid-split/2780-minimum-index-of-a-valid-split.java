class Solution{
    public int minimumIndex(List<Integer> nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums) map.put(i, map.getOrDefault(i, 0)+1);

        Map<Integer, Integer> map1 = new HashMap<>();
        int n = nums.size(), ans=-1;

        for(int i=0;i<n;i++){
            int num = nums.get(i);
            if(map.get(num)==1) continue;

            map1.put(num, map1.getOrDefault(num, 0)+1);
            map.put(num, map.get(num)-1);

            int left = map1.get(num), right = map.get(num);
            if(left*2>(i+1) && (right*2>(n-i-1))){
                ans=i;
                break;
            }
        }
        return ans;
    }
}