class Solution{
    public TreeNode sortedArrayToBST(int[] nums){
        return createBST(nums, 0, nums.length-1);
    }
    public TreeNode createBST(int[] nums, int l, int r){
        if(l>r) return null;
        int mid = l+(r-l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums, l, mid-1);
        root.right = createBST(nums, mid+1, r);
        return root;
    }
}