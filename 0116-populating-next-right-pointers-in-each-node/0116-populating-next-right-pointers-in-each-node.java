class Solution {
    public Node connect(Node root){
        if(root==null || (root.left==null && root.right==null)) return root;
        connectNode(root.left, root.right);
        return root;
    }

    public static void connectNode(Node left, Node right){
        if(left==null || right==null) return;

        left.next=right;
        connectNode(left.left, left.right);
        connectNode(left.right, right.left);
        connectNode(right.left, right.right);
    }
}