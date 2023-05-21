class Solution {

public void reverse(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
  
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }

    public void nextPermutation(int[] nums) {

        
        if(nums.length == 1){
            return;
        }
        int k=nums.length-2;
        while(k>=0 && nums[k]>=nums[k+1])k--;
        if(k < 0){
            reverse(nums, nums.length);
            return;
        }
        // System.out.println(k);
        int idx = 0;
        int diff = Integer.MAX_VALUE;
        for(int i=k+1;i<nums.length;i++){
            // int u = nums[i]-nums[k];
            if(diff>nums[i]-nums[k] && nums[i]-nums[k] > 0){
                diff = nums[i]-nums[k];
                idx = i;
            }
        }
       
        // cout<<nu
        swap(nums, k, idx);
            Arrays.sort(nums, k+1, nums.length);
    }
    private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]=temp;
        }
}