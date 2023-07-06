/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int widthOfBinaryTree(TreeNode* root) {
        queue<pair<TreeNode*,int>> q;
        q.push({root,0});
        int ans = 0;
        while(!q.empty()){
            int n = q.size();
            int left,right;
            for(int i=0;i<n;i++){
                TreeNode *tnode = q.front().first;
                long long tidx = q.front().second;
                q.pop();
                if(i == 0){
                    left = tidx;
                }
                if(i == n-1){
                    right = tidx;
                }
                if(tnode->left != NULL){
                    q.push({tnode->left,2ll*tidx+1ll});
                }
                if(tnode->right != NULL){
                    q.push({tnode->right,2ll*tidx+2ll});
                }
            }
            ans = max(ans,right-left+1);
        }
        return ans;
    }
};