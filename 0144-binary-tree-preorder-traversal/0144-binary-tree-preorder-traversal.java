class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            root=stack.pop();
            list.add(root.val);
            if(root.right!=null) stack.push(root.right);
            if(root.left!=null) stack.push(root.left);
        }
        return list;
    }
}