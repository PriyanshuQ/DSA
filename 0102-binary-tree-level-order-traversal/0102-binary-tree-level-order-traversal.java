class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();

        if(root==null) return list;
        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> li = new ArrayList<>();
            for(int i=q.size();i>0;i--){
                TreeNode a = q.peek();
                if(a.left!=null) q.add(a.left);
                if(a.right!=null) q.add(a.right);
                li.add(a.val);
                q.remove();
            }
            list.add(li);
        }
        return list;
    }
}