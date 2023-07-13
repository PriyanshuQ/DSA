class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSame(root.left, root.right);
    }
    public static boolean isSame(TreeNode l , TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r==null) return l==r;
        if(l.val!=r.val) return false;
        return isSame(l.left, r.right) && isSame(l.right, r.left);
    }
}