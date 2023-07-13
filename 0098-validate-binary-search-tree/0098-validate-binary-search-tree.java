class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean check(TreeNode root, long minvalue, long maxvalue){
        if(root==null) return true;
        if(root.val>=maxvalue || root.val<=minvalue) return false;
        return (check(root.left, minvalue, root.val) && check(root.right, root.val, maxvalue));
    }
}