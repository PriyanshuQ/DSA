class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pint = new ArrayList<>();
        ArrayList<Integer> nint = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) pint.add(nums[i]);
            else nint.add(nums[i]);
        }

        int i=0,j=0,k=0;
        for(int l=0;l<nums.length;l++){
            if(i<pint.size()){
                nums[k++] = pint.get(i++);
            }
            if(j<nint.size()){
                nums[k++] = nint.get(j++);
            }
        }
        return nums;
    }
}